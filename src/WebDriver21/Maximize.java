package WebDriver21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.co.in/");
	Thread.sleep(4000);
	d.manage().window().maximize();
	d.close();
}
}
