package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountpageRepo extends BaseTest {
	
	public MyAccountpageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(className = "myaccount_desc_title")
	public  WebElement MyAccount_WelcomeText;
	
}
