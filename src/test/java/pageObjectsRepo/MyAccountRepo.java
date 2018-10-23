package pageObjectsRepo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountRepo extends BaseTest {
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
			

	
	
	
	
	
	

}
