package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest{
	
	@Test
	public void Homepage_Header_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("Homepage_Header_FieldValidations_001",
				"To verify guest user able to view all the fields in the homepage header");
		homepage.VerifyPageTitle();
		homepage.HeaderValidations();
		homepage.TopMenuValidations();
		homepage.MenuValidations();
	}
	
	@Test
	public void Homepage_Header_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("Homepage_Header_FieldValidations_Reg_002",
				"To verify registered user able to view all the fields in the homepage header");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.HeaderValidations();
		homepage.TopMenuValidations();
		homepage.MenuValidations();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuCategory_003() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuCategory_003",
				"To verify guest user able to add product from the header menu Categories");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.selectRandomProduct();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuCategory_Reg_004() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuCategory_Reg_004",
				"To verify registered user able to add product from the header menu Categories");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.CategoryMenuSelection();
		categorypage.selectRandomProduct();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuBrands_005() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuBrands_005",
				"To verify guest user able to add product from the header menu Brands");
		homepage.VerifyPageTitle();
		homepage.BrandMenuSelection();
		//categorypage.selectRandomProduct();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuBrands_Reg_006() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuBrands_Reg_006",
				"To verify registered user able to add product from the header menu Brands");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.BrandMenuSelection();
		//categorypage.selectRandomProduct();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuWhatsNew_007() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuWhatsNew_007",
				"To verify guest user able to add product from the header menu Brands");
		homepage.VerifyPageTitle();
		homepage.WhatsNew_MenuSelection();
		categorypage.selectRandomProduct();
	}
	
	@Test
	public void Homepage_AddRandomProductFromMenuWhatsNew_Reg_008() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuWhatsNew_Reg_008",
				"To verify registered user able to add product from the header menu Brands");
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.WhatsNew_MenuSelection();
		categorypage.selectRandomProduct();
	}
	
	
}
