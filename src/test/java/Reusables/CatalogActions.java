package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.CatalogRepo;
import pageObjectsRepo.CatgoryPageRepo;


public class CatalogActions extends CatalogRepo{

	public CatalogActions(WebDriver driver) {
		super(driver);
	}

	public void catalogClick() {
		ScrollToElement(CatalogLink);
		WaitUntilElementClickable(CatalogLink);
		CatalogLink.click();	
	}

	public void catalogValidations() {
		WaitUntilElementClickable(Catalog_SubHeader);
		ElementPresent(Catalog_SubHeader);
		ElementPresent(firstName_Textbox);
		ElementPresent(lastName_Textbox);
		ElementPresent(company_Textbox);
		ElementPresent(street_Textbox);
		ElementPresent(city_Textbox);
		ElementPresent(state_Textbox);
		ElementPresent(zipcode_Textbox);
		ElementPresent(email_Textbox);
		ElementPresent(phone_Textbox);
		ElementPresent(occupation_Textbox);
		ElementPresent(itemblock_Products);
		ElementPresent(linkAddMoreProducts_Button);
		ElementPresent(captcha);
		ElementPresent(captcha_Textbox);
		ElementPresent(Catalog_Submit);
		ElementPresent(Catalog_Cancel);
		logs("RequestQuoteValidations completed");
	}

	
	
}
