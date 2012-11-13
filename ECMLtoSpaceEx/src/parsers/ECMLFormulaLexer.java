// $ANTLR 3.4 ECMLFormula.g 2012-11-13 19:53:17

package parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ECMLFormulaLexer extends Lexer {
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

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        traceIn("T__13", 1);
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:11:7: ( '&&' )
            // ECMLFormula.g:11:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__13", 1);
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        traceIn("T__14", 2);
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:12:7: ( '(' )
            // ECMLFormula.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__14", 2);
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        traceIn("T__15", 3);
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:13:7: ( ')' )
            // ECMLFormula.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__15", 3);
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        traceIn("T__16", 4);
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:14:7: ( '//' )
            // ECMLFormula.g:14:9: '//'
            {
            match("//"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__16", 4);
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        traceIn("T__17", 5);
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:15:7: ( ':' )
            // ECMLFormula.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__17", 5);
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        traceIn("T__18", 6);
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:16:7: ( ';' )
            // ECMLFormula.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__18", 6);
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        traceIn("T__19", 7);
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:17:7: ( '=' )
            // ECMLFormula.g:17:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__19", 7);
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        traceIn("T__20", 8);
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:18:7: ( 'A' )
            // ECMLFormula.g:18:9: 'A'
            {
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__20", 8);
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        traceIn("T__21", 9);
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:19:7: ( 'C' )
            // ECMLFormula.g:19:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__21", 9);
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        traceIn("T__22", 10);
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:20:7: ( 'D' )
            // ECMLFormula.g:20:9: 'D'
            {
            match('D'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__22", 10);
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        traceIn("T__23", 11);
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:21:7: ( 'E' )
            // ECMLFormula.g:21:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__23", 11);
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        traceIn("T__24", 12);
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:22:7: ( '[' )
            // ECMLFormula.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__24", 12);
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        traceIn("T__25", 13);
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:23:7: ( ']' )
            // ECMLFormula.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__25", 13);
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        traceIn("T__26", 14);
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:24:7: ( '||' )
            // ECMLFormula.g:24:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
            traceOut("T__26", 14);
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        traceIn("ID", 15);
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:119:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ECMLFormula.g:120:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // ECMLFormula.g:125:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            traceOut("ID", 15);
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        traceIn("INT", 16);
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:135:3: ( ( '0' .. '9' )+ )
            // ECMLFormula.g:136:3: ( '0' .. '9' )+
            {
            // ECMLFormula.g:136:3: ( '0' .. '9' )+
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
            traceOut("INT", 16);
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        traceIn("FLOAT", 17);
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:141:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // ECMLFormula.g:142:3: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // ECMLFormula.g:142:3: ( '0' .. '9' )+
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

            // ECMLFormula.g:142:19: ( '0' .. '9' )*
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
            traceOut("FLOAT", 17);
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        traceIn("RELOP", 18);
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:146:3: ( '<' | '>' | '>=' | '<=' | '==' )
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
                    // ECMLFormula.g:147:3: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ECMLFormula.g:148:5: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // ECMLFormula.g:149:5: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // ECMLFormula.g:150:5: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 5 :
                    // ECMLFormula.g:151:5: '=='
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
            traceOut("RELOP", 18);
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "OPER"
    public final void mOPER() throws RecognitionException {
        traceIn("OPER", 19);
        try {
            int _type = OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:155:3: ( '+' | '-' | '/' | '*' )
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
            traceOut("OPER", 19);
        }
    }
    // $ANTLR end "OPER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        traceIn("WS", 20);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ECMLFormula.g:163:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ECMLFormula.g:164:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ECMLFormula.g:164:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            traceOut("WS", 20);
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ECMLFormula.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | FLOAT | RELOP | OPER | WS )
        int alt7=20;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ECMLFormula.g:1:10: T__13
                {
                mT__13(); 


                }
                break;
            case 2 :
                // ECMLFormula.g:1:16: T__14
                {
                mT__14(); 


                }
                break;
            case 3 :
                // ECMLFormula.g:1:22: T__15
                {
                mT__15(); 


                }
                break;
            case 4 :
                // ECMLFormula.g:1:28: T__16
                {
                mT__16(); 


                }
                break;
            case 5 :
                // ECMLFormula.g:1:34: T__17
                {
                mT__17(); 


                }
                break;
            case 6 :
                // ECMLFormula.g:1:40: T__18
                {
                mT__18(); 


                }
                break;
            case 7 :
                // ECMLFormula.g:1:46: T__19
                {
                mT__19(); 


                }
                break;
            case 8 :
                // ECMLFormula.g:1:52: T__20
                {
                mT__20(); 


                }
                break;
            case 9 :
                // ECMLFormula.g:1:58: T__21
                {
                mT__21(); 


                }
                break;
            case 10 :
                // ECMLFormula.g:1:64: T__22
                {
                mT__22(); 


                }
                break;
            case 11 :
                // ECMLFormula.g:1:70: T__23
                {
                mT__23(); 


                }
                break;
            case 12 :
                // ECMLFormula.g:1:76: T__24
                {
                mT__24(); 


                }
                break;
            case 13 :
                // ECMLFormula.g:1:82: T__25
                {
                mT__25(); 


                }
                break;
            case 14 :
                // ECMLFormula.g:1:88: T__26
                {
                mT__26(); 


                }
                break;
            case 15 :
                // ECMLFormula.g:1:94: ID
                {
                mID(); 


                }
                break;
            case 16 :
                // ECMLFormula.g:1:97: INT
                {
                mINT(); 


                }
                break;
            case 17 :
                // ECMLFormula.g:1:101: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 18 :
                // ECMLFormula.g:1:107: RELOP
                {
                mRELOP(); 


                }
                break;
            case 19 :
                // ECMLFormula.g:1:113: OPER
                {
                mOPER(); 


                }
                break;
            case 20 :
                // ECMLFormula.g:1:118: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\1\22\2\uffff\1\25\1\26\1\27\1\30\1\31\4\uffff\1\32\13\uffff";
    static final String DFA7_eofS =
        "\34\uffff";
    static final String DFA7_minS =
        "\1\11\3\uffff\1\57\2\uffff\1\75\4\60\4\uffff\1\56\13\uffff";
    static final String DFA7_maxS =
        "\1\174\3\uffff\1\57\2\uffff\1\75\4\172\4\uffff\1\71\13\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\5\uffff\1\14\1\15\1\16\1\17"+
        "\1\uffff\1\22\1\23\1\24\1\4\1\7\1\10\1\11\1\12\1\13\1\20\1\21";
    static final String DFA7_specialS =
        "\34\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\5\uffff\1\1\1\uffff\1\2\1\3"+
            "\2\22\1\uffff\1\22\1\uffff\1\4\12\20\1\5\1\6\1\21\1\7\1\21\2"+
            "\uffff\1\10\1\17\1\11\1\12\1\13\25\17\1\14\1\uffff\1\15\1\uffff"+
            "\1\17\1\uffff\32\17\1\uffff\1\16",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "\1\21",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "",
            "",
            "",
            "",
            "\1\33\1\uffff\12\20",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | INT | FLOAT | RELOP | OPER | WS );";
        }
    }
 

}