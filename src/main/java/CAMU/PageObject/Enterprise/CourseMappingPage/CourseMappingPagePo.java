package CAMU.PageObject.Enterprise.CourseMappingPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.Waiters;

public class CourseMappingPagePo {
	
	private static CourseMappingPagePo CourseMappingPageInstance;
	int mandatoryTextFieldCount;

	private CourseMappingPagePo() {

	}

	public static CourseMappingPagePo getInstance() {
		if (CourseMappingPageInstance == null) {
			CourseMappingPageInstance = new CourseMappingPagePo();
		}
		return CourseMappingPageInstance;
	}
	
	@FindBy(css = ".main-container_block div.header_back p.text-primary")
	private WebElement courseMapPageHeading;
	
	@FindBy(xpath = "//label[text()='Institution']/..//input")
	private WebElement selectInstitutionTextField;
	
	@FindBy(xpath = "//label[text()='Degree']/..//input")
	private WebElement selectDegreeTextField;
	
	@FindBy(xpath = "//label[text()='Program']/..//input")
	private WebElement selectProgramTextField;
	
	@FindBy(xpath = "//label[text()='Department']/..//input")
	private WebElement selectDepartmentTextField;
	
	@FindBy(xpath = "//label[text()='Semester/Year']/..//input")
	private WebElement selectSemesterYearTextField;
	
	@FindBy(xpath = "//button[@type='button' and text()='Search']")
	private WebElement searchButton;
	
	@FindBy(css = ".info-info_view .info-sub_label")
	private WebElement noCourseMapInfo;
	
	@FindBy(xpath = "//button[@type='button' and text()='Add Group']")
	private WebElement addGroupButton;
	
	@FindBy(xpath = "(//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm'])[last()]")
	private WebElement mandatoryCourseTextField;
	
	@FindBy(xpath = "//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::input[@name='oSubject.Hrs']")
	private List<WebElement> mandatoryHoursCompleteTextField;
	
	@FindBy(xpath = "//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm']")
	private List<WebElement> mandatoryTextFieldList;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Update']")
	private WebElement updateButton;
	
