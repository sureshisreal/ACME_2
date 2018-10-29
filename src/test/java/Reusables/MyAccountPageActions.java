package Reusables;


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



	
	
	
	
	


	

}
