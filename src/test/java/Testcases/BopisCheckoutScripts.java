package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class BopisCheckoutScripts extends BaseTest {
	
	@Test	
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
	}
	


}
