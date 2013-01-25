// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g 2012-10-21 01:56:30

package homework1;
	
	import java.lang.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class polylineCalcParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "REAL", "WHITESPACE", "'polyline'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int INT=4;
    public static final int REAL=5;
    public static final int WHITESPACE=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public polylineCalcParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public polylineCalcParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return polylineCalcParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g"; }


    	


    protected static class polyline_scope {
        ArrayList<String> results;
    }
    protected Stack polyline_stack = new Stack();



    // $ANTLR start "polyline"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:19:1: polyline returns [ArrayList<String> result] : 'polyline' ( line )+ ;
    public final ArrayList<String> polyline() throws RecognitionException {
        polyline_stack.push(new polyline_scope());
        ArrayList<String> result = null;


         ((polyline_scope)polyline_stack.peek()).results = new ArrayList<String>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:24:2: ( 'polyline' ( line )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:24:4: 'polyline' ( line )+
            {
            match(input,7,FOLLOW_7_in_polyline44); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:24:15: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==REAL) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:24:15: line
            	    {
            	    pushFollow(FOLLOW_line_in_polyline46);
            	    line();

            	    state._fsp--;


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


            result = ((polyline_scope)polyline_stack.peek()).results;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            polyline_stack.pop();
        }
        return result;
    }
    // $ANTLR end "polyline"



    // $ANTLR start "line"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:28:10: fragment line : real real ;
    public final void line() throws RecognitionException {
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:30:2: ( real real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:30:4: real real
            {
            pushFollow(FOLLOW_real_in_line68);
            real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_line70);
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
    // $ANTLR end "line"



    // $ANTLR start "real"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:32:1: real : (r= REAL ) ;
    public final void real() throws RecognitionException {
        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:33:2: ( (r= REAL ) )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:33:4: (r= REAL )
            {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:33:4: (r= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\polylineCalc.g:33:5: r= REAL
            {
            r=(Token)match(input,REAL,FOLLOW_REAL_in_real84); 

            }


             ((polyline_scope)polyline_stack.peek()).results.add((r!=null?r.getText():null));

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

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_polyline44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_line_in_polyline46 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_real_in_line68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_real_in_line70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real84 = new BitSet(new long[]{0x0000000000000002L});

}