package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class BuyerAndOrganization extends BaseTest {
	
	@Test	
	public void Bopis_SearchCheckout() throws IOException, InterruptedException {		
		TestDescription("Bopis_SearchCheckout" , "To verify user able to place order using bopis");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			shoppingCartPage.CartIconCount();
			logs("User signed In using valid credentials");
			List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.searchTerm(SearchTerm);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			List<String> BopisStateData = getColumnData("Search","Bopis");
			String BopisState = BopisStateData.get(0);
			js.executeScript("document.cookie='currentZipcode="+BopisState+"';");
			driver.navigate().refresh();
			Thread.sleep(5000);
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
	


	@Test	
	public void Bopis_SearchCheckout_Registered() throws IOException, InterruptedException {		
		TestDescription("Bopis_SearchCheckout" , "To verify user able to place order using bopis");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			shoppingCartPage.CartIconCount();
			logs("User signed In using valid credentials");
			List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.searchTerm(SearchTerm);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			//String BopisState = "58102";
			List<String> BopisStateData = getColumnData("Search","Bopis");
			String BopisState = BopisStateData.get(0);
			js.executeScript("document.cookie='currentZipcode="+BopisState+"';");
			driver.navigate().refresh();
			Thread.sleep(5000);
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
	
	
	@Test	
	public void Bopis_CategoryCheckout() throws IOException, InterruptedException {		
		TestDescription("Bopis_CategoryCheckout" , "To verify user able to place order using bopis from the category menu");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			shoppingCartPage.CartIconCount();
			logs("User signed In using valid credentials");
			/*List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			//homepage.searchTerm(SearchTerm);*/
			homepage.CategoryMenuSelection();
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			//String BopisState = "58102";
			List<String> BopisStateData = getColumnData("Search","Bopis");
			String BopisState = BopisStateData.get(0);
			js.executeScript("document.cookie='currentZipcode="+BopisState+"';");
			driver.navigate().refresh();
			Thread.sleep(5000);
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
	


	@Test	
	public void Bopis_CategoryCheckout_Registered() throws IOException, InterruptedException {		
		TestDescription("Bopis_CategoryCheckout_Registered" , "To verify user able to place order using bopis");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			shoppingCartPage.CartIconCount();
			logs("User signed In using valid credentials");
			/*List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.searchTerm(SearchTerm);*/
			homepage.CategoryMenuSelection();
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			//String BopisState = "58102";
			List<String> BopisStateData = getColumnData("Search","Bopis");
			String BopisState = BopisStateData.get(0);
			js.executeScript("document.cookie='currentZipcode="+BopisState+"';");
			driver.navigate().refresh();
			Thread.sleep(5000);
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
