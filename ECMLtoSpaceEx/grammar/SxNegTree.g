tree grammar SxNegTree;

options {
  language     = Java;
  tokenVocab   = ECMLFormula;
  ASTLabelType = CommonTree;
  output       = AST;
}

@header {
package parsers;
  import org.apache.log4j.Logger;
}

@members {

}

and_exp
  :
  ^(SXAND and_exp rel_exp) -> ^(SXOR and_exp rel_exp)
  | rel_exp 
  ; 
  
rel_exp :
^(o=RELOP a=bi_exp b=bi_exp)->{$o.text.equals("==")}? ^(SXOR ^(RELOP[">="] $a $b) ^(RELOP["<="] $a $b))
			     ->{$o.text.equals(">=")||$o.text.equals(">")}? ^(RELOP["<="] $a $b)
			     ->{$o.text.equals("<=")||$o.text.equals("<")}? ^(RELOP[">="] $a $b)
			     ->;  

bi_exp
:^(o=OPER a=primary_exp b=bi_exp) 
|primary_exp 
;
  
primary_exp
: 
ID 
| INT  
| FLOAT
|'(' bi_exp ')' 
;
