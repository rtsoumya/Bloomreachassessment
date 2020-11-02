package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class DocumentWizard extends BasePage {

	private WebDriver driver;

	public DocumentWizard(WebDriver driver) {
		this.driver = driver;
	}

	private By title = By.cssSelector("span[title*='Create a']");
	private By nameField = By.cssSelector("[name*='name']");
	private By valueDD = By.name("list");
	private By okButton = By.cssSelector("[value='OK']");
	private By cancelButton = By.cssSelector("[value='Cancel']");

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNameField() {
		return driver.findElement(nameField);
	}

	public WebElement getValueDD() {
		return driver.findElement(valueDD);
	}

	public WebElement getOKButton() {
		return driver.findElement(okButton);
	}

	public WebElement getCancelButton() {
		return driver.findElement(cancelButton);
	}

	public ContentPage enterNameAndSubmit(String name, String productValue) {
		getNameField().sendKeys(name);
		if (getTitle().getText().contains("product")) {
			selectDDByValue(getValueDD(), productValue);
		}
		getOKButton().click();
		return new ContentPage(driver);
	}

}
