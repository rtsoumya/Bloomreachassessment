package stepDefinitions;

import baseTest.BaseTest;
import cucumber.api.java.en.Given;
import pageObjects.LoginPage;

public class LoginPageSteps extends BaseTest{

	private LoginPage lp = new LoginPage(driver);
	
    @Given("^user is logged in with valid username \"([^\"]*)\" password \"([^\"]*)\" and language \"([^\"]*)\"$")
    public void user_is_logged_in_with_valid_username_something_password_something_and_language_something(String username, String password, String language) {
		lp.login(username, password, language);
	}

}
