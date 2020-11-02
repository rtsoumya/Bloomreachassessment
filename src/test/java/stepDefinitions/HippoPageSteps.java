package stepDefinitions;

import org.testng.Assert;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Constants;
import pageObjects.HippoPage;

public class HippoPageSteps extends BaseTest {

	HippoPage hp = new HippoPage(driver);

	@When("^user is navigated to Hippo application$")
	public void user_is_navigated_to_hippo_application() {
		navigateToURL(Constants.getHippoURL());
	}

	@And("^searches for (.+)$")
	public void searches_for(String title) {
		hp.searchForTitle(title);
	}

    @Then("^title (.+) is displayed$")
    public void title_is_displayed(String title) {
		Assert.assertTrue(hp.getDocumentTitle(title).isDisplayed(),
				"Document with title " + title + " is not Published in Hippo");
	}

    @Then("^No Results for (.+) is displayed$")
    public void no_results_for_is_displayed(String title) {
		Assert.assertTrue(hp.getNoResultsMsg(title).isDisplayed(), "Document with title " + title + " is still Published in Hippo");
	}

}
