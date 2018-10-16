package Reusables;

import pageObjectsRepo.RegisterationpageRepo;

public class RegisterationPageActions extends RegisterationpageRepo {

	public void HomepageLogin() throws InterruptedException {
		Thread.sleep(1000);
		LogonId_Textbox.sendKeys("acmeip2");
		Password_Textbox.sendKeys("P@ssw0rd");
		SignIn_Button.click();		
	}

	

}
