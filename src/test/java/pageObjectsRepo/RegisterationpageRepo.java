package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class RegisterationpageRepo extends BaseTest {
	
	//SignIn 
	@FindBy(xpath = ".//*[@name='logonId']")
	public  WebElement LogonId_Textbox;
	
	@FindBy(xpath = ".//*[@name='logonPassword']")
	public  WebElement Password_Textbox;
	
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
	
	
	
}
