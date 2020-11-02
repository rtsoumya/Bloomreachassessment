package stepDefinitions;

import baseTest.BaseTest;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps extends BaseTest {
	
	private HomePage hp = new HomePage(driver);
	
	@When("^user clicks on selcet a (.+) document$")
	public void user_clicks_on_selcet_a_document(String type) throws InterruptedException {
		hp.createDocument(type);
	}

}
