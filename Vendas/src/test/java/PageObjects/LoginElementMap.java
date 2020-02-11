package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginElementMap {
	
	WebDriver driver;
	
	public LoginElementMap(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 50), this);
    }
	
//TELA DE LOGIN
	@FindBy(id = "username")
	protected WebElement username;
	
	@FindBy(id = "password")
	protected WebElement password;
	
	@FindBy(id = "rememberUn")
	protected WebElement rememberUn;
	
	@FindBy(id = "Login")
	protected WebElement login;
	
	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement rememberUn() {
		return rememberUn;
	}
	
	public WebElement login() {
		return login;
	}
}
