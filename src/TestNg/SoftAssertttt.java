package TestNg;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertttt
{
	@Test
	public void TC1()
	{
		String s1="Hi";
		String s2="Hello";
		SoftAssert s=new SoftAssert();
		s.assertEquals(s1,s2);
		System.out.println("Boss I am after failing the tc1");//we need to write mandatorilly
		s.assertAll();
	}

}
