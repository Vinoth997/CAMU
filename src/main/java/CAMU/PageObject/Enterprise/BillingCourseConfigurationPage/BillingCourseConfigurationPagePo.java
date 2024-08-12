package CAMU.PageObject.Enterprise.BillingCourseConfigurationPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.Waiters;

public class BillingCourseConfigurationPagePo {

	private static BillingCourseConfigurationPagePo BillingCourseConfigurationPageInstance;

	private BillingCourseConfigurationPagePo() {

	}

	public static BillingCourseConfigurationPagePo getInstance() {
		if (BillingCourseConfigurationPageInstance == null) {
			BillingCourseConfigurationPageInstance = new BillingCourseConfigurationPagePo();
		}
		return BillingCourseConfigurationPageInstance;
	}

	@FindBy(xpath = "//label[text()='Institution']/following-sibling::div[contains(@class,'select')]/div[@title]")
	private WebElement selectedInstitution;

	@FindBy(xpath = "//label[text()='Department']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectDepartmentTextField;

	@FindBy(xpath = "//button[@type='button' and text()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//p[text()='Billing Policy']/parent::div[@class='form-list_container']//button[@type='button' and text()='Add']")
	private WebElement addBillingPolicyButton;

	@FindBy(xpath = "//div[@class='modal-content']//div[text()='Billing Policy']")
	private WebElement billingPolicyDialogHeading;

	@FindBy(xpath = "//div[@class='modal-content']//div[text()='Create']")
	private WebElement academicYearDialogHeading;

	@FindBy(xpath = "//div[text()='Billing Policy']/following::input")
	private WebElement selectBillPolicyTextField;

	@FindBy(xpath = "//div[@class='modal-content']//following::button[@type='submit' and text()='Save']")
	private WebElement billingPolicySaveButton;

	@FindBy(xpath = "//p[text()='Billing Policy']/following-sibling::div[@class='table-container']//tbody/tr[1]/td[not(@title='more_horiz')]")
	private List<WebElement> newCreatedBillingPolicy;

	@FindBy(xpath = "//p[text()='Academic Year']/following-sibling::div[@class='table-container']//tbody/tr[last()]/td[not(@title='more_horiz')]")
	private List<WebElement> newCreatedAcademicYear;

	@FindBy(xpath = "//p[text()='Academic Year']/parent::div[@class='form-list_container']//button[@type='button' and text()='Add']")
	private WebElement addAcademicYearButton;

	@FindBy(xpath = "//div[@class='modal-content']//div[contains(@class,'select')]//input")
	private WebElement selectAcademicYearTextField;

	@FindBy(xpath = "//div[@class='modal-content']//div[contains(@class,'select')]/following::div[contains(@class,'date-picker')]/input")
	private WebElement academicDueDateTextField;

	@FindBy(xpath = "//div[@class='modal-content']//div[contains(@class,'select')]/following::input[@type='checkbox']")
	private WebElement academicActiveCheckbox;

	@FindBy(xpath = "//p[text()='Billing Policy']/following-sibling::div[@class='table-container']//button[@type='button' and text()='Next']")
	private WebElement billingPolicyNextPageButton;

	@FindBy(xpath = "//p[text()='Academic Year']/following-sibling::div[@class='table-container']//button[@type='button' and text()='Next']")
	private WebElement academicYearNextPageButton;

	@FindBy(xpath = "//label[text()='Department']/following-sibling::div/div[@title]")
	private WebElement selectedDepartment;

	@FindBy(xpath = "//p[text()='Billing Policy']/following-sibling::div[@class='table-container']//input[contains(@class,'search-input')]")
	private WebElement billingPolicySearchField;

	@FindBy(xpath = "//p[text()='Academic Year']/following-sibling::div[@class='table-container']//input[contains(@class,'search-input')]")
	private WebElement academicYearSearchField;

	@FindBy(xpath = "//a[@text='Edit']")
	private WebElement editButton;

	@FindBy(xpath = "//div[contains(@class,'multiValue')]/div[@role='button']")
	private WebElement removeSelectedBillingPolicy;

	@FindBy(xpath = "//div[contains(@class,'multiValue')]/div[@role='button']")
	private List<WebElement> removeSelectedBillingPolicyList;

	@FindBy(xpath = "//p[text()='Billing Policy']/following-sibling::div[@class='table-container']//select")
	private WebElement billingCourseShowResultDropDown;

	@FindBy(xpath = "//p[text()='Academic Year']/following-sibling::div[@class='table-container']//select")
	private WebElement academicYearShowResultDropDown;

	public String verifyInstitutionSelected(String institution) {
		Waiters.waitForElementToBeVisible(selectedInstitution);
		return selectedInstitution.getAttribute("title");
	}

	public void selectDepartment(String department) {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(selectDepartmentTextField);
		ElementUtils.forceClickWithJs(selectDepartmentTextField);
		selectDepartmentTextField.sendKeys(department);
		CommonUtils.selectDropDownOption(department);
	}

	public void clickSearchButton() {
		Waiters.waitForElementToBeVisible(searchButton);
		Waiters.waitForElementToBeClickable(searchButton);
		searchButton.click();
	}

	public void clickAddBillingPolicy() {
		Waiters.waitForElementToBeVisible(addBillingPolicyButton);
		Waiters.waitForElementToBeClickable(addBillingPolicyButton);
		addBillingPolicyButton.click();
	}

	public boolean verifyBillingPolicyDialogAppeared() {
		Waiters.waitForTimeout(1000);
		return billingPolicyDialogHeading.isDisplayed();
	}

	public void selectBillingPolicy(String billingPolicy) {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(selectBillPolicyTextField);
		ElementUtils.forceClickWithJs(selectBillPolicyTextField);
		selectBillPolicyTextField.sendKeys(billingPolicy);
		CommonUtils.selectDropDownOption(billingPolicy);
	}

	public void saveBillingPolicy() {
		Waiters.waitForElementToBeVisible(billingPolicySaveButton);
		Waiters.waitForElementToBeClickable(billingPolicySaveButton);
		billingPolicySaveButton.click();
	}

	public void verifyNewBillingPolicyAdded(String institution, String department, String selectedBillingPolicy) {
		Asserts.assertEqualsText(newCreatedBillingPolicy.get(0).getText(), institution);
		Asserts.assertEqualsText(newCreatedBillingPolicy.get(4).getText(), department);
		Asserts.assertEqualsText(newCreatedBillingPolicy.get(6).getText(), selectedBillingPolicy);
	}

	public void clickAddAcademicYear() {
		Waiters.waitForElementToBeVisible(addAcademicYearButton);
		Waiters.waitForElementToBeClickable(addAcademicYearButton);
		addAcademicYearButton.click();
	}

	public boolean verifyAcademicYearDialogAppeared() {
		Waiters.waitForTimeout(1000);
		return academicYearDialogHeading.isDisplayed();
	}

	public void selectAcademicYear(String academicYear) {
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(selectAcademicYearTextField);
		ElementUtils.forceClickWithJs(selectAcademicYearTextField);
		selectAcademicYearTextField.sendKeys(academicYear);
		CommonUtils.selectDropDownOption(academicYear);
	}

	public void selectAcademicDueDate(String academicDueDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(academicDueDateTextField);
		CommonUtils.dateSelector(academicDueDateTextField, academicDueDate);
	}

	public void checkActiveAcademicPolicy() {
		Waiters.waitForElementToBeVisible(academicActiveCheckbox);
		if (!academicActiveCheckbox.isSelected()) {
			Waiters.waitForElementToBeClickable(academicActiveCheckbox);
			academicActiveCheckbox.click();
		}
	}

	public void uncheckActiveAcademicPolicy() {
		Waiters.waitForElementToBeVisible(academicActiveCheckbox);
		if (academicActiveCheckbox.isSelected()) {
			Waiters.waitForElementToBeClickable(academicActiveCheckbox);
			academicActiveCheckbox.click();
		}
	}

	public void verifyNewAcademicYearCreated(String institution, String academicYear, String dueDate, String status) {
		Asserts.assertEqualsText(newCreatedAcademicYear.get(0).getText(), institution);
		Asserts.assertEqualsText(newCreatedAcademicYear.get(1).getText(), academicYear);
		Asserts.assertEqualsText(newCreatedAcademicYear.get(3).getText(), dueDate);
		Asserts.assertEqualsText(newCreatedAcademicYear.get(4).getText(), status);
	}

	public void clickAcademicYearNextPage() {
		Waiters.waitForElementToBeVisible(academicYearNextPageButton);
		ElementUtils.scrollInToElement(academicYearNextPageButton);
		Waiters.waitForElementToBeClickable(academicYearNextPageButton);
		academicYearNextPageButton.click();
	}

	public boolean verifyInstitutionFieldCleared() {
		Waiters.waitForTimeout(500);
		return ElementUtils.isDisappeared(selectedInstitution);
	}

	public boolean verifyDepartmentFieldCleared() {
		Waiters.waitForTimeout(500);
		return ElementUtils.isDisappeared(selectedDepartment);
	}

	public void searchBillingPolicy(String billingPolicy) {
		Waiters.waitForElementToBeVisible(billingPolicySearchField);
		billingPolicySearchField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(billingPolicySearchField, billingPolicy, 80);
		Waiters.waitForTimeout(1000);
	}

	public void clickEditBillingPolicy(String department, String billingPolicy) {
		WebElement billiingPolicyEle = DriverManager.getDriver().findElement(
				By.xpath("//p[text()='Billing Policy']/following-sibling::div[@class='table-container']//td[text()='"
						+ department + "']/following-sibling::td[text()='" + billingPolicy
						+ "']/preceding::button[@id='dropdown-basic']"));
		Waiters.waitForElementToBeVisible(billiingPolicyEle);
		Waiters.waitForElementToBeClickable(billiingPolicyEle);
		billiingPolicyEle.click();
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
		Waiters.waitForTimeout(1000);
	}

	public void removeSelectedBillingPolicy() {
		Waiters.waitForTimeout(1000);
		if (ElementUtils.isPresentAndDisplayed(removeSelectedBillingPolicy)) {
			for (int i = removeSelectedBillingPolicyList.size() - 1; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				removeSelectedBillingPolicyList.get(i).click();
			}
		}
	}

	public boolean verifySelectedBillingPolicyRemoved() {
		Waiters.waitForTimeout(600);
		return ElementUtils.isDisappeared(removeSelectedBillingPolicy);
	}

	public void searchAcademicYear(String academicYear) {
		Waiters.waitForElementToBeVisible(academicYearSearchField);
		academicYearSearchField.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(academicYearSearchField, academicYear, 80);
		Waiters.waitForTimeout(1000);
	}

	public void clickEditAcademicYear(String academicYear, String dueDate) {
		WebElement billiingPolicyEle = DriverManager.getDriver().findElement(
				By.xpath("//p[text()='Academic Year']/following-sibling::div[@class='table-container']//td[text()='"
						+ academicYear + "']/following-sibling::td[text()='" + dueDate
						+ "']/preceding-sibling::td//button"));
		Waiters.waitForElementToBeVisible(billiingPolicyEle);
		Waiters.waitForElementToBeClickable(billiingPolicyEle);
		billiingPolicyEle.click();
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
		Waiters.waitForTimeout(1000);
	}

	public void billingPolicyShowResultValue(String value) {
		Waiters.waitForElementToBeVisible(billingCourseShowResultDropDown);
		ElementUtils.scrollInToElement(billingCourseShowResultDropDown);
		ElementUtils.selectFromDropDown(billingCourseShowResultDropDown, "value", value);
	}

	public void academicYearShowResultValue(String value) {
		Waiters.waitForElementToBeVisible(academicYearShowResultDropDown);
		ElementUtils.scrollInToElement(academicYearShowResultDropDown);
		ElementUtils.selectFromDropDown(academicYearShowResultDropDown, "value", value);
	}

	public boolean verifyAcademicYearFieldDisabled() {
		Waiters.waitForTimeout(1000);
		return !selectAcademicYearTextField.isEnabled();
	}

	public void selectMultipleBillingPolicy(String billingPolicy) {
		Waiters.waitForTimeout(1000);
		String[] split = billingPolicy.split(",");
		for (int i = 0; i < split.length; i++) {
			ElementUtils.clearInputFieldWithJs(selectBillPolicyTextField);
			ElementUtils.forceClickWithJs(selectBillPolicyTextField);
			selectBillPolicyTextField.sendKeys(split[i].trim());
			CommonUtils.selectDropDownOption(split[i].trim());
		}
	}

}
