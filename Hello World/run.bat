@ECHO OFF
set CLASSPATH=.
set CLASSPATH= "C:\Users\occhen\GitHub\robotics-asianinvasion-kenneth\Hello World\Hello.java"
nxjc Hello.java
nxjlink -o Hello.nxj Hello
nxjupload -r Hello.nxj
pause