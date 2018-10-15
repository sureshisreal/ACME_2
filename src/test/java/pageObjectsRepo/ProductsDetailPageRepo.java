package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsDetailPageRepo {
	
	@FindBy( className = "quantity_input")
	public  WebElement quantity;
	
	@FindBy( id = "productPageAdd2Cart")
	public  WebElement AddToProductButton;
	
	
	@FindBy( id = "minishopcart_total")
	public  WebElement minishopcart_total;
	
	@FindBy( id = "cart_text")
	public  WebElement cart_text;
	
	@FindBy( id = "GotoCartButton2")
	public  WebElement GotoCartButton;
	
	

}
