package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.google.common.base.Predicate;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public HomepageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm) {
		searchTextbox.sendKeys(SearchTerm);
		searchSubmit.click();
	}

	public void SignInLink()  {
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
