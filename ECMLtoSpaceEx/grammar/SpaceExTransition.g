tree grammar SpaceExTransition;

options {
  language     = Java;
  tokenVocab   = ECMLFormula;
  ASTLabelType = CommonTree;
  output       = template;
}

@header {
package parsers;
  import org.apache.log4j.Logger;
}

@members {
private static Logger log = Logger.getLogger(SpaceExTransition.class);
}
act_exp
:
;

cond_exp 
  :
  ^(ECMLAND a=rel_exp b=cond_exp) -> template(a={$a.st}, b={$b.st})"<a>&<b>"
  |rel_exp
  ; 
  
rel_exp
:^(o=RELOP a=bi_exp b=bi_exp) -> template(a={$a.st}, b={$b.st}, o={$o.text})"<a><o><b>"
;

bi_exp
:^(o=OPER a=primary_exp b=bi_exp) -> template(a={$a.st}, b={$b.st}, o={$o.text})"<a><o><b>"
|primary_exp
;
  
primary_exp
: 
ID -> {%{$ID.text}}
| INT -> {%{$INT.text}}
| FLOAT -> {%{$FLOAT.text}}
| '(' bi_exp ')' -> template(a={$bi_exp.st})"(<a>)"
;
