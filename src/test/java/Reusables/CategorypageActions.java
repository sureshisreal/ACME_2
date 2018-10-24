package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	public CategorypageActions(WebDriver driver) {
		super(driver);
	}

	public void selectFirstProduct() throws InterruptedException {
		WaitUntilElementClickable(FirstProductName);
		String ProductName = FirstProductName.getText();
		FirstProduct.click();
		logs("First product selected ");
		WaitUntilElementVisible(PDP_TitleVerify);
		assertTrue(ProductName.contains(PDP_TitleVerify.getText()));
		logs("First product verified");
	}

	public void verifySearchHeader(String SearchTerm) throws InterruptedException {
		String SearchHeaderText = SearchHeader.getText();
		assertTrue(SearchHeaderText.contains(SearchTerm));
		logs("Search page verified");
	}	

}
