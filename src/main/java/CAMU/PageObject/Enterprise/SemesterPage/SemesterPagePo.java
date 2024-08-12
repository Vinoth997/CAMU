package CAMU.PageObject.Enterprise.SemesterPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.ActionsUtils;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class SemesterPagePo {
	
	private static SemesterPagePo SemesterPageInstance;
	String semesterCodeRandom;
	String semesterNameRandom;
	String semesterNewStudentGroupNameRandom;

	private SemesterPagePo() {

	}

	public static SemesterPagePo getInstance() {
		if (SemesterPageInstance == null) {
			SemesterPageInstance = new SemesterPagePo();
		}
		return SemesterPageInstance;
	}
	
	@FindBy(css = ".main-container_block div.header_back p.text-primary")
	private WebElement semesterPageHeading;
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(css = ".main-container_block div.header_back p.text-secondary")
	private WebElement createNewSemesterPageHeading;
	
	@FindBy(css = "input[name=Code]")
	private WebElement semesterCodeTextField;
	
	@FindBy(css = "input[name=Name]")
	private WebElement semesterYearNameTextField;
	
	@FindBy(css = "input[name=Desc]")
	private WebElement semesterDescriptionTextField;
	
	@FindBy(css = "input[name=StuGrpName]")
	private WebElement semesterNewGroupNameTextField;
	
	@FindBy(xpath = "//input[@name='StuGrpName']/following::span[text()='add']")
	private WebElement newSemesterStudentGroupAddButton;
	
	@FindBy(css = "input[id=StuGrpID]")
	private WebElement selectStudentGroupTextField;
	
	@FindBy(xpath = "//input[@id='StuGrpID']/../..//ancestor::div[contains(@class,'singleValue')]")
	private WebElement newlyCreatedSemesterStudentGroup;
	
	@FindBy(css = "input[name=DOrder]")
	private WebElement enterDisplayOrderTextField;
	
	@FindBy(css = "input[name=smsntf]")
	private WebElement sendDailyHomeworkSmsCheckBox;
	
	@FindBy(css = "input[name=smstime]")
	private WebElement dailySmsTimerTextField;
	
	@FindBy(css = "input[name=isInit]")
	private WebElement initialSemesterCheckbox;
	
	@FindBy(css = "input[name=isTrmnl]")
	private WebElement terminalSemesterCheckbox;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement saveButton;
	
	@FindBy(css = "div.search input.search-input")
	private WebElement searchSemesterTextField;
	
	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement semesterCodeTable;
	
	@FindBy(xpath = "//button[@type='reset' and text()='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath = "//input[@id='InId']/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement selectedInstitution;
	
	@FindBy(xpath = "//button[@type='button' and text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//a[@text='Edit']")
	private WebElement editButton;
	
	@FindBy(css = "div.header_back p.text-secondary")
	private WebElement editPageHeading;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Update']")
	private WebElement updateButton;
	

	public String getSemesterPageTitle() {
		Waiters.waitForElementToBeVisible(semesterPageHeading);
		return semesterPageHeading.getText();
	}

	public void clickAddToCreateSemester() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getNewSemesterPageTitle() {
		Waiters.waitForElementToBeVisible(createNewSemesterPageHeading);
		return createNewSemesterPageHeading.getText();
	}

	public void enterSemesterCode(String semesterCode) {
		Waiters.waitForElementToBeVisible(semesterCodeTextField);
		semesterCodeRandom = semesterCode+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		semesterCodeTextField.sendKeys(semesterCodeRandom);
	}

	public void enterSemesterYearName(String semesterYearName) {
		Waiters.waitForElementToBeVisible(semesterYearNameTextField);
		semesterNameRandom = semesterYearName+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		semesterYearNameTextField.sendKeys(semesterNameRandom);
	}

	public void enterSemesterDescription(String semesterDescription) {
		Waiters.waitForElementToBeVisible(semesterDescriptionTextField);
		ElementUtils.clearInputFieldWithJs(semesterDescriptionTextField);
		semesterDescriptionTextField.sendKeys(semesterDescription);
	}

	public void enterNewSemesterStudentGroupName(String newSemesterStudentGroupName) {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		semesterNewStudentGroupNameRandom = newSemesterStudentGroupName+StringUtils.generateRandomStringNumberCharacter(3, 2, 0);
		semesterNewGroupNameTextField.sendKeys(semesterNewStudentGroupNameRandom);
	}

	public void clickPlusButtonToAddNewSemesterStudentGroup() {
		Waiters.waitForElementToBeVisible(newSemesterStudentGroupAddButton);
		Waiters.waitForElementToBeClickable(newSemesterStudentGroupAddButton);
		newSemesterStudentGroupAddButton.click();
	}

	public void searchSelectNewlyCreatedSemesterStudentGroup() {
		Waiters.waitForElementToBeVisible(selectStudentGroupTextField);
		Waiters.waitForElementToBeClickable(selectStudentGroupTextField);
		selectStudentGroupTextField.click();
		selectStudentGroupTextField.sendKeys(semesterNewStudentGroupNameRandom);
		CommonUtils.selectDropDownOption(semesterNewStudentGroupNameRandom);
	}
	
	public String newlyCreatedSemesterStudentGroupName() {
		return semesterNewStudentGroupNameRandom;
	}

	public String getNewlyCreatedSemesterStudentGroupText() {
		return newlyCreatedSemesterStudentGroup.getText();
	}

	public void enterSemesterDisplayOrder(String semesterDisplayOrder) {
		Waiters.waitForElementToBeVisible(enterDisplayOrderTextField);
		ElementUtils.clearInputFieldWithJs(enterDisplayOrderTextField);
		enterDisplayOrderTextField.sendKeys(semesterDisplayOrder);
	}

	public void checkSendDailyHomeworkSmsCheckbox() {
		Waiters.waitForElementToBeVisible(sendDailyHomeworkSmsCheckBox);
		if(!sendDailyHomeworkSmsCheckBox.isSelected()) {
			sendDailyHomeworkSmsCheckBox.click();
		}
	}
	
	public void uncheckSendDailyHomeworkSmsCheckbox() {
		Waiters.waitForElementToBeVisible(sendDailyHomeworkSmsCheckBox);
		if(sendDailyHomeworkSmsCheckBox.isSelected()) {
			sendDailyHomeworkSmsCheckBox.click();
		}
	}

	public boolean isDailySmsTimerFieldAppear() {
		Waiters.waitForTimeout(1000);
		return dailySmsTimerTextField.isDisplayed();
	}
	
	public boolean isDailySmsTimerFieldDisappear() {
		Waiters.waitForTimeout(1000);
		return !ElementUtils.isNotDisplayed(dailySmsTimerTextField);
	}

	public void setDailySmsTime(String time) {
		Waiters.waitForElementToBeVisible(dailySmsTimerTextField);
//		Waiters.waitForElementToBeClickable(dailySmsTimerTextField);
//		dailySmsTimerTextField.click();
		CommonUtils.setTime(dailySmsTimerTextField, time);
//		ElementUtils.setValueWithJavaScript(dailySmsTimerTextField, time);
//		dailySmsTimerTextField.sendKeys(time);
	}

	public void checkInitialSemesterCheckbox() {
		Waiters.waitForElementToBeVisible(initialSemesterCheckbox);
		ElementUtils.scrollInToElement(initialSemesterCheckbox);
		if(!initialSemesterCheckbox.isSelected()) {
			initialSemesterCheckbox.click();
		}
	}
	
	public void uncheckInitialSemesterCheckbox() {
		Waiters.waitForElementToBeVisible(initialSemesterCheckbox);
		ElementUtils.scrollInToElement(initialSemesterCheckbox);
		if(initialSemesterCheckbox.isSelected()) {
			initialSemesterCheckbox.click();
		}
	}

	public boolean verifyTerminalSemesterCheckboxUnchecked() {
		return !terminalSemesterCheckbox.isSelected();
	}

	public void checkTerminalSemesterCheckbox() {
		Waiters.waitForElementToBeVisible(terminalSemesterCheckbox);
		ElementUtils.scrollInToElement(terminalSemesterCheckbox);
		if(!terminalSemesterCheckbox.isSelected()) {
			terminalSemesterCheckbox.click();
		}
	}
	
	public void uncheckTerminalSemesterCheckbox() {
		Waiters.waitForElementToBeVisible(terminalSemesterCheckbox);
		ElementUtils.scrollInToElement(terminalSemesterCheckbox);
		if(terminalSemesterCheckbox.isSelected()) {
			terminalSemesterCheckbox.click();
		}
	}

	public boolean verifyInitialSemesterCheckboxUnchecked() {
		return !initialSemesterCheckbox.isSelected();
	}

	public void clickSaveSemester() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}

	public String searchCreatedNewSemesterAndVerify() {
		Waiters.waitForElementToBeVisible(searchSemesterTextField);
		searchSemesterTextField.clear();
		ActionsUtils.typeTextWithInterval(searchSemesterTextField, semesterCodeRandom);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(semesterCodeTable);
		return semesterCodeTable.getText();
	}
	
	public String getSemesterCode() {
		return semesterCodeRandom;
	}

	public void passSemesterCode(String semesterCode) {
		Waiters.waitForElementToBeVisible(semesterCodeTextField);
//		semesterCodeTextField.click();
//		semesterCodeTextField.clear();
		ElementUtils.clearInputFieldWithJs(semesterCodeTextField);
		semesterCodeTextField.sendKeys(semesterCode);
	}

	public void passSemesterName(String semesterName) {
		Waiters.waitForElementToBeVisible(semesterYearNameTextField);
//		semesterYearNameTextField.click();
//		semesterYearNameTextField.clear();
		ElementUtils.clearInputFieldWithJs(semesterYearNameTextField);
		semesterYearNameTextField.sendKeys(semesterName);
	}

	public void passAndSelectStudentGroup(String studentGroup) {
		Waiters.waitForElementToBeVisible(selectStudentGroupTextField);
		Waiters.waitForElementToBeClickable(selectStudentGroupTextField);
		selectStudentGroupTextField.click();
		ElementUtils.clearInputFieldWithJs(selectStudentGroupTextField);
		selectStudentGroupTextField.sendKeys(studentGroup);
		CommonUtils.selectDropDownOption(studentGroup);
	}

	public void clickResetSemester() {
		Waiters.waitForElementToBeVisible(resetButton);
		Waiters.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}
	
	public void verifyAllFieldsAreCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedInstitution), "Institution field not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(semesterCodeTextField).isEmpty(), "Semester code field not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(semesterYearNameTextField).isEmpty(), "Semester name field not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(semesterDescriptionTextField).isEmpty(), "Semester description field not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(newlyCreatedSemesterStudentGroup), "Student group dropdown not cleared");
		Asserts.assertTrue(ElementUtils.getInputValue(enterDisplayOrderTextField).isEmpty(), "Display order field not cleared");
		Asserts.assertTrue(!sendDailyHomeworkSmsCheckBox.isSelected(), "Send daily homework sms checkbox not cleared");
		Asserts.assertTrue(!initialSemesterCheckbox.isSelected(), "Initial semester checkbox not cleared");
		Asserts.assertTrue(!terminalSemesterCheckbox.isSelected(), "Terminal semester checkbox not cleared");
	}

	public void clickCancelSemester() {
		Waiters.waitForElementToBeVisible(cancelButton);
		Waiters.waitForElementToBeClickable(cancelButton);
		cancelButton.click();
	}

	public void verifySemesterCodeField() {
		Waiters.waitForElementToBeVisible(semesterCodeTextField);
		semesterCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterCodeTextField).isEmpty(),"Semester code field doesn't accept alphabetical values");
		semesterCodeTextField.clear();
		semesterCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterCodeTextField).isEmpty(),"Semester code field doesn't accept numerical values");
		semesterCodeTextField.clear();
		semesterCodeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterCodeTextField).isEmpty(),"Semester code field doesn't accept special characters");
	}

	public void verifySemesterYearNameField() {
		Waiters.waitForElementToBeVisible(semesterYearNameTextField);
		semesterYearNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterYearNameTextField).isEmpty(),"Semester name field doesn't accept alphabetical values");
		semesterYearNameTextField.clear();
		semesterYearNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterYearNameTextField).isEmpty(),"Semester name field doesn't accept numerical values");
		semesterYearNameTextField.clear();
		semesterYearNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterYearNameTextField).isEmpty(),"Semester name field doesn't accept special characters");
	}

	public void verifySemesterDescriptionField() {
		Waiters.waitForElementToBeVisible(semesterDescriptionTextField);
		semesterDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterDescriptionTextField).isEmpty(),"Semester description field doesn't accept alphabetical values");
		semesterDescriptionTextField.clear();
		semesterDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterDescriptionTextField).isEmpty(),"Semester description field doesn't accept numerical values");
		semesterDescriptionTextField.clear();
		semesterDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterDescriptionTextField).isEmpty(),"Semester description field doesn't accept special characters");
	}

	public void verifyCreateNewStudentGroupField() {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterNewGroupNameTextField).isEmpty(),"Create new student group field doesn't accept alphabetical values");
		semesterNewGroupNameTextField.clear();
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterNewGroupNameTextField).isEmpty(),"Create new student group field doesn't accept numerical values");
		semesterNewGroupNameTextField.clear();
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(!ElementUtils.getInputValue(semesterNewGroupNameTextField).isEmpty(),"Create new student group field doesn't accept special characters");
	}

	public void verifyDisplayOrderField() {
		Waiters.waitForElementToBeVisible(enterDisplayOrderTextField);
		ElementUtils.scrollInToElement(enterDisplayOrderTextField);
		enterDisplayOrderTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(enterDisplayOrderTextField).isEmpty(),"Display order field accept alphabetical values");
		ElementUtils.clearInputFieldWithJs(enterDisplayOrderTextField);
		enterDisplayOrderTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(!ElementUtils.getInputValue(enterDisplayOrderTextField).isEmpty(),"Display order field doesn't accept numerical values");
		ElementUtils.clearInputFieldWithJs(enterDisplayOrderTextField);
