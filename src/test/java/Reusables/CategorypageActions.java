package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

	public void Breadcrumbs() throws IOException {
		WaitUntilElementVisible(SearchHeader);
		int Breadcrumbsize = Breadcrumb_Navigation.size();
		for( int i=1; i<Breadcrumbsize ; i++) {
				if(i==1) {
					String title = driver.getTitle();
					Assert.assertEquals(driver.getTitle(),
							"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
					logs("Page title verified : " + title);
				}
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(CategoryVerify.getText().contains(BreadcrumbName));
			driver.navigate().back();
		}
		
	}

	public void FieldValidations() {
		WaitUntilElementVisible(CategoryVerify);
		ElementPresent(Filters);
		ElementPresent(Itemsperpage);
		ElementPresent(sortOption);
		ElementPresent(First_product_Info);
		ElementPresent(FirstProduct);
		ElementPresent(pageControl_Header);
		ElementPresent(pageControl_Footer);
		ElementPresent(TopSellingItems);
		ElementPresent(Footer);
		logs("Category landing page validations verified");
		
	}

	public void AddTopSellingItem() {
		WaitUntilElementVisible(TopSellingItems);
		int rand_int = rand.nextInt(TopSellingItems_Count.size()+1); 
		String TopSellingSelect = TopSellingItemsName(rand_int).getText();
		TopSellingItemsName(rand_int).click();
		WaitUntilElementVisible(PDP_TitleVerify);
		assertTrue(TopSellingSelect.contains(PDP_TitleVerify.getText()));
		logs("Added product verified");
	}

	public void SearchBreadcrumbsNaigation() {
		WaitUntilElementVisible(SearchHeader);
		int Breadcrumbsize = Breadcrumb_Navigation.size();
		for( int i=1; i<Breadcrumbsize ; i++) {
				if(i==1) {
					String title = driver.getTitle();
					Assert.assertEquals(driver.getTitle(),
										"Search Results Display");
					logs("Page title verified : " + title);
				}
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(CategoryVerify.getText().contains(BreadcrumbName));
			driver.navigate().back();
		}
		
		
	}	

}
