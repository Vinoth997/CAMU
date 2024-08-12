package StepDefinitions.Camu.Enterprise.SectionSteps;

import CAMU.PageObject.Enterprise.DepartmentPage.DepartmentPagePo;
import CAMU.PageObject.Enterprise.SectionPage.SectionPagePo;
import Utilities.Asserts;
import Utilities.CommonUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SectionSteps {

	@Then("the user verify the page navigated to Section screen")
	public void the_user_verify_the_page_navigated_to_section_screen() {
	    SectionPagePo.getInstance().toVerifySectionPage();
	}
	@When("the user create new section by clicking on Add button")
	public void the_user_create_new_section_by_clicking_on_add_button() {
	    DepartmentPagePo.getInstance().toClickAddButton();
	}
	@Then("the user verify the page navigated to create section screen")
	public void the_user_verify_the_page_navigated_to_create_section_screen() {
	    SectionPagePo.getInstance().toVerifySectionCreationPage();
	}
	@When("the user can pass the section ID {string}")
	public void the_user_can_pass_the_section_id(String string) {
	   SectionPagePo.getInstance().toPassSectionId(string);
	}
	
	@When("the user can pass the section name {string}")
	public void the_user_can_pass_the_section_name(String string) {
	    SectionPagePo.getInstance().toPassSectionName(string);
	}
	
	@When("the user can pass the section description {string}")
	public void the_user_can_pass_the_section_description(String string) {
	   SectionPagePo.getInstance().toPassSectionDescription(string);
	}
	
	@When("the user can enable the arrear section by clicking the checkbox")
	public void the_user_can_enable_the_arrear_section_by_clicking_the_checkbox() {
	   SectionPagePo.getInstance().toEnableArrearSection();
	}
	@When("the user can save the changes by clicking save button")
	public void the_user_can_save_the_changes_by_clicking_save_button() {
	    SectionPagePo.getInstance().toClickSaveButton();
	}
	@When("the user can pass numeric value for the section ID {string}")
	public void the_user_can_pass_numeric_value_for_the_section_id(String string) {
	  SectionPagePo.getInstance().toPassNumericId(string);
	}
	@When("the user can pass the numeric value for section name {string}")
	public void the_user_can_pass_the_numeric_value_for_section_name(String string) {
		SectionPagePo.getInstance().toPassNumericSectionName(string); 
	}
	@When("the user can pass the numeric value for section description {string}")
	public void the_user_can_pass_the_numeric_value_for_section_description(String string) {
		SectionPagePo.getInstance().toPassNumericSectionDescription(string);
	}
	@When("the user can pass alphabetical value for the section ID {string}")
	public void the_user_can_pass_alphabetical_value_for_the_section_id(String string) {
	  SectionPagePo.getInstance().toPassAlphabeticalId(string);
	}
	@When("the user can pass the alphabetical value for section name {string}")
	public void the_user_can_pass_the_alphabetical_value_for_section_name(String string) {
		SectionPagePo.getInstance().toPassAlphabeticalSectionName(string); 
	}
	@When("the user can pass the alphabetical value for section description {string}")
	public void the_user_can_pass_the_alphabetical_value_for_section_description(String string) {
		SectionPagePo.getInstance().toPassAlphabeticalSectionDescription(string);
	}
	@Then("the user cn view the saved confirmation message")
	public void the_user_cn_view_the_saved_confirmation_message() {
	   SectionPagePo.getInstance().toVerifySavedSyccessfullyMessage();
	}
	@When("the user can pass the duplicate for the section ID {string}")
	public void the_user_can_pass_the_duplicate_for_the_section_id(String string) {
		SectionPagePo.getInstance().toPassDuplicateId(string);
	}
	@When("the user can pass the duplicate for section name {string}")
	public void the_user_can_pass_the_duplicate_for_section_name(String string) {
		SectionPagePo.getInstance().toPassDuplicateSectionName(string);
	}
	@When("the user can pass the duplicate for section description {string}")
	public void the_user_can_pass_the_duplicate_for_section_description(String string) {
		SectionPagePo.getInstance().toPassDuplicateSectionDescription(string);
	}
	@Then("the user can view the duplicate section error message")
	public void the_user_can_view_the_duplicate_section_error_message() {
	    Asserts.assertTrue(SectionPagePo.getInstance().toVerifyDuplicateErrorMessage());
	}
	@Then ("the user can view the save button is disabled")
	public void the_user_can_view_the_save_button_is_disabled() {
		SectionPagePo.getInstance().toVerifyTheSaveButtonIsDisabled();
	}
	@When("the user can reset all the fields by clicking reset button")
	public void the_user_can_reset_all_the_fields_by_clicking_reset_button() {
	    SectionPagePo.getInstance().toClickResetButton();
	}
	@Then("the user can verify Institution field is resetted")
	public void the_user_can_verify_institution_field_is_resetted() {
	   Asserts.assertTrue(SectionPagePo.getInstance().toVerifyInstitutionIsRetted());
	}
	@Then("the user can verify sectionId field is resetted")
	public void the_user_can_verify_section_id_field_is_resetted() {
		Asserts.assertTrue(SectionPagePo.getInstance().toVerifySectionIdResetted());
	}
	@Then("the user can verify section name field is resetted")
	public void the_user_can_verify_section_name_field_is_resetted() {
		Asserts.assertTrue(SectionPagePo.getInstance().toVerifySectionNameResetted());
	}
	@Then("the user can verify section description field is resetted")
	public void the_user_can_verify_section_description_field_is_resetted() {
		Asserts.assertTrue(SectionPagePo.getInstance().toVerifySectionDescriptionResetted());
	}
	@Then ("the user can verify the arrear section is disabled")
	public void the_user_can_verify_the_arrear_section_is_disabled() {
		Asserts.assertFalse(SectionPagePo.getInstance().toVerifyArrearSectionCheckboxDisabled());
	}
	@When("the user can search the section by passing the section id {string}")
	public void the_user_can_search_the_section_by_passing_the_section_id(String string) {
	    SectionPagePo.getInstance().toSearchtheSection(string);
	}
	@Then("the user can view the selected section {string}")
	public void the_user_can_view_the_selected_section(String string) {
	    Asserts.assertTrue(SectionPagePo.getInstance().toViewTheSelectedSection(string));
	}
	@Then("the user can navigated to the edit section screen")
	public void the_user_can_navigated_to_the_edit_section_screen() {
	    Asserts.assertTrue(SectionPagePo.getInstance().toVerifyEditSectionScreen());
	}
	@When ("the user can enable or disable the arrear section by clicking the checkbox")
	public void the_user_can_enable_or_disable_the_arrear_section_by_clicking_the_checkbox() {
		SectionPagePo.getInstance().toEnableOrDisableArrearSection();
	}
	@Then("the user can verify the section id is diabled")
	public void the_user_can_verify_the_section_id_is_diabled() {
	   SectionPagePo.getInstance().toVerifySectionIdDisabled();
	}
	@Then("the user can verify the section description is disabled")
	public void the_user_can_verify_the_section_description_is_disabled() {
	   SectionPagePo.getInstance().toVerifySectionDescriptionDisabled();
	}
	@Then ("the user can view the updated confirmation message")
	public void the_user_can_view_the_updated_confirmation_message() {
		SectionPagePo.getInstance().toVerifyUpdatedConfirmationMessage();
	}
	@When ("pagination test")
	public void pagination_test() {
		CommonUtils.getInstance().toAccessPagination();
	}
}
