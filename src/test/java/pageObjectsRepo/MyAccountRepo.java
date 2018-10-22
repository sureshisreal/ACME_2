package pageObjectsRepo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountRepo {
	
	@FindBy(className = "myaccount_title")
	public WebElement myAccountSummary_title;
	
	@FindBy(className = "myaccount_desc_title")
	public WebElement myaccount_desc_title;
	

	
	
	
	
	

}
