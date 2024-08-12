package CAMU.PageObject.FunctionalityTesting.TimetablePage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CAMU.PageObject.Enterprise.TimetablePage.TimetablePagePo;
import Driver.DriverManager;
import Utilities.ActionsUtils;
import Utilities.Asserts;
import Utilities.CommonUtils;
import Utilities.ElementUtils;
import Utilities.StringUtils;
import Utilities.Waiters;

public class TimetableFunctionalityPagePo {

	private static TimetableFunctionalityPagePo timetableFunctionalityInstance;
	String aCode;
	String aName;
	String semStartDate;
	String semEndDate;

	private TimetableFunctionalityPagePo() {

	}

	public static TimetableFunctionalityPagePo getInstance() {
		if (timetableFunctionalityInstance == null) {
			timetableFunctionalityInstance = new TimetableFunctionalityPagePo();
		}
		return timetableFunctionalityInstance;
	}

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addButtonAcyr;

	@FindBy(xpath = "//input[@id='InId']")
	private WebElement institutionTextFiled;

	@FindBy(xpath = "//input[@name='FrDate']")
	private WebElement startDate;

	@FindBy(xpath = "//input[@name='ToDate']")
	private WebElement toDate;

	@FindBy(xpath = "//input[@name='AcCode']")
	private WebElement acCode;

	@FindBy(xpath = "//input[@name='AcyrNm']")
	private WebElement acName;

	@FindBy(xpath = "//button[@type='submit' and text()='Save']")
	private WebElement saveButtonAcYr;

	@FindBy(css = ".search-menu_list")
	private WebElement searchList;

	@FindBy(xpath = "//div[contains(@class,'singleValue') and text()='CBCS - CAMU']")
	private WebElement selectedInstitutionSemConfig;

	@FindBy(xpath = "//label[text()='Academic Year']//parent::div//input")
	private WebElement acYrTextFieldSemConfig;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;

	@FindBy(css = "select.table-filter_option.text-primary")
	private WebElement showCountInPage;

	@FindBy(xpath = "//td[contains(@class,'text-primary') and text()]/parent::tr/td[2]")
	private List<WebElement> tableContents;

	@FindBy(xpath = "//td[contains(@class,'text-primary')]//following-sibling::td//button[@id='dropdown-basic']")
	private List<WebElement> editButtonList;

	@FindBy(xpath = "//button[@type='button' and text()='Next']")
	private WebElement nextPageButton;

	@FindBy(css = ".table-pagination_view .text-secondary")
	private WebElement pageNo;

	@FindBy(xpath = "//input[@name='StDt']")
	private WebElement semesterStartDate;

	@FindBy(xpath = "//a[@role='button' and text()='Edit']")
	private WebElement editOption;

	@FindBy(css = ".offcanvas-header .text-primary")
	private WebElement panelHeading;

	@FindBy(css = "input[name=StDt]")
	private WebElement semesterStartDateTextField;

	@FindBy(css = "input[name=EnDt]")
	private WebElement semesterEndDateTextField;

	@FindBy(css = ".list-form_container p.text-primary")
	private WebElement semesterConfigurationAcademicYear;

	@FindBy(xpath = "//td[contains(@class,'text-primary') and text()]/parent::tr/td[4]")
	private WebElement semesterStartDateList;

	@FindBy(xpath = "//td[contains(@class,'text-primary') and text()]/parent::tr/td[5]")
	private WebElement semesterEndDateList;

