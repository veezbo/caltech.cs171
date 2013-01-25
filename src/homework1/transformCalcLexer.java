
package homework1;
// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g 2012-10-17 03:08:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformCalcLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int REAL=4;
    public static final int WHITESPACE=5;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public transformCalcLexer() {} 
    public transformCalcLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public transformCalcLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:2:6: ( 'rotation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:2:8: 'rotation'
            {
            match("rotation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:3:6: ( 'scaleFactor' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:3:8: 'scaleFactor'
            {
            match("scaleFactor"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:4:6: ( 'translation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:4:8: 'translation'
            {
            match("translation"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:54:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:6: ( '0' | '0' . ( '0' .. '9' )* | . ( '0' .. '9' )+ | ( '1' .. '9' )+ ( '0' .. '9' )* ( . )? ( '0' .. '9' )* )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1 >= '\u0000' && LA7_1 <= '\uFFFF')) ) {
                    alt7=2;
                }
                else {
                    alt7=1;
                }
            }
            else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                switch ( input.LA(2) ) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt7=3;
                    }
                    break;
                case '0':
                    {
                    alt7=3;
                    }
                    break;
                default:
                    alt7=4;
                }

            }
            else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '/')||(LA7_0 >= ':' && LA7_0 <= '\uFFFF')) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:8: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:14: '0' . ( '0' .. '9' )*
                    {
                    match('0'); 

                    matchAny(); 

                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:19: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
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
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:33: . ( '0' .. '9' )+
                    {
                    matchAny(); 

                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:35: ( '0' .. '9' )+
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
                    	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
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
                    break;
                case 4 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:49: ( '1' .. '9' )+ ( '0' .. '9' )* ( . )? ( '0' .. '9' )*
                    {
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:49: ( '1' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
                    	    {
                    	    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
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


                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:61: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
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


                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:73: ( . )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\uFFFF')) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:73: .
                            {
                            matchAny(); 

                            }
                            break;

                    }


                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:56:76: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:
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
                    	    break loop6;
                        }
                    } while (true);


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
    // $ANTLR end "REAL"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:8: ( T__6 | T__7 | T__8 | WHITESPACE | REAL )
        int alt8=5;
        int LA8_0 = input.LA(1);

        if ( (LA8_0=='r') ) {
            int LA8_1 = input.LA(2);

            if ( (LA8_1=='o') ) {
                alt8=1;
            }
            else if ( ((LA8_1 >= '0' && LA8_1 <= '9')) ) {
                alt8=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 1, input);

                throw nvae;

            }
        }
        else if ( (LA8_0=='s') ) {
            int LA8_2 = input.LA(2);

            if ( (LA8_2=='c') ) {
                alt8=2;
            }
            else if ( ((LA8_2 >= '0' && LA8_2 <= '9')) ) {
                alt8=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 2, input);

                throw nvae;

            }
        }
        else if ( (LA8_0=='t') ) {
            int LA8_3 = input.LA(2);

            if ( (LA8_3=='r') ) {
                alt8=3;
            }
            else if ( ((LA8_3 >= '0' && LA8_3 <= '9')) ) {
                alt8=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 3, input);

                throw nvae;

            }
        }
        else if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||(LA8_0 >= '\f' && LA8_0 <= '\r')||LA8_0==' ') ) {
            int LA8_4 = input.LA(2);

            if ( ((LA8_4 >= '0' && LA8_4 <= '9')) ) {
                alt8=5;
            }
            else {
                alt8=4;
            }
        }
        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\b')||LA8_0=='\u000B'||(LA8_0 >= '\u000E' && LA8_0 <= '\u001F')||(LA8_0 >= '!' && LA8_0 <= 'q')||(LA8_0 >= 'u' && LA8_0 <= '\uFFFF')) ) {
            alt8=5;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 8, 0, input);

            throw nvae;

        }
        switch (alt8) {
            case 1 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:10: T__6
                {
                mT__6(); 


                }
                break;
            case 2 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:15: T__7
                {
                mT__7(); 


                }
                break;
            case 3 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:20: T__8
                {
                mT__8(); 


                }
                break;
            case 4 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:25: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 5 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:1:36: REAL
                {
                mREAL(); 


                }
                break;

        }

    }


 

}