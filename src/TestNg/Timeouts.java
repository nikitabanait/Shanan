package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts 
{
@Test//1 main method
     //2 TC
public void TC1()
{
	Reporter.log("Its my first Testng program",true);
}
@Test(timeOut = 60000)
public void TC2()
{
	Reporter.log("Its my second Testng program",true);
	Assert.fail();
}
}
