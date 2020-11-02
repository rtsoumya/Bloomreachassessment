package stepDefinitions;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import pageObjects.DocumentWizard;

public class DocumentWizardSteps extends BaseTest{
	
	private DocumentWizard dw = new DocumentWizard(driver);
	
	@And("^enters document (.+), (.+) if present and clicks on OK on a Document Wizard$")
	public void enters_document_if_present_and_clicks_on_ok_on_a_document_wizard(String name, String value) {
		dw.enterNameAndSubmit(name, value);
	}


}
