package WebDriver21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://demo.actitime.com/login.do");
	d.findElement(By.id("username")).sendKeys("admin");//enter username
	d.findElement(By.name("pwd")).sendKeys("manager");//enter password
	d.findElement(By.xpath("//div[text()='Login ']")).click();//click on login button
	String expT="actiTIME";//expected title
	String actT=d.getTitle();
	if(expT.equals(actT))
	{
	System.out.println("TC is pass");
	
	}
	else {
		System.out.println("TC is fail");
	}
}
}
