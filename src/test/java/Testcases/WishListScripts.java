package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class WishListScripts extends BaseTest{
	
	@Test
	public void WishList_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_001",
				"To verify guest user able to view all the fields in the pdp page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		//homepage.CategoryMenuSelection();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.wishlist();
	}
	
	@Test
	public void WishList_FieldValidations_002_Reg() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_001",
				"To verify guest user able to view all the fields in the pdp page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.wishlist();
	}
	
}
