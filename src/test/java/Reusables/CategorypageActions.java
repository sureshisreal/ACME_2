package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	public CategorypageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void selectFirstProduct() throws InterruptedException {
		WaitUntilElementVisible(FirstProduct);
		FirstProduct.click();
	}

	public void verifySearchHeader(String SearchTerm) throws InterruptedException {
		String SearchHeaderText = SearchHeader.getText();
		assertTrue(SearchHeaderText.contains(SearchTerm));
		System.out.println("verifySearchHeader");
	}	

}
