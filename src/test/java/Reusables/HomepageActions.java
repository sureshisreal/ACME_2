package Reusables;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

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

	public void SignInLink() {
		SignInRegister_Link.click();
	}

	public void VerifyPageTitle() throws IOException {

		String title = driver.getTitle();
		System.out.println("PageTitle : " + title);
		Assert.assertEquals(driver.getTitle(),
				"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
		logs("Page title : " + title);
		logs("Page : " + title + " title : " + title);
		AddScreenshot();
		logs("Screenshot Captured");
	}

}
