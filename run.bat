set projectLocation=C:\Users\prash\eclipse-workspace\HRMS
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml