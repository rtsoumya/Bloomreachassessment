package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BasePage;

public class HippoPage extends BasePage{
	
	private WebDriver driver;

	public HippoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By searchIcon = By.cssSelector("[for=searchbox-inputtext]");
	private By searchInput = By.id("searchbox-inputtext");
	private By documentTitle;
	private By noResultsMsg;
	
	public WebElement getSearchIcon() {
		return driver.findElement(searchIcon);
	}
	
	public WebElement getSearchInput() {
		return driver.findElement(searchInput);
	}
	
	public WebElement getDocumentTitle(String title) {
		documentTitle = By.xpath("//a[contains(text(),'"+title+"')]");
		return driver.findElement(documentTitle);
	}
	
	public WebElement getNoResultsMsg(String title) {
		noResultsMsg = By.xpath("//h4[contains(text(),'No results for') and contains(text(),'"+title+"')]");
		return driver.findElement(noResultsMsg);
	}
	
	public void searchForTitle(String title) {
		getSearchIcon().click();
		getSearchInput().sendKeys(title);
		getSearchInput().sendKeys(Keys.ENTER);
	}


}
