tree grammar SxExpression;

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
private static Logger log = Logger.getLogger(SxExpression.class);
}
state_model returns[Boolean is_flow]
@init{$is_flow=false;}
 :'d' '(' a=ID ')' '=' b=bi_exp {$is_flow=true;}-> template(a={$a.text}, b={$b.st})"<a>'==<b>"
 | a=ID '=' b=bi_exp{$is_flow=false;} -> template(a={$a.text}, b={$b.st})"<a>:=<b>"
 ;
 	
action_exps
  :
  ^(';' a=action_exp b=action_exps) -> template(a={$a.st}, b={$b.st})"<a> & <b>"
  |action_exp -> template(a={$action_exp.st})"<a>"  
 ;
action_exp
:
ID '=' bi_exp -> template(a={$ID.text}, b={$bi_exp.st})"<a>:=<b>"
;

cond_exp 
  :
  ^(o=SXAND a=rel_exp b=cond_exp) -> template(a={$a.st}, o={$o.text}, b={$b.st})"<a><o><b>"
  |rel_exp -> template(a={$rel_exp.st})"<a>"
    ; 
  
rel_exp
:^(o=(RELOP|CONT_RELOP|DISC_RELOP) a=bi_exp b=bi_exp) -> template(a={$a.st}, b={$b.st}, o={$o.text})"<a><o><b>"
;

bi_exp
:^(o=OPER a=primary_exp b=bi_exp) -> template(a={$a.st}, b={$b.st}, o={$o.text})"<a><o><b>"
|primary_exp -> template(a={$primary_exp.st})"<a>"
;
  
primary_exp
: 
ID -> {%{$ID.text}}
| INT -> {%{$INT.text}}
| FLOAT -> {%{$FLOAT.text}}
| '(' bi_exp ')' -> template(a={$bi_exp.st})"(<a>)"
;
