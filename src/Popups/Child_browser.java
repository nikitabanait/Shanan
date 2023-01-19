package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser 
{
//private static final String new ArrayList = null;

public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.flipkart.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//button[text()='✕']")).click();//click on cancel button
	d.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles under 20000",Keys.ENTER);//search any mobile
	Thread.sleep(5000);
	d.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();//click on 1st phone
	Thread.sleep(5000);
	Set<String>allwindows=d.getWindowHandles();//switch the control
	ArrayList<String> al = new ArrayList<String>(allwindows);//create object of arraylist
	String mainid = al.get(0);//print main window id
	System.out.println(mainid);
	d.switchTo().window(al.get(1));//switch to child window
	String cwind = al.get(1);//print session id
	System.out.println(cwind);
	Thread.sleep(5000);
	String title = d.getTitle();
	System.out.println(title);
	
}
}
