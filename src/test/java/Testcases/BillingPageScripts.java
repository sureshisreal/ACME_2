package Testcases;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class BillingPageScripts extends BaseTest{
	
	@Test
	public void BillingPage_FieldValidations_001() throws IOException, InterruptedException {
		TestDescription("BillingPage_FieldValidations_001",
				"To verify guest user able to view all the fields in the Billing page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.guestCheckout();
		shippingPage.GuestShippingAddress();
		shippingPage.UseEnteredAddress();
		billingPage.BillingFieldValidation();
	}
	
	@Test
	public void BillingPage_FieldValidations_Reg_002() throws IOException, InterruptedException {
		TestDescription("BillingPage_FieldValidations_Reg_002",
				"To verify registered user able to view all the fields in the Billing page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("1");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RegCheckout();
		shippingPage.GuestShippingAddress();
		shippingPage.UseEnteredAddress();
		billingPage.BillingFieldValidation();
	}

	
	@Test
	public void BillingPage_info_saveToMyAccount_validation() throws IOException, InterruptedException {
		TestDescription("BillingPage_info_saveToMyAccount_validation_003",
				"To verify if the Billing address details entered in checkouT is saved in the My credit information of the My Account Page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		//Login and add credit card information
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("5");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RegCheckout();
		billingPage.saveBillingDetailsToAccount();
		billingPage.PlaceOrder();
		homepage.MyAccount_Link.click();
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.verifySavedCreditDetailsFromCheckout();
		
		
	}
	
	
	@Test
	public void BillingPage_info_getFromMyAccount_validation() throws IOException, InterruptedException {
		TestDescription("BillingPage_info_getFromMyAccount_validation_004",
				"To verify if the Billing address details are pre-populated if the same is saved in the My credit information of the My Account Page");
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		//Login and add credit card information
		
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.addNewCreditCardInfo();
		ElementPresent(myaccountPage.myAccountSummary_title);
		ElementPresent(myaccountPage.myacc_quickCheckout_successMsg);
		logs("Credit card information added successfully");
		
		//Place order
		
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("5");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RegCheckout();
		
		WaitUntilElementClickable(billingPage.CardNumber_Textbox);
		
		Thread.sleep(9000);;
		String billingPage_cardnum = billingPage.CardNumber_textboxWithValue.getAttribute("value").toString().trim();
		System.out.println("Billing Page Card num = " + billingPage_cardnum);
		List<String> cardNumData = getColumnData("creditCardInfo","CardNumber");
		String cardNumber = cardNumData.get(0);
		
		Assert.assertTrue(cardNumber.equals(billingPage_cardnum));
		logs("Card number from myaccount is carried forward to Billing page ");
		Assert.assertTrue(billingPage.selectedMonth.getAttribute("value").equals("09"));		
		logs("Expiry month is matching with that of my account info");
	
		Assert.assertTrue(billingPage.selectedYear.getAttribute("value").equals("2020"));		
		logs("Expiry Year is matching with that of my account info");
		AddScreenshot();
	}
	
	
	

	@Test
	public void BillingPage_info_saveEditedAddrToMyAccount_validation() throws IOException, InterruptedException {
		TestDescription("BillingPage_info_saveEditedBillingDetailsToMyAccount_validation_005",
				"To verify if the Billing address details edited in checkouT is updated in the My credit information of the My Account Page");
		
		List<String> SearchTermData = getColumnData("Search","SearchSKU");
		String SearchTerm = SearchTermData.get(0);
		homepage.VerifyPageTitle();
		//Login and add credit card information
		
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.addNewCreditCardInfo();
		ElementPresent(myaccountPage.myAccountSummary_title);
		ElementPresent(myaccountPage.myacc_quickCheckout_successMsg);
		logs("Credit card information added successfully");
		//Place order
		
		homepage.searchTerm(SearchTerm);
		categorypage.verifySearchHeader(SearchTerm);
		categorypage.selectFirstProduct();
		productsDetailPage.quantity("5");
		productsDetailPage.AddToCart();
		productsDetailPage.minishopcart_total();
		shoppingCartPage.RegCheckout();
		billingPage.saveBillingDetailsToAccount();
		logs("Billing address details is edited in Checkout page");
		billingPage.PlaceOrder();
		
		
		homepage.MyAccount_Link.click();
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.verifySavedCreditDetailsFromCheckout();
		logs("Edited Billing address details in checkout is updated successfully in My Account ");
		
	}
	

	
}
