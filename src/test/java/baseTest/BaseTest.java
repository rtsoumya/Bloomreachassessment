package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import enums.Browsers;
import helpers.Constants;

public class BaseTest {

	public static WebDriver driver;
	public static String path = System.getProperty("user.dir");

	public static WebDriver initializeDriver() {
		String browser = Constants.getBrowser();

		if (browser.equalsIgnoreCase(Browsers.CHROME.name().toLowerCase())) {
			System.setProperty("webdriver.chrome.driver", path + "\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name().toLowerCase())) {
			System.setProperty("webdriver.gecko.driver", path + "\\src\\main\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase(Browsers.IE.name().toLowerCase())) {
			System.setProperty("webdriver.ie.driver", path + "\\src\\main\\resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid Browser Entry");
		}
		driver.manage().timeouts().implicitlyWait(Constants.getImplicitewait(), TimeUnit.SECONDS);
		return driver;
	}

	public static void navigateToURL(String url) {
		driver.get(url);
	}

	public static byte[] getScrenShot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
