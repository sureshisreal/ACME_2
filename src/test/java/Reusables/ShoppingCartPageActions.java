package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ShoppingCartPageRepo;

public class ShoppingCartPageActions extends ShoppingCartPageRepo {

	public ShoppingCartPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void guestCheckout() throws InterruptedException {
		//WaitForElementLoad(guestShopperContinue);
		guestShopperContinue.click();
		
	}

	

}
