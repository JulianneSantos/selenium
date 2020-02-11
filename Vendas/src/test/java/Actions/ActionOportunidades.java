package Actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Util;

public class ActionOportunidades {
	
	static Util utilidade = new Util();
	
	public static void validarElemento(WebDriver driver, By by) throws InterruptedException {
		//int achou = driver.findElements(By.xpath(".//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'][a[span[text()='Oportunidades']]]")).size();
		int achou = driver.findElements(by).size();
		//Assert.assertTrue(achou>0);		
	}
	
	public static void clicarMenuOportunidades(WebDriver driver) {
		driver.findElement(By.xpath(".//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'][a[span[text()='Oportunidades']]]")).click();
	}
	
	public static void clicarItem(WebDriver driver, String item, By linhasTabela, By linksTabela) throws InterruptedException {
		
		utilidade.clickLinkTabela(driver, item, linhasTabela, linksTabela);
	}

}
