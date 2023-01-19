package WebDriver21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver n=new ChromeDriver();
	n.get("https://www.google.co.in/");
	String link=n.getCurrentUrl();
	System.out.println(link);
}
}
