package Reusables;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.OrderHistoryPageRepo;

import java.io.IOException;
import java.util.List;

public class OrderHistoryPageActions extends OrderHistoryPageRepo {
	
	public OrderHistoryPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void orderDetails_reg_UIValidation() throws IOException {
		// TODO Auto-generated method stub
		ElementPresent(od_header);
		ElementPresent(od_ordNumLabel);
		ElementPresent(od_ordDateLabel);
		ElementPresent(od_ShipInfoHeader);
		ElementPresent(od_BillInfoHeader);
		ElementPresent(od_printCTA);
		ElementPresent(od_printCTA_hint);
		logs("Order details Page - UI sections validations are complete");
		AddScreenshot();

	}

	public void oh_UIvalidation() throws IOException {
		// TODO Auto-generated method stub
		ElementPresent(oh_header);
		ElementPresent(oh_orderNumber);
		ElementPresent(oh_orderDate);
		ElementPresent(oh_PurchaseOrder);
		ElementPresent(oh_Status);
		ElementPresent(oh_TotalPrice);
		ElementPresent(oh_ordersListSection);
		ElementPresent(oh_Reorder_CTA);
		ElementPresent(oh_DetailsLink);
		logs("Order History Page UI validation is complete");
		AddScreenshot();
		
		
	}

	public void guest_orderStatus_UIValidation() throws IOException {
		// TODO Auto-generated method stub
		
		ElementPresent(os_header);
		ElementPresent(os_membersHeader);
		ElementPresent(os_logonIDLabel);
		ElementPresent(os_logonIDField);
		ElementPresent(os_passwordLabel);
		ElementPresent(os_passwordField);
		ElementPresent(os_forgotYourPasswordLink);
		ElementPresent(os_signIn_CTA);
		ElementPresent(os_guestHeader);
		ElementPresent(os_orderNumLabel);
		ElementPresent(os_ordNumField);
		ElementPresent(os_billZipcodeLabel);
		ElementPresent(os_billZipcodeField);
		ElementPresent(os_findOrderCTA);
		logs("Guest user Order Status Page UI validation is completed");
		AddScreenshot();
		
		
		
		
	}

	public void loginfromOrderStatus() throws IOException {
		// TODO Auto-generated method stub
		List<String> UsernameData = getColumnData("SignIn","Username");
		String Username = UsernameData.get(0);
		List<String> PssswordData = getColumnData("SignIn","Password");
		String Password = PssswordData.get(0);
		System.out.println("Credentials :" + Username + "" +Password);
		os_logonIDField.clear();
		os_passwordField.clear();
		os_logonIDField.sendKeys(Username);
		os_passwordField.sendKeys(Password);
		AddScreenshot();
		os_signIn_CTA.click();
		

	}

	public void invalidOrderDetailsCheck() throws IOException {
		// TODO Auto-generated method stub
		os_ordNumField.sendKeys("148009");
		os_billZipcodeField.sendKeys("32003");
		os_findOrderCTA.click();
		WaitUntilElementVisible(os_errorMsg);
		Assert.assertTrue(os_errorMsg.getText().toString().contains("The order number or zipcode are incorrect"));
		AddScreenshot();
		logs("error message is displayed while entering the invalid order number or zipcode in the guest order status page");
	}

	public void guest_ordStatus_OrderDetailsNavigation(String ordNum, String billToZipcode) {
		// TODO Auto-generated method stub
		os_ordNumField.clear();
		os_billZipcodeField.clear();
		os_ordNumField.sendKeys(ordNum);
		os_billZipcodeField.sendKeys(billToZipcode);
		os_findOrderCTA.click();
		
		
	}

	public void guest_orderDetailsPage_UIValidation() throws IOException {
		// TODO Auto-generated method stub
		ElementPresent(odg_header);
		ElementPresent(odg_FindAnotherOrder_sectionHeader);
		ElementPresent(odg_FindAnotherOrder_ordNumLabel);
		ElementPresent(odg_FindAnotherOrder_ordNumFiled);
		ElementPresent(odg_FindAnotherOrder_billToZipcodeLabel);
		ElementPresent(odg_FindAnotherOrder_billToZipcodeField);
		ElementPresent(odg_FindAnotherOrder_findOrderCTA);
		ElementPresent(odg_ordNumber);
		ElementPresent(odg_ordDate);
		ElementPresent(odg_ShipInfoHeader);
		ElementPresent(odg_BillInfoHeader);
		ElementPresent(odg_printCTA);
		AddScreenshot();
		logs("Guest user Order Details Page validation is completed");

	}
	
	
	
	
	

}
