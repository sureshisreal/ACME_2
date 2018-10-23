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
