package StepDefinitions.Camu.Enterprise.BloomsTaxonomySteps;

import CAMU.PageObject.Enterprise.BloomsTaxonomyPage.BloomsTaxonomyPagePo;
import CAMU.PageObject.Enterprise.LocationsPage.LocationsPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BloomsTaxonomySteps {

	@When("the user clicks on add button to create new taxonomy")
	public void the_user_clicks_on_add_button_to_create_new_taxonomy() {
		BloomsTaxonomyPagePo.getInstance().clickAdd();
	}

	@Then("the user verifies create new taxonomy panel appears")
	public void the_user_verifies_create_new_taxonomy_panel_appears() {
		Asserts.assertEqualsText(BloomsTaxonomyPagePo.getInstance().getTaxonomyPageTitle(), "create new taxonomy");
	}

	@Then("the user selects the learning domain {string}")
	public void the_user_selects_the_learning_domain(String learningDomain) {
		BloomsTaxonomyPagePo.getInstance().selectLearningDomain(learningDomain);
	}

	@Then("the user enters the taxonomy name {string}")
	public void the_user_enters_the_taxonomy_name(String taxonomyName) {
		BloomsTaxonomyPagePo.getInstance().enterTaxonomyName(taxonomyName);
	}

	@Then("the user enters the taxonomy code {string}")
	public void the_user_enters_the_taxonomy_code(String taxonomyCode) {
		BloomsTaxonomyPagePo.getInstance().enterTaxonomyCode(taxonomyCode);
	}

	@Then("the user pass the taxonomy name {string}")
	public void the_user_pass_the_taxonomy_name(String taxonomyName) {
		BloomsTaxonomyPagePo.getInstance().passTaxonomyName(taxonomyName);
	}

	@Then("the user pass the taxonomy code {string}")
	public void the_user_pass_the_taxonomy_code(String taxonomyCode) {
		BloomsTaxonomyPagePo.getInstance().passTaxonomyCode(taxonomyCode);
	}

	@Then("the user search and verify new taxonomy created successfully")
	public void the_user_search_and_verify_new_taxonomy_created_successfully() {
		Asserts.assertEqualsText(BloomsTaxonomyPagePo.getInstance().searchAndVerifyNewlyCreatedRecord(),
				BloomsTaxonomyPagePo.getInstance().getCreatedTaxonomyName());
	}

	@When("the user search taxonomy by name {string}")
	public void the_user_search_taxonomy_by_name(String taxonomyName) {
		LocationsPagePo.getInstance().searchLocation(taxonomyName);
	}

	@Then("the user verifies edit taxonomy panel appears")
	public void the_user_verifies_edit_taxonomy_panel_appears() {
		Asserts.assertEqualsText(BloomsTaxonomyPagePo.getInstance().getTaxonomyPageTitle(), "edit taxonomy");
	}

	@When("the user removed the selected learning domain")
	public void the_user_removed_the_selected_learning_domain() {
		BloomsTaxonomyPagePo.getInstance().removeSelectedLearningDomain();
	}

	@Then("the user verify learning domain field is empty")
	public void the_user_verify_learning_domain_field_is_empty() {
		Asserts.assertTrue(BloomsTaxonomyPagePo.getInstance().verifyLearningDomainCleared(),
				"Learning domain not cleared");
	}

	@Then("the user verify learning domain field error message")
	public void the_user_verify_learning_domain_field_error_message() {
		Asserts.assertEqualsText(BloomsTaxonomyPagePo.getInstance().verifyLearningDomainErrorMessage(),
				"This field is required");
	}

	@Then("the user verifies fields in edit taxonomy are cleared")
	public void the_user_verifies_fields_in_edit_taxonomy_are_cleared() {
		BloomsTaxonomyPagePo.getInstance().verifyAllFieldsCleared();
	}

	@Then("the user verifies modified taxonomy field changes are reverted")
	public void the_user_verifies_modified_taxonomy_field_changes_are_reverted() {
		BloomsTaxonomyPagePo.getInstance().verifyEditedChangesReverted();
	}

	@Then("the user verifies taxonomy name accepts alphabets, numbers and special characters")
	public void the_user_verifies_taxonomy_name_accepts_alphabets_numbers_and_special_characters() {
		BloomsTaxonomyPagePo.getInstance().verifyTaxonomyNameField();
	}

	@Then("the user verifies taxonomy code accepts alphabets, numbers and special characters")
	public void the_user_verifies_taxonomy_code_accepts_alphabets_numbers_and_special_characters() {
		BloomsTaxonomyPagePo.getInstance().verifyTaxonomyCodeField();
	}
}
