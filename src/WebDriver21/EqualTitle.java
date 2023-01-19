package WebDriver21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualTitle
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.com/");
	String expT="Amazon.com. Spend less. Smile more.";
	Thread.sleep(4000);
	String actT=driver.getTitle();
	System.out.println(actT);
	if(expT.equals(actT))
	{
		System.out.println("TC is pass");
		
	}
	else
	{
		System.out.println("TC is fail");
	}
}

}
