package Reusables;

import pageObjectsRepo.ShoppingCartPageRepo;

public class ShoppingCartPageActions extends ShoppingCartPageRepo {

	public void guestCheckout() throws InterruptedException {
		//WaitForElementLoad(guestShopperContinue);
		guestShopperContinue.click();
		
	}

	

}
