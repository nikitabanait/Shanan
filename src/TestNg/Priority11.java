package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority11 
{
@Test(priority=2)
public void Eshwar()
{
	Reporter.log("Running Eshwar",true);
}
@Test(priority=3)
public void Dhanush()
{
	Reporter.log("Running Dhanush",true);
}
@Test(priority=1)
public void Prabhas()
{
	Reporter.log("Running Prabhas",true);
}
@Test(priority=4)
public void Alluarjun()
{
	Reporter.log("Running Alluarjun",true);
}
}
