package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPageRepo {
	
	@FindBy( id = "WC_PaymentEntry_account")
	public  WebElement CardNumber_Textbox;
	
	@FindBy( id = "WC_PaymentEntry_cc_cvc")
	public  WebElement CvvTextbox;
	
	@FindBy( id = "month")
	public  WebElement Billing_month;
	
	@FindBy( id = "year")
	public  WebElement Billing_year;
	
	@FindBy( xpath = ".//*[@id='WC_CheckoutButton_2'][contains(.,'Place Order')]")
	public  WebElement PlaceOrder_Button;
	
	
	
}
