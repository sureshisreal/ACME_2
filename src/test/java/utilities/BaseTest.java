package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Reusables.BillingPageActions;
import Reusables.CategorypageActions;
import Reusables.HomepageActions;
import Reusables.MyAccountPageActions;
import Reusables.ProductsDetailPageActions;
import Reusables.RegisterationPageActions;
import Reusables.ShippingPageActions;
import Reusables.ShoppingCartPageActions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.base.Predicate;

public class BaseTest extends ExtentManager {
	public WebDriver driver = null;
	public static ExtentTest extentTest;
	public static WebDriverWait wait;
	public FileInputStream fis = null;
	protected JavascriptExecutor js;
	
	 Workbook xlsWorkBook;

	protected HomepageActions homepage;
	protected CategorypageActions categorypage;
	protected ProductsDetailPageActions productsDetailPage;
	protected ShoppingCartPageActions shoppingCartPage;
	protected ShippingPageActions shippingPage;
	protected BillingPageActions billingPage;
	protected RegisterationPageActions registerationPage;
	protected MyAccountPageActions myaccountPage;



	@BeforeMethod
	@Parameters(value = { "browser" })
	public void beforeMethod(String browser) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				capabilities);
		driver.manage().window().maximize();
		//js.executeScript("document.cookie='currentZipcode=58102';");
		driver.get("https://qa.acmetools.com");
		js = (JavascriptExecutor) driver;

		
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


		myaccountPage = PageFactory.initElements(driver,
				MyAccountPageActions.class);
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			AddScreenshot();
			System.out.println("Script failed.... !!!!" + result.getStatus());
			extentTest.log(Status.FAIL, result.getThrowable());
		} 
		else {
			extentTest.log(Status.PASS, "Script Completed");
		}
		driver.quit();
	}

	public void logs(String message) {
		//System.out.println("validate extent : " +extentTest);
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
	
	
	public List<String> getColumnData(String sheetName, String columnName) throws IOException {
		
		 System.out.println(" " +sheetName + " " + columnName);
	        FileInputStream file = new FileInputStream(new File("C:\\Users\\P01242\\git\\ACME_2\\TestData.xlsx"));
		xlsWorkBook = new XSSFWorkbook(file);
		Sheet sheet1 = xlsWorkBook.getSheet(sheetName);
        List<String> columnDataList = new ArrayList<String>();

        int totalNoOfRows = sheet1.getLastRowNum() - sheet1.getFirstRowNum();
        int cellNo = getCellNumber(sheetName, columnName);

        for (int i = 1; i <= totalNoOfRows; i++) {
            Row row1 = sheet1.getRow(i);
            Cell cellValue = row1.getCell(cellNo);
            if (cellValue != null) {
                cellValue.setCellType(1);
                columnDataList.add(cellValue.getStringCellValue());
            }
        }

        return columnDataList;
    }
	
	 public int getCellNumber(String sheetName, String columnName) {
	        Sheet sheet1 = xlsWorkBook.getSheet(sheetName);
	        Row row = sheet1.getRow(0);
	        for (int i = 0; i <= row.getLastCellNum(); i++) {
	            Cell cell = row.getCell(i);
	            cell.setCellType(1);
	            String cellName = cell.getStringCellValue();
	            if (cellName.equalsIgnoreCase(columnName))
	                return i;
	        }
	        return 0;
	    }

	 public void WaitUntilElementClickable(WebElement element)
	 {
	 	WebDriverWait wait=new WebDriverWait(driver, 60, 1000);
	 	//wait.until(ExpectedConditions.visibilityOf(element));
	 	wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public void WaitUntilElementVisible(WebElement element)
	 {
	 	WebDriverWait wait=new WebDriverWait(driver, 60, 1000);
	 	wait.until(ExpectedConditions.visibilityOf(element));
	 	//wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public void ElementPresent(WebElement element){
		 Assert.assertTrue(element != null);
		 System.out.println("Element is Present");
		 logs(element + "is present");
		
	 }
	 
} // Completed 
