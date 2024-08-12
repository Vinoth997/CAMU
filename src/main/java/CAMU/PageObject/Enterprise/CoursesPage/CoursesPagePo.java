package CAMU.PageObject.Enterprise.CoursesPage;

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

public class CoursesPagePo {
	private static CoursesPagePo coursePageInstance;
	String randomID;
	String randomName;

	public CoursesPagePo() {

	}

	public static CoursesPagePo getInstance() {
		if (coursePageInstance == null) {
			coursePageInstance = new CoursesPagePo();
		}
		return coursePageInstance;
	}

	@FindBy(xpath = "//p[contains(@class,'text-primary') and text()='Courses']")
	private WebElement verifyCoursePage;

	@FindBy(xpath = "//button[text()='Add' and contains(@class,'btn-primary')]")
	private WebElement addButton;

	@FindBy(xpath = "//p[contains(@class,'text-secondary') and contains(text(),'Create New')]")
	private WebElement verifyNewCoursePage;

	@FindBy(xpath = "//input[@name='SubId']")
	private WebElement subjectID;

	@FindBy(xpath = "//input[@name='SubNa']")
	private WebElement subjectName;

	@FindBy(xpath = "//input[@id='DeptID']")
	private WebElement courseOfferingField;

	@FindBy(xpath = "//div[@class=' css-1nmdiq5-menu']//div//div[@role='option']")
	private List<WebElement> courseOfferingList;

	@FindBy(xpath = "//input[@name='Desc']")
	private WebElement displayCode;

	@FindBy(xpath = "//input[@name='faCrdt']")
	private WebElement faculCredit;

	@FindBy(xpath = "//input[@name='DefCred']")
	private WebElement defaultCredit;

	@FindBy(xpath = "//label[text()='Category']//ancestor::div[@class='hstack gap-2']//span[contains(@class,'text-secondary')]")
	private WebElement categoryPlusButton;

	@FindBy(xpath = "//input[@placeholder='Enter new category']")
	private WebElement categoryName;

	@FindBy(xpath = "//div[@class='modal-content']//button[@type='submit']")
	private WebElement saveButtonForCategory;

	@FindBy(xpath = "//input[@id='CatID']")
	private WebElement categoryField;

	@FindBy(css = ".css-ntphiz")
	private WebElement categorylistoption;

	@FindBy(xpath = "//label[text()='Sub Category']//ancestor::div[@class='hstack gap-2']//span[contains(@class,'text-secondary')]")
	private WebElement subCategoryPlusButton;

	@FindBy(xpath = "//input[@name='SubCtNm']")
	private WebElement subCategoryName;

	@FindBy(xpath = "//input[@id='SubCatID']")
	private WebElement subCategoryField;

	@FindBy(xpath = "//input[@name='CatTyp']")
	private WebElement CategoryType;

	@FindBy(xpath = "//input[@name='strtDt']")
	private WebElement startDate;

	@FindBy(xpath = "//input[@name='endDt']")
	private WebElement endDate;

	@FindBy(xpath = "//input[@name='Cpcty']")
	private WebElement capacity;

	@FindBy(xpath = "//div[contains(@class,'singleValue') and text()='Active']")
	private WebElement activeStatus;

	@FindBy(xpath = "//input[@id='Type']")
	private WebElement courseType;

	@FindBy(xpath = "//input[@name='acdSub' and @type='checkbox']")
	private WebElement nonAcademCourse;

	@FindBy(xpath = "//input[@name='grdCrt' and @type='checkbox']")
	private WebElement excludeFromGraduation;

	@FindBy(xpath = "//input[@name='ntCgpa' and @type='checkbox']")
	private WebElement excludeFromGPA;

	@FindBy(xpath = "//input[@name='SlfStdy' and @type='checkbox']")
	private WebElement selfStudy;

	@FindBy(xpath = "//input[@name='MinQlfGpa']")
	private WebElement minimumQualifyingGpa;

	@FindBy(xpath = "//input[@name='NoArCls']")
	private WebElement noArrearClasses;

	@FindBy(xpath = "//input[@name='rsdncy']")
	private WebElement excludeMiscellaneous;

	@FindBy(xpath = "//input[@id='grdSys']")
	private WebElement gradingSystem;

