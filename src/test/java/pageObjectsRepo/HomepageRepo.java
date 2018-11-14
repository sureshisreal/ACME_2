package pageObjectsRepo;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(className = "freeShip")
	public  WebElement freeShip_Banner;
	
	@FindBy(xpath = ".//*[@class='modal_wrap']//div[@class='header'][contains(.,'FREE Ground Shipping!')]")
	public  WebElement freeShip_Modal_Overlay;
	
	@FindBy(xpath = "(.//*[@class='modal_wrap']//a[@class='close'])[1]")
	public  WebElement freeShip_Modal_Overlay_Close;
	
	@FindBy(className = "saveShip")
	public  WebElement welcome_Banner;
	
	@FindBy(id = "orderStatusQuickLink_alt")
	public  WebElement OrderStatus_Link;
	
	@FindBy(id = "myAccountQuickLink_alt")
	public  WebElement MyAccount_Link;
	
	@FindBy(id = "SigniIn_alt")
	public  WebElement SigniIn_alt_Link;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Order Status')]")
	public  WebElement OrderStatus_Header;
	
	@FindBy(id = "customerServiceQuickLink_alt")
	public  WebElement customerServiceQuick_Link;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Customer')]")
	public  WebElement CustomerService_Header;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Account')]")
	public  WebElement MyAccount_Header;
	
	@FindBy(id = "storeLocatorQuickLink_alt")
	public  WebElement storeLocatorQuick_Link;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Store')]")
	public  WebElement StoreLocation_Header;
	
	@FindBy(id = "requestQuoteQuickLink_alt")
	public  WebElement requestQuoteQuick_Link;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Request')]")
	public  WebElement RequestQuote_Header;
	
	@FindBy(id = "MiniShoppingCart")
	public  WebElement MiniShoppingCart;
	
	@FindBy(xpath = ".//*[@id='MiniShopCartProductsList']//div[@class='content']")
	public  WebElement MiniShoppingCart_EmptyText;
	
	@FindBy(id = "MiniShopCartCloseButton_1")
	public  WebElement MiniShoppingCart_close;
	
	@FindBy(id = "DoYourBestWork_Content")
	public  WebElement DoYourBestWork_Banner;
	
	@FindBy(xpath = ".//*[@id='widget_breadcrumb']//li[@class='current']")
	public WebElement SearchHeader_Verify;
	
	@FindBy(xpath = ".//*[@class='departmentButton']//span[contains(.,'Categories')]")
	public WebElement Menu_Category;
	
	@FindBy(xpath = ".//*[@class='departmentButton']//span[contains(.,'Brands')]")
	public WebElement Menu_Brands;
		
	@FindBy(xpath = ".//*[@class='departmentButton']//span[contains(.,'Deals')]")
	public WebElement Menu_Deals;
	
	@FindBy(xpath = ".//*[@class='departmentButton']//span[contains(.,'New')]")
	public WebElement Menu_WhatsNew;	
	
	@FindBy(xpath = ".//*[@class='category-page']")
	public WebElement Menu_CategoryVerify;
	
	@FindBy(xpath = "(.//div[@class='product_name'])[1]")
	public WebElement FirstProductName;
	
	@FindBy(xpath = ".//div[@class='top namePartPriceContainer']//h1[@class='main_header']")
	public WebElement PDP_TitleVerify;
	
	@FindBy(xpath = ".//*[@class='departmentButton'][contains(.,'Brands')]/following-sibling::div//li")
	public WebElement RandomMenu_BrandName;
	
	@FindBy(xpath = "(.//*[@class='promonewrow']//b)[1]")
	public  WebElement Categorypage_FirstCategory;
	
	
	@FindBy(xpath = ".//*[@class='promonewrow']//b")
	public  List<WebElement> Categorypage_AllCategory;
	
	 public WebElement Categorypage_RandomCategory(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='promonewrow']//b)["+i+"]"));
	    }
	 
	 @FindBy(xpath = "(.//*[@class='content carousel product_listing_container']//b)")
		public  List<WebElement> Categorypage_SubCategory;
	 
	 public WebElement Categorypage_SubRandomCategory(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='content carousel product_listing_container']//b)["+i+"]"));
	    }
	@FindBy(xpath = ".//*[@class='product_group_name product_info']")
	public  List<WebElement> SubCategorypage_SubCCategory;
	 
	 public WebElement SubCategorypage_RandomCategory(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='product_group_name product_info'])["+i+"]"));
	    }
	 
	@FindBy(xpath = " .//*[@class='brandListing column-list-js']//a")
	public  List<WebElement> Brand_SubCCategory;
	
	public WebElement Brands_RandomCategory(int i) {
		 return driver.findElement(By.xpath("(.//*[@class='brandListing column-list-js']//a)["+i+"]"));
	    }
}
