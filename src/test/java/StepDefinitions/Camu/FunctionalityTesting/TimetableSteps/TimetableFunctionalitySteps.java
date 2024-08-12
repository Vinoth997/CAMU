package StepDefinitions.Camu.FunctionalityTesting.TimetableSteps;

import CAMU.PageObject.FunctionalityTesting.TimetablePage.TimetableFunctionalityPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimetableFunctionalitySteps {
	
	@Then("the user can click the add button to create new academic year")
	public void the_user_can_click_the_add_button_to_create_new_academic_year() {
		TimetableFunctionalityPagePo.getInstance().toClickAddButtonToAddAcYe();
	}
	
	@Then("the user can select the institution using dropdown {string}")
	public void the_user_can_select_the_institution_using_dropdown(String string) {
	   TimetableFunctionalityPagePo.getInstance().toPassAndSelectInstitutionTextfield(string);
	}
	
	@Then("the user can select the start date using date picker {string}")
	public void the_user_can_select_the_start_date_using_date_picker(String string) throws InterruptedException {
	    TimetableFunctionalityPagePo.getInstance().toPassStartDate(string);
	}
	
	@Then("the user can select the end date using date picker {string}")
	public void the_user_can_select_the_end_date_using_date_picker(String string) throws InterruptedException {
	    TimetableFunctionalityPagePo.getInstance().toPassEndDate(string);
	}
	
	@Then("the user can pass the academic code {string}")
	public void the_user_can_pass_the_academic_code(String string) {
	  TimetableFunctionalityPagePo.getInstance().toPassAcCode(string);
	}
	
	@Then("the user can pass the academic name {string}")
	public void the_user_can_pass_the_academic_name(String string) {
		TimetableFunctionalityPagePo.getInstance().toPassAcYear(string);
	}
	
	@Then("the user can save the academic year by clicking save button")
	public void the_user_can_save_the_academic_year_by_clicking_save_button() {
		TimetableFunctionalityPagePo.getInstance().toSaveAcademicYear();
	}
	
	@When("the user can verify the institution selected default in the searchbar {string}")
	public void the_user_can_verify_the_institution_selected_default_in_the_searchbar(String string) {
	    TimetableFunctionalityPagePo.getInstance().toVerifySelectedInstitutionDefault(string);
	}
	
	@When("the user can select the created academic year")
	public void the_user_can_select_the_created_academic_year() {
	   TimetableFunctionalityPagePo.getInstance().toSearchAndSelectAcademicYear();
	}
	
	@When("the user can click the search bar to search the semester configuration")
	public void the_user_can_click_the_search_bar_to_search_the_semester_configuration() {
	   TimetableFunctionalityPagePo.getInstance().toClickSearchButtonSemConfig();
	}
	
	@When("the user refresh the page")
	public void the_user_refresh_the_page() {
		TimetableFunctionalityPagePo.getInstance().pageRefresh();
	}
	
	@When("the user can select the semester from the semester configuration list {string}")
	public void the_user_can_select_the_semester_from_the_semester_configuration_list(String string) {
		TimetableFunctionalityPagePo.getInstance().toSelectSemesterFromSemConfigList(string);
	}
	
	@When("the user can select the semester show count in page {string}")
	public void the_user_can_select_the_semester_show_count_in_page(String string) {
	   TimetableFunctionalityPagePo.getInstance().toSelectPageCount(string);
	}

	@When("the user can click the edit button to edit the semester configuration")
	public void the_user_can_click_the_edit_button_to_edit_the_semester_configuration() {
		TimetableFunctionalityPagePo.getInstance().clickEditOption();
	}
	
	@When("the user verifies {string} panel appears")
	public void the_user_verifies_panel_appears(String title) {
	    Asserts.assertContainsText(TimetableFunctionalityPagePo.getInstance().getSidePanelHeading(), title, "The text "+title+" not found");
	}
	
	@When("the user selects the semester start date between academic year mentioned")
	public void the_user_selects_the_semester_start_date_between_academic_year_mentioned() throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().selectSemesterStartDate();
	}
	
	@When("the user selects the semester end date between academic year mentioned")
	public void the_user_selects_the_semester_end_date_between_academic_year_mentioned() throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().selectSemesterEndDate();
	}
	
	@When("the user verifies start and end date are updated for the semester {string}")
	public void the_user_verifies_start_and_end_date_are_updated_for_the_semester(String semester) {
		TimetableFunctionalityPagePo.getInstance().verifyStartDateUpdatedInSemester(semester);
		TimetableFunctionalityPagePo.getInstance().verifyEndDateUpdatedInSemester(semester);
	}
	
	@Then("the user select the degree {string}")
	public void the_user_select_the_degree(String degree) {
		TimetableFunctionalityPagePo.getInstance().selectDegree(degree);
	}
	
	@Then("the user select the program {string}")
	public void the_user_select_the_program(String program) {
		TimetableFunctionalityPagePo.getInstance().selectProgram(program);
	}
	
	@Then("the user select the academic year {string}")
	public void the_user_select_the_academic_year(String academicYear) {
		TimetableFunctionalityPagePo.getInstance().selectAcademicYear(academicYear);
	}
	
	@Then("the user select the department {string}")
	public void the_user_select_the_department(String department) {
		TimetableFunctionalityPagePo.getInstance().selectDepartment(department);
	}
	
	@Then("the user select the semester\\/year {string}")
	public void the_user_select_the_semester_year(String semYear) {
		TimetableFunctionalityPagePo.getInstance().selectSemYear(semYear);  
	}
	
	@Then("the user select the section {string}")
	public void the_user_select_the_section(String section) {
		TimetableFunctionalityPagePo.getInstance().selectSection(section);
	}
	
	@Then("the user clicks on new staff planning")
	public void the_user_clicks_on_new_staff_planning() {
		TimetableFunctionalityPagePo.getInstance().clickNewStaffPlanning();
	}
	
	@Then("the user clicks on find staff and courses")
	public void the_user_clicks_on_find_staff_and_courses() {
		TimetableFunctionalityPagePo.getInstance().clickFindStaffCourses();
	}
	
	@Then("the user verifies {string} dialog box appears")
	public void the_user_verifies_dialog_box_appears(String dialogBoxHeadingText) {
	    Asserts.assertEqualsText(TimetableFunctionalityPagePo.getInstance().getDialogBoxHeadingText(), dialogBoxHeadingText);
	}

	@Then("the user selects the new staff planning start date {string}")
	public void the_user_selects_the_new_staff_planning_start_date(String startDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().selectStaffPlanningStartDate(startDate);
	}
	
	@Then("the user selects the new staff planning end date {string}")
	public void the_user_selects_the_new_staff_planning_end_date(String endDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().selectStaffPlanningEndDate(endDate);
	}
	
	@Then("the user clicks on create button")
	public void the_user_clicks_on_create_button() {
		TimetableFunctionalityPagePo.getInstance().clickCreate();
	}
	
	@When("the user clicks on save academic plan")
	public void the_user_clicks_on_save_academic_plan() {
		TimetableFunctionalityPagePo.getInstance().clickSaveAcademicPlan();
	}
	
	@When("the user search the newly created semester\\/year")
	public void the_user_search_the_newly_created_semester_year() {
		TimetableFunctionalityPagePo.getInstance().searchNewlyCreatedSemester();
	}
	
	@When("the user search the semester in semester configuration {string}")
	public void the_user_search_the_semester_in_semester_configuration(String semester) {
		TimetableFunctionalityPagePo.getInstance().searchSemesterConfiguration(semester);
	}
	
	@When("the user clicks more option for the semester {string}")
	public void the_user_clicks_more_option_for_the_semester(String semester) {
		TimetableFunctionalityPagePo.getInstance().clickMoreOption(semester);  
	}
	
	@Then("the user selects the staff {string} under staff planning")
	public void the_user_selects_the_staff_under_staff_planning(String staff) {
		TimetableFunctionalityPagePo.getInstance().selectStaff(staff);
	}
	
	@When("the user clicks on edit button for the created staff planning")
	public void the_user_clicks_on_edit_button_for_the_created_staff_planning() {
		TimetableFunctionalityPagePo.getInstance().clickEditStaffPlan();
	}
	
	@Then("the user verifies {string} field displayed")
	public void the_user_verifies_field_displayed(String fieldTitle) {
		Asserts.assertListContains(TimetableFunctionalityPagePo.getInstance().getFieldTitleText(), fieldTitle);
	}
	
	@Then("the user selects the course {string} under staff planning")
	public void the_user_selects_the_course_under_staff_planning(String course) {
		TimetableFunctionalityPagePo.getInstance().selectCourse(course);
	}
	
	@Then("the user clicks on add new courses button")
	public void the_user_clicks_on_add_new_courses_button() {
		TimetableFunctionalityPagePo.getInstance().clickAddNewCourses();
	}
	
	@Then("the user selects the staff type {string} under staff planning")
	public void the_user_selects_the_staff_type_under_staff_planning(String staffType) {
		TimetableFunctionalityPagePo.getInstance().selectStaffType(staffType);
	}
	
	@Then("the user remove the last course field")
	public void the_user_remove_the_last_course_field() {
		TimetableFunctionalityPagePo.getInstance().removeLastCourse();
	}
	
	@When("the user click on remove the course {string}")
	public void the_user_click_on_remove_the_course(String course) {
		TimetableFunctionalityPagePo.getInstance().removeCourse(course);
	}
	
	@Then("the user can see delete the subject confirmation popup appears")
	public void the_user_can_see_delete_the_subject_confirmation_popup_appears() {
	    Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isPopUpDisplayed(), "Dialog not displayed");
	    Asserts.assertEqualsText(TimetableFunctionalityPagePo.getInstance().getPopUpTitleText(), "do you want to delete the subject?");
	}
	
	@Then("the user can see {string} popup dialogbox appears")
	public void the_user_can_see_popup_dialogbox_appears(String dialogboxTitle) {
		Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isPopUpDisplayed(), "Dialog box not displayed");
	    Asserts.assertEqualsText(TimetableFunctionalityPagePo.getInstance().getPopUpTitleText(), dialogboxTitle);
	}
	
	@Then("the user clicks on delete confirmation button")
	public void the_user_clicks_on_delete_confirmation_button() {
		TimetableFunctionalityPagePo.getInstance().clickDeleteButton();
	}
	
	@Then("the user verify the course {string} removed from the staff planning")
	public void the_user_verify_the_course_removed_from_the_staff_planning(String course) {
	    Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isCourseRemoved(course), "Course "+course+" not removed");
	}
	
	@When("the user clicks on plan period button")
	public void the_user_clicks_on_plan_period_button() {
		TimetableFunctionalityPagePo.getInstance().clickPlanPeriod();
	}
	
	@When("the user clicks on update button")
	public void the_user_clicks_on_update_button() {
		TimetableFunctionalityPagePo.getInstance().clickUpdateButton();
	}
	
	@When("the user verifies start date has updated to {string}")
	public void the_user_verifies_start_date_has_updated_to(String startDate) {
	    Asserts.assertEqualsText(TimetableFunctionalityPagePo.getInstance().getUpdatedStartDate(), startDate);
	}
	
	@When("the user verifies end date has updated to {string}")
	public void the_user_verifies_end_date_has_updated_to(String endDate) {
		Asserts.assertEqualsText(TimetableFunctionalityPagePo.getInstance().getUpdatedEndDate(), endDate); 
	}
	
	@Then("the user edit the staff planning start date {string}")
	public void the_user_edit_the_staff_planning_start_date(String startDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().editStartDate(startDate);
	}
	
	@Then("the user edit the new staff planning end date {string}")
	public void the_user_edit_the_new_staff_planning_end_date(String endDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().editEndDate(endDate);
	}
	
	@When("the user clicks on add button")
	public void the_user_clicks_on_add_button() {
		TimetableFunctionalityPagePo.getInstance().clickAddButton(); 
	}
	
	@Then("the user selects the academic timetable start date {string}")
	public void the_user_selects_the_academic_timetable_start_date(String startDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().academicTimetableStartDate(startDate);
	}
	
	@Then("the user selects the academic timetable end date {string}")
	public void the_user_selects_the_academic_timetable_end_date(String endDate) throws InterruptedException {
		TimetableFunctionalityPagePo.getInstance().academicTimetableEndDate(endDate);
	}
	
	@Then("the user clicks on manage button")
	public void the_user_clicks_on_manage_button() {
		TimetableFunctionalityPagePo.getInstance().clickManageButton();
	}
	
	@Then("the user can see timetable table field displayed")
	public void the_user_can_see_timetable_table_field_displayed() {
		Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isTimeTableFieldDisplayed(), "Timetable field is no displayed");
	}

	@Then("the user clicks timetable session at {string} on {string}")
	public void the_user_clicks_timetable_on(String time, String day) {
		TimetableFunctionalityPagePo.getInstance().selectTimeTableSession(time, day);
	}
	
	@Then("the user selects newly created period name")
	public void the_user_selects_newly_created_period_name() {
		TimetableFunctionalityPagePo.getInstance().selectNewlyCreatedPeriodName();
	}
	
	@Then("the user verifies the checkbox finalised has {string}")
	public void the_user_verifies_the_checkbox_finalised_has(String option) {
		switch (option.toLowerCase()) {
		case "checked":
			Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isFinalisedChecked(), "Finalised is unchecked");
			break;
		case "unchecked":
			Asserts.assertTrue(TimetableFunctionalityPagePo.getInstance().isFinalisedUnChecked(), "Finalised is checked");
			break;
		default:
			System.out.println("Invalid data "+option+"");
			break;
		}
	}

}
