package StepDefinitions.Camu.Enterprise.DegreeSteps;

import org.checkerframework.checker.units.qual.degrees;

import CAMU.PageObject.Enterprise.DegreePage.DegreePagePo;
import CAMU.PageObject.Enterprise.ProgramPage.ProgramPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DegreeSteps {
	
	@When("the user landed into the Degree page")
	public void the_user_landed_into_the_degree_page() {
		 Asserts.assertEqualsText(DegreePagePo.getInstance().getDegreePageHeading(), "Degrees");
	    
	}
	@Then("the user can click the add button to create degree")
	public void the_user_can_click_the_add_button_to_create_degree() {
		DegreePagePo.getInstance().clickAdd();
	    
	}
	@When("the user entered the create new degree page")
	public void the_user_entered_the_create_new_degree_page() {
		Asserts.assertEqualsText(DegreePagePo.getInstance().createDegreePageLanding(), "Create New Degree");
	    
	}
	@Then("the user select the institution from dropdown{string}")
	public void the_user_select_the_institution_from_dropdown(String institutionName) {
		DegreePagePo.getInstance().selectInstitution(institutionName);
	    
	}
	@Then("the user enter the degree id{string}")
	public void the_user_enter_the_degree_id(String inputDegreeId) {
		DegreePagePo.getInstance().enterDegreeId(inputDegreeId);
	    
	}
	@Then("the user enter the degree name{string}")
	public void the_user_enter_the_degree_name(String inputDegreeName) {
		DegreePagePo.getInstance().enterDegreeName(inputDegreeName);
	    
	}
	@Then("the user enter the degree description{string}")
	public void the_user_enter_the_degree_description(String inputDegreeDesc) {
		DegreePagePo.getInstance().enterDegreeDesc(inputDegreeDesc);
	    
	}
	@Then("the user enter the minimum age year{string}")
	public void the_user_enter_the_minimum_age_year(String inputMinYr) {
		DegreePagePo.getInstance().minYear(inputMinYr);
	   
	}
	@Then("the user enter the minimum age month{string}")
	public void the_user_enter_the_minimum_age_month(String inputminMnth) {
	    DegreePagePo.getInstance().minMonth(inputminMnth);
	}
	@Then("the user enter the maximum age year{string}")
	public void the_user_enter_the_maximum_age_year(String inputmaxYr) {
		DegreePagePo.getInstance().maxYear(inputmaxYr);
	    
	}
	@Then("the user enter the maximum age month{string}")
	public void the_user_enter_the_maximum_age_month(String inputMaxMonth) {
		DegreePagePo.getInstance().maxMonth(inputMaxMonth);
	   
	}
	@Then("the user enter the relaxation age year{string}")
	public void the_user_enter_the_relaxation_age_year(String inputrelaxYear) {
		DegreePagePo.getInstance().relaxYear(inputrelaxYear);
	  
	}
	@Then("the user enter the relaxation age month{string}")
	public void the_user_enter_the_relaxation_age_month(String inputrelaxMonth) {
		DegreePagePo.getInstance().relaxMonth(inputrelaxMonth);
	   
	}
	@When("the user click on the save button")
	public void the_user_click_on_the_save_button() {
		DegreePagePo.getInstance().saveDegree();
		
	    
	}
	@When("the user can search and see degree has created successfully")
	public void the_user_can_search_and_see_degree_has_created_successfully() {
	    Asserts.assertEqualsText(DegreePagePo.getInstance().searchCreatedNewDegreeAndVerify(), DegreePagePo.getInstance().getDegreeId());
	}
	
	@Then("the user enter the duplicate degree id{string}")
	public void the_user_enter_the_duplicate_degree_id(String dupDegreeId) {
		DegreePagePo.getInstance().enterDuplicateDegreeId(dupDegreeId);
	    
	}
	@Then("the user enter the duplicate degree name{string}")
	public void the_user_enter_the_duplicate_degree_name(String duplicateDegreeName) {
		DegreePagePo.getInstance().enterDuplicateDegreeName(duplicateDegreeName);	
	   
	}
	@When("the user clicks on degree edit button for {string}")
	public void the_user_clicks_on_degree_edit_button_for(String inputdegreeEdit) {
		DegreePagePo.getInstance().clickOnDegreeEdit(inputdegreeEdit);
	    
	}
	@When("the user landed the edit degree page")
	public void the_user_landed_the_edit_degree_page() {
		Asserts.assertEqualsText(DegreePagePo.getInstance().editDegreePageLanding(), "Edit Degree");
	    
	}
	@Then("the user can see the institution dropdown freezed")
	public void the_user_can_see_the_institution_dropdown_freezed() {
		DegreePagePo.getInstance().verify_InstitutionDisabled();
		
	}
	@Then("the user can see the degree id field freezed")
	public void the_user_can_see_the_degree_id_field_freezed() {
		DegreePagePo.getInstance().verify_DegreeIdDisabled();
	  
	}
	@Then("the user can see the degree name field freezed")
	public void the_user_can_see_the_degree_name_field_freezed() {
		DegreePagePo.getInstance().verify_DegreeNameDisabled();
	    
	}
	
	@Then("the user can see the save button is disabled")
	public void the_user_can_see_the_save_button_is_disabled() {
		DegreePagePo.getInstance().verify_saveDisabled();
	    
	}
	@Then("the user can click the cancel button to go back to degree page")
	public void the_user_can_click_the_cancel_button_to_go_back_to_degree_page() {
		
	   DegreePagePo.getInstance().click_CancelButton(); 
	}
	@Then("the user confirm the alert confirmation to go back to degree page")
	public void the_user_confirm_the_alert_confirmation_to_go_back_to_degree_page() {
	    DegreePagePo.getInstance().alertConfirmation_forcancel();
	}
	
	@When("the user clicks the reset button")
	public void the_user_clicks_the_reset_button() {
		DegreePagePo.getInstance().click_Reset();
	    
	}
	@Then("the user verifies all the fields are cleared")
	public void the_user_verifies_all_the_fields_are_cleared() {
		Asserts.assertTrue(DegreePagePo.getInstance().verify_ResetButton(), "All the fields are not cleared");
	    
	}


}
