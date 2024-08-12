package StepDefinitions.Camu.Billing.StudentUpdateTemplateSteps;

import CAMU.PageObject.Billing.StudentUpdateTemplate.StudentUpdateTemplatePagePo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class StudentUpdateTemplateSteps {
	
	@Then("the user verify student name profile {string} is displayed")
	public void the_user_verify_student_profile_is_displayed(String studentName) {
		StudentUpdateTemplatePagePo.getInstance().verifyStudentProfileIsDisplayed(studentName);
	}
	
	@When("the user click on more info button")
	public void the_user_click_on_more_info_button() {
		StudentUpdateTemplatePagePo.getInstance().clickMoreInfo();
	}
	
	@When("the user clicks on {string} tab")
	public void the_user_clicks_on_tab(String option) {
		StudentUpdateTemplatePagePo.getInstance().clickOnTab(option);
	}
	
	@When("the user gets the student mobile number")
	public void the_user_gets_the_student_mobile_number() {
		StudentUpdateTemplatePagePo.getInstance().getMobileNumber();
	}
	
	@When("the user clicks on action dropdown and click {string} option")
	public void the_user_clicks_on_action_dropdown_and_click_option(String option) {
		StudentUpdateTemplatePagePo.getInstance().clickActionDropDown(option);
	}
	
	@When("the user clicks on download sample format button")
	public void the_user_clicks_on_download_sample_format_button() {
		StudentUpdateTemplatePagePo.getInstance().clickDownloadSampleFormat();
	}
	
	@When("the user uploads the student updated template")
	public void the_user_uploads_the_student_updated_template() {
		StudentUpdateTemplatePagePo.getInstance().uploadStudentTemplate();
	}

	@When("the user opens new incognito browser")
	public void the_user_opens_new_incognito_browser() {
		StudentUpdateTemplatePagePo.getInstance().openNewIncognito();
	}

	@When("the user switch to new incognito browser")
	public void the_user_switch_to_new_incognito_browser() {
		StudentUpdateTemplatePagePo.getInstance().switchNewIncognito();
	}

	@When("the user verifies the mobile number is updated")
	public void the_user_verifies_the_mobile_number_is_updated() {
		StudentUpdateTemplatePagePo.getInstance().verifyMobileNumberUpdated();
	}

	@When("the user update the {string} for {string} as {string} in {string} row")
	public void the_user_update_the_for_as_in_row(String sheetName, String headerName, String rowIdentifier, String cellValue) throws IOException {
		StudentUpdateTemplatePagePo.getInstance().updateSheetValue(sheetName, headerName, rowIdentifier, cellValue);
	}

	@When("the user update the {string} for {string} in row {string} value as {string}")
	public void the_user_update_the_for_in_row_value_as(String sheetName, String headerName, String cellValue, String rowIdentifier) throws IOException {
		StudentUpdateTemplatePagePo.getInstance().updateSheetValue(sheetName, headerName, cellValue, rowIdentifier);
	}

}
