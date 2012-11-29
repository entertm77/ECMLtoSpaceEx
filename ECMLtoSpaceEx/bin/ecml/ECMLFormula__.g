lexer grammar ECMLFormula;
options {
  language=Java;

}

@header {
package parsers;
}

T__15 : '(' ;
T__16 : ')' ;
T__17 : '//' ;
T__18 : ':' ;
T__19 : ';' ;
T__20 : '=' ;
T__21 : 'A' ;
T__22 : 'C' ;
T__23 : 'D' ;
T__24 : 'E' ;
T__25 : '[' ;
T__26 : ']' ;

// $ANTLR src "ECMLFormula.g" 113
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
  ;// $ANTLR src "ECMLFormula.g" 129
INT
  :
  '0'..'9'+
  ;// $ANTLR src "ECMLFormula.g" 135
FLOAT
  :
  ('0'..'9')+ '.' ('0'..'9')*
  ;// $ANTLR src "ECMLFormula.g" 140
RELOP
  :
  '<'
  | '>'
  | '>='
  | '<='
  | '=='
  ;// $ANTLR src "ECMLFormula.g" 148
ECMLOR:'||';// $ANTLR src "ECMLFormula.g" 149
ECMLAND:'&&';// $ANTLR src "ECMLFormula.g" 150
SXOR:'|';// $ANTLR src "ECMLFormula.g" 151
SXAND:'&';// $ANTLR src "ECMLFormula.g" 152
OPER
  :
  '+'
  | '-'
  | '/'
  | '*'
  ;// $ANTLR src "ECMLFormula.g" 160
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