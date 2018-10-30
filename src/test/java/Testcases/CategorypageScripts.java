package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class CategorypageScripts extends BaseTest{

	@Test
	public void Categorypage_BreadcrumbsNavigation() throws IOException, InterruptedException {
		TestDescription("Categorypage_BreadcrumbsNavigation",
				"To verify guest user able to navigate using breadcrumbs");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.Breadcrumbs();
	}
	
	@Test
	public void Categorypage_BreadcrumbsNavigation_Reg() throws IOException, InterruptedException {
		TestDescription("Categorypage_BreadcrumbsNavigation_Reg",
				"To verify registered user able to navigate using breadcrumbs");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.Breadcrumbs();
	}
	
	@Test
	public void Categorypage_Validations() throws IOException, InterruptedException {
		TestDescription("Categorypage_Validations",
				"To verify guest user able to view all the available fields in the categorypage");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.FieldValidations();
	}
	
	@Test
	public void Categorypage_Validations_Reg() throws IOException, InterruptedException {
		TestDescription("Categorypage_Validations_Reg",
				"To verify guest user able to view all the available fields in the categorypage");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.FieldValidations();
	}
	
	@Test
	public void Categorypage_AddTopSellingItem() throws IOException, InterruptedException {
		TestDescription("Categorypage_AddTopSellingItem",
				"To verify guest user able to add top selling item in the categorypage");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.AddTopSellingItem();
	}
	
	@Test
	public void Categorypage_AddTopSellingItem_Reg() throws IOException, InterruptedException {
		TestDescription("Categorypage_AddTopSellingItem_Reg",
				"To verify guest user able to add top selling item in the categorypage");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.AddTopSellingItem();
	}
	
}
