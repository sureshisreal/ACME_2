package pageObjectsRepo;

import java.util.List;

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
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Order Status')]")
	public  WebElement OrderStatus_Header;
	
	@FindBy(id = "customerServiceQuickLink_alt")
	public  WebElement customerServiceQuick_Link;
	
	@FindBy(xpath = ".//*[@class='main_content']//h1[contains(.,'Customer')]")
	public  WebElement CustomerService_Header;
	
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
	
	
	
	 
	
}
