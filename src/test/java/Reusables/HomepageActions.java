package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public HomepageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm) throws IOException {
		searchTextbox.sendKeys(SearchTerm);
		searchSubmit.click();
		WaitUntilElementVisible(SearchHeader_Verify);
		Assert.assertEquals(SearchHeader_Verify.getText(),SearchTerm);
		AddScreenshot();
		logs("Search Term entered and verified");
	}

	public void SignInLink()  {
		WaitUntilElementVisible(SignInRegister_Link);
		SignInRegister_Link.click();
		logs("SignInRegister_Link clicked");
	}

	public void VerifyPageTitle() throws IOException {
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),
				"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
		logs("Page title verified : " + title);
		AddScreenshot();
	}

	public void returnhomepage() {
		AcmeLogo.click();		
	}

	public void HeaderValidations() {
		WaitUntilElementClickable(freeShip_Banner);
		ElementPresent(freeShip_Banner);
		freeShip_Banner.click();
		driver.switchTo().activeElement();	
		assertTrue(freeShip_Modal_Overlay.getText().contains("FREE Ground "));
		freeShip_Modal_Overlay_Close.click();
		assertTrue(welcome_Banner.getText().contains("Welcome to AcmeTools"));
	}

	public void MenuValidations() throws IOException {
		WaitUntilElementVisible(OrderStatus_Link);
		OrderStatus_Link.click();
		ElementPresent(OrderStatus_Header);
		logs("Order Status Link Verified");
		customerServiceQuick_Link.click();
		ElementPresent(CustomerService_Header);
		logs("Customer Service Link Verified");
		storeLocatorQuick_Link.click();
		ElementPresent(StoreLocation_Header);
		logs("StoreLocation Link Verified");
		requestQuoteQuick_Link.click();
		ElementPresent(RequestQuote_Header);
		logs("Request Quote Link Verified");
		MiniShoppingCart.click();
		WaitUntilElementClickable(MiniShoppingCart_EmptyText);
		System.out.println("MiniShoppingCart_EmptyText.getText() " +MiniShoppingCart_EmptyText.getText());
		assertTrue(MiniShoppingCart_EmptyText.getText().contains("Your cart is empty"));
		MiniShoppingCart_close.click();
	}

	

}
