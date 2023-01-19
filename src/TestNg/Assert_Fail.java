package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Fail 
{
	@Test
	public void TC1()
	{
		Reporter.log("Running TC1",true);//verification1
		Assert.fail();//intentinally tc1 is failed
		System.out.println("I am after failing TC1");//verification2
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);//verification1
	}

}
