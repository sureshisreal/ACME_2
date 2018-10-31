package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class ShoppingCartScripts extends BaseTest{
	
	@Test
	public void ShoppingCart_FieldValidations() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_FieldValidations",
				"To verify guest user able to view all the fields in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.fieldvalidations();
	}
	
	@Test
	public void ShoppingCart_RemoveProduct() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_RemovePRoduct",
				"To verify guest user able to remove product in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RemoveProduct();
		shoppingCartPage.EmptyCartMsg();
	}
	
	@Test
	public void ShoppingCart_InlineItem() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_RemovePRoduct",
				"To verify guest user able to remove product in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RemoveProduct();
		shoppingCartPage.EmptyCartMsg();
	}
	
}
