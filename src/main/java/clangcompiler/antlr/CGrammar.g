grammar CGrammar;

options {
  language=Java;
  output=AST;
  backtrack=true;
}


tokens {
  UNKNOWN		;
  PROGRAM		;
  
  BLOCK			;
  BEGIN	    = '{'	;
  END       = '}'	;
  
  INT 	    = 'int'	;
  CHAR	    = 'char'	;
  STRING    = 'string'	;
  DOUBLE    = 'double'	;
  VOID	    = 'void'	;
  
  FUNC			;
  DECLARE		;
  PARAMS		;
  
  IF 	   = 'if'	;
  ELSE 	   = 'else'	;
  
  WHILE    = 'while'	;
  DO	   = 'do'	;
  DOWHILE	        ;
  
  FOR      = 'for'	;
  
  BREAK    = 'break'	;
  CONTINUE = 'continue' ;
  RETURN   = 'return'   ;
  
  FUNCCALL;
  
  SIN	   = 'sin'	;
  COS	   = 'cos'	;
  TAN	   = 'tan'	;
  ABS      = 'abs'	;
  STRLEN   = 'strlen'	;
  
  PRINTF   = 'printf'   ;
  SCANF    = 'scanf'    ;
  
  ARRAY			;
  ARRAYCALL		;

  VARDECL               ;
}


@lexer::header {package clangcompiler.antlr; }
@parser::header {package clangcompiler.antlr; }


WS:
  ( ' ' | '\t' |  '\f' | '\r' | '\n' )+ {
    $channel=HIDDEN;
  }
;

SL_COMMENT:
  '//' (options { greedy=false; }: .)* '\r'? '\n' {
    $channel=HIDDEN;
  }
;
ML_COMMENT:
  '/*' (options { greedy=false; }: .)* '*/' {
    $channel=HIDDEN;
  }
;

NUMBER	: 	('0'..'9')+ ('.' ('0'..'9')+)?
;

STR	:	'"' (.)* '"';

CHR	:	'\'' (. | '\\n' | '\\0' | '\\t' | '\\f' | '\\a' | '\\v' | '\\b' | '\\r' | '\\\\' | '\\\'' | '\\\"')'\'';

IDENT	:  	( 'a'..'z' | 'A'..'Z' | '_' )
        	( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
;

ADD	:	'+';
SUB	:	'-';
MUL	:	'*';
DIV	:	'/';
MOD	:	'%';

ASSIGN	:	'=';

EQ	:	'==';
NE	:	'!=';
ME	:	'>=';
LE	:	'<=';
MT	:	'>';
LT	:	'<';

NOT	:	'!';
AND	:	'&&';
OR	:	'||';

ADD_ASSIGN
	:	'+=';
SUB_ASSIGN
	:	'-=';
MUL_ASSIGN
	:	'*=';
DIV_ASSIGN
	:	'/=';
MOD_ASSIGN
	:	'%=';
	
assign	:	ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN ;

type	:	INT | CHAR | STRING | DOUBLE | VOID ;

array_call
	:	IDENT '[' term ']' -> ^(ARRAYCALL IDENT term);

group	:	'('! term ')'!
		| func_call	
		| NUMBER
		| STR
		| CHR
		| array_call
		| IDENT
		;
		
mult	:	group ( ( MUL | DIV | MOD )^ group )* ;
add	:	mult  ( ( ADD | SUB )^ mult )* ;
term	:	add ;

compare	:	term ( ME | LE | EQ | NE | LT | MT )^ term ;
compare_group
	:	'('! compare ')'!
		| compare
		| NOT^ '('! compare ')'! ;
and_logic
	:	compare_group (AND^ compare_group)* ;
or_logic:	and_logic (OR^ and_logic)* ;

simple_var
	:	IDENT (ASSIGN term)? -> ^(IDENT term?);

array_var1
	:	IDENT '[' term ']' (ASSIGN BEGIN term (',' term)* END)?
                 -> ^(ARRAY IDENT term*);


array_var2
	:	IDENT '[' ']' (ASSIGN BEGIN term (',' term)* END)?
                 -> ^(ARRAY IDENT term*);

array_var:      array_var1 | array_var2;
	
var_name:	simple_var | array_var;
		
var_expr:	type var_name ( ',' var_name )*
		-> ^(VARDECL ^(type var_name) * );
		
if_expr	:	IF or_logic expr (ELSE expr)? -> ^(IF or_logic expr expr?);

while_expr
	:	WHILE '(' or_logic ')' expr -> ^(WHILE or_logic expr);
	
for_expr:	FOR^ '('! uexpr? ';'! or_logic? ';'! uexpr? ')'! expr 

;

do_while:	DO expr WHILE '(' or_logic ')' -> ^(DOWHILE expr or_logic);

return_expr
	:	RETURN^ term?;
	
print_expr
	:	PRINTF '(' STR ( ',' term )* ')' 
		-> ^(PRINTF ^( STR term* ) )
	;
	
scan_args:	IDENT | array_call;
	
scan_expr
	:	SCANF '(' STR ( ',' scan_args )* ')' 
		-> ^(SCANF ^( STR scan_args* ) )
	;

sexpr	:	var_expr
		| BREAK
		| CONTINUE
		| return_expr
		| print_expr
		| scan_expr
		| func_call
		| (array_call | IDENT) assign^ term
                | IDENT ASSIGN^ BEGIN! term (','! term)* END!
		| do_while ;
		
cexpr	:	if_expr
		| while_expr
		| for_expr ;

expr	:	sexpr (';'!)+
		| cexpr
		| block_expr;
		
uexpr	: 	(sexpr | cexpr) (','! (sexpr | cexpr))* ;
		
block_expr
	:	BEGIN expr* END -> ^(BLOCK expr*) ;

ident_arr:      IDENT '[' term? ']' -> ^(ARRAY IDENT term?)
                | IDENT;
	
function_var
	:	type ident_arr ( ',' type ident_arr )* -> ^(type ident_arr)* ;	
	
function:	type IDENT '(' function_var? ')' BEGIN expr* END
		-> ^(FUNC type IDENT ^(PARAMS function_var?) ^(BLOCK expr*)) ;		
		
func_name
	:	IDENT 
		| SIN | COS | TAN | ABS | STRLEN ;
		
func_call 
	:	func_name '(' params_ ')' -> ^(FUNCCALL func_name params_);
	
params_	:	( term ( ',' term  )* )? -> ^( PARAMS term* );

program	:	(var_expr (';'!)+)* function*;

result	:	program EOF -> ^(PROGRAM program);

public execute
	:	result
;