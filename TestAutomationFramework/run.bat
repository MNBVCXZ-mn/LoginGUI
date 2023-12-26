set projectLocation=C:\Users\User\eclipse-workspace\TestAutomationFramework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java.org.testng.Testng %projectLocation%\testng.xml