	@FindBy(xpath = "//input[@name='alpRlt']")
	private WebElement alphabeticalResult;

	@FindBy(xpath = "//input[@name='equlnt']")
	private WebElement equivalentCourse;

	@FindBy(xpath = "//input[@id='eqsub[0].eqSubjNm']")
	private WebElement selectEquivalentCourse;

	@FindBy(xpath = "//textarea[@name='currDesc']")
	private WebElement courseOverviewDesc;

	@FindBy(css = ".camu-file_dnd input:first-of-type")
	private WebElement fileUpload;

	@FindBy(xpath = "//input[@name='hsPreRq']")
	private WebElement preRequisiteCheckbox;

	@FindBy(xpath = "//p[text()='Mandatory Courses']")
	private WebElement mandatoryCoursesText;

	@FindBy(xpath = "//p[text()='Non mandatory courses']")
	private WebElement nonMandatoryCoursesText;

	@FindBy(xpath = "//p[text()='Mandatory Courses']//ancestor::div[contains(@class,'vstack')]//div[contains(@class,'hstack')]//button")
	private WebElement addCourseButtonForManCourse;

	@FindBy(xpath = "//p[text()='Non mandatory courses']//ancestor::div[contains(@class,'vstack')]//div[contains(@class,'hstack')]//button[text()='Add Course']")
	private WebElement addCourseForNonMandatory;

	@FindBy(xpath = "//p[text()='Non mandatory courses']//ancestor::div[contains(@class,'vstack')]//div[contains(@class,'hstack')]//button[text()='Add Group']")
	private WebElement addGroupForNonMandatory;

	@FindBy(xpath = "//input[@id='formPrereq[And][0].subjNm']")
	private WebElement mandatoryAddCourseInputField;

	@FindBy(xpath = "//input[@id='formPrereq[And][0].Grd']")
	private WebElement mandatoryGradeInputField;

	@FindBy(xpath = "//input[@id='formPrereq[OR][0].subjNm']")
	private WebElement nonMandatoryAddCourseInputField;

	@FindBy(xpath = "//input[@id='formPrereq[OR][0].Grd']")
	private WebElement nonMandatoryGradeInputField;

	@FindBy(xpath = "//input[@name='hsCoReq']")
	private WebElement coRequisiteCheckbox;

	@FindBy(xpath = "//input[@id='coReq[0].subjNm']")
	private WebElement coRequisiteCourseInputField;

	@FindBy(xpath = "//input[@name='hasCrsFee']")
	private WebElement enrollmentCourseFeeCheckbox;

	@FindBy(xpath = "(//label[text()='Co-Requisite']//ancestor::div//button[text()='Add Course'])[last()]")
	private WebElement coRequisiteAddCourseButton;

	@FindBy(xpath = "//input[@name='feeTyp']//following-sibling::label")
	private List<WebElement> selectFeeTypeList;

	@FindBy(xpath = "//input[@name='atoXmpt.isXmpt']")
	private WebElement autoExemptCourseCheckbox;

	@FindBy(xpath = "//input[@name='atoXmpt.grdPnt']")
	private WebElement gradePointForAutoExempt;

	@FindBy(xpath = "//input[@id='atoXmpt.xmpSubNm']")
	private WebElement autoExemptCourseField;

	@FindBy(xpath = "//input[@name='atoXmpt.isMnSb']")
	private WebElement mandatoryCourse;

	@FindBy(xpath = "//input[@name='isDfCrs']")
	private WebElement deferCourseCheckbox;

	@FindBy(xpath = "//input[@name='noOfTrm']")
	private WebElement numberOfSemesters;

	@FindBy(xpath = "//input[@name='isLpt']")
	private WebElement lptHoursCheckbox;

	@FindBy(xpath = "//input[@name='lecHrs']")
	private WebElement lectureHours;

	@FindBy(xpath = "//input[@name='prcHrs']")
	private WebElement practicalHours;

	@FindBy(xpath = "//input[@name='tutHrs']")
	private WebElement tutorialHours;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	@FindBy(xpath = "//p[text()='Created successfully.']")
	private WebElement savedConfirmationMessage;
	
	@FindBy(xpath = "//p[text()='Updated successfully.']")
	private WebElement updatedConfirmationMessage;

