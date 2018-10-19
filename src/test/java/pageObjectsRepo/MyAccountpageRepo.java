package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountpageRepo extends BaseTest {
	
	@FindBy(className = "myaccount_desc_title")
	public  WebElement MyAccount_WelcomeText;
	
}
