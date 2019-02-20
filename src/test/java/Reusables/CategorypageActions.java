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
		System.out.println("ProductName :" +ProductName);
		AddScreenshot();
		RandomCategorySelect(rand_int).click();
		logs("Random product selected : " + rand_int+ "product");
		WaitUntilElementVisible(PDP_TitleVerify);
		System.out.println("PDP_TitleVerify : " +PDP_TitleVerify);
		//String delimiters = "\\s+|-,\\s-|\\.\\s*";
		String[] arrOfStr = ProductName.split ("[-\\s]");
		//String[] arrOfStr = ProductName.split(delimiters);   
        for (String a : arrOfStr) {
            System.out.println(a); 
            //assertTrue(a.contains(PDP_TitleVerify_Verify.getText()));
            assertTrue(PDP_TitleVerify_Verify.getText().contains(a));
            break;
        	} 
	//	assertTrue(ProductName.contains(PDP_TitleVerify_Verify.getText()));
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

	public void Breadcrumbs() throws IOException, InterruptedException {
		WaitUntilElementVisible(SearchHeader);
		int Breadcrumbsize = Breadcrumb_Navigation.size();
		for( int i=Breadcrumbsize; i>=1 ; i--) {
				if(i==1) {
					BreacrumbNavigation(i).click();
					Thread.sleep(1000);
					String title = driver.getTitle();
					Assert.assertEquals(driver.getTitle(),
							"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
					logs("Page title verified : " + title);
					break;
				}
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(CategoryVerify.getText().contains(BreadcrumbName));
			//driver.navigate().back();
		}
		
	}
	
	public void MyAccountBreadcrumbs() throws IOException, InterruptedException {
		WaitUntilElementVisible(SearchHeader);
		int Breadcrumbsize = Breadcrumb_Navigation.size();
		for( int i=Breadcrumbsize; i>=1 ; i--) {
				if(i==1) {
					BreacrumbNavigation(i).click();
					Thread.sleep(1000);
					String title = driver.getTitle();
					Assert.assertEquals(driver.getTitle(),
							"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
					logs("Page title verified : " + title);
					break;
				}
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(HeaderVerify.getText().contains(BreadcrumbName));
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
		//ElementPresent(TopSellingItems);
		ElementPresent(Footer);
		logs("Category landing page validations verified");
		
	}

	public void AddTopSellingItem() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
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
				else {	
			String BreadcrumbName = BreacrumbNavigation(i).getText();
			BreacrumbNavigation(i).click();
			assertTrue(CategoryVerify.getText().contains(BreadcrumbName));
			driver.navigate().back();
				}
		}
		
		
	}	

}
