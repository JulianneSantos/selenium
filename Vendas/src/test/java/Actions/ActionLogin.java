package Actions;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginElementMap;

public class ActionLogin {
	
	public static void LoginSistema(WebDriver driver, String usuario, String senha) {
		LoginElementMap loginObjects = new LoginElementMap(driver);
		
		loginObjects.username().sendKeys(usuario);
		loginObjects.password().sendKeys(senha);
		loginObjects.rememberUn().click();
		loginObjects.login().click();
	}

}
