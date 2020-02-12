package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeMap {

	WebDriver driver;

	// Menu "Cadastre-se"
	public static By MENU_CADASTRO = By.xpath("/html/body/div[1]/div/div/div/div/ul/li[5]/a");
	
	// Login
	public static By CAMPO_LOGIN = By.name("login");
	
	// Email
	public static By CAMPO_EMAIL = By.name("email");
	
	// Senha
	public static By CAMPO_SENHA = By.name("pw");
	
	// Confirma Senha
	public static By CAMPO_CONFIRMAR_SENHA = By.name("pw2");
	
	//Botão "Cadastrar-se" 
	public static By BTN_CADASTRARSE = By.className("btn btn-primary");

}
