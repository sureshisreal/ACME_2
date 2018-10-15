package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPageRepo {
	
	@FindBy( xpath = "(.//*[@id='guestShopperContinue'])[1]")
	public  WebElement guestShopperContinue;

}
