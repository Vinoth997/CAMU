package StepDefinitions.Camu.Enterprise.BillingCourseConfigurationSteps;

import CAMU.PageObject.Enterprise.BillingCourseConfigurationPage.BillingCourseConfigurationPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingCourseConfigurationSteps {

	@Then("the user verify institution {string} is selected")
	public void the_user_verify_institution_is_selected(String institution) {
		Asserts.assertEqualsText(BillingCourseConfigurationPagePo.getInstance().verifyInstitutionSelected(institution),
				institution);
	}

	@When("the user selects the department {string}")
	public void the_user_selects_the_department(String department) {
		BillingCourseConfigurationPagePo.getInstance().selectDepartment(department);
	}

	@When("the user clicks on search button")
	public void the_user_clicks_on_search_button() {
		BillingCourseConfigurationPagePo.getInstance().clickSearchButton();
	}

	@When("the user click add to add billing policy")
	public void the_user_click_add_to_add_billing_policy() {
		BillingCourseConfigurationPagePo.getInstance().clickAddBillingPolicy();
	}

	@Then("the user verify billing policy dialog appears")
	public void the_user_verify_billing_policy_dialog_appears() {
		Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifyBillingPolicyDialogAppeared(),
				"Add Billing policy dialog box not appeared");
	}

	@Then("the user selects the billing policy {string}")
	public void the_user_selects_the_billing_policy(String billingPolicy) {
		BillingCourseConfigurationPagePo.getInstance().selectBillingPolicy(billingPolicy);
	}

	@Then("the user clicks on save button")
	public void the_user_clicks_on_save_button() {
		BillingCourseConfigurationPagePo.getInstance().saveBillingPolicy();
	}

	@Then("the user verify new billing policy for {string}, {string}, {string} added")
	public void the_user_verify_new_billing_policy_for_added(String institution, String department,
			String selectedBillingPolicy) {
		BillingCourseConfigurationPagePo.getInstance().verifyNewBillingPolicyAdded(institution, department,
				selectedBillingPolicy);
	}

	@Then("the user click add to add academic year")
	public void the_user_click_add_to_add_academic_year() {
		BillingCourseConfigurationPagePo.getInstance().clickAddAcademicYear();
	}

	@Then("the user selects the academic year {string}")
	public void the_user_selects_the_academic_year(String academicYear) {
		BillingCourseConfigurationPagePo.getInstance().selectAcademicYear(academicYear);
	}

	@Then("the user selects the due date {string}")
	public void the_user_selects_the_due_date(String academicDueDate) throws InterruptedException {
		BillingCourseConfigurationPagePo.getInstance().selectAcademicDueDate(academicDueDate);
	}

	@Then("the user {string} active checkbox")
	public void the_user_active_checkbox(String value) {
		switch (value.toLowerCase()) {
		case "checks":
			BillingCourseConfigurationPagePo.getInstance().checkActiveAcademicPolicy();
			break;
		case "unchecks":
			BillingCourseConfigurationPagePo.getInstance().uncheckActiveAcademicPolicy();
			break;
		default:
			System.err.println("Invalid data " + value + "");
		}
	}

	@Then("the user verify create academic year dialog appears")
	public void the_user_verify_create_academic_year_dialog_appears() {
		Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifyAcademicYearDialogAppeared(),
				"Create academic year dialog box not appeared");
	}
	
	@Then("the user verify new academic year created with {string}, {string}, {string} status {string}")
	public void the_user_new_academic_year_created_with_status(String institution, String academicYear, String dueDate, String status) {
	    BillingCourseConfigurationPagePo.getInstance().verifyNewAcademicYearCreated(institution, academicYear, dueDate, status);
	}
	
	@Then("the user clicks on next page button under academic year")
	public void the_user_clicks_on_next_page_button_under_academic_year() {
		BillingCourseConfigurationPagePo.getInstance().clickAcademicYearNextPage();
	}
	
	@When("the user verify institution field is cleared")
	public void the_user_verify_institution_field_is_cleared() {
		Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifyInstitutionFieldCleared(),
				"Institution field not cleared");
	}

	@When("the user verify department field is cleared")
	public void the_user_verify_department_field_is_cleared() {
		Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifyDepartmentFieldCleared(),
				"Department field not cleared");
	}
	
	@When("the user search billing policy {string}")
	public void the_user_search_billing_policy(String billingPolicy) {
		BillingCourseConfigurationPagePo.getInstance().searchBillingPolicy(billingPolicy);
	}
	
	@When("the user click edit billing policy by department {string} and billing policy {string}")
	public void the_user_click_edit_for_billing_policy(String department, String billingPolicy) {
		BillingCourseConfigurationPagePo.getInstance().clickEditBillingPolicy(department, billingPolicy);
	}
	
	@Then("the user remove selected billing policy")
	public void the_user_remove_selected_billing_policy() {
	    BillingCourseConfigurationPagePo.getInstance().removeSelectedBillingPolicy();
	}
	
	@Then("the user verify selected billing policy removed")
	public void the_user_verify_selected_billing_policy_removed() {
		Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifySelectedBillingPolicyRemoved(),
				"Billing policy not removed");
	}
	
	@When("the user search academic year {string}")
	public void the_user_search_academic_year(String academicYear) {
		BillingCourseConfigurationPagePo.getInstance().searchAcademicYear(academicYear);
	}
	
	@When("the user click edit academic year by year {string} and due date {string}")
	public void the_user_click_edit_for_academic_year(String academicYear, String dueDate) {
		BillingCourseConfigurationPagePo.getInstance().clickEditAcademicYear(academicYear, dueDate);
	}
	
	@When("the user filter the search result for billing policy as {string}")
	public void the_user_filter_the_search_result_for_billing_policy_as(String value) {
		BillingCourseConfigurationPagePo.getInstance().billingPolicyShowResultValue(value);
	}
	
	@When("the user filter the search result for academic year as {string}")
	public void the_user_filter_the_search_result_for_academic_year_as(String value) {
		BillingCourseConfigurationPagePo.getInstance().academicYearShowResultValue(value);
	}
	
	@When("the user verifies academic year drop down field is disabled")
	public void the_user_verifies_academic_year_drop_down_field_is_disabled() {
	    Asserts.assertTrue(BillingCourseConfigurationPagePo.getInstance().verifyAcademicYearFieldDisabled(), "Academic year drop down field enabled");
	}
	
	@Then("the user selects multiple billing policy {string}")
	public void the_user_selects_multiple_billing_policy(String billingPolicy) {
		BillingCourseConfigurationPagePo.getInstance().selectMultipleBillingPolicy(billingPolicy);
	}
}
