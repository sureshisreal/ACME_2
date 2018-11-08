package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class OrderConfirmationPageRepo extends BaseTest{
	
	public OrderConfirmationPageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_firstName")
	public  WebElement Shipping_firstName;

}
