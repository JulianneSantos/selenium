package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeMap {

	WebDriver driver;

	// Menu "Cadastre-se"
	public static By MENU_CADASTRO = By.xpath("/html/body/div[1]/div/div/div/div/ul/li[5]/a");
	
	// Menu "Login"
		public static By MENU_LOGIN = By.xpath("/html/body/div[1]/div/div/div/div/ul/li[4]/a");
	
	// Campo Login do Menu Cadastro
	public static By CAMPO_LOGIN = By.xpath("//*[@id=\"myModalCadastro\"]/div[2]/form/table/tbody/tr[1]/td[2]/input");
	
	// Campo Login do Menu Login 
	public static By CAMPO_LOGIN_MENU_LOGIN = By.xpath("//*[@id=\"myModal\"]/div[2]/form/table/tbody/tr[1]/td[2]/input");
	
	// Email
	public static By CAMPO_EMAIL = By.name("email");
	
	// Senha
	public static By CAMPO_SENHA = By.xpath("//*[@id=\"myModalCadastro\"]/div[2]/form/table/tbody/tr[3]/td[2]/input");
	
	// Campo Senha do Menu Login
	public static By CAMPO_SENHA_MENU_LOGIN = By.xpath("//*[@id=\"myModal\"]/div[2]/form/table/tbody/tr[2]/td[2]/input");
	
	// Confirma Senha
	public static By CAMPO_CONFIRMAR_SENHA = By.xpath("//*[@id=\"myModalCadastro\"]/div[2]/form/table/tbody/tr[4]/td[2]/input");
	
	//Botão "Cadastrar-se" 
	public static By BTN_CADASTRARSE = By.xpath("//*[@id=\"myModalCadastro\"]/div[3]/button");
	
	// Botão "Logar-se"
	public static By BTN_LOGARSE = By.xpath("//*[@id=\"myModal\"]/div[3]/button");
	
	// Mensagem de validação do cadastro de novo usuário
	public static By MSG_NOVO_CADASTRO = By.xpath("/html/body/div[3]");
	
	// id myModalLabelCadastro
	public static By MODAL_CADASTRO = By.id("myModalLabelCadastro");
	
	// id myModalLabel
	public static By MODAL_LABEL = By.id("myModalLabel");
	
	//item menu login 
	public static By ITEM_LOGIN = By.xpath("/html/body/div[1]/div/div/div/div/ul/li[11]/a");
	

}
