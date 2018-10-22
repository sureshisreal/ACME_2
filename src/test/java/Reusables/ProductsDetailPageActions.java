package Reusables;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions extends ProductsDetailPageRepo {

	public void quantity(String qty) throws InterruptedException {
		WaitForElementLoad(quantity);
		quantity.clear();
		quantity.sendKeys(qty);
	}

	public void AddToCart() throws InterruptedException {
		WaitForElementLoad(AddToProductButton);
		AddToProductButton.click();
	}

	public  void minishopcart_total() throws InterruptedException {
		System.out.println("In minishopcart_total method ");
		WaitForElementLoad(cart_text);
		cart_text.click();
		Thread.sleep(1000);
		GotoCartButton.click();
	}

	public void AddBopisProduct() {
		productPagePickUpTodayButton.click();
	}
	

}
