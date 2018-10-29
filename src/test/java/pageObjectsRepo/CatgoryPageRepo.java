package pageObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class CatgoryPageRepo extends BaseTest {
	
	public CatgoryPageRepo(WebDriver driver) {
	    this.driver = driver;
	}

	@FindBy(xpath = "(.//div[@class='product_image'])[1]")
	public WebElement FirstProduct;
	
	@FindBy(xpath = "(.//div[@class='hawk-name product_name'])[1]")
	public WebElement FirstProductName;
	
	@FindBy(xpath = ".//*[@class='product_name']")
	public List<WebElement> AllProductNames;

	@FindBy(xpath = ".//*[@id='widget_breadcrumb']//li[@class='current']")
	public WebElement SearchHeader;
	
	@FindBy(xpath = ".//div[@class='top namePartPriceContainer']//h1[@class='main_header']")
	public WebElement PDP_TitleVerify;
	
	 public WebElement RandomCategorySelect(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='product_name'])["+i+"]"));
	    }
	
}
