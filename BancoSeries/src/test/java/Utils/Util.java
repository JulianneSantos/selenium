package Utils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Util {

	/**
	 * 
	 * Método para abrir o Chrome e carregar o site desejado.
	 * 
	 * @param driver
	 * @param url
	 * @return driver
	 * 
	 * @author julianne.dos.santos
	 */
	public static WebDriver abrirBrowser(WebDriver driver, String url) {
		// Chrome
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/recursos/drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;

	}
	
	
}
