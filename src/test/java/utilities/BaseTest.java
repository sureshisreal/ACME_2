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
import java.util.Random;

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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Reusables.BillingPageActions;
import Reusables.CatalogActions;
import Reusables.CategorypageActions;
import Reusables.HomepageActions;
import Reusables.MyAccAddressBookPageActions;
import Reusables.MyAccCouponsPageActions;
import Reusables.MyAccountCCPageActions;
import Reusables.MyAccountPageActions;
import Reusables.OrderHistoryPageActions;
import Reusables.OrganizationBuyerActions;
import Reusables.ProductsDetailPageActions;
import Reusables.RegisterationPageActions;
import Reusables.RequestQuoteActions;
import Reusables.RequisitionListActions;
import Reusables.SearchPageActions;
import Reusables.ShippingPageActions;
import Reusables.ShoppingCartPageActions;

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
	protected SearchPageActions searchResultPage;
	protected MyAccountCCPageActions myaccCCpage;
	protected MyAccAddressBookPageActions aBookPage;
	protected MyAccCouponsPageActions couponsPage;
	protected OrderHistoryPageActions orderHistoryPage;
	protected OrganizationBuyerActions organizationBuyerPage;
	protected RequestQuoteActions requestQuoteActionsPage;
	protected RequisitionListActions requisitionListPage;
	protected CatalogActions catalogActionsPage;
	protected Random rand = new Random();

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void beforeMethod(String browser) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.manage().window().maximize();
		// js.executeScript("document.cookie='currentZipcode=58102';");
		driver.get("https://qa.acmetools.com");
		js = (JavascriptExecutor) driver;

		homepage = PageFactory.initElements(driver, HomepageActions.class);
		categorypage = PageFactory.initElements(driver, CategorypageActions.class);
		productsDetailPage = PageFactory.initElements(driver, ProductsDetailPageActions.class);
		shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPageActions.class);
		shippingPage = PageFactory.initElements(driver, ShippingPageActions.class);
		billingPage = PageFactory.initElements(driver, BillingPageActions.class);
		registerationPage = PageFactory.initElements(driver, RegisterationPageActions.class);
		registerationPage = PageFactory.initElements(driver, RegisterationPageActions.class);
		searchResultPage = PageFactory.initElements(driver, SearchPageActions.class);
		myaccountPage = PageFactory.initElements(driver, MyAccountPageActions.class);
		myaccCCpage = PageFactory.initElements(driver, MyAccountCCPageActions.class);
		aBookPage = PageFactory.initElements(driver, MyAccAddressBookPageActions.class);
		couponsPage = PageFactory.initElements(driver, MyAccCouponsPageActions.class);
		orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPageActions.class);
		organizationBuyerPage = PageFactory.initElements(driver, OrganizationBuyerActions.class);
		requestQuoteActionsPage = PageFactory.initElements(driver, RequestQuoteActions.class);
		requisitionListPage = PageFactory.initElements(driver, RequisitionListActions.class);
		catalogActionsPage = PageFactory.initElements(driver, CatalogActions.class);
		
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			AddScreenshot();
			System.out.println("Script failed.... !!!!" + result.getStatus());
			extentTest.log(Status.FAIL, result.getThrowable());
		} else {
			extentTest.log(Status.PASS, "Script Completed");
		}
		driver.quit();
	}

	public void logs(String message) {
		// System.out.println("validate extent : " +extentTest);
		extentTest.log(Status.PASS, message);
	}

	public String captureScreenShot() {
		try {
			DateFormat df = new SimpleDateFormat("dd_MM_yy_HH_mm_ss");
			Date now = new Date();
			String filePath = "..//ScreenShots//" + df.format(now) + ".png";
			/*
			 * String filePath = System.getProperty("user.dir") + "//ScreenShots//" +
			 * df.format(now) + ".png";
			 */
			// System.out.println(" filePath : " +filePath);
			TakesScreenshot screen = (TakesScreenshot) driver;
			File screenShot = screen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File(filePath));
			return filePath;
		} catch (IOException e) {
		}
		return null;
	}

	protected void AddScreenshot() throws IOException {
		extentTest.log(Status.PASS, "" + extentTest.addScreenCaptureFromPath(captureScreenShot()));
	}

	protected void TestDescription(String Title, String Description) {
		extentTest = extent.createTest(Title, Description);
	}

	public List<String> getColumnData(String sheetName, String columnName) throws IOException {

		// System.out.println(" " +sheetName + " " + columnName);
		FileInputStream file = new FileInputStream(new File("TestData.xlsx"));
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

	public void WaitUntilElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitUntilElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60, 1000);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public Boolean ElementPresent(WebElement element) {
		if (element.isDisplayed()) {
			// System.out.println("Element is Present");
			logs(element + "is present");
			return true;
		} else {
			logs(element + "is NOT present");
			return false;

		}

	}
	
	public void ScrollToElement(WebElement element) {
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
} // Completed
