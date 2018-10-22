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
		TestDescription("MyAccount_Summary" , "To verify the my Account Summary UI");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		Assert.assertEquals(true, myaccountPage.verifyMyAccountSummaryTitle());
		logs("My Account Summary title verified");
		
		
		
		


		
		
	}

}
