package StepDefinitions.Camu.Enterprise.BatchSteps;

import CAMU.PageObject.Enterprise.BatchPage.BatchPagePo;
import CAMU.PageObject.Enterprise.LocationsPage.LocationsPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchSteps {

	@When("the user clicks add button to create new batch")
	public void the_user_clicks_add_button_to_create_new_batch() {
		BatchPagePo.getInstance().clickAdd();
	}

	@When("the user verifies create new bacth panel appears")
	public void the_user_verifies_create_new_bacth_panel_appears() {
		Asserts.assertEqualsText(BatchPagePo.getInstance().getBatchPageTitle(), "create new batch");
	}

	@When("the user click plus button to create new batch type")
	public void the_user_click_plus_button_to_create_new_batch_type() {
		BatchPagePo.getInstance().clickPlus();
	}

	@When("the user verifies create new batch type dialog appears")
	public void the_user_verifies_create_new_batch_type_dialog_appears() {
		Asserts.assertEqualsText(BatchPagePo.getInstance().isCreateNewBatch(), "create new batch type");
	}

	@When("the user enters the new batch type {string}")
	public void the_user_enters_the_new_batch_type(String batchType) {
		BatchPagePo.getInstance().enterNewBatchType(batchType);
	}

	@When("the user clicks on save button to save new batch type")
	public void the_user_clicks_on_save_button_to_save_new_batch_type() {
		BatchPagePo.getInstance().clickSave();
	}
	
	@Then("the user enters the batch name {string}")
	public void the_user_enters_the_batch_name(String batchName) {
		BatchPagePo.getInstance().enterBatchName(batchName);
	}
	
	@Then("the user search and verify batch created successfully")
	public void the_user_search_and_verify_batch_created_successfully() {
		Asserts.assertEqualsText(BatchPagePo.getInstance().searchAndVerifyNewlyCreatedBatch(), BatchPagePo.getInstance().getCreatedBatchName());
	}
	
	@When("the user selects the batch type {string}")
	public void the_user_selects_the_batch_type(String batchType) {
	    BatchPagePo.getInstance().selectBatchType(batchType);
	}

	@Then("the user clicks edit batch button to edit the batch type")
	public void the_user_clicks_edit_batch_button_to_edit_the_batch_type() {
	    BatchPagePo.getInstance().clickEditBatchType();
	}
	
	@Then("the user verifies edit batch type dialog appears")
	public void the_user_verifies_edit_batch_type_dialog_appears() {
		Asserts.assertTrue(BatchPagePo.getInstance().isEditBatchDisplayed(), "Edit batch type dialog not displayed");
	}
	
	@Then("the user edits the batch type {string}")
	public void the_user_edits_the_batch_type(String batchType) {
		BatchPagePo.getInstance().editBatchType(batchType);
	}
	
	@Then("the user verifies batch type updated successfully")
	public void the_user_verifies_batch_type_updated_successfully() {
		Asserts.assertEqualsText(BatchPagePo.getInstance().verifyBatchTypeUpdated(), BatchPagePo.getInstance().getCreatedBatchType());
	}
	
	@When("the user clicks on reset button to revert the modifications")
	public void the_user_clicks_on_reset_button_to_revert_the_modifications() {
		BatchPagePo.getInstance().clickResetOnEditBatchType();
	}
	
	@Then("the user verifies that the changes have been reverted")
	public void the_user_verifies_that_the_changes_have_been_reverted() {
		Asserts.assertNotEqualsText(BatchPagePo.getInstance().getEditBatchTypeInputValue(), BatchPagePo.getInstance().getCreatedBatchType());
	}
	
	@When("the user clicks on cancel button to cancel the changes")
	public void the_user_clicks_on_cancel_button_to_cancel_the_changes() {
		BatchPagePo.getInstance().clickCancelBatchType();
	}
	
	@When("the user verifies edit batch type dialog disappears")
	public void the_user_verifies_edit_batch_type_dialog_disappears() {
		Asserts.assertTrue(BatchPagePo.getInstance().isEditBatchIsDisappeared(), "Edit batch type dialog is displayed");
	}

	@When("the user verifies batch type and batch name fields are cleared")
	public void the_user_verifies_batch_type_and_batch_name_fields_are_cleared() {
		BatchPagePo.getInstance().verifyBatchTypeBatchNameFieldsCleared();
	}
	
	@When("the user search batch by batch type {string}")
	public void the_user_search_batch_by_batch_type(String batchId) {
		LocationsPagePo.getInstance().searchLocation(batchId);
	}
	
	@When("the user verifies edit bacth panel appears")
	public void the_user_verifies_edit_bacth_panel_appears() {
		Asserts.assertEqualsText(BatchPagePo.getInstance().getBatchPageTitle(), "edit batch");
	}
	
	@When("the user can clear the selected batch type")
	public void the_user_can_clear_the_selected_batch_type() {
		BatchPagePo.getInstance().clearSelectedBatchType();
	}
	
	@When("the user verifies batch type is cleared")
	public void the_user_verifies_batch_type_is_cleared() {
		Asserts.assertTrue(BatchPagePo.getInstance().verifyBatchTypeFieldCleared(), "Batch type value is not empty");
	}
	
	@When("the user edit the batch type {string}")
	public void the_user_edit_the_batch_type(String batchType) {
		BatchPagePo.getInstance().editNewBatchType(batchType);
	}
	
	@When("the user clicks on update button to update the modification")
	public void the_user_clicks_on_update_button_to_update_the_modification() {
		BatchPagePo.getInstance().clickUpdateBatchType();
	}
	
	@Then("the user edit the batch name {string}")
	public void the_user_edit_the_batch_name(String batchName) {
		BatchPagePo.getInstance().editBatchName(batchName);
	}
	
	@When("the user enters the batch type {string}")
	public void the_user_enters_the_batch_type(String batchType) {
		BatchPagePo.getInstance().enterBatchType(batchType);
	}
	
	@When("the user enter the batch name {string}")
	public void the_user_enter_the_batch_name(String batchName) {
		BatchPagePo.getInstance().enterBatchNewName(batchName);
	}
	
	@Then("the user verfiy batch type accept {string}")
	public void the_user_verfiy_batch_type_accept(String value) {
		switch (value.toLowerCase()) {
		case "alphabets":
			BatchPagePo.getInstance().verifyBatchTypeAcceptAlphabets();
			break;
		case "numbers":
			BatchPagePo.getInstance().verifyBatchTypeAcceptNumbers();
			break;
		case "special characters":
			BatchPagePo.getInstance().verifyBatchTypeAcceptSpecialCharacters();
			break;
		default:
			System.out.println("Invalid data "+value+"");
			break;
		}
	}
	
	@Then("the user close the create new batch type dialog box")
	public void the_user_close_the_create_new_batch_type_dialog_box() {
		BatchPagePo.getInstance().clickCloseCreateNewBatchType();
	}
	
	@Then("the user verfiy batch name accept {string}")
	public void the_user_verfiy_batch_name_accept(String value) {
		switch (value.toLowerCase()) {
		case "alphabets":
			BatchPagePo.getInstance().verifyBatchNameAcceptAlphabets();
			break;
		case "numbers":
			BatchPagePo.getInstance().verifyBatchNameAcceptNumbers();
			break;
		case "special characters":
			BatchPagePo.getInstance().verifyBatchNameAcceptSpecialCharacters();
			break;
		default:
			System.out.println("Invalid data "+value+"");
			break;
		}
	}
	
	@Then("the user close create new batch panel")
	public void the_user_close_create_new_batch_panel() {
		BatchPagePo.getInstance().clickCloseCreateNewBatchPanel();
	}

}
