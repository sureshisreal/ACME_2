package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class CheckoutScripts extends BaseTest {
/*
	@Test	
	public void Guest_SearchCheckout_001() throws IOException, InterruptedException {		
		TestDescription("Guest_SearchCheckout" , "To verify guest user able to place order using search items");
			List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.searchTerm(SearchTerm);
			categorypage.verifySearchHeader(SearchTerm);
			categorypage.selectFirstProduct();
			productsDetailPage.quantity("5");
			productsDetailPage.AddToCart();
			productsDetailPage.minishopcart_total();
			shoppingCartPage.guestCheckout();
			shippingPage.GuestShippingAddress();
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();

	}*/
		
	@Test	
	public void Registered_SearchCheckout_002() throws IOException, InterruptedException {		
		TestDescription("Registered_SearchCheckout" , "To verify registered user able to place order using search items");
				List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			homepage.searchTerm(SearchTerm);
			categorypage.verifySearchHeader(SearchTerm);
			categorypage.selectFirstProduct();
			productsDetailPage.quantity("5");
			productsDetailPage.AddToCart();
			productsDetailPage.minishopcart_total();
			shoppingCartPage.RegCheckout();
			shippingPage.GuestShippingAddress();
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();
	}
	
	/*@Test	
	public void Bopis_SearchCheckout_003() throws IOException, InterruptedException {		
		TestDescription("Bopis_SearchCheckout" , "To verify user able to place order using bopis");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			logs("User signed In using valid credentials");
			List<String> SearchTermData = getColumnData("suresh","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.searchTerm(SearchTerm);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			String BopisState = "58102";
			js.executeScript("document.cookie='currentZipcode="+BopisState+"';");
			driver.navigate().refresh();
			Thread.sleep(1000);
			productsDetailPage.quantity("5");
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddBopisProduct();
			logs("Product added to the cart");
			productsDetailPage.minishopcart_total();
			logs("MiniCart Clicked");
			shoppingCartPage.guestCheckout();
			logs("Guest Checkout button clicked in the shoppingCart Page");
			AddScreenshot();
			shippingPage.GuestShippingAddress();
			logs("Shipping address entered");
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			logs("Visa payment entered");
			billingPage.PlaceOrder();
			logs("Ordered Placed");
	}
	
*/

}
