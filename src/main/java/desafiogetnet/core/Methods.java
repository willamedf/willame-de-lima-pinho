package desafiogetnet.core;

import static desafiogetnet.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {

	public void clicarViaJS(String xpath) {
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
		WebElement element = getDriver().findElement(By.xpath(xpath));
		js.executeScript("arguments[0].click()", element);

	}

	public void escrever(String xpath, String text) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(text);

	}

	public void elementoExiste(String xpath) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public void clicarViaCssSelector(String cssSelector) {
		getDriver().findElement(By.cssSelector(cssSelector)).click();

	}

	public String recuperarTexto(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}

	public void acessarSite(String arg1) {
		getDriver().get(arg1);

	}

	public static void definirExperaExplicita(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
