package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	// initialize WebDriver

	private static WebDriver driver;

	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;

	private SeleniumDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");// for the error -
															// org.openqa.selenium.remote.http.WebSocket$Listener
															// onError
		// driver = new ChromeDriver(options);
		driver = new FirefoxDriver();
		waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(TIMEOUT))
				.pageLoadTimeout(Duration.ofMinutes(PAGE_LOAD_TIMEOUT)).scriptTimeout(Duration.ofSeconds(TIMEOUT));

		/*
		 * waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		 * driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,
		 * TimeUnit.SECONDS);
		 */

	}

	public static void openPage(String url) {
		driver.get(url);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {

		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}

	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			// driver.quit();
		}

		seleniumDriver = null;
	}

}
