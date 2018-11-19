package Reusables;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
		if(Shipping_firstName.isDisplayed()) {
		ElementPresent(Shipping_firstName);
		ElementPresent(Shipping_lastName);
		ElementPresent(Shipping_address1);
		ElementPresent(Shipping_organizationName);
		ElementPresent(Shipping_zipCode);
		ElementPresent(Shipping_city);
		ElementPresent(Shipping_state);
		ElementPresent(Shipping_phone);
		ElementPresent(Shipping_email1);
		PlaceOrder_Button.click();
		}
		logs("Shipping fields validated");
	}

	public String GuestShippingAddress() {
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String guestEmail = "test123"+timeStamp+"@yopmail.com";
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

		Shipping_email1.sendKeys(guestEmail);
		Select occupation =new Select(Shipping_occupation);
		occupation.selectByValue("Carpentry Work");
		logs("Shipping address entered");
		PlaceOrder_Button.click();
		}
		return guestEmail;
		
	}
	
	
	public String GuestShippingAddress_existingEmail() throws IOException {
		
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(0);
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

		Shipping_email1.sendKeys(Username);
		Select occupation =new Select(Shipping_occupation);
		occupation.selectByValue("Carpentry Work");
		logs("Shipping address entered");
		PlaceOrder_Button.click();
		}
		return Username;
		
		
	}
	
	public void GuestShippingInvalidAddress() {
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
		//System.out.println("UseEnteredAddress_RadioButton.isDisplayed()" +UseEnteredAddress_RadioButton.isDisplayed());
		if(UseEnteredAddress_RadioButton.isDisplayed()) {
			UseEnteredAddress_RadioButton.click();	}
	}
	
	public void UseSuggestedAddress() throws InterruptedException{
		Thread.sleep(60000);
		if(UseSuggestedAddress_RadioButton.isDisplayed())
		UseSuggestedAddress_RadioButton.click();
	}
	
	public void shippingOptions() throws InterruptedException{
		int randshipping = rand.nextInt(Shippingmethod_OptionsCount.size()+1); 
		Shippingmethod_Options(randshipping);
	}
	
	
	
	
	

}
