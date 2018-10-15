package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomepageScripts extends BaseTest {
	String screenShot;

	@Test
	public void Guest_SearchCheckout() throws IOException, InterruptedException {
			extentTest = extent.createTest("SearchProduct" , "To verify guest user able to place order using search items");
			extentTest.log(Status.PASS, "SearchProduct");
			screenShot = captureScreen(driver, "suresh");
			extentTest.pass("Screen Shot : " + extentTest.addScreenCaptureFromPath(screenShot));
			homepage.searchTerm();
			extentTest.log(Status.PASS, "Search term entered");
			String screenShot1 = captureScreen(driver, "suresh1");
			extentTest.pass("Screen Shot : " + extentTest.addScreenCaptureFromPath(screenShot1));
			categorypage.selectProduct();
			extentTest.log(Status.PASS, "Product Selected in the CLP");
			productsDetailPage.quantity("5");
			extentTest.log(Status.PASS, "Qty increased in PDP");
			productsDetailPage.AddToCart();
			extentTest.log(Status.PASS, "Product added to the cart");
			productsDetailPage.minishopcart_total();
			shoppingCartPage.guestCheckout();
			shippingPage.GuestShippingAddress();
	}
	
	@Test
	public void Reg_SearchCheckout() throws InterruptedException {
		extentTest = extent.createTest("SearchProduct_second" , "To verify registered user able to place order using search items");
		extentTest.log(Status.PASS, "SearchProduct");
		System.out.println("********");
		homepage.searchTerm();
		extentTest.log(Status.PASS, "Search term entered");
		categorypage.selectProduct();
		extentTest.log(Status.PASS, "Search term entered");
		productsDetailPage.quantity("5");
		extentTest.log(Status.PASS, "Search term entered");
		productsDetailPage.AddToCart();
		extentTest.log(Status.PASS, "Search term entered"); 
	}
}
