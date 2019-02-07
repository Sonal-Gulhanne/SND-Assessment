package stepsDefinition;


import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;


public class LoginSteps {
	
 LoginPage loginPage = new LoginPage();	
 
	@Given("^I am on home page$")
	public void i_am_on_home_page(){
		loginPage.landHomePage();
		
	    
	}

	@When("^user clicks on SignUp link$")
	public void user_clicks_on_SignUp_link() {
		loginPage.clickSignUpLink();
	}

	@Then("^Registration Page is opened$")
	public void registration_Page_is_opened() {
		String registrationPageTitle = loginPage.getPageHeading();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(registrationPageTitle, "Welcome back. Please log in.");
	    softAssert.assertAll();
	    
	}



}
