package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ExtentManager;
import Reusables.BillingPageActions;
import Reusables.CategorypageActions;
import Reusables.HomepageActions;
import Reusables.ProductsDetailPageActions;
import Reusables.RegisterationPageActions;
import Reusables.ShippingPageActions;
import Reusables.ShoppingCartPageActions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest extends ExtentManager {
	public WebDriver driver;
	protected ExtentTest extentTest;
	public FileInputStream fis = null;

	protected HomepageActions homepage;
	protected CategorypageActions categorypage;
	protected ProductsDetailPageActions productsDetailPage;
	protected ShoppingCartPageActions shoppingCartPage;
	protected ShippingPageActions shippingPage;
	protected BillingPageActions billingPage;
	protected RegisterationPageActions registerationPage;

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void beforeMethod(String browser) throws MalformedURLException {
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
		billingPage = PageFactory
				.initElements(driver, BillingPageActions.class);
		registerationPage = PageFactory.initElements(driver,
				RegisterationPageActions.class);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		System.out.println("In After Method " + result.getThrowable());
		if (result.getStatus() == ITestResult.FAILURE) {
			AddScreenshot();
			System.out.println("Script failed.... !!!!" + result.getStatus());
			extentTest.log(Status.FAIL, result.getThrowable());
		} else {
			extentTest.log(Status.PASS, "Script Completed");
		}
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

	public void logs(String message) {
		extentTest.log(Status.PASS, message);
	}

	public String captureScreenShot() {
		try {
			DateFormat df = new SimpleDateFormat("dd_MM_yy_HH_mm_ss");
			Date now = new Date();
			String filePath = System.getProperty("user.dir")
					+ "//Test-ScreenShots//" + df.format(now) + ".png";
			TakesScreenshot screen = (TakesScreenshot) driver;
			File screenShot = screen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File(filePath));
			return filePath;
		} catch (IOException e) {
		}
		return null;
	}

	protected void AddScreenshot() throws IOException {
		extentTest.log(Status.PASS,
				"" + extentTest.addScreenCaptureFromPath(captureScreenShot()));
	}

	protected void TestDescription(String Title, String Description) {
		extentTest = extent.createTest(Title, Description);
	}

}