	@FindBy(xpath = "//p[contains(text(),'Cannot create duplicate')]")
	private WebElement duplicateErrorMessage;

	@FindBy(xpath = "//button[@type='reset']")
	private WebElement resetButton;

	@FindBy(xpath = "//label[text()='Institution']//following-sibling::div//div[contains(@class,'singleValue')]")
	private WebElement selectedInstitution;
	
	@FindBy(xpath = "//label[text()='Offering Department']//following-sibling::div//div[contains(@class,'singleValue')]")
	private WebElement selectedOffDept;
	
	@FindBy(xpath = "//label[text()='Category']//following-sibling::div//div[contains(@class,'singleValue')]")
	private WebElement selectedCategory;
	
	@FindBy(xpath = "//label[text()='Sub Category']//following-sibling::div//div[contains(@class,'singleValue')]")
	private WebElement selectedSubCategory;
	
	@FindBy(xpath = "//label[text()='Type']//following-sibling::div//div[contains(@class,'singleValue')]")
	private WebElement selectedCourseType;
	
	@FindBy(xpath = "//button[@type='button' and text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchBar;
	
//	@FindBy(xpath = "//td[text()='24CS101']//following-sibling::td[@title='more_horiz']//div//div//button[@id='dropdown-basic'])")
//	private WebElement editButton;
	
	@FindBy(xpath = "//a[@text='Edit']")
	private WebElement editButton;
	
	@FindBy(xpath = "//p[text()='Edit Course']")
	private WebElement verifyEditPage; 
	
	@FindBy(xpath = "//input[@name='spltCrt']")
	private WebElement splitCredit;
	
	@FindBy(xpath = "//div[@title='Practical']")
	private WebElement practicalCreditTitle;
	
	@FindBy(xpath = "//div[@title='Theory']")
	private WebElement theoryCreditTitle;
	
	@FindBy(xpath = "//input[@name='spCrdts[0].crdt']")
	private WebElement practicalCreditField;
	
	@FindBy(xpath = "//input[@name='spCrdts[1].crdt']")
	private WebElement theoryCreditFiled;
	
	@FindBy(xpath = "//input[@id='fxBills']")
	private WebElement billItemForFixed;
	
	@FindBy(xpath = "//input[@id='crsBillId']")
	private WebElement billItemForVariable;
	
	public void toVerifyCoursePage() {
		Waiters.waitForElementToBeVisible(verifyCoursePage);
		Asserts.assertTrue(verifyCoursePage.isDisplayed(), "Text is not displayed");
	}

	public void toClickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		addButton.click();
	}

	public void toVerifyCreateCourePage() {
		Waiters.waitForElementToBeVisible(verifyNewCoursePage);
		Asserts.assertTrue(verifyNewCoursePage.isDisplayed(), "Text is not displayed");
	}

	public void toPassSubjectID(String ID) {
		Waiters.waitForElementToBeVisible(subjectID);
		randomID = ID + StringUtils.generateRandomStringNumberCharacter(0, 3, 1);
		subjectID.clear();
		subjectID.sendKeys(randomID);
	}

	public void toPassSubjectName(String name) {
		Waiters.waitForElementToBeVisible(subjectName);
		randomName = name + StringUtils.generateRandomStringNumberCharacter(0, 1, 1);
		subjectName.clear();
		subjectName.sendKeys(randomName);
	}

	public void toSelectCourseOffering(String value) {
		Waiters.waitForElementToBeVisible(courseOfferingField);
		courseOfferingField.sendKeys(value);
		ElementUtils.clickOnOptionFromListUsingJs(courseOfferingList, value);
	}

	public void toPassDisplayCode(String disCode) {
		Waiters.waitForElementToBeVisible(displayCode);
		displayCode.clear();
		displayCode.sendKeys(disCode);
	}

	public void toPassFacultyCredit(String facultyCredit) {
		Waiters.waitForElementToBeVisible(faculCredit);
		faculCredit.clear();
		faculCredit.sendKeys(facultyCredit);
	}

	public void toPassDefaultCredit(String defaulCredit) {
		Waiters.waitForElementToBeVisible(defaultCredit);
		defaultCredit.clear();
		defaultCredit.sendKeys(defaulCredit);
	}

