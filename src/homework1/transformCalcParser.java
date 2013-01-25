
package homework1;
// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g 2012-10-17 03:08:05

	import java.lang.*;
import java.util.*;


import org.antlr.runtime.*;
import org.antlr.runtime.BitSet;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class transformCalcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "REAL", "WHITESPACE", "'rotation'", "'scaleFactor'", "'translation'"
    };

    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int REAL=4;
    public static final int WHITESPACE=5;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public transformCalcParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public transformCalcParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return transformCalcParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g"; }


    	


    protected static class transformation_scope {
        ArrayList<String> results;
    }
    protected Stack transformation_stack = new Stack();



    // $ANTLR start "transformation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:16:1: transformation returns [ArrayList<String> result] : ( translation | rotation | scaleFactor ) ( WHITESPACE )+ ;
    public final ArrayList<String> transformation() throws RecognitionException {
        transformation_stack.push(new transformation_scope());
        ArrayList<String> result = null;


         ((transformation_scope)transformation_stack.peek()).results = new ArrayList<String>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:2: ( ( translation | rotation | scaleFactor ) ( WHITESPACE )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:4: ( translation | rotation | scaleFactor ) ( WHITESPACE )+
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:4: ( translation | rotation | scaleFactor )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:5: translation
                    {
                    pushFollow(FOLLOW_translation_in_transformation41);
                    translation();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:19: rotation
                    {
                    pushFollow(FOLLOW_rotation_in_transformation45);
                    rotation();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:30: scaleFactor
                    {
                    pushFollow(FOLLOW_scaleFactor_in_transformation49);
                    scaleFactor();

                    state._fsp--;


                    }
                    break;

            }


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:43: ( WHITESPACE )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==WHITESPACE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:20:43: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_transformation52); 

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


             result = ((transformation_scope)transformation_stack.peek()).results; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            transformation_stack.pop();
        }
        return result;
    }
    // $ANTLR end "transformation"



    // $ANTLR start "translation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:24:1: translation : ( WHITESPACE )* transText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ;
    public final void translation() throws RecognitionException {
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:3: ( ( WHITESPACE )* transText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:5: ( WHITESPACE )* transText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:5: ( WHITESPACE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WHITESPACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:5: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_translation70); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            pushFollow(FOLLOW_transText_in_translation73);
            transText();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:27: ( WHITESPACE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WHITESPACE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:27: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_translation75); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_translation78);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:44: ( WHITESPACE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==WHITESPACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:44: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_translation80); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_translation83);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:61: ( WHITESPACE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WHITESPACE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:25:61: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_translation85); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_translation88);
            real();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "translation"



    // $ANTLR start "rotation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:27:1: rotation : ( WHITESPACE )* rotText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ;
    public final void rotation() throws RecognitionException {
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:2: ( ( WHITESPACE )* rotText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:4: ( WHITESPACE )* rotText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:4: ( WHITESPACE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==WHITESPACE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:4: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_rotation98); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_rotText_in_rotation101);
            rotText();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:24: ( WHITESPACE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==WHITESPACE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:24: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_rotation103); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_rotation106);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:41: ( WHITESPACE )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==WHITESPACE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:41: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_rotation108); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_rotation111);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:58: ( WHITESPACE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==WHITESPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:58: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_rotation113); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_rotation116);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:75: ( WHITESPACE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WHITESPACE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:28:75: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_rotation118); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_rotation121);
            real();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rotation"



    // $ANTLR start "scaleFactor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:30:1: scaleFactor : ( WHITESPACE )* scaleText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real ;
    public final void scaleFactor() throws RecognitionException {
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:2: ( ( WHITESPACE )* scaleText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:4: ( WHITESPACE )* scaleText ( WHITESPACE )* real ( WHITESPACE )* real ( WHITESPACE )* real
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:4: ( WHITESPACE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WHITESPACE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:4: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_scaleFactor131); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_scaleText_in_scaleFactor134);
            scaleText();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:26: ( WHITESPACE )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WHITESPACE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:26: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_scaleFactor136); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_scaleFactor139);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:43: ( WHITESPACE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WHITESPACE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:43: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_scaleFactor141); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_scaleFactor144);
            real();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:60: ( WHITESPACE )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WHITESPACE) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:31:60: WHITESPACE
            	    {
            	    match(input,WHITESPACE,FOLLOW_WHITESPACE_in_scaleFactor146); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            pushFollow(FOLLOW_real_in_scaleFactor149);
            real();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "scaleFactor"



    // $ANTLR start "real"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:33:1: real : (r= REAL ) ;
    public final void real() throws RecognitionException {
        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:34:2: ( (r= REAL ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:34:4: (r= REAL )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:34:4: (r= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:34:5: r= REAL
            {
            r=(Token)match(input,REAL,FOLLOW_REAL_in_real162); 

            }


             ((transformation_scope)transformation_stack.peek()).results.add((r!=null?r.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "real"



    // $ANTLR start "transText"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:37:1: transText : (t= 'translation' ) ;
    public final void transText() throws RecognitionException {
        Token t=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:38:2: ( (t= 'translation' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:38:4: (t= 'translation' )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:38:4: (t= 'translation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:38:5: t= 'translation'
            {
            t=(Token)match(input,8,FOLLOW_8_in_transText182); 

            }


            ((transformation_scope)transformation_stack.peek()).results.add((t!=null?t.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "transText"



    // $ANTLR start "rotText"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:40:1: rotText : (r= 'rotation' ) ;
    public final void rotText() throws RecognitionException {
        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:41:2: ( (r= 'rotation' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:41:4: (r= 'rotation' )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:41:4: (r= 'rotation' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:41:5: r= 'rotation'
            {
            r=(Token)match(input,6,FOLLOW_6_in_rotText200); 

            }


            ((transformation_scope)transformation_stack.peek()).results.add((r!=null?r.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "rotText"



    // $ANTLR start "scaleText"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:43:1: scaleText : (s= 'scaleFactor' ) ;
    public final void scaleText() throws RecognitionException {
        Token s=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:44:2: ( (s= 'scaleFactor' ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:44:4: (s= 'scaleFactor' )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:44:4: (s= 'scaleFactor' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\transformCalc.g:44:5: s= 'scaleFactor'
            {
            s=(Token)match(input,7,FOLLOW_7_in_scaleText217); 

            }


            ((transformation_scope)transformation_stack.peek()).results.add((s!=null?s.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "scaleText"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\5\uffff";
    static final String DFA1_eofS =
        "\5\uffff";
    static final String DFA1_minS =
        "\2\5\3\uffff";
    static final String DFA1_maxS =
        "\2\10\3\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA1_specialS =
        "\5\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\3\1\4\1\2",
            "\1\1\1\3\1\4\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "20:4: ( translation | rotation | scaleFactor )";
        }
    }
 

    public static final BitSet FOLLOW_translation_in_transformation41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rotation_in_transformation45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_scaleFactor_in_transformation49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_WHITESPACE_in_transformation52 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_WHITESPACE_in_translation70 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_transText_in_translation73 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_translation75 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_translation78 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_translation80 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_translation83 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_translation85 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_translation88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITESPACE_in_rotation98 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rotText_in_rotation101 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_rotation103 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_rotation106 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_rotation108 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_rotation111 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_rotation113 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_rotation116 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_rotation118 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_rotation121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITESPACE_in_scaleFactor131 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_scaleText_in_scaleFactor134 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_scaleFactor136 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_scaleFactor139 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_scaleFactor141 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_scaleFactor144 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_WHITESPACE_in_scaleFactor146 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_real_in_scaleFactor149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_transText182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_rotText200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_scaleText217 = new BitSet(new long[]{0x0000000000000002L});

}