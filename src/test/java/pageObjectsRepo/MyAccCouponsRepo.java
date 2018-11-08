package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class MyAccCouponsRepo extends BaseTest {
	
	public MyAccCouponsRepo(WebDriver driver) {
	    this.driver = driver;
	}
	
	
	@FindBy(xpath = "//div[@class='my_account']//h2[contains(text(),'My Coupons')]")
	public WebElement coupons_header;
		
	@FindBy(xpath = "//div[@class='my_account']//*[contains(text(),'You currently have no coupons')]")
	public WebElement coupons_noCouponsMsg;
	
	


}