	public void toSelectCategory(String category) {
		Waiters.waitForElementToBeVisible(categoryPlusButton);
//		ElementUtils.forceClickWithJs(categoryPlusButton);
		categoryPlusButton.click();
		Waiters.waitForElementToBeVisible(categoryName);
		String cat = category + StringUtils.generateRandomStringNumberCharacter(1, 2, 0);
		categoryName.sendKeys(cat);
		Waiters.waitForElementToBeVisible(saveButtonForCategory);
		saveButtonForCategory.click();
		Waiters.waitForTimeout(2000);
		Waiters.waitForElementToBeVisible(categoryField);
		Waiters.waitForElementToBeClickable(categoryField);
//		categoryField.click();
		ElementUtils.forceClickWithJs(categoryField);
		categoryField.sendKeys(cat);
		CommonUtils.selectDropDownOption(cat);
	}

	public void toSelectCategoryWithoutCreating(String category) {
		Waiters.waitForElementToBeVisible(categoryField);
		Waiters.waitForElementToBeClickable(categoryField);
		categoryField.click();
		categoryField.sendKeys(category);
		CommonUtils.selectDropDownOption(category);
	}

	public void toSelectSubCategory(String subCategory, String catType) {
		Waiters.waitForElementToBeVisible(subCategoryPlusButton);
		Waiters.waitForElementToBeClickable(subCategoryPlusButton);
		subCategoryPlusButton.click();
		Waiters.waitForElementToBeVisible(subCategoryName);
		String subcat = subCategory + StringUtils.generateRandomStringNumberCharacter(1, 1, 0);
		subCategoryName.sendKeys(subcat);
		Waiters.waitForElementToBeVisible(CategoryType);
		String cateType = catType + StringUtils.generateRandomStringNumberCharacter(1, 1, 0);
		CategoryType.sendKeys(cateType);
		Waiters.waitForElementToBeVisible(saveButtonForCategory);
		Waiters.waitForElementToBeClickable(saveButtonForCategory);
		saveButtonForCategory.click();
		Waiters.waitForElementToBeVisible(subCategoryField);
		Waiters.waitForElementToBeClickable(subCategoryField);
		subCategoryField.click();
//		ElementUtils.forceClickWithJs(subCategoryField);
		subCategoryField.sendKeys(subcat + "-" + cateType);
		System.out.println(subcat + "-" + cateType);
		CommonUtils.selectDropDownOption(subcat + "-" + cateType);
	}

	public void toSelectSubCategoryWithoutCreating(String subCategory) {
		Waiters.waitForElementToBeVisible(subCategoryField);
		Waiters.waitForElementToBeClickable(subCategoryField);
		subCategoryField.click();
		subCategoryField.sendKeys(subCategory);
		CommonUtils.selectDropDownOption(subCategory);
	}

	public void toSelectStartDate(String date) throws InterruptedException {
		Waiters.waitForElementToBeVisible(startDate);
		ElementUtils.scrollInToElement(startDate);
		CommonUtils.dateSelector(startDate, date);
	}

	public void toSelectEndDate(String date) throws InterruptedException {
		Waiters.waitForElementToBeVisible(endDate);
		ElementUtils.scrollInToElement(endDate);
		CommonUtils.dateSelector(endDate, date);
	}

	public void toPassCapacity(String value) {
		Waiters.waitForElementToBeVisible(capacity);
		capacity.clear();
		capacity.sendKeys(value);
	}

	public boolean toSelectStatusAsActive(String status) {
		Waiters.waitForElementToBeVisible(activeStatus);
		return activeStatus.isDisplayed();
	}

	public void toSelectCourseType(String type) {
		Waiters.waitForElementToBeVisible(courseType);
		courseType.sendKeys(type);
		CommonUtils.selectDropDownOption(type);
	}

	public void toEnableNonAcademicCourse() {
		if (!nonAcademCourse.isSelected()) {
			nonAcademCourse.click();
		}
	}

	public void toEnableExcludeFromGraduationCriteria() {
		if (!excludeFromGraduation.isSelected()) {
			excludeFromGraduation.click();
		}
	}

	public void toEnableExcludeFromGPA() {
		if (!excludeFromGPA.isSelected()) {
			excludeFromGPA.click();
		}
	}

