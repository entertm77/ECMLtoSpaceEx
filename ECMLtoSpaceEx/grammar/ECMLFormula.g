grammar ECMLFormula;

options {
  language = Java;
  output   = AST;
}

tokens {
  EQUAL;
  OPER;
  CONTVAR;
  DISCVAR;
}

@lexer::header {
package parsers;
}

@header {
package parsers;
import org.apache.log4j.Logger;
}

@members {
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

connection_contents returns [Tree[\] conditions, Tree[\] actions]
  scope{List<Tree> cond_arr; List<Tree> act_arr;}
  @init{$connection_contents::act_arr = new ArrayList<Tree>();
  $connection_contents::cond_arr = new ArrayList<Tree>();
  }
  @after{$conditions = $connection_contents::cond_arr.toArray(new Tree[$connection_contents::cond_arr.size()]);
  $actions = $connection_contents::act_arr.toArray(new Tree[$connection_contents::act_arr.size()]);}
  :  
  identifier '[' condition_expression  ']'
  (
    '//' b=action_expression{ $connection_contents::act_arr.add((Tree)$b.tree);}
    | '//'
  )? 
  ;

condition_expression
  :
  a=and_expression{$connection_contents::cond_arr.add((Tree)$a.tree);} (ECMLOR ^ b=and_expression{$connection_contents::cond_arr.add((Tree)$b.tree);})*
  ;

and_expression
  :
  relational_expression (ECMLAND ^ relational_expression)*
  ;

relational_expression
  :
  a=bi_expression o=(RELOP) b=bi_expression
    ->
      ^(RELOP $a $b)
  ;

action_expressions
  :
  action_expression (';' ^ action_expression)*
  ;

action_expression
  :
  ID '=' bi_expression
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


INT
  :
  '0'..'9'+
  ;


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
ECMLOR:'||';
ECMLAND:'&&';
SXOR:'|';
SXAND:'&';
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
