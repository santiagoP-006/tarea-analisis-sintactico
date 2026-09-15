// Generated from Ambigua.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AmbiguaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUM=3, WS=4;
	public static final int
		RULE_prog = 0, RULE_e = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "e"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUM", "WS"
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
	public String getGrammarFileName() { return "Ambigua.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmbiguaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AmbiguaParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			e(0);
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumAmbiguaContext extends EContext {
		public TerminalNode NUM() { return getToken(AmbiguaParser.NUM, 0); }
		public NumAmbiguaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).enterNumAmbigua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).exitNumAmbigua(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaAmbiguaContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public SumaAmbiguaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).enterSumaAmbigua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).exitSumaAmbigua(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultAmbiguaContext extends EContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public MultAmbiguaContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).enterMultAmbigua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmbiguaListener ) ((AmbiguaListener)listener).exitMultAmbigua(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_e, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NumAmbiguaContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(8);
			match(NUM);
			}
			_ctx.stop = _input.LT(-1);
			setState(18);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(16);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new SumaAmbiguaContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(10);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(11);
						match(T__0);
						setState(12);
						e(4);
						}
						break;
					case 2:
						{
						_localctx = new MultAmbiguaContext(new EContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_e);
						setState(13);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(14);
						match(T__1);
						setState(15);
						e(3);
						}
						break;
					}
					} 
				}
				setState(20);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return e_sempred((EContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u0016\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0011\b\u0001\n\u0001\f\u0001\u0014\t\u0001\u0001\u0001\u0000"+
		"\u0001\u0002\u0002\u0000\u0002\u0000\u0000\u0015\u0000\u0004\u0001\u0000"+
		"\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002"+
		"\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000"+
		"\u0000\u0000\u0007\b\u0006\u0001\uffff\uffff\u0000\b\t\u0005\u0003\u0000"+
		"\u0000\t\u0012\u0001\u0000\u0000\u0000\n\u000b\n\u0003\u0000\u0000\u000b"+
		"\f\u0005\u0001\u0000\u0000\f\u0011\u0003\u0002\u0001\u0004\r\u000e\n\u0002"+
		"\u0000\u0000\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0011\u0003\u0002"+
		"\u0001\u0003\u0010\n\u0001\u0000\u0000\u0000\u0010\r\u0001\u0000\u0000"+
		"\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0003\u0001\u0000\u0000"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0002\u0010\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}