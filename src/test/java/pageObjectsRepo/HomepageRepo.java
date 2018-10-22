package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class HomepageRepo extends BaseTest{
	
	public HomepageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(id = "searchTerm")
	public  WebElement searchTextbox;
	
	@FindBy(id = "search_submit")
	public  WebElement searchSubmit;
	
	@FindBy(id = "SigniIn_alt")
	public  WebElement SignInRegister_Link;
	
	@FindBy(xpath = "//title[contains(.,'Acme')]")
	public  WebElement titleText;
	
	@FindBy(id = "AcmeToolsLogo_Content1")
	public  WebElement AcmeLogo;
}
