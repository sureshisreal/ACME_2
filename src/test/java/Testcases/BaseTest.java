package Testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import listeners.TestListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

import pageObjectsRepo.ShoppingCartPageRepo;
import utilities.ExtentManager;
import Reusables.CategorypageActions;
import Reusables.HomepageActions;
import Reusables.ProductsDetailPageActions;
import Reusables.ShippingPageActions;
import Reusables.ShoppingCartPageActions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest extends ExtentManager {
	public WebDriver driver;
	protected ExtentTest extentTest;
	String screenShot;
	HomepageActions homepage;
	CategorypageActions categorypage;
	ProductsDetailPageActions productsDetailPage;
	ShoppingCartPageActions shoppingCartPage;
	ShippingPageActions shippingPage;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void beforeMethod(String browser) throws MalformedURLException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "/Users/indhul/Documents/ChromeDriver/chromedriver"); driver = new
		 * ChromeDriver();
		 */
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://qa.acmetools.com");
		homepage = PageFactory.initElements(driver, HomepageActions.class);
		categorypage = PageFactory.initElements(driver,
				CategorypageActions.class);
		productsDetailPage = PageFactory.initElements(driver,
				ProductsDetailPageActions.class);
		shoppingCartPage = PageFactory.initElements(driver,
				ShoppingCartPageActions.class);
		shippingPage = PageFactory.initElements(driver,
				ShippingPageActions.class);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("In After Method " +result.getThrowable());
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Script failed.... !!!!" +result.getStatus() );
			 extentTest.log(Status.FAIL, result.getThrowable());
		}
		System.out.println("Script completed");
		driver.quit();
	}

	public static String captureScreen(WebDriver driver, String screenName)
			throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "//Test-ScreenShots//"
				+ screenName + ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}

}
