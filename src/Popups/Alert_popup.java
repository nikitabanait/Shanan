package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/delete_customer.php");
	d.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");//enter customer id
	d.findElement(By.xpath("//input[@name='submit']")).click();//click on submit button
	Alert alt = d.switchTo().alert();//first of all we need to switch the control of selenium from webpage to popup
	String text=alt.getText();//alt.accept();//alt.dismiss();
	System.out.println(text);
}
}
