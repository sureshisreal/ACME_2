package pageObjectsRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccountRepo extends BaseTest {
	
	public MyAccountRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(className = "myaccount_title")
	public WebElement myAccountSummary_title;
	
	@FindBy(className = "myaccount_desc_title")
	public WebElement myaccount_desc_title;
	

	
	
	
	
	

}
