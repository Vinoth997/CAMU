package CAMU.PageObject.Enterprise.ProgramPage;

import java.util.List;

import org.openqa.selenium.Alert;
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

public class ProgramPagePo {
	
	private static ProgramPagePo ProgramPageInstance;
	String programIdRandom;
	String programNameRandom;
	String syllabusNameRandom;
	String newSyllabusTitleRandom;

	private ProgramPagePo() {

	}

	public static ProgramPagePo getInstance() {
		if (ProgramPageInstance == null) {
			ProgramPageInstance = new ProgramPagePo();
		}
		return ProgramPageInstance;
	}
	
	@FindBy(css = ".main-container_block div.header_back p.text-primary")
	private WebElement programPageHeading;
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(css = ".main-container_block div.header_back p.text-secondary")
	private WebElement createNewProgramPageHeading;
	
	@FindBy(css = "input[id='InId']")
	private WebElement institutionTextField;
	
	@FindBy(xpath = "//label[text()='Institution']/following::span[contains(@class,'indicatorSeparator')]//preceding-sibling::div")
	private WebElement insituteClearButton;
	
	@FindBy(css = "input[id='PrID']")
	private WebElement selectDegreeTextField;
	
	@FindBy(xpath = "//div[contains(@class,'menu')]//div[contains(@class,'option')]")
	private WebElement optionList;
	
	@FindBy(css = "input[name='CrsT']")
	private WebElement programTypeTextField;
	
	@FindBy(css = "input[name='CrID']")
	private WebElement programIdTextField;
	
	@FindBy(css = "input[name='Name']")
	private WebElement programNameTextField;
	
	@FindBy(css = "input[name='Desc']")
	private WebElement programDescriptionTextField;
	
	@FindBy(css = "input[name='CrsDtls']")
	private WebElement programDetailsTextField;
	
	@FindBy(css = "input[id='OffDept']")
	private WebElement offeringDepartmentTextField;
	
	@FindBy(css = "input[name='capac']")
	private WebElement sanctionedStrengthTextField;
	
	@FindBy(css = "input[name='sts']")
	private WebElement activeCheckBox;
	
	@FindBy(css = "input[name='PassMrk']")
	private WebElement passMarkTextField;
	
	@FindBy(css = "input[name='MdtnMrk']")
	private WebElement moderationMarkTextField;
	
	@FindBy(css = "input[name='MaxModSubjs']")
	private WebElement maximumModerationTextField;
	
	@FindBy(css = "input[name='Varnc']")
	private WebElement varianceForRevaluationTextField;
	
	@FindBy(css = "input[name='AcdmcDur']")
	private WebElement academicDurationTextField;
	
	@FindBy(css = "input[name='AssmntDur']")
	private WebElement assessmentDurationTextField;
	
	@FindBy(css = "input[name='mxFlCr']")
	private WebElement maximumFailedCreditTextField;
	
	@FindBy(css = "input[id='StaffId']")
	private WebElement enquiryManagerTextField;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement saveButton;
	
	@FindBy(css = "div.Toastify div.Toastify__toast-container p.toaster-sub_label")
	private WebElement savedSuccessfullyPopUp;
	
	@FindBy(css = "div.search input.search-input")
	private WebElement searchProgramTextField;
	
	@FindBy(css = "table.table-data_list td.text-primary:first-of-type")
	private WebElement programIdTable;
	
	@FindBy(css = "div.Toastify__toast-body + button.Toastify__close-button")
	private WebElement popupCloseButton;
	
	@FindBy(xpath = "//button[@type='reset' and text()='Reset']")
	private WebElement resetButton;
	
	@FindBy(xpath = "//a[@text='Edit']")
	private WebElement editButton;
	
	@FindBy(xpath = "//label[text()='Offering Department']/following::span[contains(@class,'indicatorSeparator')]//preceding-sibling::div")
	private WebElement offeringDepartmentClearButton;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Update']")
	private WebElement updateButton;
	
	@FindBy(xpath = "//div[contains(@class,'multiValue')]")
	private WebElement selectedManager;
	
	@FindBy(xpath = "//div[contains(@class,'multiValue')]/div[@role='button' and contains(@aria-label,'Remove')]")
	private WebElement removeSelectedManager;
	
	@FindBy(xpath = "//p[contains(text(),'Curriculum and Syllabus')]/following::button[@type='button' and text()='Add']")
	private WebElement addCurriculamSyllabus;
	
	@FindBy(css = "input[id='TtleId']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//label[text()='Name']/following::input[@name='Name']")
	private WebElement syllabusNameTextField;
	
	@FindBy(xpath = "//input[@type='file' and @id='camu-file']")
	private WebElement uploadSyllabus;
	
	@FindBy(css = "input[id=RglnId]")
	private WebElement regulationTextField;
	
	@FindBy(xpath = "//button[@type='submit' and text()='SUBMIT']")
	private WebElement syllabusSubmitButton;
	
	@FindBy(xpath = "//div[@class='canvas-footer']/button[@type='button' and text()='Cancel']")
	private WebElement syllabusCancelButton;
	
	@FindBy(css = "table.table-data_list td:first-of-type")
	private WebElement createdSyllabusTitle;
	
	@FindBy(css = "table.table-data_list td:nth-of-type(2)")
	private WebElement createdSyllabusName;
	
	@FindBy(css = "table.table-data_list td:nth-of-type(4)")
	private WebElement createdSyllabusRegulation;
	
	@FindBy(css = "input.search-input")
	private WebElement searchSyllabusTextField;
	
	@FindBy(css = "table.table-data_list td.text-primary button[type=button]")
	private WebElement editSyllabusButton;
	
	@FindBy(css = "a[text=Delete]")
	private WebElement deleteSyllabusButton;
	
	@FindBy(xpath = "//div[contains(@class,'modal-title') and text()='Delete confirmation']")
	private WebElement deleteConfirmationPopup;
	
	@FindBy(xpath = "//button[@type='submit' and text()='Yes']")
	private WebElement deleteConfirmationYesButton;
	
	@FindBy(xpath = "//span[text()='add']/parent::button")
	private WebElement addNewTitleSyllabusButton;
	
	@FindBy(xpath = "//div[contains(@class,'modal-title') and text()='Add New Title']")
	private WebElement addNewTitleTabHeading;
	
