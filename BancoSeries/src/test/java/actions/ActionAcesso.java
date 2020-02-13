package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Constants;
import Utils.Util;
import junit.framework.Assert;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import pageObjects.HomeMap;

public class ActionAcesso {

	/**
	 * 
	 * Método para validação de site exibido no browser.
	 * 
	 * @param driver
	 * @param url
	 * 
	 * @author julianne.dos.santos
	 */
	@SuppressWarnings("deprecation")
	public static void validarURL(WebDriver driver, String url) {

		Assert.assertTrue(driver.getCurrentUrl().contains(url));

	}

	/**
	 * 
	 * Método para clicar.
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 */
	public static void acessaMenu(WebDriver driver, By elemento) {
		driver.findElement(elemento).click();

	}

	/**
	 * 
	 * Método para preenchimento dos dados do cadastro de novo usuário ou para a
	 * realização de um login.
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 * @throws InterruptedException
	 */
	public static void preencheDados(WebDriver driver, By login, By email, By senha, By confirmaSenha, By login_login, By senha_login)
			throws InterruptedException {

		if (driver.findElement(HomeMap.MODAL_CADASTRO).isDisplayed()) {
			Thread.sleep(2000);
			driver.findElement(login).sendKeys(Constants.TXT_LOGIN);
			driver.findElement(email).sendKeys(Constants.TXT_EMAIL);
			driver.findElement(senha).sendKeys(Constants.TXT_SENHA);
			driver.findElement(confirmaSenha).sendKeys(Constants.TXT_CONFIRMA_SENHA);

		} else if (driver.findElement(HomeMap.MODAL_LABEL).isDisplayed()) {
			Thread.sleep(4000);
			driver.findElement(login_login).sendKeys(Constants.TXT_LOGIN);
			driver.findElement(senha_login).sendKeys(Constants.TXT_SENHA);

		}

	}

	/**
	 * Método para clicar no botão "cadastre-se"
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 */
	public static void clicarBotao(WebDriver driver) {

		if (driver.findElement(HomeMap.MODAL_CADASTRO).isDisplayed()) {
			driver.findElement(HomeMap.BTN_CADASTRARSE).click();
			
		} else if (driver.findElement(HomeMap.MODAL_LABEL).isDisplayed()) {
			driver.findElement(HomeMap.BTN_LOGARSE).click();
			
		}

	}

	/**
	 * Método para realizar a validação do cadastro de novo usuário.
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 * @throws InterruptedException
	 */
	public static void validarCadastro(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(
				driver.findElement(HomeMap.MSG_NOVO_CADASTRO).getText().contains(Constants.MSG_NOVO_CADASTRO));

	}

	/**
	 * Método para validar que o usuario foi logado com sucesso.
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 */
	public static void validarHome(WebDriver driver) {
		// TODO Auto-generated method stub
		Assert.assertTrue(
				driver.findElement(HomeMap.ITEM_LOGIN).isDisplayed());

	}

}
