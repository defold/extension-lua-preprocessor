package com.defold.extension.pipeline;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import com.dynamo.bob.Bob;
import com.dynamo.bob.Platform;
import com.dynamo.bob.util.TimeProfiler;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import com.dynamo.bob.pipeline.antlr.LuaPreProcParser;
import com.dynamo.bob.pipeline.antlr.LuaPreProcLexer;
import com.dynamo.bob.pipeline.antlr.LuaPreProcListener;
import com.dynamo.bob.pipeline.antlr.LuaPreProcBaseListener;

public class LuaPreprocessor implements ILuaPreprocessor {
    private static Logger logger = Logger.getLogger(LuaPreprocessor.class.getName());

    private static StringBuffer parsedBuffer = null;
    private static Boolean hasChanges;
    private static String errorMessage;
    private static int currentBuildVariant;

    // replace the token with an empty string
    private static void removeToken(Token token) {
        LuaPreprocessor.hasChanges = true;
        int from = token.getStartIndex();
        logger.fine("removeToken " + token.getText());
        int to = from + token.getText().length() - 1;
        for(int i = from; i <= to; i++) {
            parsedBuffer.replace(i, i + 1, " ");
        }
    }

    private static void setBuildVariant(String variant) {
        switch (variant)
        {
            case Bob.VARIANT_DEBUG:
                currentBuildVariant = LuaPreProcParser.PP_PARAM_DEBUG;
                break;
            case Bob.VARIANT_RELEASE:
                currentBuildVariant = LuaPreProcParser.PP_PARAM_RELEASE;
                break;
            case Bob.VARIANT_HEADLESS:
                currentBuildVariant = LuaPreProcParser.PP_PARAM_HEADLESS;
                break;
            default:
                throw new RuntimeException(String.format("Invalid variant %s", variant));
        }
    }

    @Override
    public String preprocess(String input, String filePath, String buildVariant) throws Exception {
        TimeProfiler.start("LuaPreprocessor");
        setBuildVariant(buildVariant);
        LuaPreprocessor.hasChanges = false;
        LuaPreprocessor.errorMessage = null;
        parsedBuffer = new StringBuffer(input);
        LuaPreProcLexer lexer = new LuaPreProcLexer(CharStreams.fromString(input));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LuaPreProcParser parser = new LuaPreProcParser(tokenStream);
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                    int charPositionInLine, String msg, RecognitionException e) {
                    if (LuaPreprocessor.errorMessage == null) {
                        LuaPreprocessor.errorMessage = String.format("%s:%d %s", filePath, line, msg);
                    }
            }
        });

        ParseTreeWalker walker = new ParseTreeWalker();
        LuaPreprocessor.LuaPreprocessorListener listener = new LuaPreprocessor.LuaPreprocessorListener();
        walker.walk(listener, parser.codefile());

        TimeProfiler.stop();

        if (LuaPreprocessor.errorMessage != null) {
            throw new Exception(LuaPreprocessor.errorMessage);
        }

        if (LuaPreprocessor.hasChanges) {
            logger.fine("LuaPreprocessor: apply " + buildVariant);
            return parsedBuffer.toString();
        }

        return input;
    }

    private class LuaPreprocessorListener extends LuaPreProcBaseListener {

        private boolean isInRemovingMode = false;

        @Override
        public void enterIfdef(LuaPreProcParser.IfdefContext ctx) {
            int currentToken = ctx.param().getStart().getType();
            if (currentToken != currentBuildVariant) {
                isInRemovingMode = true;
            }
        }

        @Override
        public void enterElsedef(LuaPreProcParser.ElsedefContext ctx) {
            isInRemovingMode = !isInRemovingMode;
        }

        @Override
        public void enterEndif(LuaPreProcParser.EndifContext ctx) {
            isInRemovingMode = false;
        }

        @Override
        public void enterLine(LuaPreProcParser.LineContext ctx) {
            if (isInRemovingMode) {
                LuaPreprocessor.removeToken(ctx.TEXT().getSymbol());
            }
        }

    }
}
