package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class RequestQuote extends BaseTest {
	
	@Test	
	public void RequestQuote_Validations() throws IOException, InterruptedException {		
		TestDescription("RequestQuote_Validations_001" , "To verify all the feilds are present in the Request Quote");
			logs("Url entered");
			AddScreenshot();
			requestQuoteActionsPage.requestquoteLink();
			requestQuoteActionsPage.RequestQuoteValidations();
	}
	
	@Test	
	public void RequestQuote_Validations_Reg() throws IOException, InterruptedException {		
		TestDescription("Buyers_Organization_EditOrganization_002" , "To verify all the feilds are present in the Request Quote Reg user");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			requestQuoteActionsPage.requestquoteLink();
			requestQuoteActionsPage.RequestQuoteValidations();
	}
	
	
}