	@FindBy(xpath = "//label[text()='Institution']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement institutionSelectedValue;
	
	@FindBy(xpath = "//label[text()='Degree']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement degreeSelectedValue;
	
	@FindBy(xpath = "//label[text()='Program']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement programSelectedValue;
	
	@FindBy(xpath = "//label[text()='Department']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement departmentSelectedValue;
	
	@FindBy(xpath = "//label[text()='Semester/Year']/..//input/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement semesterYearSelectedValue;
	
	@FindBy(xpath = "//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::span[contains(@class,'material-symbols-rounded') and text()='do_not_disturb_on']")
	private List<WebElement> mandatorySelectedCourseRemoveButton;
	
	@FindBy(css = "div.Toastify__toast-container p")
	private WebElement toastPopUp;
	
	@FindBy(xpath = "//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::button")
	private WebElement mandatoryAddPlusButton;

	public String getCourseMappingPageTitle() {
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(courseMapPageHeading);
		return courseMapPageHeading.getText();
	}

	public void searchSelectInstitution(String institution) {
		Waiters.waitForElementToBeVisible(selectInstitutionTextField);
		Waiters.waitForElementToBeClickable(selectInstitutionTextField);
		selectInstitutionTextField.sendKeys(institution);
		CommonUtils.selectDropDownOption(institution);
	}

	public void searchSelectDegree(String degree) {
		Waiters.waitForElementToBeVisible(selectDegreeTextField);
		Waiters.waitForElementToBeClickable(selectDegreeTextField);
		selectDegreeTextField.sendKeys(degree);
		CommonUtils.selectDropDownOption(degree);
	}

	public void searchSelectProgram(String program) {
		Waiters.waitForElementToBeVisible(selectProgramTextField);
		Waiters.waitForElementToBeClickable(selectProgramTextField);
		selectProgramTextField.sendKeys(program);
		CommonUtils.selectDropDownOption(program);
	}

	public void searchSelectDepartment(String department) {
		Waiters.waitForElementToBeVisible(selectDepartmentTextField);
		Waiters.waitForElementToBeClickable(selectDepartmentTextField);
		selectDepartmentTextField.sendKeys(department);
		CommonUtils.selectDropDownOption(department);
	}

	public void searchSelectSemesterYear(String semesterYear) {
		Waiters.waitForElementToBeVisible(selectSemesterYearTextField);
		Waiters.waitForElementToBeClickable(selectSemesterYearTextField);
		selectSemesterYearTextField.sendKeys(semesterYear);
		CommonUtils.selectDropDownOption(semesterYear);
	}

	public void clickOnSearchButton() {
		Waiters.waitForElementToBeVisible(searchButton);
		Waiters.waitForElementToBeClickable(searchButton);
		searchButton.click();
	}

	public boolean verifyNoCourseMappingInfo() {
		Waiters.waitForTimeout(1000);
		boolean value = false;
		try {
			if(noCourseMapInfo.isDisplayed()) {
				value = true;
			}
		} catch (NoSuchElementException e) {
			value = true;
		}
		return value;
	}

	public void clickOnAddGroupButton() {
		Waiters.waitForElementToBeVisible(addGroupButton);
		Waiters.waitForElementToBeClickable(addGroupButton);
		addGroupButton.click();
	}

	public boolean verifyMandatoryCourseFieldAppears() {
		Waiters.waitForTimeout(1000);
		return mandatoryCourseTextField.isDisplayed();
	}

	public void searchAndSelectMandatoryCourse(String course, String hours) {
		Waiters.waitForElementToBeVisible(mandatoryCourseTextField);
		Waiters.waitForElementToBeClickable(mandatoryCourseTextField);
		ElementUtils.clearInputFieldWithJs(mandatoryCourseTextField);
		mandatoryCourseTextField.sendKeys(course);
		CommonUtils.selectDropDownOption(course);
		List<WebElement> value = DriverManager.getDriver().findElements(By.xpath("//span[text()='Mandatory course']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm']/parent::div/preceding-sibling::div[contains(@class,'singleValue')]"));
		for(int i = 0;i<=mandatoryHoursCompleteTextField.size();i++) {
			if(value.get(i).getText().contains(course)) {
				ElementUtils.clearInputFieldWithJs(mandatoryHoursCompleteTextField.get(i));
				mandatoryHoursCompleteTextField.get(i).sendKeys(hours);
				break;
			}
		}
	}

	public void clickOnSaveButton() {
		if(ElementUtils.isPresentAndDisplayed(saveButton)) {
			Waiters.waitForElementToBeClickable(saveButton);
			saveButton.click();
		}else {
			Waiters.waitForElementToBeClickable(updateButton);
			updateButton.click();
		}
//		Waiters.waitForElementToBeVisible(saveButton);
//		Waiters.waitForElementToBeClickable(saveButton);
//		saveButton.click();
	}
	
	public void clickOnCancelButton() {
		Waiters.waitForElementToBeVisible(cancelButton);
		Waiters.waitForElementToBeClickable(cancelButton);
		cancelButton.click();
	}

	public boolean verifyMandatoryCourseFieldDisAppears() {
		Waiters.waitForTimeout(1000);
		return !ElementUtils.isPresentAndDisplayed(mandatoryCourseTextField);
	}

	public void clickOnResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		Waiters.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}

	public void verifyAllFieldsCleared() {
		Waiters.waitForTimeout(1000);
		Asserts.assertTrue(!ElementUtils.isPresentAndDisplayed(institutionSelectedValue), "Institution field is not cleared");
		Asserts.assertTrue(!ElementUtils.isPresentAndDisplayed(degreeSelectedValue), "Degree field is not cleared");
		Asserts.assertTrue(!ElementUtils.isPresentAndDisplayed(programSelectedValue), "Program field is not cleared");
		Asserts.assertTrue(!ElementUtils.isPresentAndDisplayed(departmentSelectedValue), "Department field is not cleared");
		Asserts.assertTrue(!ElementUtils.isPresentAndDisplayed(semesterYearSelectedValue), "Semester/Year field is not cleared");
	}

	public boolean electiveFieldAppears(Integer electiveFieldCount) {
		Waiters.waitForTimeout(1000);
		boolean value = false;
		try {
			WebElement electiveFieldHeading = DriverManager.getDriver().findElement(By.xpath("//span[contains(@class,'text-primary') and text()='Elective "+electiveFieldCount+"']"));
			if(electiveFieldHeading.isDisplayed()) {
				value = true;
			}
		} catch (NoSuchElementException e) {
			value = false;
		}
		
		return value;
		
	}

	public void searchAndSelectElectiveCourse(Integer electiveFieldCount, String course, String hours) {
		WebElement electiveTextField = DriverManager.getDriver().findElement(By.xpath("(//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm'])[last()]"));
		Waiters.waitForElementToBeVisible(electiveTextField);
		Waiters.waitForElementToBeClickable(electiveTextField);
		ElementUtils.clearInputFieldWithJs(electiveTextField);
		electiveTextField.sendKeys(course);
		CommonUtils.selectDropDownOption(course);
		List<WebElement> electiveHoursCompletedTextField = DriverManager.getDriver().findElements(By.xpath("//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::input[@name='oSubject.Hrs']"));
		List<WebElement> value = DriverManager.getDriver().findElements(By.xpath("//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm']/parent::div/preceding-sibling::div[contains(@class,'singleValue')]"));
		for(int i = 0;i<=electiveHoursCompletedTextField.size();i++) {
			if(value.get(i).getText().contains(course)) {
				ElementUtils.clearInputFieldWithJs(electiveHoursCompletedTextField.get(i));
				electiveHoursCompletedTextField.get(i).sendKeys(hours);
				break;
			}
		}
	}

	public void removeSelectedElectiveCourses(Integer electiveFieldCount) throws InterruptedException {
		List<WebElement> electiveRemoveButton = DriverManager.getDriver().findElements(By.xpath("//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::span[contains(@class,'material-symbols-rounded') and text()='do_not_disturb_on']"));
		Waiters.waitForListOfElementsToBeVisible(electiveRemoveButton);
		for (int i = electiveRemoveButton.size() - 1; i >= 0; i--) {
			Thread.sleep(1000);
			ElementUtils.scrollInToElement(electiveRemoveButton.get(i));
			electiveRemoveButton.get(i).click();
		}
	}

	public boolean electiveTextFieldDisAppears(Integer electiveFieldCount) {
		Waiters.waitForTimeout(1000);
		boolean value = false;
		try {
			WebElement electiveFieldHeading = DriverManager.getDriver().findElement(By.xpath("(//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::input[@id='oSubject.subjNm'])[last()]"));
			if(electiveFieldHeading.isDisplayed()) {
				value = false;
			}
		} catch (NoSuchElementException e) {
			value = true;
		}
		
		return value;
	}

	public void removeSelectedMandatoryCourses() throws InterruptedException {
		Waiters.waitForListOfElementsToBeVisible(mandatorySelectedCourseRemoveButton);
		for (int i = mandatorySelectedCourseRemoveButton.size() - 1; i >= 0; i--) {
			Thread.sleep(1000);
			ElementUtils.scrollInToElement(mandatorySelectedCourseRemoveButton.get(i));
			mandatorySelectedCourseRemoveButton.get(i).click();
		}
	}

	public boolean mandatoryCourseTextFieldDisAppears() {
		Waiters.waitForTimeout(1000);
		boolean value = false;
		try {
			if(mandatoryCourseTextField.isDisplayed()) {
				value = false;
			}
		} catch (NoSuchElementException e) {
			value = true;
		}
		
		return value;
	}

	public void clickUpdateButton() {
		Waiters.waitForElementToBeVisible(updateButton);
		Waiters.waitForElementToBeClickable(updateButton);
		updateButton.click();
	}

	public void clickElectiveFieldCloseButton(Integer electiveFieldCount) {
		WebElement electiveFieldCloseButton = DriverManager.getDriver().findElement(By.xpath("//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]//self::span[contains(@class,'material-symbols-rounded') and text()='close']"));
		Waiters.waitForElementToBeVisible(electiveFieldCloseButton);
		electiveFieldCloseButton.click();
	}

	public boolean electiveFieldDisAppears(Integer electiveFieldCount) {
		Waiters.waitForTimeout(1000);
		boolean value = false;
		try {
			WebElement electiveField = DriverManager.getDriver().findElement(By.xpath("//span[text()='Elective "+electiveFieldCount+"']/ancestor::div[contains(@class,'list-form_container')]"));
			if(electiveField.isDisplayed()) {
				value = false;
			}
		} catch (NoSuchElementException e) {
			value = true;
		}
		
		return value;
	}

	public String getToastText() {
		Waiters.waitForElementToBeVisible(toastPopUp);
		return toastPopUp.getText();
	}

	public void clickAddMandatoryNewTextFieldButton() {
//		Waiters.waitForListOfElementsToBeVisible(mandatoryTextFieldList);
		mandatoryTextFieldCount = mandatoryTextFieldList.size();
		Waiters.waitForElementToBeClickable(mandatoryAddPlusButton);
		mandatoryAddPlusButton.click();
	}

	public boolean verifyNewMandatoryTextFieldAdded() {
		Waiters.waitForListOfElementsToBeVisible(mandatoryTextFieldList);
		boolean value = false;
		if (mandatoryTextFieldList.size() > mandatoryTextFieldCount) {
			value = true;
		}else {
			value = false;
		}
		return value;
	}

	public boolean verifyHoursFieldAcceptDecimal() {
		String value = ElementUtils.getInputValue(mandatoryHoursCompleteTextField.get(0));
	    try {
	        double parsedValue = Double.parseDouble(value);
	        int integerValue = (int) parsedValue;
	        double decimalPart = parsedValue - integerValue;
	        return decimalPart > 0;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}

	public boolean verifyHoursFieldAcceptAlphabetsSpecialChar() {
		return ElementUtils.getInputValue(mandatoryHoursCompleteTextField.get(0)).isEmpty();
	}

}
