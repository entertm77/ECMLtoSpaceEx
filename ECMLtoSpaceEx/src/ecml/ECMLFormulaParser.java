// $ANTLR 3.4 ECMLFormula.g 2012-11-08 11:06:32

package ecml;
import org.apache.log4j.Logger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ECMLFormulaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUAL", "FLOAT", "ID", "INT", "OPER", "RELOP", "WS", "'&&'", "'('", "')'", "'//'", "':'", "';'", "'='", "'A'", "'C'", "'D'", "'E'", "'['", "']'", "'||'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int EQUAL=4;
    public static final int FLOAT=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int OPER=8;
    public static final int RELOP=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ECMLFormulaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ECMLFormulaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ECMLFormulaParser.tokenNames; }
    public String getGrammarFileName() { return "ECMLFormula.g"; }


      private static Logger log = Logger.getLogger(ECMLFormulaParser.class);


    public static class var_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_def"
    // ECMLFormula.g:25:1: var_def : var_rate_class identifier ':' var_type ( '=' constant )? ;
    public final ECMLFormulaParser.var_def_return var_def() throws RecognitionException {
        ECMLFormulaParser.var_def_return retval = new ECMLFormulaParser.var_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        ECMLFormulaParser.var_rate_class_return var_rate_class1 =null;

        ECMLFormulaParser.identifier_return identifier2 =null;

        ECMLFormulaParser.var_type_return var_type4 =null;

        ECMLFormulaParser.constant_return constant6 =null;


        Object char_literal3_tree=null;
        Object char_literal5_tree=null;

        try {
            // ECMLFormula.g:26:3: ( var_rate_class identifier ':' var_type ( '=' constant )? )
            // ECMLFormula.g:27:3: var_rate_class identifier ':' var_type ( '=' constant )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_rate_class_in_var_def73);
            var_rate_class1=var_rate_class();

            state._fsp--;

            adaptor.addChild(root_0, var_rate_class1.getTree());

            pushFollow(FOLLOW_identifier_in_var_def75);
            identifier2=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier2.getTree());

            char_literal3=(Token)match(input,15,FOLLOW_15_in_var_def77); 
            char_literal3_tree = 
            (Object)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);


            pushFollow(FOLLOW_var_type_in_var_def79);
            var_type4=var_type();

            state._fsp--;

            adaptor.addChild(root_0, var_type4.getTree());

            // ECMLFormula.g:27:42: ( '=' constant )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ECMLFormula.g:27:43: '=' constant
                    {
                    char_literal5=(Token)match(input,17,FOLLOW_17_in_var_def82); 
                    char_literal5_tree = 
                    (Object)adaptor.create(char_literal5)
                    ;
                    adaptor.addChild(root_0, char_literal5_tree);


                    pushFollow(FOLLOW_constant_in_var_def84);
                    constant6=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant6.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_def"


    public static class var_rate_class_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_rate_class"
    // ECMLFormula.g:30:1: var_rate_class : '[' var_rate_class_alphabet ']' ;
    public final ECMLFormulaParser.var_rate_class_return var_rate_class() throws RecognitionException {
        ECMLFormulaParser.var_rate_class_return retval = new ECMLFormulaParser.var_rate_class_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token char_literal9=null;
        ECMLFormulaParser.var_rate_class_alphabet_return var_rate_class_alphabet8 =null;


        Object char_literal7_tree=null;
        Object char_literal9_tree=null;

        try {
            // ECMLFormula.g:31:3: ( '[' var_rate_class_alphabet ']' )
            // ECMLFormula.g:32:3: '[' var_rate_class_alphabet ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal7=(Token)match(input,22,FOLLOW_22_in_var_rate_class101); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_var_rate_class_alphabet_in_var_rate_class103);
            var_rate_class_alphabet8=var_rate_class_alphabet();

            state._fsp--;

            adaptor.addChild(root_0, var_rate_class_alphabet8.getTree());

            char_literal9=(Token)match(input,23,FOLLOW_23_in_var_rate_class105); 
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_rate_class"


    public static class var_rate_class_alphabet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_rate_class_alphabet"
    // ECMLFormula.g:35:1: var_rate_class_alphabet : ( 'A' | 'C' | 'D' | 'E' );
    public final ECMLFormulaParser.var_rate_class_alphabet_return var_rate_class_alphabet() throws RecognitionException {
        ECMLFormulaParser.var_rate_class_alphabet_return retval = new ECMLFormulaParser.var_rate_class_alphabet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try {
            // ECMLFormula.g:36:3: ( 'A' | 'C' | 'D' | 'E' )
            // ECMLFormula.g:
            {
            root_0 = (Object)adaptor.nil();


            set10=(Token)input.LT(1);

            if ( (input.LA(1) >= 18 && input.LA(1) <= 21) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set10)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_rate_class_alphabet"


    public static class var_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_type"
    // ECMLFormula.g:43:1: var_type : identifier ;
    public final ECMLFormulaParser.var_type_return var_type() throws RecognitionException {
        ECMLFormulaParser.var_type_return retval = new ECMLFormulaParser.var_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ECMLFormulaParser.identifier_return identifier11 =null;



        try {
            // ECMLFormula.g:44:3: ( identifier )
            // ECMLFormula.g:45:3: identifier
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_var_type153);
            identifier11=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier11.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_type"


    public static class connection_contents_return extends ParserRuleReturnScope {
        public Tree condition;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection_contents"
    // ECMLFormula.g:50:1: connection_contents returns [Tree condition] : identifier '[' a= condition_expression ']' ( '//' action_expression | '//' )? ;
    public final ECMLFormulaParser.connection_contents_return connection_contents() throws RecognitionException {
        ECMLFormulaParser.connection_contents_return retval = new ECMLFormulaParser.connection_contents_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token string_literal17=null;
        ECMLFormulaParser.condition_expression_return a =null;

        ECMLFormulaParser.identifier_return identifier12 =null;

        ECMLFormulaParser.action_expression_return action_expression16 =null;


        Object char_literal13_tree=null;
        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal17_tree=null;

        try {
            // ECMLFormula.g:51:3: ( identifier '[' a= condition_expression ']' ( '//' action_expression | '//' )? )
            // ECMLFormula.g:52:3: identifier '[' a= condition_expression ']' ( '//' action_expression | '//' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_connection_contents174);
            identifier12=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier12.getTree());

            char_literal13=(Token)match(input,22,FOLLOW_22_in_connection_contents176); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            pushFollow(FOLLOW_condition_expression_in_connection_contents180);
            a=condition_expression();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

            char_literal14=(Token)match(input,23,FOLLOW_23_in_connection_contents182); 
            char_literal14_tree = 
            (Object)adaptor.create(char_literal14)
            ;
            adaptor.addChild(root_0, char_literal14_tree);


            // ECMLFormula.g:53:3: ( '//' action_expression | '//' )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF) ) {
                    alt2=2;
                }
            }
            switch (alt2) {
                case 1 :
                    // ECMLFormula.g:54:5: '//' action_expression
                    {
                    string_literal15=(Token)match(input,14,FOLLOW_14_in_connection_contents192); 
                    string_literal15_tree = 
                    (Object)adaptor.create(string_literal15)
                    ;
                    adaptor.addChild(root_0, string_literal15_tree);


                    pushFollow(FOLLOW_action_expression_in_connection_contents194);
                    action_expression16=action_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, action_expression16.getTree());

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:55:7: '//'
                    {
                    string_literal17=(Token)match(input,14,FOLLOW_14_in_connection_contents202); 
                    string_literal17_tree = 
                    (Object)adaptor.create(string_literal17)
                    ;
                    adaptor.addChild(root_0, string_literal17_tree);


                    }
                    break;

            }



                retval.condition = (Tree)(a!=null?((Object)a.tree):null);
               

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "connection_contents"


    public static class condition_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_expression"
    // ECMLFormula.g:63:1: condition_expression : and_expression ( '||' ^ and_expression )* ;
    public final ECMLFormulaParser.condition_expression_return condition_expression() throws RecognitionException {
        ECMLFormulaParser.condition_expression_return retval = new ECMLFormulaParser.condition_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal19=null;
        ECMLFormulaParser.and_expression_return and_expression18 =null;

        ECMLFormulaParser.and_expression_return and_expression20 =null;


        Object string_literal19_tree=null;

        try {
            // ECMLFormula.g:64:3: ( and_expression ( '||' ^ and_expression )* )
            // ECMLFormula.g:65:3: and_expression ( '||' ^ and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_condition_expression230);
            and_expression18=and_expression();

            state._fsp--;

            adaptor.addChild(root_0, and_expression18.getTree());

            // ECMLFormula.g:65:18: ( '||' ^ and_expression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ECMLFormula.g:65:19: '||' ^ and_expression
            	    {
            	    string_literal19=(Token)match(input,24,FOLLOW_24_in_condition_expression233); 
            	    string_literal19_tree = 
            	    (Object)adaptor.create(string_literal19)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal19_tree, root_0);


            	    pushFollow(FOLLOW_and_expression_in_condition_expression236);
            	    and_expression20=and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expression20.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // ECMLFormula.g:68:1: and_expression : relational_expression ( '&&' ^ relational_expression )* ;
    public final ECMLFormulaParser.and_expression_return and_expression() throws RecognitionException {
        ECMLFormulaParser.and_expression_return retval = new ECMLFormulaParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal22=null;
        ECMLFormulaParser.relational_expression_return relational_expression21 =null;

        ECMLFormulaParser.relational_expression_return relational_expression23 =null;


        Object string_literal22_tree=null;

        try {
            // ECMLFormula.g:69:3: ( relational_expression ( '&&' ^ relational_expression )* )
            // ECMLFormula.g:70:3: relational_expression ( '&&' ^ relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_and_expression253);
            relational_expression21=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression21.getTree());

            // ECMLFormula.g:70:25: ( '&&' ^ relational_expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ECMLFormula.g:70:26: '&&' ^ relational_expression
            	    {
            	    string_literal22=(Token)match(input,11,FOLLOW_11_in_and_expression256); 
            	    string_literal22_tree = 
            	    (Object)adaptor.create(string_literal22)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal22_tree, root_0);


            	    pushFollow(FOLLOW_relational_expression_in_and_expression259);
            	    relational_expression23=relational_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_expression23.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // ECMLFormula.g:73:1: relational_expression : a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) ;
    public final ECMLFormulaParser.relational_expression_return relational_expression() throws RecognitionException {
        ECMLFormulaParser.relational_expression_return retval = new ECMLFormulaParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token o=null;
        Token RELOP24=null;
        ECMLFormulaParser.bi_expression_return a =null;

        ECMLFormulaParser.bi_expression_return b =null;


        Object o_tree=null;
        Object RELOP24_tree=null;
        RewriteRuleTokenStream stream_RELOP=new RewriteRuleTokenStream(adaptor,"token RELOP");
        RewriteRuleSubtreeStream stream_bi_expression=new RewriteRuleSubtreeStream(adaptor,"rule bi_expression");
        try {
            // ECMLFormula.g:74:3: (a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) )
            // ECMLFormula.g:75:3: a= bi_expression o= ( RELOP ) b= bi_expression
            {
            pushFollow(FOLLOW_bi_expression_in_relational_expression278);
            a=bi_expression();

            state._fsp--;

            stream_bi_expression.add(a.getTree());

            // ECMLFormula.g:75:22: ( RELOP )
            // ECMLFormula.g:75:23: RELOP
            {
            RELOP24=(Token)match(input,RELOP,FOLLOW_RELOP_in_relational_expression284);  
            stream_RELOP.add(RELOP24);


            }


            pushFollow(FOLLOW_bi_expression_in_relational_expression289);
            b=bi_expression();

            state._fsp--;

            stream_bi_expression.add(b.getTree());

            // AST REWRITE
            // elements: b, RELOP, a
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 76:5: -> ^( RELOP $a $b)
            {
                // ECMLFormula.g:77:7: ^( RELOP $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RELOP.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class action_expressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_expressions"
    // ECMLFormula.g:80:1: action_expressions : action_expression ( ';' ^ action_expression )* ;
    public final ECMLFormulaParser.action_expressions_return action_expressions() throws RecognitionException {
        ECMLFormulaParser.action_expressions_return retval = new ECMLFormulaParser.action_expressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal26=null;
        ECMLFormulaParser.action_expression_return action_expression25 =null;

        ECMLFormulaParser.action_expression_return action_expression27 =null;


        Object char_literal26_tree=null;

        try {
            // ECMLFormula.g:81:3: ( action_expression ( ';' ^ action_expression )* )
            // ECMLFormula.g:82:3: action_expression ( ';' ^ action_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_action_expression_in_action_expressions326);
            action_expression25=action_expression();

            state._fsp--;

            adaptor.addChild(root_0, action_expression25.getTree());

            // ECMLFormula.g:82:21: ( ';' ^ action_expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ECMLFormula.g:82:22: ';' ^ action_expression
            	    {
            	    char_literal26=(Token)match(input,16,FOLLOW_16_in_action_expressions329); 
            	    char_literal26_tree = 
            	    (Object)adaptor.create(char_literal26)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal26_tree, root_0);


            	    pushFollow(FOLLOW_action_expression_in_action_expressions332);
            	    action_expression27=action_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, action_expression27.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action_expressions"


    public static class action_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_expression"
    // ECMLFormula.g:85:1: action_expression : a= ID '=' b= bi_expression -> ^( EQUAL[\"=\"] $a $b) ;
    public final ECMLFormulaParser.action_expression_return action_expression() throws RecognitionException {
        ECMLFormulaParser.action_expression_return retval = new ECMLFormulaParser.action_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token a=null;
        Token char_literal28=null;
        ECMLFormulaParser.bi_expression_return b =null;


        Object a_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_bi_expression=new RewriteRuleSubtreeStream(adaptor,"rule bi_expression");
        try {
            // ECMLFormula.g:86:3: (a= ID '=' b= bi_expression -> ^( EQUAL[\"=\"] $a $b) )
            // ECMLFormula.g:87:3: a= ID '=' b= bi_expression
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_action_expression351);  
            stream_ID.add(a);


            char_literal28=(Token)match(input,17,FOLLOW_17_in_action_expression353);  
            stream_17.add(char_literal28);


            pushFollow(FOLLOW_bi_expression_in_action_expression357);
            b=bi_expression();

            state._fsp--;

            stream_bi_expression.add(b.getTree());

            // AST REWRITE
            // elements: a, b
            // token labels: a
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (Object)adaptor.nil();
            // 88:5: -> ^( EQUAL[\"=\"] $a $b)
            {
                // ECMLFormula.g:89:7: ^( EQUAL[\"=\"] $a $b)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EQUAL, "=")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action_expression"


    public static class bi_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bi_expression"
    // ECMLFormula.g:92:1: bi_expression : ( primary_expression ) ( OPER ^ primary_expression )* ;
    public final ECMLFormulaParser.bi_expression_return bi_expression() throws RecognitionException {
        ECMLFormulaParser.bi_expression_return retval = new ECMLFormulaParser.bi_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPER30=null;
        ECMLFormulaParser.primary_expression_return primary_expression29 =null;

        ECMLFormulaParser.primary_expression_return primary_expression31 =null;


        Object OPER30_tree=null;

        try {
            // ECMLFormula.g:93:3: ( ( primary_expression ) ( OPER ^ primary_expression )* )
            // ECMLFormula.g:94:3: ( primary_expression ) ( OPER ^ primary_expression )*
            {
            root_0 = (Object)adaptor.nil();


            // ECMLFormula.g:94:3: ( primary_expression )
            // ECMLFormula.g:94:4: primary_expression
            {
            pushFollow(FOLLOW_primary_expression_in_bi_expression396);
            primary_expression29=primary_expression();

            state._fsp--;

            adaptor.addChild(root_0, primary_expression29.getTree());

            }


            // ECMLFormula.g:94:24: ( OPER ^ primary_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OPER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ECMLFormula.g:94:25: OPER ^ primary_expression
            	    {
            	    OPER30=(Token)match(input,OPER,FOLLOW_OPER_in_bi_expression400); 
            	    OPER30_tree = 
            	    (Object)adaptor.create(OPER30)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OPER30_tree, root_0);


            	    pushFollow(FOLLOW_primary_expression_in_bi_expression403);
            	    primary_expression31=primary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, primary_expression31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bi_expression"


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // ECMLFormula.g:97:1: primary_expression : ( identifier | constant | '(' bi_expression ')' );
    public final ECMLFormulaParser.primary_expression_return primary_expression() throws RecognitionException {
        ECMLFormulaParser.primary_expression_return retval = new ECMLFormulaParser.primary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        ECMLFormulaParser.identifier_return identifier32 =null;

        ECMLFormulaParser.constant_return constant33 =null;

        ECMLFormulaParser.bi_expression_return bi_expression35 =null;


        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // ECMLFormula.g:98:3: ( identifier | constant | '(' bi_expression ')' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt7=1;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // ECMLFormula.g:99:3: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression420);
                    identifier32=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier32.getTree());

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:100:5: constant
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_primary_expression426);
                    constant33=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant33.getTree());

                    }
                    break;
                case 3 :
                    // ECMLFormula.g:101:5: '(' bi_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal34=(Token)match(input,12,FOLLOW_12_in_primary_expression432); 
                    char_literal34_tree = 
                    (Object)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    pushFollow(FOLLOW_bi_expression_in_primary_expression434);
                    bi_expression35=bi_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, bi_expression35.getTree());

                    char_literal36=(Token)match(input,13,FOLLOW_13_in_primary_expression436); 
                    char_literal36_tree = 
                    (Object)adaptor.create(char_literal36)
                    ;
                    adaptor.addChild(root_0, char_literal36_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // ECMLFormula.g:104:1: identifier : ID ;
    public final ECMLFormulaParser.identifier_return identifier() throws RecognitionException {
        ECMLFormulaParser.identifier_return retval = new ECMLFormulaParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID37=null;

        Object ID37_tree=null;

        try {
            // ECMLFormula.g:105:3: ( ID )
            // ECMLFormula.g:106:3: ID
            {
            root_0 = (Object)adaptor.nil();


            ID37=(Token)match(input,ID,FOLLOW_ID_in_identifier451); 
            ID37_tree = 
            (Object)adaptor.create(ID37)
            ;
            adaptor.addChild(root_0, ID37_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // ECMLFormula.g:109:1: constant : ( INT | FLOAT );
    public final ECMLFormulaParser.constant_return constant() throws RecognitionException {
        ECMLFormulaParser.constant_return retval = new ECMLFormulaParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // ECMLFormula.g:110:3: ( INT | FLOAT )
            // ECMLFormula.g:
            {
            root_0 = (Object)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set38)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"

    // Delegated rules


 

    public static final BitSet FOLLOW_var_rate_class_in_var_def73 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_var_def75 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_var_def77 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_var_type_in_var_def79 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_var_def82 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_constant_in_var_def84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_var_rate_class101 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_var_rate_class_alphabet_in_var_rate_class103 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_var_rate_class105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_var_type153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_connection_contents174 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_connection_contents176 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_condition_expression_in_connection_contents180 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_connection_contents182 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_connection_contents192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_action_expression_in_connection_contents194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_connection_contents202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression230 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_condition_expression233 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression236 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression253 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_and_expression256 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression259 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression278 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RELOP_in_relational_expression284 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions326 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_action_expressions329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions332 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ID_in_action_expression351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_action_expression353 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_bi_expression_in_action_expression357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression396 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_OPER_in_bi_expression400 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression403 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_identifier_in_primary_expression420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_primary_expression432 = new BitSet(new long[]{0x00000000000010E0L});
    public static final BitSet FOLLOW_bi_expression_in_primary_expression434 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_primary_expression436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier451 = new BitSet(new long[]{0x0000000000000002L});

}