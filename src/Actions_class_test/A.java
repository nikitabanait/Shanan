package Actions_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement target = d.findElement(By.xpath("//a[text()='Gmail']"));//choose the target element
		Actions act=new Actions(d);//creat object of actions class
		act.moveToElement(target).perform();//use movetoelement method
		act.contextClick(target).perform();//right click on target element
		act.click(target).perform();//leftclick(click)
		act.moveToElement(target).doubleClick().perform();		
	}

}
