package desafiogetnet.core;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static ChromeDriver driver;

	private static ChromeDriver createDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static ChromeDriver getDriver() {
		if (driver == null) 
			createDriver();
		return driver;
	}
	
	public static void killDriver() {
		if (driver!=null) {
			driver.quit();
			driver = null;
		}
	}

}
