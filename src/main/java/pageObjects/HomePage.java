package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class HomePage extends BasePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	private By document;
	private By documentSearch = By.xpath("//div[contains(text(),'Document search')]/parent::div");
	private By frameElement = By.cssSelector("[src='https://cms.demo.onehippo.com/?iframe']");

	public WebElement getDocument(String documentType) {
		document = By.xpath(
				"//div[contains(@class,'dashboard-shortcuts')]//div//a//span[contains(text(),'" + documentType + "')]");
		return driver.findElement(document);
	}

	public WebElement getDocumentSearch() {
		return driver.findElement(documentSearch);
	}

	public WebElement getFrameElement() {
		return driver.findElement(frameElement);
	}

	public DocumentWizard createDocument(String documentType) throws InterruptedException {
		driver.switchTo().frame(getFrameElement());
		getDocument(documentType).click();
		return new DocumentWizard(driver);
	}

}
