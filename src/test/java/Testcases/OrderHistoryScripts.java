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
				shippingPage.GuestShippingAddress();
		shippingPage.UseEnteredAddress();
		billingPage.VisaPayment();
		billingPage.PlaceOrder();
		homepage.myAccount_Link.click();
		myaccountPage.recent_OrderHistory_DetailsLink.click();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().trim().equals("Order Details"));
		logs("Sucessfully Navigated to OrderDetails Page");
		orderHistoryPage.orderDetails_reg_UIValidation();

	}
	
	
	

}
