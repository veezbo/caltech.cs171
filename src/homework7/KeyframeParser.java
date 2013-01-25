// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g 2013-01-22 17:55:10

package homework7;
	
	import java.lang.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;
	import homework2.Quadruple;
	import homework2.Triple;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class KeyframeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "HASH", "INT", "REAL", "WHITESPACE", "'Frame'", "'rotation'", "'scale'", "'translation'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public KeyframeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public KeyframeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return KeyframeParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g"; }


    protected static class keyframeParse_scope {
        ArrayList<Keyframe> results;
    }
    protected Stack keyframeParse_stack = new Stack();



    // $ANTLR start "keyframeParse"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:20:1: keyframeParse returns [Keyframes result] : i= integer (frame= keyframe )+ ;
    public final Keyframes keyframeParse() throws RecognitionException {
        keyframeParse_stack.push(new keyframeParse_scope());
        Keyframes result = null;


        int i =0;

        Keyframe frame =null;


        	((keyframeParse_scope)keyframeParse_stack.peek()).results = new ArrayList<Keyframe>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:24:3: (i= integer (frame= keyframe )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:24:3: i= integer (frame= keyframe )+
            {
            pushFollow(FOLLOW_integer_in_keyframeParse42);
            i=integer();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:24:13: (frame= keyframe )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:24:15: frame= keyframe
            	    {
            	    pushFollow(FOLLOW_keyframe_in_keyframeParse48);
            	    frame=keyframe();

            	    state._fsp--;


            	    ((keyframeParse_scope)keyframeParse_stack.peek()).results.add(frame);

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


             result = new Keyframes(((keyframeParse_scope)keyframeParse_stack.peek()).results, i); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            keyframeParse_stack.pop();
        }
        return result;
    }
    // $ANTLR end "keyframeParse"



    // $ANTLR start "keyframe"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:29:1: keyframe returns [Keyframe k] : 'Frame' i= integer (t= translation |s= scale |r= rotation )+ ;
    public final Keyframe keyframe() throws RecognitionException {
        Keyframe k = null;


        int i =0;

        Triple t =null;

        Triple s =null;

        Quadruple r =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:2: ( 'Frame' i= integer (t= translation |s= scale |r= rotation )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:4: 'Frame' i= integer (t= translation |s= scale |r= rotation )+
            {
            match(input,9,FOLLOW_9_in_keyframe70); 

            pushFollow(FOLLOW_integer_in_keyframe74);
            i=integer();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:22: (t= translation |s= scale |r= rotation )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt2=1;
                    }
                    break;
                case 11:
                    {
                    alt2=2;
                    }
                    break;
                case 10:
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:23: t= translation
            	    {
            	    pushFollow(FOLLOW_translation_in_keyframe79);
            	    t=translation();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:39: s= scale
            	    {
            	    pushFollow(FOLLOW_scale_in_keyframe85);
            	    s=scale();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:30:49: r= rotation
            	    {
            	    pushFollow(FOLLOW_rotation_in_keyframe91);
            	    r=rotation();

            	    state._fsp--;


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



            	k = new Keyframe(t, s, r, i);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return k;
    }
    // $ANTLR end "keyframe"



    // $ANTLR start "translation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:35:1: translation returns [Triple t] : 'translation' trip= triple ;
    public final Triple translation() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:35:33: ( 'translation' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:35:35: 'translation' trip= triple
            {
            match(input,12,FOLLOW_12_in_translation108); 

            pushFollow(FOLLOW_triple_in_translation112);
            trip=triple();

            state._fsp--;


            t = trip;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "translation"



    // $ANTLR start "scale"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:36:1: scale returns [Triple t] : 'scale' trip= triple ;
    public final Triple scale() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:36:27: ( 'scale' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:36:30: 'scale' trip= triple
            {
            match(input,11,FOLLOW_11_in_scale127); 

            pushFollow(FOLLOW_triple_in_scale131);
            trip=triple();

            state._fsp--;


            t = trip;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "scale"



    // $ANTLR start "rotation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:37:1: rotation returns [Quadruple q] : 'rotation' quad= quadruple ;
    public final Quadruple rotation() throws RecognitionException {
        Quadruple q = null;


        Quadruple quad =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:37:33: ( 'rotation' quad= quadruple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:37:36: 'rotation' quad= quadruple
            {
            match(input,10,FOLLOW_10_in_rotation146); 

            pushFollow(FOLLOW_quadruple_in_rotation150);
            quad=quadruple();

            state._fsp--;


            q = quad;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "rotation"



    // $ANTLR start "triple"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:40:1: triple returns [Triple t] : r1= real r2= real r3= real ;
    public final Triple triple() throws RecognitionException {
        Triple t = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:40:28: (r1= real r2= real r3= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:40:30: r1= real r2= real r3= real
            {
            pushFollow(FOLLOW_real_in_triple168);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple172);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple176);
            r3=real();

            state._fsp--;


             t = new Triple(r1, r2, r3); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "triple"



    // $ANTLR start "quadruple"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:43:1: quadruple returns [Quadruple q] : r1= real r2= real r3= real r4= real ;
    public final Quadruple quadruple() throws RecognitionException {
        Quadruple q = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;

        double r4 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:43:33: (r1= real r2= real r3= real r4= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:43:35: r1= real r2= real r3= real r4= real
            {
            pushFollow(FOLLOW_real_in_quadruple193);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple197);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple201);
            r3=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple205);
            r4=real();

            state._fsp--;


             q = new Quadruple(r1, r2, r3, r4); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "quadruple"



    // $ANTLR start "real"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:46:1: real returns [double d] : r= REAL ;
    public final double real() throws RecognitionException {
        double d = 0.0;


        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:46:26: (r= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:46:28: r= REAL
            {
            r=(Token)match(input,REAL,FOLLOW_REAL_in_real222); 

             d = Double.parseDouble((r!=null?r.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "real"



    // $ANTLR start "integer"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:49:1: integer returns [int d] : i= REAL ;
    public final int integer() throws RecognitionException {
        int d = 0;


        Token i=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:49:26: (i= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\Keyframe.g:49:28: i= REAL
            {
            i=(Token)match(input,REAL,FOLLOW_REAL_in_integer239); 

             d = Integer.parseInt((i!=null?i.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return d;
    }
    // $ANTLR end "integer"

    // Delegated rules


 

    public static final BitSet FOLLOW_integer_in_keyframeParse42 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_keyframe_in_keyframeParse48 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_keyframe70 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_integer_in_keyframe74 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_translation_in_keyframe79 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_scale_in_keyframe85 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_rotation_in_keyframe91 = new BitSet(new long[]{0x0000000000001C02L});
    public static final BitSet FOLLOW_12_in_translation108 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_translation112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_scale127 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_scale131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rotation146 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_quadruple_in_rotation150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_triple168 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple172 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_quadruple193 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple197 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple201 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_integer239 = new BitSet(new long[]{0x0000000000000002L});

}