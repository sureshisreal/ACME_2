package Reusables;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public void searchTerm() {
		searchTextbox.sendKeys("hammer");
		searchSubmit.click();
	}

	public void SignInLink() {
		SignInRegister_Link.click();
	}

	public Boolean VerifyPageTitle() {
		String HomepageTitle = titleText.getText();
		System.out.println("HomepageTitle" + HomepageTitle);
		if (HomepageTitle
				.contains("Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+")) {
			System.out.println("Page Title Verified");
			return true;
		}
		return false;
	}

}
