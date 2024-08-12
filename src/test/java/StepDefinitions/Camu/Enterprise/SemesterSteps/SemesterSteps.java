package StepDefinitions.Camu.Enterprise.SemesterSteps;

import CAMU.PageObject.Enterprise.SemesterPage.SemesterPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SemesterSteps {
	
	@When("the user verify the page navigated to semester screen")
	public void the_user_verify_the_page_navigated_to_semester_screen() {
	    Asserts.assertEqualsText(SemesterPagePo.getInstance().getSemesterPageTitle(), "Semester/Year");
	}
	
	@When("the user clicks add button to create new semester")
	public void the_user_clicks_add_button_to_create_new_semester() {
		SemesterPagePo.getInstance().clickAddToCreateSemester();
	}
	
	@Then("the user verify the page navigated to create new semester screen")
	public void the_user_verify_the_page_navigated_to_create_new_semester_screen() {
		Asserts.assertEqualsText(SemesterPagePo.getInstance().getNewSemesterPageTitle(), "Create new semester");
	}
	
	@Then("the user can pass the semester code {string}")
	public void the_user_can_pass_the_semester_code(String semesterCode) {
		SemesterPagePo.getInstance().enterSemesterCode(semesterCode);
	}
	
	@Then("the user can pass semester\\/year name {string}")
	public void the_user_can_pass_semester_year_name(String semesterYearName) {
		SemesterPagePo.getInstance().enterSemesterYearName(semesterYearName);
	}
	
	@Then("the user can pass semester description {string}")
	public void the_user_can_pass_semester_description(String semesterDescription) {
		SemesterPagePo.getInstance().enterSemesterDescription(semesterDescription);
	}
	
	@Then("the user can pass the new student group name {string}")
	public void the_user_can_pass_the_new_student_group_name(String newSemesterGroupName) {
		SemesterPagePo.getInstance().enterNewSemesterStudentGroupName(newSemesterGroupName);
	}
	
	@Then("the user click plus button to add the new student group")
	public void the_user_click_plus_button_to_add_the_new_student_group() {
		SemesterPagePo.getInstance().clickPlusButtonToAddNewSemesterStudentGroup();
	}
	
	@Then("the user search and select newly added student group")
	public void the_user_search_and_select_newly_added_student_group() {
		SemesterPagePo.getInstance().searchSelectNewlyCreatedSemesterStudentGroup();
	}
	
	@Then("the user verify that the newly created student group is selected")
	public void the_user_verify_that_the_newly_created_student_group_is_selected() {
		Asserts.assertEqualsText(SemesterPagePo.getInstance().getNewlyCreatedSemesterStudentGroupText(),
				SemesterPagePo.getInstance().newlyCreatedSemesterStudentGroupName());
	}
	
	@When("the user can pass the display order {string}")
	public void the_user_can_pass_the_display_order(String semesterDisplayOrder) {
		SemesterPagePo.getInstance().enterSemesterDisplayOrder(semesterDisplayOrder);
	}
	
	@When("the user checks the send daily homework sms checkbox")
	public void the_user_checks_the_send_daily_homework_sms_checkbox() {
		SemesterPagePo.getInstance().checkSendDailyHomeworkSmsCheckbox();
	}
	
	@When("the user unchecks the send daily homework sms checkbox")
	public void the_user_unchecks_the_send_daily_homework_sms_checkbox() {
		SemesterPagePo.getInstance().uncheckSendDailyHomeworkSmsCheckbox();
	}
	
	@Then("the user can see daily sms timer field appears")
	public void the_user_can_see_daily_sms_timer_field_appears() {
		Asserts.assertTrue(SemesterPagePo.getInstance().isDailySmsTimerFieldAppear(), "Daily sms timer field not appeared");
	}
	
	@Then("the user can see daily sms timer field disappears")
	public void the_user_can_see_daily_sms_timer_field_disappears() {
		Asserts.assertTrue(SemesterPagePo.getInstance().isDailySmsTimerFieldDisappear(), "Daily sms timer field appeared");
	}
	
	@Then("the user sets the daily sms time {string}")
	public void the_user_sets_the_daily_sms_time(String time) {
		SemesterPagePo.getInstance().setDailySmsTime(time);
	}
	
	@When("the user checks initial semester checkbox")
	public void the_user_checks_initial_semester_checkbox() {
		SemesterPagePo.getInstance().checkInitialSemesterCheckbox();
	}
	
	@Then("the user can see terminal semester checkbox is unchecked")
	public void the_user_can_see_terminal_semester_checkbox_is_unchecked() {
		SemesterPagePo.getInstance().verifyTerminalSemesterCheckboxUnchecked();
	}
	
	@When("the user checks terminal semester checkbox")
	public void the_user_checks_terminal_semester_checkbox() {
		SemesterPagePo.getInstance().checkTerminalSemesterCheckbox();
	}
	
	@Then("the user can see initial semester checkbox is unchecked")
	public void the_user_can_see_initial_semester_checkbox_is_unchecked() {
		SemesterPagePo.getInstance().verifyInitialSemesterCheckboxUnchecked();
	}
	
	@When("the user can save the semester by clicking save button")
	public void the_user_can_save_the_semester_by_clicking_save_button() {
		SemesterPagePo.getInstance().clickSaveSemester();
	}
	
	@When("the user can search and verify semester has created successfully")
	public void the_user_can_search_and_verify_semester_has_created_successfully() {
	    Asserts.assertEqualsText(SemesterPagePo.getInstance().searchCreatedNewSemesterAndVerify(), SemesterPagePo.getInstance().getSemesterCode());
	}
	
	@Then("the user enters the semester code {string}")
	public void the_user_enters_the_semester_code(String semesterCode) {
		SemesterPagePo.getInstance().passSemesterCode(semesterCode);
	}
	
	@Then("the user enters the semester\\/year name {string}")
	public void the_user_enters_the_semester_year_name(String semesterName) {
		SemesterPagePo.getInstance().passSemesterName(semesterName);
	}
	
	@Then("the user selects the semester student group {string}")
	public void the_user_selects_the_semester_student_group(String studentGroup) {
		SemesterPagePo.getInstance().passAndSelectStudentGroup(studentGroup);
	}
	
	@When("the user clicks on reset button")
	public void the_user_clicks_on_reset_button() {
		SemesterPagePo.getInstance().clickResetSemester();
	}
	
	@Then("the user verifies all the field are cleared")
	public void the_user_verifies_all_the_field_are_cleared() {
		SemesterPagePo.getInstance().verifyAllFieldsAreCleared();
	}
	
	@When("the user clicks on cancel button")
	public void the_user_clicks_on_cancel_button() {
		SemesterPagePo.getInstance().clickCancelSemester();
	}
	
	@Then("the user verifies semester code can accept alphabets, numeric and special characters")
	public void the_user_verifies_semester_code_can_accept_alphabets_numeric_and_special_characters() {
		SemesterPagePo.getInstance().verifySemesterCodeField();
	}
	
	@Then("the user verifies semester\\/year name can accept alphabets, numeric and special characters")
	public void the_user_verifies_semester_year_name_can_accept_alphabets_numeric_and_special_characters() {
		SemesterPagePo.getInstance().verifySemesterYearNameField();
	}
	
	@Then("the user verifies description can accept alphabets, numeric and special characters")
	public void the_user_verifies_description_can_accept_alphabets_numeric_and_special_characters() {
		SemesterPagePo.getInstance().verifySemesterDescriptionField();
	}
	
	@Then("the user verifies create new student group can accept alphabets, numeric and special characters")
	public void the_user_verifies_create_new_student_group_can_accept_alphabets_numeric_and_special_characters() {
		SemesterPagePo.getInstance().verifyCreateNewStudentGroupField();
	}
	
	@Then("the user verifies display order accept only numbers")
	public void the_user_verifies_display_order_accept_only_numbers() {
		SemesterPagePo.getInstance().verifyDisplayOrderField();
	}
	
	@Then("the user verifies daily sms timer wont accept any values")
	public void the_user_verifies_daily_sms_timer_wont_accept_any_values() {
		SemesterPagePo.getInstance().verifyDailySmsTimerField();
	}
	
	@Then("the user enters the new student group name {string}")
	public void the_user_enters_the_new_student_group_name(String newStudentGroupName) {
		SemesterPagePo.getInstance().passNewStudentGroupName(newStudentGroupName);
	}
	
	@When("the user search semester by semester code {string}")
	public void the_user_search_semester_by_semester_code(String semesterCode) {
		SemesterPagePo.getInstance().searchSemester(semesterCode);
	}
	
	@When("the user can see it navigated to edit semester page")
	public void the_user_can_see_it_navigated_to_edit_semester_page() {
	    Asserts.assertEqualsText(SemesterPagePo.getInstance().verifyNavigatesEditSemesterPage(), "Edit semester");
	}
	
	@When("the user clicks on update button to update the changes")
	public void the_user_clicks_on_update_button_to_update_the_changes() {
		SemesterPagePo.getInstance().clickUpdateButton();
	}
	
	@When("the user pass {string} values in new student group name field")
	public void the_user_pass_values_in_new_student_group_name_field(String value) {
	    switch(value.toLowerCase()) {
	    case "alphabetic":
	    	SemesterPagePo.getInstance().passAlphabetsNewStudentGroupName();
	    	break;
	    case "numerical":
	    	SemesterPagePo.getInstance().passNumericNewStudentGroupName();
	    	break;
	    case "special character":
	    	SemesterPagePo.getInstance().passSpecialCharNewStudentGroupName();
	    	break;
	    default:
	    	System.err.println("Invalid input data");
	    }
	}

}
