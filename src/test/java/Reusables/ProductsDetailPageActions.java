package Reusables;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;

import pageObjectsRepo.ProductsDetailPageRepo;

public class ProductsDetailPageActions extends ProductsDetailPageRepo {

	public ProductsDetailPageActions(WebDriver driver) {
		super(driver);
	}

	public void quantity(String qty) throws InterruptedException {
		quantity.clear();
		quantity.sendKeys(qty);
		logs("Quantity Increased in the pdp");
	}

	public void AddToCart() throws InterruptedException {
		WaitUntilElementClickable(AddToProductButton);
		AddToProductButton.click();
		logs("Product added to the cart");
	}

	public  void minishopcart_total() throws InterruptedException {
		Thread.sleep(2000);
		WaitUntilElementClickable(cart_text);
		cart_text.click();
		WaitUntilElementClickable(GotoCartButton);
		GotoCartButton.click();
		logs("MiniCart go Button Clicked");
	}

	public void AddBopisProduct() {
		productPagePickUpTodayButton.click();
	}

	public void VerifyPage() {
		WaitUntilElementVisible(PDPpage_Container);
		logs("PDP page verified");
		
	}

	public void fieldValidations() {
	 WaitUntilElementClickable(PDPpage_Container);
	 ElementPresent(PDPpage_BreadCrumb);
	 ElementPresent(PDPpage_SkuName);
	 ElementPresent(PDPpage_Rating);
	 ElementPresent(PDPpage_AvailInfo);
	 ElementPresent(PDPpage_ShippingInfo);
	 ElementPresent(PDPpage_QtyInfo);
	 ElementPresent(PDPpage_AddToCart);
	 ElementPresent(PDPpage_ProductSpecification);
	 ElementPresent(PDPpage_footer);
	logs("PDP fieldvalidations verified");
	}

	public void AddRecommendatedProduct() {
		WaitUntilElementVisible(PDPpage_ProductSpecification);
		int randRecommened = rand.nextInt(PDPpage_RecommendedProducts.size()+1);
		for (int i =1;i<randRecommened; i++) {
			String RecommendedProduct = AddRecommendedCount(randRecommened).getText();
			AddRecommendedCount(randRecommened).click();
			assertTrue(RecommendedProduct.contains(PDP_TitleVerify.getText()));
			logs("Recommended product added and verified");
		}
	}
	
	public void AddAlsoViewedProduct() {
		WaitUntilElementVisible(PDPpage_ProductSpecification);
		int randRecommened = rand.nextInt(PDPpage_AlsoViewedProducts.size()+1);
		for (int i =1;i<randRecommened; i++) {
			String AlsoViewedProduct = AddAlsoViewedCount(randRecommened).getText();
			AddAlsoViewedCount(randRecommened).click();
			assertTrue(AlsoViewedProduct.contains(PDP_TitleVerify.getText()));
			logs("AlsoViewed product added and verified");
		}
	}


}
