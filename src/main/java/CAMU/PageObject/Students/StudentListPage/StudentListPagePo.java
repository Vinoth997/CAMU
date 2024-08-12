package CAMU.PageObject.Students.StudentListPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class StudentListPagePo {

	private static StudentListPagePo StudentListPageInstance;

	private StudentListPagePo() {

	}

	public static StudentListPagePo getInstance() {
		if (StudentListPageInstance == null) {
			StudentListPageInstance = new StudentListPagePo();
		}
		return StudentListPageInstance;
	}

	@FindBy(xpath = "//label[contains(text(),'Admission No')]/following-sibling::input")
	private WebElement admissionNoTextField;

	@FindBy(css = "div.header_back .text-primary")
	private WebElement pagePrimaryHeading;

	@FindBy(css = "div.header_back .text-secondary")
	private WebElement pageSecondaryHeading;

	@FindBy(xpath = "//div[text()='Roll No.']/parent::div/div[contains(@class,'text-primary')]")
	private WebElement studentRecordRollNo;

	@FindBy(css = "div.form-list_container div.list-form_container .material-symbols-rounded + button")
	private List<WebElement> studentRecordOption;

	@FindBy(css = "input[id=billItemPolicy]")
	private WebElement billingItemTextField;

	@FindBy(xpath = "//button[text()='Bill']")
	private WebElement billButton;

	@FindBy(xpath = "//button[text()='Bill and Receipt']")
	private WebElement billAndReceiptButton;

	@FindBy(xpath = "(//div[@class='table-container']//div[contains(@class,'select')])[1]")
	private WebElement filterDropDown;

	@FindBy(xpath = "//label[contains(text(),'Billing item')]/following-sibling::div//div[contains(@class,'multiValue')]/div[@role='button']")
	private List<WebElement> removeBillingItemButton;

	@FindBy(xpath = "//label[contains(text(),'Billing item')]/following-sibling::div//div[contains(@class,'multiValue')]/div[@role='button']")
	private WebElement removeBillingItem;

	@FindBy(xpath = "//div[@class='modal-dialog']/div[@class='modal-content']//div[contains(@class,'modal-title') and text()='Warning!']")
	private WebElement warningPopup;

	@FindBy(xpath = "//div[@class='modal-dialog']/div[@class='modal-content']//button[@class='btn-close']")
	private WebElement closeWarningPopup;

	@FindBy(xpath = "//button[@type='button' and contains(@class,'btn btn-primary')]")
	private List<WebElement> buttonOptionList;

	@FindBy(xpath = "(//input[@id='BillItemId'])[last()]")
	private WebElement billingBillItemTextField;

	@FindBy(xpath = "(//input[@id='Frequency'])[last()]")
	private WebElement frequencyTextField;

	@FindBy(xpath = "(//input[@name='DueDate'])[last()]")
	private WebElement dueDateTextField;

	@FindBy(xpath = "(//input[@name='NoOfPayments'])[last()]")
	private WebElement noOfPaysTextField;

	@FindBy(xpath = "//tr[contains(@class,'table-list_body')]/td/div/span[text()='add']")
	private WebElement plusButton;

	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement billingScheduleSaveButton;

	@FindBy(xpath = "//div[@class='list-form_container']//input[@name='prEnDt']")
	private WebElement billingScheduleAllDueDateTextField;

	@FindBy(xpath = "//div[@class='list-form_container']//button[@type='button' and text()='Apply All']")
	private WebElement applyAllButton;

	@FindBy(xpath = "//tr[@class='table-list_body ']/td/following::div[contains(@class,'date-picker')]/input")
	private List<WebElement> allBillDueDateList;

	@FindBy(xpath = "//tr[@class='table-list_body ']/td[1]//div[contains(@class,'select')]/div")
	private List<WebElement> selectedBillItemList;

	@FindBy(xpath = "(//input[@id='Frequency'])[last()]/ancestor::div[contains(@class,'select')]//div[contains(@class,'indicatorContainer')][1]")
	private WebElement removeFrequencyButton;

	@FindBy(xpath = "//input[@id='BillSchdDefn']")
	private WebElement createdBillPolicyTextField;

	@FindBy(xpath = "(//tr[contains(@class,'table-list_body')]/td/div/span[text()='do_not_disturb_on'])[last()]")
	private WebElement removeBillItem;

	@FindBy(xpath = "//button[@type='button' and text()='Receipts']")
	private WebElement receiptButton;

	@FindBy(xpath = "//div[contains(@class,'modal-title') and text()='Fill the Receipt details']")
	private WebElement fillReceiptDetailDialogHeading;

	@FindBy(xpath = "//div[@class='ms-auto']/label[contains(text(),'Total')]/following-sibling::label[contains(@class,'transform-text')]")
	private WebElement getPayAmount;

	@FindBy(xpath = "//input[@name='AvailbleAmt']")
	private WebElement availableAmountTextField;

	@FindBy(xpath = "//span[text()='add']/parent::button[text()='Enroll course']")
	private WebElement addEnrollCourseButton;

	@FindBy(xpath = "//div[@class='modal-content']//div[contains(@class,'modal-title')]")
	private WebElement enrollCourseDialog;

	@FindBy(css = "input[id=EnTyp]")
	private WebElement selectEnrollTypeTextField;

	@FindBy(css = "input[id=AcYr]")
	private WebElement selectEnrollAcademicYearTextField;

	@FindBy(css = "input[id=SemID]")
	private WebElement selectEnrollSemesterYearTextField;

	@FindBy(css = "input[id=SubjId]")
	private WebElement selectEnrollCourseTextField;

	@FindBy(xpath = "//button[@type='submit' and text()='Proceed']")
	private WebElement proceedButton;

	@FindBy(css = ".modal-content .modal-sub_header.text-secondary")
	private WebElement enrollCourseDetails;

	@FindBy(xpath = "//button[@type='submit' and text()='Enrol']")
	private WebElement enrollButton;

	@FindBy(xpath = "(//td[text()='2023-2024']/following-sibling::td[text()='EVEN']/following::td[text()='R21-CS02']/following::td[text()='Applied Mathematics']/following::td[text()='Full Registration']/preceding::span[@class='status-success'])[1]")
	private WebElement enrollmentStatus;

	public void enterAdmissionNo(String admissionNo) {
		Waiters.waitForElementToBeVisible(admissionNoTextField);
		admissionNoTextField.clear();
		admissionNoTextField.sendKeys(admissionNo);
	}

	public void clickStudentName(String admissionNo) {
		Waiters.waitForTimeout(800);
		WebElement studentName = DriverManager.getDriver()
				.findElement(By.xpath("//tr/td[4]/self::td[text()='" + admissionNo + "']/following-sibling::td/a"));
		Waiters.waitForElementToBeClickable(studentName);
		studentName.click();
	}

	public String getPagePrimaryHeading() {
		Waiters.waitForTimeout(500);
		Waiters.waitForElementToBeVisible(pagePrimaryHeading);
		return pagePrimaryHeading.getText();
	}

	public String getPageSecondaryHeading() {
		Waiters.waitForTimeout(500);
		Waiters.waitForElementToBeVisible(pageSecondaryHeading);
		return pageSecondaryHeading.getText();
	}

	public String getStudentRecordRollNo() {
		Waiters.waitForElementToBeVisible(studentRecordRollNo);
		Waiters.waitForTimeout(800);
		return StringUtils.replaceAllBy(studentRecordRollNo.getText(), ":", "").trim();
	}

	public void clickStudentRecordOption(String option) {
		Waiters.waitForListOfElementsToBeVisible(studentRecordOption);
		ElementUtils.clickOnOptionFromList(studentRecordOption, option);
	}

	public void selectBillingItem(String billingItem) {
		Waiters.waitForElementToBeVisible(billingItemTextField);
		billingItemTextField.sendKeys(billingItem);
		CommonUtils.selectDropDownOptionWithContains(billingItem);
	}

	public void clickBill() {
		Waiters.waitForElementToBeVisible(billButton);
		Waiters.waitForElementToBeClickable(billButton);
		billButton.click();
	}

	public void selectFilterOption(String filterOption) {
		Waiters.waitForElementToBeVisible(filterDropDown);
		ElementUtils.scrollInToElement(filterDropDown);
		filterDropDown.click();
		CommonUtils.selectDropDownOptionWithContains(filterOption);
	}

	public String getBillingItemStatus(String billingItem) {
		Waiters.waitForTimeout(800);
		WebElement billingItemLoc = DriverManager.getDriver()
				.findElement(By.xpath("(//td[text()='" + billingItem + "']/following::td[6]/span)[1]"));
		Waiters.waitForElementToBeVisible(billingItemLoc);
		return billingItemLoc.getText();
	}

	public void removeAllBillingItem() {
		Waiters.waitForTimeout(1000);
		ElementUtils.scrollInToElement(billingItemTextField);
		if (ElementUtils.isPresentAndDisplayed(removeBillingItem)) {
			for (int i = removeBillingItemButton.size() - 1; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				removeBillingItemButton.get(i).click();
			}
		}
	}

	public void clickBillAndReceipt() {
		Waiters.waitForElementToBeVisible(billAndReceiptButton);
		Waiters.waitForElementToBeClickable(billAndReceiptButton);
		billAndReceiptButton.click();
	}

	public void closeBillItemWarningPopup() {
		Waiters.waitForTimeout(800);
		if (ElementUtils.isPresentAndDisplayed(warningPopup)) {
			Waiters.waitForElementToBeClickable(closeWarningPopup);
			closeWarningPopup.click();
		}
	}

	public void clickButton(String buttonName) {
		Waiters.waitForListOfElementsToBeVisible(buttonOptionList);
		ElementUtils.clickOnOptionFromList(buttonOptionList, buttonName);
	}

	public void selectBillItem(String billItem) {
		Waiters.waitForElementToBeVisible(billingBillItemTextField);
		ElementUtils.scrollInToElement(billingBillItemTextField);
		billingBillItemTextField.sendKeys(billItem);
		CommonUtils.selectDropDownOptionWithContains(billItem);
	}

	public void selectBillItemDueDate(String dueDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(dueDateTextField);
		CommonUtils.dateSelectorWithForceClick(dueDateTextField, dueDate);
	}

	public void enterNoOfPays(String noOfPays) {
		Waiters.waitForElementToBeVisible(noOfPaysTextField);
		noOfPaysTextField.clear();
		noOfPaysTextField.sendKeys(noOfPays);
	}

	public void clickPlusButtonAddBillItem() {
		Waiters.waitForElementToBeVisible(plusButton);
		Waiters.waitForElementToBeClickable(plusButton);
		plusButton.click();
	}

	public void clickSaveBillingSchedule() {
		Waiters.waitForElementToBeVisible(billingScheduleSaveButton);
		Waiters.waitForElementToBeClickable(billingScheduleSaveButton);
		billingScheduleSaveButton.click();
	}

	public void selectAllBillItemDueDate(String dueDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(billingScheduleAllDueDateTextField);
		CommonUtils.dateSelector(billingScheduleAllDueDateTextField, dueDate);
	}

	public void clickApplyAllButton() {
		Waiters.waitForElementToBeVisible(applyAllButton);
		Waiters.waitForElementToBeClickable(applyAllButton);
		applyAllButton.click();
	}

	public void verifyDueDateAppliedToAllBillItem(String dueDate) {
		Waiters.waitForTimeout(800);
		for (int i = 0; i < allBillDueDateList.size(); i++) {
			Waiters.waitForElementToBeVisible(allBillDueDateList.get(i));
			String inputValue = ElementUtils.getInputValue(allBillDueDateList.get(i));
			if (inputValue.equals(dueDate)) {
				Asserts.assertTrue(true);
			} else {
				Asserts.assertTrue(false, "Bill item : " + selectedBillItemList.get(i).getText() + ", Due date : "
						+ inputValue + " not matched with " + dueDate + "");
			}
		}
	}

	public void selectFrequency(String frequency) {
		Waiters.waitForElementToBeVisible(frequencyTextField);
		ElementUtils.scrollInToElement(frequencyTextField);
		if (removeFrequencyButton.isDisplayed()) {
			removeFrequencyButton.click();
		}
		frequencyTextField.click();
		ElementUtils.clearInputFieldWithJs(frequencyTextField);
		frequencyTextField.sendKeys(frequency);
		CommonUtils.selectDropDownOptionWithContains(frequency);
	}

	public void selectCreatedBillingPolicy(String billingPolicy) {
		Waiters.waitForElementToBeVisible(createdBillPolicyTextField);
		ElementUtils.scrollInToElement(createdBillPolicyTextField);
		createdBillPolicyTextField.sendKeys(billingPolicy);
		CommonUtils.selectDropDownOption(billingPolicy);
	}

	public void removeEmptyBillItem() {
		Waiters.waitForElementToBeVisible(removeBillItem);
		Waiters.waitForElementToBeClickable(removeBillItem);
		ElementUtils.scrollInToElement(removeBillItem);
		removeBillItem.click();
	}

	public void checkBillItem(String billItem) {
		Waiters.waitForTimeout(800);
		WebElement billItemCheckBox = DriverManager.getDriver()
				.findElement(By.xpath("(//td[text()='" + billItem + "']/parent::tr//input[@type='checkbox'])[1]"));
		if (billItemCheckBox.isDisplayed()) {
			billItemCheckBox.click();
		} else {
			ElementUtils.scrollInToElement(billItemCheckBox);
			billItemCheckBox.click();
		}
	}

	public boolean verifyReceiptButtonIsEnabled() {
		Waiters.waitForElementToBeVisible(receiptButton);
		return receiptButton.isEnabled();
	}

	public boolean verifyFillReceiptDialogAppears() {
		Waiters.waitForTimeout(800);
		return fillReceiptDetailDialogHeading.isDisplayed();
	}

	public void enterReceivedAmount() {
		Waiters.waitForElementToBeVisible(getPayAmount);
		String replaceAll = StringUtils.replaceAllBy(getPayAmount.getText(), "₹", "");
		String replaceAllBy = StringUtils.replaceAllBy(replaceAll, "\\.00", "");
//		System.out.println(replaceAllBy);
		int count = Math.round(Integer.parseInt(StringUtils.replaceAllBy(replaceAllBy, ",", "")) / 2);
//		System.out.println(Integer.toString(count));
		availableAmountTextField.sendKeys(Integer.toString(count));
	}

	public void clickAddEnrollCourse() {
		Waiters.waitForElementToBeVisible(addEnrollCourseButton);
		Waiters.waitForElementToBeClickable(addEnrollCourseButton);
		addEnrollCourseButton.click();
	}

	public boolean verifyEnrollCourseDialogAppears() {
		Waiters.waitForTimeout(1000);
		return enrollCourseDialog.isDisplayed();
	}

	public void selectEnrollType(String enrollType) {
		Waiters.waitForElementToBeVisible(selectEnrollTypeTextField);
		selectEnrollTypeTextField.sendKeys(enrollType);
		CommonUtils.selectDropDownOption(enrollType);
	}

	public void selectEnrollAcademicYear(String enrollAcademicYear) {
		Waiters.waitForElementToBeVisible(selectEnrollAcademicYearTextField);
		selectEnrollAcademicYearTextField.sendKeys(enrollAcademicYear);
		CommonUtils.selectDropDownOption(enrollAcademicYear);
	}

	public void selectEnrollSemesterYear(String enrollSemesterYear) {
		Waiters.waitForTimeout(200);
		Waiters.waitForElementToBeVisible(selectEnrollSemesterYearTextField);
		selectEnrollSemesterYearTextField.sendKeys(enrollSemesterYear);
		CommonUtils.selectDropDownOption(enrollSemesterYear);
	}

	public void selectEnrollCourse(String enrollCourse) {
		Waiters.waitForTimeout(200);
		Waiters.waitForElementToBeVisible(selectEnrollCourseTextField);
		selectEnrollCourseTextField.sendKeys(enrollCourse);
		CommonUtils.selectDropDownOption(enrollCourse);
	}

	public void clickProceed() {
		Waiters.waitForElementToBeVisible(proceedButton);
		Waiters.waitForElementToBeClickable(proceedButton);
		proceedButton.click();
	}

	public void verifyEnrollCourseDetails(String course) {
		Waiters.waitForElementToBeVisible(enrollCourseDetails);
		enrollCourseDetails.isDisplayed();
		String[] parts = course.split(" - \\( | \\)");

		Asserts.assertContainsText(enrollCourseDetails.getText(), parts[0].toLowerCase(),
				"The '" + parts[0] + "' not present in '" + enrollCourseDetails.getText() + "'.");
		Asserts.assertContainsText(enrollCourseDetails.getText(), parts[1].toLowerCase(),
				"The '" + parts[1] + "' not present in '" + enrollCourseDetails.getText() + "'.");
	}

	public void clickEnroll() {
		Waiters.waitForElementToBeVisible(enrollButton);
		Waiters.waitForElementToBeClickable(enrollButton);
		enrollButton.click();
	}

	public void verifyEnrolledCourse(String course, String courseType, String academicYear, String semesterYear) {
		Waiters.waitForElementToBeVisible(addEnrollCourseButton);
		String[] courseParts = course.split(" - \\( | \\)");

		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//td[text()='" + academicYear + "']/following-sibling::td[text()='"
						+ semesterYear + "']/following::td[text()='" + courseParts[1] + "']/following::td[text()='"
						+ courseParts[0] + "']/following::td[text()='" + courseType + "'][1]"));
		element.isDisplayed();
	}

	public String getEnrolledCourseStatus() {
		Waiters.waitForTimeout(500);
		return enrollmentStatus.getText();
	}
}