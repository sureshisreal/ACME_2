package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;


public class MyAccAddressBookRepo  extends BaseTest {
	
	public MyAccAddressBookRepo(WebDriver driver) {
	    this.driver = driver;
	}
	
	//My Shipping Address book page elements
	
	
	@FindBy(xpath = "//div[@class='my_account']//h2[contains(text(),'Shipping Addresses')]")
	public WebElement aBook_header;
	
	
	/*@FindBy(xpath = "//div[@class='my_account']//table[@aria-describedby='drop_down_address_book_ACCE_DESC']")
	public WebElement aBook_addrDropdown;
	*/
	
	@FindBy(xpath = "//div[@class='my_account']//a[contains(text(),'Add New')]")
	public WebElement aBook_addNew_CTA;
	
	
	@FindBy(xpath = "//div[@class='my_account']//a[contains(text(),'Remove')]")
	public WebElement aBook_remove_CTA;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'First name:')]")
	public WebElement aBook_fnameLabel;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Last name:')]")
	public WebElement aBook_lnameLabel;
	
	@FindBy(name = "nickName")
	public WebElement aBook_Recipient_field;
	
	@FindBy(name = "firstName")
	public WebElement aBook_fname_field;
	
	
	@FindBy(name = "lastName")
	public WebElement aBook_lastName_field;

	
	@FindBy(xpath = "//div[@class='my_account']//div[contains(text(),'Company:')]")
	public WebElement aBook_companyLabel;
	
	@FindBy(name = "organizationName")
	public WebElement aBook_companyField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Street address 1:')]")
	public WebElement aBook_address1Label;
	
	
	@FindBy(name = "address1")
	public WebElement aBook_address1_field;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Street address 2:')]")
	public WebElement aBook_address2Label;
	
	@FindBy(name = "address2")
	public WebElement aBook_address2Field;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'City')]")
	public WebElement aBook_cityLabel;
	
	@FindBy(name = "city")
	public WebElement aBook_city_field;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'ZIP code:')]")
	public WebElement aBook_zipcodeLabel;
	
	
	@FindBy(name = "zipCode")
	public WebElement aBook_zipCodeField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'State:')]")
	public WebElement aBook_stateLabel;
	
	@FindBy(xpath = "//div[@id='stateDiv']//span")
	public WebElement aBook_stateDiv;
	
	
	@FindBy(xpath = "//div[@id='stateDiv']//table")
	public WebElement aBook_stateTable;
	
	@FindBy(xpath = "//table[@class='dijitReset dijitMenuTable']")
	public WebElement aBook_stateTab2;
	
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Phone number:')]")
	public WebElement aBook_phoneNumberLabel;
	
	@FindBy(name = "phone1")
	public WebElement aBook_phoneNumField;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Email:')]")
	public WebElement aBook_emailLabel;
	
	@FindBy(name = "email1")
	public WebElement aBook_email1_field;
	
	@FindBy(xpath = "//div[@class='my_account']//label[contains(text(),'Verify Email')]")
	public WebElement aBook_verifyEmailLabel;
	
	
	@FindBy(name = "verifyemail1")
	public WebElement aBook_verifyemail1_field;
	
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	public WebElement aBook_updateCTA;
	
	@FindBy(xpath = "//a[contains(text(),'Submit')]")
	public WebElement aBook_submitCTA;
	
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	public WebElement aBook_cancelCTA;
	
	@FindBy(xpath = "//div[@id='msgpopup_content_wrapper']//*[contains(text(),'The new address has been successfully added to the address book.')]")
	public WebElement aBook_newAddressAdded_successMsg;
	
	@FindBy(xpath = "//table[@id='addressId']")
	public WebElement aBook_addrDropdown;
	
	
	@FindBy(xpath = "//td[contains(text(),'rnameforremove')]")
	public WebElement aBook_removeaddr;
	
	@FindBy(xpath = "//div[@id='addressId_menu']")
	public WebElement aBook_addrMenu;
	
	
	@FindBy(xpath = "//div[@id='msgpopup_content_wrapper']//*[contains(text(),'The selected address has been removed from the address list')]")
	public WebElement aBook_removeAddress_successMsg;
	
	
	@FindBy(xpath = "//div[contains(text(),'Your address cannot be removed')]")
	public WebElement aBook_removeAddressRestric_tooltip;
	
	

	
	
}
