package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class PurcahseOrder extends BaseTest {
	
	

	@Test	
	public void PurcahseOrder_Checkout_001() throws IOException, InterruptedException {		
		TestDescription("PurcahseOrder_Checkout_001" , "To verify user able to place order using Credit pay");
			List<String> SearchTermData = getColumnData("Search","SearchSKU");
			String SearchTerm = SearchTermData.get(0);
			homepage.VerifyPageTitle();
			homepage.SignInLink();
			registerationPage.PO_Login();
			homepage.searchTerm(SearchTerm);
			categorypage.verifySearchHeader(SearchTerm);
			categorypage.selectFirstProduct();
			productsDetailPage.quantity("5");
			productsDetailPage.AddToCart();
			productsDetailPage.minishopcart_total();
			shoppingCartPage.guestCheckout();
			shippingPage.GuestShippingAddress();
			shippingPage.UseEnteredAddress();
			billingPage.po_number();
			billingPage.PlaceOrder();

	}

}
