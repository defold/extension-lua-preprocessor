package com.dynamo.bob.pipeline;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import com.dynamo.bob.Bob;
import com.dynamo.bob.Platform;
import com.dynamo.bob.pipeline.LuaBuilderPlugin;
import com.dynamo.bob.util.TimeProfiler;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import com.dynamo.bob.pipeline.antlr.LuaPreProcParser;
import com.dynamo.bob.pipeline.antlr.LuaPreProcLexer;
import com.dynamo.bob.pipeline.antlr.LuaPreProcListener;
import com.dynamo.bob.pipeline.antlr.LuaPreProcBaseListener;

public class LuaPreprocessor extends LuaBuilderPlugin {

private static StringBuffer parsedBuffer = null;
private static Boolean hasChanges;
private static int buildVariant;

private CommonTokenStream tokenStream = null;

    // replace the token with an empty string
    private static void removeToken(Token token) {
        LuaPreprocessor.hasChanges = true;
        int from = token.getStartIndex();
        int to = from + token.getText().length() - 1;
        for(int i = from; i <= to; i++) {
            parsedBuffer.replace(i, i + 1, " ");
        }
    }

    private static void setBuildVariant(String variant) {
        switch (variant)
        {
            case Bob.VARIANT_DEBUG:
                buildVariant = LuaPreProcParser.PP_PARAM_DEBUG;
                break;
            case Bob.VARIANT_RELEASE:
                buildVariant = LuaPreProcParser.PP_PARAM_RELEASE;
                break;
            case Bob.VARIANT_HEADLESS:
                buildVariant = LuaPreProcParser.PP_PARAM_HEADLESS;
                break;
            default:
                throw new RuntimeException(String.format("Invalid variant %s", variant));
        }
    }

    @Override
    public String create(String input) throws Exception {
        TimeProfiler.start("LuaPreprocessor");
        setBuildVariant(Bob.VARIANT_RELEASE);
        LuaPreprocessor.hasChanges = false;
        parsedBuffer = new StringBuffer(input);
        LuaPreProcLexer lexer = new LuaPreProcLexer(CharStreams.fromString(input));
        tokenStream = new CommonTokenStream(lexer);
        LuaPreProcParser parser = new LuaPreProcParser(tokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        LuaPreprocessor.LuaPreprocessorListener listener = new LuaPreprocessor.LuaPreprocessorListener();
        walker.walk(listener, parser.codefile());

        TimeProfiler.stop();

        if (LuaPreprocessor.hasChanges) {
            return parsedBuffer.toString();
        }
        return input;
    }

    @Override
    public String build(String input) throws Exception {
        return input;
    }

    private class LuaPreprocessorListener extends LuaPreProcBaseListener {

        private boolean isInRemovingMode = false;

        @Override
        public void enterIfdef(LuaPreProcParser.IfdefContext ctx) {
            int currentToken = ctx.param().getStart().getType();
            if (currentToken != buildVariant) {
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
