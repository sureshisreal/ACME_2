package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class CheckoutScripts extends BaseTest {

	@Test	
	public void Guest_SearchCheckout() throws IOException, InterruptedException {		
		TestDescription("Guest_SearchCheckout" , "To verify guest user able to place order using search items");
			logs("Url entered");
			AddScreenshot(); 
			logs("Page title verified");
			List<String> SearchTermData = getColumnData("suresh","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.searchTerm(SearchTerm);
			logs("Search term entered");
			AddScreenshot();		
			categorypage.verifySearchHeader(SearchTerm);
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			productsDetailPage.quantity("5");
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddToCart();
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
	
	@Test	
	public void Registered_SearchCheckout() throws IOException, InterruptedException {		
		TestDescription("Registered_SearchCheckout" , "To verify registered user able to place order using search items");
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
			productsDetailPage.quantity("5");
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddToCart();
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
	
	
	
	/*
	 * Bopis Checkout
	 */
	/*@Test	
	public void Bopis_SearchCheckout() throws IOException, InterruptedException {		
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
	}*/
	


}
