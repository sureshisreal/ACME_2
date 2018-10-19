package Reusables;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.google.common.base.Predicate;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public HomepageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm) {
		searchTextbox.sendKeys(SearchTerm);
		searchSubmit.click();
	}

	public void SignInLink()  {
		SignInRegister_Link.click();
		logs("SignInRegister_Link clicked");
	}


	public void VerifyPageTitle() throws IOException {
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),
				"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
		logs("Page title verified : " + title);
		AddScreenshot();
	}

	public void returnhomepage() {
		AcmeLogo.click();		
	}

}
