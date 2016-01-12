// $ANTLR 3.5.2 D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g 2016-01-09 13:20:02
package clangcompiler.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADD_ASSIGN", "AND", "ARRAY", 
		"ARRAYCALL", "ARRAYINIT", "ARRAYSET", "ASSIGN", "BEGIN", "BLOCK", "BREAK", 
		"CHAR", "CHR", "CONTINUE", "CONVERT", "DECLARE", "DIV", "DIV_ASSIGN", 
		"DO", "DOUBLE", "DOWHILE", "ELSE", "END", "EQ", "FOR", "FUNC", "FUNCCALL", 
		"IDENT", "IF", "INT", "LE", "LT", "ME", "ML_COMMENT", "MOD", "MOD_ASSIGN", 
		"MT", "MUL", "MUL_ASSIGN", "NE", "NOT", "NUMBER", "OR", "PARAMS", "PROGRAM", 
		"RETURN", "SL_COMMENT", "STR", "STRING", "SUB", "SUB_ASSIGN", "UNKNOWN", 
		"VARDECL", "VOID", "WHILE", "WS", "'('", "')'", "','", "';'", "'['", "']'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g"; }


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:115:1: assign : ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN );
	public final CGrammarParser.assign_return assign() throws RecognitionException {
		CGrammarParser.assign_return retval = new CGrammarParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;

		Object set1_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:115:8: ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set1=input.LT(1);
			if ( input.LA(1)==ADD_ASSIGN||input.LA(1)==ASSIGN||input.LA(1)==DIV_ASSIGN||input.LA(1)==MOD_ASSIGN||input.LA(1)==MUL_ASSIGN||input.LA(1)==SUB_ASSIGN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set1));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:1: type : ( INT | CHAR | STRING | DOUBLE | VOID );
	public final CGrammarParser.type_return type() throws RecognitionException {
		CGrammarParser.type_return retval = new CGrammarParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set2=null;

		Object set2_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:6: ( INT | CHAR | STRING | DOUBLE | VOID )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set2=input.LT(1);
			if ( input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VOID ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class array_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_call"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:1: array_call : IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) ;
	public final CGrammarParser.array_call_return array_call() throws RecognitionException {
		CGrammarParser.array_call_return retval = new CGrammarParser.array_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT3=null;
		Token char_literal4=null;
		Token char_literal6=null;
		ParserRuleReturnScope term5 =null;

		Object IDENT3_tree=null;
		Object char_literal4_tree=null;
		Object char_literal6_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:120:2: ( IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:120:4: IDENT '[' term ']'
			{
			IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_call899); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT3);

			char_literal4=(Token)match(input,64,FOLLOW_64_in_array_call901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal4);

			pushFollow(FOLLOW_term_in_array_call903);
			term5=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term5.getTree());
			char_literal6=(Token)match(input,65,FOLLOW_65_in_array_call905); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal6);

			// AST REWRITE
			// elements: IDENT, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 120:23: -> ^( ARRAYCALL IDENT term )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:120:26: ^( ARRAYCALL IDENT term )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYCALL, "ARRAYCALL"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_term.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_call"


	public static class array_set_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_set"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:122:1: array_set : IDENT '[' term ']' -> ^( ARRAYSET IDENT term ) ;
	public final CGrammarParser.array_set_return array_set() throws RecognitionException {
		CGrammarParser.array_set_return retval = new CGrammarParser.array_set_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT7=null;
		Token char_literal8=null;
		Token char_literal10=null;
		ParserRuleReturnScope term9 =null;

		Object IDENT7_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:9: ( IDENT '[' term ']' -> ^( ARRAYSET IDENT term ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:17: IDENT '[' term ']'
			{
			IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_set937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT7);

			char_literal8=(Token)match(input,64,FOLLOW_64_in_array_set939); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal8);

			pushFollow(FOLLOW_term_in_array_set941);
			term9=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term9.getTree());
			char_literal10=(Token)match(input,65,FOLLOW_65_in_array_set943); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal10);

			// AST REWRITE
			// elements: IDENT, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 123:36: -> ^( ARRAYSET IDENT term )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:39: ^( ARRAYSET IDENT term )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYSET, "ARRAYSET"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				adaptor.addChild(root_1, stream_term.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_set"


	public static class group_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "group"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:125:1: group : ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT | SUB ^ IDENT );
	public final CGrammarParser.group_return group() throws RecognitionException {
		CGrammarParser.group_return retval = new CGrammarParser.group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal11=null;
		Token char_literal13=null;
		Token NUMBER15=null;
		Token STR16=null;
		Token CHR17=null;
		Token IDENT19=null;
		Token SUB20=null;
		Token IDENT21=null;
		ParserRuleReturnScope term12 =null;
		ParserRuleReturnScope func_call14 =null;
		ParserRuleReturnScope array_call18 =null;

		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object NUMBER15_tree=null;
		Object STR16_tree=null;
		Object CHR17_tree=null;
		Object IDENT19_tree=null;
		Object SUB20_tree=null;
		Object IDENT21_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:125:7: ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT | SUB ^ IDENT )
			int alt1=8;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt1=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 64:
					{
					alt1=6;
					}
					break;
				case 60:
					{
					alt1=2;
					}
					break;
				case EOF:
				case ADD:
				case AND:
				case BEGIN:
				case BREAK:
				case CHAR:
				case CONTINUE:
				case DIV:
				case DO:
				case DOUBLE:
				case END:
				case EQ:
				case FOR:
				case IDENT:
				case IF:
				case INT:
				case LE:
				case LT:
				case ME:
				case MOD:
				case MT:
				case MUL:
				case NE:
				case OR:
				case RETURN:
				case STRING:
				case SUB:
				case VOID:
				case WHILE:
				case 61:
				case 62:
				case 63:
				case 65:
					{
					alt1=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case NUMBER:
				{
				alt1=3;
				}
				break;
			case STR:
				{
				alt1=4;
				}
				break;
			case CHR:
				{
				alt1=5;
				}
				break;
			case SUB:
				{
				alt1=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:125:9: '(' ! term ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal11=(Token)match(input,60,FOLLOW_60_in_group961); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_group964);
					term12=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term12.getTree());

					char_literal13=(Token)match(input,61,FOLLOW_61_in_group966); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:126:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_group973);
					func_call14=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call14.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:127:5: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER15=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_group980); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER15_tree = (Object)adaptor.create(NUMBER15);
					adaptor.addChild(root_0, NUMBER15_tree);
					}

					}
					break;
				case 4 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:5: STR
					{
					root_0 = (Object)adaptor.nil();


					STR16=(Token)match(input,STR,FOLLOW_STR_in_group986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR16_tree = (Object)adaptor.create(STR16);
					adaptor.addChild(root_0, STR16_tree);
					}

					}
					break;
				case 5 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:5: CHR
					{
					root_0 = (Object)adaptor.nil();


					CHR17=(Token)match(input,CHR,FOLLOW_CHR_in_group992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHR17_tree = (Object)adaptor.create(CHR17);
					adaptor.addChild(root_0, CHR17_tree);
					}

					}
					break;
				case 6 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:130:5: array_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_call_in_group998);
					array_call18=array_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call18.getTree());

					}
					break;
				case 7 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:131:5: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_group1004); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT19_tree = (Object)adaptor.create(IDENT19);
					adaptor.addChild(root_0, IDENT19_tree);
					}

					}
					break;
				case 8 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:132:19: SUB ^ IDENT
					{
					root_0 = (Object)adaptor.nil();


					SUB20=(Token)match(input,SUB,FOLLOW_SUB_in_group1024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SUB20_tree = (Object)adaptor.create(SUB20);
					root_0 = (Object)adaptor.becomeRoot(SUB20_tree, root_0);
					}

					IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_group1027); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT21_tree = (Object)adaptor.create(IDENT21);
					adaptor.addChild(root_0, IDENT21_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "group"


	public static class mult_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:1: mult : group ( ( MUL | DIV | MOD ) ^ group )* ;
	public final CGrammarParser.mult_return mult() throws RecognitionException {
		CGrammarParser.mult_return retval = new CGrammarParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set23=null;
		ParserRuleReturnScope group22 =null;
		ParserRuleReturnScope group24 =null;

		Object set23_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:6: ( group ( ( MUL | DIV | MOD ) ^ group )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:8: group ( ( MUL | DIV | MOD ) ^ group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_group_in_mult1040);
			group22=group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, group22.getTree());

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:14: ( ( MUL | DIV | MOD ) ^ group )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DIV||LA2_0==MOD||LA2_0==MUL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:16: ( MUL | DIV | MOD ) ^ group
					{
					set23=input.LT(1);
					set23=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MUL ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set23), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_group_in_mult1059);
					group24=group();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, group24.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class add_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:1: add : mult ( ( ADD | SUB ) ^ mult )* ;
	public final CGrammarParser.add_return add() throws RecognitionException {
		CGrammarParser.add_return retval = new CGrammarParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set26=null;
		ParserRuleReturnScope mult25 =null;
		ParserRuleReturnScope mult27 =null;

		Object set26_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:5: ( mult ( ( ADD | SUB ) ^ mult )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:7: mult ( ( ADD | SUB ) ^ mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add1070);
			mult25=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult25.getTree());

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:13: ( ( ADD | SUB ) ^ mult )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ADD||LA3_0==SUB) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:15: ( ADD | SUB ) ^ mult
					{
					set26=input.LT(1);
					set26=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set26), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add1086);
					mult27=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult27.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:1: term : add ;
	public final CGrammarParser.term_return term() throws RecognitionException {
		CGrammarParser.term_return retval = new CGrammarParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope add28 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:6: ( add )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:8: add
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_term1097);
			add28=add();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, add28.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class compare_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compare"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:1: compare : term ( ME | LE | EQ | NE | LT | MT ) ^ term ;
	public final CGrammarParser.compare_return compare() throws RecognitionException {
		CGrammarParser.compare_return retval = new CGrammarParser.compare_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set30=null;
		ParserRuleReturnScope term29 =null;
		ParserRuleReturnScope term31 =null;

		Object set30_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:9: ( term ( ME | LE | EQ | NE | LT | MT ) ^ term )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:11: term ( ME | LE | EQ | NE | LT | MT ) ^ term
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_compare1106);
			term29=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term29.getTree());

			set30=input.LT(1);
			set30=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= LE && input.LA(1) <= ME)||input.LA(1)==MT||input.LA(1)==NE ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set30), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_compare1135);
			term31=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term31.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compare"


	public static class compare_group_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "compare_group"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:140:1: compare_group : ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !);
	public final CGrammarParser.compare_group_return compare_group() throws RecognitionException {
		CGrammarParser.compare_group_return retval = new CGrammarParser.compare_group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal32=null;
		Token char_literal34=null;
		Token NOT36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope compare33 =null;
		ParserRuleReturnScope compare35 =null;
		ParserRuleReturnScope compare38 =null;

		Object char_literal32_tree=null;
		Object char_literal34_tree=null;
		Object NOT36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:2: ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !)
			int alt4=3;
			switch ( input.LA(1) ) {
			case 60:
				{
				int LA4_1 = input.LA(2);
				if ( (synpred27_CGrammar()) ) {
					alt4=1;
				}
				else if ( (synpred28_CGrammar()) ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHR:
			case IDENT:
			case NUMBER:
			case STR:
			case SUB:
				{
				alt4=2;
				}
				break;
			case NOT:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:4: '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal32=(Token)match(input,60,FOLLOW_60_in_compare_group1144); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1147);
					compare33=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare33.getTree());

					char_literal34=(Token)match(input,61,FOLLOW_61_in_compare_group1149); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:5: compare
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compare_in_compare_group1156);
					compare35=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare35.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:143:5: NOT ^ '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					NOT36=(Token)match(input,NOT,FOLLOW_NOT_in_compare_group1162); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT36_tree = (Object)adaptor.create(NOT36);
					root_0 = (Object)adaptor.becomeRoot(NOT36_tree, root_0);
					}

					char_literal37=(Token)match(input,60,FOLLOW_60_in_compare_group1165); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1168);
					compare38=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare38.getTree());

					char_literal39=(Token)match(input,61,FOLLOW_61_in_compare_group1170); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compare_group"


	public static class and_logic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_logic"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:144:1: and_logic : compare_group ( AND ^ compare_group )* ;
	public final CGrammarParser.and_logic_return and_logic() throws RecognitionException {
		CGrammarParser.and_logic_return retval = new CGrammarParser.and_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND41=null;
		ParserRuleReturnScope compare_group40 =null;
		ParserRuleReturnScope compare_group42 =null;

		Object AND41_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:2: ( compare_group ( AND ^ compare_group )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:4: compare_group ( AND ^ compare_group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_compare_group_in_and_logic1180);
			compare_group40=compare_group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_group40.getTree());

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:18: ( AND ^ compare_group )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AND) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:19: AND ^ compare_group
					{
					AND41=(Token)match(input,AND,FOLLOW_AND_in_and_logic1183); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND41_tree = (Object)adaptor.create(AND41);
					root_0 = (Object)adaptor.becomeRoot(AND41_tree, root_0);
					}

					pushFollow(FOLLOW_compare_group_in_and_logic1186);
					compare_group42=compare_group();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_group42.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "and_logic"


	public static class or_logic_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "or_logic"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:1: or_logic : and_logic ( OR ^ and_logic )* ;
	public final CGrammarParser.or_logic_return or_logic() throws RecognitionException {
		CGrammarParser.or_logic_return retval = new CGrammarParser.or_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR44=null;
		ParserRuleReturnScope and_logic43 =null;
		ParserRuleReturnScope and_logic45 =null;

		Object OR44_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:9: ( and_logic ( OR ^ and_logic )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:11: and_logic ( OR ^ and_logic )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_logic_in_or_logic1195);
			and_logic43=and_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic43.getTree());

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:21: ( OR ^ and_logic )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:22: OR ^ and_logic
					{
					OR44=(Token)match(input,OR,FOLLOW_OR_in_or_logic1198); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR44_tree = (Object)adaptor.create(OR44);
					root_0 = (Object)adaptor.becomeRoot(OR44_tree, root_0);
					}

					pushFollow(FOLLOW_and_logic_in_or_logic1201);
					and_logic45=and_logic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic45.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "or_logic"


	public static class simple_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simple_var"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:1: simple_var : IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) ;
	public final CGrammarParser.simple_var_return simple_var() throws RecognitionException {
		CGrammarParser.simple_var_return retval = new CGrammarParser.simple_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT46=null;
		Token ASSIGN47=null;
		ParserRuleReturnScope term48 =null;

		Object IDENT46_tree=null;
		Object ASSIGN47_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:2: ( IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:4: IDENT ( ASSIGN term )?
			{
			IDENT46=(Token)match(input,IDENT,FOLLOW_IDENT_in_simple_var1213); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT46);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:10: ( ASSIGN term )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:11: ASSIGN term
					{
					ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simple_var1216); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN47);

					pushFollow(FOLLOW_term_in_simple_var1218);
					term48=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term48.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: term, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 149:25: -> ^( IDENT ( term )? )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:28: ^( IDENT ( term )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:36: ( term )?
				if ( stream_term.hasNext() ) {
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_var"


	public static class array_var1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_var1"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:1: array_var1 : IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY term ^( IDENT ( ^( ARRAYINIT ( term )* ) )? ) ) ;
	public final CGrammarParser.array_var1_return array_var1() throws RecognitionException {
		CGrammarParser.array_var1_return retval = new CGrammarParser.array_var1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT49=null;
		Token char_literal50=null;
		Token char_literal52=null;
		Token ASSIGN53=null;
		Token BEGIN54=null;
		Token char_literal56=null;
		Token END58=null;
		ParserRuleReturnScope term51 =null;
		ParserRuleReturnScope term55 =null;
		ParserRuleReturnScope term57 =null;

		Object IDENT49_tree=null;
		Object char_literal50_tree=null;
		Object char_literal52_tree=null;
		Object ASSIGN53_tree=null;
		Object BEGIN54_tree=null;
		Object char_literal56_tree=null;
		Object END58_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:2: ( IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY term ^( IDENT ( ^( ARRAYINIT ( term )* ) )? ) ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:4: IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT49=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var11238); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT49);

			char_literal50=(Token)match(input,64,FOLLOW_64_in_array_var11240); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal50);

			pushFollow(FOLLOW_term_in_array_var11242);
			term51=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term51.getTree());
			char_literal52=(Token)match(input,65,FOLLOW_65_in_array_var11244); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal52);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:23: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:24: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN53=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var11247); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN53);

					BEGIN54=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var11249); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN54);

					pushFollow(FOLLOW_term_in_array_var11251);
					term55=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term55.getTree());
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:42: ( ',' term )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==62) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:152:43: ',' term
							{
							char_literal56=(Token)match(input,62,FOLLOW_62_in_array_var11254); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_62.add(char_literal56);

							pushFollow(FOLLOW_term_in_array_var11256);
							term57=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term57.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					END58=(Token)match(input,END,FOLLOW_END_in_array_var11260); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END58);

					}
					break;

			}

			// AST REWRITE
			// elements: term, IDENT, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 153:18: -> ^( ARRAY term ^( IDENT ( ^( ARRAYINIT ( term )* ) )? ) )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:21: ^( ARRAY term ^( IDENT ( ^( ARRAYINIT ( term )* ) )? ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_term.nextTree());
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:35: ^( IDENT ( ^( ARRAYINIT ( term )* ) )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:44: ( ^( ARRAYINIT ( term )* ) )?
				if ( stream_term.hasNext() ) {
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:44: ^( ARRAYINIT ( term )* )
					{
					Object root_3 = (Object)adaptor.nil();
					root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, "ARRAYINIT"), root_3);
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:57: ( term )*
					while ( stream_term.hasNext() ) {
						adaptor.addChild(root_3, stream_term.nextTree());
					}
					stream_term.reset();

					adaptor.addChild(root_2, root_3);
					}

				}
				stream_term.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_var1"


	public static class array_var2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_var2"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:156:1: array_var2 : IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY ^( IDENT ^( ARRAYINIT ( term )* ) ) ) ;
	public final CGrammarParser.array_var2_return array_var2() throws RecognitionException {
		CGrammarParser.array_var2_return retval = new CGrammarParser.array_var2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT59=null;
		Token char_literal60=null;
		Token char_literal61=null;
		Token ASSIGN62=null;
		Token BEGIN63=null;
		Token char_literal65=null;
		Token END67=null;
		ParserRuleReturnScope term64 =null;
		ParserRuleReturnScope term66 =null;

		Object IDENT59_tree=null;
		Object char_literal60_tree=null;
		Object char_literal61_tree=null;
		Object ASSIGN62_tree=null;
		Object BEGIN63_tree=null;
		Object char_literal65_tree=null;
		Object END67_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:2: ( IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY ^( IDENT ^( ARRAYINIT ( term )* ) ) ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:4: IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT59=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var21315); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT59);

			char_literal60=(Token)match(input,64,FOLLOW_64_in_array_var21317); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal60);

			char_literal61=(Token)match(input,65,FOLLOW_65_in_array_var21319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal61);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:18: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASSIGN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:19: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN62=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var21322); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN62);

					BEGIN63=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var21324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN63);

					pushFollow(FOLLOW_term_in_array_var21326);
					term64=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term64.getTree());
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:37: ( ',' term )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==62) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:38: ',' term
							{
							char_literal65=(Token)match(input,62,FOLLOW_62_in_array_var21329); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_62.add(char_literal65);

							pushFollow(FOLLOW_term_in_array_var21331);
							term66=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term66.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					END67=(Token)match(input,END,FOLLOW_END_in_array_var21335); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END67);

					}
					break;

			}

			// AST REWRITE
			// elements: IDENT, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 158:18: -> ^( ARRAY ^( IDENT ^( ARRAYINIT ( term )* ) ) )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:21: ^( ARRAY ^( IDENT ^( ARRAYINIT ( term )* ) ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:30: ^( IDENT ^( ARRAYINIT ( term )* ) )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_2);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:39: ^( ARRAYINIT ( term )* )
				{
				Object root_3 = (Object)adaptor.nil();
				root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAYINIT, "ARRAYINIT"), root_3);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:52: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_3, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_var2"


	public static class array_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_var"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:1: array_var : ( array_var1 | array_var2 );
	public final CGrammarParser.array_var_return array_var() throws RecognitionException {
		CGrammarParser.array_var_return retval = new CGrammarParser.array_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_var168 =null;
		ParserRuleReturnScope array_var269 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:10: ( array_var1 | array_var2 )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==64) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==65) ) {
						alt12=2;
					}
					else if ( (LA12_2==CHR||LA12_2==IDENT||LA12_2==NUMBER||LA12_2==STR||LA12_2==SUB||LA12_2==60) ) {
						alt12=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:17: array_var1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var1_in_array_var1389);
					array_var168=array_var1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var168.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:30: array_var2
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var2_in_array_var1393);
					array_var269=array_var2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var269.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_var"


	public static class var_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_name"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:1: var_name : ( simple_var | array_var );
	public final CGrammarParser.var_name_return var_name() throws RecognitionException {
		CGrammarParser.var_name_return retval = new CGrammarParser.var_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simple_var70 =null;
		ParserRuleReturnScope array_var71 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:9: ( simple_var | array_var )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==64) ) {
					alt13=2;
				}
				else if ( (LA13_1==EOF||LA13_1==ASSIGN||(LA13_1 >= BREAK && LA13_1 <= CHAR)||LA13_1==CONTINUE||(LA13_1 >= DO && LA13_1 <= DOUBLE)||LA13_1==FOR||(LA13_1 >= IDENT && LA13_1 <= INT)||LA13_1==RETURN||LA13_1==STRING||(LA13_1 >= VOID && LA13_1 <= WHILE)||(LA13_1 >= 61 && LA13_1 <= 63)) ) {
					alt13=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:11: simple_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_var_in_var_name1401);
					simple_var70=simple_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_var70.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:24: array_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var_in_var_name1405);
					array_var71=array_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var71.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_name"


	public static class var_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:1: var_expr : type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) ;
	public final CGrammarParser.var_expr_return var_expr() throws RecognitionException {
		CGrammarParser.var_expr_return retval = new CGrammarParser.var_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal74=null;
		ParserRuleReturnScope type72 =null;
		ParserRuleReturnScope var_name73 =null;
		ParserRuleReturnScope var_name75 =null;

		Object char_literal74_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_var_name=new RewriteRuleSubtreeStream(adaptor,"rule var_name");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:9: ( type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:11: type var_name ( ',' var_name )*
			{
			pushFollow(FOLLOW_type_in_var_expr1414);
			type72=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type72.getTree());
			pushFollow(FOLLOW_var_name_in_var_expr1416);
			var_name73=var_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_var_name.add(var_name73.getTree());
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:25: ( ',' var_name )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==62) ) {
					int LA14_2 = input.LA(2);
					if ( (synpred38_CGrammar()) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:27: ',' var_name
					{
					char_literal74=(Token)match(input,62,FOLLOW_62_in_var_expr1420); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal74);

					pushFollow(FOLLOW_var_name_in_var_expr1422);
					var_name75=var_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_var_name.add(var_name75.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			// AST REWRITE
			// elements: type, var_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 165:3: -> ^( VARDECL ( ^( type var_name ) )* )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:6: ^( VARDECL ( ^( type var_name ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:16: ( ^( type var_name ) )*
				while ( stream_type.hasNext()||stream_var_name.hasNext() ) {
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:16: ^( type var_name )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot(stream_type.nextNode(), root_2);
					adaptor.addChild(root_2, stream_var_name.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_type.reset();
				stream_var_name.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_expr"


	public static class if_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:1: if_expr : IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) ;
	public final CGrammarParser.if_expr_return if_expr() throws RecognitionException {
		CGrammarParser.if_expr_return retval = new CGrammarParser.if_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF76=null;
		Token ELSE79=null;
		ParserRuleReturnScope or_logic77 =null;
		ParserRuleReturnScope expr78 =null;
		ParserRuleReturnScope expr80 =null;

		Object IF76_tree=null;
		Object ELSE79_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:9: ( IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:11: IF or_logic expr ( ELSE expr )?
			{
			IF76=(Token)match(input,IF,FOLLOW_IF_in_if_expr1452); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF76);

			pushFollow(FOLLOW_or_logic_in_if_expr1454);
			or_logic77=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic77.getTree());
			pushFollow(FOLLOW_expr_in_if_expr1456);
			expr78=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr78.getTree());
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:28: ( ELSE expr )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ELSE) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred39_CGrammar()) ) {
					alt15=1;
				}
			}
			switch (alt15) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:29: ELSE expr
					{
					ELSE79=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr1459); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE79);

					pushFollow(FOLLOW_expr_in_if_expr1461);
					expr80=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr80.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IF, or_logic, expr, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 167:41: -> ^( IF or_logic expr ( expr )? )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:44: ^( IF or_logic expr ( expr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_or_logic.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:63: ( expr )?
				if ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_expr"


	public static class while_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:1: while_expr : WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) ;
	public final CGrammarParser.while_expr_return while_expr() throws RecognitionException {
		CGrammarParser.while_expr_return retval = new CGrammarParser.while_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE81=null;
		Token char_literal82=null;
		Token char_literal84=null;
		ParserRuleReturnScope or_logic83 =null;
		ParserRuleReturnScope expr85 =null;

		Object WHILE81_tree=null;
		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:170:2: ( WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:170:4: WHILE '(' or_logic ')' expr
			{
			WHILE81=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_expr1485); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE81);

			char_literal82=(Token)match(input,60,FOLLOW_60_in_while_expr1487); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(char_literal82);

			pushFollow(FOLLOW_or_logic_in_while_expr1489);
			or_logic83=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic83.getTree());
			char_literal84=(Token)match(input,61,FOLLOW_61_in_while_expr1491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal84);

			pushFollow(FOLLOW_expr_in_while_expr1493);
			expr85=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr85.getTree());
			// AST REWRITE
			// elements: or_logic, WHILE, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 170:32: -> ^( WHILE or_logic expr )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:170:35: ^( WHILE or_logic expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_or_logic.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_expr"


	public static class for_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:1: for_expr : FOR ^ '(' ! ( ublock )? ';' ! ( or_logic )? ';' ! ( ublock )? ')' ! expr ;
	public final CGrammarParser.for_expr_return for_expr() throws RecognitionException {
		CGrammarParser.for_expr_return retval = new CGrammarParser.for_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR86=null;
		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		Token char_literal93=null;
		ParserRuleReturnScope ublock88 =null;
		ParserRuleReturnScope or_logic90 =null;
		ParserRuleReturnScope ublock92 =null;
		ParserRuleReturnScope expr94 =null;

		Object FOR86_tree=null;
		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:9: ( FOR ^ '(' ! ( ublock )? ';' ! ( or_logic )? ';' ! ( ublock )? ')' ! expr )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:11: FOR ^ '(' ! ( ublock )? ';' ! ( or_logic )? ';' ! ( ublock )? ')' ! expr
			{
			root_0 = (Object)adaptor.nil();


			FOR86=(Token)match(input,FOR,FOLLOW_FOR_in_for_expr1511); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FOR86_tree = (Object)adaptor.create(FOR86);
			root_0 = (Object)adaptor.becomeRoot(FOR86_tree, root_0);
			}

			char_literal87=(Token)match(input,60,FOLLOW_60_in_for_expr1514); if (state.failed) return retval;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:21: ( ublock )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BREAK && LA16_0 <= CHAR)||LA16_0==CONTINUE||(LA16_0 >= DO && LA16_0 <= DOUBLE)||LA16_0==FOR||(LA16_0 >= IDENT && LA16_0 <= INT)||LA16_0==RETURN||LA16_0==STRING||(LA16_0 >= VOID && LA16_0 <= WHILE)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:21: ublock
					{
					pushFollow(FOLLOW_ublock_in_for_expr1517);
					ublock88=ublock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ublock88.getTree());

					}
					break;

			}

			char_literal89=(Token)match(input,63,FOLLOW_63_in_for_expr1520); if (state.failed) return retval;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:34: ( or_logic )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CHR||LA17_0==IDENT||(LA17_0 >= NOT && LA17_0 <= NUMBER)||LA17_0==STR||LA17_0==SUB||LA17_0==60) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:34: or_logic
					{
					pushFollow(FOLLOW_or_logic_in_for_expr1523);
					or_logic90=or_logic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, or_logic90.getTree());

					}
					break;

			}

			char_literal91=(Token)match(input,63,FOLLOW_63_in_for_expr1526); if (state.failed) return retval;
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:49: ( ublock )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= BREAK && LA18_0 <= CHAR)||LA18_0==CONTINUE||(LA18_0 >= DO && LA18_0 <= DOUBLE)||LA18_0==FOR||(LA18_0 >= IDENT && LA18_0 <= INT)||LA18_0==RETURN||LA18_0==STRING||(LA18_0 >= VOID && LA18_0 <= WHILE)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:49: ublock
					{
					pushFollow(FOLLOW_ublock_in_for_expr1529);
					ublock92=ublock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ublock92.getTree());

					}
					break;

			}

			char_literal93=(Token)match(input,61,FOLLOW_61_in_for_expr1532); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_for_expr1535);
			expr94=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr94.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_expr"


	public static class do_while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "do_while"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:176:1: do_while : DO expr WHILE '(' or_logic ')' -> ^( DOWHILE or_logic expr ) ;
	public final CGrammarParser.do_while_return do_while() throws RecognitionException {
		CGrammarParser.do_while_return retval = new CGrammarParser.do_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO95=null;
		Token WHILE97=null;
		Token char_literal98=null;
		Token char_literal100=null;
		ParserRuleReturnScope expr96 =null;
		ParserRuleReturnScope or_logic99 =null;

		Object DO95_tree=null;
		Object WHILE97_tree=null;
		Object char_literal98_tree=null;
		Object char_literal100_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:176:9: ( DO expr WHILE '(' or_logic ')' -> ^( DOWHILE or_logic expr ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:176:11: DO expr WHILE '(' or_logic ')'
			{
			DO95=(Token)match(input,DO,FOLLOW_DO_in_do_while1545); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DO.add(DO95);

			pushFollow(FOLLOW_expr_in_do_while1547);
			expr96=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr96.getTree());
			WHILE97=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while1549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE97);

			char_literal98=(Token)match(input,60,FOLLOW_60_in_do_while1551); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(char_literal98);

			pushFollow(FOLLOW_or_logic_in_do_while1553);
			or_logic99=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic99.getTree());
			char_literal100=(Token)match(input,61,FOLLOW_61_in_do_while1555); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal100);

			// AST REWRITE
			// elements: expr, or_logic
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 176:42: -> ^( DOWHILE or_logic expr )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:176:45: ^( DOWHILE or_logic expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);
				adaptor.addChild(root_1, stream_or_logic.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "do_while"


	public static class return_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "return_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:1: return_expr : RETURN ^ ( term )? ;
	public final CGrammarParser.return_expr_return return_expr() throws RecognitionException {
		CGrammarParser.return_expr_return retval = new CGrammarParser.return_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN101=null;
		ParserRuleReturnScope term102 =null;

		Object RETURN101_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:2: ( RETURN ^ ( term )? )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:4: RETURN ^ ( term )?
			{
			root_0 = (Object)adaptor.nil();


			RETURN101=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_expr1574); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RETURN101_tree = (Object)adaptor.create(RETURN101);
			root_0 = (Object)adaptor.becomeRoot(RETURN101_tree, root_0);
			}

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:12: ( term )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHR||LA19_0==NUMBER||LA19_0==STR||LA19_0==SUB||LA19_0==60) ) {
				alt19=1;
			}
			else if ( (LA19_0==IDENT) ) {
				int LA19_2 = input.LA(2);
				if ( (synpred43_CGrammar()) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:12: term
					{
					pushFollow(FOLLOW_term_in_return_expr1577);
					term102=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term102.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "return_expr"


	public static class sexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sexpr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:1: sexpr : ( var_expr | BREAK | CONTINUE | return_expr | func_call | ( array_set | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while );
	public final CGrammarParser.sexpr_return sexpr() throws RecognitionException {
		CGrammarParser.sexpr_return retval = new CGrammarParser.sexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BREAK104=null;
		Token CONTINUE105=null;
		Token IDENT109=null;
		Token IDENT112=null;
		Token ASSIGN113=null;
		Token BEGIN114=null;
		Token char_literal116=null;
		Token END118=null;
		ParserRuleReturnScope var_expr103 =null;
		ParserRuleReturnScope return_expr106 =null;
		ParserRuleReturnScope func_call107 =null;
		ParserRuleReturnScope array_set108 =null;
		ParserRuleReturnScope assign110 =null;
		ParserRuleReturnScope term111 =null;
		ParserRuleReturnScope term115 =null;
		ParserRuleReturnScope term117 =null;
		ParserRuleReturnScope do_while119 =null;

		Object BREAK104_tree=null;
		Object CONTINUE105_tree=null;
		Object IDENT109_tree=null;
		Object IDENT112_tree=null;
		Object ASSIGN113_tree=null;
		Object BEGIN114_tree=null;
		Object char_literal116_tree=null;
		Object END118_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:7: ( var_expr | BREAK | CONTINUE | return_expr | func_call | ( array_set | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while )
			int alt22=8;
			switch ( input.LA(1) ) {
			case CHAR:
			case DOUBLE:
			case INT:
			case STRING:
			case VOID:
				{
				alt22=1;
				}
				break;
			case BREAK:
				{
				alt22=2;
				}
				break;
			case CONTINUE:
				{
				alt22=3;
				}
				break;
			case RETURN:
				{
				alt22=4;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case ADD_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case MUL_ASSIGN:
				case SUB_ASSIGN:
				case 64:
					{
					alt22=6;
					}
					break;
				case ASSIGN:
					{
					int LA22_8 = input.LA(3);
					if ( (LA22_8==BEGIN) ) {
						alt22=7;
					}
					else if ( (LA22_8==CHR||LA22_8==IDENT||LA22_8==NUMBER||LA22_8==STR||LA22_8==SUB||LA22_8==60) ) {
						alt22=6;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 60:
					{
					alt22=5;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case DO:
				{
				alt22=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:9: var_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_expr_in_sexpr1586);
					var_expr103=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr103.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:182:5: BREAK
					{
					root_0 = (Object)adaptor.nil();


					BREAK104=(Token)match(input,BREAK,FOLLOW_BREAK_in_sexpr1592); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BREAK104_tree = (Object)adaptor.create(BREAK104);
					adaptor.addChild(root_0, BREAK104_tree);
					}

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:183:5: CONTINUE
					{
					root_0 = (Object)adaptor.nil();


					CONTINUE105=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_sexpr1598); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONTINUE105_tree = (Object)adaptor.create(CONTINUE105);
					adaptor.addChild(root_0, CONTINUE105_tree);
					}

					}
					break;
				case 4 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:5: return_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return_expr_in_sexpr1604);
					return_expr106=return_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, return_expr106.getTree());

					}
					break;
				case 5 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:185:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_sexpr1610);
					func_call107=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call107.getTree());

					}
					break;
				case 6 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:186:5: ( array_set | IDENT ) assign ^ term
					{
					root_0 = (Object)adaptor.nil();


					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:186:5: ( array_set | IDENT )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==IDENT) ) {
						int LA20_1 = input.LA(2);
						if ( (LA20_1==64) ) {
							alt20=1;
						}
						else if ( (LA20_1==ADD_ASSIGN||LA20_1==ASSIGN||LA20_1==DIV_ASSIGN||LA20_1==MOD_ASSIGN||LA20_1==MUL_ASSIGN||LA20_1==SUB_ASSIGN) ) {
							alt20=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 20, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:186:6: array_set
							{
							pushFollow(FOLLOW_array_set_in_sexpr1617);
							array_set108=array_set();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_set108.getTree());

							}
							break;
						case 2 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:186:18: IDENT
							{
							IDENT109=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1621); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENT109_tree = (Object)adaptor.create(IDENT109);
							adaptor.addChild(root_0, IDENT109_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_assign_in_sexpr1624);
					assign110=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assign110.getTree(), root_0);
					pushFollow(FOLLOW_term_in_sexpr1627);
					term111=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term111.getTree());

					}
					break;
				case 7 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:19: IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !
					{
					root_0 = (Object)adaptor.nil();


					IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1647); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT112_tree = (Object)adaptor.create(IDENT112);
					adaptor.addChild(root_0, IDENT112_tree);
					}

					ASSIGN113=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_sexpr1649); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN113_tree = (Object)adaptor.create(ASSIGN113);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN113_tree, root_0);
					}

					BEGIN114=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_sexpr1652); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_sexpr1655);
					term115=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term115.getTree());

					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:45: ( ',' ! term )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==62) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:46: ',' ! term
							{
							char_literal116=(Token)match(input,62,FOLLOW_62_in_sexpr1658); if (state.failed) return retval;
							pushFollow(FOLLOW_term_in_sexpr1661);
							term117=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, term117.getTree());

							}
							break;

						default :
							break loop21;
						}
					}

					END118=(Token)match(input,END,FOLLOW_END_in_sexpr1665); if (state.failed) return retval;
					}
					break;
				case 8 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:5: do_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_do_while_in_sexpr1672);
					do_while119=do_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while119.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sexpr"


	public static class cexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cexpr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:190:1: cexpr : ( if_expr | while_expr | for_expr );
	public final CGrammarParser.cexpr_return cexpr() throws RecognitionException {
		CGrammarParser.cexpr_return retval = new CGrammarParser.cexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_expr120 =null;
		ParserRuleReturnScope while_expr121 =null;
		ParserRuleReturnScope for_expr122 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:190:7: ( if_expr | while_expr | for_expr )
			int alt23=3;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt23=1;
				}
				break;
			case WHILE:
				{
				alt23=2;
				}
				break;
			case FOR:
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:190:9: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_cexpr1683);
					if_expr120=if_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr120.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:5: while_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_expr_in_cexpr1689);
					while_expr121=while_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_expr121.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:192:5: for_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for_expr_in_cexpr1695);
					for_expr122=for_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr122.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cexpr"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:1: expr : ( sexpr ( ';' !)+ | cexpr | block_expr );
	public final CGrammarParser.expr_return expr() throws RecognitionException {
		CGrammarParser.expr_return retval = new CGrammarParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		ParserRuleReturnScope sexpr123 =null;
		ParserRuleReturnScope cexpr125 =null;
		ParserRuleReturnScope block_expr126 =null;

		Object char_literal124_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:6: ( sexpr ( ';' !)+ | cexpr | block_expr )
			int alt25=3;
			switch ( input.LA(1) ) {
			case BREAK:
			case CHAR:
			case CONTINUE:
			case DO:
			case DOUBLE:
			case IDENT:
			case INT:
			case RETURN:
			case STRING:
			case VOID:
				{
				alt25=1;
				}
				break;
			case FOR:
			case IF:
			case WHILE:
				{
				alt25=2;
				}
				break;
			case BEGIN:
				{
				alt25=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:8: sexpr ( ';' !)+
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sexpr_in_expr1704);
					sexpr123=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr123.getTree());

					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:14: ( ';' !)+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==63) ) {
							int LA24_3 = input.LA(2);
							if ( (synpred55_CGrammar()) ) {
								alt24=1;
							}

						}

						switch (alt24) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:15: ';' !
							{
							char_literal124=(Token)match(input,63,FOLLOW_63_in_expr1707); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:195:5: cexpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cexpr_in_expr1716);
					cexpr125=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr125.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:5: block_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_expr_in_expr1722);
					block_expr126=block_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block_expr126.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class uexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "uexpr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:1: uexpr : ( sexpr | cexpr ) ;
	public final CGrammarParser.uexpr_return uexpr() throws RecognitionException {
		CGrammarParser.uexpr_return retval = new CGrammarParser.uexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope sexpr127 =null;
		ParserRuleReturnScope cexpr128 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:7: ( ( sexpr | cexpr ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:10: ( sexpr | cexpr )
			{
			root_0 = (Object)adaptor.nil();


			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:10: ( sexpr | cexpr )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= BREAK && LA26_0 <= CHAR)||LA26_0==CONTINUE||(LA26_0 >= DO && LA26_0 <= DOUBLE)||LA26_0==IDENT||LA26_0==INT||LA26_0==RETURN||LA26_0==STRING||LA26_0==VOID) ) {
				alt26=1;
			}
			else if ( (LA26_0==FOR||LA26_0==IF||LA26_0==WHILE) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:11: sexpr
					{
					pushFollow(FOLLOW_sexpr_in_uexpr1734);
					sexpr127=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr127.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:19: cexpr
					{
					pushFollow(FOLLOW_cexpr_in_uexpr1738);
					cexpr128=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr128.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uexpr"


	public static class ublock_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ublock"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:1: ublock : uexpr ( ',' ( uexpr )* )? -> ^( BLOCK ( uexpr )* ) ;
	public final CGrammarParser.ublock_return ublock() throws RecognitionException {
		CGrammarParser.ublock_return retval = new CGrammarParser.ublock_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal130=null;
		ParserRuleReturnScope uexpr129 =null;
		ParserRuleReturnScope uexpr131 =null;

		Object char_literal130_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_uexpr=new RewriteRuleSubtreeStream(adaptor,"rule uexpr");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:9: ( uexpr ( ',' ( uexpr )* )? -> ^( BLOCK ( uexpr )* ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:17: uexpr ( ',' ( uexpr )* )?
			{
			pushFollow(FOLLOW_uexpr_in_ublock1754);
			uexpr129=uexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_uexpr.add(uexpr129.getTree());
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:23: ( ',' ( uexpr )* )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==62) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:24: ',' ( uexpr )*
					{
					char_literal130=(Token)match(input,62,FOLLOW_62_in_ublock1757); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal130);

					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:28: ( uexpr )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= BREAK && LA27_0 <= CHAR)||LA27_0==CONTINUE||(LA27_0 >= DO && LA27_0 <= DOUBLE)||LA27_0==FOR||(LA27_0 >= IDENT && LA27_0 <= INT)||LA27_0==RETURN||LA27_0==STRING||(LA27_0 >= VOID && LA27_0 <= WHILE)) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:28: uexpr
							{
							pushFollow(FOLLOW_uexpr_in_ublock1759);
							uexpr131=uexpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_uexpr.add(uexpr131.getTree());
							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: uexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 200:37: -> ^( BLOCK ( uexpr )* )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:40: ^( BLOCK ( uexpr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:48: ( uexpr )*
				while ( stream_uexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_uexpr.nextTree());
				}
				stream_uexpr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ublock"


	public static class block_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_expr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:1: block_expr : BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) ;
	public final CGrammarParser.block_expr_return block_expr() throws RecognitionException {
		CGrammarParser.block_expr_return retval = new CGrammarParser.block_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN132=null;
		Token END134=null;
		ParserRuleReturnScope expr133 =null;

		Object BEGIN132_tree=null;
		Object END134_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:2: ( BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:4: BEGIN ( expr )* END
			{
			BEGIN132=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block_expr1782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN132);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:10: ( expr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==BEGIN||(LA29_0 >= BREAK && LA29_0 <= CHAR)||LA29_0==CONTINUE||(LA29_0 >= DO && LA29_0 <= DOUBLE)||LA29_0==FOR||(LA29_0 >= IDENT && LA29_0 <= INT)||LA29_0==RETURN||LA29_0==STRING||(LA29_0 >= VOID && LA29_0 <= WHILE)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:10: expr
					{
					pushFollow(FOLLOW_expr_in_block_expr1784);
					expr133=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			END134=(Token)match(input,END,FOLLOW_END_in_block_expr1787); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END134);

			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 203:20: -> ^( BLOCK ( expr )* )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:23: ^( BLOCK ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:31: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block_expr"


	public static class ident_arr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ident_arr"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:1: ident_arr : ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT );
	public final CGrammarParser.ident_arr_return ident_arr() throws RecognitionException {
		CGrammarParser.ident_arr_return retval = new CGrammarParser.ident_arr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT135=null;
		Token char_literal136=null;
		Token char_literal138=null;
		Token IDENT139=null;
		ParserRuleReturnScope term137 =null;

		Object IDENT135_tree=null;
		Object char_literal136_tree=null;
		Object char_literal138_tree=null;
		Object IDENT139_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:10: ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==IDENT) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==64) ) {
					alt31=1;
				}
				else if ( (LA31_1==EOF||(LA31_1 >= 61 && LA31_1 <= 62)) ) {
					alt31=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:17: IDENT '[' ( term )? ']'
					{
					IDENT135=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1809); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT135);

					char_literal136=(Token)match(input,64,FOLLOW_64_in_ident_arr1811); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_64.add(char_literal136);

					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:27: ( term )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==CHR||LA30_0==IDENT||LA30_0==NUMBER||LA30_0==STR||LA30_0==SUB||LA30_0==60) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:27: term
							{
							pushFollow(FOLLOW_term_in_ident_arr1813);
							term137=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term137.getTree());
							}
							break;

					}

					char_literal138=(Token)match(input,65,FOLLOW_65_in_ident_arr1816); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_65.add(char_literal138);

					// AST REWRITE
					// elements: IDENT, term
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 205:37: -> ^( ARRAY IDENT ( term )? )
					{
						// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:40: ^( ARRAY IDENT ( term )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
						adaptor.addChild(root_1, stream_IDENT.nextNode());
						// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:54: ( term )?
						if ( stream_term.hasNext() ) {
							adaptor.addChild(root_1, stream_term.nextTree());
						}
						stream_term.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:19: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT139=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1847); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT139_tree = (Object)adaptor.create(IDENT139);
					adaptor.addChild(root_0, IDENT139_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ident_arr"


	public static class function_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_var"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:208:1: function_var : type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* ;
	public final CGrammarParser.function_var_return function_var() throws RecognitionException {
		CGrammarParser.function_var_return retval = new CGrammarParser.function_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal142=null;
		ParserRuleReturnScope type140 =null;
		ParserRuleReturnScope ident_arr141 =null;
		ParserRuleReturnScope type143 =null;
		ParserRuleReturnScope ident_arr144 =null;

		Object char_literal142_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_ident_arr=new RewriteRuleSubtreeStream(adaptor,"rule ident_arr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:2: ( type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:4: type ident_arr ( ',' type ident_arr )*
			{
			pushFollow(FOLLOW_type_in_function_var1857);
			type140=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type140.getTree());
			pushFollow(FOLLOW_ident_arr_in_function_var1859);
			ident_arr141=ident_arr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr141.getTree());
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:19: ( ',' type ident_arr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==62) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:21: ',' type ident_arr
					{
					char_literal142=(Token)match(input,62,FOLLOW_62_in_function_var1863); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal142);

					pushFollow(FOLLOW_type_in_function_var1865);
					type143=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type143.getTree());
					pushFollow(FOLLOW_ident_arr_in_function_var1867);
					ident_arr144=ident_arr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr144.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: ident_arr, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 209:43: -> ( ^( type ident_arr ) )*
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:46: ( ^( type ident_arr ) )*
				while ( stream_ident_arr.hasNext()||stream_type.hasNext() ) {
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:46: ^( type ident_arr )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_type.nextNode(), root_1);
					adaptor.addChild(root_1, stream_ident_arr.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_ident_arr.reset();
				stream_type.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_var"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:1: function : type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) ;
	public final CGrammarParser.function_return function() throws RecognitionException {
		CGrammarParser.function_return retval = new CGrammarParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT146=null;
		Token char_literal147=null;
		Token char_literal149=null;
		Token BEGIN150=null;
		Token END152=null;
		ParserRuleReturnScope type145 =null;
		ParserRuleReturnScope function_var148 =null;
		ParserRuleReturnScope expr151 =null;

		Object IDENT146_tree=null;
		Object char_literal147_tree=null;
		Object char_literal149_tree=null;
		Object BEGIN150_tree=null;
		Object END152_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_function_var=new RewriteRuleSubtreeStream(adaptor,"rule function_var");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:9: ( type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:11: type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END
			{
			pushFollow(FOLLOW_type_in_function1889);
			type145=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type145.getTree());
			IDENT146=(Token)match(input,IDENT,FOLLOW_IDENT_in_function1891); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT146);

			char_literal147=(Token)match(input,60,FOLLOW_60_in_function1893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(char_literal147);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:26: ( function_var )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CHAR||LA33_0==DOUBLE||LA33_0==INT||LA33_0==STRING||LA33_0==VOID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:26: function_var
					{
					pushFollow(FOLLOW_function_var_in_function1895);
					function_var148=function_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function_var.add(function_var148.getTree());
					}
					break;

			}

			char_literal149=(Token)match(input,61,FOLLOW_61_in_function1898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal149);

			BEGIN150=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function1900); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN150);

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:50: ( expr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==BEGIN||(LA34_0 >= BREAK && LA34_0 <= CHAR)||LA34_0==CONTINUE||(LA34_0 >= DO && LA34_0 <= DOUBLE)||LA34_0==FOR||(LA34_0 >= IDENT && LA34_0 <= INT)||LA34_0==RETURN||LA34_0==STRING||(LA34_0 >= VOID && LA34_0 <= WHILE)) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:50: expr
					{
					pushFollow(FOLLOW_expr_in_function1902);
					expr151=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr151.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			END152=(Token)match(input,END,FOLLOW_END_in_function1905); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END152);

			// AST REWRITE
			// elements: type, function_var, expr, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 212:3: -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:6: ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:24: ^( PARAMS ( function_var )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:33: ( function_var )?
				if ( stream_function_var.hasNext() ) {
					adaptor.addChild(root_2, stream_function_var.nextTree());
				}
				stream_function_var.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:48: ^( BLOCK ( expr )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:56: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_2, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class func_name_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_name"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:1: func_name : IDENT ;
	public final CGrammarParser.func_name_return func_name() throws RecognitionException {
		CGrammarParser.func_name_return retval = new CGrammarParser.func_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT153=null;

		Object IDENT153_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:2: ( IDENT )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:4: IDENT
			{
			root_0 = (Object)adaptor.nil();


			IDENT153=(Token)match(input,IDENT,FOLLOW_IDENT_in_func_name1945); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT153_tree = (Object)adaptor.create(IDENT153);
			adaptor.addChild(root_0, IDENT153_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_name"


	public static class func_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_call"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:1: func_call : func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) ;
	public final CGrammarParser.func_call_return func_call() throws RecognitionException {
		CGrammarParser.func_call_return retval = new CGrammarParser.func_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal155=null;
		Token char_literal157=null;
		ParserRuleReturnScope func_name154 =null;
		ParserRuleReturnScope params_156 =null;

		Object char_literal155_tree=null;
		Object char_literal157_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleSubtreeStream stream_params_=new RewriteRuleSubtreeStream(adaptor,"rule params_");
		RewriteRuleSubtreeStream stream_func_name=new RewriteRuleSubtreeStream(adaptor,"rule func_name");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:218:2: ( func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:218:4: func_name '(' params_ ')'
			{
			pushFollow(FOLLOW_func_name_in_func_call1958);
			func_name154=func_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_func_name.add(func_name154.getTree());
			char_literal155=(Token)match(input,60,FOLLOW_60_in_func_call1960); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(char_literal155);

			pushFollow(FOLLOW_params__in_func_call1962);
			params_156=params_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_params_.add(params_156.getTree());
			char_literal157=(Token)match(input,61,FOLLOW_61_in_func_call1964); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal157);

			// AST REWRITE
			// elements: func_name, params_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 218:30: -> ^( FUNCCALL func_name params_ )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:218:33: ^( FUNCCALL func_name params_ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCCALL, "FUNCCALL"), root_1);
				adaptor.addChild(root_1, stream_func_name.nextTree());
				adaptor.addChild(root_1, stream_params_.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_call"


	public static class params__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "params_"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:1: params_ : ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) ;
	public final CGrammarParser.params__return params_() throws RecognitionException {
		CGrammarParser.params__return retval = new CGrammarParser.params__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal159=null;
		ParserRuleReturnScope term158 =null;
		ParserRuleReturnScope term160 =null;

		Object char_literal159_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:9: ( ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:11: ( term ( ',' term )* )?
			{
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:11: ( term ( ',' term )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==CHR||LA36_0==IDENT||LA36_0==NUMBER||LA36_0==STR||LA36_0==SUB||LA36_0==60) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:13: term ( ',' term )*
					{
					pushFollow(FOLLOW_term_in_params_1985);
					term158=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term158.getTree());
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:18: ( ',' term )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==62) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:20: ',' term
							{
							char_literal159=(Token)match(input,62,FOLLOW_62_in_params_1989); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_62.add(char_literal159);

							pushFollow(FOLLOW_term_in_params_1991);
							term160=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term160.getTree());
							}
							break;

						default :
							break loop35;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 220:36: -> ^( PARAMS ( term )* )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:39: ^( PARAMS ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:49: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_1, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "params_"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:1: program : ( var_expr ( ';' !)+ )* ( function )* ;
	public final CGrammarParser.program_return program() throws RecognitionException {
		CGrammarParser.program_return retval = new CGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal162=null;
		ParserRuleReturnScope var_expr161 =null;
		ParserRuleReturnScope function163 =null;

		Object char_literal162_tree=null;

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:9: ( ( var_expr ( ';' !)+ )* ( function )* )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:11: ( var_expr ( ';' !)+ )* ( function )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:11: ( var_expr ( ';' !)+ )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==CHAR||LA38_0==DOUBLE||LA38_0==INT||LA38_0==STRING||LA38_0==VOID) ) {
					int LA38_1 = input.LA(2);
					if ( (LA38_1==IDENT) ) {
						int LA38_3 = input.LA(3);
						if ( (LA38_3==ASSIGN||(LA38_3 >= 62 && LA38_3 <= 64)) ) {
							alt38=1;
						}

					}

				}

				switch (alt38) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:12: var_expr ( ';' !)+
					{
					pushFollow(FOLLOW_var_expr_in_program2018);
					var_expr161=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr161.getTree());

					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:21: ( ';' !)+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==63) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:22: ';' !
							{
							char_literal162=(Token)match(input,63,FOLLOW_63_in_program2021); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					}
					break;

				default :
					break loop38;
				}
			}

			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:31: ( function )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CHAR||LA39_0==DOUBLE||LA39_0==INT||LA39_0==STRING||LA39_0==VOID) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:31: function
					{
					pushFollow(FOLLOW_function_in_program2028);
					function163=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function163.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class result_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "result"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:224:1: result : program -> ^( PROGRAM program ) ;
	public final CGrammarParser.result_return result() throws RecognitionException {
		CGrammarParser.result_return retval = new CGrammarParser.result_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program164 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:224:8: ( program -> ^( PROGRAM program ) )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:224:10: program
			{
			pushFollow(FOLLOW_program_in_result2037);
			program164=program();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_program.add(program164.getTree());
			// AST REWRITE
			// elements: program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 224:18: -> ^( PROGRAM program )
			{
				// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:224:21: ^( PROGRAM program )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_program.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "result"


	public static class execute_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "execute"
	// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:1: execute : result ;
	public final CGrammarParser.execute_return execute() throws RecognitionException {
		CGrammarParser.execute_return retval = new CGrammarParser.execute_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope result165 =null;


		try {
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:227:2: ( result )
			// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:227:4: result
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_result_in_execute2054);
			result165=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result165.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "execute"

	// $ANTLR start synpred27_CGrammar
	public final void synpred27_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:4: ( '(' compare ')' )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:4: '(' compare ')'
		{
		match(input,60,FOLLOW_60_in_synpred27_CGrammar1144); if (state.failed) return;

		pushFollow(FOLLOW_compare_in_synpred27_CGrammar1147);
		compare();
		state._fsp--;
		if (state.failed) return;

		match(input,61,FOLLOW_61_in_synpred27_CGrammar1149); if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_CGrammar

	// $ANTLR start synpred28_CGrammar
	public final void synpred28_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:5: ( compare )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:5: compare
		{
		pushFollow(FOLLOW_compare_in_synpred28_CGrammar1156);
		compare();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred28_CGrammar

	// $ANTLR start synpred38_CGrammar
	public final void synpred38_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:27: ( ',' var_name )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:27: ',' var_name
		{
		match(input,62,FOLLOW_62_in_synpred38_CGrammar1420); if (state.failed) return;

		pushFollow(FOLLOW_var_name_in_synpred38_CGrammar1422);
		var_name();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_CGrammar

	// $ANTLR start synpred39_CGrammar
	public final void synpred39_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:29: ( ELSE expr )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:29: ELSE expr
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred39_CGrammar1459); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred39_CGrammar1461);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred39_CGrammar

	// $ANTLR start synpred43_CGrammar
	public final void synpred43_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:12: ( term )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:12: term
		{
		pushFollow(FOLLOW_term_in_synpred43_CGrammar1577);
		term();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred43_CGrammar

	// $ANTLR start synpred55_CGrammar
	public final void synpred55_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:15: ( ';' )
		// D:\\CLangCompiler\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:15: ';'
		{
		match(input,63,FOLLOW_63_in_synpred55_CGrammar1707); if (state.failed) return;

		}

	}
	// $ANTLR end synpred55_CGrammar

	// Delegated rules

	public final boolean synpred28_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred39_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred39_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_IDENT_in_array_call899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_array_call901 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_call903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_array_call905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_set937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_array_set939 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_set941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_array_set943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_group961 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_group964 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_group966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_group973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_group980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_group986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHR_in_group992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_group998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_group1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_group1024 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENT_in_group1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_in_mult1040 = new BitSet(new long[]{0x0000024000100002L});
	public static final BitSet FOLLOW_set_in_mult1044 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_group_in_mult1059 = new BitSet(new long[]{0x0000024000100002L});
	public static final BitSet FOLLOW_mult_in_add1070 = new BitSet(new long[]{0x0020000000000012L});
	public static final BitSet FOLLOW_set_in_add1075 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_mult_in_add1086 = new BitSet(new long[]{0x0020000000000012L});
	public static final BitSet FOLLOW_add_in_term1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_compare1106 = new BitSet(new long[]{0x0000091C08000000L});
	public static final BitSet FOLLOW_set_in_compare1108 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_compare1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_compare_group1144 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_compare_in_compare_group1147 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_compare_group1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_compare_group1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_compare_group1162 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_compare_group1165 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_compare_in_compare_group1168 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_compare_group1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1180 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_and_logic1183 = new BitSet(new long[]{0x1028300080010000L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1186 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1195 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_OR_in_or_logic1198 = new BitSet(new long[]{0x1028300080010000L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1201 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_IDENT_in_simple_var1213 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_simple_var1216 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_simple_var1218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var11238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_array_var11240 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_var11242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_array_var11244 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var11247 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BEGIN_in_array_var11249 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_var11251 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_62_in_array_var11254 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_var11256 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_END_in_array_var11260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var21315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_array_var21317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_array_var21319 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var21322 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BEGIN_in_array_var21324 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_var21326 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_62_in_array_var21329 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_array_var21331 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_END_in_array_var21335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var1_in_array_var1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var2_in_array_var1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_var_in_var_name1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var_in_var_name1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_expr1414 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1416 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_var_expr1420 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1422 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_expr1452 = new BitSet(new long[]{0x1028300080010000L});
	public static final BitSet FOLLOW_or_logic_in_if_expr1454 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_if_expr1456 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_ELSE_in_if_expr1459 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_if_expr1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_expr1485 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_while_expr1487 = new BitSet(new long[]{0x1028300080010000L});
	public static final BitSet FOLLOW_or_logic_in_while_expr1489 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_while_expr1491 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_while_expr1493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_expr1511 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_for_expr1514 = new BitSet(new long[]{0x8612000390C2C000L});
	public static final BitSet FOLLOW_ublock_in_for_expr1517 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_for_expr1520 = new BitSet(new long[]{0x9028300080010000L});
	public static final BitSet FOLLOW_or_logic_in_for_expr1523 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_for_expr1526 = new BitSet(new long[]{0x2612000390C2C000L});
	public static final BitSet FOLLOW_ublock_in_for_expr1529 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_for_expr1532 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_for_expr1535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_while1545 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_do_while1547 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_WHILE_in_do_while1549 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_do_while1551 = new BitSet(new long[]{0x1028300080010000L});
	public static final BitSet FOLLOW_or_logic_in_do_while1553 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_do_while1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_expr1574 = new BitSet(new long[]{0x1028200080010002L});
	public static final BitSet FOLLOW_term_in_return_expr1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_expr_in_sexpr1586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_sexpr1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_sexpr1598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_expr_in_sexpr1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_sexpr1610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_set_in_sexpr1617 = new BitSet(new long[]{0x0040048000200820L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1621 = new BitSet(new long[]{0x0040048000200820L});
	public static final BitSet FOLLOW_assign_in_sexpr1624 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_sexpr1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1647 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ASSIGN_in_sexpr1649 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BEGIN_in_sexpr1652 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_sexpr1655 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_62_in_sexpr1658 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_sexpr1661 = new BitSet(new long[]{0x4000000004000000L});
	public static final BitSet FOLLOW_END_in_sexpr1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_while_in_sexpr1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_cexpr1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_expr_in_cexpr1689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_expr_in_cexpr1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_expr1704 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_expr1707 = new BitSet(new long[]{0x8000000000000002L});
	public static final BitSet FOLLOW_cexpr_in_expr1716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_expr_in_expr1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_uexpr1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cexpr_in_uexpr1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uexpr_in_ublock1754 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_ublock1757 = new BitSet(new long[]{0x0612000390C2C002L});
	public static final BitSet FOLLOW_uexpr_in_ublock1759 = new BitSet(new long[]{0x0612000390C2C002L});
	public static final BitSet FOLLOW_BEGIN_in_block_expr1782 = new BitSet(new long[]{0x0612000394C2D000L});
	public static final BitSet FOLLOW_expr_in_block_expr1784 = new BitSet(new long[]{0x0612000394C2D000L});
	public static final BitSet FOLLOW_END_in_block_expr1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ident_arr1811 = new BitSet(new long[]{0x1028200080010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_ident_arr1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_ident_arr1816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_var1857 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1859 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_function_var1863 = new BitSet(new long[]{0x0210000200808000L});
	public static final BitSet FOLLOW_type_in_function_var1865 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1867 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_type_in_function1889 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDENT_in_function1891 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_function1893 = new BitSet(new long[]{0x2210000200808000L});
	public static final BitSet FOLLOW_function_var_in_function1895 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_function1898 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BEGIN_in_function1900 = new BitSet(new long[]{0x0612000394C2D000L});
	public static final BitSet FOLLOW_expr_in_function1902 = new BitSet(new long[]{0x0612000394C2D000L});
	public static final BitSet FOLLOW_END_in_function1905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_func_name1945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_name_in_func_call1958 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_func_call1960 = new BitSet(new long[]{0x3028200080010000L});
	public static final BitSet FOLLOW_params__in_func_call1962 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_func_call1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_params_1985 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_params_1989 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_term_in_params_1991 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_var_expr_in_program2018 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_program2021 = new BitSet(new long[]{0x8210000200808002L});
	public static final BitSet FOLLOW_function_in_program2028 = new BitSet(new long[]{0x0210000200808002L});
	public static final BitSet FOLLOW_program_in_result2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_in_execute2054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_synpred27_CGrammar1144 = new BitSet(new long[]{0x1028200080010000L});
	public static final BitSet FOLLOW_compare_in_synpred27_CGrammar1147 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_synpred27_CGrammar1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_synpred28_CGrammar1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_synpred38_CGrammar1420 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_var_name_in_synpred38_CGrammar1422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred39_CGrammar1459 = new BitSet(new long[]{0x0612000390C2D000L});
	public static final BitSet FOLLOW_expr_in_synpred39_CGrammar1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_synpred43_CGrammar1577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_synpred55_CGrammar1707 = new BitSet(new long[]{0x0000000000000002L});
}
