package StepDefinitions.Camu.Enterprise.TimetableSteps;

import java.io.IOException;

import CAMU.PageObject.Enterprise.TimetablePage.TimetablePagePo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimetableSteps {
	
	@Then("the user can verify they lands on create new configuration page")
	public void the_user_can_verify_they_lands_on_create_new_configuration_page() {
	   TimetablePagePo.getInstance().toVerifyCreateNewPage();
	}
	@When("the user can add the configuration by clicking Add button")
	public void the_user_can_add_the_configuration_by_clicking_add_button() {
	   TimetablePagePo.getInstance().toClickAddButton();
	}
	@When("the user can pass the period name {string}")
	public void the_user_can_pass_the_period_name(String string) {
	    TimetablePagePo.getInstance().toPassPeriodName(string);
	}
	@When("the user can pass the duplicate period name {string}")
	public void the_user_can_pass_the_duplicate_period_name(String string) {
	    TimetablePagePo.getInstance().toPassDuplicatePeriodName(string);
	}
	@When("the user can select the start time {string}")
	public void the_user_can_select_the_start_time(String string) {
	   TimetablePagePo.getInstance().toSelectStartTimeFromTimePicker(string);
	}
	@When("the user can select the end time {string}")
	public void the_user_can_select_the_end_time(String string) {
	   TimetablePagePo.getInstance().toSelectToTimeFromTimePicker(string);
	}
	@When("the user can save the configuration by clicking save button")
	public void the_user_can_save_the_configuration_by_clicking_save_button() {
	   TimetablePagePo.getInstance().toClickSaveButton();
	}
	@Then("the user can view the save confirmation message")
	public void the_user_can_view_the_save_confirmation_message() {
	   TimetablePagePo.getInstance().toVerifySaveConfirmationMessage();
	}
	@Then("the user can verify the duplicate error message")
	public void the_user_can_verify_the_duplicate_error_message() {
	   TimetablePagePo.getInstance().toVerifyDuplicateErrorMessage();
	}
	@When("the user can reset the values by clicking reset button")
	public void the_user_can_reset_the_values_by_clicking_reset_button() {
	    TimetablePagePo.getInstance().toClickResetButton();
	}
	@Then("the user can verify all the values are resetted")
	public void the_user_can_verify_all_the_values_are_resetted() {
	    TimetablePagePo.getInstance().toVerifyAllFieldsAreResetted();
	}
	@When("the user can cancel the details by clicking cancel button")
	public void the_user_can_cancel_the_details_by_clicking_cancel_button() {
	    TimetablePagePo.getInstance().toClickCancelButton();
	}
	@When("the user can search the timetable by passing period name {string}")
	public void the_user_can_search_the_timetable_by_passing_period_name(String string) {
	   TimetablePagePo.getInstance().toSearchThePeriodName(string);
	}
	@Then("the user can view the filtered timetable {string}")
	public void the_user_can_view_the_filtered_timetable(String name) {
	   TimetablePagePo.getInstance().toViewTheFilteredPeriodName(name);
	}
	@Then("the user can edit the timetable configuration by cliking threedot {string}")
	public void the_user_can_edit_the_timetable_configuration_by_cliking_threedot(String string) {
	    TimetablePagePo.getInstance().toClickThreeDot(string);
	}
	@Then("the user can change the status by clicking deactivate or active button")
	public void the_user_can_change_the_status_by_clicking_deactivate_or_active_button() {
	  TimetablePagePo.getInstance().toClickInActiveButton();
	}
	@Then("the user verify the updated confirmation message")
	public void the_user_verify_the_updated_confirmation_message() {
	   TimetablePagePo.getInstance().toVerifyUpdatedConfirmation();
	}
	@When("the user clicks period group button to create new period group")
	public void the_user_clicks_period_group_button_to_create_new_period_group() {
	   TimetablePagePo.getInstance().toClickPeriodGroupButton();
	}
	@When("the user can add new period group by clicking add button")
	public void the_user_can_add_new_period_group_by_clicking_add_button() {
	   TimetablePagePo.getInstance().toClickAddPeriodGroupButton();
	}
	@Then("the user can view the add period group")
	public void the_user_can_view_the_add_period_group() {
	  TimetablePagePo.getInstance().toVerifyAddPeriodGroupScreen();
	}
	@Then("the user can pass and select the institution {string}")
	public void the_user_can_pass_and_select_the_institution(String string) {
	   TimetablePagePo.getInstance().toPassAndSelectInstitutionForNewPeriodGroup(string);
	}
	@Then("the user can pass and select the program {string}")
	public void the_user_can_pass_and_select_the_program(String string) {
	    TimetablePagePo.getInstance().toPassAndSelectProgramForNewPeriodGroup(string);
	}
	@Then("the user can pass and select the course {string}")
	public void the_user_can_pass_and_select_the_course(String string) {
		TimetablePagePo.getInstance().toPassAndSelectCourseForNewPeriodGroup(string); 
	}
	@Then("the user can pass and select the academic year {string}")
	public void the_user_can_pass_and_select_the_academic_year(String string) {
		TimetablePagePo.getInstance().toPassAndSelectAcademicYearForNewPeriodGroup(string);
	}
	@Then("the user can select the periods by enable the checkbox {string}")
	public void the_user_can_select_the_periods_by_enable_the_checkbox(String string) {
		TimetablePagePo.getInstance().toEnableThePeriodsByClickingCheckbox(string);
	}
	@Then("the user can save the period groups by clicking save button")
	public void the_user_can_save_the_period_groups_by_clicking_save_button() {
	   TimetablePagePo.getInstance().toClickSaveButton();
	}
	@Then("the user can verify the duplicate period group error message")
	public void the_user_can_verify_the_duplicate_period_group_error_message() {
	   TimetablePagePo.getInstance().toVerifyPeriodGroupDuplicateErrorMessage();
	}
	@Then("the user can upload the bulk data")
	public void the_user_can_upload_the_bulk_data() throws IOException {
	   TimetablePagePo.getInstance().toUploadBulkData();
	}

	


}
