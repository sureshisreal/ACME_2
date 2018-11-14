package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.RegisterationpageRepo;

public class RegisterationPageActions extends RegisterationpageRepo {
	

	public RegisterationPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String pinfo_username, pinfo_passwd;

	public void HomepageLogin() throws IOException {
		WaitUntilElementVisible(ReturningCustomer_Header);
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(0);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(0);
		System.out.println("Credentials :" + Username + "" +Password);
		LogonId_Textbox.sendKeys(Username);
		Password_Textbox.sendKeys(Password);
		//AddScreenshot();
		SignIn_Button.click();	
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		//AddScreenshot();
		logs("Login success \n UserName :" +Username+ "Password: "+Password);
		
	}
	
	
	public void HomepageLogin_AccwithNoOrders() throws IOException {
		WaitUntilElementVisible(ReturningCustomer_Header);
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(1);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(1);
		System.out.println("Credentials :" + Username + "" +Password);
		LogonId_Textbox.sendKeys(Username);
		Password_Textbox.sendKeys(Password);
		//AddScreenshot();
		SignIn_Button.click();	
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		//AddScreenshot();
		logs("Login success \n UserName :" +Username+ "Password: "+Password);
		
	}
	
	
	public void HomepageLogin_pinfoAcc() throws IOException {
		WaitUntilElementVisible(ReturningCustomer_Header);
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> UsernameData = getColumnData("SignIn","Username");
		String pinfo_username = UsernameData.get(2);
		
		List<String> PssswordData = getColumnData("SignIn","Password");
		String pinfo_passwd = PssswordData.get(2);
		String H;
		System.out.println(pinfo_username);
		System.out.println(pinfo_passwd);
		
		System.out.println("Credentials :" + pinfo_username + "" +pinfo_passwd);
		LogonId_Textbox.sendKeys(pinfo_username);
		Password_Textbox.sendKeys(pinfo_passwd);
		//AddScreenshot();
		SignIn_Button.click();	
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		//AddScreenshot();
		logs("Login success \n UserName :" +pinfo_username+ "Password: "+pinfo_passwd);
		
	}
	

	public void SignInValidations() throws IOException {
		WaitUntilElementVisible(ReturningCustomer_Header);
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> ErrorMsgData = getColumnData("SignIn","SignInErrorMsg");
		String ErrorMsg1 = ErrorMsgData.get(0);
		LogonId_Textbox.sendKeys("InvalidUsername");
		SignIn_Button.click();
		Assert.assertEquals(ErrorMsg1,logonErrorMessage.getText());
		LogonId_Textbox.clear();
		String ErrorMsg2 = ErrorMsgData.get(1);
		Password_Textbox.sendKeys("InvalidPassword");
		SignIn_Button.click();
		Assert.assertEquals(ErrorMsg2,logonErrorMessage.getText());
		Password_Textbox.clear();
		LogonId_Textbox.sendKeys("InvalidUsername");
		Password_Textbox.sendKeys("InvalidPassword");
		AddScreenshot();
		SignIn_Button.click();
		Assert.assertEquals(ErrorMsg1,logonErrorMessage.getText());
		logs("SignIn textbox Validations passed");
		
	}

	public void ForgotpasswordValidations() throws IOException {
		List<String> ForgotPasswordErrorMsgData = getColumnData("SignIn","ForgotpasswordErrorMsg");
		String ForgotErrorMsg = ForgotPasswordErrorMsgData.get(0);
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(0);
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		Forgotpassword_Link.click();
		logs("Forgotpassword_Link clicked ");
		String forgotHeader = Forgotpassword_Header.getText(); 
		System.out.println("forgotHeader" +forgotHeader);
		assertTrue(forgotHeader.contains("Forgot your password?"));
		logs("Forgotpassword_Header verified");
		LogonId_Textbox.sendKeys("InvalidUsername");
		logs("Invalid username entered");
		Forgotpassword_SendMeValidationsLink.click();
		Assert.assertEquals(ForgotErrorMsg,Forgotpassword_ErrorMsg.getText());
		logs("Forgotpassword Error message verified");
		LogonId_Textbox.clear();
		LogonId_Textbox.sendKeys(Username);
		logs("Valid username entered");
		Forgotpassword_SendMeValidationsLink.click();
		assertTrue(Forgotpassword_ResetSuccessText.getText().contains("Your password has been sent to you."));
		logs("Forgotpassword success message verified");
		Forgotpassword_ResetContinueLogin.click();
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		logs("login page displayed");		
	}

