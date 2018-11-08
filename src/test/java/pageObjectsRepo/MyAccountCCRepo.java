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
	
	
	
	@FindBy(xpath = "//td[contains(text(),'VISA Credit Card')]")
	public WebElement mcc_payMethod_visaOpt;
	
	@FindBy(xpath = "//td[contains(text(),'MasterCard Credit Card')]")
	public WebElement mcc_payMethod_masterOpt;
	
	
	@FindBy(xpath = "//td[contains(text(),'American Express Credit Card')]")
	public WebElement mcc_payMethod_AmexOpt;
	
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
	
	@FindBy(xpath = "//td[contains(text(),'09')]")
	public WebElement mcc_expMonthValue;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Year')]")
	public WebElement mcc_expYearLabel;
	
	
	@FindBy(xpath = "//td[contains(text(),'2020')]")
	public WebElement mcc_expYearValue;
	
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
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//h1[contains(text(),'Shipping Address')]")
	public WebElement mcc_shippingAddressHeader;
	
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//input[@id='SameShippingAndBillingAddress']")
	public WebElement mcc_ship_sameAsShippingChkbox;
	
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//span[contains(text(),'Same as my shipping address')]")
	public WebElement mcc_ship_sameAsShippingLabel;
	
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'First name')]")
	public WebElement mcc_ship_fnameLabel;
	
	@FindBy(name = "shipping_firstName")
	public WebElement mcc_ship_fnameField;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'Last name')]")
	public WebElement mcc_ship_lnameLabel;
	
	@FindBy(name = "shipping_lastName")
	public WebElement mcc_ship_lnameField;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'Street address 1')]")
	public WebElement mcc_ship_addr1Label;
	
	@FindBy(name = "shipping_address1")
	public WebElement mcc_ship_addr1Field;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'Street address 2')]")
	public WebElement mcc_ship_addr2Label;
	
	@FindBy(name = "shipping_address2")
	public WebElement mcc_ship_addr2Field;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'City')]")
	public WebElement mcc_ship_cityLabel;
	
	@FindBy(name = "shipping_city")
	public WebElement mcc_ship_cityField;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'State')]")
	public WebElement mcc_ship_stateLabel;
	
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'ZIP code')]")
	public WebElement mcc_ship_zipCodeLabel;
	
	@FindBy(name = "shipping_zipCode")
	public WebElement mcc_ship_zipCodeField;
	
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'Email')]")
	public WebElement mcc_ship_emailLabel;
	
	@FindBy(name = "shipping_email1")
	public WebElement mcc_ship_emailField;
	
	@FindBy(xpath = "//div[@id='my_account_shipping']//label[contains(text(),'Phone number')]")
	public WebElement mcc_ship_phNumLabel;
	
	@FindBy(name = "shipping_phone1")
	public WebElement mcc_ship_phNumField;
	
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	public WebElement mcc_updateCTA;
	

	
	
	
	
	
	
	
	
	

	
	

	


}
