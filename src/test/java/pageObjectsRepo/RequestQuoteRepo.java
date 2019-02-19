package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class RequestQuoteRepo extends BaseTest {
	
	public RequestQuoteRepo(WebDriver driver) {
	    this.driver = driver;
	}

	@FindBy( id = "requestQuoteQuickLink_alt")
	public  WebElement RequestQuoteLink;
	
	@FindBy( className = "subheader")
	public  WebElement RequestQuote_subheader;
	
	@FindBy( id = "firstName")
	public  WebElement firstName_Textbox;
	
	@FindBy( id = "lastName")
	public  WebElement lastName_Textbox;
	
	@FindBy( id = "company")
	public  WebElement company_Textbox;
	
	@FindBy( id = "street")
	public  WebElement street_Textbox;
	
	@FindBy( id = "city")
	public  WebElement city_Textbox;
	
	@FindBy( id = "state")
	public  WebElement state_Textbox;
	
	@FindBy( id = "zipcode")
	public  WebElement zipcode_Textbox;
	
	@FindBy( id = "email")
	public  WebElement email_Textbox;
	
	@FindBy( id = "phone")
	public  WebElement phone_Textbox;
	
	@FindBy( id = "occupation")
	public  WebElement occupation_Textbox;
	
	@FindBy( id = "itemblock")
	public  WebElement itemblock_Products;
	
	@FindBy( id = "linkAddMoreProducts")
	public  WebElement linkAddMoreProducts_Button;
	
	@FindBy( id = "captcha")
	public  WebElement captcha;
	
	@FindBy( id = "captchaUserInput")
	public  WebElement captcha_Textbox;
	
	@FindBy( id = "requestquote_submit_button")
	public  WebElement requestquote_submit_button;
	
	@FindBy( id = "requestquote_cancel_button")
	public  WebElement requestquote_cancel_button;

	
	
	
}
