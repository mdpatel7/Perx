// Generated from /Users/stormcold/Desktop/Perx/Perx.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PerxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Identifier=15, COMMA=16, 
		Number=17, DIV=18, MUL=19, MOD=20, ADD=21, SUB=22, EQUALTO=23, NOTEQUAL=24, 
		GREATEREQUAL=25, LESSEQUAL=26, GREATER=27, LESS=28, ASSIGN=29, WS=30;
	public static final int
		RULE_program = 0, RULE_stmt_block = 1, RULE_stmt = 2, RULE_decl_stmt = 3, 
		RULE_bool = 4, RULE_assign_stmt = 5, RULE_ifelse_stmt = 6, RULE_boolean_expression = 7, 
		RULE_boolean_value = 8, RULE_whileloop_stmt = 9, RULE_print_stmt = 10, 
		RULE_expression = 11, RULE_integer = 12, RULE_elsea = 13;
	public static final String[] ruleNames = {
		"program", "stmt_block", "stmt", "decl_stmt", "bool", "assign_stmt", "ifelse_stmt", 
		"boolean_expression", "boolean_value", "whileloop_stmt", "print_stmt", 
		"expression", "integer", "elsea"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'boolean'", "'if'", "'('", "')'", "'{'", "'}'", "'T'", "'F'", 
		"'while'", "'do'", "'print'", "'integer'", "'else'", null, "','", null, 
		"'/'", "'*'", "'%'", "'+'", "'-'", "'=='", "'!='", "'>='", "'<='", "'>'", 
		"'<'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Identifier", "COMMA", "Number", "DIV", "MUL", "MOD", 
		"ADD", "SUB", "EQUALTO", "NOTEQUAL", "GREATEREQUAL", "LESSEQUAL", "GREATER", 
		"LESS", "ASSIGN", "WS"
	};
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
	public String getGrammarFileName() { return "Perx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PerxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			stmt_block();
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

	public static class Stmt_blockContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_block);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				stmt();
				setState(31);
				match(T__0);
				setState(32);
				stmt_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				stmt();
				setState(35);
				match(T__0);
				}
				break;
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

	public static class StmtContext extends ParserRuleContext {
		public Decl_stmtContext decl_stmt() {
			return getRuleContext(Decl_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Ifelse_stmtContext ifelse_stmt() {
			return getRuleContext(Ifelse_stmtContext.class,0);
		}
		public Whileloop_stmtContext whileloop_stmt() {
			return getRuleContext(Whileloop_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				decl_stmt();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				assign_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				ifelse_stmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				whileloop_stmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				print_stmt();
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

	public static class Decl_stmtContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PerxParser.Identifier, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Decl_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterDecl_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitDecl_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitDecl_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_stmtContext decl_stmt() throws RecognitionException {
		Decl_stmtContext _localctx = new Decl_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_stmt);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				integer();
				setState(47);
				match(Identifier);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				bool();
				setState(50);
				match(Identifier);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PerxParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(PerxParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(Identifier);
			setState(57);
			match(ASSIGN);
			setState(58);
			expression(0);
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

	public static class Ifelse_stmtContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public ElseaContext elsea() {
			return getRuleContext(ElseaContext.class,0);
		}
		public Ifelse_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterIfelse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitIfelse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitIfelse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifelse_stmtContext ifelse_stmt() throws RecognitionException {
		Ifelse_stmtContext _localctx = new Ifelse_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifelse_stmt);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__2);
				setState(61);
				match(T__3);
				setState(62);
				boolean_expression();
				setState(63);
				match(T__4);
				setState(64);
				match(T__5);
				setState(65);
				stmt_block();
				setState(66);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__2);
				setState(69);
				match(T__3);
				setState(70);
				boolean_expression();
				setState(71);
				match(T__4);
				setState(72);
				match(T__5);
				setState(73);
				stmt_block();
				setState(74);
				match(T__6);
				setState(75);
				elsea();
				setState(76);
				match(T__5);
				setState(77);
				stmt_block();
				setState(78);
				match(T__6);
				}
				break;
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALTO() { return getToken(PerxParser.EQUALTO, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PerxParser.NOTEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(PerxParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(PerxParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(PerxParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(PerxParser.LESS, 0); }
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_expression);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				expression(0);
				setState(83);
				match(EQUALTO);
				setState(84);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				expression(0);
				setState(87);
				match(NOTEQUAL);
				setState(88);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				expression(0);
				setState(91);
				match(GREATEREQUAL);
				setState(92);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				expression(0);
				setState(95);
				match(LESSEQUAL);
				setState(96);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				expression(0);
				setState(99);
				match(GREATER);
				setState(100);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				expression(0);
				setState(103);
				match(LESS);
				setState(104);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				boolean_value();
				}
				break;
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

	public static class Boolean_valueContext extends ParserRuleContext {
		public Boolean_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterBoolean_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitBoolean_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitBoolean_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valueContext boolean_value() throws RecognitionException {
		Boolean_valueContext _localctx = new Boolean_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolean_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class Whileloop_stmtContext extends ParserRuleContext {
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public Whileloop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterWhileloop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitWhileloop_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitWhileloop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Whileloop_stmtContext whileloop_stmt() throws RecognitionException {
		Whileloop_stmtContext _localctx = new Whileloop_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileloop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__9);
			setState(112);
			match(T__3);
			setState(113);
			boolean_expression();
			setState(114);
			match(T__4);
			setState(115);
			match(T__10);
			setState(116);
			match(T__5);
			setState(117);
			stmt_block();
			setState(118);
			match(T__6);
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

	public static class Print_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(PerxParser.Identifier, 0); }
		public TerminalNode Number() { return getToken(PerxParser.Number, 0); }
		public TerminalNode DIV() { return getToken(PerxParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(PerxParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(PerxParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(PerxParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PerxParser.SUB, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(124);
				match(T__3);
				setState(125);
				expression(0);
				setState(126);
				match(T__4);
				}
				break;
			case Identifier:
				{
				setState(128);
				match(Identifier);
				}
				break;
			case Number:
				{
				setState(129);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133);
						match(DIV);
						setState(134);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(136);
						match(MUL);
						setState(137);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(139);
						match(MOD);
						setState(140);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(142);
						match(ADD);
						setState(143);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
						match(SUB);
						setState(146);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__12);
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

	public static class ElseaContext extends ParserRuleContext {
		public ElseaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).enterElsea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PerxListener ) ((PerxListener)listener).exitElsea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PerxVisitor ) return ((PerxVisitor<? extends T>)visitor).visitElsea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseaContext elsea() throws RecognitionException {
		ElseaContext _localctx = new ElseaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elsea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__13);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u009f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0085\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16"+
		"\r\u0099\13\r\3\16\3\16\3\17\3\17\3\17\2\3\30\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\3\3\2\n\13\2\u00a4\2\36\3\2\2\2\4\'\3\2\2\2\6.\3\2\2"+
		"\2\b\66\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16R\3\2\2\2\20m\3\2\2\2\22o\3\2"+
		"\2\2\24q\3\2\2\2\26z\3\2\2\2\30\u0084\3\2\2\2\32\u009a\3\2\2\2\34\u009c"+
		"\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 !\5\6\4\2!\"\7\3\2\2\"#\5\4\3\2#("+
		"\3\2\2\2$%\5\6\4\2%&\7\3\2\2&(\3\2\2\2\' \3\2\2\2\'$\3\2\2\2(\5\3\2\2"+
		"\2)/\5\b\5\2*/\5\f\7\2+/\5\16\b\2,/\5\24\13\2-/\5\26\f\2.)\3\2\2\2.*\3"+
		"\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61\5\32\16\2\61\62"+
		"\7\21\2\2\62\67\3\2\2\2\63\64\5\n\6\2\64\65\7\21\2\2\65\67\3\2\2\2\66"+
		"\60\3\2\2\2\66\63\3\2\2\2\67\t\3\2\2\289\7\4\2\29\13\3\2\2\2:;\7\21\2"+
		"\2;<\7\37\2\2<=\5\30\r\2=\r\3\2\2\2>?\7\5\2\2?@\7\6\2\2@A\5\20\t\2AB\7"+
		"\7\2\2BC\7\b\2\2CD\5\4\3\2DE\7\t\2\2ES\3\2\2\2FG\7\5\2\2GH\7\6\2\2HI\5"+
		"\20\t\2IJ\7\7\2\2JK\7\b\2\2KL\5\4\3\2LM\7\t\2\2MN\5\34\17\2NO\7\b\2\2"+
		"OP\5\4\3\2PQ\7\t\2\2QS\3\2\2\2R>\3\2\2\2RF\3\2\2\2S\17\3\2\2\2TU\5\30"+
		"\r\2UV\7\31\2\2VW\5\30\r\2Wn\3\2\2\2XY\5\30\r\2YZ\7\32\2\2Z[\5\30\r\2"+
		"[n\3\2\2\2\\]\5\30\r\2]^\7\33\2\2^_\5\30\r\2_n\3\2\2\2`a\5\30\r\2ab\7"+
		"\34\2\2bc\5\30\r\2cn\3\2\2\2de\5\30\r\2ef\7\35\2\2fg\5\30\r\2gn\3\2\2"+
		"\2hi\5\30\r\2ij\7\36\2\2jk\5\30\r\2kn\3\2\2\2ln\5\22\n\2mT\3\2\2\2mX\3"+
		"\2\2\2m\\\3\2\2\2m`\3\2\2\2md\3\2\2\2mh\3\2\2\2ml\3\2\2\2n\21\3\2\2\2"+
		"op\t\2\2\2p\23\3\2\2\2qr\7\f\2\2rs\7\6\2\2st\5\20\t\2tu\7\7\2\2uv\7\r"+
		"\2\2vw\7\b\2\2wx\5\4\3\2xy\7\t\2\2y\25\3\2\2\2z{\7\16\2\2{|\5\30\r\2|"+
		"\27\3\2\2\2}~\b\r\1\2~\177\7\6\2\2\177\u0080\5\30\r\2\u0080\u0081\7\7"+
		"\2\2\u0081\u0085\3\2\2\2\u0082\u0085\7\21\2\2\u0083\u0085\7\23\2\2\u0084"+
		"}\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0097\3\2\2\2"+
		"\u0086\u0087\f\n\2\2\u0087\u0088\7\24\2\2\u0088\u0096\5\30\r\13\u0089"+
		"\u008a\f\t\2\2\u008a\u008b\7\25\2\2\u008b\u0096\5\30\r\n\u008c\u008d\f"+
		"\b\2\2\u008d\u008e\7\26\2\2\u008e\u0096\5\30\r\t\u008f\u0090\f\7\2\2\u0090"+
		"\u0091\7\27\2\2\u0091\u0096\5\30\r\b\u0092\u0093\f\6\2\2\u0093\u0094\7"+
		"\30\2\2\u0094\u0096\5\30\r\7\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095"+
		"\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\31\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\7\17\2\2\u009b\33\3\2\2\2\u009c\u009d\7\20\2\2\u009d"+
		"\35\3\2\2\2\n\'.\66Rm\u0084\u0095\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}