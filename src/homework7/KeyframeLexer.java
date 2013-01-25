package homework7;

// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g 2013-01-22 17:55:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class KeyframeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int COMMENT=4;
    public static final int HASH=5;
    public static final int INT=6;
    public static final int REAL=7;
    public static final int WHITESPACE=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public KeyframeLexer() {} 
    public KeyframeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public KeyframeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:2:6: ( 'Frame' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:2:8: 'Frame'
            {
            match("Frame"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:3:7: ( 'rotation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:3:9: 'rotation'
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
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:4:7: ( 'scale' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:4:9: 'scale'
            {
            match("scale"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:5:7: ( 'translation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:5:9: 'translation'
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
    // $ANTLR end "T__12"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:59:5: ( HASH ( . )* '\\n' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:59:7: HASH ( . )* '\\n'
            {
            mHASH(); 


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:59:12: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n') ) {
                    alt1=2;
                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:59:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\n'); 

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:62:12: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:62:14: ( ' ' | '\\n' | '\\t' | '\\r' )
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

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:64:7: ( '#' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:64:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:7: ( ( '-' )? ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:9: ( '-' )? ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:9: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:14: ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:15: ( '.' INT )
                    {
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:15: ( '.' INT )
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:16: '.' INT
                    {
                    match('.'); 

                    mINT(); 


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:27: ( INT ( '.' ( INT )? )? )
                    {
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:27: ( INT ( '.' ( INT )? )? )
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:28: INT ( '.' ( INT )? )?
                    {
                    mINT(); 


                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:32: ( '.' ( INT )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:33: '.' ( INT )?
                            {
                            match('.'); 

                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:37: ( INT )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:66:38: INT
                                    {
                                    mINT(); 


                                    }
                                    break;

                            }


                            }
                            break;

                    }


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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:68:15: ( ( '0' .. '9' )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:68:17: ( '0' .. '9' )+
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:68:17: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:8: ( T__9 | T__10 | T__11 | T__12 | COMMENT | WHITESPACE | HASH | REAL )
        int alt7=8;
        switch ( input.LA(1) ) {
        case 'F':
            {
            alt7=1;
            }
            break;
        case 'r':
            {
            alt7=2;
            }
            break;
        case 's':
            {
            alt7=3;
            }
            break;
        case 't':
            {
            alt7=4;
            }
            break;
        case '#':
            {
            int LA7_5 = input.LA(2);

            if ( ((LA7_5 >= '\u0000' && LA7_5 <= '\uFFFF')) ) {
                alt7=5;
            }
            else {
                alt7=7;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=6;
            }
            break;
        case '-':
        case '.':
        case '0':
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
            alt7=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:33: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:41: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 7 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:52: HASH
                {
                mHASH(); 


                }
                break;
            case 8 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:1:57: REAL
                {
                mREAL(); 


                }
                break;

        }

    }


 

}