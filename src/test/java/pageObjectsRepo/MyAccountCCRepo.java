package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;


public class MyAccountCCRepo  extends BaseTest {
	
	public MyAccountCCRepo(WebDriver driver) {
	    this.driver = driver;
	}
	
	//My Credit card page elements and 'mcc' indicates 'My Credit Card'
	

	@FindBy(xpath = "//div[@class='my_account']//h2[contains(text(),'My Credit Card')]")
	public WebElement mcc_header;
	
	
	@FindBy(xpath = "//div[@class='my_account']//h1[contains(text(),'Payment Method')]")
	public WebElement mcc_subHeader;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Type of Payment')]")
	public WebElement mcc_pyamentType_label;
	
	@FindBy(xpath = "//div[@class='my_account']//table[@id='payMethodId']")
	public WebElement mcc_paymentTypeDropdown;
	
	@FindBy(xpath = "//div[@class='my_account']//li[contains(text(),'You can store one credit card with your Acme Tools.com account for faster checkout. You will be required to enter your 3-4 digit security code during checkout.')]")
	public WebElement mcc_paymentType_tc;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Card number')]")
	public WebElement mcc_cardNumLabel;
	
	@FindBy(name = "pay_temp_account")
	public WebElement mcc_cardNumField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Month')]")
	public WebElement mcc_expMonthLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//table[@id='pay_expire_month']")
	public WebElement mcc_expMonthDropdown;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Year')]")
	public WebElement mcc_expYearLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//table[@id='pay_expire_year']")
	public WebElement mcc_expYearDropDown;

	//Billing Address Text Fields
	
	@FindBy(xpath = "//div[@id='my_account_billing']//h1[contains(text(),'Billing Address')]")
	public WebElement mcc_billingAddressHeader;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'First name')]")
	public WebElement mcc_bill_fnameLabel;
	
	@FindBy(name = "billing_firstName")
	public WebElement mcc_bill_fnameField;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'Last name')]")
	public WebElement mcc_bill_lnameLabel;
	
	@FindBy(name = "billing_lastName")
	public WebElement mcc_bill_lnameField;
	
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'Street address 1')]")
	public WebElement mcc_bill_addr1Label;
	
	@FindBy(name = "billing_address1")
	public WebElement mcc_bill_addr1Field;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'Street address 2')]")
	public WebElement mcc_bill_addr2Label;
	
	@FindBy(name = "billing_address2")
	public WebElement mcc_bill_addr2Field;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'City')]")
	public WebElement mcc_bill_cityLabel;
	
	@FindBy(name = "billing_city")
	public WebElement mcc_bill_cityField;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'State')]")
	public WebElement mcc_bill_stateLabel;
	
	
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'ZIP code')]")
	public WebElement mcc_bill_zipCodeLabel;
	
	@FindBy(name = "billing_zipCode")
	public WebElement mcc_bill_zipCodeField;
	
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'Email')]")
	public WebElement mcc_bill_emailLabel;
	
	@FindBy(name = "billing_email1")
	public WebElement mcc_bill_emailField;
	
	@FindBy(xpath = "//div[@id='my_account_billing']//label[contains(text(),'Phone number')]")
	public WebElement mcc_bill_phNumLabel;
	
	@FindBy(name = "billing_phone1")
	public WebElement mcc_bill_phNumField;
	
	//Shipping Address Section Field Web elements
	
	
	
	
	
	
	
	
	
	
	

	
	

	


}
