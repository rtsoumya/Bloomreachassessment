package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class ContentPage extends BasePage {

	private WebDriver driver;

	public ContentPage(WebDriver driver) {
		this.driver = driver;
	}

	private By addedDocument;
	private By titleField = By.xpath(
			"(//div[contains(@style,'block')])[2]//span[text()='Title']/parent::h3/following-sibling::div//input");
	private By doneButton = By.xpath("(//div[contains(@style,'block')])[2]//span[text()='Done']");
	private By editButton = By.xpath("(//div[contains(@style,'block')])[2]//span[text()='Edit']");
	private By titleEntered;
	private By publicationOption = By.xpath("(//div[contains(@style,'block')])[2]//span[text()='Publication']");
	private By liveDocumentMsg = By.xpath("(//div[contains(@style,'block')])[2]//span[contains(text(),'live')]");
	private By documentMessage = By
			.xpath("(//div[contains(@style,'block')])[2]//span[contains(text(),'Core document')]");
	private By publishOption;
	private By actionOption;
	private By noTitleError;

	public WebElement getAddedDocument(String documentName) {
		addedDocument = By
				.xpath("//*[@class='datatable-tbody']//tr//td//span[contains(text(),'" + documentName + "')]");
		return driver.findElement(addedDocument);
	}

	public WebElement getTitleField() {
		return driver.findElement(titleField);
	}

	public WebElement getDoneButton() {
		return driver.findElement(doneButton);
	}

	public WebElement getEditButton() {
		return driver.findElement(editButton);
	}

	public WebElement getTitle(String title) {
		titleEntered = By.xpath("(//div[contains(@style,'block')])[2]//div[text()='" + title + "']");
		return driver.findElement(titleEntered);
	}

	public WebElement getPublicationOption() {
		return driver.findElement(publicationOption);
	}

	public WebElement getLiveOrOfflineDocumentMsg(String liveOrOffline) {
		liveDocumentMsg = By
				.xpath("(//div[contains(@style,'block')])[2]//span[contains(text(),'" + liveOrOffline + "')]");
		return driver.findElement(liveDocumentMsg);
	}

	public WebElement getDocumentMessage() {
		return driver.findElement(documentMessage);
	}

	public WebElement getPublishOption(String option) {
		publishOption = By.cssSelector("[title*='" + option + "']");
		return driver.findElement(publishOption);
	}

	public WebElement getActionOption(String option) {
		actionOption = By.xpath("(//div[contains(@style,'block')])[2]//span[text()='" + option + "']");
		return driver.findElement(actionOption);
	}

	public WebElement getNoTitleError(String errMsg) {
		noTitleError = By.xpath("(//div[contains(@style,'block')])[2]//span[text()='" + errMsg + "']");
		return driver.findElement(noTitleError);
	}

	public void enterTitleAndDone(String title, String option) {
		getTitleField().sendKeys(title);
		getActionOption(option).click();
	}

	public void clickOnPublish(String option) {
		getPublicationOption().click();
		getPublishOption(option).click();
	}

}
