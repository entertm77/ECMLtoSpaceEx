// $ANTLR 3.4 ECMLFormula.g 2012-11-30 17:22:01

package parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ECMLFormulaLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ECMLFormulaLexer() {} 
    public ECMLFormulaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ECMLFormulaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ECMLFormula.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:11:7: ( '(' )
            // ECMLFormula.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:12:7: ( ')' )
            // ECMLFormula.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:13:7: ( '//' )
            // ECMLFormula.g:13:9: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:14:7: ( ':' )
            // ECMLFormula.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:15:7: ( ';' )
            // ECMLFormula.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:16:7: ( '=' )
            // ECMLFormula.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:17:7: ( 'A' )
            // ECMLFormula.g:17:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:18:7: ( 'C' )
            // ECMLFormula.g:18:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:19:7: ( 'D' )
            // ECMLFormula.g:19:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:20:7: ( 'E' )
            // ECMLFormula.g:20:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:21:7: ( '[' )
            // ECMLFormula.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:22:7: ( ']' )
            // ECMLFormula.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:23:7: ( 'd' )
            // ECMLFormula.g:23:9: 'd'
            {
            match('d'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:117:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ECMLFormula.g:118:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ECMLFormula.g:123:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ECMLFormula.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:133:3: ( ( '0' .. '9' )+ )
            // ECMLFormula.g:134:3: ( '0' .. '9' )+
            {
            // ECMLFormula.g:134:3: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ECMLFormula.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:139:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // ECMLFormula.g:140:3: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // ECMLFormula.g:140:3: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ECMLFormula.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // ECMLFormula.g:140:19: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ECMLFormula.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:144:3: ( '<' | '>' | '>=' | '<=' | '==' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='=') ) {
                    alt5=4;
                }
                else {
                    alt5=1;
                }
                }
                break;
            case '>':
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='=') ) {
                    alt5=3;
                }
                else {
                    alt5=2;
                }
                }
                break;
            case '=':
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // ECMLFormula.g:145:3: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:146:5: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // ECMLFormula.g:147:5: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // ECMLFormula.g:148:5: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 5 :
                    // ECMLFormula.g:149:5: '=='
                    {
                    match("=="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "ECMLOR"
    public final void mECMLOR() throws RecognitionException {
        try {
            int _type = ECMLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:151:7: ( '||' )
            // ECMLFormula.g:151:8: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECMLOR"

    // $ANTLR start "ECMLAND"
    public final void mECMLAND() throws RecognitionException {
        try {
            int _type = ECMLAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:152:8: ( '&&' )
            // ECMLFormula.g:152:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECMLAND"

    // $ANTLR start "SXOR"
    public final void mSXOR() throws RecognitionException {
        try {
            int _type = SXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:153:5: ( '|' )
            // ECMLFormula.g:153:6: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SXOR"

    // $ANTLR start "SXAND"
    public final void mSXAND() throws RecognitionException {
        try {
            int _type = SXAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:154:6: ( '&' )
            // ECMLFormula.g:154:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SXAND"

    // $ANTLR start "OPER"
    public final void mOPER() throws RecognitionException {
        try {
            int _type = OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:156:3: ( '+' | '-' | '/' | '*' )
            // ECMLFormula.g:
            {
            if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:164:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ECMLFormula.g:165:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ECMLFormula.g:165:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ECMLFormula.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);



                _channel=HIDDEN;
               

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ECMLFormula.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | FLOAT | RELOP | ECMLOR | ECMLAND | SXOR | SXAND | OPER | WS )
        int alt7=23;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ECMLFormula.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // ECMLFormula.g:1:16: T__16
                {
                mT__16(); 


                }
                break;
            case 3 :
                // ECMLFormula.g:1:22: T__17
                {
                mT__17(); 


                }
                break;
            case 4 :
                // ECMLFormula.g:1:28: T__18
                {
                mT__18(); 


                }
                break;
            case 5 :
                // ECMLFormula.g:1:34: T__19
                {
                mT__19(); 


                }
                break;
            case 6 :
                // ECMLFormula.g:1:40: T__20
                {
                mT__20(); 


                }
                break;
            case 7 :
                // ECMLFormula.g:1:46: T__21
                {
                mT__21(); 


                }
                break;
            case 8 :
                // ECMLFormula.g:1:52: T__22
                {
                mT__22(); 


                }
                break;
            case 9 :
                // ECMLFormula.g:1:58: T__23
                {
                mT__23(); 


                }
                break;
            case 10 :
                // ECMLFormula.g:1:64: T__24
                {
                mT__24(); 


                }
                break;
            case 11 :
                // ECMLFormula.g:1:70: T__25
                {
                mT__25(); 


                }
                break;
            case 12 :
                // ECMLFormula.g:1:76: T__26
                {
                mT__26(); 


                }
                break;
            case 13 :
                // ECMLFormula.g:1:82: T__27
                {
                mT__27(); 


                }
                break;
            case 14 :
                // ECMLFormula.g:1:88: ID
                {
                mID(); 


                }
                break;
            case 15 :
                // ECMLFormula.g:1:91: INT
                {
                mINT(); 


                }
                break;
            case 16 :
                // ECMLFormula.g:1:95: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 17 :
                // ECMLFormula.g:1:101: RELOP
                {
                mRELOP(); 


                }
                break;
            case 18 :
                // ECMLFormula.g:1:107: ECMLOR
                {
                mECMLOR(); 


                }
                break;
            case 19 :
                // ECMLFormula.g:1:114: ECMLAND
                {
                mECMLAND(); 


                }
                break;
            case 20 :
                // ECMLFormula.g:1:122: SXOR
                {
                mSXOR(); 


                }
                break;
            case 21 :
                // ECMLFormula.g:1:127: SXAND
                {
                mSXAND(); 


                }
                break;
            case 22 :
                // ECMLFormula.g:1:133: OPER
                {
                mOPER(); 


                }
                break;
            case 23 :
                // ECMLFormula.g:1:138: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\3\uffff\1\23\2\uffff\1\26\1\27\1\30\1\31\1\32\2\uffff\1\33\1\uffff"+
        "\1\34\1\uffff\1\37\1\41\17\uffff";
    static final String DFA7_eofS =
        "\42\uffff";
    static final String DFA7_minS =
        "\1\11\2\uffff\1\57\2\uffff\1\75\4\60\2\uffff\1\60\1\uffff\1\56\1"+
        "\uffff\1\174\1\46\17\uffff";
    static final String DFA7_maxS =
        "\1\174\2\uffff\1\57\2\uffff\1\75\4\172\2\uffff\1\172\1\uffff\1\71"+
        "\1\uffff\1\174\1\46\17\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\5\uffff\1\13\1\14\1\uffff\1\16"+
        "\1\uffff\1\21\2\uffff\1\26\1\27\1\3\1\6\1\7\1\10\1\11\1\12\1\15"+
        "\1\17\1\20\1\22\1\24\1\23\1\25";
    static final String DFA7_specialS =
        "\42\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\5\uffff\1\22\1\uffff\1\1\1"+
            "\2\2\23\1\uffff\1\23\1\uffff\1\3\12\17\1\4\1\5\1\20\1\6\1\20"+
            "\2\uffff\1\7\1\16\1\10\1\11\1\12\25\16\1\13\1\uffff\1\14\1\uffff"+
            "\1\16\1\uffff\3\16\1\15\26\16\1\uffff\1\21",
            "",
            "",
            "\1\25",
            "",
            "",
            "\1\20",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\35\1\uffff\12\17",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | FLOAT | RELOP | ECMLOR | ECMLAND | SXOR | SXAND | OPER | WS );";
        }
    }
 

}