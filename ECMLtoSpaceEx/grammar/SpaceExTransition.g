tree grammar SpaceExTransition;

options {
  language     = Java;
  tokenVocab   = ECMLFormula;
  ASTLabelType = CommonTree;
  output       = template;
}

@header {
package spaceex;
  import org.apache.log4j.Logger;
}

@members {
private static Logger log = Logger.getLogger(SpaceExTransition.class);
}

condition_expression returns [ArrayList<String> string_list]
@init {
$string_list = new ArrayList<String>();
}
  :
  ^('||' a=and_expression b=and_expression{log.debug($a.st);
   $string_list.add($a.st.toString());
    log.debug($b.st);
    $string_list.add($b.st.toString());})
   | c=and_expression 
                     {
                      log.debug("and_expression : " + $c.st);
                      $string_list.add($c.st.toString());
                     }
  ;

and_expression returns []
scope{
  List<String> neg_list;
  List<String> neg_bound_list;
}
@init{
 $and_expression::neg_list = new ArrayList<String>();
  $and_expression::neg_bound_list = new ArrayList<String>();
}
  :
  ^('&&' a=relational_expression b=and_expression {$and_expression::neg_list.add($a.neg); $and_expression::neg_bound_list.add($a.neg_bound);}
  )
    -> template(a={$a.st}, b={$b.st})"<a>&<b>" 
    | c=relational_expression -> template(c={$c.st}) "<c>"
  ;

relational_expression returns [String neg,String neg_bound]

  :
  ^(o=RELOP a=bi_expression b=bi_expression)
    ->
      template(a={$a.st}, o={$o.text}, b={$b.st})"<a><o><b>"  
  ;

bi_expression returns []
  :
  ^(o=OPER a=primary_expression b=bi_expression)
    ->
      template(a={$a.st}, o={$o.text}, b={$b.st})"<a><o><b>"
  | c=primary_expression -> template(c={$c.st}) "<c>" 
  ;

primary_expression
  :
  identifier -> template(a={$identifier.st}) "<a>"
  | constant -> template(a={$constant.st}) "<a>"
  | '(' bi_expression ')'->template(a={$bi_expression.st}) "(<a>)"
  ;

identifier
  :
  ID -> {%{$ID.text}}
  ;

constant
  :
  DECIMAL_LITERAL -> {%{$DECIMAL_LITERAL.text}}
  | FLOATING_POINT_LITERAL -> {%{$FLOATING_POINT_LITERAL.text}}
  ;
