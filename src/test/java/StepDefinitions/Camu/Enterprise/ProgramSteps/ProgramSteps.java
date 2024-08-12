package StepDefinitions.Camu.Enterprise.ProgramSteps;

import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramSteps {
	
	@Then("the user verify the page navigated to program screen")
	public void the_user_verify_the_page_navigated_to_program_screen() {
	   Asserts.assertEqualsText(ProgramPagePo.getInstance().getProgramPageHeading(), "Programs");
	}
	
	@When("the user create new program by clicking on Add button")
	public void the_user_create_new_program_by_clicking_on_add_button() {
		ProgramPagePo.getInstance().clickAddButton();
	}
	
	@Then("the user verify the page navigated to create program screen")
	public void the_user_verify_the_page_navigated_to_create_program_screen() {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().getCreateProgramPageHeading(), "Create New Program");
	}
	
	@When("the user can select the institution {string}")
	public void the_user_can_select_the_institution(String institutionName) {
	   ProgramPagePo.getInstance().selectInstitution(institutionName);
	}
	
	@When("the user can select the degree {string}")
	public void the_user_can_select_the_degree(String degree) {
		ProgramPagePo.getInstance().selectDegree(degree); 
	}
	
	@When("the user can select the program type {string}")
	public void the_user_can_select_the_program_type(String programType) {
		ProgramPagePo.getInstance().enterProgramType(programType);
	}
	
	@When("the user can pass the program Id {string}")
	public void the_user_can_pass_the_program_id(String programId) {
		ProgramPagePo.getInstance().enterProgramID(programId);  
	}
	
	@When("the user can pass the program name {string}")
	public void the_user_can_pass_the_program_name(String programName) {
		ProgramPagePo.getInstance().enterProgramName(programName);
	}
	
	@When("the user can pass the program description {string}")
	public void the_user_can_pass_the_program_description(String programDescription) {
		ProgramPagePo.getInstance().enterProgramDescription(programDescription); 
	}
	
	@When("the user can pass the program Details {string}")
	public void the_user_can_pass_the_program_details(String programDetails) {
		ProgramPagePo.getInstance().enterProgramDetails(programDetails);
	}
	
	@When("the user can select the offering department {string}")
	public void the_user_can_select_the_offering_department(String offeringDepartment) {
		ProgramPagePo.getInstance().selectOfferingDepartment(offeringDepartment);
	}
	
	@When("the user can enable the program by clicking on active radio")
	public void the_user_can_enable_the_program_by_clicking_on_active_radio() {
		ProgramPagePo.getInstance().clickActiveToEnable();
	}
	
	@When("the user can pass the sanctioned strength {string}")
	public void the_user_can_pass_the_sanctioned_strength(String sanctionedStrength) {
		ProgramPagePo.getInstance().enterSanctionedStrength(sanctionedStrength);
	}
	
	@When("the user can pass the pass mark {string}")
	public void the_user_can_pass_the_pass_mark(String passMark) {
		ProgramPagePo.getInstance().enterPassMark(passMark); 
	}
	
	@When("the user can pass the moderation mark of the program {string}")
	public void the_user_can_pass_the_moderation_mark_of_the_program(String moderationMark) {
		ProgramPagePo.getInstance().enterModerationMark(moderationMark);
	}
	
	@When("the user can pass the count of maximum number of courses for moderation {string}")
	public void the_user_can_pass_the_count_of_maximum_number_of_courses_for_moderation(String maximumNoCourseModeration) {
		ProgramPagePo.getInstance().enterMaximumNoCoursesForModeration(maximumNoCourseModeration);
	}
	
	@When("the user can pass the variance for revaluation of the program {string}")
	public void the_user_can_pass_the_variance_for_revaluation_of_the_program(String varianceForRevaluation) {
		ProgramPagePo.getInstance().enterVarianceForRevaluation(varianceForRevaluation);
	}
	
	@When("the user can pass the academic duration in years {string}")
	public void the_user_can_pass_the_academic_duration_in_years(String academicDuration) {
		ProgramPagePo.getInstance().enterAcademicDuration(academicDuration);
	}
	
	@When("the user can pass the assessment duration in years {string}")
	public void the_user_can_pass_the_assessment_duration_in_years(String assesmentDuration) {
		ProgramPagePo.getInstance().enterAssesmentDuration(assesmentDuration);
	}
	
	@When("the user can pass the maximum failed credit {string}")
	public void the_user_can_pass_the_maximum_failed_credit(String maximumFailedCredits) {
		ProgramPagePo.getInstance().enterMaximumFailedCredits(maximumFailedCredits);
	}
	
	@When("the user can enter the enquiry manager {string}")
	public void the_user_can_enter_the_enquiry_manager(String enquiryManager) {
		ProgramPagePo.getInstance().selectEnquiryManager(enquiryManager);
	}
	
	@When("the user can save the program by clicking on save button")
	public void the_user_can_save_the_program_by_clicking_on_save_button() {
		ProgramPagePo.getInstance().clickSave();
	}
	
	@Then("the user can see {string} popup notification")
	public void the_user_can_see(String successPopup) {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().getSavedSuccessfullyPopupMessage(), successPopup);
		ProgramPagePo.getInstance().closePopUp();
	}
	
	@When("the user can search and verify program has created successfully")
	public void the_user_can_search_and_verify_program_has_created_successfully() {
	    Asserts.assertEqualsText(ProgramPagePo.getInstance().searchCreatedNewProgramAndVerify(), ProgramPagePo.getInstance().getProgramId());
	}
	
	@When("the user enters the program type {string}")
	public void the_user_enters_the_program_type(String programType) {
		ProgramPagePo.getInstance().enterDuplicateProgramType(programType);
	}
	
	@When("the user enters the program Id {string}")
	public void the_user_enters_the_program_id(String programId) {
		ProgramPagePo.getInstance().enterDuplicateProgramId(programId);
	}
	
	@When("the user enters program name {string}")
	public void the_user_enters_program_name(String programName) {
		ProgramPagePo.getInstance().enterDuplicateProgramName(programName);
	}
	
	@When("the user click reset button")
	public void the_user_click_reset_button() {
		ProgramPagePo.getInstance().clickResetButton();
	}
	
	@Then("the user verifies that all fields are cleared")
	public void the_user_verifies_that_all_fields_are_cleared() {
	    Asserts.assertTrue(ProgramPagePo.getInstance().verifyAllFieldsAreCleared(), "All Fields are not cleared");
	}
	
	@Then("the user search program by program Id {string}")
	public void the_user_search_program_by_program_id(String programId) {
		ProgramPagePo.getInstance().searchProgramId(programId);  
	}
	
	@Then("the user clicks on edit button for {string}")
	public void the_user_clicks_on_edit_button(String program) {
		ProgramPagePo.getInstance().clickOnEdit(program);
	}
	
	@Then("the user can disable the program by clicking on active radio")
	public void the_user_can_disable_the_program_by_clicking_on_active_radio() {
		ProgramPagePo.getInstance().clickActiveToDisable();
	}
	
	
	@When("the user can update the program by clicking on update button")
	public void the_user_can_update_the_program_by_clicking_on_update_button() {
		ProgramPagePo.getInstance().clickOnUpdate();
	}
	
	@Then("the user can edit the enquiry manager {string}")
	public void the_user_can_edit_the_enquiry_manager(String emquiryManager) {
		ProgramPagePo.getInstance().editEnquiryManager(emquiryManager);
	}
	
	@Then("the user can see the program {string} status changed to active")
	public void the_user_can_see_the_program_status_changed_to_active(String program) {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().verifyActiveStatus(program), "Active");
	}

	@Then("the user can see the program {string} status changed to deactive")
	public void the_user_can_see_the_program_status_changed_to_deactive(String program) {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().verifyDeactiveStatus(program), "Deactive");
	}

	@When("the user verifies fields accept alphanumeric values")
	public void the_user_verifies_fields_accept_alphanumeric_values() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifyTextFieldsAcceptAlphaNumericValues());
	}
	
	@When("the user verifies number fields doesnt accept alphanumerical values")
	public void the_user_verifies_number_fields_doesnt_accept_alphanumerical_values() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifyNumberFieldsNotAcceptAlphaNumericValues());
	}
	
	@Then("the user click on add button under curriculum and syllabus")
	public void the_user_click_on_add_button_under_curriculum_and_syllabus() {
		ProgramPagePo.getInstance().clickOnAddCurriculamSyllabus();
	}
	
	@Then("the user selects the syllabus title {string}")
	public void the_user_selects_the_syllabus_title(String title) {
		ProgramPagePo.getInstance().selectCurriculamSyllabusTitle(title);
	}
	
	@Then("the user can see the popup {string}")
	public void the_user_can_see_the_popup(String popUpText) {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().getSavedSuccessfullyPopupMessage(), popUpText); 
	}
	
	@Then("the user verifies that the popup has disappeared")
	public void the_user_confirms_that_popup_disappears() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifyPopupDisappeared(), "Popup notification has not disappeared");
	}
	
	@Then("the user enters the syllabus name {string}")
	public void the_user_enters_the_syllabus_name(String syllabusName) {
		ProgramPagePo.getInstance().enterSyllabusName(syllabusName);
	}
	
	@Then("the user uploads the attachment for syllabus")
	public void the_user_uploads_the_attachment_for_syllabus() {
		ProgramPagePo.getInstance().uploadSyllabusAttachment(); 
	}
	
	@Then("the user selects the regulation {string} for the syllabus")
	public void the_user_selects_the_regulation_for_the_syllabus(String syllabusRegulation) {
		ProgramPagePo.getInstance().selectSyllabusRegulation(syllabusRegulation); 
	}
	
	@When("the user clicks submit button to save the syllabus")
	public void the_user_clicks_submit_button_to_save_the_syllabus() {
		ProgramPagePo.getInstance().clickSyllabusSubmit(); 
	}
	
	@Then("the user can see syllabus title {string}, name and regulation {string} added successfully")
	public void the_user_can_see_syllabus_title_name_and_regulation_added_successfully(String title, String regulation) {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifyNewSyllabusAdded(title, regulation));
	}
	
	@When("the user search the newly added syllabus")
	public void the_user_search_the_newly_added_syllabus() {
		ProgramPagePo.getInstance().searchAddedSyllabus(); 
	}
	
	@Then("the user search the syllabus by title {string}")
	public void the_user_search_the_syllabus_by_title(String syllabus) {
		ProgramPagePo.getInstance().searchSyllabus(syllabus);
	}
	
	@Then("the user clicks on edit button for syllabus {string}")
	public void the_user_clicks_on_edit_button_for_syllabus(String syllabus) {
		ProgramPagePo.getInstance().clickEditSyllabus(syllabus);
	}
	
	@When("the user clicks on delete syllabus option")
	public void the_user_clicks_on_delete_syllabus_option() {
		ProgramPagePo.getInstance().deleteSyllabus();
	}
	
	@Then("the user can see delete confirmation popup appears")
	public void the_user_can_see_delete_confirmation_popup_appears() {
		ProgramPagePo.getInstance().verifyDeleteConfirmationAppears();
	}
	
	@Then("the user clicks on yes to delete added syllabus")
	public void the_user_clicks_on_yes_to_delete_added_syllabus() {
		ProgramPagePo.getInstance().clickYesToDelete();
	}
	
	@When("the user clicks add buton to add new title for syllabus")
	public void the_user_clicks_add_buton_to_add_new_title_for_syllabus() {
		ProgramPagePo.getInstance().clickAddToAddNewSyllabusTitle();
	}
	
	@Then("the user can see add new title tab appears")
	public void the_user_can_see_add_new_title_tab_appears() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifyNewSyllabusTitle());
	}
	
	@Then("the user enters the syllabus title {string}")
	public void the_user_enters_the_syllabus_title(String syllabusTitle) {
		ProgramPagePo.getInstance().enterNewSyllabusTitle(syllabusTitle);
	}
	
	@When("the user clicks on submit button to add new syllabus title")
	public void the_user_clicks_on_submit_button_to_add_new_syllabus_title() {
		ProgramPagePo.getInstance().clickAddNewTitleSyllabusSubmit();
	}
	
	@When("the user enters the new syllabus title")
	public void the_user_enters_the_new_syllabus_title() {
		ProgramPagePo.getInstance().enterNewSyllabusTitleRandom();
	}
	
	@Then("the user can search and select the new syllabus title")
	public void the_user_can_search_and_select_the_new_syllabus_title() {
		ProgramPagePo.getInstance().searchSelectNewSyllabusTitle();
	}
	
	@Then("the user clicks on cancel button to close add new title")
	public void the_user_clicks_on_cancel_button_to_close_add_new_title() {
		ProgramPagePo.getInstance().clickAddNewTitleSyllabusCancel();
	}
	
	@Then("the user can see {string} error message under {string} field")
	public void the_user_can_see_error_message_under_field(String errorMessage, String fieldName) {
		switch (fieldName.toLowerCase()) {
		case "institution":
			Asserts.assertEqualsText(ProgramPagePo.getInstance().getInstitutionErrorMessage(), errorMessage); 
			break;
		case "degree":
			Asserts.assertEqualsText(ProgramPagePo.getInstance().getDegreeErrorMessage(), errorMessage); 
			break;
		case "program type":
			Asserts.assertEqualsText(ProgramPagePo.getInstance().getProgramTypeErrorMessage(), errorMessage);
			break;
		case "program id":
			Asserts.assertEqualsText(ProgramPagePo.getInstance().getProgramIdErrorMessage(), errorMessage);
			break;
		case "program name":
			Asserts.assertEqualsText(ProgramPagePo.getInstance().getProgramNameErrorMessage(), errorMessage);
			break;
		default:
			System.err.println("Invalid Field Name "+fieldName+"");
			break;
		}
	}
	
	@When("the user verifies text fields accept {string} values")
	public void the_user_verifies_text_fields_accept_values(String values) {
		switch (values.toLowerCase()) {
		case "alphabet":
			ProgramPagePo.getInstance().verifyTextFieldsAcceptAlphabets();
			break;
		case "numeric":
			ProgramPagePo.getInstance().verifyTextFieldsAcceptNumeric();
			break;
		case "special character":
			ProgramPagePo.getInstance().verifyTextFieldsAcceptSpecialCharacter();
			break;
		default:
			System.err.println("Invalid value "+values+"");
			break;
		}
	}
	
	@When("the user verifies number fields accept {string} values")
	public void the_user_verifies_number_fields_accept_values(String values) {
		switch (values.toLowerCase()) {
		case "numeric":
			ProgramPagePo.getInstance().verifyNumericFieldsAcceptNumeric();
			break;
		default:
			System.err.println("Invalid value "+values+"");
			break;
		}
	}
	
	@When("the user verifies number fields doesnt accept {string} values")
	public void the_user_verifies_number_fields_doesnt_accept_values(String values) {
		switch (values.toLowerCase()) {
		case "alphabet":
			ProgramPagePo.getInstance().verifyNumericFieldsDoesntAcceptAlphabets();
			break;
		case "special character":
			ProgramPagePo.getInstance().verifyNumericFieldsDoesntAcceptSpecialCharacter();
			break;
		default:
			System.err.println("Invalid value "+values+"");
			break;
		}
	}
	
	@When("the user can cancel the changes by clicking cancel button")
	public void the_user_can_cancel_the_changes_by_clicking_cancel_button() {
		ProgramPagePo.getInstance().clickOnProgramCancel();  
	}
	
	@When("the system will ask the confirmation message to cancel")
	public void the_system_will_ask_the_confirmation_message_to_cancel() {
		ProgramPagePo.getInstance().cancelAlertConfirmation();
	}
	
	@When("the user attach a file more than {int} MB")
	public void the_user_attach_a_file_more_than_mb(Integer int1) {
		ProgramPagePo.getInstance().attachLargerSizeFile();
	}
	
	@Then("the user can able to check variance checkbox")
	public void the_user_can_able_to_check_variance_checkbox() {
		ProgramPagePo.getInstance().checkVariance(); 
	}
	
	@Then("the user can able to uncheck variance checkbox")
	public void the_user_can_able_to_uncheck_variance_checkbox() {
		ProgramPagePo.getInstance().uncheckVariance();
	}
	
	@Then("the user can able to check part time checkbox")
	public void the_user_can_able_to_check_part_time_checkbox() {
		ProgramPagePo.getInstance().checkPartTime();
	}
	
	@Then("the user can able to uncheck part time checkbox")
	public void the_user_can_able_to_uncheck_part_time_checkbox() {
		ProgramPagePo.getInstance().uncheckPartTime();
	}
	
	@Then("the user remove the selected enquiry manager")
	public void the_user_remove_the_selected_enquiry_manager() {
	    ProgramPagePo.getInstance().removeAllSelectedEnquiryManager();
	}
	
	@Then("the user can verify enter enquiry manager name field is cleared")
	public void the_user_can_verify_enter_enquiry_manager_name_field_is_cleared() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifySelectedEnquiryManagerFieldCleared(),"Enter enquiry manager name field is not cleared");
	}
	
	@Then("the user verifies institution and degree fields are cleared")
	public void the_user_verifies_institution_and_degree_fields_are_cleared() {
		ProgramPagePo.getInstance().verifyInstitutionDegreeFieldCleared();
	}
	
	@Then("the user verifies institution and degree fields are disabled")
	public void the_user_verifies_institution_and_degree_fields_are_disabled() {
		ProgramPagePo.getInstance().verifyInstitutionDegreeFieldDisabled();
	}
	
	@When("the user can cancel the add syllabus by clicking cancel button")
	public void the_user_can_cancel_the_add_syllabus_by_clicking_cancel_button() {
		ProgramPagePo.getInstance().clickOnAddSyllabusCancelCancel();
	}
	
	@Then("the user verifies it navigates to edit program page")
	public void the_user_verifies_it_navigates_to_edit_program_page() {
		Asserts.assertEqualsText(ProgramPagePo.getInstance().verifyEditProgramPage(), "Edit Program");
	}
	
	@When("the user clicks on cancel button on add new title")
	public void the_user_clicks_on_cancel_button_on_add_new_title() {
		ProgramPagePo.getInstance().clickOnAddSyllabusNewTitleCancelCancel();
	}
	
	@Then("the user verifies it closed add new title dialog and remains in add new title main")
	public void the_user_verifies_it_closed_add_new_title_dialog_and_remains_in_add_new_title_main() {
	    
	}
	
	@When("the user verifies add new title dialog is closed")
	public void the_user_verifies_add_new_title_dialog_is_closed() {
		Asserts.assertTrue(ProgramPagePo.getInstance().verifySyllabusAddNewTitleDialogClosed(),"Add new title dialog is not closed");
	}
	
	@Then("the user search and select {string} in globar search bar")
	public void the_user_search_and_select_in_globar_search_bar(String module) {
		ProgramPagePo.getInstance().searchModuleInGlobalSearchBar(module);
	}
	
	@Then("the user verifies {string} information")
	public void the_user_verifies_information(String information) {
	    Asserts.assertEqualsText(ProgramPagePo.getInstance().getNodataInfoText(), information);
	}

}
