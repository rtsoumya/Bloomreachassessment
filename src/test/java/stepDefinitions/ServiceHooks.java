package stepDefinitions;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;

import baseTest.BaseTest;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.Constants;
import helpers.LoggerHelper;

public class ServiceHooks extends BaseTest {

	Logger log = LoggerHelper.getLogger(ServiceHooks.class);

	@Before
	public void initializeTest() throws IOException {
		initializeDriver();
		navigateToURL(Constants.getURL());
	}

	@After
	public void endTest(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				log.info(scenario.getName() + " is Failed");
				scenario.embed(getScrenShot(), "image/png"); // ... and embed it in
			} catch (WebDriverException e) {
				e.printStackTrace();
			}
		} else {
			try {
				log.info(scenario.getName() + " is pass");
				scenario.embed(BaseTest.getScrenShot(), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
