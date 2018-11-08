package Reusables;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.OrderHistoryPageRepo;

import java.io.IOException;

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
	
	
	

}
