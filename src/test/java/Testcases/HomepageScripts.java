package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest{
	
	@Test
	public void Homepage_MultipleSearchItems() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearchItems",
				"To verify guest user able to place order using search items");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SearchSKU");
		int searchList = SearchTermData.size();
		for (int i = 0; i < searchList; i++) {
			int qtytotal =0;
			String SearchTermList = SearchTermData.get(i);
			homepage.searchTerm(SearchTermList);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			List<String> QuantityData = getColumnData("Search", "Quantity");
			String QuantityList = QuantityData.get(i);
			productsDetailPage.quantity(QuantityList);
			int qty = Integer.parseInt(QuantityList);
			qtytotal = qty + qtytotal;
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddToCart();
			logs("Product added to the cart");
			homepage.returnhomepage();
		}
		productsDetailPage.minishopcart_total();
		logs("MiniCart Clicked");
	}
	
	@Test
	public void Homepage_Header_FieldValidations() throws IOException, InterruptedException {
		TestDescription("Homepage_Header_FieldValidations",
				"To verify guest user able to view all the fields in the homepage header");
		homepage.VerifyPageTitle();
		homepage.HeaderValidations();
		homepage.MenuValidations();
	}
	
	@Test
	public void SingleItemSearch() throws IOException, InterruptedException {
		TestDescription("SingleItemSearch",
				"To verify whether user navigates to pdp while searching with single sku");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("Search", "SearchSKU");
		String SearchTermList = SearchTermData.get(0);
		categorypage.verifySearchHeader(SearchTermList);
	}
	
	
}
