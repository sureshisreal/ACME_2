package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class ShippingPageRepo extends BaseTest{
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_firstName")
	public  WebElement Shipping_firstName;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_lastName")
	public  WebElement Shipping_lastName;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_address1")
	public  WebElement Shipping_address1;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_organizationName")
	public  WebElement Shipping_organizationName;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_zipCode")
	public  WebElement Shipping_zipCode;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_city")
	public  WebElement Shipping_city;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_stateName")
	public  WebElement Shipping_state;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_phone1")
	public  WebElement Shipping_phone;
	
	@FindBy( id = "WC_shippingAddressCreateEditFormDiv_email1")
	public  WebElement Shipping_email1;
	
	@FindBy( id = "occupation")
	public  WebElement Shipping_occupation;
	
	@FindBy( xpath = ".//*[@id='WC_CheckoutButton_2'][contains(.,'Place Order')]")
	public  WebElement PlaceOrder_Button;
	
	@FindBy( xpath = ".//*[@name='addressOption'][@value='Original']")
	public  WebElement UseEnteredAddress_RadioButton;
	
	@FindBy( xpath = "(.//*[@name='addressOption'])[1]")
	public  WebElement UseSuggestedAddress_RadioButton;
	
	
	
}
