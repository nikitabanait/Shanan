package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_NotEquals 
{
	@Test
	public void m1()
	{
		Reporter.log("Running m1",true);
		String expT="Hi";
		String actT="Hello";
		Assert.assertNotEquals(expT, actT);
	}

}
