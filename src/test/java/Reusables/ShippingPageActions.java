package Reusables;

import org.openqa.selenium.By;
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
		Select se=new Select(Shipping_occupation);
		se.selectByValue("Carpentry Work");
		PlaceOrder_Button.click();
	}

}
