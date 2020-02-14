package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utils.Constants;
import Utils.TestContext;
import Utils.Util;
import actions.ActionAcesso;
import cucumber.api.java.Before;
import pageObjects.HomeMap;

public class Hooks {
	
	public WebDriver driver;
	
	/**
	 * Método responsável por executar uma pré-condição APENAS para o teste especificado na tag Before.
	 */
	@Before("@smoke3")
	public void beforevalidation() {
		System.out.println("ACESSOU HOOKS!");
		
		TestContext novoDriver = (TestContext) Util.abrirBrowser(driver, Constants.SITE_URL);;
		novoDriver.getDriver();
		
		ActionAcesso.acessaMenuTeste(novoDriver, HomeMap.MENU_LOGIN);
	}

}