	public void toEnableSelfStudy() {
		if (!selfStudy.isSelected()) {
			selfStudy.click();
		}
	}

	public void toVerifyMinimumQualifyingFieldIsDisabled() {
		Waiters.waitForElementToBeVisible(minimumQualifyingGpa);
		Asserts.assertTrue(!minimumQualifyingGpa.isEnabled(), "The minimum qualifying GPA is Enabled");
	}

	public void toVerifyMinimumQualifyingFieldIsEnabled(String value) {
		Waiters.waitForElementToBeVisible(minimumQualifyingGpa);
		Asserts.assertTrue(minimumQualifyingGpa.isEnabled(), "The minimum qualifying GPA is Disabled");
		minimumQualifyingGpa.sendKeys(value.toString());
	}

	public void toEnableNoArrearClasses() {
		if (!noArrearClasses.isSelected()) {
			noArrearClasses.click();
		}
	}

	public void toEnableExcludeMiscellaneous() {
		if (!excludeMiscellaneous.isSelected()) {
			excludeMiscellaneous.click();
		}
	}

	public void toVerifyGradingSystemWasDisabled() {
//		Waiters.waitForElementToBeVisible(gradingSystem);
		Asserts.assertTrue(!gradingSystem.isEnabled(), "grading system is enabled");
	}

	public void toEnableAlphabeticalResult() {
		if (!alphabeticalResult.isSelected()) {
			alphabeticalResult.click();
		}
	}

	public void toVerifyGradingSystemIsEnabledAndSelectValue(String option) {
		Waiters.waitForElementToBeVisible(gradingSystem);
		Asserts.assertTrue(gradingSystem.isEnabled(), "Grading system field is disabled");
		gradingSystem.click();
		gradingSystem.sendKeys(option);
		CommonUtils.selectDropDownOption(option);
	}

	public void toEnableEquivalentCourse() {
		Waiters.waitForElementToBeVisible(equivalentCourse);
		if (!equivalentCourse.isSelected()) {
			equivalentCourse.click();
		}
	}

