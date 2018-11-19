package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class BillingPageRepo extends BaseTest {
	
	public BillingPageRepo(WebDriver driver) {
	    this.driver = driver;
	}

	@FindBy( id = "WC_PaymentEntry_account")
	public  WebElement CardNumber_Textbox;
	
	
	@FindBy( xpath = "//form[@id='paymentForm1']//input[@name='savedAccount']")
	public  WebElement CardNumber_textboxWithValue;
	
	
	@FindBy( id = "WC_PaymentEntry_cc_cvc")
	public  WebElement CvvTextbox;
	
	@FindBy( id = "month")
	public  WebElement Billing_month;
	
	@FindBy( id = "year")
	public  WebElement Billing_year;
	
	@FindBy( xpath = ".//*[@id='WC_CheckoutButton_2'][contains(.,'Place Order')]")
	public  WebElement PlaceOrder_Button;
	
	@FindBy( id = "WC_OrderShippingBillingConfirmationPage_span_1")
	public  WebElement OrderNumber_Text;
	
	@FindBy( id = "orderDateParagraph")
	public  WebElement OrderDate_Text;
	
	@FindBy(xpath = "//*[@name='expire_month']//option[@selected='selected']")
	public WebElement selectedMonth;
	
	@FindBy(xpath = "//*[@name='expire_year']//option[@selected='selected']")
	public WebElement selectedYear;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='billingSameAsShippingCheckbox']")
	public WebElement billing_billingSameasShipping;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='firstName']")
	public WebElement billing_firstName;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='lastName']")
	public WebElement billing_lastName;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='address1']")
	public WebElement billing_address1;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='organizationName']")
	public WebElement billing_company;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='zipCode']")
	public WebElement billing_zipCode;
	
	@FindBy(xpath = "//div[@id='billing']//input[@name='saveCCToAccount']")
	public WebElement billing_saveToMyAccount;
	
	
	


}
