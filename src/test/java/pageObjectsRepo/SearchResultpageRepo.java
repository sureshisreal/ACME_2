package pageObjectsRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class SearchResultpageRepo extends BaseTest{
	
	public SearchResultpageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(xpath = "(.//*[@id='hawkitemlist']//div)[1]")
	public WebElement SearchHeader_ZeroResult;
	
	@FindBy(id = "widget_breadcrumb")
	public  WebElement BrandName_BreadCrumb;
	
	@FindBy(xpath = ".//*[@class='container hawksearchwrap']")
	public  WebElement Searchpage_Container;
	
	
	
	
	
}
