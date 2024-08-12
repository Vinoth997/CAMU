package Utilities;

import java.io.*;
import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CAMU.PageObject.Billing.BillingItemCategory.BillingItemCategoryPagePo;
import CAMU.PageObject.Billing.StudentUpdateTemplate.StudentUpdateTemplatePagePo;
import CAMU.PageObject.Enterprise.BatchPage.BatchPagePo;
import CAMU.PageObject.Enterprise.BillingCourseConfigurationPage.BillingCourseConfigurationPagePo;
import CAMU.PageObject.Enterprise.BloomsTaxonomyPage.BloomsTaxonomyPagePo;
import CAMU.PageObject.Enterprise.Billingconfiguration.BillingconfigurationPagePo;
import CAMU.PageObject.Enterprise.CampusPage.CampusPagePo;
import CAMU.PageObject.Enterprise.CourseMappingPage.CourseMappingPagePo;
import CAMU.PageObject.Enterprise.CoursesPage.CoursesPagePo;
import CAMU.PageObject.Enterprise.DepartmentPage.DepartmentPagePo;
import CAMU.PageObject.Enterprise.FacilitiesPage.FacilitiesPagePo;
import CAMU.PageObject.Enterprise.FeedbackPage.FeedbackPagePo;
import CAMU.PageObject.Enterprise.LocationsPage.LocationsPagePo;
import CAMU.PageObject.Enterprise.DegreePage.DegreePagePo;
import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import CAMU.PageObject.Enterprise.SemesterPage.SemesterPagePo;
import CAMU.PageObject.Enterprise.TimetablePage.TimetablePagePo;
import CAMU.PageObject.FunctionalityTesting.TimetablePage.TimetableFunctionalityPagePo;
import CAMU.PageObject.Enterprise.SectionPage.SectionPagePo;
import CAMU.PageObject.LoginPage.LoginPagePo;
import CAMU.PageObject.Students.StudentListPage.StudentLeavePagePo;
import CAMU.PageObject.Students.StudentListPage.StudentListPagePo;
import Driver.DriverManager;




public class CommonUtils {
	
	private static final Logger LOGGER = LogManager.getLogger(CommonUtils.class);
	private static CommonUtils commonUtilsInstance = null;


	private CommonUtils() {

	}

	public static CommonUtils getInstance() {
		if (commonUtilsInstance == null) {
			commonUtilsInstance = new CommonUtils();
		}
		return commonUtilsInstance;
	}
	
	public void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), ProgramPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), SemesterPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), DepartmentPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), SectionPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), DegreePagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CourseMappingPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CampusPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), FacilitiesPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LocationsPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), BatchPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), FeedbackPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), BloomsTaxonomyPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CoursesPagePo.getInstance());;
		PageFactory.initElements(DriverManager.getDriver(), BillingconfigurationPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CoursesPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), TimetablePagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), BillingCourseConfigurationPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), StudentListPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), StudentLeavePagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), BillingItemCategoryPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), TimetableFunctionalityPagePo.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), StudentUpdateTemplatePagePo.getInstance());
	}
	
	public void takeScreenShot() {
		File scrnsht = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

		try {
//			FileUtils.copyFile(scrnsht, new File(beforeSteps.getScenarioName() + ".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String excelGetdata(String sheetName, int rowNum, int cellNum) throws IOException {
		File file = new File(System.getProperty("user.dir") + "/src/test/resources/dataSheet.xlsx");
		FileInputStream ExcelFile = new FileInputStream(file);

		XSSFWorkbook wBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet sheet = wBook.getSheet(sheetName);

		String cellValue = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();

		wBook.close();
		ExcelFile.close();
		return cellValue;
	}
	
	public static void uploadFiles(WebElement element, String fileName) {
		element.sendKeys(System.getProperty("user.dir")+"/src/test/fileUpload/"+fileName);
	}
	
	public static void dateSelector(WebElement element, String targetDate) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMinutes(2));
		element.click();

		String[] dateComponents = targetDate.split(" ")[0].split("-");//25-Mar-2024

