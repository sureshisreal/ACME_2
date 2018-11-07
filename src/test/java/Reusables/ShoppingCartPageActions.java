package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ShoppingCartPageRepo;

public class ShoppingCartPageActions extends ShoppingCartPageRepo {

	public ShoppingCartPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void guestCheckout() throws InterruptedException, IOException {
		WaitUntilElementVisible(guestShopperContinue);
		AddScreenshot();
		guestShopperContinue.click();
		logs("Guest Checkout button clicked in the shoppingCart Page");

	}

	public void fieldvalidations() {
		WaitUntilElementVisible(guestShopperContinue);
		ElementPresent(shoppingCart_Heading);
		ElementPresent(ProductAvailablility_Status);
		ElementPresent(Product_Price);
		ElementPresent(Promocode_Textbox);
		ElementPresent(Quatity_Textbox);
		ElementPresent(Sku_label);
		ElementPresent(product_overallTotal);
		ElementPresent(guestShopperContinue);
		ElementPresent(returning_customerId);
		ElementPresent(returning_customerpassword);
		ElementPresent(signInCheckout_button);
		ElementPresent(paypalcheckout_button);
		logs("Shopping cart field validations verified");
	}

	public void RemoveProduct() throws IOException {
		WaitUntilElementClickable(shoppingCart_Heading);
		int removecount = Remove_link.size();
		AddScreenshot();
		for(int i=1;i<=removecount; i++) {
			RemoveAllProducts_link(i);
			WaitUntilElementClickable(shoppingCart_Heading);
			logs("Product :" +i+ " removed");
		}
		logs("All Products removed");
	}

	public void EmptyCartMsg() throws IOException {
		WaitUntilElementVisible(shoppingCart_Heading);
		assertTrue(EmptyCart.getText().contains("Your current order is empty"));
		AddScreenshot();
		logs("Empty Cart Verified");
	}

	public void ReturningCustomer() throws IOException {
		WaitUntilElementVisible(returning_customerId);
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(0);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(0);
		System.out.println("Credentials :" + Username + "" +Password);
		returning_customerId.sendKeys(Username);
		returning_customerpassword.sendKeys(Password);
		signInCheckout_button.click();
	}

}
