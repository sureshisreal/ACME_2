package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class CatgoryPageRepo extends BaseTest {
	
	public CatgoryPageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(xpath = "(.//div[@class='product_image'])[1]")
	public WebElement FirstProduct;
	
	@FindBy(xpath = ".//*[@id='widget_breadcrumb']//li[@class='current']")
	public WebElement SearchHeader;
	
	
}
