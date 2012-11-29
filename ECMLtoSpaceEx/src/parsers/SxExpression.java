// $ANTLR 3.4 SxExpression.g 2012-11-19 19:07:10

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
public class SxExpression extends TreeParser {
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


    public SxExpression(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SxExpression(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SxExpressionTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return SxExpression.tokenNames; }
    public String getGrammarFileName() { return "SxExpression.g"; }


    private static Logger log = Logger.getLogger(SxExpression.class);


    public static class state_model_return extends TreeRuleReturnScope {
        public Boolean is_flow;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "state_model"
    // SxExpression.g:18:1: state_model returns [Boolean is_flow] : ( 'd' '(' a= ID ')' '=' b= bi_exp -> template(a=$a.textb=$b.st) \"<a>'==<b>\"|a= ID '=' b= bi_exp -> template(a=$a.textb=$b.st) \"<a>:=<b>\");
    public final SxExpression.state_model_return state_model() throws RecognitionException {
        SxExpression.state_model_return retval = new SxExpression.state_model_return();
        retval.start = input.LT(1);


        CommonTree a=null;
        SxExpression.bi_exp_return b =null;


        retval.is_flow =false;
        try {
            // SxExpression.g:20:2: ( 'd' '(' a= ID ')' '=' b= bi_exp -> template(a=$a.textb=$b.st) \"<a>'==<b>\"|a= ID '=' b= bi_exp -> template(a=$a.textb=$b.st) \"<a>:=<b>\")
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            else if ( (LA1_0==ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // SxExpression.g:20:3: 'd' '(' a= ID ')' '=' b= bi_exp
                    {
                    match(input,27,FOLLOW_27_in_state_model83); 

                    match(input,15,FOLLOW_15_in_state_model85); 

                    a=(CommonTree)match(input,ID,FOLLOW_ID_in_state_model89); 

                    match(input,16,FOLLOW_16_in_state_model91); 

                    match(input,20,FOLLOW_20_in_state_model93); 

                    pushFollow(FOLLOW_bi_exp_in_state_model97);
                    b=bi_exp();

                    state._fsp--;


                    retval.is_flow =true;

                    // TEMPLATE REWRITE
                    // 20:49: -> template(a=$a.textb=$b.st) \"<a>'==<b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>'==<b>",new STAttrMap().put("a", (a!=null?a.getText():null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // SxExpression.g:21:4: a= ID '=' b= bi_exp
                    {
                    a=(CommonTree)match(input,ID,FOLLOW_ID_in_state_model120); 

                    match(input,20,FOLLOW_20_in_state_model122); 

                    pushFollow(FOLLOW_bi_exp_in_state_model126);
                    b=bi_exp();

                    state._fsp--;


                    retval.is_flow =false;

                    // TEMPLATE REWRITE
                    // 21:39: -> template(a=$a.textb=$b.st) \"<a>:=<b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>:=<b>",new STAttrMap().put("a", (a!=null?a.getText():null)).put("b", (b!=null?b.st:null)));
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
        }
        return retval;
    }
    // $ANTLR end "state_model"


    public static class action_exps_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "action_exps"
    // SxExpression.g:24:1: action_exps : ( ^( ';' a= action_exp b= action_exps ) -> template(a=$a.stb=$b.st) \"<a> & <b>\"| action_exp -> template(a=$action_exp.st) \"<a>\");
    public final SxExpression.action_exps_return action_exps() throws RecognitionException {
        SxExpression.action_exps_return retval = new SxExpression.action_exps_return();
        retval.start = input.LT(1);


        SxExpression.action_exp_return a =null;

        SxExpression.action_exps_return b =null;

        SxExpression.action_exp_return action_exp1 =null;


        try {
            // SxExpression.g:25:3: ( ^( ';' a= action_exp b= action_exps ) -> template(a=$a.stb=$b.st) \"<a> & <b>\"| action_exp -> template(a=$action_exp.st) \"<a>\")
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // SxExpression.g:26:3: ^( ';' a= action_exp b= action_exps )
                    {
                    match(input,19,FOLLOW_19_in_action_exps159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_action_exp_in_action_exps163);
                    a=action_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_action_exps_in_action_exps167);
                    b=action_exps();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 26:37: -> template(a=$a.stb=$b.st) \"<a> & <b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a> & <b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // SxExpression.g:27:4: action_exp
                    {
                    pushFollow(FOLLOW_action_exp_in_action_exps188);
                    action_exp1=action_exp();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 27:15: -> template(a=$action_exp.st) \"<a>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>",new STAttrMap().put("a", (action_exp1!=null?action_exp1.st:null)));
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
        }
        return retval;
    }
    // $ANTLR end "action_exps"


    public static class action_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "action_exp"
    // SxExpression.g:29:1: action_exp : ID '=' bi_exp -> template(a=$ID.textb=$bi_exp.st) \"<a>:=<b>\";
    public final SxExpression.action_exp_return action_exp() throws RecognitionException {
        SxExpression.action_exp_return retval = new SxExpression.action_exp_return();
        retval.start = input.LT(1);


        CommonTree ID2=null;
        SxExpression.bi_exp_return bi_exp3 =null;


        try {
            // SxExpression.g:30:1: ( ID '=' bi_exp -> template(a=$ID.textb=$bi_exp.st) \"<a>:=<b>\")
            // SxExpression.g:31:1: ID '=' bi_exp
            {
            ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_action_exp209); 

            match(input,20,FOLLOW_20_in_action_exp211); 

            pushFollow(FOLLOW_bi_exp_in_action_exp213);
            bi_exp3=bi_exp();

            state._fsp--;


            // TEMPLATE REWRITE
            // 31:15: -> template(a=$ID.textb=$bi_exp.st) \"<a>:=<b>\"
            {
                retval.st = new StringTemplate(templateLib, "<a>:=<b>",new STAttrMap().put("a", (ID2!=null?ID2.getText():null)).put("b", (bi_exp3!=null?bi_exp3.st:null)));
            }



            }

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
    // $ANTLR end "action_exp"


    public static class cond_exp_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "cond_exp"
    // SxExpression.g:34:1: cond_exp : ( ^(o= SXAND a= rel_exp b= cond_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"| rel_exp -> template(a=$rel_exp.st) \"<a>\");
    public final SxExpression.cond_exp_return cond_exp() throws RecognitionException {
        SxExpression.cond_exp_return retval = new SxExpression.cond_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SxExpression.rel_exp_return a =null;

        SxExpression.cond_exp_return b =null;

        SxExpression.rel_exp_return rel_exp4 =null;


        try {
            // SxExpression.g:35:3: ( ^(o= SXAND a= rel_exp b= cond_exp ) -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"| rel_exp -> template(a=$rel_exp.st) \"<a>\")
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SXAND) ) {
                alt3=1;
            }
            else if ( (LA3_0==RELOP) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // SxExpression.g:36:3: ^(o= SXAND a= rel_exp b= cond_exp )
                    {
                    o=(CommonTree)match(input,SXAND,FOLLOW_SXAND_in_cond_exp245); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_rel_exp_in_cond_exp249);
                    a=rel_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_cond_exp_in_cond_exp253);
                    b=cond_exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 36:35: -> template(a=$a.sto=$o.textb=$b.st) \"<a><o><b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("o", (o!=null?o.getText():null)).put("b", (b!=null?b.st:null)));
                    }



                    }
                    break;
                case 2 :
                    // SxExpression.g:37:4: rel_exp
                    {
                    pushFollow(FOLLOW_rel_exp_in_cond_exp279);
                    rel_exp4=rel_exp();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 37:12: -> template(a=$rel_exp.st) \"<a>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>",new STAttrMap().put("a", (rel_exp4!=null?rel_exp4.st:null)));
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
    // SxExpression.g:40:1: rel_exp : ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\";
    public final SxExpression.rel_exp_return rel_exp() throws RecognitionException {
        SxExpression.rel_exp_return retval = new SxExpression.rel_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SxExpression.bi_exp_return a =null;

        SxExpression.bi_exp_return b =null;


        try {
            // SxExpression.g:41:2: ( ^(o= RELOP a= bi_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\")
            // SxExpression.g:41:2: ^(o= RELOP a= bi_exp b= bi_exp )
            {
            o=(CommonTree)match(input,RELOP,FOLLOW_RELOP_in_rel_exp307); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bi_exp_in_rel_exp311);
            a=bi_exp();

            state._fsp--;


            pushFollow(FOLLOW_bi_exp_in_rel_exp315);
            b=bi_exp();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 41:31: -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"
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
    // SxExpression.g:44:1: bi_exp : ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"| primary_exp -> template(a=$primary_exp.st) \"<a>\");
    public final SxExpression.bi_exp_return bi_exp() throws RecognitionException {
        SxExpression.bi_exp_return retval = new SxExpression.bi_exp_return();
        retval.start = input.LT(1);


        CommonTree o=null;
        SxExpression.primary_exp_return a =null;

        SxExpression.bi_exp_return b =null;

        SxExpression.primary_exp_return primary_exp5 =null;


        try {
            // SxExpression.g:45:2: ( ^(o= OPER a= primary_exp b= bi_exp ) -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"| primary_exp -> template(a=$primary_exp.st) \"<a>\")
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==OPER) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= FLOAT && LA4_0 <= INT)||LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // SxExpression.g:45:2: ^(o= OPER a= primary_exp b= bi_exp )
                    {
                    o=(CommonTree)match(input,OPER,FOLLOW_OPER_in_bi_exp347); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_primary_exp_in_bi_exp351);
                    a=primary_exp();

                    state._fsp--;


                    pushFollow(FOLLOW_bi_exp_in_bi_exp355);
                    b=bi_exp();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 45:35: -> template(a=$a.stb=$b.sto=$o.text) \"<a><o><b>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a><o><b>",new STAttrMap().put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)).put("o", (o!=null?o.getText():null)));
                    }



                    }
                    break;
                case 2 :
                    // SxExpression.g:46:2: primary_exp
                    {
                    pushFollow(FOLLOW_primary_exp_in_bi_exp379);
                    primary_exp5=primary_exp();

                    state._fsp--;


                    // TEMPLATE REWRITE
                    // 46:14: -> template(a=$primary_exp.st) \"<a>\"
                    {
                        retval.st = new StringTemplate(templateLib, "<a>",new STAttrMap().put("a", (primary_exp5!=null?primary_exp5.st:null)));
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
    // SxExpression.g:49:1: primary_exp : ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\");
    public final SxExpression.primary_exp_return primary_exp() throws RecognitionException {
        SxExpression.primary_exp_return retval = new SxExpression.primary_exp_return();
        retval.start = input.LT(1);


        CommonTree ID6=null;
        CommonTree INT7=null;
        CommonTree FLOAT8=null;
        SxExpression.bi_exp_return bi_exp9 =null;


        try {
            // SxExpression.g:50:1: ( ID -> {%{$ID.text}}| INT -> {%{$INT.text}}| FLOAT -> {%{$FLOAT.text}}| '(' bi_exp ')' -> template(a=$bi_exp.st) \"(<a>)\")
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
            case 15:
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
                    // SxExpression.g:51:1: ID
                    {
                    ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_primary_exp401); 

                    // TEMPLATE REWRITE
                    // 51:4: -> {%{$ID.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(ID6!=null?ID6.getText():null));
                    }



                    }
                    break;
                case 2 :
                    // SxExpression.g:52:3: INT
                    {
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_primary_exp409); 

                    // TEMPLATE REWRITE
                    // 52:7: -> {%{$INT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(INT7!=null?INT7.getText():null));
                    }



                    }
                    break;
                case 3 :
                    // SxExpression.g:53:3: FLOAT
                    {
                    FLOAT8=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_primary_exp417); 

                    // TEMPLATE REWRITE
                    // 53:9: -> {%{$FLOAT.text}}
                    {
                        retval.st = new StringTemplate(templateLib,(FLOAT8!=null?FLOAT8.getText():null));
                    }



                    }
                    break;
                case 4 :
                    // SxExpression.g:54:3: '(' bi_exp ')'
                    {
                    match(input,15,FOLLOW_15_in_primary_exp425); 

                    pushFollow(FOLLOW_bi_exp_in_primary_exp427);
                    bi_exp9=bi_exp();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_primary_exp429); 

                    // TEMPLATE REWRITE
                    // 54:18: -> template(a=$bi_exp.st) \"(<a>)\"
                    {
                        retval.st = new StringTemplate(templateLib, "(<a>)",new STAttrMap().put("a", (bi_exp9!=null?bi_exp9.st:null)));
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
        }
        return retval;
    }
    // $ANTLR end "primary_exp"

    // Delegated rules


 

    public static final BitSet FOLLOW_27_in_state_model83 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_state_model85 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_state_model89 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_state_model91 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_state_model93 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_state_model97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_state_model120 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_state_model122 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_state_model126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_action_exps159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_action_exp_in_action_exps163 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_action_exps_in_action_exps167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_action_exp_in_action_exps188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_action_exp209 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_action_exp211 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_action_exp213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SXAND_in_cond_exp245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_exp_in_cond_exp249 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_cond_exp_in_cond_exp253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_rel_exp_in_cond_exp279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELOP_in_rel_exp307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp311 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_rel_exp315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPER_in_bi_exp347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp351 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_bi_exp355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_exp_in_bi_exp379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_primary_exp401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_exp409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primary_exp417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primary_exp425 = new BitSet(new long[]{0x0000000000008780L});
    public static final BitSet FOLLOW_bi_exp_in_primary_exp427 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary_exp429 = new BitSet(new long[]{0x0000000000000002L});

}