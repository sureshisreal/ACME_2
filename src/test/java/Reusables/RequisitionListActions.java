package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import java.io.IOException;
import java.util.List;

import org.apache.bcel.generic.LLOAD;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.model.Log;

import pageObjectsRepo.RequestQuoteRepo;
import pageObjectsRepo.RequisitionListRepo;

public class RequisitionListActions extends RequisitionListRepo {

	public RequisitionListActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void requistionListLink() {
		WaitUntilElementClickable(RequisitionList);
		RequisitionList.click();
		logs(" RequisitionList Clicked ");
	}
	
	public void RequistionValidations() {
		WaitUntilElementClickable(RequisitionListPageHeading);
		ElementPresent(RequisitionListPageHeading);
		ElementPresent(RequisitionListCreateList_Button);
		ElementPresent(RequisitionListUploadList_Button);
		ElementPresent(RequisitionList_EmptyText);
	}

	public void CreateRequistionlist() {
		String CreateRequistionlist = "Test" ;
		WaitUntilElementClickable(RequisitionListPageHeading);
		RequisitionListCreateList_Button.click();
		RequisitionListCreateList_TextBox.sendKeys(CreateRequistionlist);
		RequisitionListCreateList_Cancel.click();
		RequisitionListCreateList_TextBox.sendKeys("Test");
		RequisitionListCreateList_Save.click();
		WaitUntilElementClickable(RequisitionListCreateList_TextBoxVerify);	
		assertTrue((RequisitionListCreateList_TextBoxVerify.getText()).contains(CreateRequistionlist));
		WaitUntilElementClickable(RequisitionListCreateList_ActionBuild);
		RequisitionListCreateList_ActionBuild.click();
		WaitUntilElementClickable(RequisitionListCreateList_DeleteBuild);
		RequisitionListCreateList_DeleteBuild.click();
		
	}

	
	


}
