package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class ShippingPageScripts extends BaseTest{
	
	@Test
	public void ShippingPage_FieldValidations_001() throws IOException, InterruptedException {
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
		shoppingCartPage.guestCheckout();
		shippingPage.ShippingAddressFieldValidation();
	}
	
	@Test
	public void ShippingPage_AVSCheck() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_FieldValidations",
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
		shoppingCartPage.guestCheckout();
		shippingPage.GuestShippingInvalidAddress();
		shippingPage.UseSuggestedAddress();
		shippingPage.GuestShippingAddress();
	}
	
	@Test
	public void ShippingPage_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("ShoppingCart_FieldValidations",
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
		shoppingCartPage.guestCheckout();
		shippingPage.ShippingAddressFieldValidation();
	}
	
}
