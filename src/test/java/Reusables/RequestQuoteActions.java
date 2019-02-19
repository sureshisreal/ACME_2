package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.RequestQuoteRepo;

public class RequestQuoteActions extends RequestQuoteRepo {

	public RequestQuoteActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void RequestQuoteValidations() throws IOException {
		WaitUntilElementClickable(RequestQuote_subheader);
		ElementPresent(RequestQuote_subheader);
		ElementPresent(firstName_Textbox);
		ElementPresent(lastName_Textbox);
		ElementPresent(company_Textbox);
		ElementPresent(street_Textbox);
		ElementPresent(city_Textbox);
		ElementPresent(state_Textbox);
		ElementPresent(zipcode_Textbox);
		ElementPresent(email_Textbox);
		ElementPresent(phone_Textbox);
		ElementPresent(occupation_Textbox);
		ElementPresent(itemblock_Products);
		ElementPresent(linkAddMoreProducts_Button);
		ElementPresent(captcha);
		ElementPresent(captcha_Textbox);
		ElementPresent(requestquote_submit_button);
		ElementPresent(requestquote_cancel_button);
		logs("RequestQuoteValidations completed");
	}

	public void ErrorMsgValidation() {
		WaitUntilElementClickable(RequestQuote_subheader);
		requestquote_submit_button.click();
		Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText()+" Alert is Displayed"); 
	}

	public void requestquoteLink() {
		WaitUntilElementClickable(RequestQuoteLink);
		RequestQuoteLink.click();
		logs("RequestQuoteLink clicked" );
		WaitUntilElementClickable(RequestQuote_subheader);
	}

	


}
