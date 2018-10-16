package Reusables;

import org.openqa.selenium.support.ui.Select;

import pageObjectsRepo.ShippingPageRepo;


public class ShippingPageActions extends ShippingPageRepo {


	public void GuestShippingAddress() {
		Shipping_firstName.sendKeys("FirstName");
		Shipping_lastName.sendKeys("lastName");
		Shipping_address1.sendKeys("290 Broadway");
		Shipping_organizationName.sendKeys("test");
		Shipping_zipCode.sendKeys("10007");
		Shipping_city.sendKeys("Narragansetta");
		Shipping_state.sendKeys("New York");
		Shipping_phone.sendKeys("1231231231");
		Shipping_email1.sendKeys("test123@gmail.com");
		Select occupation =new Select(Shipping_occupation);
		occupation.selectByValue("Carpentry Work");
		PlaceOrder_Button.click();
	}
	
	public void UseEnteredAddress(){
		System.out.println("UseEnteredAddress_RadioButton.isDisplayed()" +UseEnteredAddress_RadioButton.isDisplayed());
		if(UseEnteredAddress_RadioButton.isDisplayed()) {
		//if(UseEnteredAddress_RadioButton != null)
			UseEnteredAddress_RadioButton.click();	}
	}
	
	public void UseSuggestedAddress(){
		if(UseSuggestedAddress_RadioButton !=null)
		UseSuggestedAddress_RadioButton.click();
	}

}