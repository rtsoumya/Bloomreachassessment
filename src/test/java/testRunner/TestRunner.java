package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json" }, features = {
				"src/test/resources/features" }, glue = { "stepDefinitions" }, tags = { "@smoke" }
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
