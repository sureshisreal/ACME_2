package Reusables;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.WebDriver;
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
	
}
