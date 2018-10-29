package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class SearchpageScripts extends BaseTest{
	
	@Test
	public void Searchpage_BrandSearch() throws IOException, InterruptedException {
		TestDescription("Searchpage_BrandSearch",
				"To verify whether guest user able to search using the brand names");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "BrandSearch");
			String BrandSearchTermList = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.searchTerm(BrandSearchTermList);
			searchResultPage.BrandName();
			searchResultPage.VerifyPage();
	}	
	
	@Test
	public void Searchpage_SingleProduct() throws IOException, InterruptedException {
		TestDescription("Searchpage_PDPScripts",
				"To verify whether guest user navigates to PDP while using single SKU");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SingleSearch");
			String SingleSearchTermList = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.searchTerm(SingleSearchTermList);
			productsDetailPage.VerifyPage();
	}
	@Test
	public void Homepage_SearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_SearchItems",
				"To verify guest user able to place order using search items");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SearchSKU");
			String SearchTermList = SearchTermData.get(0);
			homepage.searchTerm(SearchTermList);
			searchResultPage.VerifyPage();
	}
	
	@Test
	public void Homepage_InvalidSearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_InvalidSearchItems",
				"To verify guest user able to view th invalid search result page");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "InvalidSearch");
			String SearchTermList = SearchTermData.get(0);
			homepage.searchTerm(SearchTermList);
			searchResultPage.Search_Invalid(SearchTermList);		
	}
	
	@Test
	public void Homepage_MultipleSearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearchItems",
				"To verify guest user able to place order using multiple search items");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SearchSKU");
		int searchList = SearchTermData.size();
		for (int i = 0; i < searchList; i++) {
			String SearchTermList = SearchTermData.get(i);
			homepage.searchTerm(SearchTermList);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			productsDetailPage.quantity("5");
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddToCart();
			logs("Product added to the cart");
			homepage.returnhomepage();
		}
		productsDetailPage.minishopcart_total();
		logs("MiniCart Clicked");
	}
}
