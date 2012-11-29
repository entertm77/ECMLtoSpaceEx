// $ANTLR 3.4 SxNegTree.g 2012-11-19 19:07:11

package parsers;
  import org.apache.log4j.Logger;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SxNegTree extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SxNegTree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SxNegTree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SxNegTree.tokenNames; }
    public String getGrammarFileName() { return "SxNegTree.g"; }





    public static class and_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_exp"
    // SxNegTree.g:19:1: and_exp : ( ^( SXAND and_exp rel_exp ) -> ^( SXOR and_exp rel_exp ) | rel_exp );
    public final SxNegTree.and_exp_return and_exp() throws RecognitionException {
        SxNegTree.and_exp_return retval = new SxNegTree.and_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SXAND1=null;
        SxNegTree.and_exp_return and_exp2 =null;

        SxNegTree.rel_exp_return rel_exp3 =null;

        SxNegTree.rel_exp_return rel_exp4 =null;


        CommonTree SXAND1_tree=null;
        RewriteRuleNodeStream stream_SXAND=new RewriteRuleNodeStream(adaptor,"token SXAND");
        RewriteRuleSubtreeStream stream_and_exp=new RewriteRuleSubtreeStream(adaptor,"rule and_exp");
        RewriteRuleSubtreeStream stream_rel_exp=new RewriteRuleSubtreeStream(adaptor,"rule rel_exp");
        try {
            // SxNegTree.g:20:3: ( ^( SXAND and_exp rel_exp ) -> ^( SXOR and_exp rel_exp ) | rel_exp )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SXAND) ) {
                alt1=1;
            }
            else if ( (LA1_0==RELOP) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // SxNegTree.g:21:3: ^( SXAND and_exp rel_exp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SXAND1=(CommonTree)match(input,SXAND,FOLLOW_SXAND_in_and_exp82);  
                    stream_SXAND.add(SXAND1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_and_exp_in_and_exp84);
                    and_exp2=and_exp();

                    state._fsp--;

                    stream_and_exp.add(and_exp2.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rel_exp_in_and_exp86);
                    rel_exp3=rel_exp();

                    state._fsp--;

                    stream_rel_exp.add(rel_exp3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: rel_exp, and_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 21:28: -> ^( SXOR and_exp rel_exp )
                    {
                        // SxNegTree.g:21:31: ^( SXOR and_exp rel_exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SXOR, "SXOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_and_exp.nextTree());

                        adaptor.addChild(root_1, stream_rel_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SxNegTree.g:22:5: rel_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_rel_exp_in_and_exp103);
                    rel_exp4=rel_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, rel_exp4.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_exp"


    public static class rel_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rel_exp"
    // SxNegTree.g:25:1: rel_exp : ^(o= RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->;
    public final SxNegTree.rel_exp_return rel_exp() throws RecognitionException {
        SxNegTree.rel_exp_return retval = new SxNegTree.rel_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.bi_exp_return a =null;

        SxNegTree.bi_exp_return b =null;


        CommonTree o_tree=null;
        RewriteRuleNodeStream stream_RELOP=new RewriteRuleNodeStream(adaptor,"token RELOP");
        RewriteRuleSubtreeStream stream_bi_exp=new RewriteRuleSubtreeStream(adaptor,"rule bi_exp");
        try {
            // SxNegTree.g:25:9: ( ^(o= RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->)
            // SxNegTree.g:26:4: ^(o= RELOP a= bi_exp b= bi_exp )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            o=(CommonTree)match(input,RELOP,FOLLOW_RELOP_in_rel_exp121);  
            stream_RELOP.add(o);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_rel_exp125);
            a=bi_exp();

            state._fsp--;

            stream_bi_exp.add(a.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_rel_exp129);
            b=bi_exp();

            state._fsp--;

            stream_bi_exp.add(b.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: b, RELOP, a, RELOP, RELOP, RELOP, b, b, a, a, b, a
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 26:29: -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) )
            if ((o!=null?o.getText():null).equals("==")) {
                // SxNegTree.g:26:55: ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SXOR, "SXOR")
                , root_1);

                // SxNegTree.g:26:62: ^( RELOP[\">=\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">=")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // SxNegTree.g:26:83: ^( RELOP[\"<=\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<=")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 27:9: -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b)
            if ((o!=null?o.getText():null).equals(">=")||(o!=null?o.getText():null).equals(">")) {
                // SxNegTree.g:27:56: ^( RELOP[\"<=\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<=")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 28:9: -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b)
            if ((o!=null?o.getText():null).equals("<=")||(o!=null?o.getText():null).equals("<")) {
                // SxNegTree.g:28:56: ^( RELOP[\">=\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">=")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 29:9: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rel_exp"


    public static class bi_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bi_exp"
    // SxNegTree.g:31:1: bi_exp : ( ^(o= OPER a= primary_exp b= bi_exp ) | primary_exp );
    public final SxNegTree.bi_exp_return bi_exp() throws RecognitionException {
        SxNegTree.bi_exp_return retval = new SxNegTree.bi_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.primary_exp_return a =null;

        SxNegTree.bi_exp_return b =null;

        SxNegTree.primary_exp_return primary_exp5 =null;


        CommonTree o_tree=null;

        try {
            // SxNegTree.g:32:2: ( ^(o= OPER a= primary_exp b= bi_exp ) | primary_exp )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==OPER) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= FLOAT && LA2_0 <= INT)||LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // SxNegTree.g:32:2: ^(o= OPER a= primary_exp b= bi_exp )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    o=(CommonTree)match(input,OPER,FOLLOW_OPER_in_bi_exp224); 
                    o_tree = (CommonTree)adaptor.dupNode(o);


                    root_1 = (CommonTree)adaptor.becomeRoot(o_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primary_exp_in_bi_exp228);
                    a=primary_exp();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bi_exp_in_bi_exp232);
                    b=bi_exp();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // SxNegTree.g:33:2: primary_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primary_exp_in_bi_exp237);
                    primary_exp5=primary_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_exp5.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bi_exp"


    public static class primary_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_exp"
    // SxNegTree.g:36:1: primary_exp : ( ID | INT | FLOAT | '(' bi_exp ')' );
    public final SxNegTree.primary_exp_return primary_exp() throws RecognitionException {
        SxNegTree.primary_exp_return retval = new SxNegTree.primary_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID6=null;
        CommonTree INT7=null;
        CommonTree FLOAT8=null;
        CommonTree char_literal9=null;
        CommonTree char_literal11=null;
        SxNegTree.bi_exp_return bi_exp10 =null;


        CommonTree ID6_tree=null;
        CommonTree INT7_tree=null;
        CommonTree FLOAT8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // SxNegTree.g:37:1: ( ID | INT | FLOAT | '(' bi_exp ')' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt3=1;
                }
                break;
            case INT:
                {
                alt3=2;
                }
                break;
            case FLOAT:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // SxNegTree.g:38:1: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_exp250); 
                    ID6_tree = (CommonTree)adaptor.dupNode(ID6);


                    adaptor.addChild(root_0, ID6_tree);


                    }
                    break;
                case 2 :
                    // SxNegTree.g:39:3: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_primary_exp255); 
                    INT7_tree = (CommonTree)adaptor.dupNode(INT7);


                    adaptor.addChild(root_0, INT7_tree);


                    }
                    break;
                case 3 :
                    // SxNegTree.g:40:3: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOAT8=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_primary_exp261); 
                    FLOAT8_tree = (CommonTree)adaptor.dupNode(FLOAT8);


                    adaptor.addChild(root_0, FLOAT8_tree);


                    }
                    break;
                case 4 :
                    // SxNegTree.g:41:2: '(' bi_exp ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal9=(CommonTree)match(input,15,FOLLOW_15_in_primary_exp264); 
                    char_literal9_tree = (CommonTree)adaptor.dupNode(char_literal9);


                    adaptor.addChild(root_0, char_literal9_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bi_exp_in_primary_exp266);
                    bi_exp10=bi_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, bi_exp10.getTree());


                    _last = (CommonTree)input.LT(1);
                    char_literal11=(CommonTree)match(input,16,FOLLOW_16_in_primary_exp268); 
                    char_literal11_tree = (CommonTree)adaptor.dupNode(char_literal11);


                    adaptor.addChild(root_0, char_literal11_tree);


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_SXAND_in_and_exp82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_and_exp_in_and_exp84 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rel_exp_in_and_exp86 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_exp_in_and_exp103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOP_in_rel_exp121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp125 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPER_in_bi_exp224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp228 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_bi_exp232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_exp250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_exp255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_exp261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primary_exp264 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_primary_exp266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary_exp268 = new BitSet(new long[]{0x0000000000000002L});

}