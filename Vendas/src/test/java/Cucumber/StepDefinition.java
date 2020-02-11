package Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Actions.ActionLogin;
import Actions.ActionOportunidades;
import Utils.Util;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	
	Util utilidade = new Util();
	public WebDriver driver;
	ActionLogin login = new ActionLogin();
	ActionOportunidades oportunidades = new ActionOportunidades();
	
	 @Given("^O usuario acessa o prototipo Salesforce$")
	    public void o_usuario_acessa_o_prototipo_salesforce() throws Throwable {
		 driver = utilidade.abrirChrome(driver, "https://comgas--devmerge.lightning.force.com/lightning/page/home");
		 login.LoginSistema(driver, "fernando.f.andrade@comgas.com.devmerge", "37237180Sales");
		 		 System.out.println("logou");
		 
	    }

	 @When("^Acessa o item$")
	 public void acessa_o_item(DataTable arg1) throws Throwable {
		 Thread.sleep(4000);
	    	oportunidades.clicarMenuOportunidades(driver);
	    	Thread.sleep(4000);
		 List<String> itens = arg1.asList(String.class);
		 utilidade.clickLinkTabela(driver, itens.get(0), By.xpath("//table[contains(@class,'slds-table forceRecordLayout')]/tbody/tr"), By.xpath("//table[contains(@class,'slds-table forceRecordLayout')]/tbody/tr/th/span/a"));
		 System.out.println("acessou");
	 }
	    @Then("^edita conta$")
	    public void edita_conta() throws Throwable {
	    	System.out.println("acabou");
	    }

	    @And("^usuario logado com sucesso$")
	    public void usuario_logado_com_sucesso() throws Throwable {
	    	oportunidades.validarElemento(driver, By.xpath(".//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'][a[span[text()='Oportunidades']]]"));
	    	System.out.println("usuario logado com sucesso");
	    }

}