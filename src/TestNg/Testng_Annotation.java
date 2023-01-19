package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_Annotation
{
@BeforeClass
public void openBrowser()
{
	Reporter.log("Open Browser",true);
}
@BeforeMethod
public void LogintoApp()
{
	Reporter.log("Login to App",true);
}
@Test
public void verifyText()
{
	Reporter.log("Running actual test case",true);
}
@AfterMethod
public void logoutApp()
{
	Reporter.log("Logout from App",true);
}
@AfterClass
public void CloseBrowser()
{
	Reporter.log("Class browser",true);
}
}