//		WebElement title = DriverManager.getDriver()
//				.findElement(By.cssSelector(".date-picker.rdtOpen .rdtPicker .rdtSwitch"));
		WebElement title=DriverManager.getDriver().findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtSwitch']"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();

		Thread.sleep(2000);

		while (true) {
			WebElement yearTxt = DriverManager.getDriver()
					.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtSwitch']"));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(yearTxt));
			String year = yearTxt.getText();
			int actualYear = Integer.parseInt(year);
			int expectedYear = Integer.parseInt(dateComponents[2]);

			if (actualYear > expectedYear) {
				WebElement previous = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtPrev']"));
				wait.until(ExpectedConditions.elementToBeClickable(previous));
				previous.click();
			} else if (actualYear < expectedYear) {
				WebElement next = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtNext']"));
				wait.until(ExpectedConditions.elementToBeClickable(next));
				next.click();
			} else {
				break;
			}
		}

		List<WebElement> month = DriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//td[@class='rdtMonth']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(month));
		for (int i = 0; i < month.size(); i++) {
			String elementText = month.get(i).getText();
//			System.out.println(elementText);
			if (elementText.equals(dateComponents[1])) {
//				System.out.println(elementText);
				Waiters.waitForElementToBeClickable(month.get(i));
				month.get(i).click();
				break;
			}
		}

		String daySelector = String.format("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::td[contains(@class,'rdtActive') or @class='rdtDay' or contains(@class,'rdtToday') ]//self::td[@data-value='%d']", Integer.parseInt(dateComponents[0]));
		DriverManager.getDriver().findElement(By.xpath(daySelector)).click();
	}


	public static void setTime(WebElement element,String time) {
		
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMinutes(2));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Waiters.waitForTimeout(500);
		element.click();
//		DriverManager.getDriver().findElement(By.cssSelector(".rdt.date-picker.rdtOpen .rdtTimeToggle")).click();
		String[] timeComponents = time.split(" ")[0].split(":"); // Split the time component

		int targetHour = Integer.parseInt(timeComponents[0]);
		int targetMinute = Integer.parseInt(timeComponents[1]);

		// Updated the split to include AM/PM
		String targetAmPm = time.split(" ")[1]; // Extract the AM/PM component directly

		Waiters.waitForTimeout(1000);

		WebElement hourElement = DriverManager.getDriver()
				.findElement(By.xpath("(//div[@class='rdtCounter'])[1]/div[@class='rdtCount']"));
		// Select the hour
		while (true) {
			String currentHour = hourElement.getText().trim();
			int currentHourValue = Integer.parseInt(currentHour);

			if (currentHourValue == targetHour) {
				break;
//			} else if (currentHourValue < targetHour) {
//				// Click on the "Next" button for hours
//				DriverManager.getDriver()
//						.findElement(By.xpath("((//div[@class='rdtCounter'])[1]/span[@class='rdtBtn'])[2]")).click();
			} else {
				// Click on the "Previous" button for hours
				DriverManager.getDriver()
						.findElement(By.xpath("((//div[@class='rdtCounter'])[1]/span[@class='rdtBtn'])[2]")).click();
			}
		}

		WebElement minuteElement = DriverManager.getDriver()
				.findElement(By.xpath("(//div[@class='rdtCounter'])[2]/div[@class='rdtCount']"));
		// Select the minute
		while (true) {
			String currentMinute = minuteElement.getText().trim();
			int currentMinuteValue = Integer.parseInt(currentMinute);

			if (currentMinuteValue == targetMinute) {
				break;
//			} else if (currentMinuteValue < targetMinute) {
//				// Click on the "Next" button for minutes
//				DriverManager.getDriver()
//						.findElement(By.xpath("((//div[@class='rdtCounter'])[2]/span[@class='rdtBtn'])[2]")).click();
			} else {
				// Click on the "Previous" button for minutes
				DriverManager.getDriver()
						.findElement(By.xpath("((//div[@class='rdtCounter'])[2]/span[@class='rdtBtn'])[2]")).click();
			}
		}

		WebElement sessionElement = DriverManager.getDriver()
				.findElement(By.xpath("(//div[@class='rdtCounter'])[3]/div[@class='rdtCount']"));
		// Select the AM/PM
		while (true) {
			String currentAmPm = sessionElement.getText().trim();

			if (currentAmPm.equals(targetAmPm)) {
				break;
			} else {
				// Click on the "Next" button for AM/PM
				DriverManager.getDriver()
						.findElement(By.xpath("((//div[@class='rdtCounter'])[3]/span[@class='rdtBtn'])[2]")).click();
			}
		}
		
		WebElement divElement = DriverManager.getDriver().findElement(By.xpath("//div"));
