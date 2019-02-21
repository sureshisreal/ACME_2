package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class OrderConformationPageScripts extends BaseTest{
	
	@Test
	public void OrderConformationPage_FieldValidations() throws IOException, InterruptedException {
		TestDescription("OrderConformationPage_FieldValidations_01",
				"To verify guest user able to view all the fields in the order confirmation page");
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
		shippingPage.GuestShippingAddress();
		shippingPage.UseEnteredAddress();
		billingPage.BillingFieldValidation();
	}
	
	@Test
	public void OrderConformationPage_FieldValidations_Reg() throws IOException, InterruptedException {
		TestDescription("OrderConformationPage_FieldValidations_02",
				"To verify registered user able to view all the fields in the order confirmation page");
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
		shippingPage.GuestShippingAddress();
		shippingPage.UseEnteredAddress();
		billingPage.BillingFieldValidation();
	}
	
	
}
