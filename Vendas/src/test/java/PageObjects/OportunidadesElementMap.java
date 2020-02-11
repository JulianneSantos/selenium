package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class OportunidadesElementMap {
	
	WebDriver driver;
	
	public OportunidadesElementMap(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 50), this);
    }
	
	//Tela principal
	//@FindBy(xpath = "//a[contains(@title,'Oportunidades')")
	@FindBy(xpath = ".//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'][a[span[text()='Oportunidades']]]")
	protected WebElement aba_Oportunidades;
	
	public WebElement aba_Oportunidades() {
		return aba_Oportunidades;
	}
	
	@FindBy()
	protected WebElement nomeOportunidade;
	
	public WebElement nomeOportunidade() {
		return nomeOportunidade;
	}
	
	

}
