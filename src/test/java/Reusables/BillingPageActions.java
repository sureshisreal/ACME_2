package Reusables;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjectsRepo.BillingPageRepo;

public class BillingPageActions extends BillingPageRepo {

	public BillingPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void VisaPayment() {
		WaitUntilElementClickable(CardNumber_Textbox);
		CardNumber_Textbox.clear();
		CardNumber_Textbox.sendKeys("4111111111111111");
		CvvTextbox.sendKeys("321");
		Select month =new Select(Billing_month);
		month.selectByValue("05");
		Select year =new Select(Billing_year);
		year.selectByValue("2025");
		logs("Visa payment entered");
	}
	
	public void BillingFieldValidation() {
		WaitUntilElementClickable(CardNumber_Textbox);
		ElementPresent(CardNumber_Textbox);
		ElementPresent(CvvTextbox);
		ElementPresent(Billing_month);
		ElementPresent(Billing_year);
		logs("Billing fields validated");
	}
	
	public void PlaceOrder() throws IOException{
		WaitUntilElementClickable(PlaceOrder_Button);
		PlaceOrder_Button.click();
		WaitUntilElementVisible(OrderNumber_Text);
		AddScreenshot();
		logs("Ordered Placed");
		logs("Order Number : "+OrderNumber_Text.getText());
		logs("Order Date : "+OrderDate_Text.getText());
		
	}

	

}
