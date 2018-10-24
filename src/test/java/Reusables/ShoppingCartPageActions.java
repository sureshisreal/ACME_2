package Reusables;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ShoppingCartPageRepo;

public class ShoppingCartPageActions extends ShoppingCartPageRepo {

	public ShoppingCartPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void guestCheckout() throws InterruptedException, IOException {
		WaitUntilElementVisible(guestShopperContinue);
		AddScreenshot();
		guestShopperContinue.click();
		logs("Guest Checkout button clicked in the shoppingCart Page");

	}

	

}
