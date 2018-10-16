package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest {
	

	@Test	
	public void Guest_SearchCheckout() throws IOException, InterruptedException {		
		TestDescription("Guest_SearchCheckout" , "To verify guest user able to place order using search items");
			logs("Url entered");
			AddScreenshot();
			logs("Page title verified");
			homepage.searchTerm();
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectProduct();
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
			homepage.searchTerm();
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectProduct();
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


}
