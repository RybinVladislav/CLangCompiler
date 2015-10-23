// $ANTLR 3.5.2 /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g 2015-10-19 18:41:48
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "ADD", "ADD_ASSIGN", "AND", 
		"ARRAY", "ARRAYCALL", "ASSIGN", "BEGIN", "BLOCK", "BREAK", "CHAR", "CHR", 
		"CONTINUE", "COS", "DECLARE", "DIV", "DIV_ASSIGN", "DO", "DOUBLE", "DOWHILE", 
		"ELSE", "END", "EQ", "FOR", "FUNC", "FUNCCALL", "IDENT", "IF", "INT", 
		"LE", "LT", "ME", "ML_COMMENT", "MOD", "MOD_ASSIGN", "MT", "MUL", "MUL_ASSIGN", 
		"NE", "NOT", "NUMBER", "OR", "PARAMS", "PRINTF", "PROGRAM", "RETURN", 
		"SCANF", "SIN", "SL_COMMENT", "STR", "STRING", "STRLEN", "SUB", "SUB_ASSIGN", 
		"TAN", "UNKNOWN", "VARDECL", "VOID", "WHILE", "WS", "'('", "')'", "','", 
		"';'", "'['", "']'"
	};
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
	@Override public String getGrammarFileName() { return "/home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g"; }


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:121:1: assign : ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN );
	public final CGrammarParser.assign_return assign() throws RecognitionException {
		CGrammarParser.assign_return retval = new CGrammarParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;

		Object set1_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:121:8: ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:1: type : ( INT | CHAR | STRING | DOUBLE | VOID );
	public final CGrammarParser.type_return type() throws RecognitionException {
		CGrammarParser.type_return retval = new CGrammarParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set2=null;

		Object set2_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:6: ( INT | CHAR | STRING | DOUBLE | VOID )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:125:1: array_call : IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) ;
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
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:126:2: ( IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:126:4: IDENT '[' term ']'
			{
			IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_call954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT3);

			char_literal4=(Token)match(input,68,FOLLOW_68_in_array_call956); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal4);

			pushFollow(FOLLOW_term_in_array_call958);
			term5=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term5.getTree());
			char_literal6=(Token)match(input,69,FOLLOW_69_in_array_call960); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(char_literal6);

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
			// 126:23: -> ^( ARRAYCALL IDENT term )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:126:26: ^( ARRAYCALL IDENT term )
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


	public static class group_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "group"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:1: group : ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT );
	public final CGrammarParser.group_return group() throws RecognitionException {
		CGrammarParser.group_return retval = new CGrammarParser.group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal7=null;
		Token char_literal9=null;
		Token NUMBER11=null;
		Token STR12=null;
		Token CHR13=null;
		Token IDENT15=null;
		ParserRuleReturnScope term8 =null;
		ParserRuleReturnScope func_call10 =null;
		ParserRuleReturnScope array_call14 =null;

		Object char_literal7_tree=null;
		Object char_literal9_tree=null;
		Object NUMBER11_tree=null;
		Object STR12_tree=null;
		Object CHR13_tree=null;
		Object IDENT15_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:7: ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT )
			int alt1=7;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt1=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 68:
					{
					alt1=6;
					}
					break;
				case 64:
					{
					alt1=2;
					}
					break;
				case EOF:
				case ABS:
				case ADD:
				case AND:
				case BEGIN:
				case BREAK:
				case CHAR:
				case CONTINUE:
				case COS:
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
				case PRINTF:
				case RETURN:
				case SCANF:
				case SIN:
				case STRING:
				case STRLEN:
				case SUB:
				case TAN:
				case VOID:
				case WHILE:
				case 65:
				case 66:
				case 67:
				case 69:
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
			case ABS:
			case COS:
			case SIN:
			case STRLEN:
			case TAN:
				{
				alt1=2;
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:9: '(' ! term ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal7=(Token)match(input,64,FOLLOW_64_in_group978); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_group981);
					term8=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term8.getTree());

					char_literal9=(Token)match(input,65,FOLLOW_65_in_group983); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_group990);
					func_call10=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call10.getTree());

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:130:5: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_group997); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER11_tree = (Object)adaptor.create(NUMBER11);
					adaptor.addChild(root_0, NUMBER11_tree);
					}

					}
					break;
				case 4 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:131:5: STR
					{
					root_0 = (Object)adaptor.nil();


					STR12=(Token)match(input,STR,FOLLOW_STR_in_group1003); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR12_tree = (Object)adaptor.create(STR12);
					adaptor.addChild(root_0, STR12_tree);
					}

					}
					break;
				case 5 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:132:5: CHR
					{
					root_0 = (Object)adaptor.nil();


					CHR13=(Token)match(input,CHR,FOLLOW_CHR_in_group1009); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHR13_tree = (Object)adaptor.create(CHR13);
					adaptor.addChild(root_0, CHR13_tree);
					}

					}
					break;
				case 6 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:133:5: array_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_call_in_group1015);
					array_call14=array_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call14.getTree());

					}
					break;
				case 7 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:134:5: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_group1021); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT15_tree = (Object)adaptor.create(IDENT15);
					adaptor.addChild(root_0, IDENT15_tree);
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:1: mult : group ( ( MUL | DIV | MOD ) ^ group )* ;
	public final CGrammarParser.mult_return mult() throws RecognitionException {
		CGrammarParser.mult_return retval = new CGrammarParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set17=null;
		ParserRuleReturnScope group16 =null;
		ParserRuleReturnScope group18 =null;

		Object set17_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:6: ( group ( ( MUL | DIV | MOD ) ^ group )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:8: group ( ( MUL | DIV | MOD ) ^ group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_group_in_mult1034);
			group16=group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, group16.getTree());

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:14: ( ( MUL | DIV | MOD ) ^ group )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DIV||LA2_0==MOD||LA2_0==MUL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:16: ( MUL | DIV | MOD ) ^ group
					{
					set17=input.LT(1);
					set17=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MOD||input.LA(1)==MUL ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set17), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_group_in_mult1053);
					group18=group();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, group18.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:1: add : mult ( ( ADD | SUB ) ^ mult )* ;
	public final CGrammarParser.add_return add() throws RecognitionException {
		CGrammarParser.add_return retval = new CGrammarParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;
		ParserRuleReturnScope mult19 =null;
		ParserRuleReturnScope mult21 =null;

		Object set20_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:5: ( mult ( ( ADD | SUB ) ^ mult )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:7: mult ( ( ADD | SUB ) ^ mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add1064);
			mult19=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult19.getTree());

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:13: ( ( ADD | SUB ) ^ mult )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ADD||LA3_0==SUB) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:15: ( ADD | SUB ) ^ mult
					{
					set20=input.LT(1);
					set20=input.LT(1);
					if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set20), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add1080);
					mult21=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult21.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:1: term : add ;
	public final CGrammarParser.term_return term() throws RecognitionException {
		CGrammarParser.term_return retval = new CGrammarParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope add22 =null;


		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:6: ( add )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:8: add
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_term1091);
			add22=add();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, add22.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:1: compare : term ( ME | LE | EQ | NE | LT | MT ) ^ term ;
	public final CGrammarParser.compare_return compare() throws RecognitionException {
		CGrammarParser.compare_return retval = new CGrammarParser.compare_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set24=null;
		ParserRuleReturnScope term23 =null;
		ParserRuleReturnScope term25 =null;

		Object set24_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:9: ( term ( ME | LE | EQ | NE | LT | MT ) ^ term )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:11: term ( ME | LE | EQ | NE | LT | MT ) ^ term
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_compare1100);
			term23=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term23.getTree());

			set24=input.LT(1);
			set24=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= LE && input.LA(1) <= ME)||input.LA(1)==MT||input.LA(1)==NE ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set24), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_term_in_compare1129);
			term25=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term25.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:1: compare_group : ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !);
	public final CGrammarParser.compare_group_return compare_group() throws RecognitionException {
		CGrammarParser.compare_group_return retval = new CGrammarParser.compare_group_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal26=null;
		Token char_literal28=null;
		Token NOT30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope compare27 =null;
		ParserRuleReturnScope compare29 =null;
		ParserRuleReturnScope compare32 =null;

		Object char_literal26_tree=null;
		Object char_literal28_tree=null;
		Object NOT30_tree=null;
		Object char_literal31_tree=null;
		Object char_literal33_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:143:2: ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !)
			int alt4=3;
			switch ( input.LA(1) ) {
			case 64:
				{
				int LA4_1 = input.LA(2);
				if ( (synpred26_CGrammar()) ) {
					alt4=1;
				}
				else if ( (synpred27_CGrammar()) ) {
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
			case ABS:
			case CHR:
			case COS:
			case IDENT:
			case NUMBER:
			case SIN:
			case STR:
			case STRLEN:
			case TAN:
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:143:4: '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal26=(Token)match(input,64,FOLLOW_64_in_compare_group1138); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1141);
					compare27=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare27.getTree());

					char_literal28=(Token)match(input,65,FOLLOW_65_in_compare_group1143); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:144:5: compare
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compare_in_compare_group1150);
					compare29=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare29.getTree());

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:5: NOT ^ '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					NOT30=(Token)match(input,NOT,FOLLOW_NOT_in_compare_group1156); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT30_tree = (Object)adaptor.create(NOT30);
					root_0 = (Object)adaptor.becomeRoot(NOT30_tree, root_0);
					}

					char_literal31=(Token)match(input,64,FOLLOW_64_in_compare_group1159); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1162);
					compare32=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare32.getTree());

					char_literal33=(Token)match(input,65,FOLLOW_65_in_compare_group1164); if (state.failed) return retval;
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:1: and_logic : compare_group ( AND ^ compare_group )* ;
	public final CGrammarParser.and_logic_return and_logic() throws RecognitionException {
		CGrammarParser.and_logic_return retval = new CGrammarParser.and_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND35=null;
		ParserRuleReturnScope compare_group34 =null;
		ParserRuleReturnScope compare_group36 =null;

		Object AND35_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:147:2: ( compare_group ( AND ^ compare_group )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:147:4: compare_group ( AND ^ compare_group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_compare_group_in_and_logic1174);
			compare_group34=compare_group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_group34.getTree());

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:147:18: ( AND ^ compare_group )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AND) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:147:19: AND ^ compare_group
					{
					AND35=(Token)match(input,AND,FOLLOW_AND_in_and_logic1177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND35_tree = (Object)adaptor.create(AND35);
					root_0 = (Object)adaptor.becomeRoot(AND35_tree, root_0);
					}

					pushFollow(FOLLOW_compare_group_in_and_logic1180);
					compare_group36=compare_group();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_group36.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:1: or_logic : and_logic ( OR ^ and_logic )* ;
	public final CGrammarParser.or_logic_return or_logic() throws RecognitionException {
		CGrammarParser.or_logic_return retval = new CGrammarParser.or_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR38=null;
		ParserRuleReturnScope and_logic37 =null;
		ParserRuleReturnScope and_logic39 =null;

		Object OR38_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:9: ( and_logic ( OR ^ and_logic )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:11: and_logic ( OR ^ and_logic )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_logic_in_or_logic1189);
			and_logic37=and_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic37.getTree());

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:21: ( OR ^ and_logic )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:148:22: OR ^ and_logic
					{
					OR38=(Token)match(input,OR,FOLLOW_OR_in_or_logic1192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR38_tree = (Object)adaptor.create(OR38);
					root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);
					}

					pushFollow(FOLLOW_and_logic_in_or_logic1195);
					and_logic39=and_logic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic39.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:1: simple_var : IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) ;
	public final CGrammarParser.simple_var_return simple_var() throws RecognitionException {
		CGrammarParser.simple_var_return retval = new CGrammarParser.simple_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT40=null;
		Token ASSIGN41=null;
		ParserRuleReturnScope term42 =null;

		Object IDENT40_tree=null;
		Object ASSIGN41_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:2: ( IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:4: IDENT ( ASSIGN term )?
			{
			IDENT40=(Token)match(input,IDENT,FOLLOW_IDENT_in_simple_var1207); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT40);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:10: ( ASSIGN term )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:11: ASSIGN term
					{
					ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simple_var1210); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN41);

					pushFollow(FOLLOW_term_in_simple_var1212);
					term42=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term42.getTree());
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
			// 151:25: -> ^( IDENT ( term )? )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:28: ^( IDENT ( term )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:36: ( term )?
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:1: array_var1 : IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) ;
	public final CGrammarParser.array_var1_return array_var1() throws RecognitionException {
		CGrammarParser.array_var1_return retval = new CGrammarParser.array_var1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT43=null;
		Token char_literal44=null;
		Token char_literal46=null;
		Token ASSIGN47=null;
		Token BEGIN48=null;
		Token char_literal50=null;
		Token END52=null;
		ParserRuleReturnScope term45 =null;
		ParserRuleReturnScope term49 =null;
		ParserRuleReturnScope term51 =null;

		Object IDENT43_tree=null;
		Object char_literal44_tree=null;
		Object char_literal46_tree=null;
		Object ASSIGN47_tree=null;
		Object BEGIN48_tree=null;
		Object char_literal50_tree=null;
		Object END52_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:2: ( IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:4: IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT43=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var11232); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT43);

			char_literal44=(Token)match(input,68,FOLLOW_68_in_array_var11234); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal44);

			pushFollow(FOLLOW_term_in_array_var11236);
			term45=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term45.getTree());
			char_literal46=(Token)match(input,69,FOLLOW_69_in_array_var11238); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(char_literal46);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:23: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:24: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var11241); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN47);

					BEGIN48=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var11243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN48);

					pushFollow(FOLLOW_term_in_array_var11245);
					term49=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term49.getTree());
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:42: ( ',' term )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==66) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:154:43: ',' term
							{
							char_literal50=(Token)match(input,66,FOLLOW_66_in_array_var11248); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_66.add(char_literal50);

							pushFollow(FOLLOW_term_in_array_var11250);
							term51=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term51.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					END52=(Token)match(input,END,FOLLOW_END_in_array_var11254); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END52);

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
			// 155:18: -> ^( ARRAY IDENT ( term )* )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:21: ^( ARRAY IDENT ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:35: ( term )*
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
	// $ANTLR end "array_var1"


	public static class array_var2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_var2"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:1: array_var2 : IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) ;
	public final CGrammarParser.array_var2_return array_var2() throws RecognitionException {
		CGrammarParser.array_var2_return retval = new CGrammarParser.array_var2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT53=null;
		Token char_literal54=null;
		Token char_literal55=null;
		Token ASSIGN56=null;
		Token BEGIN57=null;
		Token char_literal59=null;
		Token END61=null;
		ParserRuleReturnScope term58 =null;
		ParserRuleReturnScope term60 =null;

		Object IDENT53_tree=null;
		Object char_literal54_tree=null;
		Object char_literal55_tree=null;
		Object ASSIGN56_tree=null;
		Object BEGIN57_tree=null;
		Object char_literal59_tree=null;
		Object END61_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:2: ( IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:4: IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var21294); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT53);

			char_literal54=(Token)match(input,68,FOLLOW_68_in_array_var21296); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_68.add(char_literal54);

			char_literal55=(Token)match(input,69,FOLLOW_69_in_array_var21298); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_69.add(char_literal55);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:18: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASSIGN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:19: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN56=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var21301); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN56);

					BEGIN57=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var21303); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN57);

					pushFollow(FOLLOW_term_in_array_var21305);
					term58=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term58.getTree());
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:37: ( ',' term )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==66) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:159:38: ',' term
							{
							char_literal59=(Token)match(input,66,FOLLOW_66_in_array_var21308); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_66.add(char_literal59);

							pushFollow(FOLLOW_term_in_array_var21310);
							term60=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term60.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					END61=(Token)match(input,END,FOLLOW_END_in_array_var21314); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END61);

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
			// 160:18: -> ^( ARRAY IDENT ( term )* )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:21: ^( ARRAY IDENT ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:35: ( term )*
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
	// $ANTLR end "array_var2"


	public static class array_var_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_var"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:1: array_var : ( array_var1 | array_var2 );
	public final CGrammarParser.array_var_return array_var() throws RecognitionException {
		CGrammarParser.array_var_return retval = new CGrammarParser.array_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_var162 =null;
		ParserRuleReturnScope array_var263 =null;


		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:10: ( array_var1 | array_var2 )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==68) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==69) ) {
						alt12=2;
					}
					else if ( (LA12_2==ABS||LA12_2==CHR||LA12_2==COS||LA12_2==IDENT||LA12_2==NUMBER||LA12_2==SIN||LA12_2==STR||LA12_2==STRLEN||LA12_2==TAN||LA12_2==64) ) {
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:17: array_var1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var1_in_array_var1356);
					array_var162=array_var1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var162.getTree());

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:30: array_var2
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var2_in_array_var1360);
					array_var263=array_var2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var263.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:1: var_name : ( simple_var | array_var );
	public final CGrammarParser.var_name_return var_name() throws RecognitionException {
		CGrammarParser.var_name_return retval = new CGrammarParser.var_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simple_var64 =null;
		ParserRuleReturnScope array_var65 =null;


		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:9: ( simple_var | array_var )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==68) ) {
					alt13=2;
				}
				else if ( (LA13_1==EOF||LA13_1==ASSIGN||(LA13_1 >= 65 && LA13_1 <= 67)) ) {
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:11: simple_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_var_in_var_name1368);
					simple_var64=simple_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_var64.getTree());

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:164:24: array_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var_in_var_name1372);
					array_var65=array_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var65.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:1: var_expr : type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) ;
	public final CGrammarParser.var_expr_return var_expr() throws RecognitionException {
		CGrammarParser.var_expr_return retval = new CGrammarParser.var_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope var_name67 =null;
		ParserRuleReturnScope var_name69 =null;

		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_var_name=new RewriteRuleSubtreeStream(adaptor,"rule var_name");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:9: ( type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:11: type var_name ( ',' var_name )*
			{
			pushFollow(FOLLOW_type_in_var_expr1381);
			type66=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type66.getTree());
			pushFollow(FOLLOW_var_name_in_var_expr1383);
			var_name67=var_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_var_name.add(var_name67.getTree());
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:25: ( ',' var_name )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==66) ) {
					int LA14_2 = input.LA(2);
					if ( (synpred37_CGrammar()) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:27: ',' var_name
					{
					char_literal68=(Token)match(input,66,FOLLOW_66_in_var_expr1387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(char_literal68);

					pushFollow(FOLLOW_var_name_in_var_expr1389);
					var_name69=var_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_var_name.add(var_name69.getTree());
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
			// 167:3: -> ^( VARDECL ( ^( type var_name ) )* )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:6: ^( VARDECL ( ^( type var_name ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:16: ( ^( type var_name ) )*
				while ( stream_type.hasNext()||stream_var_name.hasNext() ) {
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:167:16: ^( type var_name )
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:1: if_expr : IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) ;
	public final CGrammarParser.if_expr_return if_expr() throws RecognitionException {
		CGrammarParser.if_expr_return retval = new CGrammarParser.if_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF70=null;
		Token ELSE73=null;
		ParserRuleReturnScope or_logic71 =null;
		ParserRuleReturnScope expr72 =null;
		ParserRuleReturnScope expr74 =null;

		Object IF70_tree=null;
		Object ELSE73_tree=null;
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:9: ( IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:11: IF or_logic expr ( ELSE expr )?
			{
			IF70=(Token)match(input,IF,FOLLOW_IF_in_if_expr1419); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF70);

			pushFollow(FOLLOW_or_logic_in_if_expr1421);
			or_logic71=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic71.getTree());
			pushFollow(FOLLOW_expr_in_if_expr1423);
			expr72=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:28: ( ELSE expr )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ELSE) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred38_CGrammar()) ) {
					alt15=1;
				}
			}
			switch (alt15) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:29: ELSE expr
					{
					ELSE73=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr1426); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE73);

					pushFollow(FOLLOW_expr_in_if_expr1428);
					expr74=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr74.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expr, expr, IF, or_logic
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 169:41: -> ^( IF or_logic expr ( expr )? )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:44: ^( IF or_logic expr ( expr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_or_logic.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:63: ( expr )?
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:171:1: while_expr : WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) ;
	public final CGrammarParser.while_expr_return while_expr() throws RecognitionException {
		CGrammarParser.while_expr_return retval = new CGrammarParser.while_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		ParserRuleReturnScope or_logic77 =null;
		ParserRuleReturnScope expr79 =null;

		Object WHILE75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:2: ( WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:4: WHILE '(' or_logic ')' expr
			{
			WHILE75=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_expr1452); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE75);

			char_literal76=(Token)match(input,64,FOLLOW_64_in_while_expr1454); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal76);

			pushFollow(FOLLOW_or_logic_in_while_expr1456);
			or_logic77=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic77.getTree());
			char_literal78=(Token)match(input,65,FOLLOW_65_in_while_expr1458); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal78);

			pushFollow(FOLLOW_expr_in_while_expr1460);
			expr79=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());
			// AST REWRITE
			// elements: or_logic, expr, WHILE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 172:32: -> ^( WHILE or_logic expr )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:35: ^( WHILE or_logic expr )
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:1: for_expr : FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr ;
	public final CGrammarParser.for_expr_return for_expr() throws RecognitionException {
		CGrammarParser.for_expr_return retval = new CGrammarParser.for_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FOR80=null;
		Token char_literal81=null;
		Token char_literal83=null;
		Token char_literal85=null;
		Token char_literal87=null;
		ParserRuleReturnScope uexpr82 =null;
		ParserRuleReturnScope or_logic84 =null;
		ParserRuleReturnScope uexpr86 =null;
		ParserRuleReturnScope expr88 =null;

		Object FOR80_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		Object char_literal85_tree=null;
		Object char_literal87_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:9: ( FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:11: FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr
			{
			root_0 = (Object)adaptor.nil();


			FOR80=(Token)match(input,FOR,FOLLOW_FOR_in_for_expr1478); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FOR80_tree = (Object)adaptor.create(FOR80);
			root_0 = (Object)adaptor.becomeRoot(FOR80_tree, root_0);
			}

			char_literal81=(Token)match(input,64,FOLLOW_64_in_for_expr1481); if (state.failed) return retval;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:21: ( uexpr )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ABS||(LA16_0 >= BREAK && LA16_0 <= CHAR)||(LA16_0 >= CONTINUE && LA16_0 <= COS)||(LA16_0 >= DO && LA16_0 <= DOUBLE)||LA16_0==FOR||(LA16_0 >= IDENT && LA16_0 <= INT)||LA16_0==PRINTF||(LA16_0 >= RETURN && LA16_0 <= SIN)||(LA16_0 >= STRING && LA16_0 <= STRLEN)||LA16_0==TAN||(LA16_0 >= VOID && LA16_0 <= WHILE)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:21: uexpr
					{
					pushFollow(FOLLOW_uexpr_in_for_expr1484);
					uexpr82=uexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uexpr82.getTree());

					}
					break;

			}

			char_literal83=(Token)match(input,67,FOLLOW_67_in_for_expr1487); if (state.failed) return retval;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:33: ( or_logic )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ABS||LA17_0==CHR||LA17_0==COS||LA17_0==IDENT||(LA17_0 >= NOT && LA17_0 <= NUMBER)||LA17_0==SIN||LA17_0==STR||LA17_0==STRLEN||LA17_0==TAN||LA17_0==64) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:33: or_logic
					{
					pushFollow(FOLLOW_or_logic_in_for_expr1490);
					or_logic84=or_logic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, or_logic84.getTree());

					}
					break;

			}

			char_literal85=(Token)match(input,67,FOLLOW_67_in_for_expr1493); if (state.failed) return retval;
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:48: ( uexpr )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ABS||(LA18_0 >= BREAK && LA18_0 <= CHAR)||(LA18_0 >= CONTINUE && LA18_0 <= COS)||(LA18_0 >= DO && LA18_0 <= DOUBLE)||LA18_0==FOR||(LA18_0 >= IDENT && LA18_0 <= INT)||LA18_0==PRINTF||(LA18_0 >= RETURN && LA18_0 <= SIN)||(LA18_0 >= STRING && LA18_0 <= STRLEN)||LA18_0==TAN||(LA18_0 >= VOID && LA18_0 <= WHILE)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:48: uexpr
					{
					pushFollow(FOLLOW_uexpr_in_for_expr1496);
					uexpr86=uexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uexpr86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,65,FOLLOW_65_in_for_expr1499); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_for_expr1502);
			expr88=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expr88.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:1: do_while : DO expr WHILE '(' or_logic ')' -> ^( DOWHILE expr or_logic ) ;
	public final CGrammarParser.do_while_return do_while() throws RecognitionException {
		CGrammarParser.do_while_return retval = new CGrammarParser.do_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO89=null;
		Token WHILE91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		ParserRuleReturnScope expr90 =null;
		ParserRuleReturnScope or_logic93 =null;

		Object DO89_tree=null;
		Object WHILE91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:9: ( DO expr WHILE '(' or_logic ')' -> ^( DOWHILE expr or_logic ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:11: DO expr WHILE '(' or_logic ')'
			{
			DO89=(Token)match(input,DO,FOLLOW_DO_in_do_while1512); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DO.add(DO89);

			pushFollow(FOLLOW_expr_in_do_while1514);
			expr90=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());
			WHILE91=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while1516); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE91);

			char_literal92=(Token)match(input,64,FOLLOW_64_in_do_while1518); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal92);

			pushFollow(FOLLOW_or_logic_in_do_while1520);
			or_logic93=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic93.getTree());
			char_literal94=(Token)match(input,65,FOLLOW_65_in_do_while1522); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal94);

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
			// 178:42: -> ^( DOWHILE expr or_logic )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:45: ^( DOWHILE expr or_logic )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_or_logic.nextTree());
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:180:1: return_expr : RETURN ^ ( term )? ;
	public final CGrammarParser.return_expr_return return_expr() throws RecognitionException {
		CGrammarParser.return_expr_return retval = new CGrammarParser.return_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN95=null;
		ParserRuleReturnScope term96 =null;

		Object RETURN95_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:2: ( RETURN ^ ( term )? )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:4: RETURN ^ ( term )?
			{
			root_0 = (Object)adaptor.nil();


			RETURN95=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_expr1541); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RETURN95_tree = (Object)adaptor.create(RETURN95);
			root_0 = (Object)adaptor.becomeRoot(RETURN95_tree, root_0);
			}

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:12: ( term )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ABS||LA19_0==CHR||LA19_0==COS||LA19_0==IDENT||LA19_0==NUMBER||LA19_0==SIN||LA19_0==STR||LA19_0==STRLEN||LA19_0==TAN||LA19_0==64) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:12: term
					{
					pushFollow(FOLLOW_term_in_return_expr1544);
					term96=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term96.getTree());

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


	public static class print_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_expr"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:183:1: print_expr : PRINTF '(' STR ( ',' term )* ')' -> ^( PRINTF ^( STR ( term )* ) ) ;
	public final CGrammarParser.print_expr_return print_expr() throws RecognitionException {
		CGrammarParser.print_expr_return retval = new CGrammarParser.print_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINTF97=null;
		Token char_literal98=null;
		Token STR99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		ParserRuleReturnScope term101 =null;

		Object PRINTF97_tree=null;
		Object char_literal98_tree=null;
		Object STR99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		RewriteRuleTokenStream stream_PRINTF=new RewriteRuleTokenStream(adaptor,"token PRINTF");
		RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:2: ( PRINTF '(' STR ( ',' term )* ')' -> ^( PRINTF ^( STR ( term )* ) ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:4: PRINTF '(' STR ( ',' term )* ')'
			{
			PRINTF97=(Token)match(input,PRINTF,FOLLOW_PRINTF_in_print_expr1555); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PRINTF.add(PRINTF97);

			char_literal98=(Token)match(input,64,FOLLOW_64_in_print_expr1557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal98);

			STR99=(Token)match(input,STR,FOLLOW_STR_in_print_expr1559); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STR.add(STR99);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:19: ( ',' term )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==66) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:21: ',' term
					{
					char_literal100=(Token)match(input,66,FOLLOW_66_in_print_expr1563); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(char_literal100);

					pushFollow(FOLLOW_term_in_print_expr1565);
					term101=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term101.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			char_literal102=(Token)match(input,65,FOLLOW_65_in_print_expr1570); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal102);

			// AST REWRITE
			// elements: term, PRINTF, STR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 185:3: -> ^( PRINTF ^( STR ( term )* ) )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:185:6: ^( PRINTF ^( STR ( term )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_PRINTF.nextNode(), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:185:15: ^( STR ( term )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_STR.nextNode(), root_2);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:185:22: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_2, stream_term.nextTree());
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
	// $ANTLR end "print_expr"


	public static class scan_args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scan_args"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:1: scan_args : ( IDENT | array_call );
	public final CGrammarParser.scan_args_return scan_args() throws RecognitionException {
		CGrammarParser.scan_args_return retval = new CGrammarParser.scan_args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT103=null;
		ParserRuleReturnScope array_call104 =null;

		Object IDENT103_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:10: ( IDENT | array_call )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==IDENT) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==68) ) {
					alt21=2;
				}
				else if ( (LA21_1==EOF||(LA21_1 >= 65 && LA21_1 <= 66)) ) {
					alt21=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:12: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT103=(Token)match(input,IDENT,FOLLOW_IDENT_in_scan_args1599); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT103_tree = (Object)adaptor.create(IDENT103);
					adaptor.addChild(root_0, IDENT103_tree);
					}

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:20: array_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_call_in_scan_args1603);
					array_call104=array_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call104.getTree());

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
	// $ANTLR end "scan_args"


	public static class scan_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "scan_expr"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:190:1: scan_expr : SCANF '(' STR ( ',' scan_args )* ')' -> ^( SCANF ^( STR ( scan_args )* ) ) ;
	public final CGrammarParser.scan_expr_return scan_expr() throws RecognitionException {
		CGrammarParser.scan_expr_return retval = new CGrammarParser.scan_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SCANF105=null;
		Token char_literal106=null;
		Token STR107=null;
		Token char_literal108=null;
		Token char_literal110=null;
		ParserRuleReturnScope scan_args109 =null;

		Object SCANF105_tree=null;
		Object char_literal106_tree=null;
		Object STR107_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		RewriteRuleTokenStream stream_STR=new RewriteRuleTokenStream(adaptor,"token STR");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_SCANF=new RewriteRuleTokenStream(adaptor,"token SCANF");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_scan_args=new RewriteRuleSubtreeStream(adaptor,"rule scan_args");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:2: ( SCANF '(' STR ( ',' scan_args )* ')' -> ^( SCANF ^( STR ( scan_args )* ) ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:4: SCANF '(' STR ( ',' scan_args )* ')'
			{
			SCANF105=(Token)match(input,SCANF,FOLLOW_SCANF_in_scan_expr1613); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SCANF.add(SCANF105);

			char_literal106=(Token)match(input,64,FOLLOW_64_in_scan_expr1615); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal106);

			STR107=(Token)match(input,STR,FOLLOW_STR_in_scan_expr1617); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STR.add(STR107);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:18: ( ',' scan_args )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==66) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:20: ',' scan_args
					{
					char_literal108=(Token)match(input,66,FOLLOW_66_in_scan_expr1621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(char_literal108);

					pushFollow(FOLLOW_scan_args_in_scan_expr1623);
					scan_args109=scan_args();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scan_args.add(scan_args109.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			char_literal110=(Token)match(input,65,FOLLOW_65_in_scan_expr1628); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal110);

			// AST REWRITE
			// elements: SCANF, scan_args, STR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 192:3: -> ^( SCANF ^( STR ( scan_args )* ) )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:192:6: ^( SCANF ^( STR ( scan_args )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_SCANF.nextNode(), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:192:14: ^( STR ( scan_args )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_STR.nextNode(), root_2);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:192:21: ( scan_args )*
				while ( stream_scan_args.hasNext() ) {
					adaptor.addChild(root_2, stream_scan_args.nextTree());
				}
				stream_scan_args.reset();

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
	// $ANTLR end "scan_expr"


	public static class sexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sexpr"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:195:1: sexpr : ( var_expr | BREAK | CONTINUE | return_expr | print_expr | scan_expr | func_call | ( array_call | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while );
	public final CGrammarParser.sexpr_return sexpr() throws RecognitionException {
		CGrammarParser.sexpr_return retval = new CGrammarParser.sexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BREAK112=null;
		Token CONTINUE113=null;
		Token IDENT119=null;
		Token IDENT122=null;
		Token ASSIGN123=null;
		Token BEGIN124=null;
		Token char_literal126=null;
		Token END128=null;
		ParserRuleReturnScope var_expr111 =null;
		ParserRuleReturnScope return_expr114 =null;
		ParserRuleReturnScope print_expr115 =null;
		ParserRuleReturnScope scan_expr116 =null;
		ParserRuleReturnScope func_call117 =null;
		ParserRuleReturnScope array_call118 =null;
		ParserRuleReturnScope assign120 =null;
		ParserRuleReturnScope term121 =null;
		ParserRuleReturnScope term125 =null;
		ParserRuleReturnScope term127 =null;
		ParserRuleReturnScope do_while129 =null;

		Object BREAK112_tree=null;
		Object CONTINUE113_tree=null;
		Object IDENT119_tree=null;
		Object IDENT122_tree=null;
		Object ASSIGN123_tree=null;
		Object BEGIN124_tree=null;
		Object char_literal126_tree=null;
		Object END128_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:195:7: ( var_expr | BREAK | CONTINUE | return_expr | print_expr | scan_expr | func_call | ( array_call | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while )
			int alt25=10;
			switch ( input.LA(1) ) {
			case CHAR:
			case DOUBLE:
			case INT:
			case STRING:
			case VOID:
				{
				alt25=1;
				}
				break;
			case BREAK:
				{
				alt25=2;
				}
				break;
			case CONTINUE:
				{
				alt25=3;
				}
				break;
			case RETURN:
				{
				alt25=4;
				}
				break;
			case PRINTF:
				{
				alt25=5;
				}
				break;
			case SCANF:
				{
				alt25=6;
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
				case 68:
					{
					alt25=8;
					}
					break;
				case ASSIGN:
					{
					int LA25_11 = input.LA(3);
					if ( (LA25_11==BEGIN) ) {
						alt25=9;
					}
					else if ( (LA25_11==ABS||LA25_11==CHR||LA25_11==COS||LA25_11==IDENT||LA25_11==NUMBER||LA25_11==SIN||LA25_11==STR||LA25_11==STRLEN||LA25_11==TAN||LA25_11==64) ) {
						alt25=8;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 25, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 64:
					{
					alt25=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ABS:
			case COS:
			case SIN:
			case STRLEN:
			case TAN:
				{
				alt25=7;
				}
				break;
			case DO:
				{
				alt25=10;
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:195:9: var_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_expr_in_sexpr1657);
					var_expr111=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr111.getTree());

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:5: BREAK
					{
					root_0 = (Object)adaptor.nil();


					BREAK112=(Token)match(input,BREAK,FOLLOW_BREAK_in_sexpr1663); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BREAK112_tree = (Object)adaptor.create(BREAK112);
					adaptor.addChild(root_0, BREAK112_tree);
					}

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:197:5: CONTINUE
					{
					root_0 = (Object)adaptor.nil();


					CONTINUE113=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_sexpr1669); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONTINUE113_tree = (Object)adaptor.create(CONTINUE113);
					adaptor.addChild(root_0, CONTINUE113_tree);
					}

					}
					break;
				case 4 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:198:5: return_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return_expr_in_sexpr1675);
					return_expr114=return_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, return_expr114.getTree());

					}
					break;
				case 5 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:199:5: print_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_expr_in_sexpr1681);
					print_expr115=print_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, print_expr115.getTree());

					}
					break;
				case 6 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:5: scan_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_scan_expr_in_sexpr1687);
					scan_expr116=scan_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scan_expr116.getTree());

					}
					break;
				case 7 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:201:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_sexpr1693);
					func_call117=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call117.getTree());

					}
					break;
				case 8 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:5: ( array_call | IDENT ) assign ^ term
					{
					root_0 = (Object)adaptor.nil();


					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:5: ( array_call | IDENT )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==IDENT) ) {
						int LA23_1 = input.LA(2);
						if ( (LA23_1==68) ) {
							alt23=1;
						}
						else if ( (LA23_1==ADD_ASSIGN||LA23_1==ASSIGN||LA23_1==DIV_ASSIGN||LA23_1==MOD_ASSIGN||LA23_1==MUL_ASSIGN||LA23_1==SUB_ASSIGN) ) {
							alt23=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 23, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:6: array_call
							{
							pushFollow(FOLLOW_array_call_in_sexpr1700);
							array_call118=array_call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call118.getTree());

							}
							break;
						case 2 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:19: IDENT
							{
							IDENT119=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1704); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENT119_tree = (Object)adaptor.create(IDENT119);
							adaptor.addChild(root_0, IDENT119_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_assign_in_sexpr1707);
					assign120=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assign120.getTree(), root_0);
					pushFollow(FOLLOW_term_in_sexpr1710);
					term121=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term121.getTree());

					}
					break;
				case 9 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:19: IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !
					{
					root_0 = (Object)adaptor.nil();


					IDENT122=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1730); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT122_tree = (Object)adaptor.create(IDENT122);
					adaptor.addChild(root_0, IDENT122_tree);
					}

					ASSIGN123=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_sexpr1732); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN123_tree = (Object)adaptor.create(ASSIGN123);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN123_tree, root_0);
					}

					BEGIN124=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_sexpr1735); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_sexpr1738);
					term125=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term125.getTree());

					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:45: ( ',' ! term )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==66) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:46: ',' ! term
							{
							char_literal126=(Token)match(input,66,FOLLOW_66_in_sexpr1741); if (state.failed) return retval;
							pushFollow(FOLLOW_term_in_sexpr1744);
							term127=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, term127.getTree());

							}
							break;

						default :
							break loop24;
						}
					}

					END128=(Token)match(input,END,FOLLOW_END_in_sexpr1748); if (state.failed) return retval;
					}
					break;
				case 10 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:204:5: do_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_do_while_in_sexpr1755);
					do_while129=do_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while129.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:1: cexpr : ( if_expr | while_expr | for_expr );
	public final CGrammarParser.cexpr_return cexpr() throws RecognitionException {
		CGrammarParser.cexpr_return retval = new CGrammarParser.cexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_expr130 =null;
		ParserRuleReturnScope while_expr131 =null;
		ParserRuleReturnScope for_expr132 =null;


		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:7: ( if_expr | while_expr | for_expr )
			int alt26=3;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt26=1;
				}
				break;
			case WHILE:
				{
				alt26=2;
				}
				break;
			case FOR:
				{
				alt26=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:9: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_cexpr1766);
					if_expr130=if_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr130.getTree());

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:207:5: while_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_expr_in_cexpr1772);
					while_expr131=while_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_expr131.getTree());

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:208:5: for_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for_expr_in_cexpr1778);
					for_expr132=for_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr132.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:1: expr : ( sexpr ( ';' !)+ | cexpr | block_expr );
	public final CGrammarParser.expr_return expr() throws RecognitionException {
		CGrammarParser.expr_return retval = new CGrammarParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal134=null;
		ParserRuleReturnScope sexpr133 =null;
		ParserRuleReturnScope cexpr135 =null;
		ParserRuleReturnScope block_expr136 =null;

		Object char_literal134_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:6: ( sexpr ( ';' !)+ | cexpr | block_expr )
			int alt28=3;
			switch ( input.LA(1) ) {
			case ABS:
			case BREAK:
			case CHAR:
			case CONTINUE:
			case COS:
			case DO:
			case DOUBLE:
			case IDENT:
			case INT:
			case PRINTF:
			case RETURN:
			case SCANF:
			case SIN:
			case STRING:
			case STRLEN:
			case TAN:
			case VOID:
				{
				alt28=1;
				}
				break;
			case FOR:
			case IF:
			case WHILE:
				{
				alt28=2;
				}
				break;
			case BEGIN:
				{
				alt28=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:8: sexpr ( ';' !)+
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sexpr_in_expr1787);
					sexpr133=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr133.getTree());

					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:14: ( ';' !)+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==67) ) {
							int LA27_3 = input.LA(2);
							if ( (synpred59_CGrammar()) ) {
								alt27=1;
							}

						}

						switch (alt27) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:15: ';' !
							{
							char_literal134=(Token)match(input,67,FOLLOW_67_in_expr1790); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:5: cexpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cexpr_in_expr1799);
					cexpr135=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr135.getTree());

					}
					break;
				case 3 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:212:5: block_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_expr_in_expr1805);
					block_expr136=block_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block_expr136.getTree());

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:1: uexpr : ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )* ;
	public final CGrammarParser.uexpr_return uexpr() throws RecognitionException {
		CGrammarParser.uexpr_return retval = new CGrammarParser.uexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal139=null;
		ParserRuleReturnScope sexpr137 =null;
		ParserRuleReturnScope cexpr138 =null;
		ParserRuleReturnScope sexpr140 =null;
		ParserRuleReturnScope cexpr141 =null;

		Object char_literal139_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:7: ( ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:10: ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:10: ( sexpr | cexpr )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ABS||(LA29_0 >= BREAK && LA29_0 <= CHAR)||(LA29_0 >= CONTINUE && LA29_0 <= COS)||(LA29_0 >= DO && LA29_0 <= DOUBLE)||LA29_0==IDENT||LA29_0==INT||LA29_0==PRINTF||(LA29_0 >= RETURN && LA29_0 <= SIN)||(LA29_0 >= STRING && LA29_0 <= STRLEN)||LA29_0==TAN||LA29_0==VOID) ) {
				alt29=1;
			}
			else if ( (LA29_0==FOR||LA29_0==IF||LA29_0==WHILE) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:11: sexpr
					{
					pushFollow(FOLLOW_sexpr_in_uexpr1817);
					sexpr137=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr137.getTree());

					}
					break;
				case 2 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:19: cexpr
					{
					pushFollow(FOLLOW_cexpr_in_uexpr1821);
					cexpr138=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr138.getTree());

					}
					break;

			}

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:26: ( ',' ! ( sexpr | cexpr ) )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==66) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:27: ',' ! ( sexpr | cexpr )
					{
					char_literal139=(Token)match(input,66,FOLLOW_66_in_uexpr1825); if (state.failed) return retval;
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:32: ( sexpr | cexpr )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==ABS||(LA30_0 >= BREAK && LA30_0 <= CHAR)||(LA30_0 >= CONTINUE && LA30_0 <= COS)||(LA30_0 >= DO && LA30_0 <= DOUBLE)||LA30_0==IDENT||LA30_0==INT||LA30_0==PRINTF||(LA30_0 >= RETURN && LA30_0 <= SIN)||(LA30_0 >= STRING && LA30_0 <= STRLEN)||LA30_0==TAN||LA30_0==VOID) ) {
						alt30=1;
					}
					else if ( (LA30_0==FOR||LA30_0==IF||LA30_0==WHILE) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:33: sexpr
							{
							pushFollow(FOLLOW_sexpr_in_uexpr1829);
							sexpr140=sexpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr140.getTree());

							}
							break;
						case 2 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:214:41: cexpr
							{
							pushFollow(FOLLOW_cexpr_in_uexpr1833);
							cexpr141=cexpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr141.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop31;
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
	// $ANTLR end "uexpr"


	public static class block_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block_expr"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:216:1: block_expr : BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) ;
	public final CGrammarParser.block_expr_return block_expr() throws RecognitionException {
		CGrammarParser.block_expr_return retval = new CGrammarParser.block_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN142=null;
		Token END144=null;
		ParserRuleReturnScope expr143 =null;

		Object BEGIN142_tree=null;
		Object END144_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:2: ( BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:4: BEGIN ( expr )* END
			{
			BEGIN142=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block_expr1848); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN142);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:10: ( expr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ABS||LA32_0==BEGIN||(LA32_0 >= BREAK && LA32_0 <= CHAR)||(LA32_0 >= CONTINUE && LA32_0 <= COS)||(LA32_0 >= DO && LA32_0 <= DOUBLE)||LA32_0==FOR||(LA32_0 >= IDENT && LA32_0 <= INT)||LA32_0==PRINTF||(LA32_0 >= RETURN && LA32_0 <= SIN)||(LA32_0 >= STRING && LA32_0 <= STRLEN)||LA32_0==TAN||(LA32_0 >= VOID && LA32_0 <= WHILE)) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:10: expr
					{
					pushFollow(FOLLOW_expr_in_block_expr1850);
					expr143=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr143.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			END144=(Token)match(input,END,FOLLOW_END_in_block_expr1853); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END144);

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
			// 217:20: -> ^( BLOCK ( expr )* )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:23: ^( BLOCK ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:31: ( expr )*
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:1: ident_arr : ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT );
	public final CGrammarParser.ident_arr_return ident_arr() throws RecognitionException {
		CGrammarParser.ident_arr_return retval = new CGrammarParser.ident_arr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT145=null;
		Token char_literal146=null;
		Token char_literal148=null;
		Token IDENT149=null;
		ParserRuleReturnScope term147 =null;

		Object IDENT145_tree=null;
		Object char_literal146_tree=null;
		Object char_literal148_tree=null;
		Object IDENT149_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:10: ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==IDENT) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==68) ) {
					alt34=1;
				}
				else if ( (LA34_1==EOF||(LA34_1 >= 65 && LA34_1 <= 66)) ) {
					alt34=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:17: IDENT '[' ( term )? ']'
					{
					IDENT145=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1875); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT145);

					char_literal146=(Token)match(input,68,FOLLOW_68_in_ident_arr1877); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal146);

					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:27: ( term )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ABS||LA33_0==CHR||LA33_0==COS||LA33_0==IDENT||LA33_0==NUMBER||LA33_0==SIN||LA33_0==STR||LA33_0==STRLEN||LA33_0==TAN||LA33_0==64) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:27: term
							{
							pushFollow(FOLLOW_term_in_ident_arr1879);
							term147=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term147.getTree());
							}
							break;

					}

					char_literal148=(Token)match(input,69,FOLLOW_69_in_ident_arr1882); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal148);

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
					// 219:37: -> ^( ARRAY IDENT ( term )? )
					{
						// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:40: ^( ARRAY IDENT ( term )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
						adaptor.addChild(root_1, stream_IDENT.nextNode());
						// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:219:54: ( term )?
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
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:220:19: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT149=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1913); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT149_tree = (Object)adaptor.create(IDENT149);
					adaptor.addChild(root_0, IDENT149_tree);
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:222:1: function_var : type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* ;
	public final CGrammarParser.function_var_return function_var() throws RecognitionException {
		CGrammarParser.function_var_return retval = new CGrammarParser.function_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		ParserRuleReturnScope type150 =null;
		ParserRuleReturnScope ident_arr151 =null;
		ParserRuleReturnScope type153 =null;
		ParserRuleReturnScope ident_arr154 =null;

		Object char_literal152_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_ident_arr=new RewriteRuleSubtreeStream(adaptor,"rule ident_arr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:2: ( type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:4: type ident_arr ( ',' type ident_arr )*
			{
			pushFollow(FOLLOW_type_in_function_var1923);
			type150=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type150.getTree());
			pushFollow(FOLLOW_ident_arr_in_function_var1925);
			ident_arr151=ident_arr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr151.getTree());
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:19: ( ',' type ident_arr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==66) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:21: ',' type ident_arr
					{
					char_literal152=(Token)match(input,66,FOLLOW_66_in_function_var1929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(char_literal152);

					pushFollow(FOLLOW_type_in_function_var1931);
					type153=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type153.getTree());
					pushFollow(FOLLOW_ident_arr_in_function_var1933);
					ident_arr154=ident_arr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr154.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: type, ident_arr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 223:43: -> ( ^( type ident_arr ) )*
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:46: ( ^( type ident_arr ) )*
				while ( stream_type.hasNext()||stream_ident_arr.hasNext() ) {
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:223:46: ^( type ident_arr )
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_type.nextNode(), root_1);
					adaptor.addChild(root_1, stream_ident_arr.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_ident_arr.reset();

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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:1: function : type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) ;
	public final CGrammarParser.function_return function() throws RecognitionException {
		CGrammarParser.function_return retval = new CGrammarParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT156=null;
		Token char_literal157=null;
		Token char_literal159=null;
		Token BEGIN160=null;
		Token END162=null;
		ParserRuleReturnScope type155 =null;
		ParserRuleReturnScope function_var158 =null;
		ParserRuleReturnScope expr161 =null;

		Object IDENT156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal159_tree=null;
		Object BEGIN160_tree=null;
		Object END162_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_function_var=new RewriteRuleSubtreeStream(adaptor,"rule function_var");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:9: ( type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:11: type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END
			{
			pushFollow(FOLLOW_type_in_function1955);
			type155=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type155.getTree());
			IDENT156=(Token)match(input,IDENT,FOLLOW_IDENT_in_function1957); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT156);

			char_literal157=(Token)match(input,64,FOLLOW_64_in_function1959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal157);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:26: ( function_var )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==CHAR||LA36_0==DOUBLE||LA36_0==INT||LA36_0==STRING||LA36_0==VOID) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:26: function_var
					{
					pushFollow(FOLLOW_function_var_in_function1961);
					function_var158=function_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function_var.add(function_var158.getTree());
					}
					break;

			}

			char_literal159=(Token)match(input,65,FOLLOW_65_in_function1964); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal159);

			BEGIN160=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function1966); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN160);

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:50: ( expr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==ABS||LA37_0==BEGIN||(LA37_0 >= BREAK && LA37_0 <= CHAR)||(LA37_0 >= CONTINUE && LA37_0 <= COS)||(LA37_0 >= DO && LA37_0 <= DOUBLE)||LA37_0==FOR||(LA37_0 >= IDENT && LA37_0 <= INT)||LA37_0==PRINTF||(LA37_0 >= RETURN && LA37_0 <= SIN)||(LA37_0 >= STRING && LA37_0 <= STRLEN)||LA37_0==TAN||(LA37_0 >= VOID && LA37_0 <= WHILE)) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:225:50: expr
					{
					pushFollow(FOLLOW_expr_in_function1968);
					expr161=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr161.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			END162=(Token)match(input,END,FOLLOW_END_in_function1971); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END162);

			// AST REWRITE
			// elements: function_var, type, expr, IDENT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 226:3: -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:6: ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:24: ^( PARAMS ( function_var )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:33: ( function_var )?
				if ( stream_function_var.hasNext() ) {
					adaptor.addChild(root_2, stream_function_var.nextTree());
				}
				stream_function_var.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:48: ^( BLOCK ( expr )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:226:56: ( expr )*
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:228:1: func_name : ( IDENT | SIN | COS | TAN | ABS | STRLEN );
	public final CGrammarParser.func_name_return func_name() throws RecognitionException {
		CGrammarParser.func_name_return retval = new CGrammarParser.func_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set163=null;

		Object set163_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:229:2: ( IDENT | SIN | COS | TAN | ABS | STRLEN )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set163=input.LT(1);
			if ( input.LA(1)==ABS||input.LA(1)==COS||input.LA(1)==IDENT||input.LA(1)==SIN||input.LA(1)==STRLEN||input.LA(1)==TAN ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set163));
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
	// $ANTLR end "func_name"


	public static class func_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_call"
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:232:1: func_call : func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) ;
	public final CGrammarParser.func_call_return func_call() throws RecognitionException {
		CGrammarParser.func_call_return retval = new CGrammarParser.func_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal165=null;
		Token char_literal167=null;
		ParserRuleReturnScope func_name164 =null;
		ParserRuleReturnScope params_166 =null;

		Object char_literal165_tree=null;
		Object char_literal167_tree=null;
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_params_=new RewriteRuleSubtreeStream(adaptor,"rule params_");
		RewriteRuleSubtreeStream stream_func_name=new RewriteRuleSubtreeStream(adaptor,"rule func_name");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:233:2: ( func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:233:4: func_name '(' params_ ')'
			{
			pushFollow(FOLLOW_func_name_in_func_call2047);
			func_name164=func_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_func_name.add(func_name164.getTree());
			char_literal165=(Token)match(input,64,FOLLOW_64_in_func_call2049); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(char_literal165);

			pushFollow(FOLLOW_params__in_func_call2051);
			params_166=params_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_params_.add(params_166.getTree());
			char_literal167=(Token)match(input,65,FOLLOW_65_in_func_call2053); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(char_literal167);

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
			// 233:30: -> ^( FUNCCALL func_name params_ )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:233:33: ^( FUNCCALL func_name params_ )
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:1: params_ : ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) ;
	public final CGrammarParser.params__return params_() throws RecognitionException {
		CGrammarParser.params__return retval = new CGrammarParser.params__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal169=null;
		ParserRuleReturnScope term168 =null;
		ParserRuleReturnScope term170 =null;

		Object char_literal169_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:9: ( ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:11: ( term ( ',' term )* )?
			{
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:11: ( term ( ',' term )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==ABS||LA39_0==CHR||LA39_0==COS||LA39_0==IDENT||LA39_0==NUMBER||LA39_0==SIN||LA39_0==STR||LA39_0==STRLEN||LA39_0==TAN||LA39_0==64) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:13: term ( ',' term )*
					{
					pushFollow(FOLLOW_term_in_params_2074);
					term168=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term168.getTree());
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:18: ( ',' term )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==66) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:20: ',' term
							{
							char_literal169=(Token)match(input,66,FOLLOW_66_in_params_2078); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_66.add(char_literal169);

							pushFollow(FOLLOW_term_in_params_2080);
							term170=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term170.getTree());
							}
							break;

						default :
							break loop38;
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
			// 235:36: -> ^( PARAMS ( term )* )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:39: ^( PARAMS ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:235:49: ( term )*
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:1: program : ( var_expr ( ';' !)+ )* ( function )* ;
	public final CGrammarParser.program_return program() throws RecognitionException {
		CGrammarParser.program_return retval = new CGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal172=null;
		ParserRuleReturnScope var_expr171 =null;
		ParserRuleReturnScope function173 =null;

		Object char_literal172_tree=null;

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:9: ( ( var_expr ( ';' !)+ )* ( function )* )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:11: ( var_expr ( ';' !)+ )* ( function )*
			{
			root_0 = (Object)adaptor.nil();


			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:11: ( var_expr ( ';' !)+ )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==CHAR||LA41_0==DOUBLE||LA41_0==INT||LA41_0==STRING||LA41_0==VOID) ) {
					int LA41_1 = input.LA(2);
					if ( (LA41_1==IDENT) ) {
						int LA41_3 = input.LA(3);
						if ( (LA41_3==ASSIGN||(LA41_3 >= 66 && LA41_3 <= 68)) ) {
							alt41=1;
						}

					}

				}

				switch (alt41) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:12: var_expr ( ';' !)+
					{
					pushFollow(FOLLOW_var_expr_in_program2107);
					var_expr171=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr171.getTree());

					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:21: ( ';' !)+
					int cnt40=0;
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==67) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:22: ';' !
							{
							char_literal172=(Token)match(input,67,FOLLOW_67_in_program2110); if (state.failed) return retval;
							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(40, input);
							throw eee;
						}
						cnt40++;
					}

					}
					break;

				default :
					break loop41;
				}
			}

			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:31: ( function )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==CHAR||LA42_0==DOUBLE||LA42_0==INT||LA42_0==STRING||LA42_0==VOID) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:237:31: function
					{
					pushFollow(FOLLOW_function_in_program2117);
					function173=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function173.getTree());

					}
					break;

				default :
					break loop42;
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:239:1: result : program EOF -> ^( PROGRAM program ) ;
	public final CGrammarParser.result_return result() throws RecognitionException {
		CGrammarParser.result_return retval = new CGrammarParser.result_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF175=null;
		ParserRuleReturnScope program174 =null;

		Object EOF175_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:239:8: ( program EOF -> ^( PROGRAM program ) )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:239:10: program EOF
			{
			pushFollow(FOLLOW_program_in_result2126);
			program174=program();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_program.add(program174.getTree());
			EOF175=(Token)match(input,EOF,FOLLOW_EOF_in_result2128); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF175);

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
			// 239:22: -> ^( PROGRAM program )
			{
				// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:239:25: ^( PROGRAM program )
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
	// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:241:8: public execute : result ;
	public final CGrammarParser.execute_return execute() throws RecognitionException {
		CGrammarParser.execute_return retval = new CGrammarParser.execute_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope result176 =null;


		try {
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:242:2: ( result )
			// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:242:4: result
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_result_in_execute2147);
			result176=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result176.getTree());

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

	// $ANTLR start synpred26_CGrammar
	public final void synpred26_CGrammar_fragment() throws RecognitionException {
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:143:4: ( '(' compare ')' )
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:143:4: '(' compare ')'
		{
		match(input,64,FOLLOW_64_in_synpred26_CGrammar1138); if (state.failed) return;

		pushFollow(FOLLOW_compare_in_synpred26_CGrammar1141);
		compare();
		state._fsp--;
		if (state.failed) return;

		match(input,65,FOLLOW_65_in_synpred26_CGrammar1143); if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_CGrammar

	// $ANTLR start synpred27_CGrammar
	public final void synpred27_CGrammar_fragment() throws RecognitionException {
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:144:5: ( compare )
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:144:5: compare
		{
		pushFollow(FOLLOW_compare_in_synpred27_CGrammar1150);
		compare();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_CGrammar

	// $ANTLR start synpred37_CGrammar
	public final void synpred37_CGrammar_fragment() throws RecognitionException {
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:27: ( ',' var_name )
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:166:27: ',' var_name
		{
		match(input,66,FOLLOW_66_in_synpred37_CGrammar1387); if (state.failed) return;

		pushFollow(FOLLOW_var_name_in_synpred37_CGrammar1389);
		var_name();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred37_CGrammar

	// $ANTLR start synpred38_CGrammar
	public final void synpred38_CGrammar_fragment() throws RecognitionException {
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:29: ( ELSE expr )
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:29: ELSE expr
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred38_CGrammar1426); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred38_CGrammar1428);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_CGrammar

	// $ANTLR start synpred59_CGrammar
	public final void synpred59_CGrammar_fragment() throws RecognitionException {
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:15: ( ';' )
		// /home/vlad/NetBeansProjects/CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:210:15: ';'
		{
		match(input,67,FOLLOW_67_in_synpred59_CGrammar1790); if (state.failed) return;

		}

	}
	// $ANTLR end synpred59_CGrammar

	// Delegated rules

	public final boolean synpred37_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_CGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_CGrammar_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_IDENT_in_array_call954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_array_call956 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_call958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_array_call960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_group978 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_group981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_group983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_group990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_group997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_group1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHR_in_group1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_group1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_group1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_in_mult1034 = new BitSet(new long[]{0x0000012000080002L});
	public static final BitSet FOLLOW_set_in_mult1038 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_group_in_mult1053 = new BitSet(new long[]{0x0000012000080002L});
	public static final BitSet FOLLOW_mult_in_add1064 = new BitSet(new long[]{0x0100000000000022L});
	public static final BitSet FOLLOW_set_in_add1069 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_mult_in_add1080 = new BitSet(new long[]{0x0100000000000022L});
	public static final BitSet FOLLOW_add_in_term1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_compare1100 = new BitSet(new long[]{0x0000048E04000000L});
	public static final BitSet FOLLOW_set_in_compare1102 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_compare1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_compare_group1138 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_compare_in_compare_group1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_compare_group1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_compare_group1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_compare_group1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_compare_group1159 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_compare_in_compare_group1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_compare_group1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1174 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_AND_in_and_logic1177 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1180 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1189 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_OR_in_or_logic1192 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1195 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_IDENT_in_simple_var1207 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASSIGN_in_simple_var1210 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_simple_var1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var11232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_array_var11234 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_var11236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_array_var11238 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var11241 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BEGIN_in_array_var11243 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_var11245 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_array_var11248 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_var11250 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_END_in_array_var11254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var21294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_array_var21296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_array_var21298 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var21301 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BEGIN_in_array_var21303 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_var21305 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_array_var21308 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_array_var21310 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_END_in_array_var21314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var1_in_array_var1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var2_in_array_var1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_var_in_var_name1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var_in_var_name1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_expr1381 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_var_expr1387 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1389 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_IF_in_if_expr1419 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_logic_in_if_expr1421 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_if_expr1423 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_ELSE_in_if_expr1426 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_if_expr1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_expr1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_while_expr1454 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_logic_in_while_expr1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_while_expr1458 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_while_expr1460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_expr1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_for_expr1481 = new BitSet(new long[]{0x64CE8001C8636010L,0x0000000000000008L});
	public static final BitSet FOLLOW_uexpr_in_for_expr1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_for_expr1487 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000009L});
	public static final BitSet FOLLOW_or_logic_in_for_expr1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_for_expr1493 = new BitSet(new long[]{0x64CE8001C8636010L,0x0000000000000002L});
	public static final BitSet FOLLOW_uexpr_in_for_expr1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_for_expr1499 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_for_expr1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_while1512 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_do_while1514 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_WHILE_in_do_while1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_do_while1518 = new BitSet(new long[]{0x04A8180040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_or_logic_in_do_while1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_do_while1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_expr1541 = new BitSet(new long[]{0x04A8100040028012L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_return_expr1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTF_in_print_expr1555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_print_expr1557 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_STR_in_print_expr1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_66_in_print_expr1563 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_print_expr1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_65_in_print_expr1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_scan_args1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_scan_args1603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCANF_in_scan_expr1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_scan_expr1615 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_STR_in_scan_expr1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_66_in_scan_expr1621 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_scan_args_in_scan_expr1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
	public static final BitSet FOLLOW_65_in_scan_expr1628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_expr_in_sexpr1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_sexpr1663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_sexpr1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_expr_in_sexpr1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_expr_in_sexpr1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scan_expr_in_sexpr1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_sexpr1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_sexpr1700 = new BitSet(new long[]{0x0200024000100440L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1704 = new BitSet(new long[]{0x0200024000100440L});
	public static final BitSet FOLLOW_assign_in_sexpr1707 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_sexpr1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1730 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ASSIGN_in_sexpr1732 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BEGIN_in_sexpr1735 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_sexpr1738 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_sexpr1741 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_sexpr1744 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_END_in_sexpr1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_while_in_sexpr1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_cexpr1766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_expr_in_cexpr1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_expr_in_cexpr1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_expr1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_expr1790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_cexpr_in_expr1799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_expr_in_expr1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_uexpr1817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_cexpr_in_uexpr1821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_uexpr1825 = new BitSet(new long[]{0x64CE8001C8636010L});
	public static final BitSet FOLLOW_sexpr_in_uexpr1829 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_cexpr_in_uexpr1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_BEGIN_in_block_expr1848 = new BitSet(new long[]{0x64CE8001CA636810L});
	public static final BitSet FOLLOW_expr_in_block_expr1850 = new BitSet(new long[]{0x64CE8001CA636810L});
	public static final BitSet FOLLOW_END_in_block_expr1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_ident_arr1877 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000021L});
	public static final BitSet FOLLOW_term_in_ident_arr1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_ident_arr1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_var1923 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_function_var1929 = new BitSet(new long[]{0x2040000100404000L});
	public static final BitSet FOLLOW_type_in_function_var1931 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1933 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_function1955 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_IDENT_in_function1957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_function1959 = new BitSet(new long[]{0x2040000100404000L,0x0000000000000002L});
	public static final BitSet FOLLOW_function_var_in_function1961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_function1964 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BEGIN_in_function1966 = new BitSet(new long[]{0x64CE8001CA636810L});
	public static final BitSet FOLLOW_expr_in_function1968 = new BitSet(new long[]{0x64CE8001CA636810L});
	public static final BitSet FOLLOW_END_in_function1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_name_in_func_call2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_func_call2049 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000003L});
	public static final BitSet FOLLOW_params__in_func_call2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_func_call2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_params_2074 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_params_2078 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_term_in_params_2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_var_expr_in_program2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_program2110 = new BitSet(new long[]{0x2040000100404002L,0x0000000000000008L});
	public static final BitSet FOLLOW_function_in_program2117 = new BitSet(new long[]{0x2040000100404002L});
	public static final BitSet FOLLOW_program_in_result2126 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_result2128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_in_execute2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_synpred26_CGrammar1138 = new BitSet(new long[]{0x04A8100040028010L,0x0000000000000001L});
	public static final BitSet FOLLOW_compare_in_synpred26_CGrammar1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_synpred26_CGrammar1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_synpred27_CGrammar1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_synpred37_CGrammar1387 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_var_name_in_synpred37_CGrammar1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred38_CGrammar1426 = new BitSet(new long[]{0x64CE8001C8636810L});
	public static final BitSet FOLLOW_expr_in_synpred38_CGrammar1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_synpred59_CGrammar1790 = new BitSet(new long[]{0x0000000000000002L});
}
