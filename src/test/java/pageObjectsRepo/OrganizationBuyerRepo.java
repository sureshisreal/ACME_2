package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class OrganizationBuyerRepo extends BaseTest {
	
	public OrganizationBuyerRepo(WebDriver driver) {
	    this.driver = driver;
	}

	@FindBy( xpath = ".//ul[@class='facetSelect']//a[contains(.,'Organizations and Buyers')]")
	public  WebElement Organizations_Buyers;
	
	
	@FindBy( xpath = "//a[contains(.,'Edit Organization')]")
	public  WebElement EditOrganization_Button;
	
	
	@FindBy( id = "PageHeader_CreateEditOrganization")
	public  WebElement Organizations_Buyers_Header;
	
	@FindBy( xpath = ".//*[@aria-labelledby='organizationInfo']")
	public  WebElement organizationInfo;
	
	@FindBy( id = "orgAddressDetailsEditMain")
	public  WebElement orgAddressDetailsEditMain;
	
	@FindBy( id = "orgContactInfoEditMain")
	public  WebElement orgContactInfoEditMain;
	
	@FindBy( id = "memberGroupEditMain")
	public  WebElement memberGroupEditMain;
	
	@FindBy( id = "orgRolesEditMain")
	public  WebElement orgRolesEditMain;
	
	/*	Address Validations*/
	@FindBy( xpath = "	.//*[@class='pageSectionTitle']//div[@id='orgAddressDetailsEditIcon']//img")
	public  WebElement orgAddressDetailsEditIcon;
	
	@FindBy( id = "address1")
	public  WebElement address1;
	
	@FindBy( id = "city")
	public  WebElement city;
	
	@FindBy( id = "WC_UserAddress_Form_Input_state")
	public  WebElement Input_state;
	
	@FindBy( id = "zipCode")
	public  WebElement zipCode;
	
	@FindBy( id = "WC_UserAddress_Form_Input_country")
	public  WebElement Input_country;
	
	@FindBy( xpath = ".//form[@id='orgAddressDetails']//span[contains(.,'Save')]")
	public  WebElement orgAddressDetails_save;
	
	@FindBy( xpath = ".//form[@id='orgAddressDetails']//span[contains(.,'Cancel')]")
	public  WebElement orgAddressDetails_Cancel;
	
	/*Contact Validations*/
	
	@FindBy( xpath = "	.//*[@class='pageSectionTitle']//div[@id='orgContactInfoEditIcon']//img")
	public  WebElement orgContactDetailsEditIcon;
	
	@FindBy( id = "email1")
	public  WebElement email1;
	
	@FindBy( id = "phone1")
	public  WebElement phone1;
	
	@FindBy( id = "fax1")
	public  WebElement fax1;
	
	@FindBy( xpath = ".//*[@id='orgSummaryContactInfoRefreshArea']//span[contains(.,'Cancel')]")
	public  WebElement ContactValidation_Cancel;
	
	@FindBy( xpath = ".//*[@id='orgSummaryContactInfoRefreshArea']//span[contains(.,'Save')]")
	public  WebElement ContactValidation_Save;
	
/*	Member Edit Icon*/
	@FindBy( xpath = ".//*[@class='pageSectionTitle']//div[@id='memberGroupEditIcon']//img")
	public  WebElement MemberEditIcon;
	
	@FindBy( xpath = ".//*[@class='checkField'][contains(.,'Order approvals')]")
	public  WebElement Orderapprovals_Checkbox;
	
	@FindBy( xpath = ".//*[@class='checkField'][contains(.,'Buyer approvals')]")
	public  WebElement Buyerapprovals_Checkbox;
	
	@FindBy( xpath = ".//*[@class='checkField'][contains(.,'inherit order approvals')]")
	public  WebElement InheritOrderapprovals_Checkbox;
	
	@FindBy( xpath = ".//*[@class='checkField'][contains(.,'inherit buyer approvals')]")
	public  WebElement InheritBuyerapprovals_Checkbox;
	
	@FindBy( xpath = ".//*[@id='orgMemberGroupRefreshArea']//span[contains(.,'Save')]")
	public  WebElement MemberValidation_Save;
	
	@FindBy( xpath = ".//*[@id='orgMemberGroupRefreshArea']//span[contains(.,'Cancel')]")
	public  WebElement MemberValidation_Cancel;
	
}
