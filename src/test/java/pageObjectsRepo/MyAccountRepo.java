package pageObjectsRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountRepo extends BaseTest {
	
	public MyAccountRepo(WebDriver driver) {
	    this.driver = driver;
	}

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
	
	@FindBy(xpath = "//div[text()='Address']")
	public WebElement personal_info_address_label;
	
	@FindBy(xpath = "//div[text()='City']")
	public WebElement personal_info_city_label;
	
	@FindBy(xpath = "//div[text()='E-mail']")
	public WebElement personal_info_email_label;
	
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
	
	@FindBy(xpath = "//div[@id='section_button_orders']//a[contains(text(),'Coupons')]")
	public WebElement myacc_leftNav_coupons_sublink;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			

	
	
	
	
	
	

}
