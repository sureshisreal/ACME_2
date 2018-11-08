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

	public void RegCheckout() throws InterruptedException, IOException {
		WaitUntilElementVisible(regShopperContinue);
		AddScreenshot();
		regShopperContinue.click();
		logs("Reg Checkout button clicked in the shoppingCart Page");

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
	
	public void shoppingcartInlinCheck(int i) throws IOException {
		WaitUntilElementVisible(shoppingCart_Heading);
		int inline = ProductName_link.size();
		assertTrue(inline == 2 );
		AddScreenshot();	
		logs("verified Inline Check");
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
	
	public void Invalid_ReturningCustomer() throws IOException {
		WaitUntilElementVisible(returning_customerId);
		List<String> ErrorMsgData = getColumnData("SignIn","SignInErrorMsg");
		String ErrorMsg1 = ErrorMsgData.get(0);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(0);
		returning_customerId.sendKeys(ErrorMsg1);
		returning_customerpassword.sendKeys(Password);
		signInCheckout_button.click();
	}

	public void ForgotPassword() {
		WaitUntilElementClickable(forgotpassword_link);
		forgotpassword_link.click();
		WaitUntilElementClickable(ForgotpassWord_SignIn);
		ForgotpassWord_SignIn.click();
		WaitUntilElementVisible(ForgotpassWord_Registerationpage);
		assertTrue(EmptyCart.getText().contains("CREATE AN ACME TOOLS ACCOUNT PROFILE"));
		driver.navigate().back();
		ForgotpassWord_Error.click();
		assertTrue(ForgotpassWord_Error.getText().contains("Type a logon ID in the Logon ID field."));
		ForgotpassWord_Textbox.sendKeys("!@#$%^&*");
		assertTrue(ForgotpassWord_Error.getText().contains("The logon ID that you entered is not valid. Check your entry and try again"));

	}

	public void promocode() {
			WaitUntilElementClickable(shoppingcart_promo);
			shoppingcart_promo.click();
			
	}

}
