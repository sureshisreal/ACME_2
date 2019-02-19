package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class CatalogScripts extends BaseTest{

	@Test
	public void Catalog_Validations() throws IOException, InterruptedException {
		TestDescription("Categorypage_BreadcrumbsNavigation_001",
				"To verify guest user able to navigate using bread crumbs");
		homepage.VerifyPageTitle();
		catalogActionsPage.catalogClick();
		catalogActionsPage.catalogValidations();
	}
	
	
}
