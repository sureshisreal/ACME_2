package pageObjectsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BaseTest;

public class RequisitionListRepo extends BaseTest {
	
	public RequisitionListRepo(WebDriver driver) {
	    this.driver = driver;
	}

	@FindBy( id = "requisitionList")
	public  WebElement RequisitionList;
	
	@FindBy( id = "RequisitionListPageHeading")
	public  WebElement RequisitionListPageHeading;
	
	@FindBy( xpath = "	//span[contains(.,'Create List')]")
	public  WebElement RequisitionListCreateList_Button;
	
	@FindBy( id = "RequisitionList_NewListForm_Name")
	public  WebElement RequisitionListCreateList_TextBox;
	
	@FindBy( xpath = "//div[@id='WC_RequisitionList_TableContent_name_1']//a")
	public  WebElement RequisitionListCreateList_TextBoxVerify;
	
	@FindBy( id = "actionButton1")
	public  WebElement RequisitionListCreateList_ActionBuild;
	
	@FindBy( xpath = ".//*[@class='actionDropdown active']//span[contains(.,'Delete')]")
	public  WebElement RequisitionListCreateList_DeleteBuild;
	
	
	@FindBy( xpath = ".//div[@class='button_text']//span[contains(.,'Save')]")
	public  WebElement RequisitionListCreateList_Save;
	
	@FindBy( xpath = ".//*[@id='RequisitionList_NewListForm_Cancel']//span[contains(.,'Cancel')]")
	public  WebElement RequisitionListCreateList_Cancel;
	
	@FindBy( xpath = "//span[contains(.,'Upload List')]")
	public  WebElement RequisitionListUploadList_Button;
	
	@FindBy( css = ".noListsMessage")
	public  WebElement RequisitionList_EmptyText;
	
	
	
	
}
