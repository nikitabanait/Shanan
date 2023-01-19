package WebDriver21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First11 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.co.in/");
	String actT=d.getTitle();
    System.out.println(actT);
    String expT="Google Link";
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
