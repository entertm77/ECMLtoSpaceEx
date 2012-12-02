grammar ECMLFormula;

options {
  language = Java;
  output   = AST;
  backtrack = true;
}

tokens {
  EQUAL;
  DISC_RELOP;
  CONT_RELOP;
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
  var_rate_class ID ':' var_type ('=' constant)?
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
  ID
  ;
state_model
 :'d' '(' ID ')' '=' bi_expression
 | ID '=' bi_expression
 ;
	
//DecreaseThrust [ThrustControl1 &lt; (Power / MaximumPower)] //

connection_contents[BehavioralModel cbm_in] returns [String label, Tree[\] conditions, Tree actions]
  scope{List<Tree> cond_arr;
  BehavioralModel cbm;}
  @init{
  $connection_contents::cond_arr = new ArrayList<Tree>();
  $connection_contents::cbm = cbm_in;
  }
  @after{$conditions = $connection_contents::cond_arr.toArray(new Tree[$connection_contents::cond_arr.size()]);
  }
  :  
  ID '[' condition_expression  ']'
  (
    '//' b=action_expression{ $actions = (Tree)$b.tree;}
    | '//'
  )? 
  ;

condition_expression
  :
  a=and_expression{$connection_contents::cond_arr.add((Tree)$a.tree);} (ECMLOR b=and_expression{$connection_contents::cond_arr.add((Tree)$b.tree);})*
  ;

and_expression
  :
   relational_expression ECMLAND and_expression -> ^(SXAND relational_expression and_expression)
   |relational_expression 
  ;  

relational_expression
  scope {boolean is_disc;}
  @init{is_disc=false;}
  :
  a=bi_expression o=(RELOP) b=bi_expression
    ->{$relational_expression::is_disc==true}?^(DISC_RELOP[$o.text] $a $b)
    ->{$relational_expression::is_disc==false;}?^(CONT_RELOP[$o.text] $a $b)
    ->
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
  ID{if($connection_contents::cbm.is_disc($ID.text))
  $relational_expression::is_disc=true;}
  | constant
  | '(' bi_expression ')'
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
