package Reusables;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions extends ProductsDetailPageRepo {

	public void quantity(String qty) throws InterruptedException {
		Thread.sleep(2000);
		quantity.clear();
		quantity.sendKeys(qty);
	}

	public void AddToCart() throws InterruptedException {
		Thread.sleep(2000);
		AddToProductButton.click();
	}

	public  void minishopcart_total() {
		System.out.println("In minishopcart_total method ");
		cart_text.click();
		GotoCartButton.click();
	}

	public void AddBopisProduct() {
		productPagePickUpTodayButton.click();
	}
	

}
