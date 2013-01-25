// $ANTLR 3.4 C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g 2012-11-29 00:17:15


package homework4;
	
import java.lang.*;
import java.util.*;
import org.antlr.runtime.BitSet;
import homework2.Coordinate3Data;
import homework2.PerspectiveCameraData;
import homework2.Quadruple;
import homework2.TransformData;
import homework2.Triple;
import homework3.IndexedFaceSetData;
import homework3.MaterialData;
import homework3.NormalData;
import homework3.OpenInventorData;
import homework3.PointLightData;
import homework3.SeparatorData;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OpenInventorNewParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "HASH", "INT", "REAL", "WHITESPACE", "','", "'Coordinate3'", "'IndexedFaceSet'", "'Material'", "'Normal'", "'PerspectiveCamera'", "'PointLight'", "'Separator'", "'Transform'", "'['", "']'", "'ambientColor'", "'bottom'", "'color'", "'coordIndex'", "'diffuseColor'", "'farDistance'", "'left'", "'location'", "'nearDistance'", "'normalIndex'", "'orientation'", "'point'", "'position'", "'right'", "'rotation'", "'scaleFactor'", "'shininess'", "'specularColor'", "'top'", "'translation'", "'vector'", "'{'", "'}'"
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
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
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


    public OpenInventorNewParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OpenInventorNewParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return OpenInventorNewParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g"; }


    protected static class openinventor_scope {
        ArrayList<SeparatorData> sds;
        ArrayList<PointLightData> plds;
    }
    protected Stack openinventor_stack = new Stack();



    // $ANTLR start "openinventor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:25:1: openinventor returns [OpenInventorData result] : cameraData= perspectiveCamera (pointData= pointLight )+ (sepData= separator )+ ;
    public final OpenInventorData openinventor() throws RecognitionException {
        openinventor_stack.push(new openinventor_scope());
        OpenInventorData result = null;


        PerspectiveCameraData cameraData =null;

        PointLightData pointData =null;

        SeparatorData sepData =null;


        	((openinventor_scope)openinventor_stack.peek()).sds = new ArrayList<SeparatorData>();
        	((openinventor_scope)openinventor_stack.peek()).plds = new ArrayList<PointLightData>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:30:2: (cameraData= perspectiveCamera (pointData= pointLight )+ (sepData= separator )+ )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:30:4: cameraData= perspectiveCamera (pointData= pointLight )+ (sepData= separator )+
            {
            pushFollow(FOLLOW_perspectiveCamera_in_openinventor44);
            cameraData=perspectiveCamera();

            state._fsp--;


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:31:4: (pointData= pointLight )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:31:6: pointData= pointLight
            	    {
            	    pushFollow(FOLLOW_pointLight_in_openinventor55);
            	    pointData=pointLight();

            	    state._fsp--;


            	     ((openinventor_scope)openinventor_stack.peek()).plds.add(pointData); 

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


            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:32:4: (sepData= separator )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:32:6: sepData= separator
            	    {
            	    pushFollow(FOLLOW_separator_in_openinventor69);
            	    sepData=separator();

            	    state._fsp--;


            	     ((openinventor_scope)openinventor_stack.peek()).sds.add(sepData); 

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



             	result = new OpenInventorData(cameraData, ((openinventor_scope)openinventor_stack.peek()).sds, ((openinventor_scope)openinventor_stack.peek()).plds);


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:41:1: perspectiveCamera returns [PerspectiveCameraData pcd] : 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}' ;
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
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:42:2: ( 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:42:4: 'PerspectiveCamera' '{' pos= position orient= orientation n= nearDistance f= farDistance l= left r= right t= top b= bottom '}'
            {
            match(input,14,FOLLOW_14_in_perspectiveCamera94); 

            match(input,41,FOLLOW_41_in_perspectiveCamera96); 

            pushFollow(FOLLOW_position_in_perspectiveCamera102);
            pos=position();

            state._fsp--;


            pushFollow(FOLLOW_orientation_in_perspectiveCamera108);
            orient=orientation();

            state._fsp--;


            pushFollow(FOLLOW_nearDistance_in_perspectiveCamera114);
            n=nearDistance();

            state._fsp--;


            pushFollow(FOLLOW_farDistance_in_perspectiveCamera120);
            f=farDistance();

            state._fsp--;


            pushFollow(FOLLOW_left_in_perspectiveCamera126);
            l=left();

            state._fsp--;


            pushFollow(FOLLOW_right_in_perspectiveCamera132);
            r=right();

            state._fsp--;


            pushFollow(FOLLOW_top_in_perspectiveCamera138);
            t=top();

            state._fsp--;


            pushFollow(FOLLOW_bottom_in_perspectiveCamera144);
            b=bottom();

            state._fsp--;


            match(input,42,FOLLOW_42_in_perspectiveCamera146); 


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:46:1: position returns [Triple t] : 'position' trip= triple ;
    public final Triple position() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:46:30: ( 'position' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:46:32: 'position' trip= triple
            {
            match(input,32,FOLLOW_32_in_position160); 

            pushFollow(FOLLOW_triple_in_position164);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:47:1: orientation returns [Quadruple q] : 'orientation' quad= quadruple ;
    public final Quadruple orientation() throws RecognitionException {
        Quadruple q = null;


        Quadruple quad =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:47:36: ( 'orientation' quad= quadruple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:47:38: 'orientation' quad= quadruple
            {
            match(input,30,FOLLOW_30_in_orientation179); 

            pushFollow(FOLLOW_quadruple_in_orientation183);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:48:1: nearDistance returns [double d] : 'nearDistance' r= real ;
    public final double nearDistance() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:48:34: ( 'nearDistance' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:48:36: 'nearDistance' r= real
            {
            match(input,28,FOLLOW_28_in_nearDistance197); 

            pushFollow(FOLLOW_real_in_nearDistance201);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:49:1: farDistance returns [double d] : 'farDistance' r= real ;
    public final double farDistance() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:49:33: ( 'farDistance' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:49:35: 'farDistance' r= real
            {
            match(input,25,FOLLOW_25_in_farDistance215); 

            pushFollow(FOLLOW_real_in_farDistance219);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:50:1: left returns [double d] : 'left' r= real ;
    public final double left() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:50:27: ( 'left' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:50:29: 'left' r= real
            {
            match(input,26,FOLLOW_26_in_left234); 

            pushFollow(FOLLOW_real_in_left238);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:51:1: right returns [double d] : 'right' r= real ;
    public final double right() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:51:27: ( 'right' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:51:29: 'right' r= real
            {
            match(input,33,FOLLOW_33_in_right252); 

            pushFollow(FOLLOW_real_in_right256);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:52:1: top returns [double d] : 'top' r= real ;
    public final double top() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:52:26: ( 'top' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:52:28: 'top' r= real
            {
            match(input,38,FOLLOW_38_in_top271); 

            pushFollow(FOLLOW_real_in_top275);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:53:1: bottom returns [double d] : 'bottom' r= real ;
    public final double bottom() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:53:28: ( 'bottom' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:53:30: 'bottom' r= real
            {
            match(input,21,FOLLOW_21_in_bottom289); 

            pushFollow(FOLLOW_real_in_bottom293);
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



    // $ANTLR start "pointLight"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:61:1: pointLight returns [PointLightData pd] : 'PointLight' '{' l= location c= color '}' ;
    public final PointLightData pointLight() throws RecognitionException {
        PointLightData pd = null;


        Triple l =null;

        Triple c =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:62:2: ( 'PointLight' '{' l= location c= color '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:62:4: 'PointLight' '{' l= location c= color '}'
            {
            match(input,15,FOLLOW_15_in_pointLight315); 

            match(input,41,FOLLOW_41_in_pointLight317); 

            pushFollow(FOLLOW_location_in_pointLight321);
            l=location();

            state._fsp--;


            pushFollow(FOLLOW_color_in_pointLight325);
            c=color();

            state._fsp--;


            match(input,42,FOLLOW_42_in_pointLight327); 

             pd = new PointLightData(l, c); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return pd;
    }
    // $ANTLR end "pointLight"



    // $ANTLR start "location"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:64:1: location returns [Triple t] : 'location' trip= triple ;
    public final Triple location() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:64:29: ( 'location' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:64:31: 'location' trip= triple
            {
            match(input,27,FOLLOW_27_in_location342); 

            pushFollow(FOLLOW_triple_in_location346);
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
    // $ANTLR end "location"



    // $ANTLR start "color"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:65:1: color returns [Triple t] : 'color' trip= triple ;
    public final Triple color() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:65:28: ( 'color' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:65:30: 'color' trip= triple
            {
            match(input,22,FOLLOW_22_in_color361); 

            pushFollow(FOLLOW_triple_in_color367);
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
    // $ANTLR end "color"


    protected static class separator_scope {
        ArrayList<TransformData> tds;
    }
    protected Stack separator_stack = new Stack();



    // $ANTLR start "separator"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:73:1: separator returns [SeparatorData sd] : 'Separator' '{' (t= transform )+ m= material c= coordinate3 n= normal i= indexedFaceSet '}' ;
    public final SeparatorData separator() throws RecognitionException {
        separator_stack.push(new separator_scope());
        SeparatorData sd = null;


        TransformData t =null;

        MaterialData m =null;

        Coordinate3Data c =null;

        NormalData n =null;

        IndexedFaceSetData i =null;


        	((separator_scope)separator_stack.peek()).tds = new ArrayList<TransformData>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:76:3: ( 'Separator' '{' (t= transform )+ m= material c= coordinate3 n= normal i= indexedFaceSet '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:76:3: 'Separator' '{' (t= transform )+ m= material c= coordinate3 n= normal i= indexedFaceSet '}'
            {
            match(input,16,FOLLOW_16_in_separator397); 

            match(input,41,FOLLOW_41_in_separator399); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:76:19: (t= transform )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:76:20: t= transform
            	    {
            	    pushFollow(FOLLOW_transform_in_separator404);
            	    t=transform();

            	    state._fsp--;


            	    ((separator_scope)separator_stack.peek()).tds.add(t); 

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


            pushFollow(FOLLOW_material_in_separator414);
            m=material();

            state._fsp--;


            pushFollow(FOLLOW_coordinate3_in_separator419);
            c=coordinate3();

            state._fsp--;


            pushFollow(FOLLOW_normal_in_separator425);
            n=normal();

            state._fsp--;


            pushFollow(FOLLOW_indexedFaceSet_in_separator430);
            i=indexedFaceSet();

            state._fsp--;


            match(input,42,FOLLOW_42_in_separator434); 


            	sd = new SeparatorData(((separator_scope)separator_stack.peek()).tds, c, i, m, n);


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:1: transform returns [TransformData td] : 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}' ;
    public final TransformData transform() throws RecognitionException {
        TransformData td = null;


        Triple t =null;

        Quadruple r =null;

        Triple s =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:38: ( 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:41: 'Transform' '{' (t= translation |r= rotation |s= scaleFactor )+ '}'
            {
            match(input,17,FOLLOW_17_in_transform452); 

            match(input,41,FOLLOW_41_in_transform454); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:57: (t= translation |r= rotation |s= scaleFactor )+
            int cnt4=0;
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt4=1;
                    }
                    break;
                case 34:
                    {
                    alt4=2;
                    }
                    break;
                case 35:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:58: t= translation
            	    {
            	    pushFollow(FOLLOW_translation_in_transform459);
            	    t=translation();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:75: r= rotation
            	    {
            	    pushFollow(FOLLOW_rotation_in_transform466);
            	    r=rotation();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:89:89: s= scaleFactor
            	    {
            	    pushFollow(FOLLOW_scaleFactor_in_transform473);
            	    s=scaleFactor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match(input,42,FOLLOW_42_in_transform477); 


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:94:1: translation returns [Triple t] : 'translation' trip= triple ;
    public final Triple translation() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:94:33: ( 'translation' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:94:35: 'translation' trip= triple
            {
            match(input,39,FOLLOW_39_in_translation492); 

            pushFollow(FOLLOW_triple_in_translation496);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:95:1: rotation returns [Quadruple q] : 'rotation' quad= quadruple ;
    public final Quadruple rotation() throws RecognitionException {
        Quadruple q = null;


        Quadruple quad =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:95:33: ( 'rotation' quad= quadruple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:95:36: 'rotation' quad= quadruple
            {
            match(input,34,FOLLOW_34_in_rotation511); 

            pushFollow(FOLLOW_quadruple_in_rotation515);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:96:1: scaleFactor returns [Triple t] : 'scaleFactor' trip= triple ;
    public final Triple scaleFactor() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:96:33: ( 'scaleFactor' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:96:36: 'scaleFactor' trip= triple
            {
            match(input,35,FOLLOW_35_in_scaleFactor530); 

            pushFollow(FOLLOW_triple_in_scaleFactor534);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:100:1: coordinate3 returns [Coordinate3Data cd] : 'Coordinate3' '{' pts= points '}' ;
    public final Coordinate3Data coordinate3() throws RecognitionException {
        Coordinate3Data cd = null;


        ArrayList<Triple> pts =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:100:44: ( 'Coordinate3' '{' pts= points '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:100:46: 'Coordinate3' '{' pts= points '}'
            {
            match(input,10,FOLLOW_10_in_coordinate3552); 

            match(input,41,FOLLOW_41_in_coordinate3554); 

            pushFollow(FOLLOW_points_in_coordinate3558);
            pts=points();

            state._fsp--;


            match(input,42,FOLLOW_42_in_coordinate3560); 


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:104:1: points returns [ArrayList<Triple> pts] : 'point' '[' (t= triple ( ',' )? )+ ']' ;
    public final ArrayList<Triple> points() throws RecognitionException {
        points_stack.push(new points_scope());
        ArrayList<Triple> pts = null;


        Triple t =null;


         ((points_scope)points_stack.peek()).ps = new ArrayList<Triple>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:3: ( 'point' '[' (t= triple ( ',' )? )+ ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:3: 'point' '[' (t= triple ( ',' )? )+ ']'
            {
            match(input,31,FOLLOW_31_in_points587); 

            match(input,18,FOLLOW_18_in_points589); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:15: (t= triple ( ',' )? )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==REAL) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:16: t= triple ( ',' )?
            	    {
            	    pushFollow(FOLLOW_triple_in_points594);
            	    t=triple();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:25: ( ',' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==9) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:107:26: ','
            	            {
            	            match(input,9,FOLLOW_9_in_points597); 

            	            }
            	            break;

            	    }


            	     ((points_scope)points_stack.peek()).ps.add(t); 

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


            match(input,19,FOLLOW_19_in_points605); 


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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:114:1: indexedFaceSet returns [IndexedFaceSetData ifsd] : 'IndexedFaceSet' '{' ci= coordIndex ni= normalIndex '}' ;
    public final IndexedFaceSetData indexedFaceSet() throws RecognitionException {
        IndexedFaceSetData ifsd = null;


        IndexedFaceSetData ci =null;

        ArrayList<Integer> ni =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:115:2: ( 'IndexedFaceSet' '{' ci= coordIndex ni= normalIndex '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:115:4: 'IndexedFaceSet' '{' ci= coordIndex ni= normalIndex '}'
            {
            match(input,11,FOLLOW_11_in_indexedFaceSet623); 

            match(input,41,FOLLOW_41_in_indexedFaceSet625); 

            pushFollow(FOLLOW_coordIndex_in_indexedFaceSet629);
            ci=coordIndex();

            state._fsp--;


             ifsd = ci; 

            pushFollow(FOLLOW_normalIndex_in_indexedFaceSet635);
            ni=normalIndex();

            state._fsp--;


             ifsd.addNormalIndices(ni); 

            match(input,42,FOLLOW_42_in_indexedFaceSet639); 

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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:117:1: coordIndex returns [IndexedFaceSetData ifsd] : 'coordIndex' '[' (i= integer ( ',' )? )+ ']' ;
    public final IndexedFaceSetData coordIndex() throws RecognitionException {
        coordIndex_stack.push(new coordIndex_scope());
        IndexedFaceSetData ifsd = null;


        int i =0;


        	((coordIndex_scope)coordIndex_stack.peek()).data = new IndexedFaceSetData(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:2: ( 'coordIndex' '[' (i= integer ( ',' )? )+ ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:4: 'coordIndex' '[' (i= integer ( ',' )? )+ ']'
            {
            match(input,23,FOLLOW_23_in_coordIndex666); 

            match(input,18,FOLLOW_18_in_coordIndex668); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:21: (i= integer ( ',' )? )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==REAL) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:23: i= integer ( ',' )?
            	    {
            	    pushFollow(FOLLOW_integer_in_coordIndex674);
            	    i=integer();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:33: ( ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==9) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:120:34: ','
            	            {
            	            match(input,9,FOLLOW_9_in_coordIndex677); 

            	            }
            	            break;

            	    }


            	     ((coordIndex_scope)coordIndex_stack.peek()).data.add(i); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input,19,FOLLOW_19_in_coordIndex686); 


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


    protected static class normalIndex_scope {
        ArrayList<Integer> data;
    }
    protected Stack normalIndex_stack = new Stack();



    // $ANTLR start "normalIndex"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:124:1: normalIndex returns [ArrayList<Integer> nindices] : 'normalIndex' '[' (i= integer ( ',' )? )+ ']' ;
    public final ArrayList<Integer> normalIndex() throws RecognitionException {
        normalIndex_stack.push(new normalIndex_scope());
        ArrayList<Integer> nindices = null;


        int i =0;


        ((normalIndex_scope)normalIndex_stack.peek()).data = new ArrayList<Integer>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:2: ( 'normalIndex' '[' (i= integer ( ',' )? )+ ']' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:4: 'normalIndex' '[' (i= integer ( ',' )? )+ ']'
            {
            match(input,29,FOLLOW_29_in_normalIndex710); 

            match(input,18,FOLLOW_18_in_normalIndex712); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:22: (i= integer ( ',' )? )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==REAL) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:24: i= integer ( ',' )?
            	    {
            	    pushFollow(FOLLOW_integer_in_normalIndex718);
            	    i=integer();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:34: ( ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==9) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:127:35: ','
            	            {
            	            match(input,9,FOLLOW_9_in_normalIndex721); 

            	            }
            	            break;

            	    }


            	    ((normalIndex_scope)normalIndex_stack.peek()).data.add(i);

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            match(input,19,FOLLOW_19_in_normalIndex730); 


            	nindices = ((normalIndex_scope)normalIndex_stack.peek()).data;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            normalIndex_stack.pop();
        }
        return nindices;
    }
    // $ANTLR end "normalIndex"



    // $ANTLR start "material"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:133:1: material returns [MaterialData md] : 'Material' '{' ac= ambientColor dc= diffuseColor sc= specularColor sh= shininess '}' ;
    public final MaterialData material() throws RecognitionException {
        MaterialData md = null;


        Triple ac =null;

        Triple dc =null;

        Triple sc =null;

        double sh =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:133:36: ( 'Material' '{' ac= ambientColor dc= diffuseColor sc= specularColor sh= shininess '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:133:38: 'Material' '{' ac= ambientColor dc= diffuseColor sc= specularColor sh= shininess '}'
            {
            match(input,12,FOLLOW_12_in_material745); 

            match(input,41,FOLLOW_41_in_material747); 

            pushFollow(FOLLOW_ambientColor_in_material751);
            ac=ambientColor();

            state._fsp--;


            pushFollow(FOLLOW_diffuseColor_in_material755);
            dc=diffuseColor();

            state._fsp--;


            pushFollow(FOLLOW_specularColor_in_material759);
            sc=specularColor();

            state._fsp--;


            pushFollow(FOLLOW_shininess_in_material763);
            sh=shininess();

            state._fsp--;


            match(input,42,FOLLOW_42_in_material765); 

             md = new MaterialData(ac, dc, sc, sh); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return md;
    }
    // $ANTLR end "material"



    // $ANTLR start "ambientColor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:136:1: ambientColor returns [Triple t] : 'ambientColor' trip= triple ;
    public final Triple ambientColor() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:136:34: ( 'ambientColor' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:136:36: 'ambientColor' trip= triple
            {
            match(input,20,FOLLOW_20_in_ambientColor780); 

            pushFollow(FOLLOW_triple_in_ambientColor784);
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
    // $ANTLR end "ambientColor"



    // $ANTLR start "diffuseColor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:137:1: diffuseColor returns [Triple t] : 'diffuseColor' trip= triple ;
    public final Triple diffuseColor() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:137:34: ( 'diffuseColor' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:137:36: 'diffuseColor' trip= triple
            {
            match(input,24,FOLLOW_24_in_diffuseColor798); 

            pushFollow(FOLLOW_triple_in_diffuseColor802);
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
    // $ANTLR end "diffuseColor"



    // $ANTLR start "specularColor"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:138:1: specularColor returns [Triple t] : 'specularColor' trip= triple ;
    public final Triple specularColor() throws RecognitionException {
        Triple t = null;


        Triple trip =null;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:138:34: ( 'specularColor' trip= triple )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:138:36: 'specularColor' trip= triple
            {
            match(input,37,FOLLOW_37_in_specularColor815); 

            pushFollow(FOLLOW_triple_in_specularColor819);
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
    // $ANTLR end "specularColor"



    // $ANTLR start "shininess"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:139:1: shininess returns [double d] : 'shininess' r= real ;
    public final double shininess() throws RecognitionException {
        double d = 0.0;


        double r =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:139:31: ( 'shininess' r= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:139:33: 'shininess' r= real
            {
            match(input,36,FOLLOW_36_in_shininess833); 

            pushFollow(FOLLOW_real_in_shininess837);
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
    // $ANTLR end "shininess"


    protected static class normal_scope {
        ArrayList<Triple> vectors;
    }
    protected Stack normal_stack = new Stack();



    // $ANTLR start "normal"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:143:1: normal returns [NormalData nd] : 'Normal' '{' 'vector' '[' (t= triple ( ',' )? )+ ']' '}' ;
    public final NormalData normal() throws RecognitionException {
        normal_stack.push(new normal_scope());
        NormalData nd = null;


        Triple t =null;


         ((normal_scope)normal_stack.peek()).vectors = new ArrayList<Triple>(); 
        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:5: ( 'Normal' '{' 'vector' '[' (t= triple ( ',' )? )+ ']' '}' )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:8: 'Normal' '{' 'vector' '[' (t= triple ( ',' )? )+ ']' '}'
            {
            match(input,13,FOLLOW_13_in_normal867); 

            match(input,41,FOLLOW_41_in_normal869); 

            match(input,40,FOLLOW_40_in_normal871); 

            match(input,18,FOLLOW_18_in_normal873); 

            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:34: (t= triple ( ',' )? )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==REAL) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:36: t= triple ( ',' )?
            	    {
            	    pushFollow(FOLLOW_triple_in_normal879);
            	    t=triple();

            	    state._fsp--;


            	    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:45: ( ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==9) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:146:45: ','
            	            {
            	            match(input,9,FOLLOW_9_in_normal881); 

            	            }
            	            break;

            	    }


            	     ((normal_scope)normal_stack.peek()).vectors.add(t); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            match(input,19,FOLLOW_19_in_normal889); 

            match(input,42,FOLLOW_42_in_normal892); 


            	nd = new NormalData (((normal_scope)normal_stack.peek()).vectors);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            normal_stack.pop();
        }
        return nd;
    }
    // $ANTLR end "normal"



    // $ANTLR start "triple"
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:154:1: triple returns [Triple t] : r1= real r2= real r3= real ;
    public final Triple triple() throws RecognitionException {
        Triple t = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:154:28: (r1= real r2= real r3= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:154:30: r1= real r2= real r3= real
            {
            pushFollow(FOLLOW_real_in_triple916);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple920);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_triple924);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:159:1: quadruple returns [Quadruple q] : r1= real r2= real r3= real r4= real ;
    public final Quadruple quadruple() throws RecognitionException {
        Quadruple q = null;


        double r1 =0.0;

        double r2 =0.0;

        double r3 =0.0;

        double r4 =0.0;


        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:159:33: (r1= real r2= real r3= real r4= real )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:159:35: r1= real r2= real r3= real r4= real
            {
            pushFollow(FOLLOW_real_in_quadruple941);
            r1=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple945);
            r2=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple949);
            r3=real();

            state._fsp--;


            pushFollow(FOLLOW_real_in_quadruple953);
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:164:1: real returns [double d] : r= REAL ;
    public final double real() throws RecognitionException {
        double d = 0.0;


        Token r=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:164:26: (r= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:164:28: r= REAL
            {
            r=(Token)match(input,REAL,FOLLOW_REAL_in_real970); 

             
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
    // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:169:1: integer returns [int d] : i= REAL ;
    public final int integer() throws RecognitionException {
        int d = 0;


        Token i=null;

        try {
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:169:26: (i= REAL )
            // C:\\Users\\theonly\\Desktop\\Programming\\ANTLR Lexer and Parser Code\\OpenInventorNew.g:169:28: i= REAL
            {
            i=(Token)match(input,REAL,FOLLOW_REAL_in_integer987); 


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


 

    public static final BitSet FOLLOW_perspectiveCamera_in_openinventor44 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_pointLight_in_openinventor55 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_separator_in_openinventor69 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14_in_perspectiveCamera94 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_perspectiveCamera96 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_position_in_perspectiveCamera102 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_orientation_in_perspectiveCamera108 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_nearDistance_in_perspectiveCamera114 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_farDistance_in_perspectiveCamera120 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_left_in_perspectiveCamera126 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_right_in_perspectiveCamera132 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_top_in_perspectiveCamera138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_bottom_in_perspectiveCamera144 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_perspectiveCamera146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_position160 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_position164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_orientation179 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_quadruple_in_orientation183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_nearDistance197 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_nearDistance201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_farDistance215 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_farDistance219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_left234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_left238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_right252 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_right256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_top271 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_top275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_bottom289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_bottom293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_pointLight315 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_pointLight317 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_location_in_pointLight321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_color_in_pointLight325 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_pointLight327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_location342 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_location346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_color361 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_color367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_separator397 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_separator399 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_transform_in_separator404 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_material_in_separator414 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_coordinate3_in_separator419 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_normal_in_separator425 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_indexedFaceSet_in_separator430 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_separator434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_transform452 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_transform454 = new BitSet(new long[]{0x0000008C00000000L});
    public static final BitSet FOLLOW_translation_in_transform459 = new BitSet(new long[]{0x0000048C00000000L});
    public static final BitSet FOLLOW_rotation_in_transform466 = new BitSet(new long[]{0x0000048C00000000L});
    public static final BitSet FOLLOW_scaleFactor_in_transform473 = new BitSet(new long[]{0x0000048C00000000L});
    public static final BitSet FOLLOW_42_in_transform477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_translation492 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_translation496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rotation511 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_quadruple_in_rotation515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_scaleFactor530 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_scaleFactor534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_coordinate3552 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_coordinate3554 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_points_in_coordinate3558 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_coordinate3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_points587 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_points589 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_points594 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_9_in_points597 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_19_in_points605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_indexedFaceSet623 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_indexedFaceSet625 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_coordIndex_in_indexedFaceSet629 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_normalIndex_in_indexedFaceSet635 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_indexedFaceSet639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_coordIndex666 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_coordIndex668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_integer_in_coordIndex674 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_9_in_coordIndex677 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_19_in_coordIndex686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_normalIndex710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_normalIndex712 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_integer_in_normalIndex718 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_9_in_normalIndex721 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_19_in_normalIndex730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_material745 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_material747 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ambientColor_in_material751 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_diffuseColor_in_material755 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_specularColor_in_material759 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_shininess_in_material763 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_material765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ambientColor780 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_ambientColor784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_diffuseColor798 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_diffuseColor802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_specularColor815 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_specularColor819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_shininess833 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_shininess837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_normal867 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_normal869 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_normal871 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_normal873 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_triple_in_normal879 = new BitSet(new long[]{0x0000000000080280L});
    public static final BitSet FOLLOW_9_in_normal881 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_19_in_normal889 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_normal892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_triple916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple920 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_triple924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_quadruple941 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple945 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple949 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_real_in_quadruple953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_integer987 = new BitSet(new long[]{0x0000000000000002L});

}