package Reusables;

import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	public void selectProduct() throws InterruptedException {
		Thread.sleep(3000);
		FirstProduct.click();
	}

	
	

}
