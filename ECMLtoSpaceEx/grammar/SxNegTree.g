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

//discrete expression negation
//continuos expression unbounded negation
disc_neg_exp
  :	
   ^(SXAND disc_neg_exp disc_rel_exp) -> ^(SXOR disc_neg_exp disc_rel_exp)
  | disc_rel_exp
  ;

disc_rel_exp :
^(o=DISC_RELOP a=bi_exp b=bi_exp)->{$o.text.equals("==")}? ^(SXOR ^(RELOP[">"] $a $b) ^(RELOP["<"] $a $b))
			     ->{$o.text.equals(">=")}? ^(RELOP["<"] $a $b)
			     ->{$o.text.equals("<=")}? ^(RELOP[">"] $a $b)
			     ->{$o.text.equals(">")}? ^(RELOP["<="] $a $b)
			     ->{$o.text.equals("<")}? ^(RELOP[">="] $a $b)
			     ->;  

//continuos expression unbounded negation
neg_unbnd_cont_exp
  :	
   ^(SXAND neg_unbnd_cont_exp neg_unbnd_rel_exp) -> ^(SXOR neg_unbnd_cont_exp neg_unbnd_rel_exp)
  | neg_unbnd_rel_exp 
  ;

neg_unbnd_rel_exp :
^(o=CONT_RELOP a=bi_exp b=bi_exp)->{$o.text.equals("==")}? ^(SXOR ^(RELOP[">"] $a $b) ^(RELOP["<"] $a $b))
			     ->{$o.text.equals(">=")||$o.text.equals(">")}? ^(RELOP["<"] $a $b)
			     ->{$o.text.equals("<=")||$o.text.equals("<")}? ^(RELOP[">"] $a $b)
			     ->;  
//continuous expression bounded negation
cont_exp_neg_bnd
  :
  ^(SXAND cont_exp_neg_bnd neg_bnd_rel_exp) -> ^(SXOR cont_exp_neg_bnd neg_bnd_rel_exp)
  | neg_bnd_rel_exp 
  ;   
neg_bnd_rel_exp :
^(o=CONT_RELOP a=bi_exp b=bi_exp)->{$o.text.equals("==")}? ^(SXOR ^(RELOP[">="] $a $b) ^(RELOP["<="] $a $b))
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
