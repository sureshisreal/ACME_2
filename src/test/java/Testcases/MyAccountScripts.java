package Testcases;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Reusables.HomepageActions;
import pageObjectsRepo.MyAccountRepo;
import utilities.BaseTest;

public class MyAccountScripts extends BaseTest{
	
	@Test
	public void myAccountSummary() throws IOException, InterruptedException{
		
		TestDescription("MyAccount_Summary_001" , "To verify the my Account Summary UI");
		
		
		
		
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		
	
		logs("Logged in as registered user");
		Assert.assertEquals(true, myaccountPage.verifyMyAccountSummaryTitle());
		logs("My Account Summary title verified");
		
		Assert.assertEquals(true, myaccountPage.verifyDescText());
		logs("Description welcome text of My Account Summary is verified");
		
		Assert.assertEquals(true, myaccountPage.verifyDescSummary());
		logs("Description Summary  text of My Account Summary is verified");
		
		ElementPresent(myaccountPage.personal_information_title);
		logs("Personal information Title is present");
		
		ElementPresent(myaccountPage.personal_info_name_label);
		ElementPresent(myaccountPage.personal_info_address_label);
		ElementPresent(myaccountPage.personal_info_city_label);
		ElementPresent(myaccountPage.personal_info_email_label);
		logs("Personal information section with name, address city and Email are present");
		
		ElementPresent(myaccountPage.personal_info_edit_link);
		logs("Edit link for ");
		
		
		
		
		
		
		
	 
		
		
		
		

		
		
		
		
		
		


		
		
	}

}
