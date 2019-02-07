package stepsDefinition;

import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchPage;
import utils.SearchDetails;

public class SearchSteps {
	
	SearchPage searchPage = new SearchPage();
	SearchDetails searchDetails = new SearchDetails();

	@Given("^user search for article \"([^\"]*)\"$")
	public void user_search_for_article(String articel)  {
		
		searchPage.setSearchText(articel);
		    
	}
	
	@Then("^article links should be displayed in result section$")
	public void article_links_should_be_displayed_in_result_section(){
		String searchResults = searchPage.getSearchResult();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(searchResults, "2,046,416 Results");
	    softAssert.assertAll();
	    
	}

	@Then("^article links should not be displayed in result section$")
	public void article_links_should_not_be_displayed_in_result_section() {
		String searchResults = searchPage.getSearchResult();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(searchResults, "0 Results");
	    softAssert.assertAll();
	   
	}
	
	@When("^user clicks NewSearch button$")
	public void user_clicks_NewSearch_button() {
		searchPage.clickNewSearch();
	}

	@Then("^Searchbox text should be empty$")
	public void searchbox_text_should_be_empty() {
		String searchText = searchPage.getSearchText();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(searchText, "");
	    softAssert.assertAll();
	    
	}
	
	@Then("^Suggestion text should be displayed$")
	public void suggestion_text_should_be_displayed() {
		searchPage.suggestionTextListIsDisplayed();
	    
	}

	@When("^user selects option from suggested text$")
	public void user_selects_option_from_suggested_text(){
		searchPage.suggestionTextIsSelected();	   
	}

	@Then("^Selected text is displayed in search box$")
	public void selected_text_is_displayed_in_search_box() {
		String searchText = searchPage.getSearchText();
	    SoftAssert softAssert = new SoftAssert();
	    softAssert.assertEquals(searchText,searchDetails.getSuggestedText());
	    softAssert.assertAll();
	    
	}


}
