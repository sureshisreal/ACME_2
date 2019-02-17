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
	
	@FindBy(xpath = ".//*[@class='category-page']")
	public WebElement CategoryVerify;
	
	@FindBy(xpath = ".//div[@class='top namePartPriceContainer']//h1[@class='main_header']")
	public WebElement PDP_TitleVerify;
	
	@FindBy(xpath = ".//div[@class='socialLeft']")
	public WebElement PDP_TitleVerify_Verify;
	
	 public WebElement RandomCategorySelect(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='product_name'])["+i+"]"));
	    }
	 
	 @FindBy(xpath = ".//*[@id='widget_breadcrumb']//li")
	 public List<WebElement> Breadcrumb_Navigation;
	 
	 public WebElement BreacrumbNavigation(int i) {
		 return driver.findElement(By.xpath("(.//*[@id='widget_breadcrumb']//li)["+i+"]"));
	    }
	
	 @FindBy(xpath = " .//*[@class='row facetContainer']")
	 public WebElement Filters;
	 
	 @FindBy(name = "pageSize")
	 public WebElement Itemsperpage;
	 
	 @FindBy(name = "orderBy")
	 public WebElement sortOption;
	 
	 @FindBy(xpath = "(.//*[@class='pageControl number'])[1]")
	 public WebElement pageControl_Header;
	 
	 @FindBy(xpath = "(.//*[@class='pageControl number'])[2]")
	 public WebElement pageControl_Footer;
	 
	 @FindBy(xpath = "(.//*[@class='product_info'])[1]")
	 public WebElement First_product_Info;
	 
	 @FindBy(xpath = ".//*[@class='header-bar'][contains(.,'Top Selling Items')]")
	 public WebElement TopSellingItems;
	 
	 @FindBy(id = "footer")
	 public WebElement Footer;
	 
	 public WebElement FilterByOptiopns(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='optionContainer' or @class='optionContainer singleFacet'][not(contains(.,'Top'))]//a)["+i+"]"));
	    }
	 @FindBy(xpath = "(.//*[@class='header-bar'][contains(.,'Top Selling Items')]/following-sibling::div//div[@class='product_name'])")
	 public List<WebElement> TopSellingItems_Count;
	 
	 public WebElement TopSellingItemsName(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='header-bar'][contains(.,'Top Selling Items')]/following-sibling::div//div[@class='product_name'])["+i+"]"));
	    }
	 
	 
	 
}
