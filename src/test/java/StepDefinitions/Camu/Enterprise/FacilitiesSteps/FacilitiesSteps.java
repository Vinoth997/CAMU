package StepDefinitions.Camu.Enterprise.FacilitiesSteps;

import CAMU.PageObject.Enterprise.FacilitiesPage.FacilitiesPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacilitiesSteps {
	
	@When("the user clicks on add button to create new facility")
	public void the_user_clicks_on_add_button_to_create_new_facility() {
	    FacilitiesPagePo.getInstance().clickAddButton();
	}
	
	@When("the user navigates to create new facility page")
	public void the_user_navigates_to_create_new_facility_page() {
	    Asserts.assertEqualsText(FacilitiesPagePo.getInstance().getCreateNewFacilityPageTitle(), "create new facility");
	}
	
	@When("the user selects the campus {string}")
	public void the_user_selects_the_campus(String campusId) {
	    FacilitiesPagePo.getInstance().searchAndSelectCampusId(campusId);
	}
	
	@When("the user enters the facility id {string}")
	public void the_user_selects_the_facility(String facilityId) {
	    FacilitiesPagePo.getInstance().enterFacilityId(facilityId);
	}
	
	@When("the user enters the facility name {string}")
	public void the_user_enters_the_facility_name(String facilityName) {
		FacilitiesPagePo.getInstance().enterFacilityName(facilityName);
	}
	
	@When("the user enters the facility description {string}")
	public void the_user_enters_the_facility_description(String description) {
		FacilitiesPagePo.getInstance().enterDescription(description);
	}
	
	@When("the user enters the staff  name {string}")
	public void the_user_enters_the_staff_name(String staffName) {
		FacilitiesPagePo.getInstance().enterStaffName(staffName);
	}
	
	@When("the user {string} the hostel facility checkbox")
	public void the_user_the_hostel_facility_checkbox(String value) {
		switch (value.toLowerCase()) {
		case "checks":
			FacilitiesPagePo.getInstance().checkHostelFacility();
			break;
		case "unchecks":
			FacilitiesPagePo.getInstance().uncheckHostelFacility();
			break;
		default:
			System.out.println("Invalid value "+value+"");
			break;
		}
	}
	
	@When("the user enters the address line {int} {string}")
	public void the_user_enters_the_address_line(Integer addressLine, String address) {
		switch (addressLine) {
		case 1:
			FacilitiesPagePo.getInstance().enterAddressLineOne(address);
			break;
		case 2:
			FacilitiesPagePo.getInstance().enterAddressLineTwo(address);
			break;
		case 3:
			FacilitiesPagePo.getInstance().enterAddressLineThree(address);
			break;
		case 4:
			FacilitiesPagePo.getInstance().enterAddressLineFour(address);
			break;
		default:
			System.err.println("Invalid address line "+addressLine+"");
			break;
		}
	}
	
	@Then("the user verifies all the fields under create new facility are cleared")
	public void the_user_verifies_all_the_fields_under_create_new_facility_are_cleared() {
		FacilitiesPagePo.getInstance().verifyAllFieldsAreCleared();
	}
	
	@When("the user selects multiple staff name {string}")
	public void the_user_selects_multiple_staff_name(String staffName) {
		FacilitiesPagePo.getInstance().selectMultipleStaffName(staffName);
	}
	
	@When("the user removes the selected staffs")
	public void the_user_removes_the_selected_staffs() {
		FacilitiesPagePo.getInstance().removeMultipleStaffName();
	}
	
	@Then("the user search and verify facility created successfully")
	public void the_user_search_and_verify_facility_created_successfully() {
		Asserts.assertEqualsText(FacilitiesPagePo.getInstance().searchNewlyCreatedFacility(), FacilitiesPagePo.getInstance().getCreatedFacilityId());
	}
	
	@When("the user search for facility by facility Id {string}")
	public void the_user_search_for_facility_by_facility_id(String facilityId) {
	    FacilitiesPagePo.getInstance().searchFacility(facilityId);
	}
	
	@When("the user verifies campus field is disabled")
	public void the_user_verifies_campus_field_is_disabled() {
	    Asserts.assertTrue(FacilitiesPagePo.getInstance().verifyCampusFieldDisabled(),"Campus field is enabled");
	}
	
	@When("the user verifies facility id field is disabled")
	public void the_user_verifies_facility_id_field_is_disabled() {
		Asserts.assertTrue(FacilitiesPagePo.getInstance().verifyFacilityIdFieldDisabled(),"Facility Id field is enabled");
	}
	
	@When("the user enters the facility Id {string}")
	public void the_user_enters_the_facility_id(String facilityId) {
		FacilitiesPagePo.getInstance().entersFacilityId(facilityId);
	}
	
	@When("the user enter the facility name {string}")
	public void the_user_enter_the_facility_name(String facilityName) {
		FacilitiesPagePo.getInstance().entersFacilityName(facilityName);
	}
	
	@Then("the user verifies text fields accept {string}")
	public void the_user_verifies_text_fields_accept(String value) {
		FacilitiesPagePo.getInstance().verifyFields();
	}
	
	@Then("the user search and selects the newly created campus")
	public void the_user_search_and_selects_the_newly_created_campus() {
		FacilitiesPagePo.getInstance().searchSelectNewCampus();
	}
}
