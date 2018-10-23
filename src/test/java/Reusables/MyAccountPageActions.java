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
		
		String descText = myaccount_desc_title.getText().toString();
		if(descText.contains("Welcome")) {
			
		 return true;
		
		}
		else {
			return false;
		}
		
		
		
	
		
	}
	
	
	public boolean verifyDescSummary (){
		
		String descSummary = myaccount_desc_summary.getText().toString();
		if(descSummary.contains("This is your account summary. You can change your personal information and manage the options available for your account.")) {
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	
	


	

}
