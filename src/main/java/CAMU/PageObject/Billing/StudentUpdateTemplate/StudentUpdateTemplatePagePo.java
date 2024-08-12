package CAMU.PageObject.Billing.StudentUpdateTemplate;

import java.io.IOException;
import java.util.List;

import Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.Waiters;

public class StudentUpdateTemplatePagePo {

	private static StudentUpdateTemplatePagePo StudentUpdateTemplatePageInstance;
	String newCellValue;
	String mobileNumber;

	private StudentUpdateTemplatePagePo() {

	}

	public static StudentUpdateTemplatePagePo getInstance() {
		if (StudentUpdateTemplatePageInstance == null) {
			StudentUpdateTemplatePageInstance = new StudentUpdateTemplatePagePo();
		}
		return StudentUpdateTemplatePageInstance;
	}

	@FindBy(css = "div.justify-content-between p")
	private List<WebElement> studentProfileInfo;

	@FindBy(xpath = "//div[@class='list-form_container']//p[text()='Profile']")
	private WebElement StudentProfileHeading;

	@FindBy(xpath = "//button[text()='More Info']")
	private WebElement moreInfoButton;

	@FindBy(xpath = "//button[@role='tab']")
	private List<WebElement> buttonList;

	@FindBy(xpath = "//label[text()='Mobile No.']/following-sibling::input")
	private WebElement mobileNumberField;

	@FindBy(xpath = "//div[@class='dropdown']/button[@id='dropdown-basic' and text()='Action']")
	private WebElement actionDropDown;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//a")
	private List<WebElement> actionDropDownOptionList;

	@FindBy(xpath = "//button[contains(text(),'Click to download')]")
	private WebElement clickDownloadTemplateButton;

	public void verifyStudentProfileIsDisplayed(String studentName) {
		Waiters.waitForListOfElementsToBeVisible(studentProfileInfo);
		for (int i = 0; i < studentProfileInfo.size(); i++) {
			Waiters.waitForElementToBeVisible(studentProfileInfo.get(i));
//			System.out.println(i);
//			System.out.println(studentProfileInfo.get(i).getText());
			if (studentProfileInfo.get(i).getText().equals(studentName)) {
				Asserts.assertTrue(true);
				break;
			} else {
				Asserts.assertTrue(false, "Expected " + studentName + ", is not matched with actual "
						+ studentProfileInfo.get(i).getText());
			}
		}
		Asserts.assertTrue(StudentProfileHeading.isDisplayed(), "Student profile tab is not displayed");
	}

	public void clickMoreInfo() {
		Waiters.waitForElementToBeVisible(moreInfoButton);
		Waiters.waitForElementToBeClickable(moreInfoButton);
		moreInfoButton.click();
	}

	public void clickOnTab(String option) {
		Waiters.waitForListOfElementsToBeVisible(buttonList);
		ElementUtils.clickOnOptionFromList(buttonList, option);
	}

	public void getMobileNumber() {
		Waiters.waitForElementToBeVisible(mobileNumberField);
		ElementUtils.scrollInToElement(mobileNumberField);
		mobileNumber = ElementUtils.getInputValue(mobileNumberField);
	}

	public void clickActionDropDown(String option) {
		Waiters.waitForElementToBeVisible(actionDropDown);
		Waiters.waitForElementToBeClickable(actionDropDown);
		actionDropDown.click();
		ElementUtils.clickOnOptionFromList(actionDropDownOptionList, option);
	}

	public void clickDownloadSampleFormat() {
		Waiters.waitForElementToBeVisible(clickDownloadTemplateButton);
		Waiters.waitForElementToBeClickable(clickDownloadTemplateButton);
		clickDownloadTemplateButton.click();
	}

	public void uploadStudentTemplate() {
		Waiters.waitForElementToBeVisible(clickDownloadTemplateButton);
		Waiters.waitForTimeout(1000);
		CommonUtils.uploadFile("div.camu-file_dnd input[type='file']",
				System.getProperty("user.dir") + "/src/test/resources/fileUpload/Student Update Template.xlsx");
		Waiters.waitForTimeout(2000);
	}

	public void openNewIncognito() {
		WebDriver driver2 = new ChromeDriver();

		for (String handle : DriverManager.getDriver().getWindowHandles()) {
			driver2.switchTo().window(handle);
		}
	}

	public void switchNewIncognito() {

	}

	public void updateSheetValue(String sheetName, String headerName, String rowIdentifier, String cellValue) throws IOException {
		newCellValue = cellValue;
		CommonUtils.excelWriteData(sheetName, headerName, rowIdentifier, cellValue);
	}

	public void verifyMobileNumberUpdated() {
		System.out.println(newCellValue);
		System.out.println(mobileNumber);
		Asserts.assertNotEqualsText(newCellValue, mobileNumber);
	}
}
