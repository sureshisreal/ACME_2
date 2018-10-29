package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class HomepageScripts extends BaseTest{
	
	
/*	@Test
	public void Homepage_Header_FieldValidations() throws IOException, InterruptedException {
		TestDescription("Homepage_Header_FieldValidations",
				"To verify guest user able to view all the fields in the homepage header");
		homepage.VerifyPageTitle();
		homepage.HeaderValidations();
		homepage.TopMenuValidations();
		homepage.MenuValidations();
	}*/
	
	
/*	@Test
	public void Homepage_AddRandomProductFromMenuCategory() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuCategory",
				"To verify guest user able to add product from the header menu Categories");
		homepage.VerifyPageTitle();
		homepage.CategoryMenuSelection();
		categorypage.selectRandomProduct();
	}*/
	
	@Test
	public void Homepage_AddRandomProductFromMenuBrands() throws IOException, InterruptedException {
		TestDescription("Homepage_AddRandomProductFromMenuBrands",
				"To verify guest user able to add product from the header menu Brands");
		homepage.VerifyPageTitle();
		homepage.BrandMenuSelection();
		categorypage.selectRandomProduct();
	}
	
	
}
