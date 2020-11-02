package helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	Logger logger = LoggerHelper.getLogger(WaitHelper.class);
	
	private WebDriver driver;
	
	public WaitHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public void waitForElementsVisibility(WebElement element){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, Constants.getExplicitwait());
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("element is visible..");
	}

}
