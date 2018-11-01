package Reusables;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
		Assert.assertTrue(aBook_submitCTA.isDisplayed());
		Assert.assertTrue(aBook_cancelCTA.isDisplayed());
		Assert.assertFalse(aBook_updateCTA.isDisplayed());
		
		logs("While adding new address submit and cancel CTA is present and update CTA is not displayed");
/*		
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
		aBook_fname_field.sendKeys("fnameindhu");
		aBook_lastName_field.sendKeys("lname");
		AddScreenshot();
*/
		
		
		List<String> recipientData = getColumnData("addrBook","Recipient");
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String recipient = recipientData.get(0) + timeStamp;
		
		List<String> firstNameData = getColumnData("addrBook","firstName");
		String firstName = firstNameData.get(0);
		List<String> lastNameData = getColumnData("addrBook","lastName");
		String lastName = lastNameData.get(0);
		List<String> addr1Data = getColumnData("addrBook","address1");
		String addr1 = addr1Data.get(0);
		List<String> addr2Data = getColumnData("addrBook","address2");
		String addr2 = addr2Data.get(0);
		List<String> companyData = getColumnData("addrBook","company");
		String company = companyData.get(0);
		List<String> zipcodeData = getColumnData("addrBook","zipcode");
		String zipcode = zipcodeData.get(0);
		List<String> cityData = getColumnData("addrBook","city");
		String city = cityData.get(0);
		List<String> emailData = getColumnData("addrBook","email");
		String email = emailData.get(0);
		List<String> phNumData = getColumnData("addrBook","phonenumber");
		String phNum = phNumData.get(0);
		
		aBook_Recipient_field.sendKeys(recipient);
		aBook_fname_field.sendKeys(firstName);
		aBook_lastName_field.sendKeys(lastName);
		aBook_address1_field.sendKeys(addr1);
		aBook_address2Field.sendKeys(addr2);
		aBook_companyField.sendKeys(company);
		aBook_zipCodeField.sendKeys(zipcode);
		aBook_email1_field.sendKeys(email);
		aBook_city_field.sendKeys(city);
		aBook_phoneNumField.clear();
		aBook_phoneNumField.sendKeys(phNum);
		aBook_verifyemail1_field.sendKeys(email);
		logs("All the new address details are entered in the corresponding fields");
		aBook_submitCTA.click();
		Thread.sleep(5000);
		Assert.assertTrue(aBook_newAddressAdded_successMsg.isDisplayed());
		logs("New Address is added in the address Book ");		
		AddScreenshot();
		//To check if the newly added address is present in the dropdown needs to be verified once finding out the Dojo code.
		
	}


	public void removeAddress() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		aBook_addrDropdown.click();
		aBook_addrMenu.sendKeys(Keys.ARROW_DOWN);
		aBook_addrMenu.sendKeys(Keys.ENTER);
		aBook_remove_CTA.click();
		Thread.sleep(3000);
		Assert.assertTrue(aBook_removeAddress_successMsg.isDisplayed());
		logs("Address is removed in the address Book ");	
		AddScreenshot();

	}
	
}
