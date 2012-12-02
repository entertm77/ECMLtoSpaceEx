// $ANTLR 3.4 SxNegTree.g 2012-11-30 18:11:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONT_RELOP", "DISC_RELOP", "ECMLAND", "ECMLOR", "EQUAL", "FLOAT", "ID", "INT", "OPER", "RELOP", "SXAND", "SXOR", "WS", "'('", "')'", "'//'", "':'", "';'", "'='", "'A'", "'C'", "'D'", "'E'", "'['", "']'", "'d'"
    };

    public static final int EOF=-1;
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
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int CONT_RELOP=4;
    public static final int DISC_RELOP=5;
    public static final int ECMLAND=6;
    public static final int ECMLOR=7;
    public static final int EQUAL=8;
    public static final int FLOAT=9;
    public static final int ID=10;
    public static final int INT=11;
    public static final int OPER=12;
    public static final int RELOP=13;
    public static final int SXAND=14;
    public static final int SXOR=15;
    public static final int WS=16;

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





    public static class disc_neg_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "disc_neg_exp"
    // SxNegTree.g:21:1: disc_neg_exp : ( ^( SXAND disc_neg_exp disc_rel_exp ) -> ^( SXOR disc_neg_exp disc_rel_exp ) | disc_rel_exp );
    public final SxNegTree.disc_neg_exp_return disc_neg_exp() throws RecognitionException {
        SxNegTree.disc_neg_exp_return retval = new SxNegTree.disc_neg_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SXAND1=null;
        SxNegTree.disc_neg_exp_return disc_neg_exp2 =null;

        SxNegTree.disc_rel_exp_return disc_rel_exp3 =null;

        SxNegTree.disc_rel_exp_return disc_rel_exp4 =null;


        CommonTree SXAND1_tree=null;
        RewriteRuleNodeStream stream_SXAND=new RewriteRuleNodeStream(adaptor,"token SXAND");
        RewriteRuleSubtreeStream stream_disc_neg_exp=new RewriteRuleSubtreeStream(adaptor,"rule disc_neg_exp");
        RewriteRuleSubtreeStream stream_disc_rel_exp=new RewriteRuleSubtreeStream(adaptor,"rule disc_rel_exp");
        try {
            // SxNegTree.g:22:3: ( ^( SXAND disc_neg_exp disc_rel_exp ) -> ^( SXOR disc_neg_exp disc_rel_exp ) | disc_rel_exp )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SXAND) ) {
                alt1=1;
            }
            else if ( (LA1_0==DISC_RELOP) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // SxNegTree.g:23:4: ^( SXAND disc_neg_exp disc_rel_exp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SXAND1=(CommonTree)match(input,SXAND,FOLLOW_SXAND_in_disc_neg_exp86);  
                    stream_SXAND.add(SXAND1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_disc_neg_exp_in_disc_neg_exp88);
                    disc_neg_exp2=disc_neg_exp();

                    state._fsp--;

                    stream_disc_neg_exp.add(disc_neg_exp2.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_disc_rel_exp_in_disc_neg_exp90);
                    disc_rel_exp3=disc_rel_exp();

                    state._fsp--;

                    stream_disc_rel_exp.add(disc_rel_exp3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: disc_rel_exp, disc_neg_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:39: -> ^( SXOR disc_neg_exp disc_rel_exp )
                    {
                        // SxNegTree.g:23:42: ^( SXOR disc_neg_exp disc_rel_exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SXOR, "SXOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_disc_neg_exp.nextTree());

                        adaptor.addChild(root_1, stream_disc_rel_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SxNegTree.g:24:5: disc_rel_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_disc_rel_exp_in_disc_neg_exp107);
                    disc_rel_exp4=disc_rel_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, disc_rel_exp4.getTree());


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
    // $ANTLR end "disc_neg_exp"


    public static class disc_rel_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "disc_rel_exp"
    // SxNegTree.g:27:1: disc_rel_exp : ^(o= DISC_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) ) -> {$o.text.equals(\">=\")}? ^( RELOP[\"<\"] $a $b) -> {$o.text.equals(\"<=\")}? ^( RELOP[\">\"] $a $b) -> {$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->;
    public final SxNegTree.disc_rel_exp_return disc_rel_exp() throws RecognitionException {
        SxNegTree.disc_rel_exp_return retval = new SxNegTree.disc_rel_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.bi_exp_return a =null;

        SxNegTree.bi_exp_return b =null;


        CommonTree o_tree=null;
        RewriteRuleNodeStream stream_DISC_RELOP=new RewriteRuleNodeStream(adaptor,"token DISC_RELOP");
        RewriteRuleSubtreeStream stream_bi_exp=new RewriteRuleSubtreeStream(adaptor,"rule bi_exp");
        try {
            // SxNegTree.g:27:14: ( ^(o= DISC_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) ) -> {$o.text.equals(\">=\")}? ^( RELOP[\"<\"] $a $b) -> {$o.text.equals(\"<=\")}? ^( RELOP[\">\"] $a $b) -> {$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->)
            // SxNegTree.g:28:4: ^(o= DISC_RELOP a= bi_exp b= bi_exp )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            o=(CommonTree)match(input,DISC_RELOP,FOLLOW_DISC_RELOP_in_disc_rel_exp121);  
            stream_DISC_RELOP.add(o);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_disc_rel_exp125);
            a=bi_exp();

            state._fsp--;

            stream_bi_exp.add(a.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_disc_rel_exp129);
            b=bi_exp();

            state._fsp--;

            stream_bi_exp.add(b.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: a, a, b, b, b, b, a, a, b, b, a, a
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
            // 28:34: -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) )
            if ((o!=null?o.getText():null).equals("==")) {
                // SxNegTree.g:28:60: ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SXOR, "SXOR")
                , root_1);

                // SxNegTree.g:28:67: ^( RELOP[\">\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // SxNegTree.g:28:87: ^( RELOP[\"<\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 29:9: -> {$o.text.equals(\">=\")}? ^( RELOP[\"<\"] $a $b)
            if ((o!=null?o.getText():null).equals(">=")) {
                // SxNegTree.g:29:35: ^( RELOP[\"<\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 30:9: -> {$o.text.equals(\"<=\")}? ^( RELOP[\">\"] $a $b)
            if ((o!=null?o.getText():null).equals("<=")) {
                // SxNegTree.g:30:35: ^( RELOP[\">\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 31:9: -> {$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b)
            if ((o!=null?o.getText():null).equals(">")) {
                // SxNegTree.g:31:34: ^( RELOP[\"<=\"] $a $b)
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

            else // 32:9: -> {$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b)
            if ((o!=null?o.getText():null).equals("<")) {
                // SxNegTree.g:32:34: ^( RELOP[\">=\"] $a $b)
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

            else // 33:9: ->
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
    // $ANTLR end "disc_rel_exp"


    public static class neg_unbnd_cont_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neg_unbnd_cont_exp"
    // SxNegTree.g:36:1: neg_unbnd_cont_exp : ( ^( SXAND neg_unbnd_cont_exp neg_unbnd_rel_exp ) -> ^( SXOR neg_unbnd_cont_exp neg_unbnd_rel_exp ) | neg_unbnd_rel_exp );
    public final SxNegTree.neg_unbnd_cont_exp_return neg_unbnd_cont_exp() throws RecognitionException {
        SxNegTree.neg_unbnd_cont_exp_return retval = new SxNegTree.neg_unbnd_cont_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SXAND5=null;
        SxNegTree.neg_unbnd_cont_exp_return neg_unbnd_cont_exp6 =null;

        SxNegTree.neg_unbnd_rel_exp_return neg_unbnd_rel_exp7 =null;

        SxNegTree.neg_unbnd_rel_exp_return neg_unbnd_rel_exp8 =null;


        CommonTree SXAND5_tree=null;
        RewriteRuleNodeStream stream_SXAND=new RewriteRuleNodeStream(adaptor,"token SXAND");
        RewriteRuleSubtreeStream stream_neg_unbnd_rel_exp=new RewriteRuleSubtreeStream(adaptor,"rule neg_unbnd_rel_exp");
        RewriteRuleSubtreeStream stream_neg_unbnd_cont_exp=new RewriteRuleSubtreeStream(adaptor,"rule neg_unbnd_cont_exp");
        try {
            // SxNegTree.g:37:3: ( ^( SXAND neg_unbnd_cont_exp neg_unbnd_rel_exp ) -> ^( SXOR neg_unbnd_cont_exp neg_unbnd_rel_exp ) | neg_unbnd_rel_exp )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SXAND) ) {
                alt2=1;
            }
            else if ( (LA2_0==CONT_RELOP) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // SxNegTree.g:38:4: ^( SXAND neg_unbnd_cont_exp neg_unbnd_rel_exp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SXAND5=(CommonTree)match(input,SXAND,FOLLOW_SXAND_in_neg_unbnd_cont_exp274);  
                    stream_SXAND.add(SXAND5);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_neg_unbnd_cont_exp_in_neg_unbnd_cont_exp276);
                    neg_unbnd_cont_exp6=neg_unbnd_cont_exp();

                    state._fsp--;

                    stream_neg_unbnd_cont_exp.add(neg_unbnd_cont_exp6.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_neg_unbnd_rel_exp_in_neg_unbnd_cont_exp278);
                    neg_unbnd_rel_exp7=neg_unbnd_rel_exp();

                    state._fsp--;

                    stream_neg_unbnd_rel_exp.add(neg_unbnd_rel_exp7.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: neg_unbnd_cont_exp, neg_unbnd_rel_exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 38:50: -> ^( SXOR neg_unbnd_cont_exp neg_unbnd_rel_exp )
                    {
                        // SxNegTree.g:38:53: ^( SXOR neg_unbnd_cont_exp neg_unbnd_rel_exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SXOR, "SXOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_neg_unbnd_cont_exp.nextTree());

                        adaptor.addChild(root_1, stream_neg_unbnd_rel_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SxNegTree.g:39:5: neg_unbnd_rel_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_neg_unbnd_rel_exp_in_neg_unbnd_cont_exp295);
                    neg_unbnd_rel_exp8=neg_unbnd_rel_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, neg_unbnd_rel_exp8.getTree());


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
    // $ANTLR end "neg_unbnd_cont_exp"


    public static class neg_unbnd_rel_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neg_unbnd_rel_exp"
    // SxNegTree.g:42:1: neg_unbnd_rel_exp : ^(o= CONT_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">\"] $a $b) ->;
    public final SxNegTree.neg_unbnd_rel_exp_return neg_unbnd_rel_exp() throws RecognitionException {
        SxNegTree.neg_unbnd_rel_exp_return retval = new SxNegTree.neg_unbnd_rel_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.bi_exp_return a =null;

        SxNegTree.bi_exp_return b =null;


        CommonTree o_tree=null;
        RewriteRuleNodeStream stream_CONT_RELOP=new RewriteRuleNodeStream(adaptor,"token CONT_RELOP");
        RewriteRuleSubtreeStream stream_bi_exp=new RewriteRuleSubtreeStream(adaptor,"rule bi_exp");
        try {
            // SxNegTree.g:42:19: ( ^(o= CONT_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">\"] $a $b) ->)
            // SxNegTree.g:43:4: ^(o= CONT_RELOP a= bi_exp b= bi_exp )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            o=(CommonTree)match(input,CONT_RELOP,FOLLOW_CONT_RELOP_in_neg_unbnd_rel_exp310);  
            stream_CONT_RELOP.add(o);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_neg_unbnd_rel_exp314);
            a=bi_exp();

            state._fsp--;

            stream_bi_exp.add(a.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_neg_unbnd_rel_exp318);
            b=bi_exp();

            state._fsp--;

            stream_bi_exp.add(b.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: b, b, a, a, b, b, a, a
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
            // 43:34: -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) )
            if ((o!=null?o.getText():null).equals("==")) {
                // SxNegTree.g:43:60: ^( SXOR ^( RELOP[\">\"] $a $b) ^( RELOP[\"<\"] $a $b) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SXOR, "SXOR")
                , root_1);

                // SxNegTree.g:43:67: ^( RELOP[\">\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // SxNegTree.g:43:87: ^( RELOP[\"<\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 44:9: -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<\"] $a $b)
            if ((o!=null?o.getText():null).equals(">=")||(o!=null?o.getText():null).equals(">")) {
                // SxNegTree.g:44:56: ^( RELOP[\"<\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, "<")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 45:9: -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">\"] $a $b)
            if ((o!=null?o.getText():null).equals("<=")||(o!=null?o.getText():null).equals("<")) {
                // SxNegTree.g:45:56: ^( RELOP[\">\"] $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextTree());

                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 46:9: ->
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
    // $ANTLR end "neg_unbnd_rel_exp"


    public static class cont_exp_neg_bnd_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cont_exp_neg_bnd"
    // SxNegTree.g:48:1: cont_exp_neg_bnd : ( ^( SXAND cont_exp_neg_bnd neg_bnd_rel_exp ) -> ^( SXOR cont_exp_neg_bnd neg_bnd_rel_exp ) | neg_bnd_rel_exp );
    public final SxNegTree.cont_exp_neg_bnd_return cont_exp_neg_bnd() throws RecognitionException {
        SxNegTree.cont_exp_neg_bnd_return retval = new SxNegTree.cont_exp_neg_bnd_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SXAND9=null;
        SxNegTree.cont_exp_neg_bnd_return cont_exp_neg_bnd10 =null;

        SxNegTree.neg_bnd_rel_exp_return neg_bnd_rel_exp11 =null;

        SxNegTree.neg_bnd_rel_exp_return neg_bnd_rel_exp12 =null;


        CommonTree SXAND9_tree=null;
        RewriteRuleNodeStream stream_SXAND=new RewriteRuleNodeStream(adaptor,"token SXAND");
        RewriteRuleSubtreeStream stream_neg_bnd_rel_exp=new RewriteRuleSubtreeStream(adaptor,"rule neg_bnd_rel_exp");
        RewriteRuleSubtreeStream stream_cont_exp_neg_bnd=new RewriteRuleSubtreeStream(adaptor,"rule cont_exp_neg_bnd");
        try {
            // SxNegTree.g:49:3: ( ^( SXAND cont_exp_neg_bnd neg_bnd_rel_exp ) -> ^( SXOR cont_exp_neg_bnd neg_bnd_rel_exp ) | neg_bnd_rel_exp )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SXAND) ) {
                alt3=1;
            }
            else if ( (LA3_0==CONT_RELOP) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // SxNegTree.g:50:3: ^( SXAND cont_exp_neg_bnd neg_bnd_rel_exp )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SXAND9=(CommonTree)match(input,SXAND,FOLLOW_SXAND_in_cont_exp_neg_bnd416);  
                    stream_SXAND.add(SXAND9);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_cont_exp_neg_bnd_in_cont_exp_neg_bnd418);
                    cont_exp_neg_bnd10=cont_exp_neg_bnd();

                    state._fsp--;

                    stream_cont_exp_neg_bnd.add(cont_exp_neg_bnd10.getTree());

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_neg_bnd_rel_exp_in_cont_exp_neg_bnd420);
                    neg_bnd_rel_exp11=neg_bnd_rel_exp();

                    state._fsp--;

                    stream_neg_bnd_rel_exp.add(neg_bnd_rel_exp11.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: neg_bnd_rel_exp, cont_exp_neg_bnd
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:45: -> ^( SXOR cont_exp_neg_bnd neg_bnd_rel_exp )
                    {
                        // SxNegTree.g:50:48: ^( SXOR cont_exp_neg_bnd neg_bnd_rel_exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(SXOR, "SXOR")
                        , root_1);

                        adaptor.addChild(root_1, stream_cont_exp_neg_bnd.nextTree());

                        adaptor.addChild(root_1, stream_neg_bnd_rel_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // SxNegTree.g:51:5: neg_bnd_rel_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_neg_bnd_rel_exp_in_cont_exp_neg_bnd437);
                    neg_bnd_rel_exp12=neg_bnd_rel_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, neg_bnd_rel_exp12.getTree());


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
    // $ANTLR end "cont_exp_neg_bnd"


    public static class neg_bnd_rel_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neg_bnd_rel_exp"
    // SxNegTree.g:53:1: neg_bnd_rel_exp : ^(o= CONT_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->;
    public final SxNegTree.neg_bnd_rel_exp_return neg_bnd_rel_exp() throws RecognitionException {
        SxNegTree.neg_bnd_rel_exp_return retval = new SxNegTree.neg_bnd_rel_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.bi_exp_return a =null;

        SxNegTree.bi_exp_return b =null;


        CommonTree o_tree=null;
        RewriteRuleNodeStream stream_CONT_RELOP=new RewriteRuleNodeStream(adaptor,"token CONT_RELOP");
        RewriteRuleSubtreeStream stream_bi_exp=new RewriteRuleSubtreeStream(adaptor,"rule bi_exp");
        try {
            // SxNegTree.g:53:17: ( ^(o= CONT_RELOP a= bi_exp b= bi_exp ) -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) ) -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b) -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b) ->)
            // SxNegTree.g:54:4: ^(o= CONT_RELOP a= bi_exp b= bi_exp )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            o=(CommonTree)match(input,CONT_RELOP,FOLLOW_CONT_RELOP_in_neg_bnd_rel_exp454);  
            stream_CONT_RELOP.add(o);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_neg_bnd_rel_exp458);
            a=bi_exp();

            state._fsp--;

            stream_bi_exp.add(a.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bi_exp_in_neg_bnd_rel_exp462);
            b=bi_exp();

            state._fsp--;

            stream_bi_exp.add(b.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: a, b, b, b, a, a, a, b
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
            // 54:34: -> {$o.text.equals(\"==\")}? ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) )
            if ((o!=null?o.getText():null).equals("==")) {
                // SxNegTree.g:54:60: ^( SXOR ^( RELOP[\">=\"] $a $b) ^( RELOP[\"<=\"] $a $b) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SXOR, "SXOR")
                , root_1);

                // SxNegTree.g:54:67: ^( RELOP[\">=\"] $a $b)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RELOP, ">=")
                , root_2);

                adaptor.addChild(root_2, stream_a.nextTree());

                adaptor.addChild(root_2, stream_b.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // SxNegTree.g:54:88: ^( RELOP[\"<=\"] $a $b)
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

            else // 55:9: -> {$o.text.equals(\">=\")||$o.text.equals(\">\")}? ^( RELOP[\"<=\"] $a $b)
            if ((o!=null?o.getText():null).equals(">=")||(o!=null?o.getText():null).equals(">")) {
                // SxNegTree.g:55:56: ^( RELOP[\"<=\"] $a $b)
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

            else // 56:9: -> {$o.text.equals(\"<=\")||$o.text.equals(\"<\")}? ^( RELOP[\">=\"] $a $b)
            if ((o!=null?o.getText():null).equals("<=")||(o!=null?o.getText():null).equals("<")) {
                // SxNegTree.g:56:56: ^( RELOP[\">=\"] $a $b)
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

            else // 57:9: ->
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
    // $ANTLR end "neg_bnd_rel_exp"


    public static class bi_exp_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bi_exp"
    // SxNegTree.g:59:1: bi_exp : ( ^(o= OPER a= primary_exp b= bi_exp ) | primary_exp );
    public final SxNegTree.bi_exp_return bi_exp() throws RecognitionException {
        SxNegTree.bi_exp_return retval = new SxNegTree.bi_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree o=null;
        SxNegTree.primary_exp_return a =null;

        SxNegTree.bi_exp_return b =null;

        SxNegTree.primary_exp_return primary_exp13 =null;


        CommonTree o_tree=null;

        try {
            // SxNegTree.g:60:2: ( ^(o= OPER a= primary_exp b= bi_exp ) | primary_exp )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPER) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= FLOAT && LA4_0 <= INT)||LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // SxNegTree.g:60:2: ^(o= OPER a= primary_exp b= bi_exp )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    o=(CommonTree)match(input,OPER,FOLLOW_OPER_in_bi_exp557); 
                    o_tree = (CommonTree)adaptor.dupNode(o);


                    root_1 = (CommonTree)adaptor.becomeRoot(o_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primary_exp_in_bi_exp561);
                    a=primary_exp();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bi_exp_in_bi_exp565);
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
                    // SxNegTree.g:61:2: primary_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primary_exp_in_bi_exp570);
                    primary_exp13=primary_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, primary_exp13.getTree());


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
    // SxNegTree.g:64:1: primary_exp : ( ID | INT | FLOAT | '(' bi_exp ')' );
    public final SxNegTree.primary_exp_return primary_exp() throws RecognitionException {
        SxNegTree.primary_exp_return retval = new SxNegTree.primary_exp_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID14=null;
        CommonTree INT15=null;
        CommonTree FLOAT16=null;
        CommonTree char_literal17=null;
        CommonTree char_literal19=null;
        SxNegTree.bi_exp_return bi_exp18 =null;


        CommonTree ID14_tree=null;
        CommonTree INT15_tree=null;
        CommonTree FLOAT16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // SxNegTree.g:65:1: ( ID | INT | FLOAT | '(' bi_exp ')' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case INT:
                {
                alt5=2;
                }
                break;
            case FLOAT:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // SxNegTree.g:66:1: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_exp583); 
                    ID14_tree = (CommonTree)adaptor.dupNode(ID14);


                    adaptor.addChild(root_0, ID14_tree);


                    }
                    break;
                case 2 :
                    // SxNegTree.g:67:3: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT15=(CommonTree)match(input,INT,FOLLOW_INT_in_primary_exp588); 
                    INT15_tree = (CommonTree)adaptor.dupNode(INT15);


                    adaptor.addChild(root_0, INT15_tree);


                    }
                    break;
                case 3 :
                    // SxNegTree.g:68:3: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FLOAT16=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_primary_exp594); 
                    FLOAT16_tree = (CommonTree)adaptor.dupNode(FLOAT16);


                    adaptor.addChild(root_0, FLOAT16_tree);


                    }
                    break;
                case 4 :
                    // SxNegTree.g:69:2: '(' bi_exp ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal17=(CommonTree)match(input,17,FOLLOW_17_in_primary_exp597); 
                    char_literal17_tree = (CommonTree)adaptor.dupNode(char_literal17);


                    adaptor.addChild(root_0, char_literal17_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bi_exp_in_primary_exp599);
                    bi_exp18=bi_exp();

                    state._fsp--;

                    adaptor.addChild(root_0, bi_exp18.getTree());


                    _last = (CommonTree)input.LT(1);
                    char_literal19=(CommonTree)match(input,18,FOLLOW_18_in_primary_exp601); 
                    char_literal19_tree = (CommonTree)adaptor.dupNode(char_literal19);


                    adaptor.addChild(root_0, char_literal19_tree);


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


 

    public static final BitSet FOLLOW_SXAND_in_disc_neg_exp86 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_disc_neg_exp_in_disc_neg_exp88 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_disc_rel_exp_in_disc_neg_exp90 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_disc_rel_exp_in_disc_neg_exp107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISC_RELOP_in_disc_rel_exp121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_disc_rel_exp125 = new BitSet(new long[]{0x0000000000021E00L});
    public static final BitSet FOLLOW_bi_exp_in_disc_rel_exp129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SXAND_in_neg_unbnd_cont_exp274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_neg_unbnd_cont_exp_in_neg_unbnd_cont_exp276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_neg_unbnd_rel_exp_in_neg_unbnd_cont_exp278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_neg_unbnd_rel_exp_in_neg_unbnd_cont_exp295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONT_RELOP_in_neg_unbnd_rel_exp310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_neg_unbnd_rel_exp314 = new BitSet(new long[]{0x0000000000021E00L});
    public static final BitSet FOLLOW_bi_exp_in_neg_unbnd_rel_exp318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SXAND_in_cont_exp_neg_bnd416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cont_exp_neg_bnd_in_cont_exp_neg_bnd418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_neg_bnd_rel_exp_in_cont_exp_neg_bnd420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_neg_bnd_rel_exp_in_cont_exp_neg_bnd437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONT_RELOP_in_neg_bnd_rel_exp454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_neg_bnd_rel_exp458 = new BitSet(new long[]{0x0000000000021E00L});
    public static final BitSet FOLLOW_bi_exp_in_neg_bnd_rel_exp462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPER_in_bi_exp557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp561 = new BitSet(new long[]{0x0000000000021E00L});
    public static final BitSet FOLLOW_bi_exp_in_bi_exp565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_exp583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_exp588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_exp594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_primary_exp597 = new BitSet(new long[]{0x0000000000021E00L});
    public static final BitSet FOLLOW_bi_exp_in_primary_exp599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_primary_exp601 = new BitSet(new long[]{0x0000000000000002L});

}