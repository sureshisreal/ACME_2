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

	public void HomepageLogin() throws IOException {
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
		assertTrue(ReturningCustomer_Header.getText().contains("RETURNING"));
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(2);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(2);
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
	

	public void SignInValidations() throws IOException {
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

	public void CreateAccountValidations() {
		
	}

	

}
