package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.Constants;
import Utils.Util;
import junit.framework.Assert;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;

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
	 * Método para preenchimento dos dados do cadastro de novo usuário.
	 * 
	 * @param driver
	 * 
	 * @author julianne.dos.santos
	 */
	public static void preencheDados(WebDriver driver, By elemento) {
		driver.findElement(elemento).sendKeys("");
		
	}

}
