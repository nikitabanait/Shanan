package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled 
{
@Test
public void TC1()
{
	Reporter.log("My first program is TestNG",true);
}
@Test(enabled=false)
public void TC2()
{
	Reporter.log("My second program is TestNG",true);
}
}
