package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class ShoppingCartScripts extends BaseTest{
	
	@Test
	public void ShoppingCart_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_FieldValidations_001",
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
	public void ShoppingCart_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_FieldValidations_Reg_002",
				"To verify registered user able to view all the fields in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.fieldvalidations();
	}
	
	@Test
	public void ShoppingCart_RemoveProduct_003() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_RemoveProduct_003",
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
	public void ShoppingCart_RemoveProduct_Reg_004() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_RemoveProduct_Reg_004",
				"To verify registered user able to remove product in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
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
	public void ShoppingCart_InlineItem_005() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_InlineItem_005",
				"To verify guest user able to view sepaerate line items in the shoppingcart page");
		int loop=2;
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		for(int i=0; i<loop ; i++) {
		//homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		}
		shoppingCartPage.shoppingcartInlinCheck(loop);
	}
	
	@Test
	public void ShoppingCart_InlineItem_Reg_006() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_InlineItem_Reg_006",
				"To verify registered user able to view sepaerate line items in the shoppingcart page");
		int loop=2;
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		for(int i=0; i<loop ; i++) {
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		}
		shoppingCartPage.shoppingcartInlinCheck(loop);
	}
	
	@Test
	public void ShoppingCart_ReturningCustomer_007() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_ReturningCustomer_007",
				"To verify guest user able to signin in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.ReturningCustomer();
	}
	
	@Test
	public void ShoppingCart_ReturningCustomer_Invalid_008() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_ReturningCustomer_Invalid_007",
				"To verify guest user able to signin in the shoppingcart page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.Invalid_ReturningCustomer();
	}
	
	@Test
	public void ShoppingCart_ForgotPassword_009() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_ForgotPassword",
				"To verify guest user able to validate the forgot password page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.ForgotPassword();
	}
	
	@Test
	public void ShoppingCart_Promocode_010() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_Promocode",
				"To verify guest user able to apply promo code");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.promocode();
	}
	
}
