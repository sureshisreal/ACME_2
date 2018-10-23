package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest{
	
	/*@Test
	public void Homepage_SearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearchItems",
				"To verify guest user able to place order using search items");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SearchSKU");
			String SearchTermList = SearchTermData.get(0);
			homepage.searchTerm(SearchTermList);
			logs("Search term entered");
			AddScreenshot();	
	}*/
	
	
	/*@Test
	public void Homepage_InvalidSearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearchItems",
				"To verify guest user able to place order using search items");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "InvalidSearch");
			String SearchTermList = SearchTermData.get(0);
			homepage.searchTerm(SearchTermList);
			AddScreenshot();
			
	}*/
	
	/*@Test
	public void Homepage_MultipleSearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearchItems",
				"To verify guest user able to place order using search items");
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
	}*/
	
	@Test
	public void Homepage_Header_FieldValidations() throws IOException, InterruptedException {
		TestDescription("Homepage_Header_FieldValidations",
				"To verify guest user able to view all the fields in the homepage header");
		homepage.VerifyPageTitle();
		homepage.HeaderValidations();
		homepage.MenuValidations();
	}
	
	
	
}
