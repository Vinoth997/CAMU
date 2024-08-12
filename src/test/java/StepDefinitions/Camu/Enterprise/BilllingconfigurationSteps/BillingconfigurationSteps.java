package StepDefinitions.Camu.Enterprise.BilllingconfigurationSteps;

import CAMU.PageObject.Enterprise.Billingconfiguration.BillingconfigurationPagePo;
import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingconfigurationSteps {
	
	@When("the user verify the page landed to{string}screen")
	public void the_user_verify_the_page_landed_to_billing_configuration_screen(String screen) {
		 Asserts.assertEqualsText(BillingconfigurationPagePo.getInstance().getBillingconfigurationpageHeading(),screen);
	    
	}
	@When("the user click on the add button to create sequence number")
	public void the_user_click_on_the_add_button_to_create_sequence_number() {
		BillingconfigurationPagePo.getInstance().click_billingSequenceAdd();
	    
	}
	@Then("the user entered into new sequence creation page")
	public void the_user_entered_into_new_sequence_creation_page() {
		Asserts.assertEqualsText(BillingconfigurationPagePo.getInstance().verify_SequenceCreationPage(), "create sequence number");
	   
	}
	@Then("the user select the institution from the dropdown{string}")
	public void the_user_select_the_institution_from_the_dropdown_cbcs_camu(String InstitutionName) {
		BillingconfigurationPagePo.getInstance().select_Instituion(InstitutionName);
	    
	}
	@Then("the user enter the alphanumeric value to prefix{string}")
	public void the_user_enter_the_alphanumeric_value_to_prefix_1d(String prefixValue) {
		BillingconfigurationPagePo.getInstance().enter_Prefix(prefixValue);
	    
	}
	@Then("the user enter only numeric value to start number{string}")
	public void the_user_enter_only_numeric_value_to_start_number(String startValue) {
		BillingconfigurationPagePo.getInstance().enter_StartNumber(startValue);
	    
	}
	@Then("the user enter the alphanumeric value to sufix{string}")
	public void the_user_enter_the_alphanumeric_value_to_sufix_a1(String sufixValue) {
		BillingconfigurationPagePo.getInstance().enter_Sufix(sufixValue);
	    
	}
	@Then("the user enter the alphanumeric value to code{string}")
	public void the_user_enter_the_alphanumeric_value_to_code_a(String codeValue) {
		BillingconfigurationPagePo.getInstance().enter_Code(codeValue);
	    
	}
	@Then("the user enter the alphanumeric value to description{string}")
	public void the_user_enter_the_alphanumeric_value_to_description_tuition_fee_sequence(String description) {
		BillingconfigurationPagePo.getInstance().enter_SequenceDescription(description);
	    
	}
	@Then("the user select the billing item category from the dropdown{string}")
	public void the_user_select_the_billing_item_category_from_the_dropdown_exam_fee(String billingItemCat) {
		BillingconfigurationPagePo.getInstance().select_BillingItemCategory(billingItemCat);
	    
	}
	
	@Then("the user click the save")
	public void the_user_click_the_save() {
	    BillingconfigurationPagePo.getInstance().click_Save();
	}
	
	@When("the user click on the add button to new transport bill dates")
	public void the_user_click_on_the_add_button_to_new_transport_bill_dates() {
		BillingconfigurationPagePo.getInstance().click_transportAdd();
	    
	}
	@Then("the user view the create new transport bill dates screen")
	public void the_user_view_the_create_new_transport_bill_dates_screen() {
		Asserts.assertEqualsText(BillingconfigurationPagePo.getInstance().verify_CreateNewTransportBillDates(), "create new");
	    
	}
	@Then("the user can enter the name for transport bill dates{string}")
	public void the_user_can_enter_the_name_for_transport_bill_dates(String Name) {
		
	    BillingconfigurationPagePo.getInstance().t_BillDateName(Name);
	}
	@Then("the user can select the bill cancel reason from dropdown{string}")
	public void the_user_can_select_the_bill_cancel_reason_from_dropdown(String Reason) {
		BillingconfigurationPagePo.getInstance().select_ReasonforCancel(Reason);
	    
	}
	@Then("the user verify by defacult show prompt is enabled")
	public void the_user_verify_by_defacult_show_prompt_is_enabled() {
		BillingconfigurationPagePo.getInstance().showPrompt();
	    
	}
	@Then("the user verify by defacult transport auto billing is enabled")
	public void the_user_verify_by_defacult_transport_auto_billing_is_enabled() {
		BillingconfigurationPagePo.getInstance().autoBilling();
	    
	}
	@Then("the user can select the from date{string}")
	public void the_user_can_select_the_from_date(String fDate) throws InterruptedException {
		BillingconfigurationPagePo.getInstance().startDate_ForTransportBill(fDate);
	    
	}
	@Then("the user can select the to date{string}")
	public void the_user_can_select_the_to_date(String tDate) throws InterruptedException {
		BillingconfigurationPagePo.getInstance().toDate_TransportBill(tDate);
	    
	}
	@Then("the user can add the single date for Add dates{string}")
	public void the_user_can_add_the_single_date_for_add_dates(String sDate) throws InterruptedException {
		BillingconfigurationPagePo.getInstance().addSingleDate(sDate);
	    
	}
	@Then("the user click the save button")
	public void the_user_click_the_save_button() {
		BillingconfigurationPagePo.getInstance().save_TransportBill();
	    
	}
	
	@Then("the user click the plus for multiple dates{string}")
	public void the_user_click_the_plus_for_multiple_dates(String count) throws InterruptedException {
		BillingconfigurationPagePo.getInstance().add_MultipleDates(count);
	    
	}
	
	@When("the user search the transport bills by using name\"T\"")
	public void the_user_search_the_transport_bills_by_using_name_t() {
	   
	}
	@Then("the user can see only the searched details")
	public void the_user_can_see_only_the_searched_details() {
	    
	}
	@Then("the user can click three dot to edit")
	public void the_user_can_click_three_dot_to_edit() {
	    
	}
	@Then("the user can click the edit button")
	public void the_user_can_click_the_edit_button() {
	    
	}
	@Then("the user can change the show prompt configuration")
	public void the_user_can_change_the_show_prompt_configuration() {
	    
	}
	@Then("the user can change the transport auto billing is enabled")
	public void the_user_can_change_the_transport_auto_billing_is_enabled() {
	    
	}
	@Then("the user can cancel the added dates\"\"")
	public void the_user_can_cancel_the_added_dates() {
	    
	}
	

}
