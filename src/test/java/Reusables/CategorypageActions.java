package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

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
	
	public void selectRandomProduct() throws InterruptedException, IOException {
		WaitUntilElementClickable(SearchHeader);
		int rand_int = rand.nextInt(AllProductNames.size()+1); 
		String ProductName = RandomCategorySelect(rand_int).getText();
		AddScreenshot();
		RandomCategorySelect(rand_int).click();
		logs("Random product selected : " + rand_int+ "product");
		WaitUntilElementVisible(PDP_TitleVerify);
		assertTrue(ProductName.contains(PDP_TitleVerify.getText()));
		AddScreenshot();
		logs("Random product verified");
	}

	public void verifySearchHeader(String SearchTerm) throws InterruptedException {
		String SearchHeaderText = SearchHeader.getText();
		assertTrue(SearchHeaderText.contains(SearchTerm));
		logs("Search page verified");
	}

	public void VerifyPage() {
		WaitUntilElementVisible(SearchHeader);
		logs("Category pages verified");
	}

	public void Breadcrumbs() {
		WaitUntilElementVisible(SearchHeader);
		int Breadcrumbsize = Breadcrumb_Navigation.size();
		for( int i=0 ; i<Breadcrumbsize ; i++) {
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(CategoryVerify.getText().contains(BreadcrumbName));
			driver.navigate().back();
		}
		
	}	

}
