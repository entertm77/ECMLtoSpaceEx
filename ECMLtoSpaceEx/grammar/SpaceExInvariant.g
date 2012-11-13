tree grammar SpaceExInvariant;

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
private static Logger log = Logger.getLogger(SpaceExInvariant.class);
public class AtomExp{
public List<String> neg_inv = new ArrayList<String>();
public String boundary = null;
public AtomExp(List<String> neg_inv, String boundary){
	neg_inv = this.neg_inv;
	boundary = this.boundary;
}
}
}


and_exp returns [List<AtomExp> atoms]
@init{
	$atoms= new ArrayList<AtomExp>();
}
  :
  ^('&&' a=rel_exp{$atoms.add(new AtomExp($a.neg_inv, $a.boundary));} b=rel_exp{$atoms.add(new AtomExp($b.neg_inv, $b.boundary));})
  |c=rel_exp{$atoms.add(new AtomExp($c.neg_inv, $c.boundary)); log.debug(" condition :" + $rel_exp.st);}
  ; 
  
rel_exp returns [List<String> neg_inv, String boundary]
@init{
$neg_inv = new ArrayList<String>();
}
:^(o=RELOP a=bi_exp b=bi_exp){ log.debug("create neginvariant");
if($o.text.equals(">=") || $o.text.equals(">")){
	$neg_inv.add($a.text + "<=" + $b.text);
	$boundary = $a.text + "==" + $b.text;
	
}else if($o.text.equals("<=") || $o.text.equals("<")){
	$neg_inv.add($a.text + ">=" + $b.text);
	$boundary = $a.text + "==" + $b.text;
}else if($o.text.equals("==")){
	$neg_inv.add($a.text + ">=" + $b.text);
	$neg_inv.add($a.text + "<=" + $b.text);
	$boundary = $a.text + "==" + $b.text;
}}
 ->  template(a={$a.st},  o={$o.text}, b={$b.st})"<a><o><b>"

;

bi_exp
:^(o=OPER a=primary_exp b=bi_exp) -> template(a={$a.st},  o={$o.text}, b={$b.st})"<a><o><b>"
|primary_exp 
;
  
primary_exp
: 
ID -> {%{$ID.text}}
| INT -> {%{$INT.text}}
| FLOAT -> {%{$FLOAT.text}}
|'(' bi_exp ')' -> template(a={$bi_exp.st})"(<a>)"
;
