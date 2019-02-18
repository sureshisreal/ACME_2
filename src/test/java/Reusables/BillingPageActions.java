package Reusables;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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

	public void saveBillingDetailsToAccount() throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CardNumber_Textbox);
		Thread.sleep(500); 
		WaitUntilElementClickable(CardNumber_Textbox);
	
		if(billing_billingSameasShipping.isSelected()) {
			billing_billingSameasShipping.click();
			}
		
		//get the billing address Details from the test data sheet
		
		List<String> cardNumData = getColumnData("creditCardInfo","CardNumber");
		String cardNumber = cardNumData.get(1);
		List<String> expMonthData = getColumnData("creditCardInfo","ExpMonth");
		String expMonth = expMonthData.get(1);
		List<String> expYearData = getColumnData("creditCardInfo","ExpYear");
		String expYear = expYearData.get(1);	
		List<String> firstNameData = getColumnData("creditCardInfo","firstName");
		String firstName = firstNameData.get(1);
		List<String> lastNameData = getColumnData("creditCardInfo","lastName");
		String lastName = lastNameData.get(1);
		List<String> addr1Data = getColumnData("creditCardInfo","address1");
		String addr1 = addr1Data.get(1);
		List<String> zipcodeData = getColumnData("creditCardInfo","zipcode");
		String zipcode = zipcodeData.get(1);
		/*List<String> companyData = getColumnData("creditCardInfo","company");
		String company = companyData.get(0);*/
		
		//Clear all the Billing address details
		
		billing_firstName.clear();
		billing_lastName.clear();
		billing_address1.clear();
		billing_zipCode.clear();
		billing_company.clear();
		CardNumber_Textbox.clear();
		
		//Enter the values in the Billing address fields
		billing_firstName.sendKeys(firstName);
		billing_lastName.sendKeys(lastName);
		billing_address1.sendKeys(addr1);
		billing_zipCode.sendKeys(zipcode);
		//billing_company.sendKeys(company);
		
		//enter the Payment details 
		CardNumber_Textbox.sendKeys(cardNumber);
		CvvTextbox.sendKeys("321");
		Select month =new Select(Billing_month);
		month.selectByValue(expMonth);
		Select year =new Select(Billing_year);
		year.selectByValue(expYear);
		
		//Check save to my Account Checkbox
		

		if(!billing_saveToMyAccount.isSelected())
			billing_saveToMyAccount.click();
		
		logs("Billing address details are entered and opted to save the account details to my account");
		AddScreenshot();
		
		
	}

	

}