	public void CreateAccountValidations() throws IOException {
		WaitUntilElementVisible(submit_Button);
		submit_Button.click();
		AddScreenshot();
		logonPassword_Textbox.sendKeys("P@ssw0rd");
		submit_Button.click();
		logonPasswordVerify_Textbox.sendKeys("P@ssw0rd");
		submit_Button.click();
		firstName_Textbox.sendKeys("firstName");
		submit_Button.click();
		lastName_Textbox.sendKeys("lastname");
		submit_Button.click();
		address1_Textbox.sendKeys("address1");
		submit_Button.click();
		city_Textbox.sendKeys("New york");
		submit_Button.click();
		zipCode_Textbox.sendKeys("10007");
		submit_Button.click();
		email1_Textbox.sendKeys("abc@yopmail.com");
		submit_Button.click();
		verifyemail1_Textbox.sendKeys("abc@yopmail.com");
		phone1_Textbox.sendKeys("6767676767");
		submit_Button.click();
		AddScreenshot();
	}
	
	public void loginWithOldPassword() throws IOException {
		
		List<String> UsernameData = getColumnData("SignIn","Username");
		String pinfo_username = UsernameData.get(2);
		
		List<String> PssswordData = getColumnData("SignIn","Password");
		String pinfo_passwd = PssswordData.get(2);
		String H;
		System.out.println(pinfo_username);
		System.out.println(pinfo_passwd);
		
		LogonId_Textbox.sendKeys(pinfo_username);
		Password_Textbox.sendKeys(pinfo_passwd);
		SignIn_Button.click();
		Assert.assertTrue(logonErrorMessage.getText().toString().contains("Either the logon ID or password entered is incorrect. Enter the information again"));
		logs("Validation with old password doesn't allow user to edit");
	}
	
	public void loginWithNewPassword() throws IOException {
		List<String> UsernameData = getColumnData("SignIn","Username");
		String pinfo_username = UsernameData.get(2);
		LogonId_Textbox.clear();
		LogonId_Textbox.sendKeys(pinfo_username);
		Password_Textbox.sendKeys("Qwerty!2345");
		SignIn_Button.click();
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		AddScreenshot();
		logs("Login success \n with new UserName and password" + pinfo_username + "Qwerty!2345");
	}
	
	
	public void loginwithOldEmail() throws IOException {
		
		List<String> UsernameData = getColumnData("SignIn","Username");
		String pinfo_username = UsernameData.get(2);
		
		List<String> PssswordData = getColumnData("SignIn","Password");
		String pinfo_passwd = PssswordData.get(2);
		String H;
		System.out.println(pinfo_username);
		System.out.println(pinfo_passwd);
		
		LogonId_Textbox.sendKeys(pinfo_username);
		Password_Textbox.sendKeys(pinfo_passwd);
		SignIn_Button.click();
		Assert.assertTrue(logonErrorMessage.getText().toString().contains("Either the logon ID or password entered is incorrect. Enter the information again"));
		logs("Validation with old Email ID doesn't allow user to edit");
	}
	
	public void loginwithNewEmail() throws IOException {
		
		
		List<String> PssswordData = getColumnData("SignIn","Password");
		String pinfo_passwd = PssswordData.get(2);
		String H;
		System.out.println(pinfo_passwd);
		LogonId_Textbox.clear();
		LogonId_Textbox.sendKeys("pinfoedited@yopmail.com");
		Password_Textbox.sendKeys(pinfo_passwd);
		SignIn_Button.click();
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		AddScreenshot();
		logs("Login success \n with new UserName and password" + "pinfoedited@yopmail.com" + pinfo_passwd);
		
		
		
	}
	
	public void HomepageLoginSpecificAcc(int i) throws IOException {
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(i);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(i);
		System.out.println("Credentials :" + Username + "" +Password);
		LogonId_Textbox.sendKeys(Username);
		Password_Textbox.sendKeys(Password);
		//AddScreenshot();
		SignIn_Button.click();	
		String welcomeText= MyAccount_WelcomeText.getText();
		assertTrue(welcomeText.contains("Welcome,"));
		//AddScreenshot();
		logs("Login success \n UserName :" +Username+ "Password: "+Password);
		
	}


	public void cancelregisteration() throws IOException {
		WaitUntilElementVisible(submit_Button);
		submit_Button.click();
		AddScreenshot();
		logonPassword_Textbox.sendKeys("P@ssw0rd");
		logonPasswordVerify_Textbox.sendKeys("P@ssw0rd");
		firstName_Textbox.sendKeys("firstName");
		lastName_Textbox.sendKeys("lastname");
		address1_Textbox.sendKeys("address1");
		city_Textbox.sendKeys("New york");
		zipCode_Textbox.sendKeys("10007");
		email1_Textbox.sendKeys("abc@yopmail.com");
		verifyemail1_Textbox.sendKeys("abc@yopmail.com");
		phone1_Textbox.sendKeys("6767676767");
		cancel_Button.click();
		AddScreenshot();		
	}
	
	
	
	
	
	

	

}
