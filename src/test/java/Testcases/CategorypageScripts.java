package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class CategorypageScripts extends BaseTest{

/*	@Test
	public void Categorypage_BreadcrumbsNavigation_001() throws IOException, InterruptedException {
		TestDescription("Categorypage_BreadcrumbsNavigation_001",
				"To verify guest user able to navigate using breadcrumbs");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.Breadcrumbs();
	}
	
	@Test
	public void Categorypage_BreadcrumbsNavigation_Reg_002() throws IOException, InterruptedException {
		TestDescription("Categorypage_BreadcrumbsNavigation_Reg_002",
				"To verify registered user able to navigate using breadcrumbs");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.Breadcrumbs();
	}
	
	@Test
	public void Categorypage_Validations_003() throws IOException, InterruptedException {
		TestDescription("Categorypage_Validations_003",
				"To verify guest user able to view all the available fields in the categorypage");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.FieldValidations();
	}
	
	@Test
	public void Categorypage_Validations_Reg_004() throws IOException, InterruptedException {
		TestDescription("Categorypage_Validations_Reg_004",
				"To verify guest user able to view all the available fields in the categorypage");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.FieldValidations();
	}
	
	@Test
	public void Categorypage_AddTopSellingItem_005() throws IOException, InterruptedException {
		TestDescription("Categorypage_AddTopSellingItem_005",
				"To verify guest user able to add top selling item in the categorypage");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.AddTopSellingItem();
	}*/
	
	@Test
	public void Categorypage_AddTopSellingItem_Reg_006() throws IOException, InterruptedException {
		TestDescription("Categorypage_AddTopSellingItem_Reg_006",
				"To verify guest user able to add top selling item in the categorypage");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.AddTopSellingItem();
	}
	
}
