package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjectsRepo.ShippingPageRepo;


public class ShippingPageActions extends ShippingPageRepo {


	public ShippingPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void ShippingAddressFieldValidation() {
		WaitUntilElementVisible(Shipping_firstName);
		ElementPresent(Shipping_firstName);
		ElementPresent(Shipping_lastName);
		ElementPresent(Shipping_address1);
		ElementPresent(Shipping_organizationName);
		ElementPresent(Shipping_zipCode);
		ElementPresent(Shipping_city);
		ElementPresent(Shipping_state);
		ElementPresent(Shipping_phone);
		ElementPresent(Shipping_email1);
		logs("Shipping fields validated");
		PlaceOrder_Button.click();
	}

	public void GuestShippingAddress() {
		if(Shipping_firstName.isDisplayed()) {
		WaitUntilElementVisible(Shipping_firstName);
		Shipping_firstName.sendKeys("FirstName");
		Shipping_lastName.sendKeys("lastName");
		Shipping_address1.sendKeys("290 Broadway");
		Shipping_organizationName.sendKeys("test");
		Shipping_zipCode.sendKeys("10007");
		Shipping_city.sendKeys("New York");
		Shipping_state.sendKeys("New York");
		Shipping_phone.sendKeys("1231231231");
		Shipping_email1.sendKeys("test123@gmail.com");
		Select occupation =new Select(Shipping_occupation);
		occupation.selectByValue("Carpentry Work");
		logs("Shipping address entered");
		PlaceOrder_Button.click();
		}
	}
	
	public void UseEnteredAddress() throws InterruptedException{
		Thread.sleep(60000);
		System.out.println("UseEnteredAddress_RadioButton.isDisplayed()" +UseEnteredAddress_RadioButton.isDisplayed());
		if(UseEnteredAddress_RadioButton.isDisplayed()) {
			UseEnteredAddress_RadioButton.click();	}
	}
	
	public void UseSuggestedAddress() throws InterruptedException{
		Thread.sleep(60000);
		if(UseSuggestedAddress_RadioButton !=null)
		UseSuggestedAddress_RadioButton.click();
	}
	
	public void shippingOptions() throws InterruptedException{
		int randshipping = rand.nextInt(Shippingmethod_OptionsCount.size()+1); 
		Shippingmethod_Options(randshipping);
	}
	
	

}
