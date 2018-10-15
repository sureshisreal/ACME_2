package Reusables;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import pageObjectsRepo.HomepageRepo;


public class HomepageActions extends HomepageRepo {

	WebDriver driver;


	public void searchTerm() {
		searchTextbox.sendKeys("hammer");
		System.out.println("Text entered in the searchbox");
		searchSubmit.click();

	}
	
	

}