	public void toSelectEquivalentCourse(String course) {
		Waiters.waitForElementToBeVisible(selectEquivalentCourse);
		selectEquivalentCourse.click();
		selectEquivalentCourse.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void toPassCourseOverviewDescription(String overview) {
		Waiters.waitForElementToBeVisible(courseOverviewDesc);
		ElementUtils.scrollInToElement(courseOverviewDesc);
		courseOverviewDesc.clear();
		courseOverviewDesc.click();
		courseOverviewDesc.sendKeys(overview);
	}

	public void toUploadFileForCourseOverview() {
		Waiters.waitForTimeout(1000);
		CommonUtils.uploadFile(".camu-file_dnd input:first-of-type",
				System.getProperty("user.dir") + "/src/test/resources/fileUpload/syllabusPdf.pdf");
		Waiters.waitForTimeout(6000);
	}

	public void toEnablePreRequisite() {
		if (!preRequisiteCheckbox.isSelected()) {
			preRequisiteCheckbox.click();
		}
	}

	public void toVerifyPreRequisitesEnabled() {
		Asserts.assertTrue(mandatoryCoursesText.isDisplayed(), "Mandatory courses missed");
		Asserts.assertTrue(nonMandatoryCoursesText.isDisplayed(), "Non-Mandatory courses missed");
	}

	public void toClickAddCourseButtonForMandatoryCourse() {
		Waiters.waitForElementToBeVisible(addCourseButtonForManCourse);
		addCourseButtonForManCourse.click();
	}

	public void toPassAndSelectMandatoryAddCourseForPrerequisite(String course) {
		Waiters.waitForElementToBeVisible(mandatoryAddCourseInputField);
		mandatoryAddCourseInputField.click();
		mandatoryAddCourseInputField.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void toPassAndSelectGrade(String grade) {
		Waiters.waitForElementToBeVisible(mandatoryGradeInputField);
		mandatoryGradeInputField.click();
		mandatoryGradeInputField.sendKeys(grade);
		CommonUtils.selectDropDownOption(grade);
	}

	public void toClickAddCourseButtonForNonMandatoryCourse() {
		Waiters.waitForElementToBeVisible(addCourseForNonMandatory);
		addCourseForNonMandatory.click();
	}

	public void toPassAndSelectCourseForNonMandatoryCourse(String course) {
		Waiters.waitForElementToBeVisible(nonMandatoryAddCourseInputField);
		nonMandatoryAddCourseInputField.click();
		nonMandatoryAddCourseInputField.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void toPassAndSelectGradeForNonmandatory(String grade) {
		Waiters.waitForElementToBeVisible(nonMandatoryGradeInputField);
		nonMandatoryGradeInputField.click();
		nonMandatoryGradeInputField.sendKeys(grade);
		CommonUtils.selectDropDownOption(grade);
	}

	public void toEnableCoRequisiteCheckbox() {
		ElementUtils.scrollInToElement(coRequisiteCheckbox);
//		ElementUtils.scrollToElement(coRequisiteCheckbox, "DOWN");
		if (!coRequisiteCheckbox.isSelected()) {
			coRequisiteCheckbox.click();
			Waiters.waitForTimeout(2000);
			coRequisiteAddCourseButton.click();

		}
	}

	public void toPassAndSelectCoRequisiteCourse(String course) {
//		Waiters.waitForElementToBeVisible(coRequisiteAddCourseButton);
//		Waiters.waitForElementToBeClickable(coRequisiteAddCourseButton);
//		coRequisiteAddCourseButton.click();
//		Waiters.waitForElementToBeVisible(coRequisiteCourseInputField);
		Waiters.waitForTimeout(2000);
		coRequisiteCourseInputField.click();
		coRequisiteCourseInputField.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void toEnableEnrollmentCourseFeeCheckbox() {
		if (!enrollmentCourseFeeCheckbox.isSelected()) {
			enrollmentCourseFeeCheckbox.click();
		}
	}

	public void toVerifyTheListOfFeeTypeDisplayed() {
		for (int i = 0; i < selectFeeTypeList.size(); i++) {
			WebElement feeType = selectFeeTypeList.get(i);
			String text = feeType.getText();
			System.out.println(text);
			Asserts.assertTrue(feeType.isDisplayed(), "FeeType is not displayed");
		}
	}

	public void toEnableAutoExemptCourse() {
		if (!autoExemptCourseCheckbox.isSelected())
			autoExemptCourseCheckbox.click();
	}

	public void toPassGradePointForAutoExemptCourse(String grade) {
		Waiters.waitForElementToBeVisible(gradePointForAutoExempt);
		gradePointForAutoExempt.sendKeys(grade.toString());

	}

	public void toPassAutoExemptCourse(String course) {
		Waiters.waitForElementToBeVisible(autoExemptCourseField);
		autoExemptCourseField.click();
		autoExemptCourseField.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void toEnableMandatoryCourse() {
		if (!mandatoryCourse.isSelected()) {
			mandatoryCourse.click();
		}
	}

	public void toVerifyTheGradePointAndAutoExemptCourseDisabled() {
		Asserts.assertTrue(!gradePointForAutoExempt.isEnabled(), "Grade point is Enabled");
		Asserts.assertTrue(!autoExemptCourseField.isEnabled(), "AutoExempt Course Enabled");
	}

	public void toEnableDeferCourseCheckbox() {
		if (!deferCourseCheckbox.isSelected()) {
			deferCourseCheckbox.click();
		}
	}

	public void toPassNumberOfSemesters(String count) {
		Waiters.waitForElementToBeVisible(numberOfSemesters);
		numberOfSemesters.clear();
		numberOfSemesters.sendKeys(count.toString());
	}

	public void toEnableLPTHours() {
		if (!lptHoursCheckbox.isSelected()) {
			lptHoursCheckbox.click();
		}
	}

	public void toPassLectureHours(String hours) {
		Waiters.waitForElementToBeVisible(lectureHours);
		lectureHours.clear();
		lectureHours.sendKeys(hours);
	}

	public void toPassPracticalHours(String hours) {
		Waiters.waitForElementToBeVisible(practicalHours);
		practicalHours.clear();
		practicalHours.sendKeys(hours);
	}

	public void toPassTutorialHours(String hours) {
		Waiters.waitForElementToBeVisible(tutorialHours);
		tutorialHours.clear();
		tutorialHours.sendKeys(hours);
	}

	public void toClickSaveButton() {
		Waiters.waitForElementToBeVisible(saveButton);
		saveButton.click();
	}

	public void toVerifySavedConfirmation() {
		Waiters.waitForElementToBeVisible(savedConfirmationMessage);
		Asserts.assertTrue(savedConfirmationMessage.isDisplayed(), "Can't able to view the message");
	}

	public void toPassDuplicateCoureID(String id) {
		Waiters.waitForElementToBeVisible(subjectID);
		subjectID.sendKeys(id);
	}

	public void toPassDuplicateCoureName(String name) {
		Waiters.waitForElementToBeVisible(subjectName);
		subjectName.clear();
		subjectName.sendKeys(name);
	}

	public void toVerifyDuplicateErrorMessage() {
		Waiters.waitForElementToBeVisible(duplicateErrorMessage);
		Asserts.assertTrue(duplicateErrorMessage.isDisplayed(), "Not duplicates");
	}

	public boolean toVerifyDefaultCreditDoesNotAllowAlphabets() {
		Waiters.waitForElementToBeVisible(defaultCredit);
		ElementUtils.getInputValue(defaultCredit);
		String text = defaultCredit.getText();
		return text.isEmpty();

	}

	public boolean toVerifyFacultyCreditDoesNotAllowAlphabets() {
		Waiters.waitForElementToBeVisible(faculCredit);
		ElementUtils.getInputValue(faculCredit);
		String text = faculCredit.getText();
		return text.isEmpty();

	}

	public void toClickResetButton() {
		Waiters.waitForElementToBeVisible(resetButton);
		resetButton.click();
	}

	public void toVerifyAllTextFieldsAreResetted() {
		Asserts.assertTrue(ElementUtils.getInputValue(subjectID).isEmpty(),"Subject id is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(subjectName).isEmpty(),"Subject name is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(displayCode).isEmpty(),"DisplayCode is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(defaultCredit).isEmpty(),"Default Credit is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(faculCredit).isEmpty(),"Faculty Credit is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(startDate).isEmpty(),"Start date is not resetted");
		Asserts.assertTrue(ElementUtils.getInputValue(endDate).isEmpty(),"End date is not resetted");		
		Asserts.assertTrue(ElementUtils.getInputValue(capacity).isEmpty(),"Capacity is not resetted");		
		Asserts.assertTrue(!nonAcademCourse.isSelected(), "Non Academic course is selected");
		Asserts.assertTrue(!excludeFromGPA.isSelected(), "Exclude From GPA is selected");
		Asserts.assertTrue(!excludeFromGraduation.isSelected(), "Exclude From Graduation is selected");
		Asserts.assertTrue(!selfStudy.isSelected(), "Self Study is selected");
		Asserts.assertTrue(!noArrearClasses.isSelected(), "No Arrear Classes is selected");
		Asserts.assertTrue(!alphabeticalResult.isSelected(), "Alphabetical Result is selected");
		Asserts.assertTrue(!equivalentCourse.isSelected(), "Equivalent Course is selected");
		Asserts.assertTrue(!minimumQualifyingGpa.isEnabled(), "Minimum Qualifying Gpa is enabled");
		Asserts.assertTrue(!excludeMiscellaneous.isSelected(), "Exclude Miscellaneous is selected");
		Asserts.assertTrue(!equivalentCourse.isSelected(), "Equivalent Course checkbox is selected");
		Asserts.assertTrue(ElementUtils.getInputValue(courseOverviewDesc).isEmpty(),"Course Overview Desc is not resetted");
		Asserts.assertTrue(!preRequisiteCheckbox.isSelected(), "PreRequisite Checkbox is enabled");
		Asserts.assertTrue(!coRequisiteCheckbox.isSelected(), "Co-Requisite Checkbox is enabled");
		Asserts.assertTrue(!enrollmentCourseFeeCheckbox.isSelected(), "Enrollment Course Fee Checkbox is enabled");
		Asserts.assertTrue(!gradePointForAutoExempt.isEnabled(), "GradePoint For AutoExempt is enabled");
		Asserts.assertTrue(!autoExemptCourseField.isEnabled(), "Course For AutoExempt is enabled");
		Asserts.assertTrue(!mandatoryCourse.isSelected(), "Mandatory Course is selected");
		Asserts.assertTrue(!deferCourseCheckbox.isSelected(), "Defer Course Checkbox is selected");
		Asserts.assertTrue(!numberOfSemesters.isEnabled(), "Number Of Semesters is enabled");
		Asserts.assertTrue(!lptHoursCheckbox.isSelected(), "lpt Hours Checkbox is selected");
	}
	
	public void toVerifyAllDropdownFieldsAreResetted() {
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedInstitution),"Instituiton is not disappeared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedOffDept), "Offering dept is not disappeared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedCategory), "Category is not disappeared");
		Asserts.assertTrue(ElementUtils.isDisappeared(selectedSubCategory), "Sub category is not disappeared");
		Asserts.assertTrue(ElementUtils.isDisappeared(courseType), "Course type is not disappeared");
	}
	
	public void toClickCancelButton() {
		Waiters.waitForElementToBeVisible(cancelButton);
		cancelButton.click();
	}
	
	public void toVerifySaveButtonIsDisabled() {
		Waiters.waitForElementToBeVisible(saveButton);
		Asserts.assertTrue(!saveButton.isEnabled(), "Save button is enabled");
	}
	
	public void toEditTheSearchedCourse(String course) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[text()='"+course+"']//parent::tr//button[@id='dropdown-basic']"));
		ElementUtils.forceClickWithJs(element);
	}
	
	public void toPassTheValueToTheSearchBar(String course) {
		Waiters.waitForElementToBeVisible(searchBar);
		searchBar.sendKeys(course);
	}
	
	public void toVerifyTheFilteredCourse(String course) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[text()='"+course+"']"));
		Asserts.assertTrue(element.isDisplayed(), "Course is not filtered after searching");
	}
	
	public void toClickEditButton() {
		Waiters.waitForElementToBeVisible(editButton);
		Waiters.waitForElementToBeClickable(editButton);
		editButton.click();
	}
	
	public void toVerifyEditPage() {
		Waiters.waitForElementToBeVisible(verifyEditPage);
		Asserts.assertTrue(verifyEditPage.isDisplayed(), "User is not navigated to edit page");
	}
	
	
	public void toEnableSplitCredit() {
		Waiters.waitForElementToBeVisible(splitCredit);
		if(!splitCredit.isSelected()) {
			splitCredit.click();
		}
	}
	public boolean toVerifySplitCreditIsClickable() {
		Waiters.waitForElementToBeVisible(splitCredit);
		return ElementUtils.isClickable(splitCredit)&& splitCredit.isEnabled();
		}
	
	public void toVerifyTheoryAndPracticalSplitCredit() {
		Waiters.waitForElementToBeVisible(theoryCreditTitle);
		Asserts.assertTrue(theoryCreditTitle.isDisplayed(), "Theory credit is not displayed");
		Waiters.waitForElementToBeVisible(practicalCreditTitle);
		Asserts.assertTrue(practicalCreditTitle.isDisplayed(), "Practical credit is not displayed");
	}
	
	public void toPassPracticalCreditField(String credit) {
		Waiters.waitForElementToBeVisible(practicalCreditField);
		practicalCreditField.sendKeys(credit.toString());
	}
	public void toPassTheoryCreditField(String credit) {
		Waiters.waitForElementToBeVisible(theoryCreditFiled);
		theoryCreditFiled.sendKeys(credit.toString());
	}
	
	public void toEnableFixedFeeType(String feeType) {
		WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@name='feeTyp' and @value='"+feeType+"']"));
		if(!element.isSelected()) {
			element.click();
		}
		
	}
	public void toPassAndSelectfixedBillItem(String billItem) {
		Waiters.waitForElementToBeVisible(billItemForFixed);
		billItemForFixed.sendKeys(billItem);
		CommonUtils.selectDropDownOptionWithContains(billItem);
	}
	
	public void toPassAndSelectBillItemForVariable(String billItem) {
		Waiters.waitForElementToBeVisible(billItemForVariable);
		billItemForVariable.sendKeys(billItem);
		CommonUtils.selectDropDownOption(billItem);
	}
	
	public void toVerifyUpdatedConfirmationMessage() {
		Waiters.waitForElementToBeVisible(updatedConfirmationMessage);
		Asserts.assertTrue(updatedConfirmationMessage.isDisplayed(), "updated problem");
	}
	}


