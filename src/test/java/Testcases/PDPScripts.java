package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class PDPScripts extends BaseTest{
	
	@Test
	public void PDP_FieldValidations() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.fieldValidations();
	}
	
	@Test
	public void PDP_FieldValidations_Reg() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.fieldValidations();
	}
	
	@Test
	public void PDP_AddRecommendations() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddRecommendations_Reg() throws IOException, InterruptedException {
		TestDescription("PDP_AddRecommendations_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct_Reg() throws IOException, InterruptedException {
		TestDescription("PDP_AddAlsoViewedProduct_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
}
