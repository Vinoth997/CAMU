package StepDefinitions.Camu.Enterprise.LocationsSteps;

import CAMU.PageObject.Enterprise.FacilitiesPage.FacilitiesPagePo;
import CAMU.PageObject.Enterprise.LocationsPage.LocationsPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LocationsSteps {

	@When("the user clicks on add button to create new location")
	public void the_user_clicks_on_new_button_to_create_new_location() {
		FacilitiesPagePo.getInstance().clickAddButton();
	}

	@Then("the user navigates to create new location page")
	public void the_user_navigates_to_create_new_location_page() {
		Asserts.assertEqualsText(FacilitiesPagePo.getInstance().getCreateNewFacilityPageTitle(), "create new location");
	}
	
	@Then("the user selects the facility {string}")
	public void the_user_selects_the_facility(String facility) {
		LocationsPagePo.getInstance().searchSelectFacility(facility);
	}
	
	@Then("the user enters the location Id {string}")
	public void the_user_enters_the_location_id(String locationID) {
		LocationsPagePo.getInstance().enterLocationId(locationID);
	}
	
	@Then("the user enters the location name {string}")
	public void the_user_enters_the_location_name(String locationName) {
		LocationsPagePo.getInstance().enterLocationName(locationName);
	}
	
	@Given("the user inputs {string} as the capacity")
	public void the_user_inputs_as_the_capacity(String capacity) {
		LocationsPagePo.getInstance().enterCapacity(capacity);
	}
	
	@Then("the user verifies bed button is {string}")
	public void the_user_verifies_bed_button_is(String value) {
	    switch (value.toLowerCase()) {
		case "enabled":
			Asserts.assertTrue(LocationsPagePo.getInstance().verifyBedIsEnabled(), "Bed button is disabled");
			break;
		case "disabled":
			Asserts.assertTrue(LocationsPagePo.getInstance().verifyBedIsDisabled(), "Bed button is enabled");
			break;
		default:
			System.err.println("Invalid value "+value+"");
			break;
		}
	}
	
	@Then("the user enters no. of rows {string}")
	public void the_user_enters_no_of_rows(String rows) {
		LocationsPagePo.getInstance().enterNoOfRows(rows);
	}
	
	@Then("the user enters no. of seats per row {string}")
	public void the_user_enters_no_of_seats_per_row(String seatsPerRow) {
		LocationsPagePo.getInstance().enterSeatPerRow(seatsPerRow); 
	}
	
	@Then("the user search and verify location created successfully")
	public void the_user_search_and_verify_location_created_successfully() {
	    Asserts.assertEqualsText(LocationsPagePo.getInstance().searchAndVerifyNewlyCreatedLocation(), LocationsPagePo.getInstance().getCreatedLocationId());
	}
	
	@When("the user clicks the bed button to add beds")
	public void the_user_clicks_the_bed_button_to_add_beds() {
	    LocationsPagePo.getInstance().clickBedButton();
	}
	
	@Then("the user confirms that the number of beds matches the specified capacity")
	public void the_user_confirms_that_the_number_of_beds_matches_the_specified_capacity() {
	    Asserts.assertEqualsText(LocationsPagePo.getInstance().getBedNameList(), LocationsPagePo.getInstance().getCapacityInputValue());
	}
	
	@Then("the user provides the name for each of the beds added")
	public void the_user_provides_the_name_for_each_of_the_beds_added() {
		LocationsPagePo.getInstance().enterBedNameForEachBeds();
	}
	
	@Then("the user verifies gender field is displayed and enabled")
	public void the_user_verifies_gender_field_is_displayed_and_enabled() {
	    Asserts.assertTrue(LocationsPagePo.getInstance().verifyGenderFieldIsDisplayedEnabled(), "Gender field is not displayed");
	}
	
	@Then("the user verifies room category field is displayed and enabled")
	public void the_user_verifies_room_category_field_is_displayed_and_enabled() {
		Asserts.assertTrue(LocationsPagePo.getInstance().verifyRoomCategoryFieldIsDisplayedEnabled(), "Room category field is not displayed");
	}
	
	@Then("the user selects the gender as {string}")
	public void the_user_selects_the_gender_as(String gender) {
	    LocationsPagePo.getInstance().selectGender(gender);
	}
	
	@Then("the user selects the room category {string}")
	public void the_user_selects_the_room_category(String roomCategory) {
	    LocationsPagePo.getInstance().selectRoomCategory(roomCategory);
	}
	
	@Then("the user verifies no. of rows field is disabled")
	public void the_user_verifies_no_of_rows_field_is_disabled() {
		Asserts.assertTrue(LocationsPagePo.getInstance().verifyRowsFieldEnabled(), "No. of rows field is enabled");
	}
	
	@Then("the user verifies no. of seats per row field is disabled")
	public void the_user_verifies_no_of_seats_per_row_field_is_disabled() {
		Asserts.assertTrue(LocationsPagePo.getInstance().verifySeatPerRowFieldEnabled(), "No. of seats per row field is enabled");
	}
	
	@Then("the user clicks on add room category button")
	public void the_user_clicks_on_add_room_category_button() {
		LocationsPagePo.getInstance().clickAddRoomCategory();
	}
	
	@Then("the user verfies add new room category dialog appears")
	public void the_user_verfies_add_new_room_category_dialog_appears() {
		Asserts.assertTrue(LocationsPagePo.getInstance().verifyAddNewRoomCategoryDisplayed(), "Add new room category dialog box not displayed");
	}
	
	@Then("the user enters the room category name {string}")
	public void the_user_enters_the_room_category_name(String categoryName) {
		LocationsPagePo.getInstance().enterCategoryName(categoryName);
	}
	
	@Then("the user selects billing item {string}")
	public void the_user_selects_billing_item(String billingItem) {
		LocationsPagePo.getInstance().selectBillingItem(billingItem);
	}
	
	@When("the user clicks save to add newly created room category")
	public void the_user_clicks_save_to_add_newly_created_room_category() {
		LocationsPagePo.getInstance().saveNewRoomCategory();
	}
	
	@Then("the user selects the newly created room category")
	public void the_user_selects_the_newly_created_room_category() {
		LocationsPagePo.getInstance().selectNewlyCreatedRoomCategory();
	}
	
	@Then("the user verifies newly created room category is selected")
	public void the_user_verifies_newly_created_room_category_is_selected() {
		Asserts.assertEqualsText(LocationsPagePo.getInstance().verifyNewlyCreatedCategoryIsSelected(),
				LocationsPagePo.getInstance().getNewCategoryName());
	}

	@When("the user clicks cancel to cancel the created room category")
	public void the_user_clicks_cancel_to_cancel_the_created_room_category() {
		LocationsPagePo.getInstance().cancelNewRoomCategory();
	}

	@Then("the user verifies all create new location fields are cleared")
	public void the_user_verifies_all_create_new_location_fields_are_cleared() {
		LocationsPagePo.getInstance().verifyAllFieldsCleared();
	}
	
	@Then("the user verifies all the create new location fields are cleared")
	public void the_user_verifies_all_the_create_new_location_fields_are_cleared() {
		LocationsPagePo.getInstance().verifyAllTheFieldsCleared();
	}
	
	@Then("the user verifies location id can accept alphabets, numeric and special characters")
	public void the_user_verifies_location_id_can_accept_alphabets_numeric_and_special_characters() {
		LocationsPagePo.getInstance().verifyLocationIdField();
	}
	
	@Then("the user verifies location name can accept alphabets, numeric and special characters")
	public void the_user_verifies_location_name_can_accept_alphabets_numeric_and_special_characters() {
		LocationsPagePo.getInstance().verifyLocationNameField();
	}
	
	@Then("the user verifies capacity only accept numeric values")
	public void the_user_verifies_capacity_only_accept_numeric_values() {
		LocationsPagePo.getInstance().verifyCapacityField();
	}
	
	@Then("the user verifies no of rows accepts only numeric values")
	public void the_user_verifies_no_of_rows_accepts_only_numeric_values() {
		LocationsPagePo.getInstance().verifyNoOfRowsField();
	}
	
	@Then("the user verifies no of seats per row accepts only numeric values")
	public void the_user_verifies_no_of_seats_per_row_accepts_only_numeric_values() {
		LocationsPagePo.getInstance().verifyNoOfSeatsPerRowField();
	}
	
	@Then("the user enters the duplicate room category name {string}")
	public void the_user_enters_the_duplicate_room_category_name(String roomCategory) {
	    LocationsPagePo.getInstance().enterDuplicateRoomCategoryName(roomCategory);
	}
	
	@Then("the user search location list by location id {string}")
	public void the_user_search_location_list_by_location_id(String locationId) {
	    LocationsPagePo.getInstance().searchLocation(locationId);
	}
	
	@When("the user navigates to edit location page")
	public void the_user_navigates_to_edit_location_page() {
		Asserts.assertEqualsText(FacilitiesPagePo.getInstance().getCreateNewFacilityPageTitle(), "edit location");
	}

	@When("the user can edit the location Id {string}")
	public void the_user_can_edit_the_location_id(String locationID) {
		LocationsPagePo.getInstance().editLocationId(locationID);
	}
	
	@When("the user can edit the location name {string}")
	public void the_user_can_edit_the_location_name(String locationName) {
		LocationsPagePo.getInstance().editLocationName(locationName);
	}
	
	@Then("the user verify and remove {string} beds")
	public void the_user_verify_and_remove_beds(String bedCount) {
		LocationsPagePo.getInstance().verifyAndRemoveBed(bedCount);
	}
	
	@Then("the user verfies the beds removed is equal to capacity")
	public void the_user_verfies_the_beds_removed_is_equal_to_capacity() {
		LocationsPagePo.getInstance().verifyBedsRemovedCapacity();
	}
	
	@Then("the user search and selects the newly created facility")
	public void the_user_search_and_selects_the_newly_created_facility() {
	    LocationsPagePo.getInstance().searchSelectNewFacility();
	}

}
