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

	public  void minishopcart_total() throws InterruptedException {
		System.out.println("In minishopcart_total method ");
		Thread.sleep(3000);
		//int cartsize = Integer.parseInt(ProductsDetailPageRepo.minishopcart_total.getText());
//		String cartsize = ProductsDetailPageRepo.minishopcart_total.getText();
//		int cartsizecount = Integer.parseInt(cartsize);
//		System.out.println("Current cartsize is :" +cartsizecount);
//		if (cartsizecount == 5) {
//			System.out.println("valid");
//		}
		cart_text.click();
		Thread.sleep(1000);
		GotoCartButton.click();
		
	}

}
