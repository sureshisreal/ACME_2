package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageRepo {
	
	@FindBy(id = "searchTerm")
	public  WebElement searchTextbox;
	
	@FindBy(id = "search_submit")
	public  WebElement searchSubmit;
	
	@FindBy(id = "SigniIn_alt")
	public  WebElement SignInRegister_Link;
	
	@FindBy(xpath = "//title[contains(.,'Acme')]")
	public  WebElement titleText;
	
}
