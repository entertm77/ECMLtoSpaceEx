// $ANTLR 3.4 SpaceExTransition.g 2012-11-13 19:53:17

package parsers;
  import org.apache.log4j.Logger;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SpaceExTransition extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SpaceExTransition(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SpaceExTransition(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SpaceExTransitionTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SpaceExTransition.tokenNames; }
    public String getGrammarFileName() { return "SpaceExTransition.g"; }


    private static Logger log = Logger.getLogger(SpaceExTransition.class);


    public static class act_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "act_exp"
    // SpaceExTransition.g:18:1: act_exp :;
    public final SpaceExTransition.act_exp_return act_exp() throws RecognitionException {
        traceIn("act_exp", 1);
        SpaceExTransition.act_exp_return retval = new SpaceExTransition.act_exp_return();
        retval.start = input.LT(1);


        try {
            // SpaceExTransition.g:19:1: ()
            // SpaceExTransition.g:20:1: 
            {
            }

        }
        finally {
        	// do for sure before leaving
            traceOut("act_exp", 1);
        }
        return retval;
    }
    // $ANTLR end "act_exp"


    public static class cond_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "cond_exp"
    // SpaceExTransition.g:22:1: cond_exp : ( ^( '&&' a= rel_exp b= cond_exp ) -> template(a=$a.stb=$b.st) \"<a>&<b>\"| rel_exp );
    public final SpaceExTransition.cond_exp_return cond_exp() throws RecognitionException {
        traceIn("cond_exp", 2);
        SpaceExTransition.cond_exp_return retval = new SpaceExTransition.cond_exp_return();
        retval.start = input.LT(1);


        SpaceExTransition.rel_exp_return a =null;

        SpaceExTransition.cond_exp_return b =null;


        try {
            // SpaceExTransition.g:23:3: ( ^( '&&' a= rel_exp b= cond_exp ) -> template(a=$a.stb=$b.st) \"<a>&<b>\"| rel_exp )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
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
                    // SpaceExTransition.g:24:3: ^( '&&' a= rel_exp b= cond_exp )
                    {
                    match(input,13,FOLLOW_13_in_cond_exp89); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_rel_exp_in_cond_exp93);
                    a=rel_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_cond_exp_in_cond_exp97);
                    b=cond_exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 24:32: -> template(a=$a.stb=$b.st) \"<a>&<b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>&<b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // SpaceExTransition.g:25:4: rel_exp
                    {
                    pushFollow(FOLLOW_rel_exp_in_cond_exp118);
                    rel_exp();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            traceOut("cond_exp", 2);
        }
        return retval;
    }
    // $ANTLR end "cond_exp"


    public static class rel_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rel_exp"
    // SpaceExTransition.g:28:1: rel_exp : ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\";
    public final SpaceExTransition.rel_exp_return rel_exp() throws RecognitionException {
        traceIn("rel_exp", 3);
        SpaceExTransition.rel_exp_return retval = new SpaceExTransition.rel_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SpaceExTransition.bi_exp_return a =null;

        SpaceExTransition.bi_exp_return b =null;


        try {
            // SpaceExTransition.g:29:2: ( ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\")
            // SpaceExTransition.g:29:2: ^(o= RELOP a= bi_exp b= bi_exp )
            {
            o=(CommonTree)match(input,RELOP,FOLLOW_RELOP_in_rel_exp134); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bi_exp_in_rel_exp138);
            a=bi_exp();

            state._fsp--;


            pushFollow(FOLLOW_bi_exp_in_rel_exp142);
            b=bi_exp();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 29:31: -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"
            {
                retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)).put("o", (o!=null?o.getText():null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            traceOut("rel_exp", 3);
        }
        return retval;
    }
    // $ANTLR end "rel_exp"


    public static class bi_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "bi_exp"
    // SpaceExTransition.g:32:1: bi_exp : ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"| primary_exp );
    public final SpaceExTransition.bi_exp_return bi_exp() throws RecognitionException {
        traceIn("bi_exp", 4);
        SpaceExTransition.bi_exp_return retval = new SpaceExTransition.bi_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SpaceExTransition.primary_exp_return a =null;

        SpaceExTransition.bi_exp_return b =null;


        try {
            // SpaceExTransition.g:33:2: ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"| primary_exp )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==OPER) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= FLOAT && LA2_0 <= INT)||LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // SpaceExTransition.g:33:2: ^(o= OPER a= primary_exp b= bi_exp )
                    {
                    o=(CommonTree)match(input,OPER,FOLLOW_OPER_in_bi_exp174); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primary_exp_in_bi_exp178);
                    a=primary_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_bi_exp_in_bi_exp182);
                    b=bi_exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 33:35: -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)).put("o", (o!=null?o.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // SpaceExTransition.g:34:2: primary_exp
                    {
                    pushFollow(FOLLOW_primary_exp_in_bi_exp206);
                    primary_exp();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            traceOut("bi_exp", 4);
        }
        return retval;
    }
    // $ANTLR end "bi_exp"


    public static class primary_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "primary_exp"
    // SpaceExTransition.g:37:1: primary_exp : ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\");
    public final SpaceExTransition.primary_exp_return primary_exp() throws RecognitionException {
        traceIn("primary_exp", 5);
        SpaceExTransition.primary_exp_return retval = new SpaceExTransition.primary_exp_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;
        CommonTree INT2=null;
        CommonTree FLOAT3=null;
        SpaceExTransition.bi_exp_return bi_exp4 =null;


        try {
            // SpaceExTransition.g:38:1: ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\")
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
            case 14:
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
                    // SpaceExTransition.g:39:1: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_exp218); 

                    // TEMPLATE REWRITE
                    // 39:4: -> {%{$ID.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(ID1!=null?ID1.getText():null));
                    }



                    }
                    break;
                case 2 :
                    // SpaceExTransition.g:40:3: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_primary_exp226); 

                    // TEMPLATE REWRITE
                    // 40:7: -> {%{$INT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(INT2!=null?INT2.getText():null));
                    }



                    }
                    break;
                case 3 :
                    // SpaceExTransition.g:41:3: FLOAT
                    {
                    FLOAT3=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_primary_exp234); 

                    // TEMPLATE REWRITE
                    // 41:9: -> {%{$FLOAT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(FLOAT3!=null?FLOAT3.getText():null));
                    }



                    }
                    break;
                case 4 :
                    // SpaceExTransition.g:42:3: '(' bi_exp ')'
                    {
                    match(input,14,FOLLOW_14_in_primary_exp242); 

                    pushFollow(FOLLOW_bi_exp_in_primary_exp244);
                    bi_exp4=bi_exp();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_primary_exp246); 

                    // TEMPLATE REWRITE
                    // 42:18: -> template(a=$bi_exp.st) \"(<a>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a>)",new STAttrMap().put("a", (bi_exp4!=null?bi_exp4.st:null)));
                    }



                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            traceOut("primary_exp", 5);
        }
        return retval;
    }
    // $ANTLR end "primary_exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_cond_exp89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_exp_in_cond_exp93 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_cond_exp_in_cond_exp97 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_exp_in_cond_exp118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOP_in_rel_exp134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp138 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPER_in_bi_exp174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp178 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_bi_exp182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_exp218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_exp226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_exp234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary_exp242 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_primary_exp244 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_primary_exp246 = new BitSet(new long[]{0x0000000000000002L});

}