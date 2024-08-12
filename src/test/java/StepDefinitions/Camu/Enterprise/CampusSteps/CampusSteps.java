package StepDefinitions.Camu.Enterprise.CampusSteps;

import CAMU.PageObject.Enterprise.CampusPage.CampusPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampusSteps {
	
	@When("the user click on add to create new campus")
	public void the_user_click_on_add_to_create_new_campus() {
	   CampusPagePo.getInstance().clickAddCampusButton();
	}
	
	@Then("the user verify the page navigated to create new campus page")
	public void the_user_verify_the_page_navigated_to_create_new_campus_page() {
	    Asserts.assertEqualsText(CampusPagePo.getInstance().verifyNavigateCreateNewCampus(), "create new campus");
	}
	
	@Then("the user pass the campus id {string}")
	public void the_user_pass_the_campus_id(String campusId) {
		CampusPagePo.getInstance().passCampusId(campusId);
	}
	
	@Then("the user pass the campus name {string}")
	public void the_user_pass_the_campus_name(String campusName) {
		CampusPagePo.getInstance().passCampusName(campusName);
	}
	
	@Then("the user pass the campus description {string}")
	public void the_user_pass_the_campus_description(String campusDescription) {
		CampusPagePo.getInstance().passCampusDescription(campusDescription);
	}
	
	@Then("the user pass the campus address line {int} {string}")
	public void the_user_pass_the_campus_address_line(Integer addressLine, String address) {
		switch (addressLine) {
		case 1:
			CampusPagePo.getInstance().passCampusAddressLineOne(address);
			break;
		case 2:
			CampusPagePo.getInstance().passCampusAddressLineTwo(address);
			break;
		case 3:
			CampusPagePo.getInstance().passCampusAddressLineThree(address);
			break;
		case 4:
			CampusPagePo.getInstance().passCampusAddressLineFour(address);
			break;
		default:
			System.out.println("Invalid value "+addressLine+"");
			break;
		}
	}
	
	@Then("the user enters the mobile no. {string}")
	public void the_user_enters_the_mobile_no(String mobileNo) {
		CampusPagePo.getInstance().enterCampusMobileNo(mobileNo);
	}
	
	@Then("the user enters the phone no. {string}")
	public void the_user_enters_the_phone_no(String phoneNo) {
		CampusPagePo.getInstance().enterCampusPhoneNo(phoneNo);
	}
	
	@Then("the user enters the email address {string}")
	public void the_user_enters_the_email_address(String emailAddress) {
		CampusPagePo.getInstance().enterEmailAddress(emailAddress);
	}
	
	@Then("the user click on save to save the campus created")
	public void the_user_click_on_save_to_save_the_campus_created() {
		CampusPagePo.getInstance().clickSaveButton();
	}
	
	@Then("the user can search and verify campus has created successfully")
	public void the_user_can_search_and_verify_campus_has_created_successfully() {
		Asserts.assertEqualsText(CampusPagePo.getInstance().searchCreatedNewCampusAndVerify(), CampusPagePo.getInstance().getCampusId());
	}
	
	@When("the user click on reset to reset the changes")
	public void the_user_click_on_reset_to_reset_the_changes() {
		CampusPagePo.getInstance().clickResetButton();
	}
	
	@Then("the user verifies all create new campus fields are cleared")
	public void the_user_verifies_all_create_new_campus_fields_are_cleared() {
		CampusPagePo.getInstance().verifyAllFieldsCleared();
	}
	
	@Then("the user verifies save button is disabled")
	public void the_user_verifies_save_button_is_disabled() {
	    Asserts.assertTrue(CampusPagePo.getInstance().verifySaveButtonDisabled(), "Save button is enabled");
	}
	
	@Then("the user verifies save button is enabled")
	public void the_user_verifies_save_button_is_enabled() {
		Asserts.assertTrue(CampusPagePo.getInstance().verifySaveButtonEnabled(), "Save button is disabled");
	}
	
	@When("the user search campus list by campus id {string}")
	public void the_user_search_campus_list_by_campus_id(String campusId) {
	    CampusPagePo.getInstance().searchCampusList(campusId);
	}
	
	@When("the user verifies campus id field is not editable")
	public void the_user_verifies_campus_id_field_is_not_editable() {
		Asserts.assertTrue(CampusPagePo.getInstance().verifyCampusIdNotEditable(), "Campus id field is editable");
	}
	
	@When("the user click on update button to update the changes")
	public void the_user_click_on_update_button_to_update_the_changes() {
		CampusPagePo.getInstance().clickUpdateButton();
	}
	
	@Then("the user verifies invalid  mobile number format error")
	public void the_user_verifies_invalid_mobile_number_format_error() {
		Asserts.assertTrue(CampusPagePo.getInstance().verifyMobileNoErrorMessage(), "'Invalid mobile number format' error messages is not displayed");
	}
	
	@Then("the user verifies invalid  phone number format error")
	public void the_user_verifies_invalid_phone_number_format_error() {
		Asserts.assertTrue(CampusPagePo.getInstance().verifyPhoneNoErrorMessage(), "'Invalid phone number format' error messages is not displayed");
	}
	
	@Then("the user verifies invalid email id format error")
	public void the_user_verifies_invalid_email_id_format_error() {
		Asserts.assertTrue(CampusPagePo.getInstance().verifyEmailIdErrorMessage(), "'Invalid email id' error messages is not displayed");
	}
	
	@Then("the user enters the campus id {string}")
	public void the_user_enters_the_campus_id(String campusId) {
	    CampusPagePo.getInstance().enterCampusId(campusId);
	}
	
	@Then("the user enters the campus name {string}")
	public void the_user_enters_the_campus_name(String campusName) {
		CampusPagePo.getInstance().enterCampusName(campusName);
	}
	
	@Then("the user verifies all fields accept {string}")
	public void the_user_verifies_all_fields_accept_values(String value) {
	    switch(value.toLowerCase()) {
	    case "alphabets":
	    	CampusPagePo.getInstance().verifyAllFieldsAcceptAlphabets();
	    	break;
	    case "numbers":
	    	CampusPagePo.getInstance().verifyAllFieldsAcceptNumbers();
	    	break;
	    case "special characters":
	    	CampusPagePo.getInstance().verifyAllFieldsAcceptSpecialCharacters();
	    	break;
	    default:
	    	System.out.println("Invalid value "+value+"");
	    	break;
	    }
	}
	
	@When("the user confirms that they are on the first page")
	public void the_user_confirms_that_they_are_on_the_first_page() {
		CampusPagePo.getInstance().verifyOnFirstPage();
	}
	
	@When("the user verifies first page and previous page button is disabled")
	public void the_user_verifies_first_page_and_previous_page_button_is_disabled() {
		CampusPagePo.getInstance().verifyFirstPagePreviousPageButtonDisabled();
	}
	
	@When("the user verifies next page and last page button is enabled")
	public void the_user_verifies_next_page_and_last_page_button_is_enabled() {
		CampusPagePo.getInstance().verifyNextPageLastPageButtonEnabled();  
	}
	
	@When("the user clicks on last page button")
	public void the_user_clicks_on_last_page_button() {
		CampusPagePo.getInstance().clickLastPageButton();
	}
	
	@When("the user confirms that they are on the last page")
	public void the_user_confirms_that_they_are_on_the_last_page() {
		CampusPagePo.getInstance().verifyOnLastPage();
	}
	
	@When("the user verifies next page and last page button is disabled")
	public void the_user_verifies_last_page_and_next_page_button_is_disabled() {
		CampusPagePo.getInstance().verifyNextPageLastPageButtonDisabled();  
	}
	
	@When("the user verifies first page and previous page button is enabled")
	public void the_user_verifies_previous_page_and_first_page_button_is_enabled() {
		CampusPagePo.getInstance().verifyFirstPagePreviousPageButtonEnabled();
	}
	
	@When("the user clicks on next page button")
	public void the_user_clicks_on_next_page_button() {
		CampusPagePo.getInstance().getPaginationText();
		CampusPagePo.getInstance().getPaginationInputText();
		CampusPagePo.getInstance().clickNextPageButton();
	}
	
	@When("the user verifies it navigates to next page")
	public void the_user_verifies_it_navigates_to_next_page() {
		CampusPagePo.getInstance().verifyNavigateNextPage();
	}
	
	@When("the user clicks on previous page button")
	public void the_user_clicks_on_previous_page_button() {
		CampusPagePo.getInstance().getPaginationText();
		CampusPagePo.getInstance().getPaginationInputText();
		CampusPagePo.getInstance().clickPreviousPageButton();
	}
	
	@When("the user verifies it navigates to previous page")
	public void the_user_verifies_it_navigates_to_previous_page() {
		CampusPagePo.getInstance().verifyNavigatePreviousPage();
	}
	
	@When("the user selects {string} from page filter dropdown")
	public void the_user_selects_from_page_filter_dropdown(String showPerPage) {
		CampusPagePo.getInstance().selectPageFilter(showPerPage);
	}
	
	@When("the user type the page no. {string}")
	public void the_user_type_the_page_no(String pageNo) {
		CampusPagePo.getInstance().enterPageNumber(pageNo);
	}
	
	@When("the user verifies it navigates to the page {string}")
	public void the_user_verifies_it_navigates_to_the_page(String pageNo) {
		CampusPagePo.getInstance().verifyNavigatesToPageNumber(pageNo);
	}
	
	@Then("the user verifies the list is less than are equal to selected page filer {string}")
	public void the_user_verifies_the_list_is_less_than_are_equal_to_selected_page_filer(String pageList) {
		CampusPagePo.getInstance().verifyListInPage(pageList);
	}
	
	@When("the user clicks on first page button")
	public void the_user_clicks_on_first_page_button() {
		CampusPagePo.getInstance().clickFirstPageButton();
	}

}
