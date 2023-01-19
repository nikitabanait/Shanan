package TestNg;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest
{
@Test
public void TC1()
{
	Reporter.log("HELLO",true);
}
@Test
public void TC2()
{
	Reporter.log("TC is fail",true);
	Assert.fail();
}
}
