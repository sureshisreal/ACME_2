package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class PDPScripts extends BaseTest{
	
	@Test
	public void PDP_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.fieldValidations();
		productsDetailPage.lowPriceGuaranteeAnchor();
		productsDetailPage.QtyErrorMsg();
		productsDetailPage.wishlist();
	}
	
	@Test
	public void PDP_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.fieldValidations();
		productsDetailPage.reviewlink();
	}
	
	@Test
	public void PDP_AddRecommendations_003() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddRecommendations_Reg_004() throws IOException, InterruptedException {
		TestDescription("PDP_AddRecommendations_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct_005() throws IOException, InterruptedException {
		TestDescription("PDP_FieldValidations",
				"To verify guest user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	@Test
	public void PDP_AddAlsoViewedProduct_Reg_006() throws IOException, InterruptedException {
		TestDescription("PDP_AddAlsoViewedProduct_Reg",
				"To verify registered user able to view all the fields in the pdp page");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		productsDetailPage.AddRecommendatedProduct();
	}
	
	
}
