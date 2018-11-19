package Reusables;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.MyAccountCCRepo;


public class MyAccountCCPageActions  extends MyAccountCCRepo {
	
	
	public MyAccountCCPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void mcc_UIValidation() throws IOException {
		// TODO Auto-generated method stub
		
		
		//Credit Card details related UI checks
		ElementPresent(mcc_header);
		ElementPresent(mcc_subHeader);
		ElementPresent(mcc_pyamentType_label);
		ElementPresent(mcc_paymentTypeDropdown);
		ElementPresent(mcc_paymentType_tc);
		ElementPresent(mcc_cardNumLabel);
		ElementPresent(mcc_cardNumField);
		ElementPresent(mcc_expMonthLabel);
		ElementPresent(mcc_expMonthDropdown);
		ElementPresent(mcc_expYearLabel);
		ElementPresent(mcc_expYearDropDown);
		
		// Billing address Section UI checks
		ElementPresent(mcc_billingAddressHeader);
		ElementPresent(mcc_bill_fnameLabel);
		ElementPresent(mcc_bill_fnameField);
		ElementPresent(mcc_bill_lnameLabel);
		ElementPresent(mcc_bill_lnameField);
		ElementPresent(mcc_bill_addr1Label);
		ElementPresent(mcc_bill_addr1Field);
		ElementPresent(mcc_bill_addr2Label);
		ElementPresent(mcc_bill_addr2Field);
		ElementPresent(mcc_bill_cityLabel);
		ElementPresent(mcc_bill_cityField);
		ElementPresent(mcc_bill_stateLabel);
		ElementPresent(mcc_bill_zipCodeLabel);
		ElementPresent(mcc_bill_zipCodeField);
		ElementPresent(mcc_bill_emailLabel);
		ElementPresent(mcc_bill_emailField);
		ElementPresent(mcc_bill_phNumField);
		
		
		
		ElementPresent(mcc_shippingAddressHeader);
		ElementPresent(mcc_ship_sameAsShippingChkbox);
		ElementPresent(mcc_ship_sameAsShippingLabel);
		ElementPresent(mcc_ship_fnameLabel);
		ElementPresent(mcc_ship_fnameField);
		ElementPresent(mcc_ship_lnameLabel);
		ElementPresent(mcc_ship_lnameField);
		ElementPresent(mcc_ship_addr1Label);
		ElementPresent(mcc_ship_addr1Field);
		ElementPresent(mcc_ship_addr2Label);
		ElementPresent(mcc_ship_addr2Field);
		ElementPresent(mcc_ship_cityLabel);
		ElementPresent(mcc_ship_cityField);
		ElementPresent(mcc_ship_stateLabel);
		ElementPresent(mcc_ship_zipCodeLabel);
		ElementPresent(mcc_ship_zipCodeField);
		ElementPresent(mcc_ship_emailLabel);
		ElementPresent(mcc_ship_emailField);
		ElementPresent(mcc_ship_phNumLabel);
		ElementPresent(mcc_ship_phNumField);
		ElementPresent(mcc_updateCTA);
		logs("UI validations of My Credit card information is complete");
		AddScreenshot();
		
		
		
	}

	public void addNewCreditCardInfo() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		mcc_paymentTypeDropdown.click();
		mcc_payMethod_visaOpt.click();
		
		List<String> cardNumData = getColumnData("creditCardInfo","CardNumber");
		String cardNumber = cardNumData.get(0);
		List<String> expMonthData = getColumnData("creditCardInfo","ExpMonth");
		String expMonth = expMonthData.get(0);
		List<String> expYearData = getColumnData("creditCardInfo","ExpYear");
		String expYear = expYearData.get(0);	
		List<String> firstNameData = getColumnData("creditCardInfo","firstName");
		String firstName = firstNameData.get(0);
		List<String> lastNameData = getColumnData("creditCardInfo","lastName");
		String lastName = lastNameData.get(0);
		List<String> addr1Data = getColumnData("creditCardInfo","address1");
		String addr1 = addr1Data.get(0);
		List<String> addr2Data = getColumnData("creditCardInfo","address2");
		String addr2 = addr2Data.get(0);
		List<String> zipcodeData = getColumnData("creditCardInfo","zipcode");
		String zipcode = zipcodeData.get(0);
		List<String> cityData = getColumnData("creditCardInfo","city");
		String city = cityData.get(0);
		List<String> emailData = getColumnData("creditCardInfo","email");
		String email = emailData.get(0);
		List<String> phNumData = getColumnData("creditCardInfo","phonenumber");
		String phNum = phNumData.get(0);
		logs("Test data loaded");
			
