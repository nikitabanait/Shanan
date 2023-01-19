package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation 
{
@Test(invocationCount=8)
public void TC1()
{
	Reporter.log("Running TC1",true);
}
}
