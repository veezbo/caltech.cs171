// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g 2013-03-29 00:11:15

package homework2;
	
	import java.lang.*;
	import java.util.*;
	import org.antlr.runtime.BitSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OpenInventorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "HASH", "INT", "REAL", "WHITESPACE", "','", "'Coordinate3'", "'IndexedFaceSet'", "'PerspectiveCamera'", "'Separator'", "'Transform'", "'['", "']'", "'bottom'", "'coordIndex'", "'farDistance'", "'left'", "'nearDistance'", "'orientation'", "'point'", "'position'", "'right'", "'rotation'", "'scaleFactor'", "'top'", "'translation'", "'{'", "'}'"
    };

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
    public static final int T__30=30;
    public static final int T__31=31;
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


    public OpenInventorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OpenInventorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return OpenInventorParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g"; }


    	/* public static class OpenInventorData {
    		ArrayList<Double> perspectiveCamera = new ArrayList<Double>();
    		
    		public OpenInventor() {}
    	} */


    protected static class openinventor_scope {
        ArrayList<SeparatorData> sds;
    }
    protected Stack openinventor_stack = new Stack();



    // $ANTLR start "openinventor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:24:1: openinventor returns [OpenInventorData result] : cameraData= perspectiveCamera (sepData= separator )+ ;
    public final OpenInventorData openinventor() throws RecognitionException {
        openinventor_stack.push(new openinventor_scope());
        OpenInventorData result = null;


        PerspectiveCameraData cameraData =null;

        SeparatorData sepData =null;



        	((openinventor_scope)openinventor_stack.peek()).sds = new ArrayList<SeparatorData>();	

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:31:2: (cameraData= perspectiveCamera (sepData= separator )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:31:4: cameraData= perspectiveCamera (sepData= separator )+
            {
            pushFollow(FOLLOW_perspectiveCamera_in_openinventor44);
            cameraData=perspectiveCamera();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:32:4: (sepData= separator )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:32:6: sepData= separator
            	    {
            	    pushFollow(FOLLOW_separator_in_openinventor53);
            	    sepData=separator();

            	    state._fsp--;


            	     ((openinventor_scope)openinventor_stack.peek()).sds.add(sepData); 

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



             	result = new OpenInventorData(cameraData, ((openinventor_scope)openinventor_stack.peek()).sds);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            openinventor_stack.pop();
        }
        return result;
    }
    // $ANTLR end "openinventor"



    // $ANTLR start "perspectiveCamera"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:41:1: perspectiveCamera returns [PerspectiveCameraData pcd] : 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}' ;
    public final PerspectiveCameraData perspectiveCamera() throws RecognitionException {
        PerspectiveCameraData pcd = null;


        Triple pos =null;

        Quadruple orient =null;

        double n =0.0;

        double f =0.0;

        double l =0.0;

        double r =0.0;

        double t =0.0;

        double b =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:42:2: ( 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:42:4: 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}'
            {
            match(input,12,FOLLOW_12_in_perspectiveCamera78); 

            match(input,30,FOLLOW_30_in_perspectiveCamera80); 

            pushFollow(FOLLOW_position_in_perspectiveCamera86);
            pos=position();

            state._fsp--;


            pushFollow(FOLLOW_orientation_in_perspectiveCamera92);
            orient=orientation();

            state._fsp--;


            pushFollow(FOLLOW_nearDistance_in_perspectiveCamera98);
            n=nearDistance();

            state._fsp--;


            pushFollow(FOLLOW_farDistance_in_perspectiveCamera104);
            f=farDistance();

            state._fsp--;


            pushFollow(FOLLOW_left_in_perspectiveCamera110);
            l=left();

            state._fsp--;


            pushFollow(FOLLOW_right_in_perspectiveCamera116);
            r=right();

            state._fsp--;


            pushFollow(FOLLOW_top_in_perspectiveCamera122);
            t=top();

            state._fsp--;


            pushFollow(FOLLOW_bottom_in_perspectiveCamera128);
            b=bottom();

            state._fsp--;


            match(input,31,FOLLOW_31_in_perspectiveCamera130); 


            	pcd = new PerspectiveCameraData(pos, orient, n, f, l, r, t, b);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pcd;
    }
    // $ANTLR end "perspectiveCamera"



    // $ANTLR start "position"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:46:1: position returns [Triple t] : 'position' trip= triple ;
    public final Triple position() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:46:30: ( 'position' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:46:32: 'position' trip= triple
            {
            match(input,24,FOLLOW_24_in_position144); 

            pushFollow(FOLLOW_triple_in_position148);
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
    // $ANTLR end "position"



    // $ANTLR start "orientation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:47:1: orientation returns [Quadruple q] : 'orientation' quad= quadruple ;
    public final Quadruple orientation() throws RecognitionException {
        Quadruple q = null;


        Quadruple quad =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:47:36: ( 'orientation' quad= quadruple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:47:38: 'orientation' quad= quadruple
            {
            match(input,22,FOLLOW_22_in_orientation163); 

            pushFollow(FOLLOW_quadruple_in_orientation167);
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
    // $ANTLR end "orientation"



    // $ANTLR start "nearDistance"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:48:1: nearDistance returns [double d] : 'nearDistance' r= real ;
    public final double nearDistance() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:48:34: ( 'nearDistance' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:48:36: 'nearDistance' r= real
            {
            match(input,21,FOLLOW_21_in_nearDistance181); 

            pushFollow(FOLLOW_real_in_nearDistance185);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "nearDistance"



    // $ANTLR start "farDistance"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:49:1: farDistance returns [double d] : 'farDistance' r= real ;
    public final double farDistance() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:49:33: ( 'farDistance' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:49:35: 'farDistance' r= real
            {
            match(input,19,FOLLOW_19_in_farDistance199); 

            pushFollow(FOLLOW_real_in_farDistance203);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "farDistance"



    // $ANTLR start "left"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:50:1: left returns [double d] : 'left' r= real ;
    public final double left() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:50:27: ( 'left' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:50:29: 'left' r= real
            {
            match(input,20,FOLLOW_20_in_left218); 

            pushFollow(FOLLOW_real_in_left222);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "left"



    // $ANTLR start "right"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:51:1: right returns [double d] : 'right' r= real ;
    public final double right() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:51:27: ( 'right' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:51:29: 'right' r= real
            {
            match(input,25,FOLLOW_25_in_right236); 

            pushFollow(FOLLOW_real_in_right240);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "right"



    // $ANTLR start "top"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:52:1: top returns [double d] : 'top' r= real ;
    public final double top() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:52:26: ( 'top' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:52:28: 'top' r= real
            {
            match(input,28,FOLLOW_28_in_top255); 

            pushFollow(FOLLOW_real_in_top259);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "top"



    // $ANTLR start "bottom"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:53:1: bottom returns [double d] : 'bottom' r= real ;
    public final double bottom() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:53:28: ( 'bottom' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:53:30: 'bottom' r= real
            {
            match(input,17,FOLLOW_17_in_bottom273); 

            pushFollow(FOLLOW_real_in_bottom277);
            r=real();

            state._fsp--;


             d = r; 

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
    // $ANTLR end "bottom"


    protected static class separator_scope {
        ArrayList<TransformData> tds;
    }
    protected Stack separator_stack = new Stack();



    // $ANTLR start "separator"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:61:1: separator returns [SeparatorData sd] : 'Separator' '{' (t= transform )+ c= coordinate3 i= indexedFaceSet '}' ;
    public final SeparatorData separator() throws RecognitionException {
        separator_stack.push(new separator_scope());
        SeparatorData sd = null;


        TransformData t =null;

        Coordinate3Data c =null;

        IndexedFaceSetData i =null;


        	((separator_scope)separator_stack.peek()).tds = new ArrayList<TransformData>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:64:3: ( 'Separator' '{' (t= transform )+ c= coordinate3 i= indexedFaceSet '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:64:3: 'Separator' '{' (t= transform )+ c= coordinate3 i= indexedFaceSet '}'
            {
            match(input,13,FOLLOW_13_in_separator307); 

            match(input,30,FOLLOW_30_in_separator309); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:64:19: (t= transform )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:64:20: t= transform
            	    {
            	    pushFollow(FOLLOW_transform_in_separator314);
            	    t=transform();

            	    state._fsp--;


            	    ((separator_scope)separator_stack.peek()).tds.add(t); 

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


            pushFollow(FOLLOW_coordinate3_in_separator324);
            c=coordinate3();

            state._fsp--;


            pushFollow(FOLLOW_indexedFaceSet_in_separator330);
            i=indexedFaceSet();

            state._fsp--;


            match(input,31,FOLLOW_31_in_separator332); 


            	sd = new SeparatorData(((separator_scope)separator_stack.peek()).tds, c, i);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            separator_stack.pop();
        }
        return sd;
    }
    // $ANTLR end "separator"



    // $ANTLR start "transform"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:1: transform returns [TransformData td] : 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}' ;
    public final TransformData transform() throws RecognitionException {
        TransformData td = null;


        Triple t =null;

        Quadruple r =null;

        Triple s =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:38: ( 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:41: 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}'
            {
            match(input,14,FOLLOW_14_in_transform354); 

            match(input,30,FOLLOW_30_in_transform356); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:57: (t= translation |r= rotation |s= scaleFactor )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case 26:
                    {
                    alt3=2;
                    }
                    break;
                case 27:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:58: t= translation
            	    {
            	    pushFollow(FOLLOW_translation_in_transform361);
            	    t=translation();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:75: r= rotation
            	    {
            	    pushFollow(FOLLOW_rotation_in_transform368);
            	    r=rotation();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:74:89: s= scaleFactor
            	    {
            	    pushFollow(FOLLOW_scaleFactor_in_transform375);
            	    s=scaleFactor();

            	    state._fsp--;


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


            match(input,31,FOLLOW_31_in_transform379); 


            	td = new TransformData(t, r, s);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return td;
    }
    // $ANTLR end "transform"



    // $ANTLR start "translation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:79:1: translation returns [Triple t] : 'translation' trip= triple ;
    public final Triple translation() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:79:33: ( 'translation' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:79:35: 'translation' trip= triple
            {
            match(input,29,FOLLOW_29_in_translation394); 

            pushFollow(FOLLOW_triple_in_translation398);
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



    // $ANTLR start "rotation"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:80:1: rotation returns [Quadruple q] : 'rotation' quad= quadruple ;
    public final Quadruple rotation() throws RecognitionException {
        Quadruple q = null;


        Quadruple quad =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:80:33: ( 'rotation' quad= quadruple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:80:36: 'rotation' quad= quadruple
            {
            match(input,26,FOLLOW_26_in_rotation413); 

            pushFollow(FOLLOW_quadruple_in_rotation417);
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



    // $ANTLR start "scaleFactor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:81:1: scaleFactor returns [Triple t] : 'scaleFactor' trip= triple ;
    public final Triple scaleFactor() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:81:33: ( 'scaleFactor' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:81:36: 'scaleFactor' trip= triple
            {
            match(input,27,FOLLOW_27_in_scaleFactor432); 

            pushFollow(FOLLOW_triple_in_scaleFactor436);
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
    // $ANTLR end "scaleFactor"



    // $ANTLR start "coordinate3"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:86:1: coordinate3 returns [Coordinate3Data cd] : 'Coordinate3' '{' pts= points '}' ;
    public final Coordinate3Data coordinate3() throws RecognitionException {
        Coordinate3Data cd = null;


        ArrayList<Triple> pts =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:86:44: ( 'Coordinate3' '{' pts= points '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:86:46: 'Coordinate3' '{' pts= points '}'
            {
            match(input,10,FOLLOW_10_in_coordinate3455); 

            match(input,30,FOLLOW_30_in_coordinate3457); 

            pushFollow(FOLLOW_points_in_coordinate3461);
            pts=points();

            state._fsp--;


            match(input,31,FOLLOW_31_in_coordinate3463); 


            	cd = new Coordinate3Data(pts);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return cd;
    }
    // $ANTLR end "coordinate3"


    protected static class points_scope {
        ArrayList<Triple> ps;
    }
    protected Stack points_stack = new Stack();



    // $ANTLR start "points"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:90:1: points returns [ArrayList<Triple> pts] : 'point' '[' (t= triple ( ',' )? )+ ']' ;
    public final ArrayList<Triple> points() throws RecognitionException {
        points_stack.push(new points_scope());
        ArrayList<Triple> pts = null;


        Triple t =null;


         ((points_scope)points_stack.peek()).ps = new ArrayList<Triple>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:3: ( 'point' '[' (t= triple ( ',' )? )+ ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:3: 'point' '[' (t= triple ( ',' )? )+ ']'
            {
            match(input,23,FOLLOW_23_in_points490); 

            match(input,15,FOLLOW_15_in_points492); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:15: (t= triple ( ',' )? )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==REAL) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:16: t= triple ( ',' )?
            	    {
            	    pushFollow(FOLLOW_triple_in_points497);
            	    t=triple();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:25: ( ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==9) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:93:26: ','
            	            {
            	            match(input,9,FOLLOW_9_in_points500); 

            	            }
            	            break;

            	    }


            	     ((points_scope)points_stack.peek()).ps.add(t); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input,16,FOLLOW_16_in_points508); 


            	pts = ((points_scope)points_stack.peek()).ps;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            points_stack.pop();
        }
        return pts;
    }
    // $ANTLR end "points"



    // $ANTLR start "indexedFaceSet"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:101:1: indexedFaceSet returns [IndexedFaceSetData ifsd] : 'IndexedFaceSet' '{' ci= coordIndex '}' ;
    public final IndexedFaceSetData indexedFaceSet() throws RecognitionException {
        IndexedFaceSetData ifsd = null;


        IndexedFaceSetData ci =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:101:50: ( 'IndexedFaceSet' '{' ci= coordIndex '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:101:52: 'IndexedFaceSet' '{' ci= coordIndex '}'
            {
            match(input,11,FOLLOW_11_in_indexedFaceSet525); 

            match(input,30,FOLLOW_30_in_indexedFaceSet527); 

            pushFollow(FOLLOW_coordIndex_in_indexedFaceSet531);
            ci=coordIndex();

            state._fsp--;


            match(input,31,FOLLOW_31_in_indexedFaceSet533); 

             ifsd = ci; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ifsd;
    }
    // $ANTLR end "indexedFaceSet"


    protected static class coordIndex_scope {
        IndexedFaceSetData data;
    }
    protected Stack coordIndex_stack = new Stack();



    // $ANTLR start "coordIndex"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:102:1: coordIndex returns [IndexedFaceSetData ifsd] : 'coordIndex' '[' (i= integer ( ',' )? )+ ']' ;
    public final IndexedFaceSetData coordIndex() throws RecognitionException {
        coordIndex_stack.push(new coordIndex_scope());
        IndexedFaceSetData ifsd = null;


        int i =0;


        	((coordIndex_scope)coordIndex_stack.peek()).data = new IndexedFaceSetData(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:2: ( 'coordIndex' '[' (i= integer ( ',' )? )+ ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:4: 'coordIndex' '[' (i= integer ( ',' )? )+ ']'
            {
            match(input,18,FOLLOW_18_in_coordIndex559); 

            match(input,15,FOLLOW_15_in_coordIndex561); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:21: (i= integer ( ',' )? )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==REAL) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:23: i= integer ( ',' )?
            	    {
            	    pushFollow(FOLLOW_integer_in_coordIndex567);
            	    i=integer();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:33: ( ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==9) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:105:34: ','
            	            {
            	            match(input,9,FOLLOW_9_in_coordIndex570); 

            	            }
            	            break;

            	    }


            	     ((coordIndex_scope)coordIndex_stack.peek()).data.add(i); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input,16,FOLLOW_16_in_coordIndex579); 


            	ifsd = ((coordIndex_scope)coordIndex_stack.peek()).data;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            coordIndex_stack.pop();
        }
        return ifsd;
    }
    // $ANTLR end "coordIndex"



    // $ANTLR start "triple"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:112:1: triple returns [Triple t] : r1= real r2= real r3= real ;
    public final Triple triple() throws RecognitionException {
        Triple t = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:112:28: (r1= real r2= real r3= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:112:30: r1= real r2= real r3= real
            {
            pushFollow(FOLLOW_real_in_triple599);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple603);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple607);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:117:1: quadruple returns [Quadruple q] : r1= real r2= real r3= real r4= real ;
    public final Quadruple quadruple() throws RecognitionException {
        Quadruple q = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;

        double r4 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:117:33: (r1= real r2= real r3= real r4= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:117:35: r1= real r2= real r3= real r4= real
            {
            pushFollow(FOLLOW_real_in_quadruple624);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple628);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple632);
            r3=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple636);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:122:1: real returns [double d] : r= REAL ;
    public final double real() throws RecognitionException {
        double d = 0.0;


        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:122:26: (r= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:122:28: r= REAL
            {
            r=(Token)match(input,REAL,FOLLOW_REAL_in_real653); 

             
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:127:1: integer returns [int d] : i= REAL ;
    public final int integer() throws RecognitionException {
        int d = 0;


        Token i=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:127:26: (i= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventor.g:127:28: i= REAL
            {
            i=(Token)match(input,REAL,FOLLOW_REAL_in_integer670); 


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


 

    public static final BitSet FOLLOW_perspectiveCamera_in_openinventor44 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_separator_in_openinventor53 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12_in_perspectiveCamera78 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_perspectiveCamera80 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_position_in_perspectiveCamera86 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_orientation_in_perspectiveCamera92 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_nearDistance_in_perspectiveCamera98 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_farDistance_in_perspectiveCamera104 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_in_perspectiveCamera110 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_right_in_perspectiveCamera116 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_top_in_perspectiveCamera122 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_bottom_in_perspectiveCamera128 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_perspectiveCamera130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_position144 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_position148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_orientation163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_quadruple_in_orientation167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_nearDistance181 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_nearDistance185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_farDistance199 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_farDistance203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_left218 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_left222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_right236 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_right240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_top255 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_top259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_bottom273 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_bottom277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_separator307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_separator309 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_transform_in_separator314 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_coordinate3_in_separator324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_indexedFaceSet_in_separator330 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_separator332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_transform354 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_transform356 = new BitSet(new long[]{0x000000002C000000L});
    public static final BitSet FOLLOW_translation_in_transform361 = new BitSet(new long[]{0x00000000AC000000L});
    public static final BitSet FOLLOW_rotation_in_transform368 = new BitSet(new long[]{0x00000000AC000000L});
    public static final BitSet FOLLOW_scaleFactor_in_transform375 = new BitSet(new long[]{0x00000000AC000000L});
    public static final BitSet FOLLOW_31_in_transform379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_translation394 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_translation398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rotation413 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_quadruple_in_rotation417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_scaleFactor432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_scaleFactor436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_coordinate3455 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_coordinate3457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_points_in_coordinate3461 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_coordinate3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_points490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_points492 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_points497 = new BitSet(new long[]{0x0000000000010280L});
    public static final BitSet FOLLOW_9_in_points500 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_16_in_points508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_indexedFaceSet525 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_indexedFaceSet527 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_coordIndex_in_indexedFaceSet531 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_indexedFaceSet533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_coordIndex559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_coordIndex561 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_integer_in_coordIndex567 = new BitSet(new long[]{0x0000000000010280L});
    public static final BitSet FOLLOW_9_in_coordIndex570 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_16_in_coordIndex579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_triple599 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple603 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_quadruple624 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple628 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple632 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_integer670 = new BitSet(new long[]{0x0000000000000002L});

}