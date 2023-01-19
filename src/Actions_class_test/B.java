package Actions_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));//choose the target element
	Actions act = new Actions(driver);//create object of actions class
	act.moveToElement(target).contextClick().doubleClick().perform();
}
}
