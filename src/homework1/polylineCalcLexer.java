package homework1;

// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g 2012-10-21 01:56:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class polylineCalcLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int INT=4;
    public static final int REAL=5;
    public static final int WHITESPACE=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public polylineCalcLexer() {} 
    public polylineCalcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public polylineCalcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:2:6: ( 'polyline' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:2:8: 'polyline'
            {
            match("polyline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:45:12: ( ( '\\t' | ' ' | '\\r' | '\\n' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:45:14: ( '\\t' | ' ' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:49:6: ( ( '0' .. '9' )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:49:8: ( '0' .. '9' )+
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:49:8: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:7: ( ( '-' )? INT ( '.' ( INT )? )? )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:9: ( '-' )? INT ( '.' ( INT )? )?
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:9: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            mINT(); 


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:18: ( '.' ( INT )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:19: '.' ( INT )?
                    {
                    match('.'); 

                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:23: ( INT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:51:24: INT
                            {
                            mINT(); 


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:1:8: ( T__7 | WHITESPACE | INT | REAL )
        int alt5=4;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:1:10: T__7
                {
                mT__7(); 


                }
                break;
            case 2 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:1:15: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 3 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:1:26: INT
                {
                mINT(); 


                }
                break;
            case 4 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:1:30: REAL
                {
                mREAL(); 


                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\3\uffff\1\5\2\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\11\2\uffff\1\56\2\uffff";
    static final String DFA5_maxS =
        "\1\160\2\uffff\1\71\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\3";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\2\uffff\1\2\22\uffff\1\2\14\uffff\1\4\2\uffff\12\3\66\uffff"+
            "\1\1",
            "",
            "",
            "\1\4\1\uffff\12\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | WHITESPACE | INT | REAL );";
        }
    }
 

}