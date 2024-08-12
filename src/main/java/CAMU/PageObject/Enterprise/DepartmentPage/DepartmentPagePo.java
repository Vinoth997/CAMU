package CAMU.PageObject.Enterprise.DepartmentPage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;
import io.cucumber.datatable.internal.difflib.StringUtills;

public class DepartmentPagePo {

	private static DepartmentPagePo departmentPageInstance;
	String departmentCodeRandom;
	String departmentNameRandom;

	public DepartmentPagePo() {

	}

	public static DepartmentPagePo getInstance() {
		if (departmentPageInstance == null) {
			departmentPageInstance = new DepartmentPagePo();
		}
		return departmentPageInstance;
	}

	@FindBy(xpath = "//p[contains(@class,'text-primary') and contains(text(),'Departments')]")
	private WebElement verifyDepartmentPage;

	@FindBy(xpath = "//button[text()='Add' and contains(@class,'btn-primary')]")
	private WebElement addButton;

	@FindBy(xpath = "//p[contains(@class,'text-secondary') and contains(text(),'Create')]")
	private WebElement verifyCreateDepartment;

	@FindBy(xpath = "//input[@name='DePID']")
	private WebElement departmentCode;

	@FindBy(xpath = "//input[@name='Name']")
	private WebElement departmentName;

	@FindBy(xpath = "//input[@name='Desc']")
	private WebElement departmentDescription;

	@FindBy(xpath = "//input[@name='capac']")
	private WebElement sanctionedStrength;

	@FindBy(xpath = "//input[@name='AdtlSeats']")
	private WebElement additionalSeatsSanctioned;

	@FindBy(xpath = "//input[@id='deptHd']")
	private WebElement departmentHead;

//	@FindBy(xpath = "//label[text()='Department Head']/following::div[@class=' css-b62m3t-container']")
//	private WebElement departmentHead;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	@FindBy(xpath = "//p[contains(text(),'Cannot create duplicate') and contains(@class,'toaster')]")
	private WebElement duplicateMessage;

	@FindBy(xpath = "//p[text()='Department _CREATED_SUCCESSFULLY']")
	private WebElement saveConfirmationMessage;

	@FindBy(xpath = "//div[contains(@class,'invalid')]")
	private WebElement fieldRequiredErrorMessage;

	@FindBy(xpath = "//button[@type='reset']")
	private WebElement resetButton;

	@FindBy(xpath = "//div[@class=' css-1p3m7a8-multiValue']")
	private List<WebElement> selectedDepartmentHead;

	@FindBy(xpath = "//label[text()='Institution']/following::input[@id='InId']")
	private WebElement institutionTextField;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@placeholder='Search' and contains(@class,'search-input')]")
	private WebElement searchBar;
	
	@FindBy(xpath = "//td[contains(@class,'text-primary') and text()='CSEUcaS']//following::div//div//button[@id='dropdown-basic']")
	private WebElement viewSelectedDepartment;
	
