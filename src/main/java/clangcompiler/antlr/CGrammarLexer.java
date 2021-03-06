// $ANTLR 3.5.2 D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g 2016-01-09 13:20:03
package clangcompiler.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int ADD=4;
	public static final int ADD_ASSIGN=5;
	public static final int AND=6;
	public static final int ARRAY=7;
	public static final int ARRAYCALL=8;
	public static final int ARRAYINIT=9;
	public static final int ARRAYSET=10;
	public static final int ASSIGN=11;
	public static final int BEGIN=12;
	public static final int BLOCK=13;
	public static final int BREAK=14;
	public static final int CHAR=15;
	public static final int CHR=16;
	public static final int CONTINUE=17;
	public static final int CONVERT=18;
	public static final int DECLARE=19;
	public static final int DIV=20;
	public static final int DIV_ASSIGN=21;
	public static final int DO=22;
	public static final int DOUBLE=23;
	public static final int DOWHILE=24;
	public static final int ELSE=25;
	public static final int END=26;
	public static final int EQ=27;
	public static final int FOR=28;
	public static final int FUNC=29;
	public static final int FUNCCALL=30;
	public static final int IDENT=31;
	public static final int IF=32;
	public static final int INT=33;
	public static final int LE=34;
	public static final int LT=35;
	public static final int ME=36;
	public static final int ML_COMMENT=37;
	public static final int MOD=38;
	public static final int MOD_ASSIGN=39;
	public static final int MT=40;
	public static final int MUL=41;
	public static final int MUL_ASSIGN=42;
	public static final int NE=43;
	public static final int NOT=44;
	public static final int NUMBER=45;
	public static final int OR=46;
	public static final int PARAMS=47;
	public static final int PROGRAM=48;
	public static final int RETURN=49;
	public static final int SL_COMMENT=50;
	public static final int STR=51;
	public static final int STRING=52;
	public static final int SUB=53;
	public static final int SUB_ASSIGN=54;
	public static final int UNKNOWN=55;
	public static final int VARDECL=56;
	public static final int VOID=57;
	public static final int WHILE=58;
	public static final int WS=59;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CGrammarLexer() {} 
	public CGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g"; }

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:9:7: ( '{' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:9:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BEGIN"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:10:7: ( 'break' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:10:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:11:6: ( 'char' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:11:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:12:10: ( 'continue' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:12:12: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:13:4: ( 'do' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:13:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:14:8: ( 'double' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:14:10: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:15:6: ( 'else' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:15:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:16:5: ( '}' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:16:7: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:17:5: ( 'for' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:17:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:18:4: ( 'if' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:18:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:19:5: ( 'int' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:19:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:20:8: ( 'return' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:20:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:21:8: ( 'string' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:21:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:22:6: ( 'void' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:22:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:23:7: ( 'while' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:23:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:24:7: ( '(' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:24:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:25:7: ( ')' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:25:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:26:7: ( ',' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:26:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:27:7: ( ';' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:27:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:28:7: ( '[' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:28:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:29:7: ( ']' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:29:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:57:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:58:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:58:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||(LA1_0 >= '\f' && LA1_0 <= '\r')||LA1_0==' ') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}


			    _channel=HIDDEN;
			  
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:63:11: ( '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:3: '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:8: ( options {greedy=false; } : . )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\r') ) {
					alt2=2;
				}
				else if ( (LA2_0=='\n') ) {
					alt2=2;
				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:36: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:40: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:40: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 

			    _channel=HIDDEN;
			  
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	// $ANTLR start "ML_COMMENT"
	public final void mML_COMMENT() throws RecognitionException {
		try {
			int _type = ML_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:68:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:69:3: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:69:8: ( options {greedy=false; } : . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='*') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='/') ) {
						alt4=2;
					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:69:36: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop4;
				}
			}

			match("*/"); 


			    _channel=HIDDEN;
			  
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ML_COMMENT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:8: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:11: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:11: ( '-' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='-') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:12: '-'
					{
					match('-'); 
					}
					break;

			}

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:18: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:30: ( '.' ( '0' .. '9' )+ )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='.') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:31: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:35: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "STR"
	public final void mSTR() throws RecognitionException {
		try {
			int _type = STR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:77:5: ( '\"' ( . )* '\"' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:77:7: '\"' ( . )* '\"'
			{
			match('\"'); 
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:77:11: ( . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\"') ) {
					alt9=2;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:77:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STR"

	// $ANTLR start "CHR"
	public final void mCHR() throws RecognitionException {
		try {
			int _type = CHR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:5: ( '\\'' ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' ) '\\'' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:7: '\\'' ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' ) '\\''
			{
			match('\''); 
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:12: ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' )
			int alt10=12;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'n':
					{
					alt10=2;
					}
					break;
				case '0':
					{
					alt10=3;
					}
					break;
				case 't':
					{
					alt10=4;
					}
					break;
				case 'f':
					{
					alt10=5;
					}
					break;
				case 'a':
					{
					alt10=6;
					}
					break;
				case 'v':
					{
					alt10=7;
					}
					break;
				case 'b':
					{
					alt10=8;
					}
					break;
				case 'r':
					{
					alt10=9;
					}
					break;
				case '\\':
					{
					alt10=10;
					}
					break;
				case '\'':
					{
					int LA10_12 = input.LA(3);
					if ( (LA10_12=='\'') ) {
						alt10=11;
					}

					else {
						alt10=1;
					}

					}
					break;
				case '\"':
					{
					alt10=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
				alt10=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:13: .
					{
					matchAny(); 
					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:17: '\\\\n'
					{
					match("\\n"); 

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:25: '\\\\0'
					{
					match("\\0"); 

					}
					break;
				case 4 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:33: '\\\\t'
					{
					match("\\t"); 

					}
					break;
				case 5 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:41: '\\\\f'
					{
					match("\\f"); 

					}
					break;
				case 6 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:49: '\\\\a'
					{
					match("\\a"); 

					}
					break;
				case 7 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:57: '\\\\v'
					{
					match("\\v"); 

					}
					break;
				case 8 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:65: '\\\\b'
					{
					match("\\b"); 

					}
					break;
				case 9 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:73: '\\\\r'
					{
					match("\\r"); 

					}
					break;
				case 10 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:81: '\\\\\\\\'
					{
					match("\\\\"); 

					}
					break;
				case 11 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:90: '\\\\\\''
					{
					match("\\'"); 

					}
					break;
				case 12 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:79:99: '\\\\\\\"'
					{
					match("\\\""); 

					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHR"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:81:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:81:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:82:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||LA11_0=='_'||(LA11_0 >= 'a' && LA11_0 <= 'z')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:5: ( '+' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:86:5: ( '-' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:86:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:87:5: ( '*' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:87:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:88:5: ( '/' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:88:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:89:5: ( '%' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:89:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:91:8: ( '=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:91:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:93:4: ( '==' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:93:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:94:4: ( '!=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:94:6: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "ME"
	public final void mME() throws RecognitionException {
		try {
			int _type = ME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:95:4: ( '>=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:95:6: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ME"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:96:4: ( '<=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:96:6: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "MT"
	public final void mMT() throws RecognitionException {
		try {
			int _type = MT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:97:4: ( '>' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:97:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:98:4: ( '<' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:98:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:100:5: ( '!' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:100:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:101:5: ( '&&' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:101:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:102:4: ( '||' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:102:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "ADD_ASSIGN"
	public final void mADD_ASSIGN() throws RecognitionException {
		try {
			int _type = ADD_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:105:2: ( '+=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:105:4: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_ASSIGN"

	// $ANTLR start "SUB_ASSIGN"
	public final void mSUB_ASSIGN() throws RecognitionException {
		try {
			int _type = SUB_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:107:2: ( '-=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:107:4: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_ASSIGN"

	// $ANTLR start "MUL_ASSIGN"
	public final void mMUL_ASSIGN() throws RecognitionException {
		try {
			int _type = MUL_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:109:2: ( '*=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:109:4: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_ASSIGN"

	// $ANTLR start "DIV_ASSIGN"
	public final void mDIV_ASSIGN() throws RecognitionException {
		try {
			int _type = DIV_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:111:2: ( '/=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:111:4: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_ASSIGN"

	// $ANTLR start "MOD_ASSIGN"
	public final void mMOD_ASSIGN() throws RecognitionException {
		try {
			int _type = MOD_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:113:2: ( '%=' )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:113:4: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_ASSIGN"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:8: ( BEGIN | BREAK | CHAR | CONTINUE | DO | DOUBLE | ELSE | END | FOR | IF | INT | RETURN | STRING | VOID | WHILE | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | WS | SL_COMMENT | ML_COMMENT | NUMBER | STR | CHR | IDENT | ADD | SUB | MUL | DIV | MOD | ASSIGN | EQ | NE | ME | LE | MT | LT | NOT | AND | OR | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
		int alt12=48;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:10: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 2 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:16: BREAK
				{
				mBREAK(); 

				}
				break;
			case 3 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:22: CHAR
				{
				mCHAR(); 

				}
				break;
			case 4 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:27: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 5 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:36: DO
				{
				mDO(); 

				}
				break;
			case 6 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:39: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 7 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:46: ELSE
				{
				mELSE(); 

				}
				break;
			case 8 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:51: END
				{
				mEND(); 

				}
				break;
			case 9 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:55: FOR
				{
				mFOR(); 

				}
				break;
			case 10 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:59: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:62: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:66: RETURN
				{
				mRETURN(); 

				}
				break;
			case 13 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:73: STRING
				{
				mSTRING(); 

				}
				break;
			case 14 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:80: VOID
				{
				mVOID(); 

				}
				break;
			case 15 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:85: WHILE
				{
				mWHILE(); 

				}
				break;
			case 16 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:91: T__60
				{
				mT__60(); 

				}
				break;
			case 17 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:97: T__61
				{
				mT__61(); 

				}
				break;
			case 18 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:103: T__62
				{
				mT__62(); 

				}
				break;
			case 19 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:109: T__63
				{
				mT__63(); 

				}
				break;
			case 20 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:115: T__64
				{
				mT__64(); 

				}
				break;
			case 21 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:121: T__65
				{
				mT__65(); 

				}
				break;
			case 22 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:127: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:130: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;
			case 24 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:141: ML_COMMENT
				{
				mML_COMMENT(); 

				}
				break;
			case 25 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:152: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 26 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:159: STR
				{
				mSTR(); 

				}
				break;
			case 27 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:163: CHR
				{
				mCHR(); 

				}
				break;
			case 28 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:167: IDENT
				{
				mIDENT(); 

				}
				break;
			case 29 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:173: ADD
				{
				mADD(); 

				}
				break;
			case 30 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:177: SUB
				{
				mSUB(); 

				}
				break;
			case 31 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:181: MUL
				{
				mMUL(); 

				}
				break;
			case 32 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:185: DIV
				{
				mDIV(); 

				}
				break;
			case 33 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:189: MOD
				{
				mMOD(); 

				}
				break;
			case 34 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:193: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 35 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:200: EQ
				{
				mEQ(); 

				}
				break;
			case 36 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:203: NE
				{
				mNE(); 

				}
				break;
			case 37 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:206: ME
				{
				mME(); 

				}
				break;
			case 38 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:209: LE
				{
				mLE(); 

				}
				break;
			case 39 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:212: MT
				{
				mMT(); 

				}
				break;
			case 40 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:215: LT
				{
				mLT(); 

				}
				break;
			case 41 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:218: NOT
				{
				mNOT(); 

				}
				break;
			case 42 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:222: AND
				{
				mAND(); 

				}
				break;
			case 43 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:226: OR
				{
				mOR(); 

				}
				break;
			case 44 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:229: ADD_ASSIGN
				{
				mADD_ASSIGN(); 

				}
				break;
			case 45 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:240: SUB_ASSIGN
				{
				mSUB_ASSIGN(); 

				}
				break;
			case 46 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:251: MUL_ASSIGN
				{
				mMUL_ASSIGN(); 

				}
				break;
			case 47 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:262: DIV_ASSIGN
				{
				mDIV_ASSIGN(); 

				}
				break;
			case 48 :
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:273: MOD_ASSIGN
				{
				mMOD_ASSIGN(); 

				}
				break;

		}
	}


	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA12_eotS =
		"\2\uffff\4\31\1\uffff\6\31\7\uffff\1\62\1\64\4\uffff\1\66\1\70\1\72\1"+
		"\74\1\76\1\100\1\102\2\uffff\3\31\1\107\2\31\1\112\5\31\24\uffff\4\31"+
		"\1\uffff\1\31\1\125\1\uffff\1\126\5\31\1\134\2\31\1\137\2\uffff\2\31\1"+
		"\142\1\31\1\144\1\uffff\2\31\1\uffff\2\31\1\uffff\1\151\1\uffff\1\31\1"+
		"\153\1\154\1\155\1\uffff\1\31\3\uffff\1\157\1\uffff";
	static final String DFA12_eofS =
		"\160\uffff";
	static final String DFA12_minS =
		"\1\11\1\uffff\1\162\1\150\1\157\1\154\1\uffff\1\157\1\146\1\145\1\164"+
		"\1\157\1\150\7\uffff\1\52\1\60\4\uffff\7\75\2\uffff\1\145\1\141\1\156"+
		"\1\60\1\163\1\162\1\60\2\164\1\162\2\151\24\uffff\1\141\1\162\1\164\1"+
		"\142\1\uffff\1\145\1\60\1\uffff\1\60\1\165\1\151\1\144\1\154\1\153\1\60"+
		"\1\151\1\154\1\60\2\uffff\1\162\1\156\1\60\1\145\1\60\1\uffff\1\156\1"+
		"\145\1\uffff\1\156\1\147\1\uffff\1\60\1\uffff\1\165\3\60\1\uffff\1\145"+
		"\3\uffff\1\60\1\uffff";
	static final String DFA12_maxS =
		"\1\175\1\uffff\1\162\2\157\1\154\1\uffff\1\157\1\156\1\145\1\164\1\157"+
		"\1\150\7\uffff\2\75\4\uffff\7\75\2\uffff\1\145\1\141\1\156\1\172\1\163"+
		"\1\162\1\172\2\164\1\162\2\151\24\uffff\1\141\1\162\1\164\1\142\1\uffff"+
		"\1\145\1\172\1\uffff\1\172\1\165\1\151\1\144\1\154\1\153\1\172\1\151\1"+
		"\154\1\172\2\uffff\1\162\1\156\1\172\1\145\1\172\1\uffff\1\156\1\145\1"+
		"\uffff\1\156\1\147\1\uffff\1\172\1\uffff\1\165\3\172\1\uffff\1\145\3\uffff"+
		"\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\4\uffff\1\10\6\uffff\1\20\1\21\1\22\1\23\1\24\1\25\1\26\2"+
		"\uffff\1\31\1\32\1\33\1\34\7\uffff\1\52\1\53\14\uffff\1\27\1\30\1\57\1"+
		"\40\1\55\1\36\1\54\1\35\1\56\1\37\1\60\1\41\1\43\1\42\1\44\1\51\1\45\1"+
		"\47\1\46\1\50\4\uffff\1\5\2\uffff\1\12\12\uffff\1\11\1\13\5\uffff\1\3"+
		"\2\uffff\1\7\2\uffff\1\16\1\uffff\1\2\4\uffff\1\17\1\uffff\1\6\1\14\1"+
		"\15\1\uffff\1\4";
	static final String DFA12_specialS =
		"\160\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\23\1\uffff\2\23\22\uffff\1\23\1\36\1\27\2\uffff\1\34\1\41\1\30\1\15"+
			"\1\16\1\33\1\32\1\17\1\25\1\uffff\1\24\12\26\1\uffff\1\20\1\40\1\35\1"+
			"\37\2\uffff\32\31\1\21\1\uffff\1\22\1\uffff\1\31\1\uffff\1\31\1\2\1\3"+
			"\1\4\1\5\1\7\2\31\1\10\10\31\1\11\1\12\2\31\1\13\1\14\3\31\1\1\1\42\1"+
			"\6",
			"",
			"\1\43",
			"\1\44\6\uffff\1\45",
			"\1\46",
			"\1\47",
			"",
			"\1\50",
			"\1\51\7\uffff\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60\4\uffff\1\57\15\uffff\1\61",
			"\12\26\3\uffff\1\63",
			"",
			"",
			"",
			"",
			"\1\65",
			"\1\67",
			"\1\71",
			"\1\73",
			"\1\75",
			"\1\77",
			"\1\101",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\24\31\1\106\5\31",
			"\1\110",
			"\1\111",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"",
			"\1\124",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\135",
			"\1\136",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\140",
			"\1\141",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\143",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\145",
			"\1\146",
			"",
			"\1\147",
			"\1\150",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\152",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\156",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( BEGIN | BREAK | CHAR | CONTINUE | DO | DOUBLE | ELSE | END | FOR | IF | INT | RETURN | STRING | VOID | WHILE | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | WS | SL_COMMENT | ML_COMMENT | NUMBER | STR | CHR | IDENT | ADD | SUB | MUL | DIV | MOD | ASSIGN | EQ | NE | ME | LE | MT | LT | NOT | AND | OR | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN );";
		}
	}

}
