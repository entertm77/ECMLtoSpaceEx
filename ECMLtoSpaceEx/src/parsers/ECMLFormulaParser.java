// $ANTLR 3.4 ECMLFormula.g 2012-11-19 19:07:09

package parsers;
import org.apache.log4j.Logger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ECMLFormulaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ECMLAND", "ECMLOR", "EQUAL", "FLOAT", "ID", "INT", "OPER", "RELOP", "SXAND", "SXOR", "WS", "'('", "')'", "'//'", "':'", "';'", "'='", "'A'", "'C'", "'D'", "'E'", "'['", "']'", "'d'"
    };

    public static final int EOF=-1;
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
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int ECMLAND=4;
    public static final int ECMLOR=5;
    public static final int EQUAL=6;
    public static final int FLOAT=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int OPER=10;
    public static final int RELOP=11;
    public static final int SXAND=12;
    public static final int SXOR=13;
    public static final int WS=14;

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
    // ECMLFormula.g:26:1: var_def : var_rate_class ID ':' var_type ( '=' constant )? ;
    public final ECMLFormulaParser.var_def_return var_def() throws RecognitionException {
        ECMLFormulaParser.var_def_return retval = new ECMLFormulaParser.var_def_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        ECMLFormulaParser.var_rate_class_return var_rate_class1 =null;

        ECMLFormulaParser.var_type_return var_type4 =null;

        ECMLFormulaParser.constant_return constant6 =null;


        Object ID2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;

        try {
            // ECMLFormula.g:27:3: ( var_rate_class ID ':' var_type ( '=' constant )? )
            // ECMLFormula.g:28:3: var_rate_class ID ':' var_type ( '=' constant )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_rate_class_in_var_def80);
            var_rate_class1=var_rate_class();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_rate_class1.getTree());

            ID2=(Token)match(input,ID,FOLLOW_ID_in_var_def82); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID2_tree = 
            (Object)adaptor.create(ID2)
            ;
            adaptor.addChild(root_0, ID2_tree);
            }

            char_literal3=(Token)match(input,18,FOLLOW_18_in_var_def84); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal3_tree = 
            (Object)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);
            }

            pushFollow(FOLLOW_var_type_in_var_def86);
            var_type4=var_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_type4.getTree());

            // ECMLFormula.g:28:34: ( '=' constant )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ECMLFormula.g:28:35: '=' constant
                    {
                    char_literal5=(Token)match(input,20,FOLLOW_20_in_var_def89); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal5_tree = 
                    (Object)adaptor.create(char_literal5)
                    ;
                    adaptor.addChild(root_0, char_literal5_tree);
                    }

                    pushFollow(FOLLOW_constant_in_var_def91);
                    constant6=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant6.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:31:1: var_rate_class : '[' var_rate_class_alphabet ']' ;
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
            // ECMLFormula.g:32:3: ( '[' var_rate_class_alphabet ']' )
            // ECMLFormula.g:33:3: '[' var_rate_class_alphabet ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal7=(Token)match(input,25,FOLLOW_25_in_var_rate_class108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);
            }

            pushFollow(FOLLOW_var_rate_class_alphabet_in_var_rate_class110);
            var_rate_class_alphabet8=var_rate_class_alphabet();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var_rate_class_alphabet8.getTree());

            char_literal9=(Token)match(input,26,FOLLOW_26_in_var_rate_class112); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = 
            (Object)adaptor.create(char_literal9)
            ;
            adaptor.addChild(root_0, char_literal9_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:36:1: var_rate_class_alphabet : ( 'A' | 'C' | 'D' | 'E' );
    public final ECMLFormulaParser.var_rate_class_alphabet_return var_rate_class_alphabet() throws RecognitionException {
        ECMLFormulaParser.var_rate_class_alphabet_return retval = new ECMLFormulaParser.var_rate_class_alphabet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try {
            // ECMLFormula.g:37:3: ( 'A' | 'C' | 'D' | 'E' )
            // ECMLFormula.g:
            {
            root_0 = (Object)adaptor.nil();


            set10=(Token)input.LT(1);

            if ( (input.LA(1) >= 21 && input.LA(1) <= 24) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set10)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:44:1: var_type : ID ;
    public final ECMLFormulaParser.var_type_return var_type() throws RecognitionException {
        ECMLFormulaParser.var_type_return retval = new ECMLFormulaParser.var_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID11=null;

        Object ID11_tree=null;

        try {
            // ECMLFormula.g:45:3: ( ID )
            // ECMLFormula.g:46:3: ID
            {
            root_0 = (Object)adaptor.nil();


            ID11=(Token)match(input,ID,FOLLOW_ID_in_var_type160); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID11_tree = 
            (Object)adaptor.create(ID11)
            ;
            adaptor.addChild(root_0, ID11_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


    public static class state_model_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "state_model"
    // ECMLFormula.g:48:1: state_model : ( 'd' '(' ID ')' '=' bi_expression | ID '=' bi_expression );
    public final ECMLFormulaParser.state_model_return state_model() throws RecognitionException {
        ECMLFormulaParser.state_model_return retval = new ECMLFormulaParser.state_model_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal12=null;
        Token char_literal13=null;
        Token ID14=null;
        Token char_literal15=null;
        Token char_literal16=null;
        Token ID18=null;
        Token char_literal19=null;
        ECMLFormulaParser.bi_expression_return bi_expression17 =null;

        ECMLFormulaParser.bi_expression_return bi_expression20 =null;


        Object char_literal12_tree=null;
        Object char_literal13_tree=null;
        Object ID14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal16_tree=null;
        Object ID18_tree=null;
        Object char_literal19_tree=null;

        try {
            // ECMLFormula.g:49:2: ( 'd' '(' ID ')' '=' bi_expression | ID '=' bi_expression )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ECMLFormula.g:49:3: 'd' '(' ID ')' '=' bi_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal12=(Token)match(input,27,FOLLOW_27_in_state_model170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal12_tree = 
                    (Object)adaptor.create(char_literal12)
                    ;
                    adaptor.addChild(root_0, char_literal12_tree);
                    }

                    char_literal13=(Token)match(input,15,FOLLOW_15_in_state_model172); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal13_tree = 
                    (Object)adaptor.create(char_literal13)
                    ;
                    adaptor.addChild(root_0, char_literal13_tree);
                    }

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_state_model174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID14_tree = 
                    (Object)adaptor.create(ID14)
                    ;
                    adaptor.addChild(root_0, ID14_tree);
                    }

                    char_literal15=(Token)match(input,16,FOLLOW_16_in_state_model176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal15_tree = 
                    (Object)adaptor.create(char_literal15)
                    ;
                    adaptor.addChild(root_0, char_literal15_tree);
                    }

                    char_literal16=(Token)match(input,20,FOLLOW_20_in_state_model178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal16_tree = 
                    (Object)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);
                    }

                    pushFollow(FOLLOW_bi_expression_in_state_model180);
                    bi_expression17=bi_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_expression17.getTree());

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:50:4: ID '=' bi_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    ID18=(Token)match(input,ID,FOLLOW_ID_in_state_model185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID18_tree = 
                    (Object)adaptor.create(ID18)
                    ;
                    adaptor.addChild(root_0, ID18_tree);
                    }

                    char_literal19=(Token)match(input,20,FOLLOW_20_in_state_model187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal19_tree = 
                    (Object)adaptor.create(char_literal19)
                    ;
                    adaptor.addChild(root_0, char_literal19_tree);
                    }

                    pushFollow(FOLLOW_bi_expression_in_state_model189);
                    bi_expression20=bi_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_expression20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "state_model"


    protected static class connection_contents_scope {
        List<Tree> cond_arr;
    }
    protected Stack connection_contents_stack = new Stack();


    public static class connection_contents_return extends ParserRuleReturnScope {
        public String label;
        public Tree[] conditions;
        public Tree actions;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection_contents"
    // ECMLFormula.g:55:1: connection_contents returns [String label, Tree[] conditions, Tree actions] : ID '[' condition_expression ']' ( '//' b= action_expression | '//' )? ;
    public final ECMLFormulaParser.connection_contents_return connection_contents() throws RecognitionException {
        connection_contents_stack.push(new connection_contents_scope());
        ECMLFormulaParser.connection_contents_return retval = new ECMLFormulaParser.connection_contents_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token string_literal25=null;
        Token string_literal26=null;
        ECMLFormulaParser.action_expression_return b =null;

        ECMLFormulaParser.condition_expression_return condition_expression23 =null;


        Object ID21_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object string_literal25_tree=null;
        Object string_literal26_tree=null;


          ((connection_contents_scope)connection_contents_stack.peek()).cond_arr = new ArrayList<Tree>();
          
        try {
            // ECMLFormula.g:62:3: ( ID '[' condition_expression ']' ( '//' b= action_expression | '//' )? )
            // ECMLFormula.g:63:3: ID '[' condition_expression ']' ( '//' b= action_expression | '//' )?
            {
            root_0 = (Object)adaptor.nil();


            ID21=(Token)match(input,ID,FOLLOW_ID_in_connection_contents229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID21_tree = 
            (Object)adaptor.create(ID21)
            ;
            adaptor.addChild(root_0, ID21_tree);
            }

            char_literal22=(Token)match(input,25,FOLLOW_25_in_connection_contents231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = 
            (Object)adaptor.create(char_literal22)
            ;
            adaptor.addChild(root_0, char_literal22_tree);
            }

            pushFollow(FOLLOW_condition_expression_in_connection_contents233);
            condition_expression23=condition_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_expression23.getTree());

            char_literal24=(Token)match(input,26,FOLLOW_26_in_connection_contents236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = 
            (Object)adaptor.create(char_literal24)
            ;
            adaptor.addChild(root_0, char_literal24_tree);
            }

            // ECMLFormula.g:64:3: ( '//' b= action_expression | '//' )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF) ) {
                    alt3=2;
                }
            }
            switch (alt3) {
                case 1 :
                    // ECMLFormula.g:65:5: '//' b= action_expression
                    {
                    string_literal25=(Token)match(input,17,FOLLOW_17_in_connection_contents246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal25_tree = 
                    (Object)adaptor.create(string_literal25)
                    ;
                    adaptor.addChild(root_0, string_literal25_tree);
                    }

                    pushFollow(FOLLOW_action_expression_in_connection_contents250);
                    b=action_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

                    if ( state.backtracking==0 ) { retval.actions = (Tree)(b!=null?((Object)b.tree):null);}

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:66:7: '//'
                    {
                    string_literal26=(Token)match(input,17,FOLLOW_17_in_connection_contents259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal26_tree = 
                    (Object)adaptor.create(string_literal26)
                    ;
                    adaptor.addChild(root_0, string_literal26_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {retval.conditions = ((connection_contents_scope)connection_contents_stack.peek()).cond_arr.toArray(new Tree[((connection_contents_scope)connection_contents_stack.peek()).cond_arr.size()]);
              }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            connection_contents_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "connection_contents"


    public static class condition_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_expression"
    // ECMLFormula.g:70:1: condition_expression : a= and_expression ( ECMLOR b= and_expression )* ;
    public final ECMLFormulaParser.condition_expression_return condition_expression() throws RecognitionException {
        ECMLFormulaParser.condition_expression_return retval = new ECMLFormulaParser.condition_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ECMLOR27=null;
        ECMLFormulaParser.and_expression_return a =null;

        ECMLFormulaParser.and_expression_return b =null;


        Object ECMLOR27_tree=null;

        try {
            // ECMLFormula.g:71:3: (a= and_expression ( ECMLOR b= and_expression )* )
            // ECMLFormula.g:72:3: a= and_expression ( ECMLOR b= and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_condition_expression282);
            a=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

            if ( state.backtracking==0 ) {((connection_contents_scope)connection_contents_stack.peek()).cond_arr.add((Tree)(a!=null?((Object)a.tree):null));}

            // ECMLFormula.g:72:72: ( ECMLOR b= and_expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ECMLOR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ECMLFormula.g:72:73: ECMLOR b= and_expression
            	    {
            	    ECMLOR27=(Token)match(input,ECMLOR,FOLLOW_ECMLOR_in_condition_expression286); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ECMLOR27_tree = 
            	    (Object)adaptor.create(ECMLOR27)
            	    ;
            	    adaptor.addChild(root_0, ECMLOR27_tree);
            	    }

            	    pushFollow(FOLLOW_and_expression_in_condition_expression290);
            	    b=and_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, b.getTree());

            	    if ( state.backtracking==0 ) {((connection_contents_scope)connection_contents_stack.peek()).cond_arr.add((Tree)(b!=null?((Object)b.tree):null));}

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:75:1: and_expression : ( relational_expression ECMLAND and_expression -> ^( SXAND relational_expression and_expression ) | relational_expression );
    public final ECMLFormulaParser.and_expression_return and_expression() throws RecognitionException {
        ECMLFormulaParser.and_expression_return retval = new ECMLFormulaParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ECMLAND29=null;
        ECMLFormulaParser.relational_expression_return relational_expression28 =null;

        ECMLFormulaParser.and_expression_return and_expression30 =null;

        ECMLFormulaParser.relational_expression_return relational_expression31 =null;


        Object ECMLAND29_tree=null;
        RewriteRuleTokenStream stream_ECMLAND=new RewriteRuleTokenStream(adaptor,"token ECMLAND");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");
        try {
            // ECMLFormula.g:76:3: ( relational_expression ECMLAND and_expression -> ^( SXAND relational_expression and_expression ) | relational_expression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred9_ECMLFormula()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
                }
                break;
            case FLOAT:
            case INT:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred9_ECMLFormula()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;

                }
                }
                break;
            case 15:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred9_ECMLFormula()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // ECMLFormula.g:77:4: relational_expression ECMLAND and_expression
                    {
                    pushFollow(FOLLOW_relational_expression_in_and_expression309);
                    relational_expression28=relational_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression28.getTree());

                    ECMLAND29=(Token)match(input,ECMLAND,FOLLOW_ECMLAND_in_and_expression311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ECMLAND.add(ECMLAND29);


                    pushFollow(FOLLOW_and_expression_in_and_expression313);
                    and_expression30=and_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_and_expression.add(and_expression30.getTree());

                    // AST REWRITE
                    // elements: relational_expression, and_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:49: -> ^( SXAND relational_expression and_expression )
                    {
                        // ECMLFormula.g:77:52: ^( SXAND relational_expression and_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SXAND, "SXAND")
                        , root_1);

                        adaptor.addChild(root_1, stream_relational_expression.nextTree());

                        adaptor.addChild(root_1, stream_and_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:78:5: relational_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_relational_expression_in_and_expression329);
                    relational_expression31=relational_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression31.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:81:1: relational_expression : a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) ;
    public final ECMLFormulaParser.relational_expression_return relational_expression() throws RecognitionException {
        ECMLFormulaParser.relational_expression_return retval = new ECMLFormulaParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token o=null;
        Token RELOP32=null;
        ECMLFormulaParser.bi_expression_return a =null;

        ECMLFormulaParser.bi_expression_return b =null;


        Object o_tree=null;
        Object RELOP32_tree=null;
        RewriteRuleTokenStream stream_RELOP=new RewriteRuleTokenStream(adaptor,"token RELOP");
        RewriteRuleSubtreeStream stream_bi_expression=new RewriteRuleSubtreeStream(adaptor,"rule bi_expression");
        try {
            // ECMLFormula.g:82:3: (a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) )
            // ECMLFormula.g:83:3: a= bi_expression o= ( RELOP ) b= bi_expression
            {
            pushFollow(FOLLOW_bi_expression_in_relational_expression349);
            a=bi_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bi_expression.add(a.getTree());

            // ECMLFormula.g:83:21: ( RELOP )
            // ECMLFormula.g:83:22: RELOP
            {
            RELOP32=(Token)match(input,RELOP,FOLLOW_RELOP_in_relational_expression354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RELOP.add(RELOP32);


            }


            pushFollow(FOLLOW_bi_expression_in_relational_expression359);
            b=bi_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bi_expression.add(b.getTree());

            // AST REWRITE
            // elements: a, b, RELOP
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:5: -> ^( RELOP $a $b)
            {
                // ECMLFormula.g:85:7: ^( RELOP $a $b)
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

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:88:1: action_expressions : action_expression ( ';' ^ action_expression )* ;
    public final ECMLFormulaParser.action_expressions_return action_expressions() throws RecognitionException {
        ECMLFormulaParser.action_expressions_return retval = new ECMLFormulaParser.action_expressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal34=null;
        ECMLFormulaParser.action_expression_return action_expression33 =null;

        ECMLFormulaParser.action_expression_return action_expression35 =null;


        Object char_literal34_tree=null;

        try {
            // ECMLFormula.g:89:3: ( action_expression ( ';' ^ action_expression )* )
            // ECMLFormula.g:90:3: action_expression ( ';' ^ action_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_action_expression_in_action_expressions396);
            action_expression33=action_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, action_expression33.getTree());

            // ECMLFormula.g:90:21: ( ';' ^ action_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ECMLFormula.g:90:22: ';' ^ action_expression
            	    {
            	    char_literal34=(Token)match(input,19,FOLLOW_19_in_action_expressions399); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal34_tree = 
            	    (Object)adaptor.create(char_literal34)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal34_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_action_expression_in_action_expressions403);
            	    action_expression35=action_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, action_expression35.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:93:1: action_expression : ID '=' bi_expression ;
    public final ECMLFormulaParser.action_expression_return action_expression() throws RecognitionException {
        ECMLFormulaParser.action_expression_return retval = new ECMLFormulaParser.action_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID36=null;
        Token char_literal37=null;
        ECMLFormulaParser.bi_expression_return bi_expression38 =null;


        Object ID36_tree=null;
        Object char_literal37_tree=null;

        try {
            // ECMLFormula.g:94:3: ( ID '=' bi_expression )
            // ECMLFormula.g:95:3: ID '=' bi_expression
            {
            root_0 = (Object)adaptor.nil();


            ID36=(Token)match(input,ID,FOLLOW_ID_in_action_expression420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID36_tree = 
            (Object)adaptor.create(ID36)
            ;
            adaptor.addChild(root_0, ID36_tree);
            }

            char_literal37=(Token)match(input,20,FOLLOW_20_in_action_expression422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = 
            (Object)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);
            }

            pushFollow(FOLLOW_bi_expression_in_action_expression424);
            bi_expression38=bi_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_expression38.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:98:1: bi_expression : ( primary_expression ) ( OPER ^ primary_expression )* ;
    public final ECMLFormulaParser.bi_expression_return bi_expression() throws RecognitionException {
        ECMLFormulaParser.bi_expression_return retval = new ECMLFormulaParser.bi_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPER40=null;
        ECMLFormulaParser.primary_expression_return primary_expression39 =null;

        ECMLFormulaParser.primary_expression_return primary_expression41 =null;


        Object OPER40_tree=null;

        try {
            // ECMLFormula.g:99:3: ( ( primary_expression ) ( OPER ^ primary_expression )* )
            // ECMLFormula.g:100:3: ( primary_expression ) ( OPER ^ primary_expression )*
            {
            root_0 = (Object)adaptor.nil();


            // ECMLFormula.g:100:3: ( primary_expression )
            // ECMLFormula.g:100:4: primary_expression
            {
            pushFollow(FOLLOW_primary_expression_in_bi_expression440);
            primary_expression39=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression39.getTree());

            }


            // ECMLFormula.g:100:24: ( OPER ^ primary_expression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ECMLFormula.g:100:25: OPER ^ primary_expression
            	    {
            	    OPER40=(Token)match(input,OPER,FOLLOW_OPER_in_bi_expression444); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OPER40_tree = 
            	    (Object)adaptor.create(OPER40)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OPER40_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_primary_expression_in_bi_expression447);
            	    primary_expression41=primary_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression41.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // ECMLFormula.g:103:1: primary_expression : ( ID | constant | '(' bi_expression ')' );
    public final ECMLFormulaParser.primary_expression_return primary_expression() throws RecognitionException {
        ECMLFormulaParser.primary_expression_return retval = new ECMLFormulaParser.primary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID42=null;
        Token char_literal44=null;
        Token char_literal46=null;
        ECMLFormulaParser.constant_return constant43 =null;

        ECMLFormulaParser.bi_expression_return bi_expression45 =null;


        Object ID42_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;

        try {
            // ECMLFormula.g:104:3: ( ID | constant | '(' bi_expression ')' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt8=1;
                }
                break;
            case FLOAT:
            case INT:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // ECMLFormula.g:105:3: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID42=(Token)match(input,ID,FOLLOW_ID_in_primary_expression464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID42_tree = 
                    (Object)adaptor.create(ID42)
                    ;
                    adaptor.addChild(root_0, ID42_tree);
                    }

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:106:5: constant
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_primary_expression470);
                    constant43=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant43.getTree());

                    }
                    break;
                case 3 :
                    // ECMLFormula.g:107:5: '(' bi_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal44=(Token)match(input,15,FOLLOW_15_in_primary_expression476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal44_tree = 
                    (Object)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);
                    }

                    pushFollow(FOLLOW_bi_expression_in_primary_expression478);
                    bi_expression45=bi_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bi_expression45.getTree());

                    char_literal46=(Token)match(input,16,FOLLOW_16_in_primary_expression480); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = 
                    (Object)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // ECMLFormula.g:110:1: constant : ( INT | FLOAT );
    public final ECMLFormulaParser.constant_return constant() throws RecognitionException {
        ECMLFormulaParser.constant_return retval = new ECMLFormulaParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set47=null;

        Object set47_tree=null;

        try {
            // ECMLFormula.g:111:3: ( INT | FLOAT )
            // ECMLFormula.g:
            {
            root_0 = (Object)adaptor.nil();


            set47=(Token)input.LT(1);

            if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set47)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    // $ANTLR start synpred9_ECMLFormula
    public final void synpred9_ECMLFormula_fragment() throws RecognitionException {
        // ECMLFormula.g:77:4: ( relational_expression ECMLAND and_expression )
        // ECMLFormula.g:77:4: relational_expression ECMLAND and_expression
        {
        pushFollow(FOLLOW_relational_expression_in_synpred9_ECMLFormula309);
        relational_expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,ECMLAND,FOLLOW_ECMLAND_in_synpred9_ECMLFormula311); if (state.failed) return ;

        pushFollow(FOLLOW_and_expression_in_synpred9_ECMLFormula313);
        and_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_ECMLFormula

    // Delegated rules

    public final boolean synpred9_ECMLFormula() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_ECMLFormula_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_var_rate_class_in_var_def80 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_var_def82 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_var_def84 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_var_type_in_var_def86 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_var_def89 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_constant_in_var_def91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_var_rate_class108 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_var_rate_class_alphabet_in_var_rate_class110 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_var_rate_class112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var_type160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_state_model170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_state_model172 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_state_model174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_state_model176 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_state_model178 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_bi_expression_in_state_model180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_state_model185 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_state_model187 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_bi_expression_in_state_model189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_connection_contents229 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_connection_contents231 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_condition_expression_in_connection_contents233 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_connection_contents236 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_connection_contents246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_action_expression_in_connection_contents250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_connection_contents259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression282 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ECMLOR_in_condition_expression286 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression290 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ECMLAND_in_and_expression311 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_and_expression_in_and_expression313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression349 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RELOP_in_relational_expression354 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions396 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_action_expressions399 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions403 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_action_expression420 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_action_expression422 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_bi_expression_in_action_expression424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression440 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OPER_in_bi_expression444 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression447 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_primary_expression464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primary_expression476 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_bi_expression_in_primary_expression478 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary_expression480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_synpred9_ECMLFormula309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ECMLAND_in_synpred9_ECMLFormula311 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_and_expression_in_synpred9_ECMLFormula313 = new BitSet(new long[]{0x0000000000000002L});

}