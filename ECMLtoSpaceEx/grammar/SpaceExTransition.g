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

condition_expression returns [ArrayList<Object> tree_list]
@init {
$tree_list = new ArrayList<Object>();
}
  :
  ^('||' a=and_expression b=and_expression
                                           {   $tree_list.add($a.st);
                                                $tree_list.add($b.st);
                                           }
)
  | c=and_expression 
                     {
                      log.debug("and_expression : " + $c.st);
                                            $tree_list.add($c.st);
                     }
  ;

and_expression returns []
scope {
List<String> loc_inv_list;
}
@init {
$and_expression::loc_inv_list = new ArrayList<String>();
}
  :
  ^('&&' a=relational_expression b=and_expression)
    ->
      template(a={$a.st}, b={$b.st})"<a>&<b>"
  | c=relational_expression{$and_expression::loc_inv_list.addAll($c.neg_bnd_list);}
    ->
      template(c={$c.st})"<c>"
  ;

relational_expression returns [List<String> neg_bnd_list, String pos_bnd]
@init {
$neg_bnd_list = new ArrayList<String>();
}
  :
  ^(o=RELOP a=bi_expression b=bi_expression 
   {
   if($o.text==">=" || $o.text==">"){
   $neg_bnd_list.add($a.st + "<=" + $b.st);}
   else if($o.text=="<=" || $o.text=="<")
   $neg_bnd_list.add($a.st + ">=" + $b.st);
   else if($o.text=="=="){
   $neg_bnd_list.add($a.st + ">=" + $b.st);
   $neg_bnd_list.add($a.st + "<=" + $b.st);
   }
   }
)
    ->
      template(a={$a.st}, o={$o.text}, b={$b.st})"<a><o><b>"
  ;

bi_expression returns []
  :
  ^(o=OPER a=primary_expression b=bi_expression)
    ->
      template(a={$a.st}, o={$o.text}, b={$b.st})"<a><o><b>"
  | c=primary_expression
    ->
      template(c={$c.st})"<c>"
  ;

primary_expression
  :
  identifier
    ->
      template(a={$identifier.st})"<a>"
  | constant
    ->
      template(a={$constant.st})"<a>"
  | '(' bi_expression ')'
    ->
      template(a={$bi_expression.st})"(<a>)"
  ;

identifier
  :
  ID
    ->
      {%{$ID.text}}
  ;

constant
  :
  DECIMAL_LITERAL
    ->
      {%{$DECIMAL_LITERAL.text}}
  | FLOATING_POINT_LITERAL
    ->
      {%{$FLOATING_POINT_LITERAL.text}}
  ;
