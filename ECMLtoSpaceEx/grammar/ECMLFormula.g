grammar ECMLFormula;

options {
  language = Java;
  output   = AST;
}

tokens {
  EQUAL;
  OPER;
}

@lexer::header {
package ecml;
}

@header {
package ecml;
import org.apache.log4j.Logger;
}
@members{
  private static Logger log = Logger.getLogger(ECMLFormulaParser.class);
}

var_def
  :
  var_rate_class identifier ':' var_type ('=' constant)?
  ;

var_rate_class
  :
  '[' var_rate_class_alphabet ']'
  ;

var_rate_class_alphabet
  :
  'A'
  | 'C'
  | 'D'
  | 'E'
  ;

var_type
  :
  identifier
  ;

//DecreaseThrust [ThrustControl1 &lt; (Power / MaximumPower)] //

connection_contents returns [Tree condition]
  :
  identifier '[' a=condition_expression ']'
  (
    '//' action_expression
    | '//'
  )?
  
   {
    $connection_contents.condition = (Tree)$a.tree;
   }
  ;

condition_expression
  :
  and_expression ('||'^ and_expression)*
  ;

and_expression
  :
  relational_expression ('&&'^ relational_expression)*
  ;

relational_expression
  :
  a=bi_expression o= (RELOP) b=bi_expression
    ->
      ^(RELOP $a $b)
  ;

action_expressions
  :
  action_expression (';'^ action_expression)*
  ;

action_expression
  :
  a=ID '=' b=bi_expression
    ->
      ^(EQUAL["="] $a $b)
  ;

bi_expression
  :
  (primary_expression) (OPER^ primary_expression)*
  ;

primary_expression
  :
  identifier
  | constant
  | '(' bi_expression ')'
  ;

identifier
  :
  ID
  ;

constant
  :
  INT
  | FLOAT
  ;

ID
  :
  (
    'a'..'z'
    | 'A'..'Z'
    | '_'
  )
  (
    'a'..'z'
    | 'A'..'Z'
    | '0'..'9'
    | '_'
  )*
  ;

fragment
INT
  :
  '0'..'9'+
  ;

fragment
FLOAT
  :
  ('0'..'9')+ '.' ('0'..'9')*
  ;

RELOP
  :
  '<'
  | '>'
  | '>='
  | '<='
  | '=='
  ;

OPER
  :
  '+'
  | '-'
  | '/'
  | '*'
  ;

WS
  :
  (
    ' '
    | '\t'
    | '\r'
    | '\n'
  )+
  
   {
    $channel=HIDDEN;
   }
  ;
