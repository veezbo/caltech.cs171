CS171 Homework Assignments
=======================

Assignments for the Fall 2013 CS171 class at Caltech with Professor Al Barr.

**To see the bulk of the assignment work, look inside the ```src``` folder. Anything in that folder was written entirely by me (aside from homework0).**

**If you are taking the class currently, *honor code*.**

The below instructions are for compiling on Linux, and all the provided JOGL libraries are for Linux as well. If you want to compile on Windows, install the Windows JOGL libraries, and replace them in the classpath.


### Compiling the whole Project:

    javac -classpath /<path_to_folder>/caltech.cs171/bin:/<path_to_folder>/caltech.cs171/lib/antlr-3.4-complete.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0-javadoc.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0-sources.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen-rt-natives-linux-amd64.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen-rt.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-mobile.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-natives-linux-amd64.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-noawt.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-test.jar -d bin -sourcepath src src/*/*.java


### Running an Individual Homework

    java -classpath /<path_to_folder>/caltech.cs171/bin:/<path_to_folder>/caltech.cs171/lib/antlr-3.4-complete.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0-javadoc.jar:/<path_to_folder>/caltech.cs171/lib/commons-math3-3.0-bin/commons-math3-3.0/commons-math3-3.0-sources.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen-rt-natives-linux-amd64.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen-rt.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/gluegen-2.0-b594-20120929-linux-amd64/jar/gluegen.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-mobile.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-natives-linux-amd64.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all-noawt.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-all.jar:/<path_to_folder>/caltech.cs171/lib/JOGL\ Files/jogl-2.0-b819-20120929-linux-amd64/jar/jogl-test.jar homework7.HW7 < sample.script

Replace all instances of ```<path_to_folder>``` with the path to the folder where you put ```caltech.cs171```.

Yes, I know I should have made a Makefile (or even a script!).

----

#### Addendum

I'll eventually upload the ANTLR ```.g``` files once I can recover them from my old Windows partition.