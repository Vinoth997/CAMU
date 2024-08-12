package StepDefinitions.Camu.Students.StudentListSteps;

import java.io.IOException;

import CAMU.PageObject.Students.StudentListPage.StudentLeavePagePo;
import Driver.DriverManager;
import Utilities.Asserts;
import Utilities.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentLeaveSteps {
	
	@Given("the user navigates to my camu app")
	public void user_navigates_to_student_portal() throws IOException {
		DriverManager.getDriver().get(CommonUtils.excelGetdata("URL", 7, 1));
	}

	@When("the user enters the student username as {string}")
	public void the_user_enters_the_student_username_as(String studentUsername) {
		StudentLeavePagePo.getInstance().enterStudentUserName(studentUsername);
	}
	
	@When("the user enters the student password as {string}")
	public void the_user_enters_the_student_password_as(String studentPassword) {
		StudentLeavePagePo.getInstance().enterStudentPassword(studentPassword);
	}
	
	@When("the user clicks on add button to add new leave")
	public void the_user_clicks_on_add_button_to_add_new_leave() {
		StudentLeavePagePo.getInstance().clickAddButton();
	}
	
	@When("the user clear the selected leave type")
	public void the_user_clear_the_selected_leave_type() {
		StudentLeavePagePo.getInstance().removeSelectedLeave();
	}
	
	@When("the user selects the user type as {string}")
	public void the_user_selects_the_user_type_as(String leaveType) {
		StudentLeavePagePo.getInstance().selectLeaveType(leaveType);
	}
	
	@When("the user selects the start date {string}")
	public void the_user_selects_the_start_date(String startDate) throws InterruptedException {
		StudentLeavePagePo.getInstance().selectStartDate(startDate);
	}
	
	@When("the user selects the to date {string}")
	public void the_user_selects_the_to_date(String toDate) throws InterruptedException {
		StudentLeavePagePo.getInstance().selectToDate(toDate);
	}
	
	@When("the user enters the reason for leave {string}")
	public void the_user_enters_the_reason_for_leave(String reason) {
		StudentLeavePagePo.getInstance().enterReasonForLeave(reason);
	}
	
	@When("the user clicks on save button to create the leave")
	public void the_user_clicks_on_save_button_to_create_the_leave() {
	    StudentLeavePagePo.getInstance().clickSave();
	}
	
	@When("the user opens a new browser tab")
	public void the_user_opens_a_new_browser_tab() {
		StudentLeavePagePo.getInstance().openNewBrowserTab();
	}
	
	@When("the user switch to new browser tab")
	public void the_user_switch_to_new_tab() {
		StudentLeavePagePo.getInstance().switchToNewTab();
	}
	
	@When("the user selects the start date {string} in leave")
	public void the_user_selects_the_start_date_in_leave(String startDate) throws InterruptedException {
		StudentLeavePagePo.getInstance().startDate(startDate);
	}
	
	@When("the user selects the end date {string} in leave")
	public void the_user_selects_the_end_date_in_leave(String endDate) throws InterruptedException {
		StudentLeavePagePo.getInstance().endDate(endDate);
	}

	@When("the user selects the leave type as {string}")
	public void the_user_selects_the_leave_type_as(String leaveType) {
		StudentLeavePagePo.getInstance().selectLeaveApprovalLeaveType(leaveType);
	}
	
	@When("the user select and filter the leave status by {string}")
	public void the_user_select_and_filter_the_leave_status_by(String status) {
		StudentLeavePagePo.getInstance().selectLeaveApprovalLeaveStatus(status);
	}
	
	@When("the user checks the student by leave type {string} roll no {string}")
	public void the_user_checks_the_student_by_leave_type_roll_no(String leaveType, String rollNo) {
//		StudentLeavePagePo.getInstance().checkStudent(leaveType, rollNo);
	}
	
	@When("the user checks the student by leave date {string} type {string} roll no {string}")
	public void the_user_checks_the_student_by_leave_date_type_roll_no(String date, String leaveType, String rollNo) {
		StudentLeavePagePo.getInstance().checkStudent(date, leaveType, rollNo);
	}
	
	@When("the user click on action dropdown and select {string}")
	public void the_user_click_on_action_dropdown_and_select(String action) {
		StudentLeavePagePo.getInstance().clickActionDropDownAndSelect(action);
	}
	
	@Then("the user can see approve leave for students dialog appears")
	public void the_user_can_see_approve_leave_for_students_dialog_appears() {
	    Asserts.assertTrue(StudentLeavePagePo.getInstance().approveLeaveStudentDialogAppears(), "Approve leave for students dialog not appeared");
	}
	
	@Then("the user switch to previous browser tab")
	public void the_user_switch_to_previous_browser_tab() {
		StudentLeavePagePo.getInstance().switchToPreviousTab();
	}
	
	@Then("the user verifies status for the leave from {string} to {string} changed to {string}")
	public void the_user_verifies_status_for_the_leave_from_to_changed_to(String fromDate, String toDate, String status) {
	    Asserts.assertEqualsText(StudentLeavePagePo.getInstance().getLeaveStatus(fromDate, toDate), status);
	}
}
