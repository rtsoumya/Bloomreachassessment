package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class LoginPage extends BasePage{

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By userNameField = By.name("username");
	private By passwordField = By.name("password");
	private By languageDD = By.name("locale");
	private By loginButton = By.cssSelector("button[type=submit]");

	public WebElement getEmailField() {
		return driver.findElement(userNameField);
	}

	public WebElement getPasswordField() {
		return driver.findElement(passwordField);
	}

	public WebElement getLanguageDD() {
		return driver.findElement(languageDD);
	}

	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}

	public HomePage login(String userName, String password, String language) {
		getEmailField().sendKeys(userName);
		getPasswordField().sendKeys(password);
		selectDDByValue(getLanguageDD(), language);
		getLoginButton().click();
		return new HomePage(driver);
	}
}
