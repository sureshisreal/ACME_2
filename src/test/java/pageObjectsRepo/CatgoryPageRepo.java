package pageObjectsRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatgoryPageRepo {
	
	@FindBy(xpath = "(.//div[@class='product_image'])[1]")
	public WebElement FirstProduct;
	
}
