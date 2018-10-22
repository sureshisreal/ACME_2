package Reusables;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions extends ProductsDetailPageRepo {

	public void quantity(String qty) throws InterruptedException {
		WaitUntilElementClickable(quantity);
		quantity.clear();
		quantity.sendKeys(qty);
	}

	public void AddToCart() throws InterruptedException {
		WaitUntilElementClickable(AddToProductButton);
		AddToProductButton.click();

	}

	public  void minishopcart_total() throws InterruptedException {
		System.out.println("In minishopcart_total method ");
		WaitUntilElementClickable(cart_text);
		cart_text.click();
		WaitUntilElementClickable(GotoCartButton);
		GotoCartButton.click();
	}

	public void AddBopisProduct() {
		productPagePickUpTodayButton.click();
	}
	

}
