package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions extends ProductsDetailPageRepo {

	public ProductsDetailPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void quantity(String qty) throws InterruptedException {
		quantity.clear();
		quantity.sendKeys(qty);
		logs("Quantity Increased in the pdp");
	}

	public void AddToCart() throws InterruptedException {
		WaitUntilElementClickable(AddToProductButton);
		AddToProductButton.click();
		logs("Product added to the cart");
	}

	public  void minishopcart_total() throws InterruptedException {
		Thread.sleep(2000);
		WaitUntilElementClickable(cart_text);
		cart_text.click();
		WaitUntilElementClickable(GotoCartButton);
		GotoCartButton.click();
		logs("MiniCart go Button Clicked");
	}

	public void AddBopisProduct() {
		productPagePickUpTodayButton.click();
	}


}
