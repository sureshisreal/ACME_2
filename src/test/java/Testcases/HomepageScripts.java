package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest{
	
	@Test
	public void Homepage_MultopleSearch() throws IOException, InterruptedException {
		TestDescription("Guest_SearchCheckout",
				"To verify guest user able to place order using search items");
		logs("Url entered");
		homepage.VerifyPageTitle();
		/*List<String> SearchTermData = getColumnData("suresh", "SearchSKU");
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
			productsDetailPage.minishopcart_total();
			logs("MiniCart Clicked");
		}*/

	}
	

}
