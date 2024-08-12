package CAMU.PageObject.Students.StudentListPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.Waiters;

public class StudentLeavePagePo {
	
private static StudentLeavePagePo StudentLeavePageInstance;
	
	
	private StudentLeavePagePo() {

	}

	public static StudentLeavePagePo getInstance() {
		if (StudentLeavePageInstance == null) {
			StudentLeavePageInstance = new StudentLeavePagePo();
		}
		return StudentLeavePageInstance;
	}
	
	@FindBy(css = "input[name=Email]")
	private WebElement usernameTextField;
	
	@FindBy(css = "input[name=pwd]")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[@type='button' and text()='ADD']")
	private WebElement addButton;
	
	@FindBy(xpath = "//label[text()='Leave type']/following-sibling::div[contains(@class,'select')]//div[contains(@class,'indicatorContainer')][1]")
	private WebElement leaveTypeClearButton;
	
	@FindBy(css = "input[id=LvTy]")
	private WebElement selectLeaveTypeTextField;
	
	@FindBy(css = "input[name=FrDt]")
	private WebElement startDateTextField;
	
	@FindBy(css = "input[name=ToDt]")
	private WebElement toDateTextField;
	
	@FindBy(css = "input[name=Rson]")
	private WebElement reasonForLeaveTextField;
	
	@FindBy(xpath = "//button[@type='submit' and text()='SAVE']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//label[text()='Start date']/following-sibling::div/input")
	private WebElement leaveApprovalStartDate;
	
	@FindBy(xpath = "//label[text()='End Date']/following-sibling::div/input")
	private WebElement leaveApprovalEndDate;
	
	@FindBy(xpath = "//label[text()='Leave Type']/following-sibling::div[contains(@class,'select')]//input[@type='text']")
	private WebElement leaveTypeTextField;
	
	@FindBy(xpath = "//label[text()='Status']/following-sibling::div[contains(@class,'select')]//input[@type='text']")
	private WebElement leaveStatusTextField;
	
	@FindBy(xpath = "//button[@type='button' and text()='Action']")
	private WebElement actionDropDown;
	
	@FindBy(css = "div.dropdown-menu.show a")
	private List<WebElement> actionDropdownOptions;
	
	@FindBy(css = "div.modal-dialog div.modal-title")
	private WebElement approveLeaveForStudentsDialog;

	public void enterStudentUserName(String studentUsername) {
		Waiters.waitForElementToBeVisible(usernameTextField);
		usernameTextField.sendKeys(studentUsername);
	}

	public void enterStudentPassword(String studentPassword) {
		Waiters.waitForElementToBeVisible(passwordTextField);
		passwordTextField.sendKeys(studentPassword);
	}

	public void clickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public void removeSelectedLeave() {
		Waiters.waitForElementToBeVisible(leaveTypeClearButton);
		Waiters.waitForElementToBeClickable(leaveTypeClearButton);
		if(leaveTypeClearButton.isDisplayed()) {
			leaveTypeClearButton.click();
		}
	}

	public void selectLeaveType(String leaveType) {
		Waiters.waitForElementToBeVisible(selectLeaveTypeTextField);
		selectLeaveTypeTextField.sendKeys(leaveType);
		CommonUtils.selectDropDownOptionWithContains(leaveType);
	}

	public void selectStartDate(String startDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(startDateTextField);
		CommonUtils.dateSelectorAlter(startDateTextField, startDate);
	}

	public void selectToDate(String toDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(toDateTextField);
		CommonUtils.dateSelectorAlter(toDateTextField, toDate);
	}

	public void enterReasonForLeave(String reason) {
		Waiters.waitForElementToBeVisible(reasonForLeaveTextField);
		reasonForLeaveTextField.sendKeys(reason);
	}

	public void clickSave() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}

	public void openNewBrowserTab() {
		Waiters.waitForTimeout(1000);
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("window.open();");
		Waiters.waitForTimeout(900);
	}

	public void switchToNewTab() {
		ArrayList<String> tabs = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs.get(1));
	}

	public void startDate(String startDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(leaveApprovalStartDate);
		CommonUtils.dateSelectorWithForceClick(leaveApprovalStartDate, startDate);
	}

	public void endDate(String endDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(leaveApprovalEndDate);
		CommonUtils.dateSelectorWithForceClick(leaveApprovalEndDate, endDate);
	}

	public void selectLeaveApprovalLeaveType(String leaveType) {
		Waiters.waitForElementToBeVisible(leaveTypeTextField);
		leaveTypeTextField.sendKeys(leaveType);
		CommonUtils.selectDropDownOptionWithContains(leaveType);
	}

	public void selectLeaveApprovalLeaveStatus(String status) {
		Waiters.waitForElementToBeVisible(leaveStatusTextField);
		leaveStatusTextField.sendKeys(status);
		CommonUtils.selectDropDownOptionWithContains(status);
	}

	public void checkStudent(String date, String leaveType, String rollNo) {
		Waiters.waitForTimeout(800);
		WebElement studentCheckbox = DriverManager.getDriver().findElement(By.xpath("//td[contains(text(),'"+date+"')]//ancestor::tr//td[contains(text(),'"+leaveType+"')]/preceding-sibling::td[text()='"+rollNo+"']/preceding-sibling::td//input"));
		Waiters.waitForElementToBeClickable(studentCheckbox);
		studentCheckbox.click();
	}

	public void clickActionDropDownAndSelect(String action) {
		Waiters.waitForElementToBeVisible(actionDropDown);
		Waiters.waitForElementToBeClickable(actionDropDown);
		actionDropDown.click();
		Waiters.waitForListOfElementsToBeVisible(actionDropdownOptions);
		for(int i=0;i<actionDropdownOptions.size();i++) {
			if(actionDropdownOptions.get(i).getText().equals(action)) {
				actionDropdownOptions.get(i).click();
			}
		}
		
	}

	public boolean approveLeaveStudentDialogAppears() {
		Waiters.waitForTimeout(2000);
		return approveLeaveForStudentsDialog.isDisplayed();
	}

	public void switchToPreviousTab() {
		Waiters.waitForTimeout(800);
		ArrayList<String> tabs = new ArrayList<>(DriverManager.getDriver().getWindowHandles());
		DriverManager.getDriver().switchTo().window(tabs.get(0));
	}

	public String getLeaveStatus(String fromDate, String toDate) {
		Waiters.waitForTimeout(800);
		WebElement leaveStatus = DriverManager.getDriver().findElement(By.xpath("//td[contains(@title,'"+fromDate+" to "+toDate+"')]/parent::tr//td[9]"));
		return leaveStatus.getText();
	}

}
