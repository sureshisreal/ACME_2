package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageRepo {
	
	@FindBy(id = "searchTermq1")
	public  WebElement searchTextbox;
	
	@FindBy(id = "search_submit")
	public  WebElement searchSubmit;

}
