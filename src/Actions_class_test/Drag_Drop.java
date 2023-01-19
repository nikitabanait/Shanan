package Actions_class_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement ele1 = d.findElement(By.xpath("//div[@id='draggable']"));//xpath of ele1
	WebElement ele2 = d.findElement(By.xpath("//div[@id='droppable']"));//xpath of ele2
	Actions act = new Actions(d);//creat object of Actions class
	act.dragAndDrop(ele1, ele2).perform();
	}
}
