package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class ShoppingCartPageRepo extends BaseTest {
	
	@FindBy( xpath = "(.//*[@id='guestShopperContinue'])[1]")
	public  WebElement guestShopperContinue;

}
