package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class RequisitionList extends BaseTest {
	
	@Test	
	public void RequisitionList_Validations() throws IOException, InterruptedException {		
		TestDescription("RequisitionList_Validations_001" , "To verify all the feilds are present in the Request Quote");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			requisitionListPage.requistionListLink();
			requisitionListPage.RequistionValidations();
	}
	
	@Test	
	public void RequisitionList_CreateAndDelete() throws IOException, InterruptedException {		
		TestDescription("RequisitionList_Validations_002" , "To verify all the feilds are present in the Request Quote");
			logs("Url entered");
			AddScreenshot();
			homepage.SignInLink();
			registerationPage.HomepageLogin();
			requisitionListPage.requistionListLink();
			requisitionListPage.CreateRequistionlist();
	}
}
