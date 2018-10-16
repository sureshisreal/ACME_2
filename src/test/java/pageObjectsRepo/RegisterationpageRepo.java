package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationpageRepo {
	
	@FindBy(xpath = ".//*[@name='logonId']")
	public  WebElement LogonId_Textbox;
	
	@FindBy(xpath = ".//*[@name='logonPassword']")
	public  WebElement Password_Textbox;
	
	@FindBy(xpath = "W.//*[@class='myaccount_link'][contains(.,'Forgot your password')]")
	public  WebElement Forgotpassword_Link;
	
	@FindBy(xpath = ".//*[@class='btn'][contains(.,'Sign In')]")
	public  WebElement SignIn_Button;	

}
