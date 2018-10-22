package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	public void selectFirstProduct() throws InterruptedException {
		Thread.sleep(1000);
		FirstProduct.click();
	}

	public void verifySearchHeader(String SearchTerm) throws InterruptedException {
		String SearchHeaderText = SearchHeader.getText();
		assertTrue(SearchHeaderText.contains(SearchTerm));
		System.out.println("verifySearchHeader");
	}	

}
