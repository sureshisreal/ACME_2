package Reusables;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.SearchResultpageRepo;


public class SearchPageActions extends SearchResultpageRepo {


	public SearchPageActions(WebDriver driver) {
		super(driver);
	}

	
	public void Search_Invalid( String SearchTermList) {
		WaitUntilElementVisible(SearchHeader_ZeroResult);
		assertTrue(SearchHeader_ZeroResult.getText().contains(SearchTermList));
		logs("Search Invalid verified");
	}

}
