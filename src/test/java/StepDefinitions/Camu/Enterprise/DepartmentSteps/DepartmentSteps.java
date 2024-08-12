package StepDefinitions.Camu.Enterprise.DepartmentSteps;

import CAMU.PageObject.Enterprise.DepartmentPage.DepartmentPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DepartmentSteps {
	
	@Then("the user verify the page navigated to department screen")
	public void the_user_verify_the_page_navigated_to_department_screen() {
	   Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyDepartmentPage());
	}
	@When("the user create new department by clicking on Add button")
	public void the_user_create_new_department_by_clicking_on_add_button() {
	   DepartmentPagePo.getInstance().toClickAddButton();
	}
	@Then("the user verify the page navigated to create department screen")
	public void the_user_verify_the_page_navigated_to_create_department_screen() {
	   Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyCreateDepartment());
	}
	
	@When("the user can pass the department code {string}")
	public void the_user_can_pass_the_department_code(String string) {
	   DepartmentPagePo.getInstance().toPassDepartmentCode(string);
	}
	
	@When("the user can pass the duplicate department code {string}")
	public void the_user_can_pass_the_duplicate_department_code(String code) {
	   DepartmentPagePo.getInstance().toPassDeptCode(code);
	}
	
	@When("the user can pass the department name {string}")
	public void the_user_can_pass_the_department_name(String string) {
	    DepartmentPagePo.getInstance().toPassDepartmentName(string);
	}
	
	@When("the user can pass the duplicate department name {string}")
	public void the_user_can_pass_the_duplicate_department_name(String name) {
	    DepartmentPagePo.getInstance().toPassDeptName(name);
	}
	
	@When("the user can pass the department description {string}")
	public void the_user_can_pass_the_department_description(String string) {
	    DepartmentPagePo.getInstance().toPassDepartmentDescription(string);
	}
	@When("the user can verify the sanctioned strength allow alphabets {string}")
	public void the_user_can_verify_the_sanctioned_strength_allow_alphabets(String string) {
	   DepartmentPagePo.getInstance().toPassSanctionedStrength(string);
	}
	@When("the user can pass the numerical value for sanctioned strength {string}")
	public void the_user_can_pass_the_numerical_value_for_sanctioned_strength(String string) {
	    DepartmentPagePo.getInstance().toPassSanctionedStrength(string);
	}
	@When("the user can verify the additional seats sanctioned allow alphabets {string}")
	public void the_user_can_verify_the_additional_seats_sanctioned_allow_alphabets(String string) {
	   
	}
	@When("the user can pass the numerical value for additional seats sanctioned {string}")
	public void the_user_can_pass_the_numerical_value_for_additional_seats_sanctioned(String string) {
		DepartmentPagePo.getInstance().toPassAdditionalSeatsSanctioned(string);
	}
	@When("the user can select the department head {string}")
	public void the_user_can_select_the_department_head(String string) {
	  DepartmentPagePo.getInstance().toPassDepartmentHead(string);
	}
	@When("the user can save the details by clicking save button")
	public void the_user_can_save_the_details_by_clicking_save_button() {
	   DepartmentPagePo.getInstance().toClickSaveButton();
	}
	
	@Then ("the user can view the duplicate error message")
	public void the_user_can_view_the_duplicate_error_message() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyDuplicateErrorMessage());
	}
	
	@Then ("the user can verify saved confirmation message")
	public void the_user_can_verify_saved_confirmation_message() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifySavedConfirmationMessage());
	}
	
	@Then ("the user can verify the error message This field is required")
	public void the_user_can_verify_the_error_message_This_field_is_required() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyMandatoryFieldMissingAlert());
	}
	
	@When("the user can reset the changes by clicking reset button")
	public void the_user_can_reset_the_changes_by_clicking_reset_button() {
	    DepartmentPagePo.getInstance().toClickResetButton();
	}
	@Then("the user can verify all the resetted fields are empty")
	public void the_user_can_verify_all_the_resetted_fields_are_empty() {
	   Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyAllFieldsAreResetted());
	}
	@When("the user can verify Departmentcode field is resetted")
	public void the_user_can_verify_departmentcode_field_is_resetted() {
	    Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyTheDepartmentCodeFieldIsResetted());
	}
	@When("the user can verify Departmentname field is resetted")
	public void the_user_can_verify_departmentname_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyTheDepartmentNameFieldIsResetted());
	}
	@When("the user can verify Departmentdescription field is resetted")
	public void the_user_can_verify_departmentdescription_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyTheDescriptionFieldIsResetted());
	}
	@When("the user can verify sanctioned strength field is resetted")
	public void the_user_can_verify_sanctioned_strength_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifySanctionedStrengthFieldIsResetted());
	}
	@When("the user can verify additional seats sanctioned field is resetted")
	public void the_user_can_verify_additional_seats_sanctioned_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyAdditionalSanctionedStrengthFieldIsResetted());
	}
	@When("the user can verify Department head field is resetted")
	public void the_user_can_verify_department_head_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyDepartmentHeadFieldIsResetted());
	}
	@Then("the user can verify institution field is resetted")
	public void the_user_can_verify_institution_field_is_resetted() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyInstitutionFieldResetted());
	}
	
	@When("the user can click the cancel button")
	public void the_user_can_click_the_cancel_button() {
	    DepartmentPagePo.getInstance().toClickCancelButton();
	}
	@When("the user can handle the alert to cancel the changes")
	public void the_user_can_handle_the_alert_tocancel_the_changes() {
		DepartmentPagePo.getInstance().alertconfirmation_forcancel();
	}
	@When("the user can search the department by passing the department id {string}")
	public void the_user_can_search_the_department_by_passing_the_department_id(String code) {
	    DepartmentPagePo.getInstance().toSearchtheDepartment(code);
	}
	@Then("the user can view the selected department {string}")
	public void the_user_can_view_the_selected_department(String string) {
	    Asserts.assertTrue(DepartmentPagePo.getInstance().toViewTheSelectedDepartment(string));
	}
	@When("the user can go to edit option by clicking threedot {string}")
	public void the_user_can_go_to_edit_option_by_clicking_threedot(String option) {
	   DepartmentPagePo.getInstance().toClickThreeDotToEdit(option);
	}
	@When("the user can click on the edit button")
	public void the_user_can_click_on_the_edit_button() {
	   DepartmentPagePo.getInstance().toClickEditButton();
	}
	@Then("the user can navigated to the edit screen")
	public void the_user_can_navigated_to_the_edit_screen() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyEditPage());
	}
	@When("the user can verify the institution field is disabled while editing")
	public void the_user_can_verify_the_institution_field_is_disabled_while_editing() {
		DepartmentPagePo.getInstance().toVerifyInstitutionFieldIsDisabled();
	}
	@When("the user can update the changes by clicking Update button")
	public void the_user_can_update_the_changes_by_clicking_Update_button() {
		DepartmentPagePo.getInstance().toClickUpdateButton();
	}
	@Then ("the user can view the error message as no departments are found")
	public void the_user_can_view_the_error_message_as_no_departments_are_found() {
		DepartmentPagePo.getInstance().toVerifyNoDepartmentErrorMessage();
	}
	@Then ("the user can verify the strength field does not allow alphabets")
	public void the_user_can_verify_the_strength_field_does_not_allow_alphabets() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifySanctionedStrengthFieldIsResetted());
	}
	@Then ("the user can verify the additional seats field does not allow alphabets")
	public void the_user_can_verify_the_additional_seats_field_does_not_allow_alphabets() {
		Asserts.assertTrue(DepartmentPagePo.getInstance().toVerifyAdditionalSanctionedStrengthFieldIsResetted());
	}
	
	}
	    




	
