package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class RegisterationpageRepo extends BaseTest {
	
	public RegisterationpageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	//SignIn 
	@FindBy(xpath = ".//*[@name='logonId']")
	public  WebElement LogonId_Textbox;
	
	@FindBy(xpath = ".//*[@name='logonPassword']")
	public  WebElement Password_Textbox;
	
	@FindBy(id = "myAccountQuickLink_alt")
	public  WebElement MyAccount_Link;
	
	@FindBy(id = "SigniIn_alt")
	public  WebElement SigniIn_alt_Link;
	
	//Forgot Pssword
	@FindBy(xpath = ".//*[@class='myaccount_link'][contains(.,'Forgot your password')]")
	public  WebElement Forgotpassword_Link;
	
	@FindBy(id = "WC_PasswordResetForm_div_2")
	public  WebElement Forgotpassword_Header;
	
	@FindBy(id = "WC_PasswordResetForm_Link_2")
	public  WebElement Forgotpassword_SendMeValidationsLink;
	
	@FindBy(id = "error_msg")
	public  WebElement Forgotpassword_ErrorMsg;
	
	@FindBy(id = "WC_PasswordResetDisplay_div_1")
	public  WebElement Forgotpassword_ResetSuccessText;
	
	@FindBy(id = "WC_PasswordResetDisplay_Link_1")
	public  WebElement Forgotpassword_ResetContinueLogin;
	
	@FindBy(className = "myaccount_links")
	public  WebElement Forgotpassword_ClickHere_AccountLink;
		
	@FindBy(xpath = ".//*[@class='btn'][contains(.,'Sign In')]")
	public  WebElement SignIn_Button;	
	
	@FindBy(className = "myaccount_desc_title")
	public  WebElement MyAccount_WelcomeText;
	
	@FindBy(xpath = ".//*[@class='header_return bordered']//h2[@class='registration_header']")
	public  WebElement ReturningCustomer_Header;
	
	@FindBy(id = "logonErrorMessage")
	public  WebElement logonErrorMessage;
	
// Registeration 
	
	@FindBy(xpath = ".//*[@class='btn'][contains(.,'Register')]")
	public  WebElement Register_Button;
	
	@FindBy(name = "logonPassword")
	public  WebElement logonPassword_Textbox;
	
	@FindBy(name = "logonPasswordVerify")
	public  WebElement logonPasswordVerify_Textbox;
	
	@FindBy(name = "firstName")
	public  WebElement firstName_Textbox;
	
	@FindBy(name = "lastName")
	public  WebElement lastName_Textbox;
	
	@FindBy(name = "organizationName")
	public  WebElement organizationName_Textbox;
	
	@FindBy(name = "address1")
	public  WebElement address1_Textbox;
	
	@FindBy(name = "address2")
	public  WebElement address2_Textbox;
	
	@FindBy(name = "zipCode")
	public  WebElement zipCode_Textbox;
	
	@FindBy(name = "city")
	public  WebElement city_Textbox;
	
	@FindBy(name = "state")
	public  WebElement state_Textbox;
	
	@FindBy(name = "verifyemail1")
	public  WebElement verifyemail1_Textbox;
	
	@FindBy(name = "email1")
	public  WebElement email1_Textbox;
	
	@FindBy(name = "phone1")
	public  WebElement phone1_Textbox;
	
	@FindBy(name = "businessTitle")
	public  WebElement businessTitle_Textbox;
	
	@FindBy(id = "dateOfBirth")
	public  WebElement dateOfBirth_Textbox;
	
	@FindBy(id = "registration_privacy-subscribe-info")
	public  WebElement privacy_Text;
	
	@FindBy(id = "captcha")
	public  WebElement captcha_Text;
	
	@FindBy(xpath = "(//a[contains(.,'Submit')])[1]")
	public  WebElement submit_Button;
	
	@FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
	public  WebElement cancel_Button;
	
//Logout 	
	@FindBy(xpath = "//ul[@id='quickLinksBar']//a[@id='SigniIn_alt']")
	public WebElement SignOut;
	
	@FindBy(id = "UserRegistrationErrorMessage")
	public WebElement regErrorMsg_existingEmail;

	
	
	
}
