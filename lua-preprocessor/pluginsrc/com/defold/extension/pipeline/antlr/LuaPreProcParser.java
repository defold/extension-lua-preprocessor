// Generated from LuaPreProc.g4 by ANTLR 4.9.1
package com.dynamo.bob.pipeline.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuaPreProcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EMPTY_LINE=1, MODE_PP=2, MODE_LINE=3, PP_IFDEF=4, PP_ELSE=5, PP_ENDIF=6, 
		PP_PARAM_RELEASE=7, PP_PARAM_DEBUG=8, PP_PARAM_HEADLESS=9, PP_TEXT=10, 
		PP_EOL=11, PP_WS=12, TEXT=13, EOL=14;
	public static final int
		RULE_codefile = 0, RULE_preproc = 1, RULE_param = 2, RULE_ifdef = 3, RULE_elsedef = 4, 
		RULE_endif = 5, RULE_line = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"codefile", "preproc", "param", "ifdef", "elsedef", "endif", "line"
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

	@Override
	public String getGrammarFileName() { return "LuaPreProc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LuaPreProcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodefileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LuaPreProcParser.EOF, 0); }
		public List<PreprocContext> preproc() {
			return getRuleContexts(PreprocContext.class);
		}
		public PreprocContext preproc(int i) {
			return getRuleContext(PreprocContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public CodefileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codefile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterCodefile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitCodefile(this);
		}
	}

	public final CodefileContext codefile() throws RecognitionException {
		CodefileContext _localctx = new CodefileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codefile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PP_IFDEF) | (1L << PP_ELSE) | (1L << PP_ENDIF) | (1L << TEXT))) != 0)) {
				{
				setState(16);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PP_IFDEF:
				case PP_ELSE:
				case PP_ENDIF:
					{
					setState(14);
					preproc();
					}
					break;
				case TEXT:
					{
					setState(15);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocContext extends ParserRuleContext {
		public IfdefContext ifdef() {
			return getRuleContext(IfdefContext.class,0);
		}
		public ElsedefContext elsedef() {
			return getRuleContext(ElsedefContext.class,0);
		}
		public EndifContext endif() {
			return getRuleContext(EndifContext.class,0);
		}
		public PreprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterPreproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitPreproc(this);
		}
	}

	public final PreprocContext preproc() throws RecognitionException {
		PreprocContext _localctx = new PreprocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_preproc);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PP_IFDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				ifdef();
				}
				break;
			case PP_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				elsedef();
				}
				break;
			case PP_ENDIF:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				endif();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode PP_PARAM_RELEASE() { return getToken(LuaPreProcParser.PP_PARAM_RELEASE, 0); }
		public TerminalNode PP_PARAM_DEBUG() { return getToken(LuaPreProcParser.PP_PARAM_DEBUG, 0); }
		public TerminalNode PP_PARAM_HEADLESS() { return getToken(LuaPreProcParser.PP_PARAM_HEADLESS, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PP_PARAM_RELEASE) | (1L << PP_PARAM_DEBUG) | (1L << PP_PARAM_HEADLESS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfdefContext extends ParserRuleContext {
		public TerminalNode PP_IFDEF() { return getToken(LuaPreProcParser.PP_IFDEF, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode PP_EOL() { return getToken(LuaPreProcParser.PP_EOL, 0); }
		public IfdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterIfdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitIfdef(this);
		}
	}

	public final IfdefContext ifdef() throws RecognitionException {
		IfdefContext _localctx = new IfdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PP_IFDEF);
			setState(31);
			param();
			setState(32);
			match(PP_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsedefContext extends ParserRuleContext {
		public TerminalNode PP_ELSE() { return getToken(LuaPreProcParser.PP_ELSE, 0); }
		public TerminalNode PP_EOL() { return getToken(LuaPreProcParser.PP_EOL, 0); }
		public ElsedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterElsedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitElsedef(this);
		}
	}

	public final ElsedefContext elsedef() throws RecognitionException {
		ElsedefContext _localctx = new ElsedefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elsedef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(PP_ELSE);
			setState(35);
			match(PP_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndifContext extends ParserRuleContext {
		public TerminalNode PP_ENDIF() { return getToken(LuaPreProcParser.PP_ENDIF, 0); }
		public TerminalNode PP_EOL() { return getToken(LuaPreProcParser.PP_EOL, 0); }
		public EndifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterEndif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitEndif(this);
		}
	}

	public final EndifContext endif() throws RecognitionException {
		EndifContext _localctx = new EndifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_endif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PP_ENDIF);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PP_EOL) {
				{
				setState(38);
				match(PP_EOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LuaPreProcParser.TEXT, 0); }
		public TerminalNode PP_EOL() { return getToken(LuaPreProcParser.PP_EOL, 0); }
		public TerminalNode EOL() { return getToken(LuaPreProcParser.EOL, 0); }
		public TerminalNode EOF() { return getToken(LuaPreProcParser.EOF, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LuaPreProcListener ) ((LuaPreProcListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(TEXT);
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PP_EOL:
				{
				setState(42);
				match(PP_EOL);
				}
				break;
			case EOL:
				{
				setState(43);
				match(EOL);
				}
				break;
			case EOF:
			case PP_IFDEF:
			case PP_ELSE:
			case PP_ENDIF:
			case TEXT:
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(44);
					match(EOF);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16"+
		"\2\26\13\2\3\2\3\2\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\5\7*\n\7\3\b\3\b\3\b\3\b\5\b\60\n\b\5\b\62\n\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\3\3\2\t\13\2\64\2\24\3\2\2\2\4\34\3\2\2\2\6\36\3"+
		"\2\2\2\b \3\2\2\2\n$\3\2\2\2\f\'\3\2\2\2\16+\3\2\2\2\20\23\5\4\3\2\21"+
		"\23\5\16\b\2\22\20\3\2\2\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24"+
		"\25\3\2\2\2\25\27\3\2\2\2\26\24\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31"+
		"\35\5\b\5\2\32\35\5\n\6\2\33\35\5\f\7\2\34\31\3\2\2\2\34\32\3\2\2\2\34"+
		"\33\3\2\2\2\35\5\3\2\2\2\36\37\t\2\2\2\37\7\3\2\2\2 !\7\6\2\2!\"\5\6\4"+
		"\2\"#\7\r\2\2#\t\3\2\2\2$%\7\7\2\2%&\7\r\2\2&\13\3\2\2\2\')\7\b\2\2(*"+
		"\7\r\2\2)(\3\2\2\2)*\3\2\2\2*\r\3\2\2\2+\61\7\17\2\2,\62\7\r\2\2-\62\7"+
		"\20\2\2.\60\7\2\2\3/.\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61,\3\2\2\2\61"+
		"-\3\2\2\2\61/\3\2\2\2\62\17\3\2\2\2\b\22\24\34)/\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}