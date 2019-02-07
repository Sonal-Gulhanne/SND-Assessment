package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SearchDetails;

public class SearchPage {
	
	//Object Declaration
			WebDriver driver = null;
			WebElement element = null;
			SearchDetails searchDetails = new SearchDetails();
	//Locators
			String xpathSearchTextBox = "//*[@id=\"query\"]";
			String xpathSearchNewButton = "//*[@id=\"global-search-new\"]";
			String xpathSearchResult = "//*[@id=\"number-of-search-results-and-search-terms\"]";
			String xpathSearchSuggestionText="//*[@id=\"ui-id\"]";

	public void setSearchText(String articel) {
		
		element = driver.findElement(By.xpath(xpathSearchTextBox));
		 element.sendKeys(articel);
		
	}
	
	public void clickNewSearch()
	{
		element = driver.findElement(By.xpath(xpathSearchNewButton));
		element.click();
	}

	public String getSearchResult() {
		String searchResultMessage = driver.findElement(By.xpath(xpathSearchResult)).getText();
		return searchResultMessage;
	}
	
	public String getSearchText() {
		String searchText = driver.findElement(By.xpath(xpathSearchTextBox)).getText();
		return searchText;
	}

	public void suggestionTextListIsDisplayed() {
		element = driver.findElement(By.xpath(xpathSearchSuggestionText));
		element.isDisplayed();
		
	}

	public void suggestionTextIsSelected() {
		List <WebElement> elements = driver.findElements(By.xpath(xpathSearchSuggestionText));
		element = elements.get(0);
		searchDetails.setSuggestedText(elements.get(0).getText());
		element.click();
		
	}


}
