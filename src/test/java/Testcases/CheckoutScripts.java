package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class CheckoutScripts extends BaseTest {
	
	

	@Test	
	public void Guest_SearchCheckout_001() throws IOException, InterruptedException {		
		TestDescription("Guest_SearchCheckout_001" , "To verify guest user able to place order using search items");
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

	}
	
	@Test	
	public void Registered_SearchCheckout_002() throws IOException, InterruptedException {		
		TestDescription("Registered_SearchCheckout_002" , "To verify registered user able to place order using search items");
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
			//shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();
	}
	
	@Test	(priority=1)
	public void Bopis_SearchCheckout_003() throws IOException, InterruptedException {		
		TestDescription("Bopis_SearchCheckout_003" , "To verify user able to place order using bopis");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			logs("User signed In using valid credentials");
			List<String> SearchTermData = getColumnData("Search","SearchSKU");
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
	

	@Test
	public void Guest_signupPostCheckout_004() throws IOException, InterruptedException {		
		TestDescription("Guest_signupPostCheckout_004" , "To verify the guest user is able to sign up for an account from the order confirmation Page");
			AddScreenshot();
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
			String GuestEmail = shippingPage.GuestShippingAddress();
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();
			billingPage.orderConf_guest_PasswordField.sendKeys("P@ssw0rd");
			billingPage.orderConf_guest_completeRegistration.click();
			WaitUntilElementVisible(myaccountPage.currentPageBreadcrumb);
			Assert.assertTrue(myaccountPage.personal_info_email_value.getText().equals(GuestEmail));
			AddScreenshot();
			logs("Guest user is successfully be able to sign up for an account from Order Confirmation Page");

			
	}
	
	
	
	
	@Test
	public void Guest_signupPostCheckout_005() throws IOException, InterruptedException {		
		TestDescription("Guest_signupPostCheckout_005" , "To verify if the guest user is restrcited to create an account if the email address used in checkout is already registered");
			AddScreenshot();
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
			String GuestEmail = shippingPage.GuestShippingAddress_existingEmail();
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();
			billingPage.orderConf_guest_PasswordField.sendKeys("P@ssw0rd");
			billingPage.orderConf_guest_completeRegistration.click();
			registerationPage.selectUserRegisteration();
			WaitUntilElementVisible(registerationPage.regErrorMsg_existingEmail);
			Assert.assertTrue(registerationPage.regErrorMsg_existingEmail.getText().contains("Error: The logon ID you entered already exists. Type a different logon ID and try again."));
			AddScreenshot();
			logs("Guest user is restricted to sign up for an account from Order Confirmation Page when they use the existing email address for checkout");

			
	}
	
	
	
	
	@Test
	public void Guest_signupPostCheckout_006() throws IOException, InterruptedException {		
		TestDescription("Guest_signupPostCheckout_006" , "To verify if the guest user is restrcited to create an account if the email address used in checkout is already registered");
			AddScreenshot();
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
			String GuestEmail = shippingPage.GuestShippingAddress();
			shippingPage.UseEnteredAddress();
			billingPage.VisaPayment();
			billingPage.PlaceOrder();
			billingPage.orderConf_guest_PasswordField.sendKeys("abcde");
			billingPage.orderConf_guest_completeRegistration.click();
			registerationPage.selectUserRegisteration();
			WaitUntilElementVisible(registerationPage.regErrorMsg_existingEmail);
			Assert.assertTrue(registerationPage.regErrorMsg_existingEmail.getText().toString().trim().contains("Error: You entered a password with fewer than 6 characters."));
			AddScreenshot();
			logs("Guest user is restricted to sign up for an account from Order Confirmation Page when they use the Password that doesn't meet the password rules");

			
	}
	
	
	
	

}
