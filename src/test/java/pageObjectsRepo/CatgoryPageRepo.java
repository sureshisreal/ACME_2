package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class CatgoryPageRepo extends BaseTest {
	
	@FindBy(xpath = "(.//div[@class='product_image'])[1]")
	public WebElement FirstProduct;
	
	@FindBy(xpath = "(.//div[@class='hawk-name product_name'])[1]")
	public WebElement FirstProductName;

	
	@FindBy(xpath = ".//*[@class='top namePartPriceContainer']//h1[@class='main_header']")
	public WebElement VerifyProductTitle;
	
	@FindBy(xpath = ".//*[@id='widget_breadcrumb']//li[@class='current']")
	public WebElement SearchHeader;	
	
}
