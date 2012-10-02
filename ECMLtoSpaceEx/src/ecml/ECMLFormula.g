grammar ECMLFormula;

options {
  language = Java;
  output = AST;
}

@header{
package ecml;
}
@lexer::header{
package ecml;
}
//[C] Team : String = &quot;Alpha&quot;

var_def
  : var_rate_class identifier ':' var_type ('=' constant)?
  ;
var_rate_class
  :'[' var_rate_class_alphabet ']'
  ;
var_rate_class_alphabet
  : 'A' | 'C' |'D' | 'E'
  ;
var_type
  :'String' | 'boolean' |'double' |'Angle3D'
  ;

identifier
  : LETTER (LETTER|'0'..'9')*
  ;

  
constant
    :   DECIMAL_LITERAL
    | CHARACTER_LITERAL
    | STRING_LITERAL
    |   FLOATING_POINT_LITERAL
    ;  
//DecreaseThrust [ThrustControl1 &lt; (Power / MaximumPower)] //

connection_contents
  : identifier '[' condition_expression']' '//' action_expression
  ;
condition_expression
  :
  ;
action_expression
  :
  ;
LETTER
  : '$'
  | 'A'..'Z'
  | 'a'..'z'
  | '_'  
  ;
CHARACTER_LITERAL
  :   '\'' (~('\''|'\\') ) '\''
  ;

STRING_LITERAL
  :  '"' ( ~('\\'|'"') )* '"'
  ;

DECIMAL_LITERAL 
  : ('0' | '1'..'9' '0'..'9'*) 
  ;
FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+ 
    |   ('0'..'9')+ 
  ;

WHITESPACE 
  : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } 
  ;




