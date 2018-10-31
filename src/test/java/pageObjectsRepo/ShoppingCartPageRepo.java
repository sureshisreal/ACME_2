package pageObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class ShoppingCartPageRepo extends BaseTest {
	
	public ShoppingCartPageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy( xpath = "(.//*[@id='guestShopperContinue'])[1]")
	public  WebElement guestShopperContinue;
	
	@FindBy( xpath = "(.//*[@id='guestShopperContinue'])[2]")
	public  WebElement guestShopperContinue_footer;
	
	@FindBy( className = "headingtext")
	public  WebElement shoppingCart_Heading;
	
	@FindBy( className = "skuNo")
	public  WebElement Sku_label;
	
	@FindBy( css = ".remove_address_link")
	public  List<WebElement> Remove_link;
	
	public WebElement RemoveAllProducts_link(int i) {
	 return driver.findElement(By.xpath("(//a[contains(.,'Remove')])["+i+"]"));
	    }
	
	@FindBy( className = "avail-info")
	public  WebElement ProductAvailablility_Status;
	
	@FindBy( name = "qty_1")
	public  WebElement Quatity_Textbox;
	
	@FindBy( className = "price")
	public  WebElement Product_Price;
	
	@FindBy( xpath = ".//*[@class='header-bar'][contains(.,'Promotional')]")
	public  WebElement Promocode_Textbox;
	
	@FindBy( id = "total_breakdown")
	public  WebElement product_overallTotal;
	
	@FindBy( name = "logonId")
	public  WebElement returning_customerId;
	
	@FindBy( name = "logonPassword")
	public  WebElement returning_customerpassword;
	
	@FindBy( className = "forgotpwd")
	public  WebElement forgotpassword_link;
	
	@FindBy( id = "guestShopperLogon")
	public  WebElement signInCheckout_button;
	
	@FindBy( xpath = "(.//*[@id='WC_ExpressCheckoutButton_payPal'])[1]")
	public  WebElement paypalcheckout_button;
	
	@FindBy( id = "footer")
	public  WebElement footer;
	
	@FindBy( xpath = ".//*[@class='shopping_cart_box currentOrder']")
	public  WebElement EmptyCart;
	
	
	

	
	
	

}
