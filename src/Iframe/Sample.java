package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait(global wait)
 d.manage().window().maximize();//maximize the browser
 d.switchTo().frame("packageListFrame");//bydefault set focus is on main webpage so we need to switch it
	                                    //switch to 1st iframe
 String t1=d.findElement(By.xpath("//h2[text()='Packages']")).getText();//for our confirmation take any element on 1st
	                                                                      //frame and print it
 System.out.println(t1);//packages
 d.switchTo().defaultContent();//switch from main webpage to 2nd frame
 d.switchTo().frame("packageFrame");//now jump from main webpage to 2nd frame
 String t2=d.findElement(By.xpath("//a[text()='FindAll']")).getText();//take any element and print it
 System.out.println(t2);//findall
 d.switchTo().defaultContent();//again control goes to main webpage
 d.switchTo().frame("classFrame");//now we need to switch control towards 3rd frame
 String t3=d.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
 System.out.println(t3);
 
 
 
}
}
