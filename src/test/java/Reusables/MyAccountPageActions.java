package Reusables;


import org.openqa.selenium.WebDriver;

import pageObjectsRepo.MyAccountRepo;

public class MyAccountPageActions extends MyAccountRepo {
	
	public MyAccountPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean verifyMyAccountSummaryTitle() {
		
		String title = myAccountSummary_title.getText().toString();
		
		if(title.contains("My Account Summary")) {
			System.out.println(title);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyDescText() {
		return false;
		
	
		
	}
	


	

}
