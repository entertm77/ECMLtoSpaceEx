// $ANTLR 3.4 ECMLFormula.g 2012-11-13 19:53:16

package parsers;
import org.apache.log4j.Logger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ECMLFormulaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTVAR", "DISCVAR", "EQUAL", "FLOAT", "ID", "INT", "OPER", "RELOP", "WS", "'&&'", "'('", "')'", "'//'", "':'", "';'", "'='", "'A'", "'C'", "'D'", "'E'", "'['", "']'", "'||'"
    };

    public static final int EOF=-1;
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
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int CONTVAR=4;
    public static final int DISCVAR=5;
    public static final int EQUAL=6;
    public static final int FLOAT=7;
    public static final int ID=8;
    public static final int INT=9;
    public static final int OPER=10;
    public static final int RELOP=11;
    public static final int WS=12;

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
    // ECMLFormula.g:28:1: var_def : var_rate_class identifier ':' var_type ( '=' constant )? ;
    public final ECMLFormulaParser.var_def_return var_def() throws RecognitionException {
        traceIn("var_def", 1);
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
            // ECMLFormula.g:29:3: ( var_rate_class identifier ':' var_type ( '=' constant )? )
            // ECMLFormula.g:30:3: var_rate_class identifier ':' var_type ( '=' constant )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_var_rate_class_in_var_def85);
            var_rate_class1=var_rate_class();

            state._fsp--;

            adaptor.addChild(root_0, var_rate_class1.getTree());

            pushFollow(FOLLOW_identifier_in_var_def87);
            identifier2=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier2.getTree());

            char_literal3=(Token)match(input,17,FOLLOW_17_in_var_def89); 
            char_literal3_tree = 
            (Object)adaptor.create(char_literal3)
            ;
            adaptor.addChild(root_0, char_literal3_tree);


            pushFollow(FOLLOW_var_type_in_var_def91);
            var_type4=var_type();

            state._fsp--;

            adaptor.addChild(root_0, var_type4.getTree());

            // ECMLFormula.g:30:42: ( '=' constant )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ECMLFormula.g:30:43: '=' constant
                    {
                    char_literal5=(Token)match(input,19,FOLLOW_19_in_var_def94); 
                    char_literal5_tree = 
                    (Object)adaptor.create(char_literal5)
                    ;
                    adaptor.addChild(root_0, char_literal5_tree);


                    pushFollow(FOLLOW_constant_in_var_def96);
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
            traceOut("var_def", 1);
        }
        return retval;
    }
    // $ANTLR end "var_def"


    public static class var_rate_class_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_rate_class"
    // ECMLFormula.g:33:1: var_rate_class : '[' var_rate_class_alphabet ']' ;
    public final ECMLFormulaParser.var_rate_class_return var_rate_class() throws RecognitionException {
        traceIn("var_rate_class", 2);
        ECMLFormulaParser.var_rate_class_return retval = new ECMLFormulaParser.var_rate_class_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal7=null;
        Token char_literal9=null;
        ECMLFormulaParser.var_rate_class_alphabet_return var_rate_class_alphabet8 =null;


        Object char_literal7_tree=null;
        Object char_literal9_tree=null;

        try {
            // ECMLFormula.g:34:3: ( '[' var_rate_class_alphabet ']' )
            // ECMLFormula.g:35:3: '[' var_rate_class_alphabet ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal7=(Token)match(input,24,FOLLOW_24_in_var_rate_class113); 
            char_literal7_tree = 
            (Object)adaptor.create(char_literal7)
            ;
            adaptor.addChild(root_0, char_literal7_tree);


            pushFollow(FOLLOW_var_rate_class_alphabet_in_var_rate_class115);
            var_rate_class_alphabet8=var_rate_class_alphabet();

            state._fsp--;

            adaptor.addChild(root_0, var_rate_class_alphabet8.getTree());

            char_literal9=(Token)match(input,25,FOLLOW_25_in_var_rate_class117); 
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
            traceOut("var_rate_class", 2);
        }
        return retval;
    }
    // $ANTLR end "var_rate_class"


    public static class var_rate_class_alphabet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_rate_class_alphabet"
    // ECMLFormula.g:38:1: var_rate_class_alphabet : ( 'A' | 'C' | 'D' | 'E' );
    public final ECMLFormulaParser.var_rate_class_alphabet_return var_rate_class_alphabet() throws RecognitionException {
        traceIn("var_rate_class_alphabet", 3);
        ECMLFormulaParser.var_rate_class_alphabet_return retval = new ECMLFormulaParser.var_rate_class_alphabet_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try {
            // ECMLFormula.g:39:3: ( 'A' | 'C' | 'D' | 'E' )
            // ECMLFormula.g:
            {
            root_0 = (Object)adaptor.nil();


            set10=(Token)input.LT(1);

            if ( (input.LA(1) >= 20 && input.LA(1) <= 23) ) {
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
            traceOut("var_rate_class_alphabet", 3);
        }
        return retval;
    }
    // $ANTLR end "var_rate_class_alphabet"


    public static class var_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_type"
    // ECMLFormula.g:46:1: var_type : identifier ;
    public final ECMLFormulaParser.var_type_return var_type() throws RecognitionException {
        traceIn("var_type", 4);
        ECMLFormulaParser.var_type_return retval = new ECMLFormulaParser.var_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        ECMLFormulaParser.identifier_return identifier11 =null;



        try {
            // ECMLFormula.g:47:3: ( identifier )
            // ECMLFormula.g:48:3: identifier
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_var_type165);
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
            traceOut("var_type", 4);
        }
        return retval;
    }
    // $ANTLR end "var_type"


    protected static class connection_contents_scope {
        List<Tree> cond_arr;
        List<Tree> act_arr;
    }
    protected Stack connection_contents_stack = new Stack();


    public static class connection_contents_return extends ParserRuleReturnScope {
        public Tree[] conditions;
        public Tree[] actions;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "connection_contents"
    // ECMLFormula.g:53:1: connection_contents returns [Tree[] conditions, Tree[] actions] : identifier '[' condition_expression ']' ( '//' b= action_expression | '//' )? ;
    public final ECMLFormulaParser.connection_contents_return connection_contents() throws RecognitionException {
        traceIn("connection_contents", 5);
        connection_contents_stack.push(new connection_contents_scope());
        ECMLFormulaParser.connection_contents_return retval = new ECMLFormulaParser.connection_contents_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token string_literal17=null;
        ECMLFormulaParser.action_expression_return b =null;

        ECMLFormulaParser.identifier_return identifier12 =null;

        ECMLFormulaParser.condition_expression_return condition_expression14 =null;


        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        Object string_literal16_tree=null;
        Object string_literal17_tree=null;

        ((connection_contents_scope)connection_contents_stack.peek()).act_arr = new ArrayList<Tree>();
          ((connection_contents_scope)connection_contents_stack.peek()).cond_arr = new ArrayList<Tree>();
          
        try {
            // ECMLFormula.g:60:3: ( identifier '[' condition_expression ']' ( '//' b= action_expression | '//' )? )
            // ECMLFormula.g:61:3: identifier '[' condition_expression ']' ( '//' b= action_expression | '//' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_connection_contents205);
            identifier12=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier12.getTree());

            char_literal13=(Token)match(input,24,FOLLOW_24_in_connection_contents207); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            pushFollow(FOLLOW_condition_expression_in_connection_contents209);
            condition_expression14=condition_expression();

            state._fsp--;

            adaptor.addChild(root_0, condition_expression14.getTree());

            char_literal15=(Token)match(input,25,FOLLOW_25_in_connection_contents212); 
            char_literal15_tree = 
            (Object)adaptor.create(char_literal15)
            ;
            adaptor.addChild(root_0, char_literal15_tree);


            // ECMLFormula.g:62:3: ( '//' b= action_expression | '//' )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
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
                    // ECMLFormula.g:63:5: '//' b= action_expression
                    {
                    string_literal16=(Token)match(input,16,FOLLOW_16_in_connection_contents222); 
                    string_literal16_tree = 
                    (Object)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);


                    pushFollow(FOLLOW_action_expression_in_connection_contents226);
                    b=action_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, b.getTree());

                     ((connection_contents_scope)connection_contents_stack.peek()).act_arr.add((Tree)(b!=null?((Object)b.tree):null));

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:64:7: '//'
                    {
                    string_literal17=(Token)match(input,16,FOLLOW_16_in_connection_contents235); 
                    string_literal17_tree = 
                    (Object)adaptor.create(string_literal17)
                    ;
                    adaptor.addChild(root_0, string_literal17_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

            retval.conditions = ((connection_contents_scope)connection_contents_stack.peek()).cond_arr.toArray(new Tree[((connection_contents_scope)connection_contents_stack.peek()).cond_arr.size()]);
              retval.actions = ((connection_contents_scope)connection_contents_stack.peek()).act_arr.toArray(new Tree[((connection_contents_scope)connection_contents_stack.peek()).act_arr.size()]);
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            traceOut("connection_contents", 5);
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
    // ECMLFormula.g:68:1: condition_expression : a= and_expression ( '||' ^b= and_expression )* ;
    public final ECMLFormulaParser.condition_expression_return condition_expression() throws RecognitionException {
        traceIn("condition_expression", 6);
        ECMLFormulaParser.condition_expression_return retval = new ECMLFormulaParser.condition_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        ECMLFormulaParser.and_expression_return a =null;

        ECMLFormulaParser.and_expression_return b =null;


        Object string_literal18_tree=null;

        try {
            // ECMLFormula.g:69:3: (a= and_expression ( '||' ^b= and_expression )* )
            // ECMLFormula.g:70:3: a= and_expression ( '||' ^b= and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_and_expression_in_condition_expression258);
            a=and_expression();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

            ((connection_contents_scope)connection_contents_stack.peek()).cond_arr.add((Tree)(a!=null?((Object)a.tree):null));

            // ECMLFormula.g:70:72: ( '||' ^b= and_expression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ECMLFormula.g:70:73: '||' ^b= and_expression
            	    {
            	    string_literal18=(Token)match(input,26,FOLLOW_26_in_condition_expression262); 
            	    string_literal18_tree = 
            	    (Object)adaptor.create(string_literal18)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal18_tree, root_0);


            	    pushFollow(FOLLOW_and_expression_in_condition_expression267);
            	    b=and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	    ((connection_contents_scope)connection_contents_stack.peek()).cond_arr.add((Tree)(b!=null?((Object)b.tree):null));

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
            traceOut("condition_expression", 6);
        }
        return retval;
    }
    // $ANTLR end "condition_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // ECMLFormula.g:73:1: and_expression : relational_expression ( '&&' ^ relational_expression )* ;
    public final ECMLFormulaParser.and_expression_return and_expression() throws RecognitionException {
        traceIn("and_expression", 7);
        ECMLFormulaParser.and_expression_return retval = new ECMLFormulaParser.and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal20=null;
        ECMLFormulaParser.relational_expression_return relational_expression19 =null;

        ECMLFormulaParser.relational_expression_return relational_expression21 =null;


        Object string_literal20_tree=null;

        try {
            // ECMLFormula.g:74:3: ( relational_expression ( '&&' ^ relational_expression )* )
            // ECMLFormula.g:75:3: relational_expression ( '&&' ^ relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_and_expression285);
            relational_expression19=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression19.getTree());

            // ECMLFormula.g:75:25: ( '&&' ^ relational_expression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ECMLFormula.g:75:26: '&&' ^ relational_expression
            	    {
            	    string_literal20=(Token)match(input,13,FOLLOW_13_in_and_expression288); 
            	    string_literal20_tree = 
            	    (Object)adaptor.create(string_literal20)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(string_literal20_tree, root_0);


            	    pushFollow(FOLLOW_relational_expression_in_and_expression291);
            	    relational_expression21=relational_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_expression21.getTree());

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
            traceOut("and_expression", 7);
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // ECMLFormula.g:78:1: relational_expression : a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) ;
    public final ECMLFormulaParser.relational_expression_return relational_expression() throws RecognitionException {
        traceIn("relational_expression", 8);
        ECMLFormulaParser.relational_expression_return retval = new ECMLFormulaParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token o=null;
        Token RELOP22=null;
        ECMLFormulaParser.bi_expression_return a =null;

        ECMLFormulaParser.bi_expression_return b =null;


        Object o_tree=null;
        Object RELOP22_tree=null;
        RewriteRuleTokenStream stream_RELOP=new RewriteRuleTokenStream(adaptor,"token RELOP");
        RewriteRuleSubtreeStream stream_bi_expression=new RewriteRuleSubtreeStream(adaptor,"rule bi_expression");
        try {
            // ECMLFormula.g:79:3: (a= bi_expression o= ( RELOP ) b= bi_expression -> ^( RELOP $a $b) )
            // ECMLFormula.g:80:3: a= bi_expression o= ( RELOP ) b= bi_expression
            {
            pushFollow(FOLLOW_bi_expression_in_relational_expression310);
            a=bi_expression();

            state._fsp--;

            stream_bi_expression.add(a.getTree());

            // ECMLFormula.g:80:21: ( RELOP )
            // ECMLFormula.g:80:22: RELOP
            {
            RELOP22=(Token)match(input,RELOP,FOLLOW_RELOP_in_relational_expression315);  
            stream_RELOP.add(RELOP22);


            }


            pushFollow(FOLLOW_bi_expression_in_relational_expression320);
            b=bi_expression();

            state._fsp--;

            stream_bi_expression.add(b.getTree());

            // AST REWRITE
            // elements: RELOP, a, b
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
            // 81:5: -> ^( RELOP $a $b)
            {
                // ECMLFormula.g:82:7: ^( RELOP $a $b)
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
            traceOut("relational_expression", 8);
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class action_expressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_expressions"
    // ECMLFormula.g:85:1: action_expressions : action_expression ( ';' ^ action_expression )* ;
    public final ECMLFormulaParser.action_expressions_return action_expressions() throws RecognitionException {
        traceIn("action_expressions", 9);
        ECMLFormulaParser.action_expressions_return retval = new ECMLFormulaParser.action_expressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal24=null;
        ECMLFormulaParser.action_expression_return action_expression23 =null;

        ECMLFormulaParser.action_expression_return action_expression25 =null;


        Object char_literal24_tree=null;

        try {
            // ECMLFormula.g:86:3: ( action_expression ( ';' ^ action_expression )* )
            // ECMLFormula.g:87:3: action_expression ( ';' ^ action_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_action_expression_in_action_expressions357);
            action_expression23=action_expression();

            state._fsp--;

            adaptor.addChild(root_0, action_expression23.getTree());

            // ECMLFormula.g:87:21: ( ';' ^ action_expression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ECMLFormula.g:87:22: ';' ^ action_expression
            	    {
            	    char_literal24=(Token)match(input,18,FOLLOW_18_in_action_expressions360); 
            	    char_literal24_tree = 
            	    (Object)adaptor.create(char_literal24)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal24_tree, root_0);


            	    pushFollow(FOLLOW_action_expression_in_action_expressions364);
            	    action_expression25=action_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, action_expression25.getTree());

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
            traceOut("action_expressions", 9);
        }
        return retval;
    }
    // $ANTLR end "action_expressions"


    public static class action_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action_expression"
    // ECMLFormula.g:90:1: action_expression : ID '=' bi_expression ;
    public final ECMLFormulaParser.action_expression_return action_expression() throws RecognitionException {
        traceIn("action_expression", 10);
        ECMLFormulaParser.action_expression_return retval = new ECMLFormulaParser.action_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID26=null;
        Token char_literal27=null;
        ECMLFormulaParser.bi_expression_return bi_expression28 =null;


        Object ID26_tree=null;
        Object char_literal27_tree=null;

        try {
            // ECMLFormula.g:91:3: ( ID '=' bi_expression )
            // ECMLFormula.g:92:3: ID '=' bi_expression
            {
            root_0 = (Object)adaptor.nil();


            ID26=(Token)match(input,ID,FOLLOW_ID_in_action_expression381); 
            ID26_tree = 
            (Object)adaptor.create(ID26)
            ;
            adaptor.addChild(root_0, ID26_tree);


            char_literal27=(Token)match(input,19,FOLLOW_19_in_action_expression383); 
            char_literal27_tree = 
            (Object)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);


            pushFollow(FOLLOW_bi_expression_in_action_expression385);
            bi_expression28=bi_expression();

            state._fsp--;

            adaptor.addChild(root_0, bi_expression28.getTree());

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
            traceOut("action_expression", 10);
        }
        return retval;
    }
    // $ANTLR end "action_expression"


    public static class bi_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bi_expression"
    // ECMLFormula.g:95:1: bi_expression : ( primary_expression ) ( OPER ^ primary_expression )* ;
    public final ECMLFormulaParser.bi_expression_return bi_expression() throws RecognitionException {
        traceIn("bi_expression", 11);
        ECMLFormulaParser.bi_expression_return retval = new ECMLFormulaParser.bi_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OPER30=null;
        ECMLFormulaParser.primary_expression_return primary_expression29 =null;

        ECMLFormulaParser.primary_expression_return primary_expression31 =null;


        Object OPER30_tree=null;

        try {
            // ECMLFormula.g:96:3: ( ( primary_expression ) ( OPER ^ primary_expression )* )
            // ECMLFormula.g:97:3: ( primary_expression ) ( OPER ^ primary_expression )*
            {
            root_0 = (Object)adaptor.nil();


            // ECMLFormula.g:97:3: ( primary_expression )
            // ECMLFormula.g:97:4: primary_expression
            {
            pushFollow(FOLLOW_primary_expression_in_bi_expression401);
            primary_expression29=primary_expression();

            state._fsp--;

            adaptor.addChild(root_0, primary_expression29.getTree());

            }


            // ECMLFormula.g:97:24: ( OPER ^ primary_expression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==OPER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ECMLFormula.g:97:25: OPER ^ primary_expression
            	    {
            	    OPER30=(Token)match(input,OPER,FOLLOW_OPER_in_bi_expression405); 
            	    OPER30_tree = 
            	    (Object)adaptor.create(OPER30)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OPER30_tree, root_0);


            	    pushFollow(FOLLOW_primary_expression_in_bi_expression408);
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
            traceOut("bi_expression", 11);
        }
        return retval;
    }
    // $ANTLR end "bi_expression"


    public static class primary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // ECMLFormula.g:100:1: primary_expression : ( identifier | constant | '(' bi_expression ')' );
    public final ECMLFormulaParser.primary_expression_return primary_expression() throws RecognitionException {
        traceIn("primary_expression", 12);
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
            // ECMLFormula.g:101:3: ( identifier | constant | '(' bi_expression ')' )
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
            case 14:
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
                    // ECMLFormula.g:102:3: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_primary_expression425);
                    identifier32=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier32.getTree());

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:103:5: constant
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_primary_expression431);
                    constant33=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant33.getTree());

                    }
                    break;
                case 3 :
                    // ECMLFormula.g:104:5: '(' bi_expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal34=(Token)match(input,14,FOLLOW_14_in_primary_expression437); 
                    char_literal34_tree = 
                    (Object)adaptor.create(char_literal34)
                    ;
                    adaptor.addChild(root_0, char_literal34_tree);


                    pushFollow(FOLLOW_bi_expression_in_primary_expression439);
                    bi_expression35=bi_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, bi_expression35.getTree());

                    char_literal36=(Token)match(input,15,FOLLOW_15_in_primary_expression441); 
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
            traceOut("primary_expression", 12);
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // ECMLFormula.g:107:1: identifier : ID ;
    public final ECMLFormulaParser.identifier_return identifier() throws RecognitionException {
        traceIn("identifier", 13);
        ECMLFormulaParser.identifier_return retval = new ECMLFormulaParser.identifier_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID37=null;

        Object ID37_tree=null;

        try {
            // ECMLFormula.g:108:3: ( ID )
            // ECMLFormula.g:109:3: ID
            {
            root_0 = (Object)adaptor.nil();


            ID37=(Token)match(input,ID,FOLLOW_ID_in_identifier456); 
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
            traceOut("identifier", 13);
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // ECMLFormula.g:112:1: constant : ( INT | FLOAT );
    public final ECMLFormulaParser.constant_return constant() throws RecognitionException {
        traceIn("constant", 14);
        ECMLFormulaParser.constant_return retval = new ECMLFormulaParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // ECMLFormula.g:113:3: ( INT | FLOAT )
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
            traceOut("constant", 14);
        }
        return retval;
    }
    // $ANTLR end "constant"

    // Delegated rules


 

    public static final BitSet FOLLOW_var_rate_class_in_var_def85 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_identifier_in_var_def87 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_var_def89 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_var_type_in_var_def91 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_var_def94 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_constant_in_var_def96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_var_rate_class113 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_var_rate_class_alphabet_in_var_rate_class115 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_var_rate_class117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_var_type165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_connection_contents205 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_connection_contents207 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_condition_expression_in_connection_contents209 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_connection_contents212 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_connection_contents222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_action_expression_in_connection_contents226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_connection_contents235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression258 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_condition_expression262 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_and_expression_in_condition_expression267 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression285 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_and_expression288 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_relational_expression_in_and_expression291 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression310 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RELOP_in_relational_expression315 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_bi_expression_in_relational_expression320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions357 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_action_expressions360 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_action_expression_in_action_expressions364 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_action_expression381 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_action_expression383 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_bi_expression_in_action_expression385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression401 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_OPER_in_bi_expression405 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_primary_expression_in_bi_expression408 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_identifier_in_primary_expression425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary_expression437 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_bi_expression_in_primary_expression439 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_primary_expression441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier456 = new BitSet(new long[]{0x0000000000000002L});

}