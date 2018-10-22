package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class RegisterationScripts extends BaseTest{
	
	/*@Test
	public void Homepage_MultipleSearch() throws IOException, InterruptedException {
		TestDescription("Homepage_MultipleSearch",
				"To verify guest user able to place order using search items");
		logs("Url entered");
		homepage.VerifyPageTitle();
		List<String> SearchTermData = getColumnData("suresh", "SearchSKU");
		int searchList = SearchTermData.size();
		for (int i = 0; i < searchList; i++) {
			String SearchTermList = SearchTermData.get(i);
			homepage.searchTerm(SearchTermList);
			logs("Search term entered");
			AddScreenshot();
			categorypage.selectFirstProduct();
			logs("First Product Selected in the CLP");
			productsDetailPage.quantity("5");
			AddScreenshot();
			logs("Qunatity increased in PDP");
			productsDetailPage.AddToCart();
			logs("Product added to the cart");
			productsDetailPage.minishopcart_total();
			logs("MiniCart Clicked");
		}

	}*/
	
	
	@Test
	public void Valid_SignIn() throws IOException {
		TestDescription("Registered User Sign In",
				"To verify whether registered user able to sign-in using valid credentials");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
	}
	
	@Test
	public void Invalid_SignIn_Error_Messages_Validations() throws IOException {
		TestDescription("Invalid_SignIn_Error_Messages_Validations",
				"To verify error messages are getting displayed while sign in using invalid credentials");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.SignInValidations();		
	}
	
	@Test
	public void ForgotPassword_Error_Messages_Validations() throws IOException {
		TestDescription("ForgotPassword_Error_Messages_Validations",
				"To verify error messages are getting displayed for oinvalid data in the forgot password page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.ForgotpasswordValidations();
	}
	
	@Test
	public void CreateAccount_Error_Messages_Validations() throws IOException {
		TestDescription("ForgotPassword_Error_Messages_Validations",
				"To verify error messages are getting displayed for oinvalid data in the forgot password page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.CreateAccountValidations();	
	}
	
	
}