//		ElementUtils.clearInputFieldWithJs(enterDisplayOrderTextField);
		enterDisplayOrderTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(enterDisplayOrderTextField).isEmpty(),"Display order field accept special characters");
	}

	public void verifyDailySmsTimerField() {
		Waiters.waitForElementToBeVisible(dailySmsTimerTextField);
		dailySmsTimerTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(5, 0, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(dailySmsTimerTextField).isEmpty(),"Daily sms timer field accept alphabetical values");
		dailySmsTimerTextField.clear();
		dailySmsTimerTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 5, 0));
		Asserts.assertTrue(ElementUtils.getInputValue(dailySmsTimerTextField).isEmpty(),"Daily sms timer field accept numerical values");
		dailySmsTimerTextField.clear();
		dailySmsTimerTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 5));
		Asserts.assertTrue(ElementUtils.getInputValue(dailySmsTimerTextField).isEmpty(),"Daily sms timer field accept special characters");
	}

	public void passNewStudentGroupName(String newStudentGroupName) {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		ElementUtils.clearInputFieldWithJs(semesterNewGroupNameTextField);
		semesterNewGroupNameTextField.sendKeys(newStudentGroupName);
	}
	
	public void searchSemester(String semesterCode) {
		Waiters.waitForElementToBeVisible(searchSemesterTextField);
		ElementUtils.clearInputFieldWithJs(searchSemesterTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchSemesterTextField, semesterCode, 200);
		Waiters.waitForTimeout(1000);
	}
	
	public void clickOnEdit(String semesterCode) {
		WebElement programList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+semesterCode+"']/following::button[@id='dropdown-basic']"));
		Waiters.waitForElementToBeVisible(programList);
		Waiters.waitForElementToBeClickable(programList);
		programList.click();
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
		Waiters.waitForTimeout(1000);
	}

	public String verifyNavigatesEditSemesterPage() {
		Waiters.waitForElementToBeVisible(editPageHeading);
		return editPageHeading.getText();
	}

	public void clickUpdateButton() {
		Waiters.waitForElementToBeVisible(updateButton);
		Waiters.waitForElementToBeClickable(updateButton);
		updateButton.click();
	}

	public void passAlphabetsNewStudentGroupName() {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(6, 0, 0));
	}

	public void passNumericNewStudentGroupName() {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 6, 0));
	}

	public void passSpecialCharNewStudentGroupName() {
		Waiters.waitForElementToBeVisible(semesterNewGroupNameTextField);
		semesterNewGroupNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 6));
	}

}
