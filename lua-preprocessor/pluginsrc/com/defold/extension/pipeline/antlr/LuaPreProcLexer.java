// Generated from LuaPreProcLexer.g4 by ANTLR 4.9.1
package com.dynamo.bob.pipeline.antlr;
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
		EMPTY_LINE=1, MODE_PP=2, MODE_LINE=3, PP_IFDEF=4, PP_ELSE=5, PP_ENDIF=6, 
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
			"EMPTY_LINE", "MODE_PP", "MODE_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
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
			null, "EMPTY_LINE", "MODE_PP", "MODE_LINE", "PP_IFDEF", "PP_ELSE", "PP_ENDIF", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\177\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2#\n\2\3\2\3"+
		"\2\3\2\3\2\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4\64\n\4\f\4"+
		"\16\4\67\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13b\n\13\r\13\16\13c\3\f\5\f"+
		"g\n\f\3\f\3\f\3\f\3\f\3\r\6\rn\n\r\r\r\16\ro\3\r\3\r\3\16\6\16u\n\16\r"+
		"\16\16\16v\3\17\5\17z\n\17\3\17\3\17\3\17\3\17\2\2\20\5\3\7\4\t\5\13\6"+
		"\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\5\2\3\4\5\4\2\f"+
		"\f\17\17\7\2//\62;C\\aac|\4\2\13\13\"\"\2\u0084\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\3\13\3\2\2\2\3\r\3\2\2\2\3\17\3\2\2\2\3\21\3\2\2\2\3\23"+
		"\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\4\35\3\2"+
		"\2\2\4\37\3\2\2\2\5\"\3\2\2\2\7)\3\2\2\2\t\65\3\2\2\2\13;\3\2\2\2\r>\3"+
		"\2\2\2\17C\3\2\2\2\21I\3\2\2\2\23Q\3\2\2\2\25W\3\2\2\2\27a\3\2\2\2\31"+
		"f\3\2\2\2\33m\3\2\2\2\35t\3\2\2\2\37y\3\2\2\2!#\7\17\2\2\"!\3\2\2\2\""+
		"#\3\2\2\2#$\3\2\2\2$%\7\f\2\2%&\3\2\2\2&\'\b\2\2\2\'\6\3\2\2\2(*\5\33"+
		"\r\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7/\2\2,-\7/\2\2-.\7%\2\2./\3\2\2"+
		"\2/\60\b\3\3\2\60\61\b\3\4\2\61\b\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2"+
		"\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28"+
		"9\b\4\3\29:\b\4\5\2:\n\3\2\2\2;<\7K\2\2<=\7H\2\2=\f\3\2\2\2>?\7G\2\2?"+
		"@\7N\2\2@A\7U\2\2AB\7G\2\2B\16\3\2\2\2CD\7G\2\2DE\7P\2\2EF\7F\2\2FG\7"+
		"K\2\2GH\7H\2\2H\20\3\2\2\2IJ\7T\2\2JK\7G\2\2KL\7N\2\2LM\7G\2\2MN\7C\2"+
		"\2NO\7U\2\2OP\7G\2\2P\22\3\2\2\2QR\7F\2\2RS\7G\2\2ST\7D\2\2TU\7W\2\2U"+
		"V\7I\2\2V\24\3\2\2\2WX\7J\2\2XY\7G\2\2YZ\7C\2\2Z[\7F\2\2[\\\7N\2\2\\]"+
		"\7G\2\2]^\7U\2\2^_\7U\2\2_\26\3\2\2\2`b\t\3\2\2a`\3\2\2\2bc\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2d\30\3\2\2\2eg\7\17\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2"+
		"\2hi\7\f\2\2ij\3\2\2\2jk\b\f\6\2k\32\3\2\2\2ln\t\4\2\2ml\3\2\2\2no\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\r\3\2r\34\3\2\2\2su\n\2\2\2ts\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\36\3\2\2\2xz\7\17\2\2yx\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|}\3\2\2\2}~\b\17\6\2~ \3\2\2\2\r\2\3\4"+
		"\")\65cfovy\7\b\2\2\2\3\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}