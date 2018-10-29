package pageObjectsRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountRepo extends BaseTest {
	
	public MyAccountRepo(WebDriver driver) {
	    this.driver = driver;
	}

	
	//MyAccount Summary Page Elements

	@FindBy(className = "myaccount_title")
	public WebElement myAccountSummary_title;
	
	@FindBy(className = "myaccount_desc_title")
	public WebElement myaccount_desc_title;
	
	@FindBy(className = "myaccount_desc")
	public WebElement myaccount_desc_summary;
	
	@FindBy(xpath = "span[text()='Personal Information']")
	public WebElement personal_information_title;
	
	@FindBy(xpath = "//div[text()='Name']")
	public WebElement personal_info_name_label;
	
	
	@FindBy(xpath = "//div[@class='info_table']//div[contains(text(),'Name')]/following-sibling::div")
	public WebElement personal_info_name_value;
	

	
	@FindBy(xpath = "//div[text()='Address']")
	public WebElement personal_info_address_label;
	
	
	@FindBy(xpath = "//div[@class='info_table']//div[contains(text(),'Address')]/following-sibling::div")
	public WebElement personal_info_address_value;
	
	
	@FindBy(xpath = "//div[text()='City']")
	public WebElement personal_info_city_label;
	
	
	@FindBy(xpath = "//div[@class='info_table']//div[contains(text(),'City')]/following-sibling::div")
	public WebElement personal_info_city_value;
	
	@FindBy(xpath = "//div[text()='E-mail']")
	public WebElement personal_info_email_label;
	
	@FindBy(xpath = "//div[@class='info_table']//div[contains(text(),'E-mail')]/following-sibling::div")
	public WebElement personal_info_email_value;
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]") 
	public WebElement personal_info_edit_link;
	
	
	@FindBy(xpath = "span[text()='Recent Order History']")
	public WebElement recent_order_history_title;
	
	
	@FindBy(xpath = "//a[contains(text(),'View all Orders')]") 
	public WebElement recent_order_history_view_all_orders;
	
	
	@FindBy(className = "current")
	public WebElement currentPageBreadcrumb;

	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Order Number')]")
	public WebElement recent_OrderHistory_header_orderNumber;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Order Date')]")
	public WebElement recent_OrderHistory_header_orderDate;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Purchase Order')]")
	public WebElement recent_OrderHistory_header_PurchaseOrder;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Status')]")
	public WebElement recent_OrderHistory_header_Status;
	
	@FindBy(xpath = "//tr[@class='ul column_heading']/th[contains(text(),'Total Price')]")
	public WebElement recent_OrderHistory_header_TotalPrice;

	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//tr[@class='ul row']")
	public WebElement recent_OrderHistory_ordersListSection;
	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//div[contains(text(),'Re-Order')]")
	public WebElement recent_OrderHistory_Reorder_CTA;
	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//a[contains(text(),'Details')]")
	public WebElement recent_OrderHistory_DetailsLink;
	
	
	@FindBy(xpath ="//div[@id='ProcessedOrdersStatusDisplay']//td[contains(text(), 'No orders were found' )]")
	public WebElement recent_OrderHistory_noOrdersFound;
	
	
	//My Account Page Left Navigation Page Elements
	
	@FindBy(xpath = "(//div[@id='section_button_settings']//div)[1]")
	public WebElement myacc_leftNav_settings;
	
	
	@FindBy(xpath = "//div[@id='section_button_settings']//a[contains(text(),'Personal Information')]")
	public WebElement myacc_leftNav_settings_personalInfo;
	
	
	@FindBy(xpath = "//div[@id='section_button_settings']//a[contains(text(),'My Shipping Address Book')]")
	public WebElement myacc_leftNav_settings_addressBook;
	
	
	@FindBy(xpath = "//div[@id='section_button_settings']//a[contains(text(),'My Credit Card')]")
	public WebElement myacc_leftNav_settings_creditCard;
	
	
	@FindBy(xpath = "(//div[@id='section_button_wishlists']//div)[1]")
	public WebElement myacc_leftNav_wishlists;
	
	@FindBy(xpath = "//div[@id='section_button_wishlists']//a[contains(text(),'Personal Wish List')]")
	public WebElement myacc_leftNav_wishlist_personalWishlist;
	
	
	@FindBy(xpath = "(//div[@id='section_button_orders']//div)[1]")
	public WebElement myacc_leftNav_orders;
	
	@FindBy(xpath = "//div[@id='section_button_orders']//a[contains(text(),'Order History')]")
	public WebElement myacc_leftNav_orders_orderHistory;
	
	@FindBy(xpath = "(//div[@id='section_button_coupons']//div)[1]")
	public WebElement myacc_leftNav_coupons;
	
	@FindBy(xpath = "//div[@id='section_button_coupons']//a[contains(text(),'Coupons')]")
	public WebElement myacc_leftNav_coupons_sublink;
	
	//Personal Information Page Elements
	
	@FindBy(name = "firstName")
	public WebElement myacc_pi_fname;
	
	
	@FindBy(name = "lastName")
	public WebElement myacc_pi_lastName;
	

	@FindBy(name = "address1")
	public WebElement myacc_pi_address1;
	
	
	@FindBy(name = "city")
	public WebElement myacc_pi_city;
	
	
	@FindBy(name = "email1")
	public WebElement myacc_pi_email1;
	
	
	@FindBy(name = "verifyemail1")
	public WebElement myacc_pi_verifyemail1;
	
	
	@FindBy(xpath = "//div[@class='my_account']//h2[contains(text(),'Personal Information')]")
	public WebElement pi_header;
	
	
	@FindBy(xpath = "//div[@class='my_account']//div[contains(text(),'Welcome Back')]")
	public WebElement pi_wecomeBackText;
	
	
	
	@FindBy(xpath = "//div[@class='my_account']//p[contains(text(),'Last logon')]")
	public WebElement pi_lastLogonText;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Password')]")
	public WebElement pi_passwordLabel;
	
	@FindBy(name = "logonPassword_old")
	public WebElement pi_passwordField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Verify password')]")
	public WebElement pi_verifyPasswordLabel;
	
	@FindBy(name = "logonPasswordVerify_old")
	public WebElement pi_verifyPasswordField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'First name:')]")
	public WebElement pi_fnameLabel;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Last name:')]")
	public WebElement pi_lnameLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//div[contains(text(),'Company:')]")
	public WebElement pi_companyLabel;
			
	
	@FindBy(name = "organizationName")
	public WebElement pi_companyField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Street address 1:')]")
	public WebElement pi_address1Label;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Street address 2:')]")
	public WebElement pi_address2Label;
	
	@FindBy(name = "address2")
	public WebElement pi_address2Field;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'City')]")
	public WebElement pi_cityLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'ZIP code:')]")
	public WebElement pi_zipcodeLabel;
	
	
	@FindBy(name = "zipCode")
	public WebElement pi_zipCodeField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'State:')]")
	public WebElement pi_stateLabel;
	
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Email:')]")
	public WebElement pi_emailLabel;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Verify Email')]")
	public WebElement pi_verifyEmailLabel;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Phone number:')]")
	public WebElement pi_phoneNumberLabel;
	
	@FindBy(name = "phone1")
	public WebElement pi_phoneNumField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Occupation:')]")
	public WebElement pi_occupationLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Birth Month:')]")
	public WebElement pi_birthMonthLabel;
	
	
	@FindBy(xpath = "//div[@class='my_account']//a[contains(text(),'Privacy Policy')]")
	public WebElement pi_privacyPolicyLink;
	
	@FindBy(name = "sendMeEmail")
	public WebElement pi_emailSubscriptionsCheckbox;
	
	@FindBy(xpath = "//div[@class='my_account']//li[@id='reg_subscribe_email']")
	public WebElement pi_emailSubscriptionsText;
	
	
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	public WebElement pi_updateCTA;
	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

	
	
	
	
	
	

}
