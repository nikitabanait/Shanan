package WebDriver21;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver s=new ChromeDriver();
	s.get("https://www.facebook.com/");
	
	Dimension n= new Dimension(200, 100);
	
	s.manage().window().setSize(n);
	Thread.sleep(5000);
	Point p=new Point(200, 300);
	s.manage().window().setPosition(p);
	
}
}