//		Waiters.waitForElementToBeClickable(divElement);
		Waiters.waitForTimeout(1000);
//		divElement.click();
		ElementUtils.forceClickWithJs(divElement);
	}
	
	private static WebElement findFileInput(String querySelector) {
	    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	    WebElement fileInput = (WebElement) js.executeScript("return document.querySelector(arguments[0])", querySelector);

	    if (fileInput != null) {
	        return fileInput;
	    } else {
	        System.out.println("File input not found");
	        return null;
	    }
	}
	
	public static void uploadFile(String querySelector, String filePath) {
        WebElement fileInput = findFileInput(querySelector);
        if (fileInput != null) {
            fileInput.sendKeys(filePath);
        } else {
            System.out.println("File input not found");
        }
    }

	public static void dateSelectorIntegerFormat(WebElement element, String date) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(100));
		element.click();

		String[] splitedDate = date.split("-");

		WebElement title = DriverManager.getDriver().findElement(By.cssSelector(".datepicker-days .datepicker-switch"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();
		
		Thread.sleep(2000);

		while (true) {
			WebElement Year = DriverManager.getDriver()
					.findElement(By.cssSelector(".datepicker-months .datepicker-switch"));
			wait.until(ExpectedConditions.visibilityOf(Year));

			String YearText = Year.getText();
			int actualYear = Integer.parseInt(YearText);
			int expectedYear = Integer.parseInt(splitedDate[2]);

			if (actualYear > expectedYear) {
				WebElement previous = DriverManager.getDriver().findElement(By.cssSelector(".datepicker-months .prev"));
				wait.until(ExpectedConditions.elementToBeClickable(previous));
				previous.click();
			} else if (actualYear < expectedYear) {
				WebElement next = DriverManager.getDriver().findElement(By.cssSelector(" .datepicker-months .next"));
				wait.until(ExpectedConditions.elementToBeClickable(next));
				next.click();
			} else {
				break;
			}
		}

		List<WebElement> months = DriverManager.getDriver().findElements(By.cssSelector(".datepicker-months .month"));
		int monthIndex = Integer.parseInt(splitedDate[1]) - 1;
		WebElement targetMonth = months.get(monthIndex);
		wait.until(ExpectedConditions.elementToBeClickable(targetMonth));
		targetMonth.click();

		String format = String.format(
				"//div[@class='datepicker-days']//table/tbody/tr/td[@class='day' and text()='%d']",
				Integer.parseInt(splitedDate[0]));

		wait.until(ExpectedConditions.elementToBeClickable(DriverManager.getDriver().findElement(By.xpath(format))));
		DriverManager.getDriver().findElement(By.xpath(format)).click();
	}
	
	public void toAccessPagination() {
		WebElement element = DriverManager.getDriver()
				.findElement(By.cssSelector(".table-pagination_view .text-secondary"));
		System.out.println(element.getText());
		String[] text = element.getText().split(" ");
		for (int i = 0; i < text.length; i++) {
			String string = text[i];
			System.out.println(string);
		}
		WebElement PageNo = DriverManager.getDriver().findElement(By.cssSelector(".table-count_input.form-control"));
		System.out.println(PageNo.getAttribute("title"));
		String Page = PageNo.getAttribute("title");
		WebElement first_Page = DriverManager.getDriver()
				.findElement(By.xpath("//span[text()='first_page']//parent::button[contains(@class,'btn-secondary')]"));
		WebElement previous = DriverManager.getDriver().findElement(By.xpath("//button[text()='Prev']"));
		WebElement next = DriverManager.getDriver().findElement(By.xpath("//button[text()='Next']"));
		WebElement last_Page = DriverManager.getDriver()
				.findElement(By.xpath("//span[text()='last_page']//parent::button[contains(@class,'btn-secondary')]"));
		if (text[1].equals(Page)) {
			Asserts.assertTrue(!first_Page.isEnabled(), "first_Page is enabled");
			Asserts.assertTrue(!previous.isEnabled(), "first_Page is enabled");
		} else if (text[3].equals(Page)) {
			Asserts.assertTrue(!next.isEnabled());
			Asserts.assertTrue(!last_Page.isEnabled());
		}else {
			Asserts.assertTrue(first_Page.isEnabled(), "first_Page button is not clickable");
			Asserts.assertTrue(previous.isEnabled(), "prev_Page button is not clickable");
			Asserts.assertTrue(next.isEnabled(),"next button is not clickable");
			Asserts.assertTrue(last_Page.isEnabled(),"last_page button is not clickable");
		}
	}
	
	public static void dateSelectorWithForceClick(WebElement element, String targetDate) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMinutes(2));
		element.click();

		String[] dateComponents = targetDate.split(" ")[0].split("-");//25-Mar-2024

