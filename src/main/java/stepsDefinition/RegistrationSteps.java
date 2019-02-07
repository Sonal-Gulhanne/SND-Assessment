package stepsDefinition;



import java.util.List;
import java.util.Map;

import org.testng.asserts.SoftAssert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.RegistrationPage;

public class RegistrationSteps {
	
	RegistrationPage registrationPage = new RegistrationPage();
	
	@Given("^User enters details for registration as:$")
	public void user_enters_details_for_registration_as(DataTable dataTable) {
		 List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		 registrationPage.enterRegistrationDetails(dataList.get(0));
		 registrationPage.clickCreateAccount();
	}

	

	@Then("^Account should be created$")
	public void account_should_be_created() {
		String registrationConfirmationMessage = registrationPage.getCreateAccountConfirmationMessage();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(registrationConfirmationMessage, "Your account has been successfully created.");
	    softAssert.assertAll();
		
	   
	}

}
