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
	
	// Registered user Order History Page Elements
	
	//'oh' indicates 'Order History'
	
	@FindBy(xpath = "//div[@class='my_account']//h1[contains(text(),'Order History')]")
	public WebElement oh_header;
	

	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Order Number')]")
	public WebElement oh_orderNumber;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Order Date')]")
	public WebElement oh_orderDate;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Purchase Order')]")
	public WebElement oh_PurchaseOrder;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Status')]")
	public WebElement oh_Status;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Total Price')]")
	public WebElement oh_TotalPrice;

	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//tr[@class='ul row']")
	public WebElement oh_ordersListSection;
	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//div[contains(text(),'Re-Order')]")
	public WebElement oh_Reorder_CTA;
	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//a[contains(text(),'Details')]")
	public WebElement oh_DetailsLink;
	
	//Guest Order Status Page Elements 
	
	//'os' indicates 'order status'
	
	@FindBy(xpath ="//h1[contains(text(),'Order Status')]")
	public WebElement os_header;
	
	
	@FindBy(xpath ="//div[@class='members bordered']//h1[contains(text(),'Members')]")
	public WebElement os_membersHeader;
	
	@FindBy(xpath ="//div[@class='members bordered']//label[contains(text(),'Logon ID')]")
	public WebElement os_logonIDLabel;
	
	@FindBy(name ="logonId")
	public WebElement os_logonIDField;
	
	@FindBy(xpath ="//div[@class='members bordered']//label[contains(text(),'Password')]") 	
	public WebElement os_passwordLabel;
	
	@FindBy(name ="logonPassword")
	public WebElement os_passwordField;
	
	@FindBy(xpath ="//div[@class='members bordered']//a[contains(text(),'Forgot your password')]")	
	public WebElement os_forgotYourPasswordLink;
	
	@FindBy(xpath ="//div[@class='members bordered']//a[contains(text(),'Sign In')]") 	
	public WebElement os_signIn_CTA;
	
	
	@FindBy(xpath ="//div[@class='guests bordered']//h1[contains(text(),'Guests')]") 	
	public WebElement os_guestHeader;
	
	@FindBy(xpath ="//div[@class='guests bordered']//label[contains(text(),'Order Number')]") 	
	public WebElement os_orderNumLabel;
	
	
	@FindBy(name = "orderNumber")
	public WebElement os_ordNumField;
	
	@FindBy(xpath ="//div[@class='guests bordered']//label[contains(text(),'Bill-To Zip Code')]") 	
	public WebElement os_billZipcodeLabel;
	
	
	@FindBy(name ="billtoZip")
	public WebElement os_billZipcodeField;
	
	@FindBy(xpath ="//div[@class='guests bordered']//a[contains(text(),'Find Order')]") 	
	public WebElement os_findOrderCTA;
	
	
	
	


}
