package Reusables;

import static org.testng.AssertJUnit.assertTrue;
import pageObjectsRepo.CatgoryPageRepo;


public class CategorypageActions extends CatgoryPageRepo{

	public void selectFirstProduct() throws InterruptedException {
		String ProductName = FirstProductName.getText();
		FirstProduct.click();
		logs("First product Clicked");
		System.out.println("ProductName" +ProductName);
		System.out.println("VerifyProductTitle.getText()" +VerifyProductTitle.getText());
		assertTrue(ProductName.contains(VerifyProductTitle.getText()));
		//assertTrue(VerifyProductTitle.getText().contains(ProductName));
		logs("Product Name Verified");
	}

	public void verifySearchHeader(String SearchTerm) throws InterruptedException {
		//WaitForElementLoad(SearchHeader);
		assertTrue(SearchHeader.getText().contains(SearchTerm));
		System.out.println("verifySearchHeader");
	}

	
	

}
