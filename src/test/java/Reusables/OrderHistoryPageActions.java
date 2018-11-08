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
	
	
	

}
