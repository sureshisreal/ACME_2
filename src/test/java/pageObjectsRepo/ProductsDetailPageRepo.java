package pageObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class ProductsDetailPageRepo extends BaseTest{
	
	public ProductsDetailPageRepo(WebDriver driver){
        this.driver = driver;
    }
	
	@FindBy(xpath = ".//div[@class='top namePartPriceContainer']//h1[@class='main_header']")
	public WebElement PDP_TitleVerify;

	@FindBy( className = "quantity_input")
	public  WebElement quantity;
	
	@FindBy( id = "productPageAdd2Cart")
	public  WebElement AddToProductButton;
	
	@FindBy( id = "productPagePickUpToday")
	public  WebElement productPagePickUpTodayButton;
	
	@FindBy( id = "minishopcart_total")
	public  WebElement minishopcart_total;
	
	@FindBy( id = "cart_text")
	public  WebElement cart_text;
	
	@FindBy( id = "GotoCartButton2")
	public  WebElement GotoCartButton;
	
	@FindBy( xpath = ".//*[@class='container pdpPage']")
	public  WebElement PDPpage_Container;
	
	@FindBy( id = "widget_breadcrumb")
	public  WebElement PDPpage_BreadCrumb;
	
	@FindBy( css = ".mp-semi.prod-name")
	public  WebElement PDPpage_SkuName;
	
	@FindBy( className = "ratings")
	public  WebElement PDPpage_Rating;
	
	@FindBy( id = "WAR")
	public  WebElement PDPpage_Review;
	
	@FindBy( className = "avail-info")
	public  WebElement PDPpage_AvailInfo;

	@FindBy( className = "shipping-info")
	public  WebElement PDPpage_ShippingInfo;
	
	@FindBy( className = "quantity_section")
	public  WebElement PDPpage_QtyInfo;
	
	@FindBy( className = "addtoCartWrap")
	public  WebElement PDPpage_AddToCart;
	
	@FindBy( className = "prod-det-bott")
	public  WebElement PDPpage_ProductSpecification;
	
	@FindBy( id = "footer")
	public  WebElement PDPpage_footer;
	
	@FindBy( id = "lowPriceGuaranteeAnchor")
	public  WebElement lowPriceGuaranteeAnchor_Link;
	
	@FindBy( id = "lowPrice_text_id")
	public  WebElement lowPrice_close;
	
	@FindBy( css = "	.qty.right input")
	public  WebElement Qty_Input;
	
	@FindBy( id = "ErrorMessageText")
	public  WebElement Qty_ErrorMsg;
	
	@FindBy( id = "shoppping_list_content")
	public  WebElement shoppping_list_content;
	
	@FindBy( id = "ShoppingList_0")
	public  WebElement Wishlist_signIn;	
		
	@FindBy( xpath = "(.//*[@class='subheader-bar'][contains(.,'Recommended')]/following-sibling::div//li//div[@class='product_name']//a)")
	public  List<WebElement> PDPpage_RecommendedProducts;
	
	 public WebElement AddRecommendedCount(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='subheader-bar'][contains(.,'Recommended')]/following-sibling::div//li//div[@class='product_name']//a)["+i+"]"));
	    }
	 
	 @FindBy( xpath = "(.//*[@class='header-bar'][contains(.,'Also')]/following-sibling::div//li//div[@class='product_name']//a)")
		public  List<WebElement> PDPpage_AlsoViewedProducts;
	 
	 public WebElement AddAlsoViewedCount(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='header-bar'][contains(.,'Also')]/following-sibling::div//li//div[@class='product_name']//a)["+i+"]"));
	    }
	 
	 
	
	
	
	
	
	


}
