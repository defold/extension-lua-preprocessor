package com.dynamo.bob.pipeline.antlr;
// Generated from LuaPreProcLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaPreProcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODE_PP=1, MODE_LINE=2, EMPTY_LINE=3, PP_IFDEF=4, PP_ELSE=5, PP_ENDIF=6, 
		PP_PARAM_RELEASE=7, PP_PARAM_DEBUG=8, PP_PARAM_HEADLESS=9, PP_TEXT=10, 
		PP_EOL=11, PP_WS=12, TEXT=13, EOL=14;
	public static final int
		PreProc=1, LineMode=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "PreProc", "LineMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MODE_PP", "MODE_LINE", "EMPTY_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
			"PP_PARAM_RELEASE", "PP_PARAM_DEBUG", "PP_PARAM_HEADLESS", "PP_TEXT", 
			"PP_EOL", "PP_WS", "TEXT", "EOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'IF'", "'ELSE'", "'ENDIF'", "'RELEASE'", "'DEBUG'", 
			"'HEADLESS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MODE_PP", "MODE_LINE", "EMPTY_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
			"PP_PARAM_RELEASE", "PP_PARAM_DEBUG", "PP_PARAM_HEADLESS", "PP_TEXT", 
			"PP_EOL", "PP_WS", "TEXT", "EOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LuaPreProcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LuaPreProcLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20{\b\1\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2#\n\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\5\4\62\n\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\6\13^\n\13\r\13\16\13_\3\f\5\fc\n\f\3\f\3\f\3\f\3\f\3\r"+
		"\6\rj\n\r\r\r\16\rk\3\r\3\r\3\16\6\16q\n\16\r\16\16\16r\3\17\5\17v\n\17"+
		"\3\17\3\17\3\17\3\17\2\2\20\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13"+
		"\27\f\31\r\33\16\35\17\37\20\5\2\3\4\5\7\2//\62;C\\aac|\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2\177\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2"+
		"\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27"+
		"\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\4\35\3\2\2\2\4\37\3\2\2\2\5\"\3\2\2"+
		"\2\7+\3\2\2\2\t\61\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17?\3\2\2\2\21E\3"+
		"\2\2\2\23M\3\2\2\2\25S\3\2\2\2\27]\3\2\2\2\31b\3\2\2\2\33i\3\2\2\2\35"+
		"p\3\2\2\2\37u\3\2\2\2!#\5\33\r\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7/"+
		"\2\2%&\7/\2\2&\'\7%\2\2\'(\3\2\2\2()\b\2\2\2)*\b\2\3\2*\6\3\2\2\2+,\13"+
		"\2\2\2,-\3\2\2\2-.\b\3\2\2./\b\3\4\2/\b\3\2\2\2\60\62\7\17\2\2\61\60\3"+
		"\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\f\2\2\64\65\3\2\2\2\65\66\b"+
		"\4\5\2\66\n\3\2\2\2\678\7K\2\289\7H\2\29\f\3\2\2\2:;\7G\2\2;<\7N\2\2<"+
		"=\7U\2\2=>\7G\2\2>\16\3\2\2\2?@\7G\2\2@A\7P\2\2AB\7F\2\2BC\7K\2\2CD\7"+
		"H\2\2D\20\3\2\2\2EF\7T\2\2FG\7G\2\2GH\7N\2\2HI\7G\2\2IJ\7C\2\2JK\7U\2"+
		"\2KL\7G\2\2L\22\3\2\2\2MN\7F\2\2NO\7G\2\2OP\7D\2\2PQ\7W\2\2QR\7I\2\2R"+
		"\24\3\2\2\2ST\7J\2\2TU\7G\2\2UV\7C\2\2VW\7F\2\2WX\7N\2\2XY\7G\2\2YZ\7"+
		"U\2\2Z[\7U\2\2[\26\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_"+
		"`\3\2\2\2`\30\3\2\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2"+
		"\2ef\3\2\2\2fg\b\f\6\2g\32\3\2\2\2hj\t\3\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2lm\3\2\2\2mn\b\r\2\2n\34\3\2\2\2oq\n\4\2\2po\3\2\2\2qr\3"+
		"\2\2\2rp\3\2\2\2rs\3\2\2\2s\36\3\2\2\2tv\7\17\2\2ut\3\2\2\2uv\3\2\2\2"+
		"vw\3\2\2\2wx\7\f\2\2xy\3\2\2\2yz\b\17\6\2z \3\2\2\2\f\2\3\4\"\61_bkru"+
		"\7\2\3\2\7\3\2\7\4\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}