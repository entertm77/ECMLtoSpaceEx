// $ANTLR 3.4 SpaceExInvariant.g 2012-11-13 19:53:18

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
public class SpaceExInvariant extends TreeParser {
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


    public SpaceExInvariant(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SpaceExInvariant(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SpaceExInvariantTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return SpaceExInvariant.tokenNames; }
    public String getGrammarFileName() { return "SpaceExInvariant.g"; }


    private static Logger log = Logger.getLogger(SpaceExInvariant.class);
    public class AtomExp{
    public List<String> neg_inv = new ArrayList<String>();
    public String boundary = null;
    public AtomExp(List<String> neg_inv, String boundary){
    	neg_inv = this.neg_inv;
    	boundary = this.boundary;
    }
    }


    public static class and_exp_return extends TreeRuleReturnScope {
        public List<AtomExp> atoms;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "and_exp"
    // SpaceExInvariant.g:28:1: and_exp returns [List<AtomExp> atoms] : ( ^( '&&' a= rel_exp b= rel_exp ) |c= rel_exp );
    public final SpaceExInvariant.and_exp_return and_exp() throws RecognitionException {
        traceIn("and_exp", 1);
        SpaceExInvariant.and_exp_return retval = new SpaceExInvariant.and_exp_return();
        retval.start = input.LT(1);


        SpaceExInvariant.rel_exp_return a =null;

        SpaceExInvariant.rel_exp_return b =null;

        SpaceExInvariant.rel_exp_return c =null;



        	retval.atoms = new ArrayList<AtomExp>();

        try {
            // SpaceExInvariant.g:32:3: ( ^( '&&' a= rel_exp b= rel_exp ) |c= rel_exp )
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
                    // SpaceExInvariant.g:33:3: ^( '&&' a= rel_exp b= rel_exp )
                    {
                    match(input,13,FOLLOW_13_in_and_exp91); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_rel_exp_in_and_exp95);
                    a=rel_exp();

                    state._fsp--;


                    retval.atoms.add(new AtomExp((a!=null?a.neg_inv:null), (a!=null?a.boundary:null)));

                    pushFollow(FOLLOW_rel_exp_in_and_exp100);
                    b=rel_exp();

                    state._fsp--;


                    retval.atoms.add(new AtomExp((b!=null?b.neg_inv:null), (b!=null?b.boundary:null)));

                    match(input, Token.UP, null); 


                    }
                    break;
                case 2 :
                    // SpaceExInvariant.g:34:4: c= rel_exp
                    {
                    pushFollow(FOLLOW_rel_exp_in_and_exp109);
                    c=rel_exp();

                    state._fsp--;


                    retval.atoms.add(new AtomExp((c!=null?c.neg_inv:null), (c!=null?c.boundary:null))); log.debug(" condition :" + (c!=null?c.st:null));

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
            traceOut("and_exp", 1);
        }
        return retval;
    }
    // $ANTLR end "and_exp"


    public static class rel_exp_return extends TreeRuleReturnScope {
        public List<String> neg_inv;
        public String boundary;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "rel_exp"
    // SpaceExInvariant.g:37:1: rel_exp returns [List<String> neg_inv, String boundary] : ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\";
    public final SpaceExInvariant.rel_exp_return rel_exp() throws RecognitionException {
        traceIn("rel_exp", 2);
        SpaceExInvariant.rel_exp_return retval = new SpaceExInvariant.rel_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SpaceExInvariant.bi_exp_return a =null;

        SpaceExInvariant.bi_exp_return b =null;



        retval.neg_inv = new ArrayList<String>();

        try {
            // SpaceExInvariant.g:41:2: ( ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\")
            // SpaceExInvariant.g:41:2: ^(o= RELOP a= bi_exp b= bi_exp )
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


             log.debug("create neginvariant");
            if((o!=null?o.getText():null).equals(">=") || (o!=null?o.getText():null).equals(">")){
            	retval.neg_inv.add((a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + "<=" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null));
            	retval.boundary = (a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + "==" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null);
            	
            }else if((o!=null?o.getText():null).equals("<=") || (o!=null?o.getText():null).equals("<")){
            	retval.neg_inv.add((a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + ">=" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null));
            	retval.boundary = (a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + "==" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null);
            }else if((o!=null?o.getText():null).equals("==")){
            	retval.neg_inv.add((a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + ">=" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null));
            	retval.neg_inv.add((a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + "<=" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null));
            	retval.boundary = (a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null) + "==" + (b!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(b.start),input.getTreeAdaptor().getTokenStopIndex(b.start))):null);
            }

            // TEMPLATE REWRITE
            // 54:2: -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"
            {
                retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("o", (o!=null?o.getText():null)).put("b", (b!=null?b.st:null)));
            }



            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            traceOut("rel_exp", 2);
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
    // SpaceExInvariant.g:58:1: bi_exp : ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"| primary_exp );
    public final SpaceExInvariant.bi_exp_return bi_exp() throws RecognitionException {
        traceIn("bi_exp", 3);
        SpaceExInvariant.bi_exp_return retval = new SpaceExInvariant.bi_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SpaceExInvariant.primary_exp_return a =null;

        SpaceExInvariant.bi_exp_return b =null;


        try {
            // SpaceExInvariant.g:59:2: ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"| primary_exp )
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
                    // SpaceExInvariant.g:59:2: ^(o= OPER a= primary_exp b= bi_exp )
                    {
                    o=(CommonTree)match(input,OPER,FOLLOW_OPER_in_bi_exp179); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primary_exp_in_bi_exp183);
                    a=primary_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_bi_exp_in_bi_exp187);
                    b=bi_exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 59:35: -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("o", (o!=null?o.getText():null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // SpaceExInvariant.g:60:2: primary_exp
                    {
                    pushFollow(FOLLOW_primary_exp_in_bi_exp212);
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
            traceOut("bi_exp", 3);
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
    // SpaceExInvariant.g:63:1: primary_exp : ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\");
    public final SpaceExInvariant.primary_exp_return primary_exp() throws RecognitionException {
        traceIn("primary_exp", 4);
        SpaceExInvariant.primary_exp_return retval = new SpaceExInvariant.primary_exp_return();
        retval.start = input.LT(1);


        CommonTree ID1=null;
        CommonTree INT2=null;
        CommonTree FLOAT3=null;
        SpaceExInvariant.bi_exp_return bi_exp4 =null;


        try {
            // SpaceExInvariant.g:64:1: ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\")
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
                    // SpaceExInvariant.g:65:1: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_exp225); 

                    // TEMPLATE REWRITE
                    // 65:4: -> {%{$ID.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(ID1!=null?ID1.getText():null));
                    }



                    }
                    break;
                case 2 :
                    // SpaceExInvariant.g:66:3: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_primary_exp233); 

                    // TEMPLATE REWRITE
                    // 66:7: -> {%{$INT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(INT2!=null?INT2.getText():null));
                    }



                    }
                    break;
                case 3 :
                    // SpaceExInvariant.g:67:3: FLOAT
                    {
                    FLOAT3=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_primary_exp241); 

                    // TEMPLATE REWRITE
                    // 67:9: -> {%{$FLOAT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(FLOAT3!=null?FLOAT3.getText():null));
                    }



                    }
                    break;
                case 4 :
                    // SpaceExInvariant.g:68:2: '(' bi_exp ')'
                    {
                    match(input,14,FOLLOW_14_in_primary_exp248); 

                    pushFollow(FOLLOW_bi_exp_in_primary_exp250);
                    bi_exp4=bi_exp();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_primary_exp252); 

                    // TEMPLATE REWRITE
                    // 68:17: -> template(a=$bi_exp.st) \"(<a>)\"
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
            traceOut("primary_exp", 4);
        }
        return retval;
    }
    // $ANTLR end "primary_exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_and_exp91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_exp_in_and_exp95 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rel_exp_in_and_exp100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_exp_in_and_exp109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOP_in_rel_exp134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp138 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPER_in_bi_exp179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp183 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_bi_exp187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_exp225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_exp233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_exp241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary_exp248 = new BitSet(new long[]{0x0000000000004780L});
    public static final BitSet FOLLOW_bi_exp_in_primary_exp250 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_primary_exp252 = new BitSet(new long[]{0x0000000000000002L});

}