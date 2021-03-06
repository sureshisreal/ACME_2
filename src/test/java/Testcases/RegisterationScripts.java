package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class RegisterationScripts extends BaseTest{
	
	@Test
	public void Valid_SignIn_001() throws IOException {
		TestDescription("Registered User Sign In_001",
				"To verify whether registered user able to sign-in using valid credentials");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.signout();
	}
	
	@Test
	public void Invalid_SignIn_Error_Messages_Validations_002() throws IOException {
		TestDescription("Invalid_SignIn_Error_Messages_Validations_002",
				"To verify error messages are getting displayed while sign in using invalid credentials");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.SignInValidations();		
	}
	
	@Test
	public void ForgotPassword_Error_Messages_Validations_003() throws IOException {
		TestDescription("ForgotPassword_Error_Messages_Validations_003",
				"To verify error messages are getting displayed for oinvalid data in the forgot password page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.ForgotpasswordValidations();
	}
	
	@Test
	public void CreateAccount_Error_Messages_Validations_004() throws IOException {
		TestDescription("CreateAccount_Error_Messages_Validations_004",
				"To verify error messages are getting displayed for oinvalid data in the forgot password page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
	
		//registerationPage.cancelregisteration();
		//homepage.VerifyPageTitle();
		//homepage.SignInLink();
		registerationPage.CreateAccountValidations();	
	}
	
	
}
