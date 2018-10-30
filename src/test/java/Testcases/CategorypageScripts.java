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
	
	
	
}
