package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class PDPScripts extends BaseTest{
	
	@Test
	public void PDP_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_001",
				"To verify guest user able to view all the fields in the pdp page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		//homepage.CategoryMenuSelection();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.fieldValidations();
		productsDetailPage.lowPriceGuaranteeAnchor();
		//productsDetailPage.QtyErrorMsg();
		productsDetailPage.wishlist();
	}
	
	@Test
	public void PDP_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_Reg_002",
				"To verify registered user able to view all the fields in the pdp page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		//homepage.CategoryMenuSelection();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.fieldValidations();
		productsDetailPage.reviewlink();
	}
	
	@Test
	public void PDP_AddRecommendations_003() throws IOException, InterruptedException {
		TestDescription("PDP_AddRecommendations_003",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		//homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddRecommendations_Reg_004() throws IOException, InterruptedException {
		TestDescription("PDP_AddRecommendations_Reg_004",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		//homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct_005() throws IOException, InterruptedException {
		TestDescription("PDP_AddAlsoViewedProduct_005",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		//homepage.CategoryMenuSelection();
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct_Reg_006() throws IOException, InterruptedException {
		TestDescription("PDP_AddAlsoViewedProduct_Reg_006",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		//homepage.CategoryMenuSelection();
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	
}
