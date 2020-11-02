package stepDefinitions;

import org.testng.Assert;

import baseTest.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ContentPage;

public class ContentPageSteps extends BaseTest{
	
	private ContentPage cp = new ContentPage(driver);
	
	@Then("^user is navigated to Content Page with document (.+) displayed$")
	public void user_is_navigated_to_content_page_with_document_displayed(String name) {
		Assert.assertTrue(cp.getAddedDocument(name).isDisplayed(),"Document "+name+" is not displayed");
	}

	@When("^user enters title in (.+) field and clicks on \"([^\"]*)\"$")
	public void user_enters_title_in_field_and_clicks_on_done(String title, String option) {
		cp.enterTitleAndDone(title, option);
	}

	@Then("^document with given (.+) is created$")
	public void document_with_given_is_created(String title) {
		Assert.assertTrue(cp.getTitle(title).isDisplayed(),"Title "+title+" is not displayed");
	}

	@When("^user clicks on Publication and \"([^\"]*)\"$")
	public void user_clicks_on_publication_and_something(String publishOption) {
		cp.clickOnPublish(publishOption);
	}
	
	@Then("^document is updated with \"([^\"]*)\" message$")
	public void document_is_updated_with_something_message(String liveOrOffline) {
		Assert.assertTrue(cp.getLiveOrOfflineDocumentMsg(liveOrOffline).isDisplayed(),"Document "+liveOrOffline+" is not displayed");
	}
	
    @When("^user clicks on \"([^\"]*)\" on Content Page$")
    public void user_clicks_on_something_on_content_page(String option) throws Throwable {
        cp.getActionOption(option).click();
    }
    
    @Then("^error message \"([^\"]*)\" is displayed$")
    public void error_message_something_is_displayed(String errMsg) throws Throwable {
        Assert.assertTrue(cp.getNoTitleError(errMsg).isDisplayed(), "Error Message "+errMsg+" is not displayed");
    }

}
