package Reusables;

import pageObjectsRepo.ShoppingCartPageRepo;

public class ShoppingCartPageActions extends ShoppingCartPageRepo {

	public void guestCheckout() throws InterruptedException {
		Thread.sleep(1000);
		guestShopperContinue.click();
		
	}

	

}
