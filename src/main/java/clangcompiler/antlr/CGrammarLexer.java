// $ANTLR 3.5.2 /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g 2015-10-19 18:41:49
package clangcompiler.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CGrammarLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int ABS=4;
	public static final int ADD=5;
	public static final int ADD_ASSIGN=6;
	public static final int AND=7;
	public static final int ARRAY=8;
	public static final int ARRAYCALL=9;
	public static final int ASSIGN=10;
	public static final int BEGIN=11;
	public static final int BLOCK=12;
	public static final int BREAK=13;
	public static final int CHAR=14;
	public static final int CHR=15;
	public static final int CONTINUE=16;
	public static final int COS=17;
	public static final int DECLARE=18;
	public static final int DIV=19;
	public static final int DIV_ASSIGN=20;
	public static final int DO=21;
	public static final int DOUBLE=22;
	public static final int DOWHILE=23;
	public static final int ELSE=24;
	public static final int END=25;
	public static final int EQ=26;
	public static final int FOR=27;
	public static final int FUNC=28;
	public static final int FUNCCALL=29;
	public static final int IDENT=30;
	public static final int IF=31;
	public static final int INT=32;
	public static final int LE=33;
	public static final int LT=34;
	public static final int ME=35;
	public static final int ML_COMMENT=36;
	public static final int MOD=37;
	public static final int MOD_ASSIGN=38;
	public static final int MT=39;
	public static final int MUL=40;
	public static final int MUL_ASSIGN=41;
	public static final int NE=42;
	public static final int NOT=43;
	public static final int NUMBER=44;
	public static final int OR=45;
	public static final int PARAMS=46;
	public static final int PRINTF=47;
	public static final int PROGRAM=48;
	public static final int RETURN=49;
	public static final int SCANF=50;
	public static final int SIN=51;
	public static final int SL_COMMENT=52;
	public static final int STR=53;
	public static final int STRING=54;
	public static final int STRLEN=55;
	public static final int SUB=56;
	public static final int SUB_ASSIGN=57;
	public static final int TAN=58;
	public static final int UNKNOWN=59;
	public static final int VARDECL=60;
	public static final int VOID=61;
	public static final int WHILE=62;
	public static final int WS=63;

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
	@Override public String getGrammarFileName() { return "/home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g"; }

	// $ANTLR start "ABS"
	public final void mABS() throws RecognitionException {
		try {
			int _type = ABS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:9:5: ( 'abs' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:9:7: 'abs'
			{
			match("abs"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ABS"

	// $ANTLR start "BEGIN"
	public final void mBEGIN() throws RecognitionException {
		try {
			int _type = BEGIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:10:7: ( '{' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:10:9: '{'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:11:7: ( 'break' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:11:9: 'break'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:12:6: ( 'char' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:12:8: 'char'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:13:10: ( 'continue' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:13:12: 'continue'
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

	// $ANTLR start "COS"
	public final void mCOS() throws RecognitionException {
		try {
			int _type = COS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:14:5: ( 'cos' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:14:7: 'cos'
			{
			match("cos"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COS"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:15:4: ( 'do' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:15:6: 'do'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:16:8: ( 'double' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:16:10: 'double'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:17:6: ( 'else' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:17:8: 'else'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:18:5: ( '}' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:18:7: '}'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:19:5: ( 'for' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:19:7: 'for'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:20:4: ( 'if' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:20:6: 'if'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:21:5: ( 'int' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:21:7: 'int'
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

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:22:8: ( 'printf' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:22:10: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:23:8: ( 'return' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:23:10: 'return'
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

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:24:7: ( 'scanf' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:24:9: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "SIN"
	public final void mSIN() throws RecognitionException {
		try {
			int _type = SIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:25:5: ( 'sin' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:25:7: 'sin'
			{
			match("sin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIN"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:26:8: ( 'string' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:26:10: 'string'
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

	// $ANTLR start "STRLEN"
	public final void mSTRLEN() throws RecognitionException {
		try {
			int _type = STRLEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:27:8: ( 'strlen' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:27:10: 'strlen'
			{
			match("strlen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRLEN"

	// $ANTLR start "TAN"
	public final void mTAN() throws RecognitionException {
		try {
			int _type = TAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:28:5: ( 'tan' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:28:7: 'tan'
			{
			match("tan"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:29:6: ( 'void' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:29:8: 'void'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:30:7: ( 'while' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:30:9: 'while'
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

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:31:7: ( '(' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:31:9: '('
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:32:7: ( ')' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:32:9: ')'
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:33:7: ( ',' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:33:9: ','
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:34:7: ( ';' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:34:9: ';'
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
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:35:7: ( '[' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:35:9: '['
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:36:7: ( ']' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:36:9: ']'
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
	// $ANTLR end "T__69"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:63:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:64:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:69:11: ( '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:70:3: '//' ( options {greedy=false; } : . )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:70:8: ( options {greedy=false; } : . )*
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:70:36: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop2;
				}
			}

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:70:40: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:70:40: '\\r'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:74:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:75:3: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:75:8: ( options {greedy=false; } : . )*
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:75:36: .
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:8: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:11: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:11: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:23: ( '.' ( '0' .. '9' )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:24: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:80:28: ( '0' .. '9' )+
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
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:83:5: ( '\"' ( . )* '\"' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:83:7: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:83:11: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\"') ) {
					alt8=2;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:83:12: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:5: ( '\\'' ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' ) '\\'' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:7: '\\'' ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' ) '\\''
			{
			match('\''); 
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:12: ( . | '\\\\n' | '\\\\0' | '\\\\t' | '\\\\f' | '\\\\a' | '\\\\v' | '\\\\b' | '\\\\r' | '\\\\\\\\' | '\\\\\\'' | '\\\\\\\"' )
			int alt9=12;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='\\') ) {
				switch ( input.LA(2) ) {
				case 'n':
					{
					alt9=2;
					}
					break;
				case '0':
					{
					alt9=3;
					}
					break;
				case 't':
					{
					alt9=4;
					}
					break;
				case 'f':
					{
					alt9=5;
					}
					break;
				case 'a':
					{
					alt9=6;
					}
					break;
				case 'v':
					{
					alt9=7;
					}
					break;
				case 'b':
					{
					alt9=8;
					}
					break;
				case 'r':
					{
					alt9=9;
					}
					break;
				case '\\':
					{
					alt9=10;
					}
					break;
				case '\'':
					{
					int LA9_12 = input.LA(3);
					if ( (LA9_12=='\'') ) {
						alt9=11;
					}

					else {
						alt9=1;
					}

					}
					break;
				case '\"':
					{
					alt9=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
				alt9=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:13: .
					{
					matchAny(); 
					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:17: '\\\\n'
					{
					match("\\n"); 

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:25: '\\\\0'
					{
					match("\\0"); 

					}
					break;
				case 4 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:33: '\\\\t'
					{
					match("\\t"); 

					}
					break;
				case 5 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:41: '\\\\f'
					{
					match("\\f"); 

					}
					break;
				case 6 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:49: '\\\\a'
					{
					match("\\a"); 

					}
					break;
				case 7 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:57: '\\\\v'
					{
					match("\\v"); 

					}
					break;
				case 8 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:65: '\\\\b'
					{
					match("\\b"); 

					}
					break;
				case 9 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:73: '\\\\r'
					{
					match("\\r"); 

					}
					break;
				case 10 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:81: '\\\\\\\\'
					{
					match("\\\\"); 

					}
					break;
				case 11 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:90: '\\\\\\''
					{
					match("\\'"); 

					}
					break;
				case 12 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:85:99: '\\\\\\\"'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:87:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:87:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:88:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
					break loop10;
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:91:5: ( '+' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:91:7: '+'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:92:5: ( '-' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:92:7: '-'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:93:5: ( '*' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:93:7: '*'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:94:5: ( '/' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:94:7: '/'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:95:5: ( '%' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:95:7: '%'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:97:8: ( '=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:97:10: '='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:99:4: ( '==' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:99:6: '=='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:100:4: ( '!=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:100:6: '!='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:101:4: ( '>=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:101:6: '>='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:102:4: ( '<=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:102:6: '<='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:103:4: ( '>' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:103:6: '>'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:104:4: ( '<' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:104:6: '<'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:106:5: ( '!' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:106:7: '!'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:107:5: ( '&&' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:107:7: '&&'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:108:4: ( '||' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:108:6: '||'
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:111:2: ( '+=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:111:4: '+='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:113:2: ( '-=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:113:4: '-='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:115:2: ( '*=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:115:4: '*='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:2: ( '/=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:4: '/='
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
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:2: ( '%=' )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:4: '%='
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
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:8: ( ABS | BEGIN | BREAK | CHAR | CONTINUE | COS | DO | DOUBLE | ELSE | END | FOR | IF | INT | PRINTF | RETURN | SCANF | SIN | STRING | STRLEN | TAN | VOID | WHILE | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | WS | SL_COMMENT | ML_COMMENT | NUMBER | STR | CHR | IDENT | ADD | SUB | MUL | DIV | MOD | ASSIGN | EQ | NE | ME | LE | MT | LT | NOT | AND | OR | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
		int alt11=55;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:10: ABS
				{
				mABS(); 

				}
				break;
			case 2 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:14: BEGIN
				{
				mBEGIN(); 

				}
				break;
			case 3 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:20: BREAK
				{
				mBREAK(); 

				}
				break;
			case 4 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:26: CHAR
				{
				mCHAR(); 

				}
				break;
			case 5 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:31: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 6 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:40: COS
				{
				mCOS(); 

				}
				break;
			case 7 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:44: DO
				{
				mDO(); 

				}
				break;
			case 8 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:47: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 9 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:54: ELSE
				{
				mELSE(); 

				}
				break;
			case 10 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:59: END
				{
				mEND(); 

				}
				break;
			case 11 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:63: FOR
				{
				mFOR(); 

				}
				break;
			case 12 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:67: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:70: INT
				{
				mINT(); 

				}
				break;
			case 14 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:74: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 15 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:81: RETURN
				{
				mRETURN(); 

				}
				break;
			case 16 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:88: SCANF
				{
				mSCANF(); 

				}
				break;
			case 17 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:94: SIN
				{
				mSIN(); 

				}
				break;
			case 18 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:98: STRING
				{
				mSTRING(); 

				}
				break;
			case 19 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:105: STRLEN
				{
				mSTRLEN(); 

				}
				break;
			case 20 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:112: TAN
				{
				mTAN(); 

				}
				break;
			case 21 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:116: VOID
				{
				mVOID(); 

				}
				break;
			case 22 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:121: WHILE
				{
				mWHILE(); 

				}
				break;
			case 23 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:127: T__64
				{
				mT__64(); 

				}
				break;
			case 24 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:133: T__65
				{
				mT__65(); 

				}
				break;
			case 25 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:139: T__66
				{
				mT__66(); 

				}
				break;
			case 26 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:145: T__67
				{
				mT__67(); 

				}
				break;
			case 27 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:151: T__68
				{
				mT__68(); 

				}
				break;
			case 28 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:157: T__69
				{
				mT__69(); 

				}
				break;
			case 29 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:163: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:166: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;
			case 31 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:177: ML_COMMENT
				{
				mML_COMMENT(); 

				}
				break;
			case 32 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:188: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 33 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:195: STR
				{
				mSTR(); 

				}
				break;
			case 34 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:199: CHR
				{
				mCHR(); 

				}
				break;
			case 35 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:203: IDENT
				{
				mIDENT(); 

				}
				break;
			case 36 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:209: ADD
				{
				mADD(); 

				}
				break;
			case 37 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:213: SUB
				{
				mSUB(); 

				}
				break;
			case 38 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:217: MUL
				{
				mMUL(); 

				}
				break;
			case 39 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:221: DIV
				{
				mDIV(); 

				}
				break;
			case 40 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:225: MOD
				{
				mMOD(); 

				}
				break;
			case 41 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:229: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 42 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:236: EQ
				{
				mEQ(); 

				}
				break;
			case 43 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:239: NE
				{
				mNE(); 

				}
				break;
			case 44 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:242: ME
				{
				mME(); 

				}
				break;
			case 45 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:245: LE
				{
				mLE(); 

				}
				break;
			case 46 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:248: MT
				{
				mMT(); 

				}
				break;
			case 47 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:251: LT
				{
				mLT(); 

				}
				break;
			case 48 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:254: NOT
				{
				mNOT(); 

				}
				break;
			case 49 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:258: AND
				{
				mAND(); 

				}
				break;
			case 50 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:262: OR
				{
				mOR(); 

				}
				break;
			case 51 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:265: ADD_ASSIGN
				{
				mADD_ASSIGN(); 

				}
				break;
			case 52 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:276: SUB_ASSIGN
				{
				mSUB_ASSIGN(); 

				}
				break;
			case 53 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:287: MUL_ASSIGN
				{
				mMUL_ASSIGN(); 

				}
				break;
			case 54 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:298: DIV_ASSIGN
				{
				mDIV_ASSIGN(); 

				}
				break;
			case 55 :
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:1:309: MOD_ASSIGN
				{
				mMOD_ASSIGN(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\1\uffff\1\33\1\uffff\4\33\1\uffff\10\33\7\uffff\1\72\4\uffff\1\74\1\76"+
		"\1\100\1\102\1\104\1\106\1\110\1\112\2\uffff\4\33\1\121\2\33\1\124\11"+
		"\33\24\uffff\1\136\3\33\1\142\1\33\1\uffff\1\33\1\145\1\uffff\1\146\3"+
		"\33\1\152\1\33\1\155\2\33\1\uffff\1\33\1\161\1\33\1\uffff\1\33\1\164\2"+
		"\uffff\3\33\1\uffff\2\33\1\uffff\1\172\1\33\1\174\1\uffff\2\33\1\uffff"+
		"\2\33\1\u0081\2\33\1\uffff\1\u0084\1\uffff\1\33\1\u0086\1\u0087\1\u0088"+
		"\1\uffff\1\u0089\1\u008a\1\uffff\1\33\5\uffff\1\u008c\1\uffff";
	static final String DFA11_eofS =
		"\u008d\uffff";
	static final String DFA11_minS =
		"\1\11\1\142\1\uffff\1\162\1\150\1\157\1\154\1\uffff\1\157\1\146\1\162"+
		"\1\145\1\143\1\141\1\157\1\150\7\uffff\1\52\4\uffff\10\75\2\uffff\1\163"+
		"\1\145\1\141\1\156\1\60\1\163\1\162\1\60\1\164\1\151\1\164\1\141\1\156"+
		"\1\162\1\156\2\151\24\uffff\1\60\1\141\1\162\1\164\1\60\1\142\1\uffff"+
		"\1\145\1\60\1\uffff\1\60\1\156\1\165\1\156\1\60\1\151\1\60\1\144\1\154"+
		"\1\uffff\1\153\1\60\1\151\1\uffff\1\154\1\60\2\uffff\1\164\1\162\1\146"+
		"\1\uffff\1\156\1\145\1\uffff\1\60\1\145\1\60\1\uffff\1\156\1\145\1\uffff"+
		"\1\146\1\156\1\60\1\147\1\156\1\uffff\1\60\1\uffff\1\165\3\60\1\uffff"+
		"\2\60\1\uffff\1\145\5\uffff\1\60\1\uffff";
	static final String DFA11_maxS =
		"\1\175\1\142\1\uffff\1\162\2\157\1\154\1\uffff\1\157\1\156\1\162\1\145"+
		"\1\164\1\141\1\157\1\150\7\uffff\1\75\4\uffff\10\75\2\uffff\1\163\1\145"+
		"\1\141\1\163\1\172\1\163\1\162\1\172\1\164\1\151\1\164\1\141\1\156\1\162"+
		"\1\156\2\151\24\uffff\1\172\1\141\1\162\1\164\1\172\1\142\1\uffff\1\145"+
		"\1\172\1\uffff\1\172\1\156\1\165\1\156\1\172\1\154\1\172\1\144\1\154\1"+
		"\uffff\1\153\1\172\1\151\1\uffff\1\154\1\172\2\uffff\1\164\1\162\1\146"+
		"\1\uffff\1\156\1\145\1\uffff\1\172\1\145\1\172\1\uffff\1\156\1\145\1\uffff"+
		"\1\146\1\156\1\172\1\147\1\156\1\uffff\1\172\1\uffff\1\165\3\172\1\uffff"+
		"\2\172\1\uffff\1\145\5\uffff\1\172\1\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\4\uffff\1\12\10\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
		"\1\uffff\1\40\1\41\1\42\1\43\10\uffff\1\61\1\62\21\uffff\1\36\1\37\1\66"+
		"\1\47\1\63\1\44\1\64\1\45\1\65\1\46\1\67\1\50\1\52\1\51\1\53\1\60\1\54"+
		"\1\56\1\55\1\57\6\uffff\1\7\2\uffff\1\14\11\uffff\1\1\3\uffff\1\6\2\uffff"+
		"\1\13\1\15\3\uffff\1\21\2\uffff\1\24\3\uffff\1\4\2\uffff\1\11\5\uffff"+
		"\1\25\1\uffff\1\3\4\uffff\1\20\2\uffff\1\26\1\uffff\1\10\1\16\1\17\1\22"+
		"\1\23\1\uffff\1\5";
	static final String DFA11_specialS =
		"\u008d\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\26\1\uffff\2\26\22\uffff\1\26\1\41\1\31\2\uffff\1\37\1\44\1\32\1\20"+
			"\1\21\1\36\1\34\1\22\1\35\1\uffff\1\27\12\30\1\uffff\1\23\1\43\1\40\1"+
			"\42\2\uffff\32\33\1\24\1\uffff\1\25\1\uffff\1\33\1\uffff\1\1\1\3\1\4"+
			"\1\5\1\6\1\10\2\33\1\11\6\33\1\12\1\33\1\13\1\14\1\15\1\33\1\16\1\17"+
			"\3\33\1\2\1\45\1\7",
			"\1\46",
			"",
			"\1\47",
			"\1\50\6\uffff\1\51",
			"\1\52",
			"\1\53",
			"",
			"\1\54",
			"\1\55\7\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61\5\uffff\1\62\12\uffff\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70\4\uffff\1\67\15\uffff\1\71",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\75",
			"\1\77",
			"\1\101",
			"\1\103",
			"\1\105",
			"\1\107",
			"\1\111",
			"",
			"",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116\4\uffff\1\117",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\24\33\1\120\5\33",
			"\1\122",
			"\1\123",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
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
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\137",
			"\1\140",
			"\1\141",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\143",
			"",
			"\1\144",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\147",
			"\1\150",
			"\1\151",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\153\2\uffff\1\154",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\156",
			"\1\157",
			"",
			"\1\160",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\162",
			"",
			"\1\163",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"",
			"\1\170",
			"\1\171",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\173",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\175",
			"\1\176",
			"",
			"\1\177",
			"\1\u0080",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\u0082",
			"\1\u0083",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\u0085",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\u008b",
			"",
			"",
			"",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ABS | BEGIN | BREAK | CHAR | CONTINUE | COS | DO | DOUBLE | ELSE | END | FOR | IF | INT | PRINTF | RETURN | SCANF | SIN | STRING | STRLEN | TAN | VOID | WHILE | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | WS | SL_COMMENT | ML_COMMENT | NUMBER | STR | CHR | IDENT | ADD | SUB | MUL | DIV | MOD | ASSIGN | EQ | NE | ME | LE | MT | LT | NOT | AND | OR | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN );";
		}
	}

}