	@FindBy(xpath = "//label[text()='Degree']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectDegreeTextField;

	@FindBy(xpath = "//label[text()='Program']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectProgramTextField;

	@FindBy(xpath = "//label[text()='Academic Year']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectAcademicYearTextField;

	@FindBy(xpath = "//label[text()='Department']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectDepartmentTextField;

	@FindBy(xpath = "//label[text()='Semester/Year']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectSemYearTextField;

	@FindBy(xpath = "//label[text()='Section']/following-sibling::div[contains(@class,'select')]//input")
	private WebElement selectSectionTextField;

	@FindBy(xpath = "//button[@type='button' and text()='New Staff Planning']")
	private WebElement newStaffPlanningButton;
	
	@FindBy(xpath = "//button[@type='button' and text()='Find Staff and courses']")
	private WebElement findStaffAndCoursesButton;

	@FindBy(xpath = "//div[@class='modal-content']//div[contains(@class,'modal-title')]")
	private WebElement dialogBoxHeading;

	@FindBy(css = "input[name=StDt]")
	private WebElement staffPlanningStartDateTextField;

	@FindBy(css = "input[name=EnDt]")
	private WebElement staffPlanningEndDateTextField;

	@FindBy(xpath = "//button[@type='submit' and text()='Create']")
	private WebElement createButton;

	@FindBy(css = "div.search input.search-input")
	private WebElement searchSemesterTextField;

	@FindBy(xpath = "(//label[text()='Academic Year']//parent::div//div[contains(@class,'indicatorContainer')])[1]")
	private WebElement clearSelectedAcademicYear;

	@FindBy(xpath = "//input[contains(@id,'StaffId')]")
	private List<WebElement> staffTextFieldList;

	@FindBy(xpath = "//button[@type='submit' and text()='Save academic plan']")
	private WebElement saveAcademicPlanButton;

	@FindBy(xpath = "(//tr[@class='table-list_body ']//td//span[text()='Edit'])[1]")
	private WebElement editStaffPlanButton;

	@FindBy(css = "div.list-form_container div.text-primary")
	private List<WebElement> fieldTitleList;

	@FindBy(xpath = "(//input[contains(@id,'SubjId')])[last()]")
	private WebElement selectCourseTextField;

	@FindBy(xpath = "//button[@type='button' and text()='Add New Courses']")
	private WebElement addNewCoursesButton;

	@FindBy(xpath = "(//input[contains(@id,'stfTyp')])[last()]")
	private WebElement selectStaffTypeTextField;

	@FindBy(xpath = "//div[text()='Update Staff Planning']/ancestor::div[contains(@class,'list-form_container')]//tr//td[6]//div[contains(@class,'singleValue')]")
	private WebElement selectedStaffType;

	@FindBy(xpath = "(//div[text()='Update Staff Planning']/ancestor::div[contains(@class,'list-form_container')]//tr[2]//td[6]//div[contains(@class,'indicatorContainer')])[1]")
	private WebElement selectedStaffTypeClearButton;
	
	@FindBy(xpath = "(//div[text()='Update Staff Planning']/ancestor::div[contains(@class,'list-form_container')]//tr[2]//td[@title='Delete']/span)[last()]")
	private WebElement removeLastCourse;
	
	@FindBy(css = ".modal-dialog .modal-header .modal-title")
	private WebElement popupTitle;
	
	@FindBy(xpath = "//button[@type='button' and text()='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[@type='button' and contains(text(),'Plan period')]")
	private WebElement planPeriodDateButton;
	
	@FindBy(xpath = "//div[@class='modal-content']//button[@type='submit' and text()='Update']")
	private WebElement updateButton;
	
	@FindBy(xpath = "//div[@class='modal-content']//input[@name='FrmDt']")
	private WebElement editStartDateTextField;
	
	@FindBy(xpath = "//div[@class='modal-content']//input[@name='ToDt']")
	private WebElement editEndDateTextField;
	
	@FindBy(xpath = "//button[@type='button' and text()='Add']")
	private WebElement addButton;
	
	@FindBy(css = "input[name=StDt]")
	private WebElement timetableStartDateTextField;
	
	@FindBy(css = "input[name=EnDt]")
	private WebElement timetableEndDateTextField;
	
	@FindBy(xpath = "(//button[@type='button' and text()='Manage'])[1]")
	private WebElement manageButton;
	
	@FindBy(xpath = "//div[contains(@class,'list-form_container')]//p[text()='Timetable']/ancestor::div[contains(@class,'list-form_container')]")
	private WebElement timeTableField;
	
	@FindBy(css = ".rbc-time-view .rbc-header")
	private List<WebElement> timeTableDayList;
	
	@FindBy(css = ".rbc-time-view .rbc-time-slot .rbc-label")
	private List<WebElement> timeTableTimeList;
	
	@FindBy(css = "input[id=PeriodId]")
	private WebElement selectPeriodTextField;
	
	@FindBy(xpath = "//input[@name='TtSt']")
	private WebElement finalisedCheckBox;

	public void toClickAddButtonToAddAcYe() {
		Waiters.waitForElementToBeVisible(addButtonAcyr);
		Waiters.waitForElementToBeClickable(addButtonAcyr);
		addButtonAcyr.click();
//		ElementUtils.printChildElements(searchList);
	}

	public void toPassAndSelectInstitutionTextfield(String ins) {
		Waiters.waitForTimeout(800);
		Waiters.waitForElementToBeVisible(institutionTextFiled);
		institutionTextFiled.sendKeys(ins);
		CommonUtils.selectDropDownOption(ins);
	}

	public void toPassStartDate(String stdt) throws InterruptedException {
		Waiters.waitForElementToBeVisible(startDate);
		CommonUtils.dateSelector(startDate, stdt);
	}

	public void toPassEndDate(String endDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(toDate);
		CommonUtils.dateSelector(toDate, endDate);
	}

	public void toPassAcCode(String code) {
		Waiters.waitForElementToBeVisible(acCode);
		aCode = code + StringUtils.generateRandomString(3);
		ElementUtils.clearInputFieldWithJs(acCode);
		acCode.sendKeys(aCode);
	}

	public void toPassAcYear(String name) {
		Waiters.waitForElementToBeVisible(acName);
		aName = name + StringUtils.generateRandomString(3);
		ElementUtils.clearInputFieldWithJs(acName);
		acName.sendKeys(aName);
	}

	public void toSaveAcademicYear() {
		Waiters.waitForElementToBeVisible(saveButtonAcYr);
		Waiters.waitForElementToBeClickable(saveButtonAcYr);
		saveButtonAcYr.click();
	}

	public void toVerifySelectedInstitutionDefault(String ins) {
		Waiters.waitForTimeout(800);
		Waiters.waitForElementToBeVisible(selectedInstitutionSemConfig);
		Asserts.assertTrue(selectedInstitutionSemConfig.isDisplayed(), "Institution is selected");
		String text = selectedInstitutionSemConfig.getText();
		Asserts.assertEqualsText(ins, text);

	}

	public void toSearchAndSelectAcademicYear() {
		Waiters.waitForTimeout(900);
		Waiters.waitForElementToBeVisible(acYrTextFieldSemConfig);
		if (clearSelectedAcademicYear.isDisplayed()) {
			clearSelectedAcademicYear.click();
		}
		acYrTextFieldSemConfig.clear();
		ElementUtils.typeTextWithIntervalUsingSendKeys(acYrTextFieldSemConfig, aName, 100);
//		System.out.println(aName);
		CommonUtils.selectDropDownOption(aName);

	}

	public void toClickSearchButtonSemConfig() {
		Waiters.waitForElementToBeVisible(searchButton);
		Waiters.waitForElementToBeClickable(searchButton);
		searchButton.click();
	}

	public void pageRefresh() {
		DriverManager.getDriver().navigate().refresh();
	}

	public void toSelectPageCount(String show) {
		Waiters.waitForElementToBeVisible(showCountInPage);
		ElementUtils.selectFromDropDown(showCountInPage, "text", show);
	}

	public void toSelectSemesterFromSemConfigList(String sem) {
		Waiters.waitForTimeout(2000);

		String[] page = pageNo.getText().split(" ");
		int pageCount = Integer.parseInt(page[3]);

//		WebElement element = DriverManager.getDriver().findElement(By.xpath("//td[contains(@class,'text-primary') and text()='"+sem+"']//following-sibling::td//button[@id='dropdown-basic']"));
		for (int i = 0; i <= pageCount; i++) {
			for (int j = 0; j < tableContents.size(); j++) {
//				System.out.println(tableContents.get(j).getText());
				if (tableContents.get(j).getText().equals(sem)) {
					Waiters.waitForElementToBeVisible(editButtonList.get(j));
					ElementUtils.scrollInToElement(editButtonList.get(j));
					Waiters.waitForElementToBeClickable(editButtonList.get(j));
					editButtonList.get(j).click();
					break;
				}
			}
		}
	}

	public void clickEditOption() {
		Waiters.waitForElementToBeVisible(editOption);
		Waiters.waitForElementToBeClickable(editOption);
		editOption.click();
	}

	public String getSidePanelHeading() {
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(panelHeading);
		System.out.println(panelHeading.getText());
		return panelHeading.getText();
	}

	public void selectSemesterStartDate() throws InterruptedException {
		Waiters.waitForElementToBeVisible(semesterStartDateTextField);
		String[] split = semesterConfigurationAcademicYear.getText().split(" ");
		semStartDate = split[3];
		CommonUtils.dateSelector(semesterStartDateTextField, semStartDate);
	}

	public void selectSemesterEndDate() throws InterruptedException {
		Waiters.waitForElementToBeVisible(semesterEndDateTextField);
		String[] split = semesterConfigurationAcademicYear.getText().split(" ");
		semEndDate = split[5];
		CommonUtils.dateSelector(semesterEndDateTextField, semEndDate);
	}

	public void verifyStartDateUpdatedInSemester(String semester) {
		Waiters.waitForTimeout(2000);
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("(//td[contains(@class,'text-primary') and text()]/parent::tr)[1]/td[4]"));
		Asserts.assertEqualsText(element.getText(), semStartDate);
	}

	public void verifyEndDateUpdatedInSemester(String semester) {
		Waiters.waitForTimeout(2000);
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("(//td[contains(@class,'text-primary') and text()]/parent::tr)[1]/td[5]"));
		Asserts.assertEqualsText(element.getText(), semEndDate);
	}

	public void selectDegree(String degree) {
		Waiters.waitForElementToBeVisible(selectDegreeTextField);
		selectDegreeTextField.sendKeys(degree);
		CommonUtils.selectDropDownOptionWithContains(degree);
	}

	public void selectProgram(String program) {
		Waiters.waitForElementToBeVisible(selectProgramTextField);
		selectProgramTextField.sendKeys(program);
		CommonUtils.selectDropDownOptionWithContains(program);
	}

	public void selectAcademicYear(String academicYear) {
		Waiters.waitForElementToBeVisible(selectAcademicYearTextField);
		selectAcademicYearTextField.sendKeys(academicYear);
		CommonUtils.selectDropDownOptionWithContains(academicYear);
	}

	public void selectDepartment(String department) {
		Waiters.waitForElementToBeVisible(selectDepartmentTextField);
		selectDepartmentTextField.sendKeys(department);
		CommonUtils.selectDropDownOptionWithContains(department);
	}

	public void selectSemYear(String semYear) {
		Waiters.waitForElementToBeVisible(selectSemYearTextField);
		selectSemYearTextField.sendKeys(semYear);
		CommonUtils.selectDropDownOptionWithContains(semYear);
	}

	public void selectSection(String section) {
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(selectSectionTextField);
		selectSectionTextField.sendKeys(section);
		CommonUtils.selectDropDownOptionWithContains(section);
	}

	public void clickNewStaffPlanning() {
		Waiters.waitForElementToBeVisible(newStaffPlanningButton);
		Waiters.waitForElementToBeClickable(newStaffPlanningButton);
		newStaffPlanningButton.click();
	}
	
	public void clickFindStaffCourses() {
		Waiters.waitForElementToBeVisible(findStaffAndCoursesButton);
		Waiters.waitForElementToBeClickable(findStaffAndCoursesButton);
		findStaffAndCoursesButton.click();
	}

	public String getDialogBoxHeadingText() {
		Waiters.waitForElementToBeVisible(dialogBoxHeading);
		return dialogBoxHeading.getText();
	}

	public void selectStaffPlanningStartDate(String staffPlanStartDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(staffPlanningStartDateTextField);
		CommonUtils.dateSelector(staffPlanningStartDateTextField, staffPlanStartDate);
	}

	public void selectStaffPlanningEndDate(String staffPlanEndDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(staffPlanningEndDateTextField);
		CommonUtils.dateSelector(staffPlanningEndDateTextField, staffPlanEndDate);
	}

	public void clickCreate() {
		Waiters.waitForElementToBeVisible(createButton);
		Waiters.waitForElementToBeClickable(createButton);
		createButton.click();
	}

	public void clickSaveAcademicPlan() {
		Waiters.waitForElementToBeVisible(saveAcademicPlanButton);
		Waiters.waitForElementToBeClickable(saveAcademicPlanButton);
		saveAcademicPlanButton.click();
	}

	public void searchNewlyCreatedSemester() {
		Waiters.waitForElementToBeVisible(searchSemesterTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchSemesterTextField, aCode, 80);
	}

	public void searchSemesterConfiguration(String semester) {
		Waiters.waitForElementToBeVisible(searchSemesterTextField);
		ElementUtils.typeTextWithIntervalUsingSendKeys(searchSemesterTextField, semester, 80);
	}

	public void clickMoreOption(String semester) {
		Waiters.waitForTimeout(1000);
		WebElement moreOption = DriverManager.getDriver()
				.findElement(By.xpath("(//td[text()='" + semester + "']/parent::tr//button)[1]"));
		Waiters.waitForElementToBeClickable(moreOption);
		moreOption.click();
	}

	public void selectStaff(String staff) {
		Waiters.waitForTimeout(1000);
		for (int i = 0; i < staffTextFieldList.size(); i++) {
			staffTextFieldList.get(i).clear();
			Waiters.waitForElementToBeVisible(staffTextFieldList.get(i));
			ElementUtils.scrollInToElement(staffTextFieldList.get(i));
			staffTextFieldList.get(i).sendKeys(staff);
			CommonUtils.selectDropDownOptionWithContains(staff);
		}

	}

	public void clickEditStaffPlan() {
		Waiters.waitForTimeout(5000);
		Waiters.waitForElementToBeVisible(editStaffPlanButton);
		Waiters.waitForElementToBeClickable(editStaffPlanButton);
		editStaffPlanButton.click();
	}

	public List<String> getFieldTitleText() {
		Waiters.waitForListOfElementsToBeVisible(fieldTitleList);
		String value = null;
		List<String> valueList = new ArrayList<>();
		for (int i = 0; i < fieldTitleList.size(); i++) {
			value = fieldTitleList.get(i).getText();
			System.out.println(value);
			valueList.add(value);
		}
		return valueList;
	}

	public void selectCourse(String course) {
		Waiters.waitForElementToBeVisible(selectCourseTextField);
		ElementUtils.clearInputFieldWithJs(selectCourseTextField);
		selectCourseTextField.sendKeys(course);
		CommonUtils.selectDropDownOptionWithContains(course);
	}

	public void clickAddNewCourses() {
		Waiters.waitForElementToBeVisible(addNewCoursesButton);
		ElementUtils.scrollInToElement(addNewCoursesButton);
		Waiters.waitForElementToBeClickable(addNewCoursesButton);
		addNewCoursesButton.click();
	}

	public void selectStaffType(String staffType) {
		Waiters.waitForElementToBeVisible(selectStaffTypeTextField);
		Waiters.waitForTimeout(800);
		if (selectedStaffType.isDisplayed()) {
			selectedStaffTypeClearButton.click();
		}
		selectStaffTypeTextField.sendKeys(staffType);
		CommonUtils.selectDropDownOptionWithContains(staffType);
	}

	public void removeLastCourse() {
		Waiters.waitForElementToBeVisible(removeLastCourse);
		ElementUtils.scrollInToElement(removeLastCourse);
		Waiters.waitForElementToBeClickable(removeLastCourse);
		removeLastCourse.click();
	}

	public void removeCourse(String course) {
		Waiters.waitForTimeout(1000);
		WebElement removeButton = DriverManager.getDriver().findElement(By.xpath("//div[contains(text(),'"+course+"')]/ancestor::tr/td/span[text()='Delete']"));
		Waiters.waitForElementToBeVisible(removeButton);
		ElementUtils.scrollInToElement(removeButton);
		Waiters.waitForElementToBeClickable(removeButton);
		removeButton.click();
	}

	public boolean isPopUpDisplayed() {
		Waiters.waitForTimeout(1000);
		return popupTitle.isDisplayed();
	}

	public String getPopUpTitleText() {
		Waiters.waitForTimeout(1000);
		return popupTitle.getText();
	}

	public boolean isCourseRemoved(String course) {
		Waiters.waitForTimeout(1000);
		try {
			WebElement courseElement = DriverManager.getDriver().findElement(By.xpath("//tr[@class='table-list_body ']//div[contains(text(),'"+course+"')]"));
			return ElementUtils.isNotDisplayed(courseElement);
		} catch (NoSuchElementException e) {
			return true;
		}
	}

	public void clickDeleteButton() {
		Waiters.waitForElementToBeVisible(deleteButton);
		Waiters.waitForElementToBeClickable(deleteButton);
		deleteButton.click();
	}

	public void clickPlanPeriod() {
		Waiters.waitForElementToBeVisible(planPeriodDateButton);
		ElementUtils.scrollInToElement(planPeriodDateButton);
		Waiters.waitForElementToBeClickable(planPeriodDateButton);
		planPeriodDateButton.click();
	}

	public void clickUpdateButton() {
		Waiters.waitForElementToBeVisible(updateButton);
		Waiters.waitForElementToBeClickable(updateButton);
		updateButton.click();
	}

	public String getUpdatedStartDate() {
		Waiters.waitForElementToBeVisible(planPeriodDateButton);
		String[] updatedStartDate = planPeriodDateButton.getText().split(" ");
		return updatedStartDate[2];
	}

	public String getUpdatedEndDate() {
		Waiters.waitForElementToBeVisible(planPeriodDateButton);
		String[] updatedEndDate = planPeriodDateButton.getText().split(" ");
		return updatedEndDate[4];
	}

	public void editStartDate(String editStartDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(editStartDateTextField);
		CommonUtils.dateSelectorWithForceClick(editStartDateTextField, editStartDate);
	}

	public void editEndDate(String editEndDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(editEndDateTextField);
		CommonUtils.dateSelectorWithForceClick(editEndDateTextField, editEndDate);
	}

	public void clickAddButton() {
		Waiters.waitForElementToBeVisible(addButton);
		Waiters.waitForElementToBeClickable(addButton);
		addButton.click();
	}

	public void academicTimetableStartDate(String startDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(timetableStartDateTextField);
		CommonUtils.dateSelectorWithForceClick(timetableStartDateTextField, startDate);
	}

	public void academicTimetableEndDate(String endDate) throws InterruptedException {
		Waiters.waitForElementToBeVisible(timetableEndDateTextField);
		CommonUtils.dateSelectorWithForceClick(timetableEndDateTextField, endDate);
	}

	public void clickManageButton() {
		Waiters.waitForElementToBeVisible(manageButton);
		Waiters.waitForElementToBeClickable(manageButton);
		manageButton.click();
	}

	public boolean isTimeTableFieldDisplayed() {
		Waiters.waitForTimeout(1000);
		Waiters.waitForElementToBeVisible(timeTableField);
		return timeTableField.isDisplayed();
	}

	public void selectTimeTableSession(String time, String day) {
		Waiters.waitForElementToBeVisible(timeTableField);
		ElementUtils.scrollInToElement(timeTableField);
		
		for (int i = 0; i < timeTableDayList.size(); i++) {
			String dayText = timeTableDayList.get(i).getText();
//			System.out.println(dayText);
			if (dayText.equals(day)) {
				for (int j = 0; j < timeTableTimeList.size(); j++) {
					String timeText = timeTableTimeList.get(j).getText();
//					System.out.println(timeText);
					int dayCount = i + 1;
					int timeCount = j + 1;
					if (timeText.equals(time)) {
						WebElement sessionCell = DriverManager.getDriver()
								.findElement(By.xpath("((((//div[contains(@class,'rbc-day-slot rbc-time-column')])["+dayCount+"]//div[@class='rbc-timeslot-group'])["+timeCount+"])/div[@class='rbc-time-slot'])[1]"));
						Waiters.waitForElementToBeClickable(sessionCell);
//						sessionCell.click();
//						ElementUtils.moveToElementAndClickUsingJs(sessionCell);
						ActionsUtils.moveToElementAndClick(sessionCell);
						break;
					}
				}
				break;
			}
		}
		
//		Waiters.waitForTimeout(5000);
	}

	public void selectNewlyCreatedPeriodName() {
		Waiters.waitForElementToBeVisible(selectPeriodTextField);
		String periodName = null;
		if(TimetablePagePo.getInstance().getCreatedPeriodName()==null) {
			periodName = "V 1:48";
		}else {
			periodName = TimetablePagePo.getInstance().getCreatedPeriodName();
		}
		
		selectPeriodTextField.sendKeys(periodName);
		CommonUtils.selectDropDownOptionWithContains(periodName);
	}

	public boolean isFinalisedChecked() {
		Waiters.waitForElementToBeVisible(finalisedCheckBox);
		return finalisedCheckBox.isSelected();
	}

	public boolean isFinalisedUnChecked() {
		Waiters.waitForElementToBeVisible(finalisedCheckBox);
		return !finalisedCheckBox.isSelected();
	}
}
