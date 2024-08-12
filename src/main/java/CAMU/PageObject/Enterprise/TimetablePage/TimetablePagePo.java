package CAMU.PageObject.Enterprise.TimetablePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class TimetablePagePo {
	private static TimetablePagePo timeTablePageInstance;
	String perName;

	public TimetablePagePo() {

	}

	public static TimetablePagePo getInstance() {
		if (timeTablePageInstance == null) {
			timeTablePageInstance = new TimetablePagePo();
		}
		return timeTablePageInstance;
	}

	@FindBy(xpath = "//p[text()='Create new configuration']")
	private WebElement verifyTimetablePage;

	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;

	@FindBy(xpath = "//input[@name='PerNm']")
	private WebElement periodName;

	@FindBy(xpath = "//input[@name='FrTime']")
	private WebElement startTime;

	@FindBy(xpath = "//input[@name='ToTime']")
	private WebElement toTime;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	@FindBy(xpath = "//p[text()='Period saved successfully']")
	private WebElement saveConfirmationMessage;

	@FindBy(xpath = "//p[text()='Period name already exists.']")
	private WebElement duplicateErrorMessage;

	@FindBy(xpath = "//button[text()='Reset']")
	private WebElement resetButton;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement cancelbutton;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBar;

	@FindBy(xpath = "//a[@class='dropdown-item']")
	private WebElement inActiveAndActiveButton;

	@FindBy(xpath = "//p[contains(text(),'updated successfully.')]")
	private WebElement updatedConfirmationMessage;

	@FindBy(xpath = "//button[@id='camu-tabs-tab-periodGrp']")
	private WebElement periodGroupButton;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addPeriodGroupButton;

	@FindBy(xpath = "//div[text()='Add period group']")
	private WebElement verifyAddPeriodGroupScreen;

	@FindBy(xpath = "//input[@id='InId']")
	private WebElement institutionForNewPeriodGroup;

	@FindBy(xpath = "//input[@id='PrID']")
	private WebElement programForNewPeriodGroup;

	@FindBy(xpath = "//input[@id='CrID']")
	private WebElement courseForNewPeriodGroup;

	@FindBy(xpath = "//input[@id='AcYr']")
	private WebElement academicYearForNewPeriodGroup;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonAddPeriodGroup;
	
	@FindBy(xpath = "//p[text()='Period group already exists']")
	private WebElement duplicatePeriodGroupErrorMessage;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement periodGroupCancelButton;
	
	@FindBy(css = ".Toastify__toast-container .Toastify__close-button")
	private WebElement toastCloseButton;

	public void toVerifyCreateNewPage() {
		Waiters.waitForElementToBeVisible(verifyTimetablePage);
		Asserts.assertTrue(verifyTimetablePage.isDisplayed(), "Page error");
	}

	public void toClickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public void toPassPeriodName(String name) {
		Waiters.waitForElementToBeVisible(periodName);
		perName = name + StringUtils.generateRandomNumbers(3);
		periodName.sendKeys(perName);
	}

	public void toSelectStartTimeFromTimePicker(String stTime) {
		Waiters.waitForElementToBeVisible(startTime);
//		startTime.click();
		CommonUtils.setTime(startTime, stTime);
	}

	public void toSelectToTimeFromTimePicker(String endTime) {
		Waiters.waitForElementToBeVisible(toTime);
		CommonUtils.setTime(toTime, endTime);
	}

	public void toClickSaveButton() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}

	public void toVerifySaveConfirmationMessage() {
		Waiters.waitForElementToBeVisible(saveConfirmationMessage);
		Asserts.assertTrue(saveConfirmationMessage.isDisplayed(), "Not saved");
	}

	public void toPassDuplicatePeriodName(String PName) {
		Waiters.waitForElementToBeVisible(periodName);
		periodName.sendKeys(PName);
	}

	public void toVerifyDuplicateErrorMessage() {
		Waiters.waitForElementToBeVisible(duplicateErrorMessage);
		Asserts.assertTrue(duplicateErrorMessage.isDisplayed(), "It's not a duplicate");

	}

	public void toClickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		Waiters.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}

	public boolean toVerifyAllFieldsAreResetted() {
		boolean resetAllFields = ElementUtils.getInputValue(periodName).isEmpty()
				&& ElementUtils.getInputValue(startTime).isEmpty() && ElementUtils.getInputValue(toTime).isEmpty();
		return resetAllFields;
	}

	public void toClickCancelButton() {
		Waiters.waitForElementToBeVisible(cancelbutton);
		cancelbutton.click();
	}

	public void toSearchThePeriodName(String pName) {
		Waiters.waitForElementToBeVisible(searchBar);
		searchBar.click();
		searchBar.sendKeys(pName);
	}

	public void toClickThreeDot(String name) {
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//td[contains(@class,'text-primary') and text()='" + name
						+ "']//following-sibling::td//button[@id='dropdown-basic']"));
		element.click();
	}

	public void toViewTheFilteredPeriodName(String name) {
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//td[contains(@class,'text-primary') and text()='" + name + "']"));
		Asserts.assertTrue(element.isDisplayed(), "No data found-wrong period name");
	}

	public void toClickInActiveButton() {
		Waiters.waitForElementToBeVisible(inActiveAndActiveButton);
		Waiters.waitForElementToBeClickable(inActiveAndActiveButton);
		inActiveAndActiveButton.click();
	}

	public void toVerifyUpdatedConfirmation() {
		Waiters.waitForElementToBeVisible(updatedConfirmationMessage);
		Asserts.assertTrue(updatedConfirmationMessage.isDisplayed(), "Something went wrong to change status");
	}

	public void toClickPeriodGroupButton() {
		Waiters.waitForElementToBeVisible(periodGroupButton);
		Waiters.waitForElementToBeClickable(periodGroupButton);
		periodGroupButton.click();
	}

	public void toVerifyInstitutionIsSelectedByDefault(String ins) {
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//div[contains(@class,'singleValue') and text()='CBCS - CAMU']"));
		Asserts.assertTrue(element.isDisplayed(), "Institution is  not selected");
	}

	public void toEnableThePeriodsByClickingCheckbox(String name) {

		String[] perArray = name.split(",");
		for (int i = 0; i < perArray.length; i++) {
			String string = perArray[i];

			WebElement element = DriverManager.getDriver()
					.findElement(By.xpath("//label[contains(text(),'" + string + "')]//preceding-sibling::input"));
			if (!element.isSelected()) {
				Waiters.waitForElementToBeVisible(element);
				ElementUtils.scrollInToElement(element);
				element.click();
			}

		}
//		WebElement element = DriverManager.getDriver().findElement(By.xpath("//label[contains(text(),'"+name+"')]//preceding-sibling::input"));
//		element.click();
	}

	public void toClickAddPeriodGroupButton() {
		Waiters.waitForElementToBeVisible(addPeriodGroupButton);
		addPeriodGroupButton.click();
	}

	public void toVerifyAddPeriodGroupScreen() {
		Waiters.waitForElementToBeVisible(verifyAddPeriodGroupScreen);
		Asserts.assertTrue(verifyAddPeriodGroupScreen.isDisplayed(), "Unable to find the title of period group");
	}

	public void toPassAndSelectInstitutionForNewPeriodGroup(String inst) {
		Waiters.waitForElementToBeVisible(institutionForNewPeriodGroup);
		institutionForNewPeriodGroup.sendKeys(inst);
		CommonUtils.selectDropDownOption(inst);
	}

	public void toPassAndSelectProgramForNewPeriodGroup(String pgm) {
		Waiters.waitForElementToBeVisible(programForNewPeriodGroup);
		programForNewPeriodGroup.sendKeys(pgm);
		CommonUtils.selectDropDownOption(pgm);
	}

	public void toPassAndSelectCourseForNewPeriodGroup(String course) {
		Waiters.waitForElementToBeVisible(courseForNewPeriodGroup);
		courseForNewPeriodGroup.sendKeys(course);
		CommonUtils.selectDropDownOption(course);
	}

	public void toPassAndSelectAcademicYearForNewPeriodGroup(String acYr) {
		Waiters.waitForElementToBeVisible(academicYearForNewPeriodGroup);
		academicYearForNewPeriodGroup.sendKeys(acYr);
		CommonUtils.selectDropDownOption(acYr);
	}

	public void toSavePeriodGroup() {
		Waiters.waitForElementToBeVisible(saveButtonAddPeriodGroup);
		Waiters.waitForElementToBeClickable(saveButtonAddPeriodGroup);
		saveButtonAddPeriodGroup.click();
	}
	
	public void toVerifyPeriodGroupDuplicateErrorMessage() {
		Waiters.waitForElementToBeVisible(duplicatePeriodGroupErrorMessage);
		Asserts.assertTrue(duplicatePeriodGroupErrorMessage.isDisplayed(), "It's not a duplicate");
		
	}
	
	public void toClickPeriodGroupCancelButton() {
		Waiters.waitForElementToBeVisible(periodGroupCancelButton);
		Waiters.waitForElementToBeClickable(periodGroupCancelButton);
		periodGroupCancelButton.click();
	}
	
	public void toUploadBulkData() throws IOException {
		String filepath = System.getProperty("user.dir")+"/src/test/resources/dataSheet.xlsx";
		FileInputStream FIS = new FileInputStream(filepath);
		Workbook wb = new XSSFWorkbook(FIS);
		Sheet ttSheet = wb.getSheet("UOW-Timetable");
		int lastRowNum = ttSheet.getLastRowNum();
		
		Cell PN = null;
		Cell PST = null;
		Cell PET = null;
		String time = null;
		String timeEnd = null;
		
		for (int i = 177; i <= lastRowNum; i++) {
			 PN = ttSheet.getRow(i).getCell(0);
			 PST = ttSheet.getRow(i).getCell(1);
			 PET = ttSheet.getRow(i).getCell(2);
			 
			 String periodN = PN.getStringCellValue();
			 String startT = PST.getStringCellValue();
			 String endT = PET.getStringCellValue();
			 
			 System.out.println(periodN+"------->"+i+"\n"+startT+"\n"+endT+"\n");
			 
			 if(startT.contains("AM")) {
				  time = startT.replaceAll("AM", " AM");
			 }else if(startT.contains("PM")) {
				 time = startT.replaceAll("PM", " PM");
			 }
			 
			 if(endT.contains("AM")) {
				  timeEnd = endT.replaceAll("AM", " AM");
			 }else if(endT.contains("PM")) {
				 timeEnd = endT.replaceAll("PM", " PM");
			 }
			 
			 System.out.println(time+"\n"+timeEnd+"\n");
			 
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
		
//		 System.out.println(PN+"\n"+PST+"\n"+PET);
		
		Waiters.waitForElementToBeVisible(periodName);
		periodName.sendKeys(periodN);
		
//		Waiters.waitForTimeout(1000);
		
		Waiters.waitForElementToBeVisible(startTime);
		CommonUtils.setTime(startTime, time);
		
//		Waiters.waitForTimeout(1000);
		
		Waiters.waitForElementToBeVisible(toTime);
		CommonUtils.setTime(toTime, timeEnd);
		
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
		
		Waiters.waitForElementToBeVisible(toastCloseButton);
		toastCloseButton.click();
			
		}
	}
	
	public String getCreatedPeriodName() {
		return perName;
	}

}
