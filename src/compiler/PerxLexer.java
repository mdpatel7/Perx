// Generated from /Users/stormcold/Desktop/Perx/Perx.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PerxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Identifier=15, COMMA=16, 
		Number=17, DIV=18, MUL=19, MOD=20, ADD=21, SUB=22, EQUALTO=23, NOTEQUAL=24, 
		GREATEREQUAL=25, LESSEQUAL=26, GREATER=27, LESS=28, ASSIGN=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "Identifier", "COMMA", "Number", 
		"DIV", "MUL", "MOD", "ADD", "SUB", "EQUALTO", "NOTEQUAL", "GREATEREQUAL", 
		"LESSEQUAL", "GREATER", "LESS", "ASSIGN", "WS"
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


	public PerxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Perx.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\6\20v\n\20\r\20\16\20w\3\21\3\21\3\22\6\22}\n\22\r\22"+
		"\16\22~\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\6\37\u009e\n\37\r\37\16\37\u009f\3\37\3\37\2\2 \3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\5"+
		"\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2"+
		"\5A\3\2\2\2\7I\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21"+
		"T\3\2\2\2\23V\3\2\2\2\25X\3\2\2\2\27^\3\2\2\2\31a\3\2\2\2\33g\3\2\2\2"+
		"\35o\3\2\2\2\37u\3\2\2\2!y\3\2\2\2#|\3\2\2\2%\u0080\3\2\2\2\'\u0082\3"+
		"\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2-\u0088\3\2\2\2/\u008a\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u0090\3\2\2\2\65\u0093\3\2\2\2\67\u0096\3\2\2\29\u0098"+
		"\3\2\2\2;\u009a\3\2\2\2=\u009d\3\2\2\2?@\7=\2\2@\4\3\2\2\2AB\7d\2\2BC"+
		"\7q\2\2CD\7q\2\2DE\7n\2\2EF\7g\2\2FG\7c\2\2GH\7p\2\2H\6\3\2\2\2IJ\7k\2"+
		"\2JK\7h\2\2K\b\3\2\2\2LM\7*\2\2M\n\3\2\2\2NO\7+\2\2O\f\3\2\2\2PQ\7}\2"+
		"\2Q\16\3\2\2\2RS\7\177\2\2S\20\3\2\2\2TU\7V\2\2U\22\3\2\2\2VW\7H\2\2W"+
		"\24\3\2\2\2XY\7y\2\2YZ\7j\2\2Z[\7k\2\2[\\\7n\2\2\\]\7g\2\2]\26\3\2\2\2"+
		"^_\7f\2\2_`\7q\2\2`\30\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7"+
		"v\2\2f\32\3\2\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2jk\7g\2\2kl\7i\2\2lm\7g\2"+
		"\2mn\7t\2\2n\34\3\2\2\2op\7g\2\2pq\7n\2\2qr\7u\2\2rs\7g\2\2s\36\3\2\2"+
		"\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x \3\2\2\2yz\7.\2"+
		"\2z\"\3\2\2\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"$\3\2\2\2\u0080\u0081\7\61\2\2\u0081&\3\2\2\2\u0082\u0083\7,\2\2\u0083"+
		"(\3\2\2\2\u0084\u0085\7\'\2\2\u0085*\3\2\2\2\u0086\u0087\7-\2\2\u0087"+
		",\3\2\2\2\u0088\u0089\7/\2\2\u0089.\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c"+
		"\7?\2\2\u008c\60\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092\64\3\2\2\2\u0093"+
		"\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095\66\3\2\2\2\u0096\u0097\7@\2\2\u0097"+
		"8\3\2\2\2\u0098\u0099\7>\2\2\u0099:\3\2\2\2\u009a\u009b\7?\2\2\u009b<"+
		"\3\2\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\37"+
		"\2\2\u00a2>\3\2\2\2\6\2w~\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}