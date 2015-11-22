// $ANTLR 3.5.2 D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g 2015-11-22 15:20:41
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
		"ARRAYCALL", "ASSIGN", "BEGIN", "BLOCK", "BREAK", "CHAR", "CHR", "CONTINUE", 
		"DECLARE", "DIV", "DIV_ASSIGN", "DO", "DOUBLE", "DOWHILE", "ELSE", "END", 
		"EQ", "FOR", "FUNC", "FUNCCALL", "IDENT", "IF", "INT", "LE", "LT", "ME", 
		"ML_COMMENT", "MOD", "MOD_ASSIGN", "MT", "MUL", "MUL_ASSIGN", "NE", "NOT", 
		"NUMBER", "OR", "PARAMS", "PROGRAM", "RETURN", "SL_COMMENT", "STR", "STRING", 
		"SUB", "SUB_ASSIGN", "UNKNOWN", "VARDECL", "VOID", "WHILE", "WS", "'('", 
		"')'", "','", "';'", "'['", "']'"
	};
	public static final int EOF=-1;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int ADD=4;
	public static final int ADD_ASSIGN=5;
	public static final int AND=6;
	public static final int ARRAY=7;
	public static final int ARRAYCALL=8;
	public static final int ASSIGN=9;
	public static final int BEGIN=10;
	public static final int BLOCK=11;
	public static final int BREAK=12;
	public static final int CHAR=13;
	public static final int CHR=14;
	public static final int CONTINUE=15;
	public static final int DECLARE=16;
	public static final int DIV=17;
	public static final int DIV_ASSIGN=18;
	public static final int DO=19;
	public static final int DOUBLE=20;
	public static final int DOWHILE=21;
	public static final int ELSE=22;
	public static final int END=23;
	public static final int EQ=24;
	public static final int FOR=25;
	public static final int FUNC=26;
	public static final int FUNCCALL=27;
	public static final int IDENT=28;
	public static final int IF=29;
	public static final int INT=30;
	public static final int LE=31;
	public static final int LT=32;
	public static final int ME=33;
	public static final int ML_COMMENT=34;
	public static final int MOD=35;
	public static final int MOD_ASSIGN=36;
	public static final int MT=37;
	public static final int MUL=38;
	public static final int MUL_ASSIGN=39;
	public static final int NE=40;
	public static final int NOT=41;
	public static final int NUMBER=42;
	public static final int OR=43;
	public static final int PARAMS=44;
	public static final int PROGRAM=45;
	public static final int RETURN=46;
	public static final int SL_COMMENT=47;
	public static final int STR=48;
	public static final int STRING=49;
	public static final int SUB=50;
	public static final int SUB_ASSIGN=51;
	public static final int UNKNOWN=52;
	public static final int VARDECL=53;
	public static final int VOID=54;
	public static final int WHILE=55;
	public static final int WS=56;

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
	@Override public String getGrammarFileName() { return "D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g"; }


	public static class assign_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:112:1: assign : ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN );
	public final CGrammarParser.assign_return assign() throws RecognitionException {
		CGrammarParser.assign_return retval = new CGrammarParser.assign_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;

		Object set1_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:112:8: ( ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:114:1: type : ( INT | CHAR | STRING | DOUBLE | VOID );
	public final CGrammarParser.type_return type() throws RecognitionException {
		CGrammarParser.type_return retval = new CGrammarParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set2=null;

		Object set2_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:114:6: ( INT | CHAR | STRING | DOUBLE | VOID )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:116:1: array_call : IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) ;
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
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:2: ( IDENT '[' term ']' -> ^( ARRAYCALL IDENT term ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:4: IDENT '[' term ']'
			{
			IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_call852); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT3);

			char_literal4=(Token)match(input,61,FOLLOW_61_in_array_call854); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal4);

			pushFollow(FOLLOW_term_in_array_call856);
			term5=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term5.getTree());
			char_literal6=(Token)match(input,62,FOLLOW_62_in_array_call858); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(char_literal6);

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
			// 117:23: -> ^( ARRAYCALL IDENT term )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:117:26: ^( ARRAYCALL IDENT term )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:1: group : ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT );
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
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:7: ( '(' ! term ')' !| func_call | NUMBER | STR | CHR | array_call | IDENT )
			int alt1=7;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt1=1;
				}
				break;
			case IDENT:
				{
				switch ( input.LA(2) ) {
				case 61:
					{
					alt1=6;
					}
					break;
				case 57:
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
				case 58:
				case 59:
				case 60:
				case 62:
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:119:9: '(' ! term ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal7=(Token)match(input,57,FOLLOW_57_in_group876); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_group879);
					term8=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term8.getTree());

					char_literal9=(Token)match(input,58,FOLLOW_58_in_group881); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:120:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_group888);
					func_call10=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call10.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:121:5: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_group895); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER11_tree = (Object)adaptor.create(NUMBER11);
					adaptor.addChild(root_0, NUMBER11_tree);
					}

					}
					break;
				case 4 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:122:5: STR
					{
					root_0 = (Object)adaptor.nil();


					STR12=(Token)match(input,STR,FOLLOW_STR_in_group901); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STR12_tree = (Object)adaptor.create(STR12);
					adaptor.addChild(root_0, STR12_tree);
					}

					}
					break;
				case 5 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:123:5: CHR
					{
					root_0 = (Object)adaptor.nil();


					CHR13=(Token)match(input,CHR,FOLLOW_CHR_in_group907); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHR13_tree = (Object)adaptor.create(CHR13);
					adaptor.addChild(root_0, CHR13_tree);
					}

					}
					break;
				case 6 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:124:5: array_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_call_in_group913);
					array_call14=array_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call14.getTree());

					}
					break;
				case 7 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:125:5: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT15=(Token)match(input,IDENT,FOLLOW_IDENT_in_group919); if (state.failed) return retval;
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:1: mult : group ( ( MUL | DIV | MOD ) ^ group )* ;
	public final CGrammarParser.mult_return mult() throws RecognitionException {
		CGrammarParser.mult_return retval = new CGrammarParser.mult_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set17=null;
		ParserRuleReturnScope group16 =null;
		ParserRuleReturnScope group18 =null;

		Object set17_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:6: ( group ( ( MUL | DIV | MOD ) ^ group )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:8: group ( ( MUL | DIV | MOD ) ^ group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_group_in_mult932);
			group16=group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, group16.getTree());

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:14: ( ( MUL | DIV | MOD ) ^ group )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==DIV||LA2_0==MOD||LA2_0==MUL) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:128:16: ( MUL | DIV | MOD ) ^ group
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
					pushFollow(FOLLOW_group_in_mult951);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:1: add : mult ( ( ADD | SUB ) ^ mult )* ;
	public final CGrammarParser.add_return add() throws RecognitionException {
		CGrammarParser.add_return retval = new CGrammarParser.add_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set20=null;
		ParserRuleReturnScope mult19 =null;
		ParserRuleReturnScope mult21 =null;

		Object set20_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:5: ( mult ( ( ADD | SUB ) ^ mult )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:7: mult ( ( ADD | SUB ) ^ mult )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_in_add962);
			mult19=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult19.getTree());

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:13: ( ( ADD | SUB ) ^ mult )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ADD||LA3_0==SUB) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:129:15: ( ADD | SUB ) ^ mult
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
					pushFollow(FOLLOW_mult_in_add978);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:130:1: term : add ;
	public final CGrammarParser.term_return term() throws RecognitionException {
		CGrammarParser.term_return retval = new CGrammarParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope add22 =null;


		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:130:6: ( add )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:130:8: add
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_in_term989);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:132:1: compare : term ( ME | LE | EQ | NE | LT | MT ) ^ term ;
	public final CGrammarParser.compare_return compare() throws RecognitionException {
		CGrammarParser.compare_return retval = new CGrammarParser.compare_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set24=null;
		ParserRuleReturnScope term23 =null;
		ParserRuleReturnScope term25 =null;

		Object set24_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:132:9: ( term ( ME | LE | EQ | NE | LT | MT ) ^ term )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:132:11: term ( ME | LE | EQ | NE | LT | MT ) ^ term
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_compare998);
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
			pushFollow(FOLLOW_term_in_compare1027);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:133:1: compare_group : ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !);
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
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:134:2: ( '(' ! compare ')' !| compare | NOT ^ '(' ! compare ')' !)
			int alt4=3;
			switch ( input.LA(1) ) {
			case 57:
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
			case CHR:
			case IDENT:
			case NUMBER:
			case STR:
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:134:4: '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal26=(Token)match(input,57,FOLLOW_57_in_compare_group1036); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1039);
					compare27=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare27.getTree());

					char_literal28=(Token)match(input,58,FOLLOW_58_in_compare_group1041); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:5: compare
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_compare_in_compare_group1048);
					compare29=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare29.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:136:5: NOT ^ '(' ! compare ')' !
					{
					root_0 = (Object)adaptor.nil();


					NOT30=(Token)match(input,NOT,FOLLOW_NOT_in_compare_group1054); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT30_tree = (Object)adaptor.create(NOT30);
					root_0 = (Object)adaptor.becomeRoot(NOT30_tree, root_0);
					}

					char_literal31=(Token)match(input,57,FOLLOW_57_in_compare_group1057); if (state.failed) return retval;
					pushFollow(FOLLOW_compare_in_compare_group1060);
					compare32=compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compare32.getTree());

					char_literal33=(Token)match(input,58,FOLLOW_58_in_compare_group1062); if (state.failed) return retval;
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:137:1: and_logic : compare_group ( AND ^ compare_group )* ;
	public final CGrammarParser.and_logic_return and_logic() throws RecognitionException {
		CGrammarParser.and_logic_return retval = new CGrammarParser.and_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND35=null;
		ParserRuleReturnScope compare_group34 =null;
		ParserRuleReturnScope compare_group36 =null;

		Object AND35_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:2: ( compare_group ( AND ^ compare_group )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:4: compare_group ( AND ^ compare_group )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_compare_group_in_and_logic1072);
			compare_group34=compare_group();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, compare_group34.getTree());

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:18: ( AND ^ compare_group )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==AND) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:138:19: AND ^ compare_group
					{
					AND35=(Token)match(input,AND,FOLLOW_AND_in_and_logic1075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND35_tree = (Object)adaptor.create(AND35);
					root_0 = (Object)adaptor.becomeRoot(AND35_tree, root_0);
					}

					pushFollow(FOLLOW_compare_group_in_and_logic1078);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:1: or_logic : and_logic ( OR ^ and_logic )* ;
	public final CGrammarParser.or_logic_return or_logic() throws RecognitionException {
		CGrammarParser.or_logic_return retval = new CGrammarParser.or_logic_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR38=null;
		ParserRuleReturnScope and_logic37 =null;
		ParserRuleReturnScope and_logic39 =null;

		Object OR38_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:9: ( and_logic ( OR ^ and_logic )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:11: and_logic ( OR ^ and_logic )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_and_logic_in_or_logic1087);
			and_logic37=and_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic37.getTree());

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:21: ( OR ^ and_logic )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:139:22: OR ^ and_logic
					{
					OR38=(Token)match(input,OR,FOLLOW_OR_in_or_logic1090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR38_tree = (Object)adaptor.create(OR38);
					root_0 = (Object)adaptor.becomeRoot(OR38_tree, root_0);
					}

					pushFollow(FOLLOW_and_logic_in_or_logic1093);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:141:1: simple_var : IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) ;
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
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:2: ( IDENT ( ASSIGN term )? -> ^( IDENT ( term )? ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:4: IDENT ( ASSIGN term )?
			{
			IDENT40=(Token)match(input,IDENT,FOLLOW_IDENT_in_simple_var1105); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT40);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:10: ( ASSIGN term )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ASSIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:11: ASSIGN term
					{
					ASSIGN41=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simple_var1108); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN41);

					pushFollow(FOLLOW_term_in_simple_var1110);
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
			// 142:25: -> ^( IDENT ( term )? )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:28: ^( IDENT ( term )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IDENT.nextNode(), root_1);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:142:36: ( term )?
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:144:1: array_var1 : IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) ;
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:2: ( IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:4: IDENT '[' term ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT43=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var11130); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT43);

			char_literal44=(Token)match(input,61,FOLLOW_61_in_array_var11132); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal44);

			pushFollow(FOLLOW_term_in_array_var11134);
			term45=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_term.add(term45.getTree());
			char_literal46=(Token)match(input,62,FOLLOW_62_in_array_var11136); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(char_literal46);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:23: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ASSIGN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:24: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var11139); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN47);

					BEGIN48=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var11141); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN48);

					pushFollow(FOLLOW_term_in_array_var11143);
					term49=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term49.getTree());
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:42: ( ',' term )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==59) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:145:43: ',' term
							{
							char_literal50=(Token)match(input,59,FOLLOW_59_in_array_var11146); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_59.add(char_literal50);

							pushFollow(FOLLOW_term_in_array_var11148);
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

					END52=(Token)match(input,END,FOLLOW_END_in_array_var11152); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END52);

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
			// 146:18: -> ^( ARRAY IDENT ( term )* )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:21: ^( ARRAY IDENT ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:146:35: ( term )*
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:149:1: array_var2 : IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) ;
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:2: ( IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )? -> ^( ARRAY IDENT ( term )* ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:4: IDENT '[' ']' ( ASSIGN BEGIN term ( ',' term )* END )?
			{
			IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_var21192); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT53);

			char_literal54=(Token)match(input,61,FOLLOW_61_in_array_var21194); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(char_literal54);

			char_literal55=(Token)match(input,62,FOLLOW_62_in_array_var21196); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(char_literal55);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:18: ( ASSIGN BEGIN term ( ',' term )* END )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ASSIGN) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:19: ASSIGN BEGIN term ( ',' term )* END
					{
					ASSIGN56=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_array_var21199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN56);

					BEGIN57=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_array_var21201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN57);

					pushFollow(FOLLOW_term_in_array_var21203);
					term58=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term58.getTree());
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:37: ( ',' term )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==59) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:150:38: ',' term
							{
							char_literal59=(Token)match(input,59,FOLLOW_59_in_array_var21206); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_59.add(char_literal59);

							pushFollow(FOLLOW_term_in_array_var21208);
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

					END61=(Token)match(input,END,FOLLOW_END_in_array_var21212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_END.add(END61);

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
			// 151:18: -> ^( ARRAY IDENT ( term )* )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:21: ^( ARRAY IDENT ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:151:35: ( term )*
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:1: array_var : ( array_var1 | array_var2 );
	public final CGrammarParser.array_var_return array_var() throws RecognitionException {
		CGrammarParser.array_var_return retval = new CGrammarParser.array_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope array_var162 =null;
		ParserRuleReturnScope array_var263 =null;


		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:10: ( array_var1 | array_var2 )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==IDENT) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==61) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==62) ) {
						alt12=2;
					}
					else if ( (LA12_2==CHR||LA12_2==IDENT||LA12_2==NUMBER||LA12_2==STR||LA12_2==57) ) {
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:17: array_var1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var1_in_array_var1254);
					array_var162=array_var1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_var162.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:153:30: array_var2
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var2_in_array_var1258);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:1: var_name : ( simple_var | array_var );
	public final CGrammarParser.var_name_return var_name() throws RecognitionException {
		CGrammarParser.var_name_return retval = new CGrammarParser.var_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope simple_var64 =null;
		ParserRuleReturnScope array_var65 =null;


		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:9: ( simple_var | array_var )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==IDENT) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==61) ) {
					alt13=2;
				}
				else if ( (LA13_1==EOF||LA13_1==ASSIGN||(LA13_1 >= 58 && LA13_1 <= 60)) ) {
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:11: simple_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simple_var_in_var_name1266);
					simple_var64=simple_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_var64.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:155:24: array_var
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_var_in_var_name1270);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:1: var_expr : type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) ;
	public final CGrammarParser.var_expr_return var_expr() throws RecognitionException {
		CGrammarParser.var_expr_return retval = new CGrammarParser.var_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		ParserRuleReturnScope type66 =null;
		ParserRuleReturnScope var_name67 =null;
		ParserRuleReturnScope var_name69 =null;

		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_var_name=new RewriteRuleSubtreeStream(adaptor,"rule var_name");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:9: ( type var_name ( ',' var_name )* -> ^( VARDECL ( ^( type var_name ) )* ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:11: type var_name ( ',' var_name )*
			{
			pushFollow(FOLLOW_type_in_var_expr1279);
			type66=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type66.getTree());
			pushFollow(FOLLOW_var_name_in_var_expr1281);
			var_name67=var_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_var_name.add(var_name67.getTree());
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:25: ( ',' var_name )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==59) ) {
					int LA14_2 = input.LA(2);
					if ( (synpred37_CGrammar()) ) {
						alt14=1;
					}

				}

				switch (alt14) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:27: ',' var_name
					{
					char_literal68=(Token)match(input,59,FOLLOW_59_in_var_expr1285); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_59.add(char_literal68);

					pushFollow(FOLLOW_var_name_in_var_expr1287);
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
			// 158:3: -> ^( VARDECL ( ^( type var_name ) )* )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:6: ^( VARDECL ( ^( type var_name ) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:16: ( ^( type var_name ) )*
				while ( stream_type.hasNext()||stream_var_name.hasNext() ) {
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:158:16: ^( type var_name )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:1: if_expr : IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) ;
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
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:9: ( IF or_logic expr ( ELSE expr )? -> ^( IF or_logic expr ( expr )? ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:11: IF or_logic expr ( ELSE expr )?
			{
			IF70=(Token)match(input,IF,FOLLOW_IF_in_if_expr1317); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF70);

			pushFollow(FOLLOW_or_logic_in_if_expr1319);
			or_logic71=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic71.getTree());
			pushFollow(FOLLOW_expr_in_if_expr1321);
			expr72=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:28: ( ELSE expr )?
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:29: ELSE expr
					{
					ELSE73=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr1324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE73);

					pushFollow(FOLLOW_expr_in_if_expr1326);
					expr74=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr74.getTree());
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
			// 160:41: -> ^( IF or_logic expr ( expr )? )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:44: ^( IF or_logic expr ( expr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_or_logic.nextTree());
				adaptor.addChild(root_1, stream_expr.nextTree());
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:63: ( expr )?
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:162:1: while_expr : WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) ;
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
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:163:2: ( WHILE '(' or_logic ')' expr -> ^( WHILE or_logic expr ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:163:4: WHILE '(' or_logic ')' expr
			{
			WHILE75=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_expr1350); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE75);

			char_literal76=(Token)match(input,57,FOLLOW_57_in_while_expr1352); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal76);

			pushFollow(FOLLOW_or_logic_in_while_expr1354);
			or_logic77=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic77.getTree());
			char_literal78=(Token)match(input,58,FOLLOW_58_in_while_expr1356); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal78);

			pushFollow(FOLLOW_expr_in_while_expr1358);
			expr79=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());
			// AST REWRITE
			// elements: WHILE, or_logic, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:32: -> ^( WHILE or_logic expr )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:163:35: ^( WHILE or_logic expr )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:1: for_expr : FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr ;
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
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:9: ( FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:11: FOR ^ '(' ! ( uexpr )? ';' ! ( or_logic )? ';' ! ( uexpr )? ')' ! expr
			{
			root_0 = (Object)adaptor.nil();


			FOR80=(Token)match(input,FOR,FOLLOW_FOR_in_for_expr1376); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FOR80_tree = (Object)adaptor.create(FOR80);
			root_0 = (Object)adaptor.becomeRoot(FOR80_tree, root_0);
			}

			char_literal81=(Token)match(input,57,FOLLOW_57_in_for_expr1379); if (state.failed) return retval;
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:21: ( uexpr )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= BREAK && LA16_0 <= CHAR)||LA16_0==CONTINUE||(LA16_0 >= DO && LA16_0 <= DOUBLE)||LA16_0==FOR||(LA16_0 >= IDENT && LA16_0 <= INT)||LA16_0==RETURN||LA16_0==STRING||(LA16_0 >= VOID && LA16_0 <= WHILE)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:21: uexpr
					{
					pushFollow(FOLLOW_uexpr_in_for_expr1382);
					uexpr82=uexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uexpr82.getTree());

					}
					break;

			}

			char_literal83=(Token)match(input,60,FOLLOW_60_in_for_expr1385); if (state.failed) return retval;
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:33: ( or_logic )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==CHR||LA17_0==IDENT||(LA17_0 >= NOT && LA17_0 <= NUMBER)||LA17_0==STR||LA17_0==57) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:33: or_logic
					{
					pushFollow(FOLLOW_or_logic_in_for_expr1388);
					or_logic84=or_logic();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, or_logic84.getTree());

					}
					break;

			}

			char_literal85=(Token)match(input,60,FOLLOW_60_in_for_expr1391); if (state.failed) return retval;
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:48: ( uexpr )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= BREAK && LA18_0 <= CHAR)||LA18_0==CONTINUE||(LA18_0 >= DO && LA18_0 <= DOUBLE)||LA18_0==FOR||(LA18_0 >= IDENT && LA18_0 <= INT)||LA18_0==RETURN||LA18_0==STRING||(LA18_0 >= VOID && LA18_0 <= WHILE)) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:165:48: uexpr
					{
					pushFollow(FOLLOW_uexpr_in_for_expr1394);
					uexpr86=uexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uexpr86.getTree());

					}
					break;

			}

			char_literal87=(Token)match(input,58,FOLLOW_58_in_for_expr1397); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_for_expr1400);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:1: do_while : DO expr WHILE '(' or_logic ')' -> ^( DOWHILE expr or_logic ) ;
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
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleSubtreeStream stream_or_logic=new RewriteRuleSubtreeStream(adaptor,"rule or_logic");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:9: ( DO expr WHILE '(' or_logic ')' -> ^( DOWHILE expr or_logic ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:11: DO expr WHILE '(' or_logic ')'
			{
			DO89=(Token)match(input,DO,FOLLOW_DO_in_do_while1410); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DO.add(DO89);

			pushFollow(FOLLOW_expr_in_do_while1412);
			expr90=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());
			WHILE91=(Token)match(input,WHILE,FOLLOW_WHILE_in_do_while1414); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE91);

			char_literal92=(Token)match(input,57,FOLLOW_57_in_do_while1416); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal92);

			pushFollow(FOLLOW_or_logic_in_do_while1418);
			or_logic93=or_logic();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_logic.add(or_logic93.getTree());
			char_literal94=(Token)match(input,58,FOLLOW_58_in_do_while1420); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal94);

			// AST REWRITE
			// elements: or_logic, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 169:42: -> ^( DOWHILE expr or_logic )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:169:45: ^( DOWHILE expr or_logic )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:171:1: return_expr : RETURN ^ ( term )? ;
	public final CGrammarParser.return_expr_return return_expr() throws RecognitionException {
		CGrammarParser.return_expr_return retval = new CGrammarParser.return_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RETURN95=null;
		ParserRuleReturnScope term96 =null;

		Object RETURN95_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:2: ( RETURN ^ ( term )? )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:4: RETURN ^ ( term )?
			{
			root_0 = (Object)adaptor.nil();


			RETURN95=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_expr1439); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RETURN95_tree = (Object)adaptor.create(RETURN95);
			root_0 = (Object)adaptor.becomeRoot(RETURN95_tree, root_0);
			}

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:12: ( term )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==CHR||LA19_0==IDENT||LA19_0==NUMBER||LA19_0==STR||LA19_0==57) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:172:12: term
					{
					pushFollow(FOLLOW_term_in_return_expr1442);
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


	public static class sexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sexpr"
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:1: sexpr : ( var_expr | BREAK | CONTINUE | return_expr | func_call | ( array_call | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while );
	public final CGrammarParser.sexpr_return sexpr() throws RecognitionException {
		CGrammarParser.sexpr_return retval = new CGrammarParser.sexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BREAK98=null;
		Token CONTINUE99=null;
		Token IDENT103=null;
		Token IDENT106=null;
		Token ASSIGN107=null;
		Token BEGIN108=null;
		Token char_literal110=null;
		Token END112=null;
		ParserRuleReturnScope var_expr97 =null;
		ParserRuleReturnScope return_expr100 =null;
		ParserRuleReturnScope func_call101 =null;
		ParserRuleReturnScope array_call102 =null;
		ParserRuleReturnScope assign104 =null;
		ParserRuleReturnScope term105 =null;
		ParserRuleReturnScope term109 =null;
		ParserRuleReturnScope term111 =null;
		ParserRuleReturnScope do_while113 =null;

		Object BREAK98_tree=null;
		Object CONTINUE99_tree=null;
		Object IDENT103_tree=null;
		Object IDENT106_tree=null;
		Object ASSIGN107_tree=null;
		Object BEGIN108_tree=null;
		Object char_literal110_tree=null;
		Object END112_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:7: ( var_expr | BREAK | CONTINUE | return_expr | func_call | ( array_call | IDENT ) assign ^ term | IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !| do_while )
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
				case 61:
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
					else if ( (LA22_8==CHR||LA22_8==IDENT||LA22_8==NUMBER||LA22_8==STR||LA22_8==57) ) {
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
				case 57:
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:174:9: var_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_var_expr_in_sexpr1451);
					var_expr97=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr97.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:175:5: BREAK
					{
					root_0 = (Object)adaptor.nil();


					BREAK98=(Token)match(input,BREAK,FOLLOW_BREAK_in_sexpr1457); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BREAK98_tree = (Object)adaptor.create(BREAK98);
					adaptor.addChild(root_0, BREAK98_tree);
					}

					}
					break;
				case 3 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:176:5: CONTINUE
					{
					root_0 = (Object)adaptor.nil();


					CONTINUE99=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_sexpr1463); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CONTINUE99_tree = (Object)adaptor.create(CONTINUE99);
					adaptor.addChild(root_0, CONTINUE99_tree);
					}

					}
					break;
				case 4 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:177:5: return_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_return_expr_in_sexpr1469);
					return_expr100=return_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, return_expr100.getTree());

					}
					break;
				case 5 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:178:5: func_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_func_call_in_sexpr1475);
					func_call101=func_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, func_call101.getTree());

					}
					break;
				case 6 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:5: ( array_call | IDENT ) assign ^ term
					{
					root_0 = (Object)adaptor.nil();


					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:5: ( array_call | IDENT )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==IDENT) ) {
						int LA20_1 = input.LA(2);
						if ( (LA20_1==61) ) {
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
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:6: array_call
							{
							pushFollow(FOLLOW_array_call_in_sexpr1482);
							array_call102=array_call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_call102.getTree());

							}
							break;
						case 2 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:179:19: IDENT
							{
							IDENT103=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1486); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							IDENT103_tree = (Object)adaptor.create(IDENT103);
							adaptor.addChild(root_0, IDENT103_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_assign_in_sexpr1489);
					assign104=assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assign104.getTree(), root_0);
					pushFollow(FOLLOW_term_in_sexpr1492);
					term105=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term105.getTree());

					}
					break;
				case 7 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:180:19: IDENT ASSIGN ^ BEGIN ! term ( ',' ! term )* END !
					{
					root_0 = (Object)adaptor.nil();


					IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_sexpr1512); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT106_tree = (Object)adaptor.create(IDENT106);
					adaptor.addChild(root_0, IDENT106_tree);
					}

					ASSIGN107=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_sexpr1514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN107_tree = (Object)adaptor.create(ASSIGN107);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN107_tree, root_0);
					}

					BEGIN108=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_sexpr1517); if (state.failed) return retval;
					pushFollow(FOLLOW_term_in_sexpr1520);
					term109=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term109.getTree());

					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:180:45: ( ',' ! term )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==59) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:180:46: ',' ! term
							{
							char_literal110=(Token)match(input,59,FOLLOW_59_in_sexpr1523); if (state.failed) return retval;
							pushFollow(FOLLOW_term_in_sexpr1526);
							term111=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, term111.getTree());

							}
							break;

						default :
							break loop21;
						}
					}

					END112=(Token)match(input,END,FOLLOW_END_in_sexpr1530); if (state.failed) return retval;
					}
					break;
				case 8 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:181:5: do_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_do_while_in_sexpr1537);
					do_while113=do_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, do_while113.getTree());

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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:183:1: cexpr : ( if_expr | while_expr | for_expr );
	public final CGrammarParser.cexpr_return cexpr() throws RecognitionException {
		CGrammarParser.cexpr_return retval = new CGrammarParser.cexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_expr114 =null;
		ParserRuleReturnScope while_expr115 =null;
		ParserRuleReturnScope for_expr116 =null;


		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:183:7: ( if_expr | while_expr | for_expr )
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:183:9: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_cexpr1548);
					if_expr114=if_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr114.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:184:5: while_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while_expr_in_cexpr1554);
					while_expr115=while_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_expr115.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:185:5: for_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for_expr_in_cexpr1560);
					for_expr116=for_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr116.getTree());

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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:1: expr : ( sexpr ( ';' !)+ | cexpr | block_expr );
	public final CGrammarParser.expr_return expr() throws RecognitionException {
		CGrammarParser.expr_return retval = new CGrammarParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		ParserRuleReturnScope sexpr117 =null;
		ParserRuleReturnScope cexpr119 =null;
		ParserRuleReturnScope block_expr120 =null;

		Object char_literal118_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:6: ( sexpr ( ';' !)+ | cexpr | block_expr )
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:8: sexpr ( ';' !)+
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sexpr_in_expr1569);
					sexpr117=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr117.getTree());

					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:14: ( ';' !)+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==60) ) {
							int LA24_3 = input.LA(2);
							if ( (synpred54_CGrammar()) ) {
								alt24=1;
							}

						}

						switch (alt24) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:15: ';' !
							{
							char_literal118=(Token)match(input,60,FOLLOW_60_in_expr1572); if (state.failed) return retval;
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:188:5: cexpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cexpr_in_expr1581);
					cexpr119=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr119.getTree());

					}
					break;
				case 3 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:189:5: block_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_expr_in_expr1587);
					block_expr120=block_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block_expr120.getTree());

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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:1: uexpr : ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )* ;
	public final CGrammarParser.uexpr_return uexpr() throws RecognitionException {
		CGrammarParser.uexpr_return retval = new CGrammarParser.uexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		ParserRuleReturnScope sexpr121 =null;
		ParserRuleReturnScope cexpr122 =null;
		ParserRuleReturnScope sexpr124 =null;
		ParserRuleReturnScope cexpr125 =null;

		Object char_literal123_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:7: ( ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:10: ( sexpr | cexpr ) ( ',' ! ( sexpr | cexpr ) )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:10: ( sexpr | cexpr )
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:11: sexpr
					{
					pushFollow(FOLLOW_sexpr_in_uexpr1599);
					sexpr121=sexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr121.getTree());

					}
					break;
				case 2 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:19: cexpr
					{
					pushFollow(FOLLOW_cexpr_in_uexpr1603);
					cexpr122=cexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr122.getTree());

					}
					break;

			}

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:26: ( ',' ! ( sexpr | cexpr ) )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==59) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:27: ',' ! ( sexpr | cexpr )
					{
					char_literal123=(Token)match(input,59,FOLLOW_59_in_uexpr1607); if (state.failed) return retval;
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:32: ( sexpr | cexpr )
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= BREAK && LA27_0 <= CHAR)||LA27_0==CONTINUE||(LA27_0 >= DO && LA27_0 <= DOUBLE)||LA27_0==IDENT||LA27_0==INT||LA27_0==RETURN||LA27_0==STRING||LA27_0==VOID) ) {
						alt27=1;
					}
					else if ( (LA27_0==FOR||LA27_0==IF||LA27_0==WHILE) ) {
						alt27=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 27, 0, input);
						throw nvae;
					}

					switch (alt27) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:33: sexpr
							{
							pushFollow(FOLLOW_sexpr_in_uexpr1611);
							sexpr124=sexpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, sexpr124.getTree());

							}
							break;
						case 2 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:191:41: cexpr
							{
							pushFollow(FOLLOW_cexpr_in_uexpr1615);
							cexpr125=cexpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, cexpr125.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop28;
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:193:1: block_expr : BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) ;
	public final CGrammarParser.block_expr_return block_expr() throws RecognitionException {
		CGrammarParser.block_expr_return retval = new CGrammarParser.block_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BEGIN126=null;
		Token END128=null;
		ParserRuleReturnScope expr127 =null;

		Object BEGIN126_tree=null;
		Object END128_tree=null;
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:2: ( BEGIN ( expr )* END -> ^( BLOCK ( expr )* ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:4: BEGIN ( expr )* END
			{
			BEGIN126=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block_expr1630); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN126);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:10: ( expr )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==BEGIN||(LA29_0 >= BREAK && LA29_0 <= CHAR)||LA29_0==CONTINUE||(LA29_0 >= DO && LA29_0 <= DOUBLE)||LA29_0==FOR||(LA29_0 >= IDENT && LA29_0 <= INT)||LA29_0==RETURN||LA29_0==STRING||(LA29_0 >= VOID && LA29_0 <= WHILE)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:10: expr
					{
					pushFollow(FOLLOW_expr_in_block_expr1632);
					expr127=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr127.getTree());
					}
					break;

				default :
					break loop29;
				}
			}

			END128=(Token)match(input,END,FOLLOW_END_in_block_expr1635); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END128);

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
			// 194:20: -> ^( BLOCK ( expr )* )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:23: ^( BLOCK ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:194:31: ( expr )*
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:1: ident_arr : ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT );
	public final CGrammarParser.ident_arr_return ident_arr() throws RecognitionException {
		CGrammarParser.ident_arr_return retval = new CGrammarParser.ident_arr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT129=null;
		Token char_literal130=null;
		Token char_literal132=null;
		Token IDENT133=null;
		ParserRuleReturnScope term131 =null;

		Object IDENT129_tree=null;
		Object char_literal130_tree=null;
		Object char_literal132_tree=null;
		Object IDENT133_tree=null;
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:10: ( IDENT '[' ( term )? ']' -> ^( ARRAY IDENT ( term )? ) | IDENT )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==IDENT) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==61) ) {
					alt31=1;
				}
				else if ( (LA31_1==EOF||(LA31_1 >= 58 && LA31_1 <= 59)) ) {
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:17: IDENT '[' ( term )? ']'
					{
					IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1657); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENT.add(IDENT129);

					char_literal130=(Token)match(input,61,FOLLOW_61_in_ident_arr1659); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_61.add(char_literal130);

					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:27: ( term )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==CHR||LA30_0==IDENT||LA30_0==NUMBER||LA30_0==STR||LA30_0==57) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:27: term
							{
							pushFollow(FOLLOW_term_in_ident_arr1661);
							term131=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term131.getTree());
							}
							break;

					}

					char_literal132=(Token)match(input,62,FOLLOW_62_in_ident_arr1664); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_62.add(char_literal132);

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
					// 196:37: -> ^( ARRAY IDENT ( term )? )
					{
						// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:40: ^( ARRAY IDENT ( term )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
						adaptor.addChild(root_1, stream_IDENT.nextNode());
						// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:196:54: ( term )?
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
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:197:19: IDENT
					{
					root_0 = (Object)adaptor.nil();


					IDENT133=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident_arr1695); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENT133_tree = (Object)adaptor.create(IDENT133);
					adaptor.addChild(root_0, IDENT133_tree);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:199:1: function_var : type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* ;
	public final CGrammarParser.function_var_return function_var() throws RecognitionException {
		CGrammarParser.function_var_return retval = new CGrammarParser.function_var_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		ParserRuleReturnScope type134 =null;
		ParserRuleReturnScope ident_arr135 =null;
		ParserRuleReturnScope type137 =null;
		ParserRuleReturnScope ident_arr138 =null;

		Object char_literal136_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_ident_arr=new RewriteRuleSubtreeStream(adaptor,"rule ident_arr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:2: ( type ident_arr ( ',' type ident_arr )* -> ( ^( type ident_arr ) )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:4: type ident_arr ( ',' type ident_arr )*
			{
			pushFollow(FOLLOW_type_in_function_var1705);
			type134=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type134.getTree());
			pushFollow(FOLLOW_ident_arr_in_function_var1707);
			ident_arr135=ident_arr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr135.getTree());
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:19: ( ',' type ident_arr )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==59) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:21: ',' type ident_arr
					{
					char_literal136=(Token)match(input,59,FOLLOW_59_in_function_var1711); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_59.add(char_literal136);

					pushFollow(FOLLOW_type_in_function_var1713);
					type137=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type137.getTree());
					pushFollow(FOLLOW_ident_arr_in_function_var1715);
					ident_arr138=ident_arr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ident_arr.add(ident_arr138.getTree());
					}
					break;

				default :
					break loop32;
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
			// 200:43: -> ( ^( type ident_arr ) )*
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:46: ( ^( type ident_arr ) )*
				while ( stream_type.hasNext()||stream_ident_arr.hasNext() ) {
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:200:46: ^( type ident_arr )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:1: function : type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) ;
	public final CGrammarParser.function_return function() throws RecognitionException {
		CGrammarParser.function_return retval = new CGrammarParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT140=null;
		Token char_literal141=null;
		Token char_literal143=null;
		Token BEGIN144=null;
		Token END146=null;
		ParserRuleReturnScope type139 =null;
		ParserRuleReturnScope function_var142 =null;
		ParserRuleReturnScope expr145 =null;

		Object IDENT140_tree=null;
		Object char_literal141_tree=null;
		Object char_literal143_tree=null;
		Object BEGIN144_tree=null;
		Object END146_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
		RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
		RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_function_var=new RewriteRuleSubtreeStream(adaptor,"rule function_var");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:9: ( type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:11: type IDENT '(' ( function_var )? ')' BEGIN ( expr )* END
			{
			pushFollow(FOLLOW_type_in_function1737);
			type139=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type139.getTree());
			IDENT140=(Token)match(input,IDENT,FOLLOW_IDENT_in_function1739); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENT.add(IDENT140);

			char_literal141=(Token)match(input,57,FOLLOW_57_in_function1741); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal141);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:26: ( function_var )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CHAR||LA33_0==DOUBLE||LA33_0==INT||LA33_0==STRING||LA33_0==VOID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:26: function_var
					{
					pushFollow(FOLLOW_function_var_in_function1743);
					function_var142=function_var();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function_var.add(function_var142.getTree());
					}
					break;

			}

			char_literal143=(Token)match(input,58,FOLLOW_58_in_function1746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal143);

			BEGIN144=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_function1748); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN144);

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:50: ( expr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==BEGIN||(LA34_0 >= BREAK && LA34_0 <= CHAR)||LA34_0==CONTINUE||(LA34_0 >= DO && LA34_0 <= DOUBLE)||LA34_0==FOR||(LA34_0 >= IDENT && LA34_0 <= INT)||LA34_0==RETURN||LA34_0==STRING||(LA34_0 >= VOID && LA34_0 <= WHILE)) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:202:50: expr
					{
					pushFollow(FOLLOW_expr_in_function1750);
					expr145=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr145.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			END146=(Token)match(input,END,FOLLOW_END_in_function1753); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_END.add(END146);

			// AST REWRITE
			// elements: function_var, IDENT, type, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 203:3: -> ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:6: ^( FUNC type IDENT ^( PARAMS ( function_var )? ) ^( BLOCK ( expr )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC, "FUNC"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_IDENT.nextNode());
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:24: ^( PARAMS ( function_var )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:33: ( function_var )?
				if ( stream_function_var.hasNext() ) {
					adaptor.addChild(root_2, stream_function_var.nextTree());
				}
				stream_function_var.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:48: ^( BLOCK ( expr )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:203:56: ( expr )*
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:205:1: func_name : IDENT ;
	public final CGrammarParser.func_name_return func_name() throws RecognitionException {
		CGrammarParser.func_name_return retval = new CGrammarParser.func_name_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENT147=null;

		Object IDENT147_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:2: ( IDENT )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:206:4: IDENT
			{
			root_0 = (Object)adaptor.nil();


			IDENT147=(Token)match(input,IDENT,FOLLOW_IDENT_in_func_name1793); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IDENT147_tree = (Object)adaptor.create(IDENT147);
			adaptor.addChild(root_0, IDENT147_tree);
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:208:1: func_call : func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) ;
	public final CGrammarParser.func_call_return func_call() throws RecognitionException {
		CGrammarParser.func_call_return retval = new CGrammarParser.func_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal149=null;
		Token char_literal151=null;
		ParserRuleReturnScope func_name148 =null;
		ParserRuleReturnScope params_150 =null;

		Object char_literal149_tree=null;
		Object char_literal151_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleSubtreeStream stream_params_=new RewriteRuleSubtreeStream(adaptor,"rule params_");
		RewriteRuleSubtreeStream stream_func_name=new RewriteRuleSubtreeStream(adaptor,"rule func_name");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:2: ( func_name '(' params_ ')' -> ^( FUNCCALL func_name params_ ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:4: func_name '(' params_ ')'
			{
			pushFollow(FOLLOW_func_name_in_func_call1806);
			func_name148=func_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_func_name.add(func_name148.getTree());
			char_literal149=(Token)match(input,57,FOLLOW_57_in_func_call1808); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(char_literal149);

			pushFollow(FOLLOW_params__in_func_call1810);
			params_150=params_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_params_.add(params_150.getTree());
			char_literal151=(Token)match(input,58,FOLLOW_58_in_func_call1812); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(char_literal151);

			// AST REWRITE
			// elements: params_, func_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 209:30: -> ^( FUNCCALL func_name params_ )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:209:33: ^( FUNCCALL func_name params_ )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:1: params_ : ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) ;
	public final CGrammarParser.params__return params_() throws RecognitionException {
		CGrammarParser.params__return retval = new CGrammarParser.params__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal153=null;
		ParserRuleReturnScope term152 =null;
		ParserRuleReturnScope term154 =null;

		Object char_literal153_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:9: ( ( term ( ',' term )* )? -> ^( PARAMS ( term )* ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:11: ( term ( ',' term )* )?
			{
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:11: ( term ( ',' term )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==CHR||LA36_0==IDENT||LA36_0==NUMBER||LA36_0==STR||LA36_0==57) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:13: term ( ',' term )*
					{
					pushFollow(FOLLOW_term_in_params_1833);
					term152=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term152.getTree());
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:18: ( ',' term )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==59) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:20: ',' term
							{
							char_literal153=(Token)match(input,59,FOLLOW_59_in_params_1837); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_59.add(char_literal153);

							pushFollow(FOLLOW_term_in_params_1839);
							term154=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term154.getTree());
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
			// 211:36: -> ^( PARAMS ( term )* )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:39: ^( PARAMS ( term )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:211:49: ( term )*
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:1: program : ( var_expr ( ';' !)+ )* ( function )* ;
	public final CGrammarParser.program_return program() throws RecognitionException {
		CGrammarParser.program_return retval = new CGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal156=null;
		ParserRuleReturnScope var_expr155 =null;
		ParserRuleReturnScope function157 =null;

		Object char_literal156_tree=null;

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:9: ( ( var_expr ( ';' !)+ )* ( function )* )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:11: ( var_expr ( ';' !)+ )* ( function )*
			{
			root_0 = (Object)adaptor.nil();


			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:11: ( var_expr ( ';' !)+ )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==CHAR||LA38_0==DOUBLE||LA38_0==INT||LA38_0==STRING||LA38_0==VOID) ) {
					int LA38_1 = input.LA(2);
					if ( (LA38_1==IDENT) ) {
						int LA38_3 = input.LA(3);
						if ( (LA38_3==ASSIGN||(LA38_3 >= 59 && LA38_3 <= 61)) ) {
							alt38=1;
						}

					}

				}

				switch (alt38) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:12: var_expr ( ';' !)+
					{
					pushFollow(FOLLOW_var_expr_in_program1866);
					var_expr155=var_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, var_expr155.getTree());

					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:21: ( ';' !)+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==60) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:22: ';' !
							{
							char_literal156=(Token)match(input,60,FOLLOW_60_in_program1869); if (state.failed) return retval;
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

			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:31: ( function )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==CHAR||LA39_0==DOUBLE||LA39_0==INT||LA39_0==STRING||LA39_0==VOID) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:213:31: function
					{
					pushFollow(FOLLOW_function_in_program1876);
					function157=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function157.getTree());

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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:1: result : program -> ^( PROGRAM program ) ;
	public final CGrammarParser.result_return result() throws RecognitionException {
		CGrammarParser.result_return retval = new CGrammarParser.result_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program158 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:8: ( program -> ^( PROGRAM program ) )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:10: program
			{
			pushFollow(FOLLOW_program_in_result1885);
			program158=program();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_program.add(program158.getTree());
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
			// 215:18: -> ^( PROGRAM program )
			{
				// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:215:21: ^( PROGRAM program )
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
	// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:217:1: execute : result ;
	public final CGrammarParser.execute_return execute() throws RecognitionException {
		CGrammarParser.execute_return retval = new CGrammarParser.execute_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope result159 =null;


		try {
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:218:2: ( result )
			// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:218:4: result
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_result_in_execute1902);
			result159=result();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, result159.getTree());

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
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:134:4: ( '(' compare ')' )
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:134:4: '(' compare ')'
		{
		match(input,57,FOLLOW_57_in_synpred26_CGrammar1036); if (state.failed) return;

		pushFollow(FOLLOW_compare_in_synpred26_CGrammar1039);
		compare();
		state._fsp--;
		if (state.failed) return;

		match(input,58,FOLLOW_58_in_synpred26_CGrammar1041); if (state.failed) return;

		}

	}
	// $ANTLR end synpred26_CGrammar

	// $ANTLR start synpred27_CGrammar
	public final void synpred27_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:5: ( compare )
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:135:5: compare
		{
		pushFollow(FOLLOW_compare_in_synpred27_CGrammar1048);
		compare();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_CGrammar

	// $ANTLR start synpred37_CGrammar
	public final void synpred37_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:27: ( ',' var_name )
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:157:27: ',' var_name
		{
		match(input,59,FOLLOW_59_in_synpred37_CGrammar1285); if (state.failed) return;

		pushFollow(FOLLOW_var_name_in_synpred37_CGrammar1287);
		var_name();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred37_CGrammar

	// $ANTLR start synpred38_CGrammar
	public final void synpred38_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:29: ( ELSE expr )
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:160:29: ELSE expr
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred38_CGrammar1324); if (state.failed) return;

		pushFollow(FOLLOW_expr_in_synpred38_CGrammar1326);
		expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_CGrammar

	// $ANTLR start synpred54_CGrammar
	public final void synpred54_CGrammar_fragment() throws RecognitionException {
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:15: ( ';' )
		// D:\\CLangCompiler/src/main/java/clangcompiler/antlr/CGrammar.g:187:15: ';'
		{
		match(input,60,FOLLOW_60_in_synpred54_CGrammar1572); if (state.failed) return;

		}

	}
	// $ANTLR end synpred54_CGrammar

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
	public final boolean synpred54_CGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_CGrammar_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_IDENT_in_array_call852 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_array_call854 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_call856 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_array_call858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_group876 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_group879 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_group881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_group888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_group895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STR_in_group901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHR_in_group907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_group913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_group919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_group_in_mult932 = new BitSet(new long[]{0x0000004800020002L});
	public static final BitSet FOLLOW_set_in_mult936 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_group_in_mult951 = new BitSet(new long[]{0x0000004800020002L});
	public static final BitSet FOLLOW_mult_in_add962 = new BitSet(new long[]{0x0004000000000012L});
	public static final BitSet FOLLOW_set_in_add967 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_mult_in_add978 = new BitSet(new long[]{0x0004000000000012L});
	public static final BitSet FOLLOW_add_in_term989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_compare998 = new BitSet(new long[]{0x0000012381000000L});
	public static final BitSet FOLLOW_set_in_compare1000 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_compare1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_compare_group1036 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_compare_in_compare_group1039 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_compare_group1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_compare_group1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_compare_group1054 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_compare_group1057 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_compare_in_compare_group1060 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_compare_group1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1072 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_AND_in_and_logic1075 = new BitSet(new long[]{0x0201060010004000L});
	public static final BitSet FOLLOW_compare_group_in_and_logic1078 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1087 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_OR_in_or_logic1090 = new BitSet(new long[]{0x0201060010004000L});
	public static final BitSet FOLLOW_and_logic_in_or_logic1093 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_IDENT_in_simple_var1105 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ASSIGN_in_simple_var1108 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_simple_var1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var11130 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_array_var11132 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_var11134 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_array_var11136 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var11139 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BEGIN_in_array_var11141 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_var11143 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_59_in_array_var11146 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_var11148 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_END_in_array_var11152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_array_var21192 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_array_var21194 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_array_var21196 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ASSIGN_in_array_var21199 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BEGIN_in_array_var21201 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_var21203 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_59_in_array_var21206 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_array_var21208 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_END_in_array_var21212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var1_in_array_var1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var2_in_array_var1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_var_in_var_name1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_var_in_var_name1270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_var_expr1279 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1281 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_var_expr1285 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_var_name_in_var_expr1287 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_IF_in_if_expr1317 = new BitSet(new long[]{0x0201060010004000L});
	public static final BitSet FOLLOW_or_logic_in_if_expr1319 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_if_expr1321 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_ELSE_in_if_expr1324 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_if_expr1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_expr1350 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_while_expr1352 = new BitSet(new long[]{0x0201060010004000L});
	public static final BitSet FOLLOW_or_logic_in_while_expr1354 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_while_expr1356 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_while_expr1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_expr1376 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_for_expr1379 = new BitSet(new long[]{0x10C240007218B000L});
	public static final BitSet FOLLOW_uexpr_in_for_expr1382 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_for_expr1385 = new BitSet(new long[]{0x1201060010004000L});
	public static final BitSet FOLLOW_or_logic_in_for_expr1388 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_for_expr1391 = new BitSet(new long[]{0x04C240007218B000L});
	public static final BitSet FOLLOW_uexpr_in_for_expr1394 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_for_expr1397 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_for_expr1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_while1410 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_do_while1412 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_WHILE_in_do_while1414 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_do_while1416 = new BitSet(new long[]{0x0201060010004000L});
	public static final BitSet FOLLOW_or_logic_in_do_while1418 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_do_while1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_return_expr1439 = new BitSet(new long[]{0x0201040010004002L});
	public static final BitSet FOLLOW_term_in_return_expr1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_expr_in_sexpr1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_sexpr1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_sexpr1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_return_expr_in_sexpr1469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_call_in_sexpr1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_call_in_sexpr1482 = new BitSet(new long[]{0x0008009000040220L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1486 = new BitSet(new long[]{0x0008009000040220L});
	public static final BitSet FOLLOW_assign_in_sexpr1489 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_sexpr1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_sexpr1512 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ASSIGN_in_sexpr1514 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BEGIN_in_sexpr1517 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_sexpr1520 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_59_in_sexpr1523 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_sexpr1526 = new BitSet(new long[]{0x0800000000800000L});
	public static final BitSet FOLLOW_END_in_sexpr1530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_while_in_sexpr1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_cexpr1548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_expr_in_cexpr1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_expr_in_cexpr1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_expr1569 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_expr1572 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_cexpr_in_expr1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_expr_in_expr1587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sexpr_in_uexpr1599 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_cexpr_in_uexpr1603 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_uexpr1607 = new BitSet(new long[]{0x00C240007218B000L});
	public static final BitSet FOLLOW_sexpr_in_uexpr1611 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_cexpr_in_uexpr1615 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_BEGIN_in_block_expr1630 = new BitSet(new long[]{0x00C240007298B400L});
	public static final BitSet FOLLOW_expr_in_block_expr1632 = new BitSet(new long[]{0x00C240007298B400L});
	public static final BitSet FOLLOW_END_in_block_expr1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1657 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_ident_arr1659 = new BitSet(new long[]{0x4201040010004000L});
	public static final BitSet FOLLOW_term_in_ident_arr1661 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_ident_arr1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_ident_arr1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_var1705 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1707 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_function_var1711 = new BitSet(new long[]{0x0042000040102000L});
	public static final BitSet FOLLOW_type_in_function_var1713 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ident_arr_in_function_var1715 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_type_in_function1737 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_IDENT_in_function1739 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_function1741 = new BitSet(new long[]{0x0442000040102000L});
	public static final BitSet FOLLOW_function_var_in_function1743 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_function1746 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BEGIN_in_function1748 = new BitSet(new long[]{0x00C240007298B400L});
	public static final BitSet FOLLOW_expr_in_function1750 = new BitSet(new long[]{0x00C240007298B400L});
	public static final BitSet FOLLOW_END_in_function1753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_func_name1793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_func_name_in_func_call1806 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_func_call1808 = new BitSet(new long[]{0x0601040010004000L});
	public static final BitSet FOLLOW_params__in_func_call1810 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_func_call1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_params_1833 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_59_in_params_1837 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_term_in_params_1839 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_var_expr_in_program1866 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_program1869 = new BitSet(new long[]{0x1042000040102002L});
	public static final BitSet FOLLOW_function_in_program1876 = new BitSet(new long[]{0x0042000040102002L});
	public static final BitSet FOLLOW_program_in_result1885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_result_in_execute1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred26_CGrammar1036 = new BitSet(new long[]{0x0201040010004000L});
	public static final BitSet FOLLOW_compare_in_synpred26_CGrammar1039 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_synpred26_CGrammar1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compare_in_synpred27_CGrammar1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_synpred37_CGrammar1285 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_var_name_in_synpred37_CGrammar1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred38_CGrammar1324 = new BitSet(new long[]{0x00C240007218B400L});
	public static final BitSet FOLLOW_expr_in_synpred38_CGrammar1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_synpred54_CGrammar1572 = new BitSet(new long[]{0x0000000000000002L});
}
