package stepDefinitions;

import org.testng.Assert;

import baseTest.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TakeOfflineWizard;

public class TakeOfflineWizardSteps extends BaseTest {
	
	private TakeOfflineWizard tow = new TakeOfflineWizard(driver);
	
    @Then("^user is navigated to Offline Wizard with title \"([^\"]*)\"$")
    public void user_is_navigated_to_offline_wizard_with_title_something(String title) {
		Assert.assertTrue(tow.getTitle(title).isDisplayed(), "Title of the Page "+title+" is not displayed");
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on_something(String option) {
		tow.getTakeOfflineButton(option).click();
	}

}
