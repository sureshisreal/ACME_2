package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class OrderHistoryPageRepo extends BaseTest {
	
	public OrderHistoryPageRepo(WebDriver driver) {
	    this.driver = driver;
	}
	
	//Registered user Order Details Page objects 

	//od indicates 'order details'
	
	//Main Headings
	
	@FindBy(xpath = "//h1[contains(text(),'Order Details')]")
	public WebElement od_header;
	
	@FindBy(xpath = "//div[@class='orderConfirm']//span[contains(text(),'Order Number')]")
	public WebElement od_ordNumLabel;
	
	@FindBy(xpath = "//div[@class='orderConfirm']//span[contains(text(),'Order Date')]")
	public WebElement od_ordDateLabel;
	
	@FindBy(xpath = "//div[@class='orderConfirm']//h2[contains(text(),'Shipping Information')]")
	public WebElement od_ShipInfoHeader;
	
	@FindBy(xpath = "//div[@class='orderConfirm']//h2[contains(text(),'Billing Information')]")
	public WebElement od_BillInfoHeader;
	
	@FindBy(xpath = "//div[contains(text(),'Print')]")
	public WebElement od_printCTA;
	
	@FindBy(xpath = "//div[contains(text(),'We recommend you print this page')]")
	public WebElement od_printCTA_hint;
	
	
	
	
	


}