		mcc_cardNumField.clear();
		mcc_bill_fnameField.clear();
		mcc_bill_lnameField.clear();
		mcc_bill_addr1Field.clear();
		mcc_bill_addr2Field.clear();
		mcc_bill_cityField.clear();
		mcc_bill_zipCodeField.clear();
		mcc_bill_emailField.clear();
		mcc_bill_phNumField.clear();
		mcc_bill_phNumField.click();
		mcc_bill_phNumField.sendKeys(phNum);

		logs("Legacy credit card info details are cleared");
		mcc_cardNumField.sendKeys(cardNumber);
		
		mcc_expMonthDropdown.click();
		mcc_expMonthValue.click();
		
		mcc_expYearDropDown.click();
		mcc_expYearValue.click();
		
		mcc_ship_sameAsShippingChkbox.click();
		
		mcc_bill_fnameField.sendKeys(firstName);
		mcc_bill_lnameField.sendKeys(lastName);
		mcc_bill_addr1Field.sendKeys(addr1);
		mcc_bill_addr2Field.sendKeys(addr2);
		mcc_bill_zipCodeField.sendKeys(zipcode);
		mcc_bill_emailField.sendKeys(email);
		mcc_bill_cityField.sendKeys(city);
		
		//mcc_bill_phNumField.sendKeys(phNum);
		
		System.out.println(phNum);
		
		AddScreenshot();
		logs("Test data entered successfully");
		
		Thread.sleep(3000);
		mcc_updateCTA.click();
		
		
	}

	public void verifySavedCreditDetailsFromCheckout() throws IOException {
		// TODO Auto-generated method stub
		String mcc_cardNum = mcc_cardNumField.getAttribute("value").toString();
		String temp = mcc_cardNum.replace("*", "");
		System.out.println(temp);
		
		String mcc_expYear = mcc_selectedExpiryYear.getAttribute("value");
		String mcc_expMonth = mcc_selectedExpiryMonth.getAttribute("value");
		
		String mcc_fname = mcc_bill_fnameField.getAttribute("value");
		String mcc_lname = mcc_bill_lnameField.getAttribute("value");
		String mcc_addr1 = mcc_bill_addr1Field.getAttribute("value");
		String mcc_zipcode = mcc_bill_zipCodeField.getAttribute("value");
		
		
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
		
		Assert.assertTrue(cardNumber.contains(temp));
		logs("Card number used in checkout is saved successfully in My Account");
		
		Assert.assertTrue(expMonth.equals(mcc_expMonth));
		logs("Expiry Month used in checkout is saved successfully in My Account");
		
		Assert.assertTrue(expYear.equals(mcc_expYear));
		logs("Exp Year used in checkout is saved successfully in My Account");
		
		Assert.assertTrue(firstName.equals(mcc_fname));
		logs("First name used in checkout is saved successfully in My Account");
		
		
		Assert.assertTrue(lastName.equals(mcc_lname));
		logs("Last name used in checkout is saved successfully in My Account");
		
		
		Assert.assertTrue(addr1.equals(mcc_addr1));
		logs("Address 1 used in checkout is saved successfully in My Account");;
		
		Assert.assertTrue(zipcode.equals(mcc_zipcode));
		logs("Zipcode used in checkout is saved successfully in My Account");
		
		AddScreenshot();
		
		
	}
	
	
	
	
	

}
