package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class TakeOfflineWizard extends BasePage{

	private WebDriver driver;

	public TakeOfflineWizard(WebDriver driver) {
		this.driver = driver;
	}
	
	private By title;
	private By takeOfflineButton = By.cssSelector("input[value='Take offline']");

	public WebElement getTitle(String title1) {
		title = By.cssSelector("[title='"+title1+"']");
		return driver.findElement(title);
	}
	
	public WebElement getTakeOfflineButton(String option) {
		takeOfflineButton = By.cssSelector("input[value='" + option + "']");
		return driver.findElement(takeOfflineButton);
	}
	

}