//		WebElement title = DriverManager.getDriver()
//				.findElement(By.cssSelector(".date-picker.rdtOpen .rdtPicker .rdtSwitch"));
		WebElement title=DriverManager.getDriver().findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtSwitch']"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
//		title.click();
		ElementUtils.forceClickWithJs(title);

		Thread.sleep(2000);

		while (true) {
			WebElement yearTxt = DriverManager.getDriver()
					.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtSwitch']"));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(yearTxt));
			String year = yearTxt.getText();
			int actualYear = Integer.parseInt(year);
			int expectedYear = Integer.parseInt(dateComponents[2]);

			if (actualYear > expectedYear) {
				WebElement previous = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtPrev']"));
				wait.until(ExpectedConditions.elementToBeClickable(previous));
//				previous.click();
				ElementUtils.forceClickWithJs(previous);
			} else if (actualYear < expectedYear) {
				WebElement next = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//th[@class='rdtNext']"));
				wait.until(ExpectedConditions.elementToBeClickable(next));
//				next.click();
				ElementUtils.forceClickWithJs(next);
			} else {
				break;
			}
		}

		List<WebElement> month = DriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::div[@class='rdtPicker']//td[@class='rdtMonth' or @class='rdtMonth rdtActive']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(month));
		for (int i = 0; i < month.size(); i++) {
			String elementText = month.get(i).getText();
			if (elementText.equals(dateComponents[1])) {
				Waiters.waitForElementToBeClickable(month.get(i));
				month.get(i).click();
				Waiters.waitForTimeout(500);
//				ElementUtils.forceClickWithJs(month.get(i));
				break;
			}
		}

		Waiters.waitForTimeout(500);
		String daySelector = String.format(" //div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]/ancestor::div/following::td[contains(@class,'rdtActive') or @class='rdtDay' or contains(@class,'rdtToday') ]//self::td[@data-value='%d']", Integer.parseInt(dateComponents[0]));
