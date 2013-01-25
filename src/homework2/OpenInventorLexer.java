package homework2;

// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g 2012-11-22 05:07:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OpenInventorLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
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

    public OpenInventorLexer() {} 
    public OpenInventorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OpenInventorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:2:6: ( ',' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:2:8: ','
            {
            match(','); 

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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:3:7: ( 'Coordinate3 {' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:3:9: 'Coordinate3 {'
            {
            match("Coordinate3 {"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:4:7: ( 'IndexedFaceSet {' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:4:9: 'IndexedFaceSet {'
            {
            match("IndexedFaceSet {"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:5:7: ( 'PerspectiveCamera {' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:5:9: 'PerspectiveCamera {'
            {
            match("PerspectiveCamera {"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:6:7: ( 'Separator {' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:6:9: 'Separator {'
            {
            match("Separator {"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:7:7: ( 'Transform {' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:7:9: 'Transform {'
            {
            match("Transform {"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:8:7: ( ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:8:9: ']'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:9:7: ( 'bottom' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:9:9: 'bottom'
            {
            match("bottom"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:10:7: ( 'coordIndex [' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:10:9: 'coordIndex ['
            {
            match("coordIndex ["); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:11:7: ( 'farDistance' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:11:9: 'farDistance'
            {
            match("farDistance"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:12:7: ( 'left' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:12:9: 'left'
            {
            match("left"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:13:7: ( 'nearDistance' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:13:9: 'nearDistance'
            {
            match("nearDistance"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:14:7: ( 'orientation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:14:9: 'orientation'
            {
            match("orientation"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:15:7: ( 'point [' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:15:9: 'point ['
            {
            match("point ["); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:16:7: ( 'position' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:16:9: 'position'
            {
            match("position"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:17:7: ( 'right' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:17:9: 'right'
            {
            match("right"); 



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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:18:7: ( 'rotation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:18:9: 'rotation'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:19:7: ( 'scaleFactor' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:19:9: 'scaleFactor'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:20:7: ( 'top' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:20:9: 'top'
            {
            match("top"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:21:7: ( 'translation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:21:9: 'translation'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:22:7: ( '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:139:5: ( HASH ( . )* '\\n' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:139:7: HASH ( . )* '\\n'
            {
            mHASH(); 


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:139:12: ( . )*
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
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:139:12: .
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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:142:12: ( ( ' ' | '\\n' | '\\t' | '\\r' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:142:14: ( ' ' | '\\n' | '\\t' | '\\r' )
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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:144:7: ( '#' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:144:9: '#'
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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:7: ( ( '-' )? ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:9: ( '-' )? ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:9: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:9: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:14: ( ( '.' INT ) | ( INT ( '.' ( INT )? )? ) )
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
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:15: ( '.' INT )
                    {
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:15: ( '.' INT )
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:16: '.' INT
                    {
                    match('.'); 

                    mINT(); 


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:27: ( INT ( '.' ( INT )? )? )
                    {
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:27: ( INT ( '.' ( INT )? )? )
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:28: INT ( '.' ( INT )? )?
                    {
                    mINT(); 


                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:32: ( '.' ( INT )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:33: '.' ( INT )?
                            {
                            match('.'); 

                            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:37: ( INT )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:146:38: INT
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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:148:15: ( ( '0' .. '9' )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:148:17: ( '0' .. '9' )+
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:148:17: ( '0' .. '9' )+
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
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:
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
        // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | COMMENT | WHITESPACE | HASH | REAL )
        int alt7=25;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt7=1;
            }
            break;
        case 'C':
            {
            alt7=2;
            }
            break;
        case 'I':
            {
            alt7=3;
            }
            break;
        case 'P':
            {
            alt7=4;
            }
            break;
        case 'S':
            {
            alt7=5;
            }
            break;
        case 'T':
            {
            alt7=6;
            }
            break;
        case ']':
            {
            alt7=7;
            }
            break;
        case 'b':
            {
            alt7=8;
            }
            break;
        case 'c':
            {
            alt7=9;
            }
            break;
        case 'f':
            {
            alt7=10;
            }
            break;
        case 'l':
            {
            alt7=11;
            }
            break;
        case 'n':
            {
            alt7=12;
            }
            break;
        case 'o':
            {
            alt7=13;
            }
            break;
        case 'p':
            {
            int LA7_14 = input.LA(2);

            if ( (LA7_14=='o') ) {
                int LA7_22 = input.LA(3);

                if ( (LA7_22=='i') ) {
                    alt7=14;
                }
                else if ( (LA7_22=='s') ) {
                    alt7=15;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 22, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 14, input);

                throw nvae;

            }
            }
            break;
        case 'r':
            {
            int LA7_15 = input.LA(2);

            if ( (LA7_15=='i') ) {
                alt7=16;
            }
            else if ( (LA7_15=='o') ) {
                alt7=17;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 15, input);

                throw nvae;

            }
            }
            break;
        case 's':
            {
            alt7=18;
            }
            break;
        case 't':
            {
            int LA7_17 = input.LA(2);

            if ( (LA7_17=='o') ) {
                alt7=19;
            }
            else if ( (LA7_17=='r') ) {
                alt7=20;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 17, input);

                throw nvae;

            }
            }
            break;
        case '}':
            {
            alt7=21;
            }
            break;
        case '#':
            {
            int LA7_19 = input.LA(2);

            if ( ((LA7_19 >= '\u0000' && LA7_19 <= '\uFFFF')) ) {
                alt7=22;
            }
            else {
                alt7=24;
            }
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=23;
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
            alt7=25;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:99: T__24
                {
                mT__24(); 


                }
                break;
            case 17 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:105: T__25
                {
                mT__25(); 


                }
                break;
            case 18 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:111: T__26
                {
                mT__26(); 


                }
                break;
            case 19 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:117: T__27
                {
                mT__27(); 


                }
                break;
            case 20 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:123: T__28
                {
                mT__28(); 


                }
                break;
            case 21 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:129: T__29
                {
                mT__29(); 


                }
                break;
            case 22 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:135: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 23 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:143: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 24 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:154: HASH
                {
                mHASH(); 


                }
                break;
            case 25 :
                // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:1:159: REAL
                {
                mREAL(); 


                }
                break;

        }

    }


 

}