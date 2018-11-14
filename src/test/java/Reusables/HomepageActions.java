package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjectsRepo.HomepageRepo;

public class HomepageActions extends HomepageRepo {

	public HomepageActions(WebDriver driver) {
		super(driver);
		System.out.println("driver : " + driver);
	}

	public void searchTerm(String SearchTerm) throws IOException {
		searchTextbox.sendKeys(SearchTerm);
		searchSubmit.click();
		WaitUntilElementVisible(SearchHeader_Verify);
		Assert.assertEquals(SearchHeader_Verify.getText(),SearchTerm);
		AddScreenshot();
		logs("Search Term entered and verified");
	}

	public void SignInLink()  {
		WaitUntilElementVisible(SignInRegister_Link);
		SignInRegister_Link.click();
		logs("SignInRegister_Link clicked");
	}

	public void VerifyPageTitle() throws IOException {
		String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(),
				"Acme Tools - Best Online Tool Store - FREE Shipping Orders $49+");
		logs("Page title verified : " + title);
		AddScreenshot();
	}

	public void returnhomepage() {
		AcmeLogo.click();		
	}

	public void HeaderValidations() {
		WaitUntilElementClickable(freeShip_Banner);
		ElementPresent(freeShip_Banner);
		freeShip_Banner.click();
		driver.switchTo().activeElement();	
		assertTrue(freeShip_Modal_Overlay.getText().contains("FREE"));
		freeShip_Modal_Overlay_Close.click();
		//assertTrue(welcome_Banner.getText().contains("Welcome to AcmeTools"));
	}

	public void TopMenuValidations() throws IOException {
		WaitUntilElementVisible(OrderStatus_Link);
		OrderStatus_Link.click();
		ElementPresent(OrderStatus_Header);
		logs("Order Status Link Verified");
		customerServiceQuick_Link.click();
		ElementPresent(CustomerService_Header);
		logs("Customer Service Link Verified");
		storeLocatorQuick_Link.click();
		ElementPresent(StoreLocation_Header);
		logs("StoreLocation Link Verified");
		requestQuoteQuick_Link.click();
		ElementPresent(RequestQuote_Header);
		logs("Request Quote Link Verified");
		MiniShoppingCart.click();
		WaitUntilElementClickable(MiniShoppingCart_EmptyText);
		System.out.println("MiniShoppingCart_EmptyText.getText() " +MiniShoppingCart_EmptyText.getText());
		assertTrue(MiniShoppingCart_EmptyText.getText().contains("Your cart is empty"));
		MiniShoppingCart_close.click();
	}

	public void MenuValidations() throws IOException {
		WaitUntilElementVisible(Menu_Category);
		Menu_Category.click();
		logs("Categories Menu clicked");
		AddScreenshot();
		WaitUntilElementVisible(Menu_CategoryVerify);
		assertTrue(Menu_CategoryVerify.getText().contains("Categories"));
		logs("Categories Menu verified");
		Menu_Brands.click();
		logs(" Menu Brands clicked");
		AddScreenshot();
		WaitUntilElementVisible(Menu_CategoryVerify);
		assertTrue(Menu_CategoryVerify.getText().contains("Brands"));
		logs(" Menu Brands verified");
		Menu_Deals.click();
		logs(" Menu Deals clicked");
		AddScreenshot();
		WaitUntilElementVisible(Menu_CategoryVerify);
		assertTrue(Menu_CategoryVerify.getText().contains("Deals"));
		logs(" Menu Deals verified");
		Menu_WhatsNew.click();
		logs(" Menu What'snew clicked");
		AddScreenshot();
		WaitUntilElementVisible(Menu_CategoryVerify);
		assertTrue(Menu_CategoryVerify.getText().contains("What's"));	
		logs(" Menu What'snew verified");
	}

	public void CategoryMenuSelection() throws IOException, InterruptedException {
		//Menu Selection
		WaitUntilElementVisible(Menu_Category);
		Menu_Category.click();
		logs("Category Header Selected");
		
		//SubMenu
		WaitUntilElementVisible(Menu_CategoryVerify);
		int rand_int = rand.nextInt(Categorypage_AllCategory.size()+1); 
		System.out.println("rand_int " +rand_int);
		AddScreenshot();
		String CategoryName = Categorypage_RandomCategory(rand_int).getText();
		logs("Random Category selected : " +CategoryName);
		Categorypage_RandomCategory(rand_int).click();
		
		//Sub Category Menu
		WaitUntilElementVisible(Menu_CategoryVerify);
		int rand_subcat = rand.nextInt(Categorypage_SubCategory.size()+1); 
		System.out.println("rand_subcat " +rand_subcat);
		AddScreenshot();
		if(rand_subcat > 0) {
		String CategorySubName = Categorypage_SubRandomCategory(rand_int).getText();
		logs("Random Category selected : " +CategorySubName);
		Categorypage_SubRandomCategory(rand_int).click();
		WaitUntilElementVisible(SearchHeader_Verify);
		AddScreenshot();
		//Assert.assertEquals(SearchHeader_Verify.getText(),CategoryName);
		assertTrue(CategoryName.contains(SearchHeader_Verify.getText()));
		}
		
		WaitUntilElementVisible(Menu_CategoryVerify);
		int rand_int1 = rand.nextInt(SubCategorypage_SubCCategory.size()+1); 
		System.out.println("SubCategory Header" +rand_int1);
		String SubCategoryName = SubCategorypage_RandomCategory(rand_int1).getText();
		AddScreenshot();
		SubCategorypage_RandomCategory(rand_int1).click();
		logs("Random SubCategory selected : " +SubCategoryName);
		//Assert.assertEquals(SearchHeader_Verify.getText(),SubCategoryName);
		assertTrue(SubCategoryName.contains(SearchHeader_Verify.getText()));
		AddScreenshot();
		
		/*//First Product
				WaitUntilElementClickable(FirstProductName);
				//String ProductName = FirstProductName.getText();
				FirstProductName.click();
				logs("First product selected ");
				WaitUntilElementVisible(PDP_TitleVerify);
				//assertTrue(ProductName.contains(PDP_TitleVerify.getText()));
				logs("First product verified");*/
	}

	public void BrandMenuSelection() throws IOException {
		WaitUntilElementVisible(Menu_Category);
		Menu_Brands.click();
		logs("Brand Header Selected");
		WaitUntilElementVisible(Menu_CategoryVerify);
		int rand_int = rand.nextInt(Brand_SubCCategory.size()+1); 
		System.out.println("rand_int " +rand_int);
		AddScreenshot();
		String BrandName = Brands_RandomCategory(rand_int).getText();
		logs("Random Category selected : " +BrandName);
		Brands_RandomCategory(rand_int).click();
		WaitUntilElementVisible(SearchHeader_Verify);
		AddScreenshot();
		Assert.assertEquals(SearchHeader_Verify.getText(),BrandName);
		if(SubCategorypage_SubCCategory.size() > 0) {
		int rand_int1 = rand.nextInt(SubCategorypage_SubCCategory.size()+1); 
		System.out.println("SubCategory Header" +rand_int1);
		String SubCategoryName = SubCategorypage_RandomCategory(rand_int1).getText();
		AddScreenshot();
		SubCategorypage_RandomCategory(rand_int1).click();
		logs("Random SubCategory selected : " +SubCategoryName);
		Assert.assertEquals(SearchHeader_Verify.getText(),SubCategoryName);
		AddScreenshot();
		}

	}

	public void WhatsNew_MenuSelection() throws IOException {
		WaitUntilElementVisible(Menu_WhatsNew);
		Menu_WhatsNew.click();
		logs(" Menu What'snew clicked");
		AddScreenshot();
		WaitUntilElementVisible(Menu_CategoryVerify);
		assertTrue(Menu_CategoryVerify.getText().contains("What's"));	
		logs(" Menu What'snew verified");
	}

	public void signout() throws IOException {
		WaitUntilElementClickable(MyAccount_Link);
		SigniIn_alt_Link.click();
		AddScreenshot();
		WaitUntilElementClickable(SignInRegister_Link);
		logs("Log out verified");
	}

	

}
