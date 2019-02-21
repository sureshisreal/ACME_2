package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class OrganizationBuyer extends BaseTest {
	
	@Test	
	public void Buyers_Organization_OrganizationValidations() throws IOException, InterruptedException {		
		TestDescription("Buyers_Organization_EditOrganization_001" , "To verify user able to edit organization");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.B2B_Login();
			organizationBuyerPage.Organizationpage();
			organizationBuyerPage.OrganizationValidations();	
	}
	
	@Test	
	public void Buyers_Organization_EditValidations() throws IOException, InterruptedException {		
		TestDescription("Buyers_Organization_EditOrganization_002" , "To verify user able to edit organization");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.B2B_Login();
			organizationBuyerPage.Organizationpage();
			organizationBuyerPage.AddressValidation();
			organizationBuyerPage.ContactValidation();
			organizationBuyerPage.MemberValidations();	
	}

	@Test	
	public void Buyers_Organization_BreadCrumbValidations() throws IOException, InterruptedException {		
		TestDescription("Buyers_Organization_BreadCrumbValidations_003" , "To verify user able to edit organization");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.B2B_Login();
			organizationBuyerPage.Organizationpage();
			categorypage.MyAccountBreadcrumbs();
	}
	
}
