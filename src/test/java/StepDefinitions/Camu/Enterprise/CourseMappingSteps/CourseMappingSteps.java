package StepDefinitions.Camu.Enterprise.CourseMappingSteps;

import CAMU.PageObject.Enterprise.CourseMappingPage.CourseMappingPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CourseMappingSteps {
	
	@When("the user verify the page navigated to course mapping screen")
	public void the_user_verify_the_page_navigated_to_course_mapping_screen() {
	    Asserts.assertEqualsText(CourseMappingPagePo.getInstance().getCourseMappingPageTitle(), "Course Mapping");
	}
	
	@When("the user verify the page navigated to {string} screen")
	public void the_user_verify_the_page_navigated_to_screen(String moduleName) {
		Asserts.assertEqualsText(CourseMappingPagePo.getInstance().getCourseMappingPageTitle(), moduleName);
	}
	
	@When("the user can search and select institution {string}")
	public void the_user_can_search_and_select_institution(String institution) {
		CourseMappingPagePo.getInstance().searchSelectInstitution(institution);
	}
	
	@When("the user can search and select degree {string}")
	public void the_user_can_search_and_select_degree(String degree) {
		CourseMappingPagePo.getInstance().searchSelectDegree(degree);
	}
	
	@When("the user can search and select program {string}")
	public void the_user_can_search_and_select_program(String program) {
		CourseMappingPagePo.getInstance().searchSelectProgram(program);
	}
	
	@When("the user can search and select department {string}")
	public void the_user_can_search_and_select_department(String department) {
		CourseMappingPagePo.getInstance().searchSelectDepartment(department);
	}
	
	@When("the user can search and select semester\\/year {string}")
	public void the_user_can_search_and_select_semester_year(String semesterYear) {
		CourseMappingPagePo.getInstance().searchSelectSemesterYear(semesterYear);
	}
	
	@When("the user click on search button to get course group")
	public void the_user_click_on_search_button_to_get_course_group() {
		CourseMappingPagePo.getInstance().clickOnSearchButton();
	}
	
	@When("the user can see course mapping not found information")
	public void the_user_can_see_course_mapping_not_found_information() {
//		Asserts.assertEqualsText(CourseMappingPagePo.getInstance().verifyNoCourseMappingInfo(), "Courses mapping not found. Click on add group to assign Coursesto Semester/Year");
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyNoCourseMappingInfo());
	}
	
	@When("the user clicks on add group button")
	public void the_user_clicks_on_add_group_button() {
		CourseMappingPagePo.getInstance().clickOnAddGroupButton();
	}
	
	@When("the user can see mandatory course field appears")
	public void the_user_can_see_mandatory_course_field_appears() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyMandatoryCourseFieldAppears(), "Mandatory course field not found");
	}
	
	@When("the user can search and select the course {string} and enter hours {string}")
	public void the_user_can_search_and_select_the_course(String course, String hours) {
		CourseMappingPagePo.getInstance().searchAndSelectMandatoryCourse(course, hours);
	}
	
	@When("the user clicks on save button to save the details")
	public void the_user_clicks_on_save_button_to_save_the_details() {
		CourseMappingPagePo.getInstance().clickOnSaveButton();
	}
	
	@Then("the user verifies that mandatory course field are disappeared")
	public void the_user_verifies_that_mandatory_course_field_are_disappeared() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyMandatoryCourseFieldDisAppears(), "Mandatory course field still visible");
	}
	
	@When("the user clicks on reset button to clear the fields")
	public void the_user_clicks_on_reset_button_to_clear_the_fields() {
		CourseMappingPagePo.getInstance().clickOnResetButton();
	}
	
	@Then("the user verifies that all fields under course mapping are cleared")
	public void the_user_verifies_that_all_fields_under_course_mapping_are_cleared() {
		CourseMappingPagePo.getInstance().verifyAllFieldsCleared();
	}
	
	@Then("the user can see elective {int} field appears")
	public void the_user_can_see_elective_field_appears(Integer electiveFieldCount) {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().electiveFieldAppears(electiveFieldCount), "Elective "+electiveFieldCount+" not displayed.");
	}
	
	@Then("the user can search and select the elective {int} course {string} and enter hours {string}")
	public void the_user_can_search_and_select_the_elective_course_and_enter_hours(Integer electiveFieldCount, String course, String hours) {
		CourseMappingPagePo.getInstance().searchAndSelectElectiveCourse(electiveFieldCount, course, hours);
	}

	@When("the user remove the selected course in elective {int} field")
	public void the_user_remove_the_course_in_elective(Integer electiveFieldCount) throws InterruptedException {
		CourseMappingPagePo.getInstance().removeSelectedElectiveCourses(electiveFieldCount);
	}
	
	@Then("the user can see elective {int} text field disappears")
	public void the_user_can_see_elective_text_field_disappears(Integer electiveFieldCount) {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().electiveTextFieldDisAppears(electiveFieldCount), "Elective "+electiveFieldCount+" text field not disappeared.");
	}
	
	@When("the user remove the selected course in mandatory field")
	public void the_user_remove_the_selected_course_in_mandatory_field() throws InterruptedException {
		CourseMappingPagePo.getInstance().removeSelectedMandatoryCourses();
	}
	
	@Then("the user can see mandatory course text field disappears")
	public void the_user_can_see_mandatory_course_text_field_disappears() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().mandatoryCourseTextFieldDisAppears(), "Mandatory course text field not disappeared.");
	}
	
	@Then("the user clicks on update button to update the details")
	public void the_user_clicks_on_update_button_to_update_the_details() {
		CourseMappingPagePo.getInstance().clickUpdateButton();
	}
	
	@Then("the user close the elective {int} field")
	public void the_user_close_the_elective_field(Integer electiveFieldCount) {
		CourseMappingPagePo.getInstance().clickElectiveFieldCloseButton(electiveFieldCount);
	}
	
	@Then("the user can see elective {int} field disappears")
	public void the_user_can_see_elective_field_disappears(Integer electiveFieldCount) {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().electiveFieldDisAppears(electiveFieldCount), "Elective "+electiveFieldCount+" field not disappeared.");
	}
	
	@Then("the user can see the popup contains {string}")
	public void the_user_can_see_the_popup_contains(String toastText) {
	    Asserts.assertContainsText(CourseMappingPagePo.getInstance().getToastText(), toastText, "Expected string '"+toastText+"' not found in actual string '"+CourseMappingPagePo.getInstance().getToastText()+"'");
	}
	
	@When("the user clicks add mandatory text field button")
	public void the_user_clicks_add_mandatory_text_field_button() {
		CourseMappingPagePo.getInstance().clickAddMandatoryNewTextFieldButton();
	}
	
	@Then("the user verifes that new mandatory text field is added")
	public void the_user_verifes_that_new_mandatory_text_field_is_added() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyNewMandatoryTextFieldAdded(), "Mandatory text field is not added");
	}
	
	@Then("the user verifies course completion hourse field accept decimal values")
	public void the_user_verifies_course_completion_hourse_field_accept_decimal_values() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyHoursFieldAcceptDecimal(), "Hours field doesnt accept decimal values");
	}
	
	@When("the user verifies course completion hourse field doesnt accept alphabets")
	public void the_user_verifies_course_completion_hourse_field_doesnt_accept_alphabets() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyHoursFieldAcceptAlphabetsSpecialChar(), "Hours field doesnt accept alphabets");
	}
	
	@When("the user verifies course completion hourse field doesnt accept special characters")
	public void the_user_verifies_course_completion_hourse_field_doesnt_accept_special_characters() {
		Asserts.assertTrue(CourseMappingPagePo.getInstance().verifyHoursFieldAcceptAlphabetsSpecialChar(), "Hours field doesnt accept special characters");
	}

}
