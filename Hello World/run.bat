@ECHO OFF
echo hello this is running
pause
echo testing
pause
set CLASSPATH= "C:\Users\occhen\GitHub\robotics-asianinvasion-kenneth\Hello World"
nxjc Hello.java
pause
nxjlink -o Hello.nxj Hello
::	nxjupload -r Hello.nxj
echo good bye this ran all code lines
pause