package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class WishListScripts extends BaseTest{
	
	@Test
	public void WishList_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("WishList_FieldValidations_001",
				"To verify guest user able to add product to the WishList");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.wishlist();
	}
	
	@Test
	public void WishList_FieldValidations_002_Reg() throws IOException, InterruptedException {
		TestDescription("WishList_FieldValidations_002_Reg",
				"To verify registered user able to add product to the WishList");
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
