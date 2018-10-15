package Reusables;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	WebDriver driver;


	public void selectProduct() throws InterruptedException {
		Thread.sleep(3000);
		FirstProduct.click();

	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
