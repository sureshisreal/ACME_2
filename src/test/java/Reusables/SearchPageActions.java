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

	public void BrandName() {
		WaitUntilElementVisible(BrandName_BreadCrumb);
		assertTrue(BrandName_BreadCrumb.getText().contains("Brands"));
		logs("BrandName verified");
		
	}

	public void VerifyPage() {
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current Url : " +currentURL);
		if(currentURL.contains("https://qa.acmetools.com")) {
		WaitUntilElementVisible(BrandName_BreadCrumb);		
		logs("Search page verified");	
		}
	}
	
	

}
