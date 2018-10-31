package Reusables;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjectsRepo.MyAccAddressBookRepo;
import pageObjectsRepo.MyAccountCCRepo;


public class MyAccAddressBookPageActions extends MyAccAddressBookRepo{

			
	public MyAccAddressBookPageActions(WebDriver driver) {
				super(driver);
				// TODO Auto-generated constructor stub
			}
			
			
	public void aBook_UIValidation() {
		
		ElementPresent(aBook_header);
		ElementPresent(aBook_addrDropdown);
		ElementPresent(aBook_addNew_CTA);
		ElementPresent(aBook_remove_CTA);
		ElementPresent(aBook_fnameLabel);
		ElementPresent(aBook_lnameLabel);
		ElementPresent(aBook_fname_field);
		ElementPresent(aBook_lastName_field);
		ElementPresent(aBook_companyLabel);
		ElementPresent(aBook_companyField);
		ElementPresent(aBook_address1Label);
		ElementPresent(aBook_address1_field);
		ElementPresent(aBook_address2Label);
		ElementPresent(aBook_address2Field);
		ElementPresent(aBook_cityLabel);
		ElementPresent(aBook_city_field);
		ElementPresent(aBook_zipcodeLabel);
		ElementPresent(aBook_zipCodeField);
		ElementPresent(aBook_stateLabel);
		ElementPresent(aBook_phoneNumberLabel);
		ElementPresent(aBook_phoneNumField);
		ElementPresent(aBook_emailLabel);
		ElementPresent(aBook_email1_field);
		ElementPresent(aBook_verifyEmailLabel);
		ElementPresent(aBook_verifyemail1_field);
		ElementPresent(aBook_updateCTA);
		
		logs("My Shipping Address Book Page UI elements are verified Successfully");
				
			
			

}


	public void comparePinfo_aBook(HashMap<String, String> pInfoDetails) throws IOException {
		// TODO Auto-generated method stub

		Assert.assertTrue(pInfoDetails.get("firstName").equals(aBook_fname_field.getAttribute("value")));
		logs("firstName is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("lastName").equals(aBook_lastName_field.getAttribute("value")));
		logs("Last name is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("company").equals(aBook_companyField.getAttribute("value")));
		logs("Company is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("address1").equals(aBook_address1_field.getAttribute("value")));
		logs("Address1 is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("address2").equals(aBook_address2Field.getAttribute("value")));
		logs("Address2 is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("city").equals(aBook_city_field.getAttribute("value")));
		logs("City is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("zipcode").equals(aBook_zipCodeField.getAttribute("value")));
		logs("Zipcode is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("phoneNum").equals(aBook_phoneNumField.getAttribute("value")));
		logs("PhoneNum is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("email").equals(aBook_email1_field.getAttribute("value")));
		logs("Email is matching with personal information");
		Assert.assertTrue(pInfoDetails.get("verifyEmail").equals(aBook_verifyemail1_field.getAttribute("value")));
		logs("Verify Email is matching with personal information");
		AddScreenshot();
	}


	public void ensureBlankFields_addNewAddress() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		aBook_addNew_CTA.click();
		Thread.sleep(10000);
		//To ensure if all the fields are empty
		
		System.out.println("Indhu Test" +aBook_Recipient_field.getAttribute("value"));
		
		String abc = aBook_Recipient_field.getAttribute("value");
		
		Assert.assertTrue(abc.isEmpty());
		
		logs("recipient field passed");
		
		Assert.assertTrue(aBook_fname_field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_lastName_field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_companyField.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_address1_field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_address2Field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_city_field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_zipCodeField.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_email1_field.getAttribute("value").toString().equals(""));
		Assert.assertTrue(aBook_verifyemail1_field.getAttribute("value").toString().equals(""));
		logs("firstname, lastname, company, address1, address2, city, zipcode, email, verify email fields are blank");
		Assert.assertTrue(aBook_phoneNumField.getAttribute("value").toString().equals(""));
		AddScreenshot();
		logs("All the fields are blank while Adding new address in the address book");
	
		
		
		
		
	}


	public void addNewAddress() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		aBook_addNew_CTA.click();
		Thread.sleep(10000);
		
		aBook_stateDiv.click();
		int randomNum = ThreadLocalRandom.current().nextInt(1, 54);
		
		System.out.println(randomNum);

		for(int i=1;i<=randomNum;i++) {
		aBook_stateTab2.sendKeys(Keys.ARROW_DOWN);
		}
		aBook_stateTab2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		AddScreenshot();
		aBook_Recipient_field.sendKeys("rec1");
		aBook_fname_field.sendKeys("fname");
		aBook_lastName_field.sendKeys("lname");
		AddScreenshot();

		
		
		
		
		
		

		
		

		
		
		
		
		
	}
	
}
