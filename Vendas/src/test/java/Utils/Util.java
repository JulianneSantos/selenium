package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Util {

	public static WebDriver abrirChrome(WebDriver driver, String url) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/recursos/drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	public static void selectOpcao(WebDriver driver, WebElement elementoSelect, String opcao) {

		Select selectElement = new Select(elementoSelect);
		selectElement.selectByVisibleText(opcao);

	}

	public static void clickLinkTabela(WebDriver driver, String item, By linhasTabela, By linksTabela)
			throws InterruptedException {
		List<WebElement> alllinks = driver.findElements(linksTabela);
		List<WebElement> allItens = driver.findElements(linhasTabela);
		String itemBusca = item;
		for (int i = 0; i < allItens.size(); i++) {
			if (allItens.get(i).getAttribute("innerText").contains(itemBusca)) {
				System.out.println(allItens.get(i).getAttribute("innerText").toString());
				Thread.sleep(2000);
				alllinks.get(i).click();
				break;
			}
		}
	}

}
