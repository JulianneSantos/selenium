package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utils.Constants;
import Utils.Util;
import actions.ActionAcesso;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomeMap;

public class stepDefinition {
	
	public WebDriver driver;
	
	@Given("O usuario acessa o site")
	public void o_usuario_acessa_o_site() {
		driver = Util.abrirBrowser(driver, Constants.SITE_URL);
		
	}

	@Then("O site é carregado com sucesso")
	public void o_site_é_carregado_com_sucesso() {
		ActionAcesso.validarURL(driver, Constants.SITE_URL);
	}

	@Given("O usuario acessa o menu para a realizacao do cadastro")
	public void o_usuario_acessa_o_menu_para_a_realizacao_do_cadastro() {
		ActionAcesso.acessaMenu(driver, HomeMap.MENU_CADASTRO);
	}

	@When("Preencher os dados solicitados pelo site")
	public void preencher_os_dados_solicitados_pelo_site() {
	    // Write code here that turns the phrase above into concrete actions
		ActionAcesso.preencheDados(driver, );
	}

	@When("Clicar no botão {string}")
	public void clicar_no_botão(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Cadastro é realizado com sucesso")
	public void cadastro_é_realizado_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("O usuario acessa o menu para a realizacao do login")
	public void o_usuario_acessa_o_menu_para_a_realizacao_do_login() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Acesso ao site é realizado com sucesso")
	public void acesso_ao_site_é_realizado_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("O usuario está conectado ao site")
	public void o_usuario_está_conectado_ao_site() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Acessar o menu de saída do site")
	public void acessar_o_menu_de_saída_do_site() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("O site exibe a tela principal")
	public void o_site_exibe_a_tela_principal() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Validar que que não existe usuário conectado ao site")
	public void validar_que_que_não_existe_usuário_conectado_ao_site() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("O usuario se conecta no site")
	public void o_usuario_se_conecta_no_site() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("O site carrega a página inicial com sucesso")
	public void o_site_carrega_a_página_inicial_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("O usuario acessa o menu da programação diária")
	public void o_usuario_acessa_o_menu_da_programação_diária() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("O site exibe a listagem com os episodios")
	public void o_site_exibe_a_listagem_com_os_episodios() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("O usuario seleciona a serie desejada")
	public void o_usuario_seleciona_a_serie_desejada() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Clicar no botão para adicionar a série")
	public void clicar_no_botão_para_adicionar_a_série() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Clicar no botão de confirmação")
	public void clicar_no_botão_de_confirmação() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("O usuario seleciona a lista criada")
	public void o_usuario_seleciona_a_lista_criada() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Validar que a serie foi adicionada com sucesso")
	public void validar_que_a_serie_foi_adicionada_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("Realizar a desconexão no site")
	public void realizar_a_desconexão_no_site() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Localizar a seção {string}")
	public void localizar_a_seção(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("O usuario clica na serie mais vista")
	public void o_usuario_clica_na_serie_mais_vista() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("O site exibe as informações da serie")
	public void o_site_exibe_as_informações_da_serie() {
	    // Write code here that turns the phrase above into concrete actions
	}



}
