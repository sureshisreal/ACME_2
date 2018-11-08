package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Reusables.HomepageActions;
import pageObjectsRepo.MyAccountRepo;
import utilities.BaseTest;

public class MyAccountScripts extends BaseTest {
	
/*
	@Test
	public void myAccountSummary() throws IOException, InterruptedException {

		TestDescription("MyAccount_Summary_001", "To verify the my Account Summary UI");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		Assert.assertEquals(true, myaccountPage.verifyMyAccountSummaryTitle());
		logs("My Account Summary title verified");
		Assert.assertEquals(true, myaccountPage.verifyDescText());
		logs("Description welcome text of My Account Summary is verified");
		Assert.assertEquals(true, myaccountPage.verifyDescSummary());
		logs("Description Summary  text of My Account Summary is verified");
		ElementPresent(myaccountPage.personal_information_title);
		logs("Personal information Title is present");
		ElementPresent(myaccountPage.personal_info_name_label);
		
		
		
		
		ElementPresent(myaccountPage.personal_info_address_label);
		ElementPresent(myaccountPage.personal_info_city_label);
		ElementPresent(myaccountPage.personal_info_email_label);
		logs("Personal information section with name, address city and Email are present");
		ElementPresent(myaccountPage.personal_info_edit_link);
		logs("Edit link for personal info is available");
		ElementPresent(myaccountPage.recent_order_history_title);
		ElementPresent(myaccountPage.recent_order_history_view_all_orders);
		logs("Order History Title with the view all orders link are present");
		
		
		
		

	}

	

	
	
	@Test
	public void editLink_accSummary() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_002", "To verify the Edit link working in the My Account Summary Page");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		
		myaccountPage.storePersonlInfo_accSummary();
		AddScreenshot();

		Assert.assertEquals(true, myaccountPage.verifyEditLink_accSummary());
		
		
		logs("Edit link click in My Account Summary's personal info section navigates the user to the Personal information Edit page");
		myaccountPage.verifyPersonlInfo_accSummary();
		AddScreenshot();

	}
	


	@Test
	public void recentOrderHistory_NoOrders() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_03", "To verify the recent order History section which does");
		homepage.SignInLink();
		registerationPage.HomepageLogin_AccwithNoOrders();
		logs("Logged in as registered user");
		ElementPresent(myaccountPage.recent_OrderHistory_noOrdersFound);
		
		

	}

	@Test
	public void recentOrderHistory_Orders() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_04","To verify the order details are present in the recent Order History section within the account which has orders");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");

		ElementPresent(myaccountPage.recent_OrderHistory_header_orderDate);
		logs("Order Date coulmn header is present");
		ElementPresent(myaccountPage.recent_OrderHistory_header_orderNumber);
		logs("Order Number coulmn header is present");
		ElementPresent(myaccountPage.recent_OrderHistory_header_PurchaseOrder);
		logs("Purchase Order coulmn header is present");
		ElementPresent(myaccountPage.recent_OrderHistory_header_Status);
		logs("Status coulmn header is present");
		ElementPresent(myaccountPage.recent_OrderHistory_header_TotalPrice);
		logs("Total price coulmn header is present");
		ElementPresent(myaccountPage.recent_OrderHistory_DetailsLink);
		logs("Details link is present");
		ElementPresent(myaccountPage.recent_OrderHistory_Reorder_CTA);
		logs("Re-order CTA is present");

	}
	
	
	
	@Test
	public void leftNavMenuLinks_UICheck() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_05",
				"To verify if the left navigation menu has all the links present in it");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		assertTrue(myaccountPage.verifyLeftNavSettings());
		ElementPresent(myaccountPage.myacc_leftNav_settings_personalInfo);
		ElementPresent(myaccountPage.myacc_leftNav_settings_addressBook);
		ElementPresent(myaccountPage.myacc_leftNav_settings_creditCard);
		logs("SETTINGS menu is properly displayed");
		
		assertTrue(myaccountPage.verifyLeftNavWishlists());
		ElementPresent(myaccountPage.myacc_leftNav_wishlist_personalWishlist);
		logs("Wishlist menu is properly displayed");
		
		assertTrue(myaccountPage.verifyLeftNavOrders());
		ElementPresent(myaccountPage.myacc_leftNav_orders_orderHistory);
		logs("Orders menu is properly displayed");
		
		assertTrue(myaccountPage.verifyLeftNavCoupons());
		ElementPresent(myaccountPage.myacc_leftNav_coupons_sublink);
		logs("Coupons menu is properly displayed");
		
	}
	
	
	
	
	@Test
	public void personalInformation_PageUICheck() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_06",
				"To verify if the Personal information Page UI elements");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		myaccountPage.personalInfo_UIValidation();
		
		
	}
	
	
	
	@Test
	public void personalInformation_editing() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_07",
				"To Change the values of the user's personal information and validating those changes");
		homepage.SignInLink();
		registerationPage.HomepageLogin_pinfoAcc();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		myaccountPage.personalInfo_editPasswordCheck();
		registerationPage.SignOut.click();
		registerationPage.loginWithOldPassword();
		registerationPage.loginWithNewPassword();
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		myaccountPage.pi_passwordField.sendKeys("P@ssw0rd");
		myaccountPage.pi_verifyPasswordField.sendKeys("P@ssw0rd");
		myaccountPage.editPersonalInfoValues();	

}
	
	

	@Test
	public void personalInformation_editingEmail() throws IOException, InterruptedException {
		TestDescription("MyAccount_Summary_08",
				"To Change the values of the user's Login Details and validating those changes");
		homepage.SignInLink();
		registerationPage.HomepageLogin_pinfoAcc();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		myaccountPage.pinfo_editEmailValidations();
		registerationPage.SignOut.click();
		registerationPage.loginwithOldEmail();
		registerationPage.loginwithNewEmail();
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		myaccountPage.revertToOriginalEmail();
	}
	

	 
	@Test
	public void myAcc_ShippingInfo_UIValidation() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_09",
				"To verify the My Shipping address book Page UI elements");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().contains("My Address Book"));
		aBookPage.aBook_UIValidation();
		

}
		
		 
	
	@Test
	public void myAcc_ShippingInfo_addressPrePopulation_test() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_10",
				"When the registered user, who hasn't saved any address to his address book explicitly, navigates to the shipping address book, verify if the following fields are pre-populated with the values from the personal information of the user");
		homepage.SignInLink();
		registerationPage.HomepageLoginSpecificAcc(3);
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_personalInfo.click();
		HashMap <String, String> pInfoDetails = new HashMap<String, String>();
		
		pInfoDetails = myaccountPage.getPersonalInfoValues();
		System.out.println(pInfoDetails);
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.comparePinfo_aBook(pInfoDetails);
		
		
	}
	

	
	@Test
	public void myAcc_ShippingInfo_addNewAddress_emptyField_test() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_11","To ensure if all the fields are blank in the address book while adding new address in Address book");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.ensureBlankFields_addNewAddress();
		

}
	
	
	@Test
	public void myAcc_ShippingInfo_addNewAddress() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_12","To add new address in Address book");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.addNewAddress();
		
		
	}
	
	
	@Test
	public void myAcc_ShippingInfo_removeAddress() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_13","To remove  address in Address book");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.addNewAddress();
		logs("New address 1 added");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.addNewAddressforRemove();
		logs("Address to be removed has been added");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.removeAddress();
		
	}
	
	
	
	
	@Test
	public void myAcc_ShippingInfo_restrictRemoveAddress() throws IOException, InterruptedException {
		TestDescription("MyAccount_addressBook_14","To restrict removal of address in Address book if only one address is saved");
		homepage.SignInLink();
		registerationPage.HomepageLoginSpecificAcc(3);
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_addressBook.click();
		aBookPage.restrictRemoveAddress();
		
		
}


	
	
	@Test
	public void myAcc_creditCard_UIValidation() throws IOException, InterruptedException {
		
		TestDescription("MyAccount_creditCard_15","To check the UI of the Credit card information");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.mcc_UIValidation();

		
	}
	
	
	
	@Test
	public void myAcc_creditCard_addNewCreditCardInfo() throws IOException, InterruptedException {
		
		TestDescription("MyAccount_creditCard_16","To Add new credit card information in My Account");
		homepage.SignInLink();
		registerationPage.HomepageLoginSpecificAcc(1);
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_settings_creditCard.click();
		myaccCCpage.addNewCreditCardInfo();
		ElementPresent(myaccountPage.myAccountSummary_title);
		ElementPresent(myaccountPage.myacc_quickCheckout_successMsg);
		logs("Credit card information added successfully");

	}
	
	*/
	
	@Test
	public void myAcc_Coupons_UIValidation() throws IOException, InterruptedException {
		TestDescription("MyAccount_coupons_17","To check the UI of the Coupons page in My Account");
		homepage.SignInLink();
		registerationPage.HomepageLogin();
		logs("Logged in as registered user");
		myaccountPage.myacc_leftNav_coupons_sublink.click();
		Assert.assertTrue(myaccountPage.currentPageBreadcrumb.getText().toString().trim().equals("My Coupons"));
		logs("Current Breadcrumb is My Coupons");
		ElementPresent(couponsPage.coupons_header);
		ElementPresent(couponsPage.coupons_noCouponsMsg);
		logs("My Account Coupon Page UI Validation is completed");
		AddScreenshot();
		
	}
		
	
	
}
