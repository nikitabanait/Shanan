package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@name='username']")WebElement un;
@FindBy(xpath="//input[@name='pwd']")WebElement pwd;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
public LoginPage(WebDriver driver)//use constructor
{
	PageFactory.initElements(driver,this);
}
public void enterUn() {
	un.sendKeys("admin");//getters and setters
}
public void enterPWD() {
	pwd.sendKeys("manager");
}
public void clickLoginBtn() {
	loginBtn.click();
}
}