//		DriverManager.getDriver().findElement(By.xpath(daySelector)).click();
		ElementUtils.forceClickWithJs(DriverManager.getDriver().findElement(By.xpath(daySelector)));
	}
	
	public static void dateSelectorAlter(WebElement element, String targetDate) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMinutes(2));
		element.click();

		String[] dateComponents = targetDate.split(" ")[0].split("-");//25-Mar-2024

		WebElement title=DriverManager.getDriver().findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//th[@class='rdtSwitch']"));
		wait.until(ExpectedConditions.elementToBeClickable(title));
		title.click();

		Thread.sleep(2000);

		while (true) {
			WebElement yearTxt = DriverManager.getDriver()
					.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//th[@class='rdtSwitch']"));
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(yearTxt));
			String year = yearTxt.getText();
			int actualYear = Integer.parseInt(year);
			int expectedYear = Integer.parseInt(dateComponents[2]);

			if (actualYear > expectedYear) {
				WebElement previous = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//th[@class='rdtPrev']"));
				wait.until(ExpectedConditions.elementToBeClickable(previous));
				previous.click();
			} else if (actualYear < expectedYear) {
				WebElement next = DriverManager.getDriver()
						.findElement(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//th[@class='rdtNext']"));
				wait.until(ExpectedConditions.elementToBeClickable(next));
				next.click();
			} else {
				break;
			}
		}

		List<WebElement> month = DriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//td[@class='rdtMonth']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(month));
		for (int i = 0; i < month.size(); i++) {
			String elementText = month.get(i).getText();
			if (elementText.equals(dateComponents[1])) {
				Waiters.waitForElementToBeClickable(month.get(i));
				month.get(i).click();
				break;
			}
		}

		String daySelector = String.format("//div[contains(@class,'date-picker') and contains(@class,'rdtOpen')]//div[@class='rdtPicker']//td[contains(@class,'rdtActive') or @class='rdtDay' or contains(@class,'rdtToday') ]//self::td[@data-value='%d']", Integer.parseInt(dateComponents[0]));
		DriverManager.getDriver().findElement(By.xpath(daySelector)).click();
	}
	
	public static void selectDropDownOption(String option) {
		Waiters.waitForTimeout(500);
		List<WebElement> optionList = DriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'css') and contains(@class,'menu')]//div[@role='listbox']//div[@role='option']"));
		Waiters.waitForListOfElementsToBeVisible(optionList);
		ElementUtils.clickOnOptionFromList(optionList, option);
		Waiters.waitForTimeout(500);
	}
	
	public static void selectDropDownOptionWithContains(String option) {
		Waiters.waitForTimeout(500);
		List<WebElement> optionList = DriverManager.getDriver().findElements(By.xpath("//div[contains(@class,'css') and contains(@class,'menu')]//div[@role='listbox']//div[@role='option']"));
		Waiters.waitForListOfElementsToBeVisible(optionList);
		ElementUtils.clickOnOptionContainsFromList(optionList, option);
		Waiters.waitForTimeout(500);
	}

	public static void excelWriteData(String sheetName, String headerName, String rowIdentifier, String cellValue) throws IOException {
		// Simulate a wait if needed
		Waiters.waitForTimeout(3000);
		// Define the file path
		File file = new File(System.getProperty("user.dir") + "/src/test/resources/fileUpload/Student Update Template.xlsx");

		// Check if the file exists and is not empty
		if (!file.exists() || file.length() == 0) {
			throw new FileNotFoundException("The specified file was not found or is empty: " + file.getAbsolutePath());
		}

		try (FileInputStream excelFile = new FileInputStream(file)) {
			// Open the workbook and sheet
			XSSFWorkbook wBook = new XSSFWorkbook(excelFile);
			XSSFSheet sheet = wBook.getSheet(sheetName);

			if (sheet == null) {
				wBook.close();
				throw new IllegalArgumentException("Sheet '" + sheetName + "' does not exist in the workbook.");
			}

			// Find the header row and column number
			int headerRowNum = 0; // Assuming header is in the first row
			int colNum = -1;

			XSSFRow headerRow = sheet.getRow(headerRowNum);
			if (headerRow == null) {
				wBook.close();
				throw new IllegalArgumentException("Header row not found at row number: " + headerRowNum);
			}

			for (int i = 0; i < headerRow.getLastCellNum(); i++) {
				XSSFCell cell = headerRow.getCell(i);
				if (cell != null && cell.getStringCellValue().equalsIgnoreCase(headerName)) {
					colNum = i;
					break;
				}
			}

			if (colNum == -1) {
				wBook.close();
				throw new IllegalArgumentException("Header '" + headerName + "' not found in the sheet.");
			}

			int rowNumber = Integer.parseInt(rowIdentifier);
			XSSFRow row = sheet.getRow(rowNumber);
			if (row == null) {
				row = sheet.createRow(rowNumber);
			}

			XSSFCell cell = row.getCell(colNum);
			if (cell == null) {
				cell = row.createCell(colNum);
			}

			cell.setCellValue(cellValue);

			// Save the changes to the file
			try (FileOutputStream outFile = new FileOutputStream(file)) {
				wBook.write(outFile);
			}

			// Close the workbook
			wBook.close();
		} catch (FileNotFoundException e) {
			System.err.println("The file was not found or is empty: " + file.getAbsolutePath());
			throw e;
		} catch (IOException e) {
			System.err.println("An error occurred while processing the Excel file.");
			e.printStackTrace();
			throw e;
		}
    }


}




