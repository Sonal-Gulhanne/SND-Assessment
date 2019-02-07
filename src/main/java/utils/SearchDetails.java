package utils;

public class SearchDetails {
	
	public String searchText = null;
	
	public String setSuggestedText(String searchText) {
		this.searchText = searchText;
		return searchText;
	}
	
	public String getSuggestedText() {
		return searchText;
	}

}
