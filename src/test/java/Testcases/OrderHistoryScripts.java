package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BaseTest;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;


public class OrderHistoryScripts extends BaseTest{
	
	
	
	@Test
	public void reg_OrderDetails_UIValidation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_001", "To verify the UI of the Registered user's order details Page");
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
		//shippingPage.UseEnteredAddress();
		billingPage.VisaPayment();
		billingPage.PlaceOrder();
		homepage.MyAccount_Link.click();
		myaccountPage.recent_OrderHistory_DetailsLink.click();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().trim().equals("Order Details"));
		logs("Sucessfully Navigated to OrderDetails Page");
		orderHistoryPage.orderDetails_reg_UIValidation();
	}
	
	
	
	@Test
	public void reg_OrderHistory_PageNavigation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_002", "To verify if the user is navigated to Order History page on clicking the order history link in the My Account Left Naviagation");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_orders_orderHistory.click();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().trim().equals("Order History"));
		logs("User is Navigated to the ORder History Page");
		orderHistoryPage.oh_UIvalidation();

	
	}
	
	
	
	@Test
	public void guest_OrderStatus_UIValidation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_003", "To verify the UI Page elements of the Order Status Page as the guest user");
		homepage.OrderStatus_Link.click();
		orderHistoryPage.guest_orderStatus_UIValidation();
		
		
		
	}
	
	
	
	@Test
	public void guest_OrderStatus_loginValidation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_004", "To verify if the user is able to login from the Order Status Page as the guest user");
		homepage.OrderStatus_Link.click();
		orderHistoryPage.loginfromOrderStatus();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().trim().equals("Order History"));
		AddScreenshot();
		logs("Login from Order Status Page is Success");
		
	}
	

	
	@Test
	public void guest_OrderStatus_invalidOrderNum_validation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_005", "To verify if the error message is displayed while entering the invalid order number or zipcode in the guest order status page");
		homepage.OrderStatus_Link.click();
		orderHistoryPage.invalidOrderDetailsCheck();
	
	}
	
	
	@Test
	public void guest_OrderStatus_OrderDetailsNavigation() throws IOException, InterruptedException {
		
		TestDescription("OrderHistory_006", "To verify if the user is navigated to the order Details page on entering the valid order Number and zipcode");
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
		AddScreenshot();
		String OrdNum = billingPage.OrderNumber_Text.getText().toString().trim();
		String ZipCode = "10007";
		System.out.println("Order number = " + OrdNum);
		//Zipcode value is taken from the ShippingPageActions GuestShippingAddress method
		homepage.OrderStatus_Link.click();
		orderHistoryPage.guest_ordStatus_OrderDetailsNavigation(OrdNum, ZipCode);
		AddScreenshot();
		orderHistoryPage.guest_orderDetailsPage_UIValidation();

	}
	
	
	
	
	
	
	
	
	

}