	@FindBy(xpath = "//div[contains(@class,'modal-title')]/following::label[text()='Title']/following::input[@name='Name']")
	private WebElement newTitleTextField;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='submit' and text()='SUBMIT']")
	private WebElement addNewSyllabusTitleSubmitButton;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='button' and text()='Cancel']")
	private WebElement addNewSyllabusTitleCancelButton;
	
	@FindBy(xpath = "//label[text()='Institution']/following-sibling::div[@class='invalid-feedback']")
	private WebElement institutionFieldErrorMessage;
	
	@FindBy(xpath = "//label[text()='Degree']/following-sibling::div[@class='invalid-feedback']")
	private WebElement degreeFieldErrorMessage;
	
	@FindBy(xpath = "//label[text()='Program Type']/following-sibling::div[@class='invalid-feedback']")
	private WebElement programTypeFieldErrorMessage;
	
	@FindBy(xpath = "//label[text()='Program ID']/following-sibling::div[@class='invalid-feedback']")
	private WebElement programIDFieldErrorMessage;
	
	@FindBy(xpath = "//label[text()='Program Name']/following-sibling::div[@class='invalid-feedback']")
	private WebElement programNameFieldErrorMessage;
	
	@FindBy(xpath = "//button[@type='button' and text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(css = "input[name=VarncPnt]")
	private WebElement varianceCheckbox;
	
	@FindBy(css = "input[name=PT]")
	private WebElement partTimeCheckbox;
	
	@FindBy(xpath = "//div[contains(@class,'multiValue')]")
	private List<WebElement> selectedEnquiryManagerList;
	
	@FindBy(xpath = "//div[@role='button' and contains(@aria-label,'Remove')]")
	private List<WebElement> selectedEnquiryManagerRemoveButton;
	
	@FindBy(xpath = "//input[@id='PrID']/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement selectedDegree;
	
	@FindBy(xpath = "//input[@id='InId']/parent::div/preceding-sibling::div[contains(@class,'singleValue')]")
	private WebElement selectedInstitution;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='button' and text()='Cancel']")
	private WebElement syllabusAddNewTitleFieldCancelButton;
	
	@FindBy(xpath = "//div[@class='modal-content']")
	private WebElement syllabusAddNewTitleDialog;
	
//	@FindBy(css = "input[id=globalSearch]")
	@FindBy(xpath ="//div[@class='search-menu_list']//input[@id='globalSearch' or @name='globalSearch']")
	private WebElement globalSearchBarField;
	
	@FindBy(css = "div.info-info_view p.info-sub_label")
	private WebElement noDataField;
	
	@FindBy(css = ".search-menu_list")
	private WebElement searchList;
	
	public String getProgramPageHeading() {
		Waiters.waitForElementToBeVisible(programPageHeading);
		return programPageHeading.getText();
	}
	
	public void clickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public String getCreateProgramPageHeading() {
		Waiters.waitForElementToBeVisible(createNewProgramPageHeading);
		return createNewProgramPageHeading.getText();
	}

	public void selectInstitution(String institutionName) {
		Waiters.waitForElementToBeVisible(institutionTextField);
//		if(insituteClearButton.isDisplayed()) {
//			insituteClearButton.click();
//		}
//		Waiters.waitForElementToBeClickable(institutionTextField);
//		institutionTextField.click();
		institutionTextField.sendKeys(institutionName);
		CommonUtils.selectDropDownOption(institutionName);
	}

	public void selectDegree(String degree) {
		Waiters.waitForElementToBeVisible(selectDegreeTextField);
		selectDegreeTextField.clear();
//		Waiters.waitForElementToBeClickable(selectDegreeTextField);
//		selectDegreeTextField.click();
		selectDegreeTextField.sendKeys(degree);
		CommonUtils.selectDropDownOption(degree);
	}

	public void enterProgramType(String programType) {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		programTypeTextField.clear();
		programTypeTextField.sendKeys(programType);
	}

	public void enterProgramID(String programName) {
		Waiters.waitForElementToBeVisible(programIdTextField);
		programIdTextField.clear();
		programIdRandom = programName+StringUtils.generateRandomString(5);
		programIdTextField.sendKeys(programIdRandom);
	}
	
	public void enterProgramName(String programId) {
		Waiters.waitForElementToBeVisible(programNameTextField);
		programNameTextField.clear();
		programNameRandom = programId+" "+StringUtils.generateRandomString(6);
		programNameTextField.sendKeys(programNameRandom);
	}

	public void enterProgramDescription(String programDescription) {
		Waiters.waitForElementToBeVisible(programDescriptionTextField);
		programDescriptionTextField.clear();
		ElementUtils.clearInputFieldWithJs(programDescriptionTextField);
		programDescriptionTextField.sendKeys(programDescription);
	}

	public void enterProgramDetails(String programDetails) {
		Waiters.waitForElementToBeVisible(programDetailsTextField);
		programDetailsTextField.clear();
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(programDetailsTextField);
		programDetailsTextField.sendKeys(programDetails);
	}
	
	public void selectOfferingDepartment(String offeringDepartment) {
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
//		offeringDepartmentTextField.clear();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		Waiters.waitForElementToBeClickable(offeringDepartmentTextField);
		offeringDepartmentTextField.click();
		offeringDepartmentTextField.sendKeys(offeringDepartment);
		CommonUtils.selectDropDownOption(offeringDepartment);
	}

	public void selectOfferingDepartmentNew(String offeringDepartment) {
		if(offeringDepartmentClearButton.isDisplayed()) {
			offeringDepartmentClearButton.click();
		}
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
//		offeringDepartmentTextField.clear();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		offeringDepartmentTextField.sendKeys(offeringDepartment);
		CommonUtils.selectDropDownOption(offeringDepartment);
	}
	
	public void enterSanctionedStrength(String sanctionedStrength) {
		Waiters.waitForElementToBeVisible(sanctionedStrengthTextField);
//		sanctionedStrengthTextField.clear();
		ElementUtils.clearInputFieldWithJs(sanctionedStrengthTextField);
		sanctionedStrengthTextField.sendKeys(sanctionedStrength);
	}

	public void clickActiveToEnable() {
		Waiters.waitForElementToBeVisible(activeCheckBox);
		if(!activeCheckBox.isSelected()) {
			activeCheckBox.click();
		}
	}
	
	public void clickActiveToDisable() {
		Waiters.waitForElementToBeVisible(activeCheckBox);
		if(activeCheckBox.isSelected()) {
			activeCheckBox.click();
		}
	}

	public void enterPassMark(String passMark) {
		Waiters.waitForElementToBeVisible(passMarkTextField);
//		passMarkTextField.clear();
		ElementUtils.clearInputFieldWithJs(passMarkTextField);
		passMarkTextField.sendKeys(passMark);
	}

	public void enterModerationMark(String moderationMark) {
		Waiters.waitForElementToBeVisible(moderationMarkTextField);
//		moderationMarkTextField.clear();
		ElementUtils.clearInputFieldWithJs(moderationMarkTextField);
		moderationMarkTextField.sendKeys(moderationMark);
	}

	public void enterMaximumNoCoursesForModeration(String maximumNoCourseModeration) {
		Waiters.waitForElementToBeVisible(maximumModerationTextField);
//		maximumModerationTextField.clear();
		ElementUtils.clearInputFieldWithJs(maximumModerationTextField);
		maximumModerationTextField.sendKeys(maximumNoCourseModeration);
	}

	public void enterVarianceForRevaluation(String varianceForRevaluation) {
		Waiters.waitForElementToBeVisible(varianceForRevaluationTextField);
		varianceForRevaluationTextField.clear();
		ElementUtils.clearInputFieldWithJs(varianceForRevaluationTextField);
		varianceForRevaluationTextField.sendKeys(varianceForRevaluation);
	}

	public void enterAcademicDuration(String academicDuration) {
		Waiters.waitForElementToBeVisible(academicDurationTextField);
//		academicDurationTextField.clear();
		ElementUtils.clearInputFieldWithJs(academicDurationTextField);
		academicDurationTextField.sendKeys(academicDuration);
	}

	public void enterAssesmentDuration(String assesmentDuration) {
		Waiters.waitForElementToBeVisible(assessmentDurationTextField);
//		assessmentDurationTextField.clear();
		ElementUtils.clearInputFieldWithJs(assessmentDurationTextField);
		assessmentDurationTextField.sendKeys(assesmentDuration);
	}

	public void enterMaximumFailedCredits(String maximumFailedCredits) {
		Waiters.waitForElementToBeVisible(maximumFailedCreditTextField);
//		maximumFailedCreditTextField.clear();
		ElementUtils.clearInputFieldWithJs(maximumFailedCreditTextField);
		maximumFailedCreditTextField.sendKeys(maximumFailedCredits);
	}

	public void selectEnquiryManager(String enquiryManager) {
		Waiters.waitForElementToBeVisible(enquiryManagerTextField);
		ElementUtils.scrollInToElement(enquiryManagerTextField);
//		enquiryManagerTextField.clear();
		enquiryManagerTextField.click();
		ElementUtils.clearInputFieldWithJs(enquiryManagerTextField);
		enquiryManagerTextField.sendKeys(enquiryManager);
		CommonUtils.selectDropDownOptionWithContains(enquiryManager);
	}

	public void clickSave() {
		Waiters.waitForElementToBeVisible(saveButton);
		Waiters.waitForElementToBeClickable(saveButton);
		saveButton.click();
	}
	
	public String getSavedSuccessfullyPopupMessage() {
		Waiters.waitForElementToBeVisible(savedSuccessfullyPopUp);
		return savedSuccessfullyPopUp.getText();
	}
	
	public void closePopUp() {
		Waiters.waitForElementToBeVisible(popupCloseButton);
		Waiters.waitForElementToBeClickable(popupCloseButton);
		popupCloseButton.click();
	}
	
	public String getProgramId() {
		return programIdRandom;
	}

	public String searchCreatedNewProgramAndVerify() {
		Waiters.waitForElementToBeVisible(searchProgramTextField);
		searchProgramTextField.clear();
		ActionsUtils.typeTextWithInterval(searchProgramTextField, programIdRandom);
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(programIdTable);
		return programIdTable.getText();
	}

	public void enterDuplicateProgramType(String programType) {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		ElementUtils.clearInputFieldWithJs(programTypeTextField);
		programTypeTextField.sendKeys(programType);
	}

	public void enterDuplicateProgramId(String programId) {
		Waiters.waitForElementToBeVisible(programIdTextField);
		programIdTextField.clear();
		Waiters.waitForTimeout(1000);
		ElementUtils.clearInputFieldWithJs(programIdTextField);
		programIdTextField.sendKeys(programId);
	}

	public void enterDuplicateProgramName(String programName) {
		Waiters.waitForElementToBeVisible(programNameTextField);
		ElementUtils.clearInputFieldWithJs(programNameTextField);
		programNameTextField.sendKeys(programName);
	}

	public void clickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		Waiters.waitForElementToBeClickable(resetButton);
		resetButton.click();
	}
	
	public boolean verifyAllFieldsAreCleared() {
		boolean isInstitutionTextFieldCleared = ElementUtils.getInputValue(institutionTextField).isEmpty();
	    boolean isSelectDegreeTextFieldCleared = ElementUtils.getInputValue(selectDegreeTextField).isEmpty();
	    boolean isProgramTypeTextFieldCleared = ElementUtils.getInputValue(programTypeTextField).isEmpty();
	    boolean isProgramIdTextFieldCleared = ElementUtils.getInputValue(programIdTextField).isEmpty();
	    boolean isProgramNameTextFieldCleared = ElementUtils.getInputValue(programNameTextField).isEmpty();
	    boolean isProgramDescriptionTextFieldCleared = ElementUtils.getInputValue(programDescriptionTextField).isEmpty();
	    boolean isProgramDetailsTextFieldCleared = ElementUtils.getInputValue(programDetailsTextField).isEmpty();
	    boolean isOfferingDepartmentTextFieldCleared = ElementUtils.getInputValue(offeringDepartmentTextField).isEmpty();
	    boolean isSanctionedStrengthTextFieldCleared = ElementUtils.getInputValue(sanctionedStrengthTextField).isEmpty();
	    boolean isCheckBoxNotSelected = !activeCheckBox.isSelected();
	    boolean isPassMarkTextFieldCleared = ElementUtils.getInputValue(passMarkTextField).isEmpty();
	    boolean isModerationMarkTextFieldCleared = ElementUtils.getInputValue(moderationMarkTextField).isEmpty();
	    boolean isMaximumModerationTextFieldCleared = ElementUtils.getInputValue(maximumModerationTextField).isEmpty();
	    boolean isVarianceForRevaluationTextFieldCleared = ElementUtils.getInputValue(varianceForRevaluationTextField).isEmpty();
	    boolean isAcademicDurationTextFieldCleared = ElementUtils.getInputValue(academicDurationTextField).isEmpty();
	    boolean isAssessmentDurationTextFieldCleared = ElementUtils.getInputValue(assessmentDurationTextField).isEmpty();
	    boolean isMaximumFailedCreditTextFieldCleared = ElementUtils.getInputValue(maximumFailedCreditTextField).isEmpty();
	    boolean isEnquiryManagerTextFieldCleared = ElementUtils.getInputValue(enquiryManagerTextField).isEmpty();

	    boolean allFieldsCleared = isInstitutionTextFieldCleared &&
	    		isSelectDegreeTextFieldCleared &&
	            isProgramTypeTextFieldCleared &&
	            isProgramIdTextFieldCleared &&
	            isProgramNameTextFieldCleared &&
	            isProgramDescriptionTextFieldCleared &&
	            isProgramDetailsTextFieldCleared &&
	            isOfferingDepartmentTextFieldCleared &&
	            isSanctionedStrengthTextFieldCleared &&
	            isCheckBoxNotSelected &&
	            isPassMarkTextFieldCleared &&
	            isModerationMarkTextFieldCleared &&
	            isMaximumModerationTextFieldCleared &&
	            isVarianceForRevaluationTextFieldCleared &&
	            isAcademicDurationTextFieldCleared &&
	            isAssessmentDurationTextFieldCleared &&
	            isMaximumFailedCreditTextFieldCleared &&
	            isEnquiryManagerTextFieldCleared;

	    return allFieldsCleared;
	}

	public void searchProgramId(String programId) {
		Waiters.waitForElementToBeVisible(searchProgramTextField);
		ElementUtils.clearInputFieldWithJs(searchProgramTextField);
//		ActionsUtils.typeTextWithInterval(searchProgramTextField, programId);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchProgramTextField, programId, 200);
		Waiters.waitForTimeout(1000);
	}

	public void clickOnEdit(String program) {
		WebElement programList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+program+"']/following::button[@id='dropdown-basic']"));
		Waiters.waitForElementToBeVisible(programList);
		Waiters.waitForElementToBeClickable(programList);
		programList.click();
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
		Waiters.waitForTimeout(1000);
	}

	public void clickOnUpdate() {
		Waiters.waitForElementToBeVisible(updateButton);
		Waiters.waitForElementToBeClickable(updateButton);
		updateButton.click();
	}

	public void editEnquiryManager(String emquiryManager) {
		Waiters.waitForElementToBeVisible(enquiryManagerTextField);
		ElementUtils.scrollInToElement(enquiryManagerTextField);
		if(selectedManager.isDisplayed()) {
			Waiters.waitForElementToBeClickable(removeSelectedManager);
			removeSelectedManager.click();
		}
		enquiryManagerTextField.sendKeys(emquiryManager);
		CommonUtils.selectDropDownOptionWithContains(emquiryManager);
	}

	public String verifyActiveStatus(String program) {
		WebElement programList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+program+"']/following::span[@class='status-success']"));
		Waiters.waitForElementToBeVisible(programList);
		return programList.getText();
	}
	
	public String verifyDeactiveStatus(String program) {
		WebElement programList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+program+"']/following::span[@class='status-critical']"));
		Waiters.waitForElementToBeVisible(programList);
		return programList.getText();
	}
	
		public void clickOnAddCurriculamSyllabus() {
		Waiters.waitForElementToBeVisible(addCurriculamSyllabus);
		ElementUtils.scrollInToElement(addCurriculamSyllabus);
		Waiters.waitForElementToBeClickable(addCurriculamSyllabus);
		addCurriculamSyllabus.click();
	}

	public void selectCurriculamSyllabusTitle(String title) {
		Waiters.waitForElementToBeVisible(titleTextField);
		titleTextField.sendKeys(title);
		CommonUtils.selectDropDownOptionWithContains(title);
	}

	public boolean verifyPopupDisappeared() {
		Waiters.waitForElementToBeInvisible(savedSuccessfullyPopUp);
		return !savedSuccessfullyPopUp.isDisplayed();
	}

	public void enterSyllabusName(String syllabusName) {
		Waiters.waitForElementToBeVisible(syllabusNameTextField);
		ElementUtils.clearInputFieldWithJs(syllabusNameTextField);
		syllabusNameRandom = syllabusName+" "+StringUtils.generateRandomString(6);
		syllabusNameTextField.sendKeys(syllabusNameRandom);
	}

	public void uploadSyllabusAttachment() {
		CommonUtils.uploadFile("div.camu-file_dnd input[type=file]", System.getProperty("user.dir")+"/src/test/resources/fileUpload/syllabusPdf.pdf");
	}

	public void selectSyllabusRegulation(String syllabusRegulation) {
		Waiters.waitForElementToBeVisible(regulationTextField);
		ElementUtils.scrollInToElement(regulationTextField);
		Waiters.waitForElementToBeClickable(regulationTextField);
		regulationTextField.click();
		regulationTextField.sendKeys(syllabusRegulation);
		CommonUtils.selectDropDownOption(syllabusRegulation);
	}

	public void clickSyllabusSubmit() {
		Waiters.waitForElementToBeVisible(syllabusSubmitButton);
		Waiters.waitForElementToBeClickable(syllabusSubmitButton);
		syllabusSubmitButton.click();
	}
	
	public void searchAddedSyllabus() {
		Waiters.waitForElementToBeVisible(searchSyllabusTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchSyllabusTextField, syllabusNameRandom, 200);
		Waiters.waitForTimeout(1000);
	}

	public boolean verifyNewSyllabusAdded(String title, String regulation) {
		Waiters.waitForElementToBeVisible(createdSyllabusTitle);
		boolean value = false;
//		System.out.println(createdSyllabusTitle.getText() +" "+ createdSyllabusName.getText() +" "+ createdSyllabusRegulation.getText());
//		System.out.println(title +" "+ syllabusNameRandom +" "+ regulation);
		if (createdSyllabusTitle.getText().equals(title) && createdSyllabusName.getText().equals(syllabusNameRandom)
				&& createdSyllabusRegulation.getText().equals(regulation)) {
			value = true;
		} else {
			value = false;
		}
		return value;
	}

	public void searchSyllabus(String syllabus) {
		Waiters.waitForElementToBeVisible(searchSyllabusTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchSyllabusTextField, syllabus, 200);
		Waiters.waitForTimeout(1000);
	}

	public void clickEditSyllabus(String syllabus) {
		WebElement programList = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+syllabus+"']/following::button[@id='dropdown-basic']"));
		Waiters.waitForElementToBeVisible(programList);
		Waiters.waitForElementToBeClickable(programList);
		programList.click();
	}

	public void deleteSyllabus() {
		Waiters.waitForElementToBeVisible(deleteSyllabusButton);
		Waiters.waitForElementToBeClickable(deleteSyllabusButton);
		deleteSyllabusButton.click();
	}

	public boolean verifyDeleteConfirmationAppears() {
		Waiters.waitForElementToBeVisible(deleteConfirmationPopup);
		return deleteConfirmationPopup.isDisplayed();
	}

	public void clickYesToDelete() {
		Waiters.waitForElementToBeVisible(deleteConfirmationYesButton);
		Waiters.waitForElementToBeClickable(deleteConfirmationYesButton);
		deleteConfirmationYesButton.click();
	}

	public void clickAddToAddNewSyllabusTitle() {
		Waiters.waitForElementToBeVisible(addNewTitleSyllabusButton);
		Waiters.waitForElementToBeClickable(addNewTitleSyllabusButton);
		addNewTitleSyllabusButton.click();
	}

	public boolean verifyNewSyllabusTitle() {
		Waiters.waitForElementToBeVisible(addNewTitleTabHeading);
		return addNewTitleTabHeading.isDisplayed();
	}

	public void enterNewSyllabusTitle(String syllabusTitle) {
		Waiters.waitForElementToBeVisible(newTitleTextField);
		newTitleTextField.sendKeys(syllabusTitle);
	}

	public void clickAddNewTitleSyllabusSubmit() {
		Waiters.waitForElementToBeVisible(addNewSyllabusTitleSubmitButton);
		Waiters.waitForElementToBeClickable(addNewSyllabusTitleSubmitButton);
		addNewSyllabusTitleSubmitButton.click();
	}

	public void enterNewSyllabusTitleRandom() {
		Waiters.waitForElementToBeVisible(newTitleTextField);
		Waiters.waitForElementToBeClickable(newTitleTextField);
		newTitleTextField.click();;
		newSyllabusTitleRandom = "Syllabus - "+StringUtils.generateRandomString(5);
		newTitleTextField.sendKeys(newSyllabusTitleRandom);
	}

	public void searchSelectNewSyllabusTitle() {
		Waiters.waitForElementToBeVisible(titleTextField);
		Waiters.waitForElementToBeClickable(titleTextField);
		titleTextField.click();
		titleTextField.sendKeys(newSyllabusTitleRandom);
		CommonUtils.selectDropDownOptionWithContains(newSyllabusTitleRandom);
	}

	public void clickAddNewTitleSyllabusCancel() {
		Waiters.waitForElementToBeVisible(addNewSyllabusTitleCancelButton);
		Waiters.waitForElementToBeClickable(addNewSyllabusTitleCancelButton);
		addNewSyllabusTitleCancelButton.click();
	}
	
	public String getInstitutionErrorMessage() {
		return institutionFieldErrorMessage.getText();
	}

	public String getDegreeErrorMessage() {
		return degreeFieldErrorMessage.getText();
	}

	public String getProgramTypeErrorMessage() {
		return programTypeFieldErrorMessage.getText();
	}

	public String getProgramIdErrorMessage() {
		return programIDFieldErrorMessage.getText();
	}

	public String getProgramNameErrorMessage() {
		return programNameFieldErrorMessage.getText();
	}
	
	public boolean isProgramTypeAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		ElementUtils.clearInputFieldWithJs(programTypeTextField);
		programTypeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(programTypeTextField).isEmpty();
	}
	
	public boolean isProgramTypeAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		ElementUtils.clearInputFieldWithJs(programTypeTextField);
		programTypeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(programTypeTextField).isEmpty();
	}
	
	public boolean isProgramTypeAcceptNumeric() {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		ElementUtils.clearInputFieldWithJs(programTypeTextField);
		programTypeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(programTypeTextField).isEmpty();
	}
	
	public boolean isProgramTypeAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(programTypeTextField);
		ElementUtils.clearInputFieldWithJs(programTypeTextField);
		programTypeTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(programTypeTextField).isEmpty();
	}
	
	public boolean isProgramIdAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(programIdTextField);
		ElementUtils.clearInputFieldWithJs(programIdTextField);
		programIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(programIdTextField).isEmpty();
	}
	
	public boolean isProgramIdAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(programIdTextField);
		ElementUtils.clearInputFieldWithJs(programIdTextField);
		programIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(programIdTextField).isEmpty();
	}
	
	public boolean isProgramIdAcceptNumeric() {
		Waiters.waitForElementToBeVisible(programIdTextField);
		ElementUtils.clearInputFieldWithJs(programIdTextField);
		programIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(programIdTextField).isEmpty();
	}
	
	public boolean isProgramIdAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(programIdTextField);
		ElementUtils.clearInputFieldWithJs(programIdTextField);
		programIdTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(programIdTextField).isEmpty();
	}
	
	public boolean isProgramNameAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(programNameTextField);
		ElementUtils.clearInputFieldWithJs(programNameTextField);
		programNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(programNameTextField).isEmpty();
	}
	
	public boolean isProgramNameAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(programNameTextField);
		ElementUtils.clearInputFieldWithJs(programNameTextField);
		programNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(programNameTextField).isEmpty();
	}
	
	public boolean isProgramNameAcceptNumeric() {
		Waiters.waitForElementToBeVisible(programNameTextField);
		ElementUtils.clearInputFieldWithJs(programNameTextField);
		programNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(programNameTextField).isEmpty();
	}
	
	public boolean isProgramNameAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(programNameTextField);
		ElementUtils.clearInputFieldWithJs(programNameTextField);
		programNameTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(programNameTextField).isEmpty();
	}
	
	public boolean isProgramDesAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(programDescriptionTextField);
		ElementUtils.clearInputFieldWithJs(programDescriptionTextField);
		programDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(programDescriptionTextField).isEmpty();
	}
	
	public boolean isProgramDesAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(programDescriptionTextField);
		ElementUtils.clearInputFieldWithJs(programDescriptionTextField);
		programDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(programDescriptionTextField).isEmpty();
	}
	
	public boolean isProgramDesAcceptNumeric() {
		Waiters.waitForElementToBeVisible(programDescriptionTextField);
		ElementUtils.clearInputFieldWithJs(programDescriptionTextField);
		programDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(programDescriptionTextField).isEmpty();
	}
	
	public boolean isProgramDesAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(programDescriptionTextField);
		ElementUtils.clearInputFieldWithJs(programDescriptionTextField);
		programDescriptionTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(programDescriptionTextField).isEmpty();
	}
	
	public boolean isProgramDetailAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(programDetailsTextField);
		ElementUtils.clearInputFieldWithJs(programDetailsTextField);
		programDetailsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(programDetailsTextField).isEmpty();
	}
	
	public boolean isProgramDetailAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(programDetailsTextField);
		ElementUtils.clearInputFieldWithJs(programDetailsTextField);
		programDetailsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(programDetailsTextField).isEmpty();
	}
	
	public boolean isProgramDetailAcceptNumeric() {
		Waiters.waitForElementToBeVisible(programDetailsTextField);
		ElementUtils.clearInputFieldWithJs(programDetailsTextField);
		programDetailsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(programDetailsTextField).isEmpty();
	}
	
	public boolean isProgramDetailAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(programDetailsTextField);
		ElementUtils.clearInputFieldWithJs(programDetailsTextField);
		programDetailsTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(programDetailsTextField).isEmpty();
	}
	
	public boolean isOfferDeptAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
		Waiters.waitForElementToBeClickable(offeringDepartmentTextField);
		offeringDepartmentTextField.click();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		offeringDepartmentTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(offeringDepartmentTextField).isEmpty();
	}
	
	public boolean isOfferDeptAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
		offeringDepartmentTextField.click();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		offeringDepartmentTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return !ElementUtils.getInputValue(offeringDepartmentTextField).isEmpty();
	}
	
	public boolean isOfferDeptAcceptNumeric() {
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
		offeringDepartmentTextField.click();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		offeringDepartmentTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 3, 0));
		return !ElementUtils.getInputValue(offeringDepartmentTextField).isEmpty();
	}
	
	public boolean isOfferDeptAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(offeringDepartmentTextField);
		offeringDepartmentTextField.click();
		ElementUtils.clearInputFieldWithJs(offeringDepartmentTextField);
		offeringDepartmentTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 3));
		return !ElementUtils.getInputValue(offeringDepartmentTextField).isEmpty();
	}
	
	public boolean isEnquiryManagerAcceptAlphaNumeric() {
		Waiters.waitForElementToBeVisible(enquiryManagerTextField);
		Waiters.waitForElementToBeClickable(enquiryManagerTextField);
		enquiryManagerTextField.click();
		ElementUtils.clearInputFieldWithJs(enquiryManagerTextField);
		enquiryManagerTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 3, 3));
		return !ElementUtils.getInputValue(enquiryManagerTextField).isEmpty();
	}
	
	public boolean isSanctionedStrengthAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(sanctionedStrengthTextField);
		ElementUtils.clearInputFieldWithJs(sanctionedStrengthTextField);
		sanctionedStrengthTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(sanctionedStrengthTextField).isEmpty();
	}
	
	public boolean isSanctionedStrengthAcceptAlphabets() {
		Waiters.waitForElementToBeVisible(sanctionedStrengthTextField);
		ElementUtils.clearInputFieldWithJs(sanctionedStrengthTextField);
		sanctionedStrengthTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(3, 0, 0));
		return ElementUtils.getInputValue(sanctionedStrengthTextField).isEmpty();
	}
	
	public boolean isSanctionedStrengthAcceptNumeric() {
		Waiters.waitForElementToBeVisible(sanctionedStrengthTextField);
		ElementUtils.clearInputFieldWithJs(sanctionedStrengthTextField);
		sanctionedStrengthTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 1, 0));
		return !ElementUtils.getInputValue(sanctionedStrengthTextField).isEmpty();
	}
	
	public boolean isSanctionedStrengthAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(sanctionedStrengthTextField);
		ElementUtils.clearInputFieldWithJs(sanctionedStrengthTextField);
		sanctionedStrengthTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 1));
		return ElementUtils.getInputValue(sanctionedStrengthTextField).isEmpty();
	}
	
	public boolean isPassMarkAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(passMarkTextField);
		ElementUtils.clearInputFieldWithJs(passMarkTextField);
		passMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(passMarkTextField).isEmpty();
	}
	
	public boolean isPassMarkAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(passMarkTextField);
		ElementUtils.clearInputFieldWithJs(passMarkTextField);
		passMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(passMarkTextField).isEmpty();
	}
	
	public boolean isPassMarkAcceptNumeric() {
		Waiters.waitForElementToBeVisible(passMarkTextField);
		ElementUtils.clearInputFieldWithJs(passMarkTextField);
		passMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(passMarkTextField).isEmpty();
	}
	
	public boolean isPassMarkAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(passMarkTextField);
		ElementUtils.clearInputFieldWithJs(passMarkTextField);
		passMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(passMarkTextField).isEmpty();
	}
	
	public boolean isModerationMarkAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(moderationMarkTextField);
		ElementUtils.clearInputFieldWithJs(moderationMarkTextField);
		moderationMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(moderationMarkTextField).isEmpty();
	}
	
	public boolean isModerationMarkAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(moderationMarkTextField);
		ElementUtils.clearInputFieldWithJs(moderationMarkTextField);
		moderationMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(moderationMarkTextField).isEmpty();
	}
	
	public boolean isModerationMarkAcceptNumeric() {
		Waiters.waitForElementToBeVisible(moderationMarkTextField);
		ElementUtils.clearInputFieldWithJs(moderationMarkTextField);
		moderationMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(moderationMarkTextField).isEmpty();
	}
	
	public boolean isModerationMarkAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(moderationMarkTextField);
		ElementUtils.clearInputFieldWithJs(moderationMarkTextField);
		moderationMarkTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(moderationMarkTextField).isEmpty();
	}
	
	public boolean isMaximumNoCoursesModerationAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(maximumModerationTextField);
		ElementUtils.clearInputFieldWithJs(maximumModerationTextField);
		maximumModerationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(maximumModerationTextField).isEmpty();
	}
	
	public boolean isMaximumNoCoursesModerationAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(maximumModerationTextField);
		ElementUtils.clearInputFieldWithJs(maximumModerationTextField);
		maximumModerationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(maximumModerationTextField).isEmpty();
	}
	
	public boolean isMaximumNoCoursesModerationAcceptNumeric() {
		Waiters.waitForElementToBeVisible(maximumModerationTextField);
		ElementUtils.clearInputFieldWithJs(maximumModerationTextField);
		maximumModerationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(maximumModerationTextField).isEmpty();
	}
	
	public boolean isMaximumNoCoursesModerationAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(maximumModerationTextField);
		ElementUtils.clearInputFieldWithJs(maximumModerationTextField);
		maximumModerationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(maximumModerationTextField).isEmpty();
	}
	
	public boolean isVarianceRevaluationAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(varianceForRevaluationTextField);
		ElementUtils.clearInputFieldWithJs(varianceForRevaluationTextField);
		varianceForRevaluationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(varianceForRevaluationTextField).isEmpty();
	}
	
	public boolean isVarianceRevaluationAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(varianceForRevaluationTextField);
		ElementUtils.clearInputFieldWithJs(varianceForRevaluationTextField);
		varianceForRevaluationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(varianceForRevaluationTextField).isEmpty();
	}
	
	public boolean isVarianceRevaluationAcceptNumeric() {
		Waiters.waitForElementToBeVisible(varianceForRevaluationTextField);
		ElementUtils.clearInputFieldWithJs(varianceForRevaluationTextField);
		varianceForRevaluationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(varianceForRevaluationTextField).isEmpty();
	}
	
	public boolean isVarianceRevaluationAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(varianceForRevaluationTextField);
		ElementUtils.clearInputFieldWithJs(varianceForRevaluationTextField);
		varianceForRevaluationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(varianceForRevaluationTextField).isEmpty();
	}
	
	public boolean isAcademicDurationAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(academicDurationTextField);
		ElementUtils.clearInputFieldWithJs(academicDurationTextField);
		academicDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(academicDurationTextField).isEmpty();
	}
	
	public boolean isAcademicDurationAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(academicDurationTextField);
		ElementUtils.clearInputFieldWithJs(academicDurationTextField);
		academicDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(academicDurationTextField).isEmpty();
	}
	
	public boolean isAcademicDurationAcceptNumeric() {
		Waiters.waitForElementToBeVisible(academicDurationTextField);
		ElementUtils.clearInputFieldWithJs(academicDurationTextField);
		academicDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(academicDurationTextField).isEmpty();
	}
	
	public boolean isAcademicDurationAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(academicDurationTextField);
		ElementUtils.clearInputFieldWithJs(academicDurationTextField);
		academicDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(academicDurationTextField).isEmpty();
	}
	
	public boolean isAssessmentDurationAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(assessmentDurationTextField);
		ElementUtils.clearInputFieldWithJs(assessmentDurationTextField);
		assessmentDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(assessmentDurationTextField).isEmpty();
	}
	
	public boolean isAssessmentDurationAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(assessmentDurationTextField);
		ElementUtils.clearInputFieldWithJs(assessmentDurationTextField);
		assessmentDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(assessmentDurationTextField).isEmpty();
	}
	
	public boolean isAssessmentDurationAcceptNumeric() {
		Waiters.waitForElementToBeVisible(assessmentDurationTextField);
		ElementUtils.clearInputFieldWithJs(assessmentDurationTextField);
		assessmentDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(assessmentDurationTextField).isEmpty();
	}
	
	public boolean isAssessmentDurationAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(assessmentDurationTextField);
		ElementUtils.clearInputFieldWithJs(assessmentDurationTextField);
		assessmentDurationTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(assessmentDurationTextField).isEmpty();
	}
	
	public boolean isMaximumFailedCreditAcceptAlphaChar() {
		Waiters.waitForElementToBeVisible(maximumFailedCreditTextField);
		ElementUtils.clearInputFieldWithJs(maximumFailedCreditTextField);
		maximumFailedCreditTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(4, 0, 4));
		return ElementUtils.getInputValue(maximumFailedCreditTextField).isEmpty();
	}
	
	public boolean isMaximumFailedCreditAcceptAlphabet() {
		Waiters.waitForElementToBeVisible(maximumFailedCreditTextField);
		ElementUtils.clearInputFieldWithJs(maximumFailedCreditTextField);
		maximumFailedCreditTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(2, 0, 0));
		return ElementUtils.getInputValue(maximumFailedCreditTextField).isEmpty();
	}
	
	public boolean isMaximumFailedCreditAcceptNumeric() {
		Waiters.waitForElementToBeVisible(maximumFailedCreditTextField);
		ElementUtils.clearInputFieldWithJs(maximumFailedCreditTextField);
		maximumFailedCreditTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 2, 0));
		return !ElementUtils.getInputValue(maximumFailedCreditTextField).isEmpty();
	}
	
	public boolean isMaximumFailedCreditAcceptSpecialCharacter() {
		Waiters.waitForElementToBeVisible(maximumFailedCreditTextField);
		ElementUtils.clearInputFieldWithJs(maximumFailedCreditTextField);
		maximumFailedCreditTextField.sendKeys(StringUtils.generateRandomStringNumberCharacter(0, 0, 2));
		return ElementUtils.getInputValue(maximumFailedCreditTextField).isEmpty();
	}
	
	public boolean verifyTextFieldsAcceptAlphaNumericValues() {
		boolean verifyAllTextFields = isProgramTypeAcceptAlphaNumeric() && isProgramIdAcceptAlphaNumeric()
				&& isProgramNameAcceptAlphaNumeric() && isProgramDesAcceptAlphaNumeric()
				&& isProgramDetailAcceptAlphaNumeric() && isOfferDeptAcceptAlphaNumeric()
				&& isEnquiryManagerAcceptAlphaNumeric();
		return verifyAllTextFields;
	}

	public boolean verifyNumberFieldsNotAcceptAlphaNumericValues() {
		boolean verifyAllNumericFields = isSanctionedStrengthAcceptAlphaChar() && isPassMarkAcceptAlphaChar()
				&& isModerationMarkAcceptAlphaChar() && isMaximumNoCoursesModerationAcceptAlphaChar()
				&& isVarianceRevaluationAcceptAlphaChar() && isAcademicDurationAcceptAlphaChar()
				&& isAssessmentDurationAcceptAlphaChar() && isMaximumFailedCreditAcceptAlphaChar();
		return verifyAllNumericFields;
	}



	public void verifyTextFieldsAcceptAlphabets() {
		Asserts.assertTrue(isProgramTypeAcceptAlphabet(),"Program type field is empty");
		Asserts.assertTrue(isProgramTypeAcceptAlphabet(),"Program type field is empty");
		Asserts.assertTrue(isProgramIdAcceptAlphabet(),"Program id field is empty");
		Asserts.assertTrue(isProgramNameAcceptAlphabet(),"Program name field is empty");
		Asserts.assertTrue(isProgramDesAcceptAlphabet(),"Program description field is empty");
		Asserts.assertTrue(isProgramDetailAcceptAlphabet(),"Program detail field is empty");
		Asserts.assertTrue(isOfferDeptAcceptAlphabet(),"Offering department field is empty");
	}

	public void verifyTextFieldsAcceptNumeric() {
		Asserts.assertTrue(isProgramTypeAcceptNumeric(),"Program type field is empty");
		Asserts.assertTrue(isProgramIdAcceptNumeric(),"Program id field is empty");
		Asserts.assertTrue(isProgramNameAcceptNumeric(),"Program name field is empty");
		Asserts.assertTrue(isProgramDesAcceptNumeric(),"Program description field is empty");
		Asserts.assertTrue(isProgramDetailAcceptNumeric(),"Program detail field is empty");
		Asserts.assertTrue(isOfferDeptAcceptNumeric(),"Offering department field is empty");
	}

	public void verifyTextFieldsAcceptSpecialCharacter() {
		Asserts.assertTrue(isProgramTypeAcceptSpecialCharacter(),"Program type field is empty");
		Asserts.assertTrue(isProgramIdAcceptSpecialCharacter(),"Program id field is empty");
		Asserts.assertTrue(isProgramNameAcceptSpecialCharacter(),"Program name field is empty");
		Asserts.assertTrue(isProgramDesAcceptSpecialCharacter(),"Program description field is empty");
		Asserts.assertTrue(isProgramDetailAcceptSpecialCharacter(),"Program detail field is empty");
		Asserts.assertTrue(isOfferDeptAcceptSpecialCharacter(),"Offering department fields is empty");
	}

	public void verifyNumericFieldsAcceptNumeric() {
		Asserts.assertTrue(isSanctionedStrengthAcceptNumeric(),"Sanctioned strenght field is empty");
		Asserts.assertTrue(isPassMarkAcceptNumeric(),"Pass mark field is empty");
		Asserts.assertTrue(isModerationMarkAcceptNumeric(),"Moderation mark field is empty");
		Asserts.assertTrue(isMaximumNoCoursesModerationAcceptNumeric(),"Maximum no. of course for moderation field is empty");
		Asserts.assertTrue(isVarianceRevaluationAcceptNumeric(),"Variance for revaluation field is empty");
		Asserts.assertTrue(isAcademicDurationAcceptNumeric(),"Academic duration field is empty");
		Asserts.assertTrue(isAssessmentDurationAcceptNumeric(),"Assessment duration field is empty");
		Asserts.assertTrue(isMaximumFailedCreditAcceptNumeric(),"Maximum failed credit field is empty");
	}

	public void verifyNumericFieldsDoesntAcceptAlphabets() {
		Asserts.assertTrue(isSanctionedStrengthAcceptAlphabets(),"Sanctioned strenght field is not empty");
		Asserts.assertTrue(isPassMarkAcceptAlphabet(),"Pass mark field is not empty");
		Asserts.assertTrue(isModerationMarkAcceptAlphabet(),"Moderation mark field is not empty");
		Asserts.assertTrue(isMaximumNoCoursesModerationAcceptAlphabet(),"Maximum no. of course for moderation field is not empty");
		Asserts.assertTrue(isVarianceRevaluationAcceptAlphabet(),"Variance for revaluation field is not empty");
		Asserts.assertTrue(isAcademicDurationAcceptAlphabet(),"Academic duration field is not empty");
		Asserts.assertTrue(isAssessmentDurationAcceptAlphabet(),"Assessment duration field is not empty");
		Asserts.assertTrue(isMaximumFailedCreditAcceptAlphabet(),"Maximum failed credit field is not empty");
	}

	public void verifyNumericFieldsDoesntAcceptSpecialCharacter() {
		Asserts.assertTrue(isSanctionedStrengthAcceptSpecialCharacter(),"Sanctioned strenght field is not empty");
		Asserts.assertTrue(isPassMarkAcceptSpecialCharacter(),"Pass mark field is not empty");
		Asserts.assertTrue(isModerationMarkAcceptSpecialCharacter(),"Moderation mark field is not empty");
		Asserts.assertTrue(isMaximumNoCoursesModerationAcceptSpecialCharacter(),"Maximum no. of course for moderation field is not empty");
		Asserts.assertTrue(isVarianceRevaluationAcceptSpecialCharacter(),"Variance for revaluation field is not empty");
		Asserts.assertTrue(isAcademicDurationAcceptSpecialCharacter(),"Academic duration field is not empty");
		Asserts.assertTrue(isAssessmentDurationAcceptSpecialCharacter(),"Assessment duration field is not empty");
		Asserts.assertTrue(isMaximumFailedCreditAcceptSpecialCharacter(),"Maximum failed credit field is not empty");
	}

	public void clickOnProgramCancel() {
		Waiters.waitForElementToBeVisible(cancelButton);
		Waiters.waitForElementToBeClickable(cancelButton);
		cancelButton.click();
	}

	public void cancelAlertConfirmation() {
		Alert alert = DriverManager.getDriver().switchTo().alert();
		alert.accept();
	}

	public void attachLargerSizeFile() {
		Waiters.waitForTimeout(1000);
		CommonUtils.uploadFile("div.camu-file_dnd input[type=file]", System.getProperty("user.dir")+"/src/test/resources/fileUpload/largerSizeFile.pdf");
	}

	public void checkVariance() {
		Waiters.waitForElementToBeVisible(varianceCheckbox);
		if(!varianceCheckbox.isSelected()) {
			varianceCheckbox.click();
		}
	}

	public void uncheckVariance() {
		Waiters.waitForElementToBeVisible(varianceCheckbox);
		if(varianceCheckbox.isSelected()) {
			varianceCheckbox.click();
		}
	}

	public void checkPartTime() {
		Waiters.waitForElementToBeVisible(partTimeCheckbox);
		if(!partTimeCheckbox.isSelected()) {
			partTimeCheckbox.click();
		}
	}

	public void uncheckPartTime() {
		Waiters.waitForElementToBeVisible(partTimeCheckbox);
		if(partTimeCheckbox.isSelected()) {
			partTimeCheckbox.click();
		}
	}

	public void removeAllSelectedEnquiryManager() {
//		Waiters.waitForElementToBeVisible(enquiryManagerTextField);
//		ElementUtils.scrollInToElement(enquiryManagerTextField);
		if (!selectedEnquiryManagerList.isEmpty()) {
			for (int i = selectedEnquiryManagerRemoveButton.size() - 1; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ElementUtils.scrollInToElement(selectedEnquiryManagerRemoveButton.get(i));
				selectedEnquiryManagerRemoveButton.get(i).click();
			}
		}
	}

	public boolean verifySelectedEnquiryManagerFieldCleared() {
		return selectedEnquiryManagerList.isEmpty();
	}

	public void verifyInstitutionDegreeFieldCleared() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedInstitution), "Institution field is not cleared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedDegree), "Degree field is not cleared");
	}

	public void verifyInstitutionDegreeFieldDisabled() {
		Asserts.assertTrue(!institutionTextField.isEnabled(), "Institution field can be editable");
		Asserts.assertTrue(!selectDegreeTextField.isEnabled(), "Degree field can be editable");
	}
	
	public void clickOnAddSyllabusCancelCancel() {
		Waiters.waitForElementToBeVisible(syllabusCancelButton);
		Waiters.waitForElementToBeClickable(syllabusCancelButton);
		syllabusCancelButton.click();
	}

	public String verifyEditProgramPage() {
		Waiters.waitForElementToBeVisible(createNewProgramPageHeading);
		return createNewProgramPageHeading.getText();
	}

	public void clickOnAddSyllabusNewTitleCancelCancel() {
		Waiters.waitForElementToBeVisible(syllabusAddNewTitleFieldCancelButton);
		Waiters.waitForElementToBeClickable(syllabusAddNewTitleFieldCancelButton);
		syllabusAddNewTitleFieldCancelButton.click();
	}

	public boolean verifySyllabusAddNewTitleDialogClosed() {
		Waiters.waitForTimeout(2000);
		return !ElementUtils.isNotDisplayed(syllabusAddNewTitleDialog);
//		return !syllabusAddNewTitleDialog.isDisplayed();
	}

	public void searchModuleInGlobalSearchBar(String module) {
//		Waiters.waitForElementToBeVisible(globalSearchBarField);
		Waiters.waitForElementToBeClickable(globalSearchBarField);
		Waiters.waitForTimeout(2000);
//		ElementUtils.printChildElements(searchList);
		globalSearchBarField.click();
//		ElementUtils.forceClickWithJs(globalSearchBarField);
		globalSearchBarField.sendKeys(module);
		CommonUtils.selectDropDownOption(module);
	}

	public String getNodataInfoText() {
		Waiters.waitForElementToBeVisible(noDataField);
		return noDataField.getText();
	}

}
