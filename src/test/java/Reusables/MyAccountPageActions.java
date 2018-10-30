package Reusables;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.MyAccountRepo;

public class MyAccountPageActions extends MyAccountRepo {
	
	public HashMap <String,String> accSumm_personalInfo = new HashMap<String,String>();

	
	public MyAccountPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyMyAccountSummaryTitle() {
		
		String title = myAccountSummary_title.getText().toString();
		
		if(title.contains("My Account Summary")) {
			System.out.println(title);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyDescText() {
		
		String descText = myaccount_desc_title.getText().toString();
		if(descText.contains("Welcome")) {
			
		 return true;
		
		}
		else {
			return false;
		}
		
		
		
	
		
	}
	
	
	public boolean verifyDescSummary (){
		
		String descSummary = myaccount_desc_summary.getText().toString();
		if(descSummary.contains("This is your account summary. You can change your personal information and manage the options available for your account.")) {
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	public boolean verifyEditLink_accSummary() {
		
		personal_info_edit_link.click();
		if(currentPageBreadcrumb.getText().toString().equals("Personal Information")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
public boolean verifyLeftNavSettings() {
		
		String title = myacc_leftNav_settings.getText().toString();
		
		if(title.contains("SETTINGS")) {
			System.out.println(title);
			return true;
		}else {
			return false;
		}
	}


public boolean verifyLeftNavWishlists() {
	
	String title = myacc_leftNav_wishlists.getText().toString();
	
	if(title.contains("WISH LISTS")) {
		System.out.println(title);
		return true;
	}else {
		return false;
	}
}


public boolean verifyLeftNavOrders() {
	
	String title = myacc_leftNav_orders.getText().toString();
	
	if(title.contains("ORDERS")) {
		System.out.println(title);
		return true;
	}else {
		return false;
	}
}

public boolean verifyLeftNavCoupons() {
	
	String title = myacc_leftNav_coupons.getText().toString();
	
	if(title.contains("COUPONS")) {
		System.out.println(title);
		return true;
	}else {
		return false;
	}
}



public void storePersonlInfo_accSummary() {
	
	accSumm_personalInfo.put("Name",personal_info_name_value.getText().toString().trim());
	accSumm_personalInfo.put("Address", personal_info_address_value.getText().toString().trim());
	accSumm_personalInfo.put("City",personal_info_city_value.getText().toString().trim());
	accSumm_personalInfo.put("Email", personal_info_email_value.getText().toString().trim());
	System.out.println(accSumm_personalInfo);

	logs("My Account Summary - Personal info values are stored in Hashmap --> " + accSumm_personalInfo.toString());
	
	
	
}


public void verifyPersonlInfo_accSummary(){
	
	Assert.assertTrue(accSumm_personalInfo.get("Name").contains(myacc_pi_fname.getAttribute("value")));
	logs("firstname is matching");
	Assert.assertTrue(accSumm_personalInfo.get("Name").contains(myacc_pi_lastName.getAttribute("value")));
	logs("Last Name is matching");
	Assert.assertTrue(accSumm_personalInfo.get("Address").contains(myacc_pi_address1.getAttribute("value")));
	logs("Address 1 is matching");
	Assert.assertTrue(accSumm_personalInfo.get("City").contains(myacc_pi_city.getAttribute("value")));
	logs("City is matching");
	Assert.assertTrue(accSumm_personalInfo.get("Email").contains(myacc_pi_email1.getAttribute("value")));
	logs("Email is matching");
	//myacc_pi_verifyemail1.sendKeys("newjdsnjd");
	Assert.assertTrue(accSumm_personalInfo.get("Email").contains(myacc_pi_verifyemail1.getAttribute("value")));
	logs("Verify Email is matching");
	
}


public void personalInfo_UIValidation() {
	
	Assert.assertTrue(currentPageBreadcrumb.getText().toString().equals("Personal Information"));
	ElementPresent(pi_header);
	ElementPresent(pi_wecomeBackText);
	ElementPresent(pi_lastLogonText);
	ElementPresent(pi_passwordLabel);
	ElementPresent(pi_passwordField);
	ElementPresent(pi_verifyPasswordLabel);
	ElementPresent(pi_verifyPasswordField);
	ElementPresent(pi_fnameLabel);
	ElementPresent(myacc_pi_fname);
	ElementPresent(pi_lnameLabel);
	ElementPresent(myacc_pi_lastName);
	ElementPresent(pi_companyLabel);
	ElementPresent(pi_companyField);
	ElementPresent(pi_address1Label);
	ElementPresent(myacc_pi_address1);
	ElementPresent(pi_address2Label);
	ElementPresent(pi_address2Field);
	ElementPresent(pi_cityLabel);
	ElementPresent(myacc_pi_city);
	ElementPresent(pi_zipcodeLabel);
	ElementPresent(pi_zipCodeField);
	ElementPresent(pi_stateLabel);
	ElementPresent(pi_emailLabel);
	ElementPresent(myacc_pi_email1);
	ElementPresent(pi_verifyEmailLabel);
	ElementPresent(myacc_pi_verifyemail1);
	ElementPresent(pi_phoneNumberLabel);
	ElementPresent(pi_phoneNumField);
	ElementPresent(pi_occupationLabel);
	ElementPresent(pi_birthMonthLabel);
	ElementPresent(pi_privacyPolicyLink);
	ElementPresent(pi_emailSubscriptionsCheckbox);
	Assert.assertTrue(pi_emailSubscriptionsText.getText().toString().contains("Please subscribe me to the Acme Tools mailing list, so I can learn about special offers and promotions."));
	ElementPresent(pi_updateCTA);
	
}

public void personalInfo_editPasswordCheck() throws IOException {
	List<String> pinfoPassword = getColumnData("MyAcc_PInfo","newPassword");
	String newPassword = pinfoPassword.get(0);
	List<String> pinfoVerifyPassword = getColumnData("MyAcc_PInfo","newVerifyPassword");
	String newVerifyPassword = pinfoVerifyPassword.get(0);
	pi_passwordField.sendKeys(newPassword);
	pi_verifyPasswordField.sendKeys(newVerifyPassword);
	pi_updateCTA.click();
	logs("password is edited successfully");

}

public void editPersonalInfoValues() throws IOException {
	
	List<String> pinfoFName = getColumnData("MyAcc_PInfo","firstName");
	String fname = pinfoFName.get(0);
	List<String> pinfoLName = getColumnData("MyAcc_PInfo","lastName");
	String lname = pinfoLName.get(0);
	
	List<String> pinfoCompany = getColumnData("MyAcc_PInfo","company");
	String company = pinfoCompany.get(0);
	List<String> pinfoaddress1 = getColumnData("MyAcc_PInfo","address1");
	String address1 = pinfoaddress1.get(0);
	
	List<String> pinfoaddress2 = getColumnData("MyAcc_PInfo","address2");
	String address2 = pinfoaddress2.get(0);
	List<String> pinfozipcode = getColumnData("MyAcc_PInfo","zipcode");
	String zipcode = pinfozipcode.get(0);
	
	List<String> pinfocity = getColumnData("MyAcc_PInfo","city");
	String city = pinfocity.get(0);
	
	List<String> pinfostate = getColumnData("MyAcc_PInfo","state");
	String state = pinfostate.get(0);
	
	List<String> pinfoemail = getColumnData("MyAcc_PInfo","email");
	String email = pinfoemail.get(0);

	
	List<String> pinfophonenumber = getColumnData("MyAcc_PInfo","phonenumber");
	String phonenumber = pinfophonenumber.get(0);
	
	myacc_pi_fname.clear();
	myacc_pi_fname.sendKeys(fname);
	myacc_pi_lastName.clear();
	myacc_pi_lastName.sendKeys(lname);
	pi_companyField.clear();
	pi_companyField.sendKeys(company);
	myacc_pi_address1.clear();
	myacc_pi_address1.sendKeys(address1);
	pi_address2Field.clear();
	pi_address2Field.sendKeys(address2);
	myacc_pi_city.clear();
	myacc_pi_city.sendKeys(city);
	myacc_pi_email1.clear();
	myacc_pi_email1.sendKeys(email);
	myacc_pi_verifyemail1.clear();
	myacc_pi_verifyemail1.sendKeys(email);
	pi_phoneNumField.clear();
	pi_phoneNumField.sendKeys(phonenumber);
	AddScreenshot();
	pi_updateCTA.click();
	logs("Update of Personal information is done successfully");
	AddScreenshot();
	personal_info_edit_link.click();
	
	
	Assert.assertTrue(fname.contains(myacc_pi_fname.getAttribute("value")));
	logs("firstname is updated successfully");
	Assert.assertTrue(lname.contains(myacc_pi_lastName.getAttribute("value")));
	logs("Last Name is  updated successfully");
	Assert.assertTrue(address1.contains(myacc_pi_address1.getAttribute("value")));
	logs("Address 1 updated successfully");
	Assert.assertTrue(city.contains(myacc_pi_city.getAttribute("value")));
	logs("City is updated successfully");
	Assert.assertTrue(email.contains(myacc_pi_email1.getAttribute("value")));
	logs("Email is updated successfully");

	Assert.assertTrue(email.contains(myacc_pi_verifyemail1.getAttribute("value")));
	logs("Verify Email is updated successfully");
	
	Assert.assertTrue(company.contains(pi_companyField.getAttribute("value")));
	logs("Company value is updated successfully");
	
	Assert.assertTrue(address2.contains(pi_address2Field.getAttribute("value")));
	logs("address 2 value is updated successfully");
	
	String numValue = pi_phoneNumField.getAttribute("value");
	numValue.replaceAll("[\\s\\-()]", "");
	System.out.println(numValue);
	System.out.println(phonenumber);

	
	//Assert.assertTrue(phonenumber.contains(numValue));
	logs("phone num value is updated successfully");
	
	AddScreenshot();
	pi_revertbackToOriginal();


	
}
 
public void pi_revertbackToOriginal() throws IOException {
	
	
	List<String> pinfoFName = getColumnData("MyAcc_PInfo","firstName");
	String fname = pinfoFName.get(1);
	List<String> pinfoLName = getColumnData("MyAcc_PInfo","lastName");
	String lname = pinfoLName.get(1);
	
	List<String> pinfoCompany = getColumnData("MyAcc_PInfo","company");
	String company = pinfoCompany.get(1);
	List<String> pinfoaddress1 = getColumnData("MyAcc_PInfo","address1");
	String address1 = pinfoaddress1.get(1);
	
	List<String> pinfoaddress2 = getColumnData("MyAcc_PInfo","address2");
	String address2 = pinfoaddress2.get(1);
	List<String> pinfozipcode = getColumnData("MyAcc_PInfo","zipcode");
	String zipcode = pinfozipcode.get(1);
	
	List<String> pinfocity = getColumnData("MyAcc_PInfo","city");
	String city = pinfocity.get(1);
	
	List<String> pinfostate = getColumnData("MyAcc_PInfo","state");
	String state = pinfostate.get(1);
	
	List<String> pinfoemail = getColumnData("MyAcc_PInfo","email");
	String email = pinfoemail.get(1);

	
	List<String> pinfophonenumber = getColumnData("MyAcc_PInfo","phonenumber");
	String phonenumber = pinfophonenumber.get(1);
	
	myacc_pi_fname.clear();
	myacc_pi_fname.sendKeys(fname);
	myacc_pi_lastName.clear();
	myacc_pi_lastName.sendKeys(lname);
	pi_companyField.clear();
	pi_companyField.sendKeys(company);
	myacc_pi_address1.clear();
	myacc_pi_address1.sendKeys(address1);
	pi_address2Field.clear();
	pi_address2Field.sendKeys(address2);
	myacc_pi_city.clear();
	myacc_pi_city.sendKeys(city);
	myacc_pi_email1.clear();
	myacc_pi_email1.sendKeys(email);
	myacc_pi_verifyemail1.clear();
	myacc_pi_verifyemail1.sendKeys(email);
	pi_phoneNumField.clear();
	pi_phoneNumField.sendKeys(phonenumber);
	AddScreenshot();
	pi_updateCTA.click();
	logs("Personal Info data got reverted back successfully");
	AddScreenshot();
	
}




public void pinfo_editEmailValidations() throws IOException {
	List<String> pinfoEmail = getColumnData("MyAcc_PInfo","email");
	String email = pinfoEmail.get(0);
	myacc_pi_email1.clear();
	myacc_pi_email1.sendKeys(email);
	myacc_pi_verifyemail1.clear();
	myacc_pi_verifyemail1.sendKeys(email);
	AddScreenshot();
	pi_updateCTA.click();
	logs("Edited with new Email ID in personal information section");
	
}

public void revertToOriginalEmail() throws IOException {
	

	List<String> pinfoemail = getColumnData("MyAcc_PInfo","email");
	String email = pinfoemail.get(1);
	myacc_pi_email1.clear();
	myacc_pi_email1.sendKeys(email);
	myacc_pi_verifyemail1.clear();
	myacc_pi_verifyemail1.sendKeys(email);
	AddScreenshot();
	pi_updateCTA.click();
	logs("Reverted back with original Email ID in personal information section");
	
}

public HashMap<String, String> getPersonalInfoValues() throws IOException {
	
	HashMap<String, String> pInfoValues = new HashMap<String, String>();
	pInfoValues.put("firstName", myacc_pi_fname.getAttribute("value").toString());
	pInfoValues.put("lastName", myacc_pi_lastName.getAttribute("value").toString());
	pInfoValues.put("company", pi_companyField.getAttribute("value").toString());
	pInfoValues.put("address1", myacc_pi_address1.getAttribute("value").toString());
	pInfoValues.put("address2", pi_address2Field.getAttribute("value").toString());
	pInfoValues.put("city", myacc_pi_city.getAttribute("value").toString());
	pInfoValues.put("zipcode", pi_zipCodeField.getAttribute("value").toString());
	pInfoValues.put("phoneNum", pi_phoneNumField.getAttribute("value").toString());
	pInfoValues.put("email", myacc_pi_email1.getAttribute("value").toString());
	pInfoValues.put("verifyEmail", myacc_pi_verifyemail1.getAttribute("value").toString());
	AddScreenshot();
	return pInfoValues;
	
	
}

	
	
	
	
	


	

}
