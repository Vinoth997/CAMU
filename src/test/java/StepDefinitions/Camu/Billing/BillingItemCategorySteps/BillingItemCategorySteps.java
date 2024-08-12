package StepDefinitions.Camu.Billing.BillingItemCategorySteps;

import CAMU.PageObject.Billing.BillingItemCategory.BillingItemCategoryPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingItemCategorySteps {

	@When("the user clicks on add to create new billing item category")
	public void the_user_clicks_on_add_to_create_new_billing_item_category() {
		BillingItemCategoryPagePo.getInstance().clickAdd();
	}

	@When("the user enters billing item category {string}")
	public void the_user_enters_billing_item_category(String category) {
		BillingItemCategoryPagePo.getInstance().enterCategory(category);
	}

	@When("the user enters bank details {string}")
	public void the_user_enters_bank_details(String bankDetail) {
		BillingItemCategoryPagePo.getInstance().enterBankDetail(bankDetail);
	}

	@When("the user enters bank name {string}")
	public void the_user_enters_bank_name(String bankName) {
		BillingItemCategoryPagePo.getInstance().enterBankName(bankName);
	}

	@When("the user clicks on add button to add create new bill item")
	public void the_user_clicks_on_add_button_to_add_create_new_bill_item() {
		BillingItemCategoryPagePo.getInstance().clickAddBillItem();
	}

	@When("the user selects the billing item academic year {string}")
	public void the_user_selects_the_billing_item_academic_year(String academicYear) {
		BillingItemCategoryPagePo.getInstance().selectAcademicYear(academicYear);
	}

	@When("the user enters the billing item code {string}")
	public void the_user_enters_the_billing_item_code(String billingItemCode) {
		BillingItemCategoryPagePo.getInstance().enterBillingItemCode(billingItemCode);
	}

	@When("the user enters the billing item name {string}")
	public void the_user_enters_the_billing_item_name(String billingItemName) {
		BillingItemCategoryPagePo.getInstance().enterBillingItemName(billingItemName);
	}

	@When("the user enters the display text {string}")
	public void the_user_enters_the_display_text(String displayText) {
		BillingItemCategoryPagePo.getInstance().enterDisplayText(displayText);
	}

	@When("the user selects the newly created billing item category")
	public void the_user_selects_the_newly_created_billing_item_category() {
		BillingItemCategoryPagePo.getInstance().selectsNewlyCreatedBillItemCategory();
	}

	@When("the user selects the bank account details {string}")
	public void the_user_selects_the_bank_account_details(String bankAccount) {
		BillingItemCategoryPagePo.getInstance().selectBankAccount(bankAccount);
	}

	@When("the user enters the cost {string}")
	public void the_user_enters_the_cost(String cost) {
		BillingItemCategoryPagePo.getInstance().enterCost(cost);
	}

	@When("the user removes the empty cost field")
	public void the_user_removes_the_empty_cost_field() {
		BillingItemCategoryPagePo.getInstance().removeEmptyField();
	}

	@When("the user clicks on show me the results button")
	public void the_user_clicks_on_show_me_the_results_button() {
		BillingItemCategoryPagePo.getInstance().clickShowMeResults();
	}

	@When("the user clicks more option for the student using roll no. {string}")
	public void the_user_clicks_more_option_for_the_student_using_roll_no(String rollNo) {
		BillingItemCategoryPagePo.getInstance().clickMoreOptionUsingRollNo(rollNo);
	}

	@When("the user clicks on option {string}")
	public void the_user_clicks_on_option(String option) {
		BillingItemCategoryPagePo.getInstance().clickOption(option);
	}

	@When("the user verify the admission no. {string}")
	public void the_user_verify_the_admission_no(String admissionNo) {
		Asserts.assertEqualsText(BillingItemCategoryPagePo.getInstance().getAdmissionNo(), admissionNo);
	}

	@When("the user selects the newly created bill item")
	public void the_user_selects_the_newly_created_bill_item() {
		BillingItemCategoryPagePo.getInstance().selectsNewlyCreatedBillItem();
	}

	@When("the user verify the newly crated bill item status was {string}")
	public void the_user_verify_the_newly_crated_bill_item_status_was(String billItemStatus) {
		Asserts.assertEqualsText(BillingItemCategoryPagePo.getInstance().getNewlyCreatedBillItemStatus(),
				billItemStatus);
	}

	@When("the user checks the newly created bill item")
	public void the_user_checks_the_newly_created_bill_item() {
		BillingItemCategoryPagePo.getInstance().checkNewlyCreatedBillItem();
	}
	
	@Then("the user clicks on save")
	public void the_user_clicks_on_save() {
		BillingItemCategoryPagePo.getInstance().clickSave();
	}

}