//	@FindBy(xpath = "//td[contains(@class,'text-ellipsis') and text()='A1@2']/following::td//div//div//button[@id='dropdown-basic']")
//	private WebElement threeDot;
	
	@FindBy(xpath = "//div[@class='fs-3']//a[@role='button' and @text='Edit']")
	private WebElement editButton;
	
	@FindBy(xpath = "//p[contains(@class,'text-secondary') and contains(text(),'Edit')]")
	private WebElement verifyEditPage;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement updateButton;
	
	@FindBy(xpath = "//p[@class='info-sub_label' and contains(text(),'No departments')]")
	private WebElement noDeparmentErrorMessage;

	public boolean toVerifyDepartmentPage() {
		Waiters.waitForElementToBeVisible(verifyDepartmentPage);
		return verifyDepartmentPage.isDisplayed();
	}

	public void toClickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		addButton.click();
	}

	public boolean toVerifyCreateDepartment() {
		Waiters.waitForElementToBeVisible(verifyCreateDepartment);
		return verifyCreateDepartment.isDisplayed();
	}

	public void toPassDepartmentCode(String randomCode) {
		Waiters.waitForElementToBeVisible(departmentCode);
		departmentCode.clear();
		departmentCodeRandom = randomCode + StringUtils.generateRandomString(4);
		departmentCode.sendKeys(departmentCodeRandom);
	}

	public void toPassDepartmentName(String randomName) {
		Waiters.waitForElementToBeVisible(departmentName);
		departmentName.clear();
		departmentNameRandom = randomName + StringUtils.generateRandomString(4);
		departmentName.sendKeys(departmentNameRandom);
	}

	public void toPassDepartmentDescription(String description) {
		Waiters.waitForElementToBeVisible(departmentDescription);
		ElementUtils.clearAndEnterText(departmentDescription, description);
	}

	public void toPassSanctionedStrength(String value) {
		Waiters.waitForElementToBeVisible(sanctionedStrength);
		ElementUtils.clearInputFieldWithJs(sanctionedStrength);
		sanctionedStrength.sendKeys(value);
	}

	public void toPassAdditionalSeatsSanctioned(String value) {
		Waiters.waitForElementToBeVisible(additionalSeatsSanctioned);
		ElementUtils.clearInputFieldWithJs(additionalSeatsSanctioned);
		additionalSeatsSanctioned.sendKeys(value);
	}

	public void toPassDepartmentHead(String value) {
		Waiters.waitForElementToBeVisible(departmentHead);
		ElementUtils.scrollInToElement(departmentHead);
		departmentHead.click();
		departmentHead.sendKeys(value);
		CommonUtils.selectDropDownOptionWithContains(value);
	}

	public void toClickSaveButton() {
		Waiters.waitForElementToBeVisible(saveButton);
		saveButton.click();
	}

	public boolean toVerifyDuplicateErrorMessage() {
		Waiters.waitForElementToBeVisible(duplicateMessage);
		return duplicateMessage.isDisplayed();
	}

	public void toPassDeptCode(String code) {
		Waiters.waitForElementToBeVisible(departmentCode);
		ElementUtils.clearInputFieldWithJs(departmentCode);
		departmentCode.sendKeys(code);
	}

	public void toPassDeptName(String name) {
		Waiters.waitForElementToBeVisible(departmentName);
		ElementUtils.clearInputFieldWithJs(departmentName);
		departmentName.sendKeys(name);
	}

	public boolean toVerifySavedConfirmationMessage() {
		Waiters.waitForElementToBeVisible(saveConfirmationMessage);
		return saveConfirmationMessage.isDisplayed();
	}

	public boolean toVerifySaveButtonIsDisabled() {
		Waiters.waitForElementToBeVisible(saveButton);
		return !saveButton.isEnabled();
	}

	public boolean toVerifyMandatoryFieldMissingAlert() {
		Waiters.waitForElementToBeVisible(fieldRequiredErrorMessage);
		return fieldRequiredErrorMessage.isDisplayed();
	}

	public void toClickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		resetButton.click();
	}

	public boolean toVerifyTheInstitutionFieldIsResetted() {
		Waiters.waitForElementToBeVisible(institutionTextField);
		String institution = ElementUtils.getInputValue(institutionTextField);
		return institution.isEmpty();
	}

	public boolean toVerifyTheDepartmentCodeFieldIsResetted() {
		Waiters.waitForElementToBeVisible(departmentCode);
		String code = ElementUtils.getInputValue(departmentCode);
		return code.isEmpty();
	}

	public boolean toVerifyTheDepartmentNameFieldIsResetted() {
		Waiters.waitForElementToBeVisible(departmentName);
		String name = ElementUtils.getInputValue(departmentName);
		return name.isEmpty();
	}

	public boolean toVerifyTheDescriptionFieldIsResetted() {
		Waiters.waitForElementToBeVisible(departmentDescription);
		String description = ElementUtils.getInputValue(departmentDescription);
		return description.isEmpty();
	}

	public boolean toVerifySanctionedStrengthFieldIsResetted() {
		Waiters.waitForElementToBeVisible(sanctionedStrength);
		String strength = ElementUtils.getInputValue(sanctionedStrength);
//		int s = Integer.parseInt(strength);
//		boolean value = false;
//		if(s==0) {
//			value = true;
//		}
//		return value;
		return strength.isEmpty();
	}

	public boolean toVerifyAdditionalSanctionedStrengthFieldIsResetted() {
		Waiters.waitForElementToBeVisible(additionalSeatsSanctioned);
		String addtlStrength = ElementUtils.getInputValue(additionalSeatsSanctioned);
//		int as = Integer.parseInt(addtlStrength);
//		boolean value = false;
//		if(as==0) {
//			value = true;
//		}
//		return value;
		return addtlStrength.isEmpty();
	}

	public boolean toVerifyDepartmentHeadFieldIsResetted() {
		Waiters.waitForElementToBeVisible(departmentHead);
		boolean value = false;
		int size = selectedDepartmentHead.size();
		if (size == 0) {
			value = true;
		}
		return value;

	}

	public boolean toVerifyAllFieldsAreResetted() {
		boolean value = false;
		if(toVerifyTheDepartmentCodeFieldIsResetted()&&toVerifyTheDepartmentNameFieldIsResetted()&& toVerifyTheDescriptionFieldIsResetted()&& toVerifySanctionedStrengthFieldIsResetted()&&toVerifyAdditionalSanctionedStrengthFieldIsResetted()&&toVerifyDepartmentHeadFieldIsResetted()) {
			value = true;
		}
		return value;
	}
	
	public boolean toVerifyInstitutionFieldResetted() {
		Waiters.waitForElementToBeVisible(institutionTextField);
		String inputValue = ElementUtils.getInputValue(institutionTextField);
		return inputValue.isEmpty();
	}
	
	public void toClickCancelButton() {
		Waiters.waitForElementToBeVisible(cancelButton);
		cancelButton.click();
	}
	
	public void alertconfirmation_forcancel() {

		Alert alert = DriverManager.getDriver().switchTo().alert();

		alert.accept();

	}
	
	public void toSearchtheDepartment(String value) {
		Waiters.waitForElementToBeVisible(searchBar);
		searchBar.sendKeys(value);
		
	}
	
	public void toClickThreeDotToEdit(String option) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-ellipsis') and text()='"+option+"']/following::td//div//div//button[@id='dropdown-basic']"));
		element.click();
	}
	
	public void toClickEditButton() {
		Waiters.waitForElementToBeVisible(editButton);
		editButton.click();
	}
	
	public boolean toVerifyEditPage() {
		Waiters.waitForElementToBeVisible(verifyEditPage);
		return verifyEditPage.isDisplayed();
	}
	
	public boolean toViewTheSelectedDepartment(String option) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-ellipsis') and text()='"+option+"'][1]"));
		return element.isDisplayed();
	}
	
	public void toVerifyInstitutionFieldIsDisabled() {
		Asserts.assertTrue(!institutionTextField.isEnabled(), "Institution field can be editable");
	}
	 public void toClickUpdateButton() {
		 Waiters.waitForElementToBeVisible(updateButton);
		 updateButton.click();
	 }
	public void toVerifyNoDepartmentErrorMessage() {
		Waiters.waitForElementToBeVisible(noDeparmentErrorMessage);
		Asserts.assertTrue(noDeparmentErrorMessage.isDisplayed(), "Department code is already there");
	}
	
	public boolean toVerifyNumericFieldNotAllowedAlphabets() {
		Waiters.waitForElementToBeVisible(sanctionedStrength);
		String inputValue = ElementUtils.getInputValue(sanctionedStrength);
		return inputValue.isEmpty();
	}
	
}
