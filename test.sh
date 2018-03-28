#!/bin/bash


#Variables for setting the necessary path

PATH_TO_LIB=$PWD/lib
M2_HOME=/usr/local/Cellar/maven/3.3.9/libexec

EXCL_LST="$PWD/excl.lst"

# Choose either one of the instrumentations. 1) Just instruments every class except for JCLs. 2) Trying to instrument test method.

PATH_TO_INSTR=$PWD/instrApp/instr.jar
#PATH_TO_INSTR=$PWD/instrApp/instrOnlyTest.jar

#Debugging purpose

#echo $M2_HOME

# Checking the command for starting server
#echo /usr/bin/java -Xmx4g -Ddebug=true -Ddisl.logging.level=debug -Ddisl.disablebypass=false -Ddisl.noexcepthandler=true -Ddislserver.uninstrumented="./untmp" -Ddislserver.instrumented="./tmp" -Ddisl.exclusionList=/Users/omarjaved/workspace/autobenchj/excl.lst -cp $PATH_TO_INSTR:$PATH_TO_LIB/disl-server.jar ch.usi.dag.dislserver.DiSLServer > disllog.txt 2>&1 &  


/usr/bin/java -Xmx4g -Ddebug=true -Ddisl.logging.level=debug -Ddisl.disablebypass=false -Ddisl.noexcepthandler=true -Ddislserver.uninstrumented="./untmp" -Ddislserver.instrumented="./tmp" -Ddisl.exclusionList=$EXCL_LST -cp $PATH_TO_INSTR:$PATH_TO_LIB/disl-server.jar ch.usi.dag.dislserver.DiSLServer > disllog.txt 2>&1 &  

sleep 1

#Checking the command for running the instr client.
#echo /usr/bin/java -Xmx4g -noverify -agentpath:$PATH_TO_LIB/libdislagent.jnilib -Xbootclasspath/a:$PATH_TO_LIB/disl-bypass.jar:$PATH_TO_INSTR -classpath $M2_HOME/boot/plexus-classworlds-2.5.2.jar -Dcl    assworlds.conf=$M2_HOME/bin/m2.conf -Dmaven.home=$M2_HOME -Dmaven.multiModuleProjectDirectory=$PWD/MavenTest/ org.codehaus.plexus.classworlds.launcher.Launcher test

/usr/bin/java -Xmx4g -noverify -agentpath:$PATH_TO_LIB/libdislagent.jnilib -Xbootclasspath/a:$PATH_TO_LIB/disl-bypass.jar:$PATH_TO_INSTR -classpath $M2_HOME/boot/plexus-classworlds-2.5.2.jar -Dclassworlds.conf=$M2_HOME/bin/m2.conf -Dmaven.home=$M2_HOME -Dmaven.multiModuleProjectDirectory=$PWD/MavenTest/ org.codehaus.plexus.classworlds.launcher.Launcher test -DforkMode=never 
