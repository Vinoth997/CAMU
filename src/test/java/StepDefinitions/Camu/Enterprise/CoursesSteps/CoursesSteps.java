package StepDefinitions.Camu.Enterprise.CoursesSteps;

import CAMU.PageObject.Enterprise.CoursesPage.CoursesPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoursesSteps {
	
	@Then("the user verify the page navigated to Courses screen")
	public void the_user_verify_the_page_navigated_to_courses_screen() {
	  CoursesPagePo.getInstance().toVerifyCoursePage();
	}
	@When("the user create new course by clicking on Add button")
	public void the_user_create_new_course_by_clicking_on_add_button() {
	    CoursesPagePo.getInstance().toClickAddButton();
	}
	@Then("the user verify the page navigated to create course screen")
	public void the_user_verify_the_page_navigated_to_create_course_screen() {
	   CoursesPagePo.getInstance().toVerifyCreateCourePage();
	}
	@When("the user can pass the Course ID {string}")
	public void the_user_can_pass_the_course_id(String string) {
	   CoursesPagePo.getInstance().toPassSubjectID(string);
	}
	@When("the user can pass the duplicate Course ID {string}")
	public void the_user_can_pass_the_duplicate_course_id(String string) {
	   CoursesPagePo.getInstance().toPassDuplicateCoureID(string);
	}
	@When("the user can pass the Course name {string}")
	public void the_user_can_pass_the_course_name(String string) {
	     CoursesPagePo.getInstance().toPassSubjectName(string);
	}
	@When("the user can pass the duplicate Course name {string}")
	public void the_user_can_pass_the_duplicate_course_name(String string) {
	     CoursesPagePo.getInstance().toPassDuplicateCoureName(string);
	}
	@When("the user can select the offering department for the course {string}")
	public void the_user_can_select_the_offering_department_for_the_course (String offeringDepartment) {
		CoursesPagePo.getInstance().toSelectCourseOffering(offeringDepartment);
	}
	@When("the user can pass the display code {string}")
	public void the_user_can_pass_the_display_code(String Code) {
		CoursesPagePo.getInstance().toPassDisplayCode(Code);
	}
	@When("the user can pass the default credit for the course {string}")
	public void the_user_can_pass_the_default_credit_for_the_course(String string) {
	     CoursesPagePo.getInstance().toPassDefaultCredit(string);
	}
	@When("the user can pass the faculty credit for the course {string}")
	public void the_user_can_pass_the_faculty_credit_for_the_course(String string) {
	     CoursesPagePo.getInstance().toPassFacultyCredit(string);
	}
	@When("the user can select the course category {string}")
	public void the_user_can_select_the_course_category(String string) {
	     CoursesPagePo.getInstance().toSelectCategory(string);
	}
	@When("the user can select the course category without creation {string}")
	public void the_user_can_select_the_course_category_without_creation(String string) {
	     CoursesPagePo.getInstance().toSelectCategoryWithoutCreating(string);
	     
	}
	@When("the user can select the sub category {string},{string}")
	public void the_user_can_select_the_sub_category(String subCat, String catType) {
	    CoursesPagePo.getInstance().toSelectSubCategory(subCat, catType); 
	     
	}
	@When("the user can select the sub category without creation {string}")
	public void the_user_can_select_the_sub_category_without_creation(String subCat) {
	    CoursesPagePo.getInstance().toSelectSubCategoryWithoutCreating(subCat); 
	     
	}
	@When("the user can pass the start date of the course {string}")
	public void the_user_can_pass_the_start_date_of_the_course(String startDate) throws InterruptedException {
	    CoursesPagePo.getInstance().toSelectStartDate(startDate); 
	     
	}
	@When("the user can pass the end date of the course {string}")
	public void the_user_can_pass_the_end_date_of_the_course(String endDate) throws InterruptedException {
	   CoursesPagePo.getInstance().toSelectEndDate(endDate);  
	     
	}
	@When("the usee can pass the capacity of the course {string}")
	public void the_usee_can_pass_the_capacity_of_the_course(String string) {
	     CoursesPagePo.getInstance().toPassCapacity(string);
	     
	}
	@When("the user can verify the status automatically selected as {string}")
	public void the_user_can_verify_the_status_automatically_selected_as(String string) {
	    Asserts.assertTrue(CoursesPagePo.getInstance().toSelectStatusAsActive(string));
	     
	}
	@When("the user can select the course type {string}")
	public void the_user_can_select_the_course_type(String string) {
	     CoursesPagePo.getInstance().toSelectCourseType(string);
	     
	}
	@When("the user can enable the Non academic course by using checkbox")
	public void the_user_can_enable_the_non_academic_course_by_using_checkbox() {
	     CoursesPagePo.getInstance().toEnableNonAcademicCourse();
	     
	}
	@When("the user can enable the Exclude from graduation criteria by using checkbox")
	public void the_user_can_enable_the_exclude_from_graduation_criteria_by_using_checkbox() {
	     CoursesPagePo.getInstance().toEnableExcludeFromGraduationCriteria();
	     
	}
	@When("the user can verify the minimum qualifying GPA field is disabled")
	public void the_user_can_verify_the_minimum_qualifying_gpa_field_is_disabled() {
		CoursesPagePo.getInstance().toVerifyMinimumQualifyingFieldIsDisabled();
	}
	@When("the user can verify self study is enabled")
	public void the_user_can_verify_self_study_is_enabled() {
	     CoursesPagePo.getInstance().toEnableSelfStudy();
	     
	}
	@Then("the user can verify minimum qualifying gpa field visible {string}")
	public void the_user_can_verify_minimum_qualifying_gpa_field_visible(String value) {
	      CoursesPagePo.getInstance().toVerifyMinimumQualifyingFieldIsEnabled(value);
	}
	@Then("the user can enable the Exclude from GPA CGPA")
	public void the_user_can_enable_the_exclude_from_gpa_cgpa() {
	     CoursesPagePo.getInstance().toEnableExcludeFromGPA();	
	     
	}
	@Then("the user can enable the No Arrear classes by using checkbox")
	public void the_user_can_enable_the_no_arrear_classes_by_using_checkbox() {
	    CoursesPagePo.getInstance().toEnableNoArrearClasses(); 
	     
	}
	@Then("the user can enable the Exclude miscellaneous fees")
	public void the_user_can_enable_the_exclude_miscellaneous_fees() {
	     CoursesPagePo.getInstance().toEnableExcludeMiscellaneous();
	     
	}
	@Then("the user can verify the grading system is disabled")
	public void the_user_can_verify_the_grading_system_is_disabled() {
	     CoursesPagePo.getInstance().toVerifyGradingSystemWasDisabled();
	     
	}
	@Then("the user can enable the Alphabetical result")
	public void the_user_can_enable_the_alphabetical_result() {
	     CoursesPagePo.getInstance().toEnableAlphabeticalResult();
	}
	@Then("the user can verify the grading system is enabled and select the grading system {string}")
	public void the_user_can_verify_the_grading_system_is_enabled_and_select_the_grading_system(String option) {
	     CoursesPagePo.getInstance().toVerifyGradingSystemIsEnabledAndSelectValue(option);
	     
	}
	@Then("the user can enable the equivalent course")
	public void the_user_can_enable_the_equivalent_course() {
	     CoursesPagePo.getInstance().toEnableEquivalentCourse();
	     
	}
	@Then("the user can view and select the course {string}")
	public void the_user_can_view_and_select_the_course(String course) {
	     CoursesPagePo.getInstance().toSelectEquivalentCourse(course);
	     
	}
	@When("the user can pass the course overview description {string}")
	public void the_user_can_pass_the_course_overview_description(String overview) {
	     CoursesPagePo.getInstance().toPassCourseOverviewDescription(overview);
	     
	}
	@When("the user can upload the file for course overview")
	public void the_user_can_upload_the_file_for_course_overview() {
	    CoursesPagePo.getInstance().toUploadFileForCourseOverview();
	     
	}
	@When("the user can enable pre-requisite course")
	public void the_user_can_enable_pre_requisite_course() {
	     CoursesPagePo.getInstance().toEnablePreRequisite();
	     
	}
	@Then("the user can view the mandatory and non mandatory titles")
	public void the_user_can_view_the_mandatory_and_non_mandatory_titles() {
	     CoursesPagePo.getInstance().toVerifyPreRequisitesEnabled();
	     
	}
	@When("the user can add the pre-requisite mandatory courses by clicking add Course button")
	public void the_user_can_add_the_pre_requisite_mandatory_courses_by_clicking_add_course_button() {
	     CoursesPagePo.getInstance().toClickAddCourseButtonForMandatoryCourse();
	     
	}
	@Then("the user can view pass and select the pre-requisite mandatory course {string}")
	public void the_user_can_view_pass_and_select_the_pre_requisite_mandatory_course(String string) {
	     CoursesPagePo.getInstance().toPassAndSelectMandatoryAddCourseForPrerequisite(string);
	     
	}
	@Then("the user can select the grade limit for the mandatory course {string}")
	public void the_user_can_select_the_grade_limit_for_the_mandatory_course(String string) {
	     CoursesPagePo.getInstance().toPassAndSelectGrade(string);
	     
	}
	@Then("the user can add the pre-requisite non-mandatory courses by clicking add Course button")
	public void the_user_can_add_the_pre_requisite_non_mandatory_courses_by_clicking_add_course_button() {
	     CoursesPagePo.getInstance().toClickAddCourseButtonForNonMandatoryCourse();
	     
	}
	@Then("the user can view pass and select the pre-requisite non-mandatory course {string}")
	public void the_user_can_view_pass_and_select_the_pre_requisite_non_mandatory_course(String string) {
	     CoursesPagePo.getInstance().toPassAndSelectCourseForNonMandatoryCourse(string);
	     
	}
	@Then("the user can select the grade limit for the non-mandatory course {string}")
	public void the_user_can_select_the_grade_limit_for_the_non_mandatory_course(String string) {
	     CoursesPagePo.getInstance().toPassAndSelectGradeForNonmandatory(string);
	     
	}
	@Then("the user can enable the Co-requisite checkbox")
	public void the_user_can_enable_the_co_requisite_checkbox() {
	     CoursesPagePo.getInstance().toEnableCoRequisiteCheckbox();
	     
	}
	@Then("the user can view pass and select the co-requisite course {string}")
	public void the_user_can_view_pass_and_select_the_co_requisite_course(String string) {
	     CoursesPagePo.getInstance().toPassAndSelectCoRequisiteCourse(string);
	     
	}
	@When("the user can enable the enrollment course fee")
	public void the_user_can_enable_the_enrollment_course_fee() {
	     CoursesPagePo.getInstance().toEnableEnrollmentCourseFeeCheckbox();
	     
	}
	@Then("the user can see the list of option")
	public void the_user_can_see_the_list_of_option() {
	     CoursesPagePo.getInstance().toVerifyTheListOfFeeTypeDisplayed();
	     
	}
	@When("the user can enable the auto exempt course")
	public void the_user_can_enable_the_auto_exempt_course() {
	     CoursesPagePo.getInstance().toEnableAutoExemptCourse();
	     
	}
	@Then("the user can view and pass the grade point {string}")
	public void the_user_can_view_and_pass_the_grade_point(String grade) {
	     CoursesPagePo.getInstance().toPassGradePointForAutoExemptCourse(grade);
	     
	}
	@Then("the user can view and pass the auto exempt course {string}")
	public void the_user_can_view_and_pass_the_auto_exempt_course(String course) {
	     CoursesPagePo.getInstance().toPassAutoExemptCourse(course);
	     
	}
	@When("the user can enable the mandatory course")
	public void the_user_can_enable_the_mandatory_course() {
	     CoursesPagePo.getInstance().toEnableMandatoryCourse();
	     
	}
	@Then("the user verify auto exempt course disabled while enable mandatory course")
	public void the_user_verify_auto_exempt_course_disabled_while_enable_mandatory_course() {
	     CoursesPagePo.getInstance().toVerifyTheGradePointAndAutoExemptCourseDisabled();
	     
	}
	@When("the user can enable the Defer course")
	public void the_user_can_enable_the_defer_course() {
	     CoursesPagePo.getInstance().toEnableDeferCourseCheckbox();
	     
	}
	@When("the user can pass the number of semester {string}")
	public void the_user_can_pass_the_number_of_semester(String count) {
	     CoursesPagePo.getInstance().toPassNumberOfSemesters(count);
	     
	}
	@When("the user can enable the LPT Hours")
	public void the_user_can_enable_the_lpt_hours() {
	     CoursesPagePo.getInstance().toEnableLPTHours();
	     
	}
	@When("the user can pass the Lecture hours {string}")
	public void the_user_can_pass_the_lecture_hours(String hours) {
	     CoursesPagePo.getInstance().toPassLectureHours(hours);
	     
	}
	@When("the user can pass the practical hours {string}")
	public void the_user_can_pass_the_practical_hours(String hours) {
	     CoursesPagePo.getInstance().toPassPracticalHours(hours);
	     
	}
	@When("the user can pass the tutorial hours {string}")
	public void the_user_can_pass_the_tutorial_hours(String hours) {
	    CoursesPagePo.getInstance().toPassTutorialHours(hours);
	     
	}
	@When("the user can save the course by using save button")
	public void the_user_can_save_the_course_by_using_save_button() {
	     CoursesPagePo.getInstance().toClickSaveButton();
	     
	}
	
	
	@Then("the user can verify the saved confirmation message")
	public void the_user_can_verify_the_saved_confirmation_message() {
	     CoursesPagePo.getInstance().toVerifySavedConfirmation();
	     
	}
	
	@Then("the user can verify the updated confirmation message")
	public void the_user_can_verify_the_updated_confirmation_message() {
	     CoursesPagePo.getInstance().toVerifyUpdatedConfirmationMessage();
	     
	}
	@Then("the user can verify duplicate error message")
	public void the_user_can_verify_duplicate_error_message() {
	   CoursesPagePo.getInstance().toVerifyDuplicateErrorMessage();
	}
	@Then("the user verify default credit does not allows alphabets")
	public void the_user_verify_default_credit_does_not_allows_alphabets() {
	    Asserts.assertTrue(CoursesPagePo.getInstance().toVerifyDefaultCreditDoesNotAllowAlphabets());
	}
	@Then("the user can verify faculty credit does not allows alphabets")
	public void the_user_can_verify_faculty_credit_does_not_allows_alphabets() {
	   Asserts.assertTrue(CoursesPagePo.getInstance().toVerifyFacultyCreditDoesNotAllowAlphabets());
	}
	@When("the user can reset the details by clicking reset button")
	public void the_user_can_reset_the_details_by_clicking_reset_button() {
	   CoursesPagePo.getInstance().toClickResetButton();
	}
	@Then("the user can verify all the text field are resetted")
	public void the_user_can_verify_all_the_text_field_are_resetted() {
	  CoursesPagePo.getInstance().toVerifyAllTextFieldsAreResetted();
	}
	@Then("the user can verify all the dropdown selection are resetted")
	public void the_user_can_verify_all_the_dropdown_selection_are_resetted() {
	 CoursesPagePo.getInstance().toVerifyAllDropdownFieldsAreResetted();
	}
	@Then("the user can cancel the created details by clicking cancel button")
	public void the_user_can_cancel_the_created_details_by_clicking_cancel_button() {
	   CoursesPagePo.getInstance().toClickCancelButton();
	}
	@Then("the user can verify the save button is disabled")
	public void the_user_can_verify_the_save_button_is_disabled() {
	    CoursesPagePo.getInstance().toVerifySaveButtonIsDisabled();
	}
	@When("the user pass the course in the search bar {string}")
	public void the_user_pass_the_course_in_thr_search_bar(String course) {
	   CoursesPagePo.getInstance().toPassTheValueToTheSearchBar(course);
	}
	@When("the user can view the filtered course {string}")
	public void the_user_can_view_the_filtered_course(String course) {
	   CoursesPagePo.getInstance().toVerifyTheFilteredCourse(course);
	}
	@When("the user can navigate to Edit page by clicking edit button {string}")
	public void the_user_can_navigate_to_edit_page_by_clicking_edit_button(String courseId) {
	  CoursesPagePo.getInstance().toEditTheSearchedCourse(courseId);
	  CoursesPagePo.getInstance().toClickEditButton();
	}
	@Then("the user can verify the user lands on edit page")
	public void the_user_can_verify_the_user_lands_on_edit_page() {
	   CoursesPagePo.getInstance().toVerifyEditPage();
	}
	@Then("the user can view the split credit is enabled")
	public void the_user_can_view_the_split_credit_is_enabled() {
	   Asserts.assertTrue(CoursesPagePo.getInstance().toVerifySplitCreditIsClickable(), "Splitcredit is not enabled");
	   CoursesPagePo.getInstance().toEnableSplitCredit();
	}
	@Then("the user can view the Theory and practical column")
	public void the_user_can_view_the_theory_and_practical_column() {
	   CoursesPagePo.getInstance().toVerifyTheoryAndPracticalSplitCredit();
	}
	@Then("the user can pass the theory credit {string}")
	public void the_user_can_pass_the_theory_credit(String credit) {
	   CoursesPagePo.getInstance().toPassTheoryCreditField(credit);
	}
	@Then("the user can pass the practical credit {string}")
	public void the_user_can_pass_the_practical_credit(String credit) {
		CoursesPagePo.getInstance().toPassPracticalCreditField(credit);
	   
	}
	@When("the user can enable the option {string}")
	public void the_user_can_enable_the_option(String string) {
	   CoursesPagePo.getInstance().toEnableFixedFeeType(string);
	}
	@When("the user can pass the bill item {string}")
	public void the_user_can_pass_the_bill_item(String string) {
	  CoursesPagePo.getInstance().toPassAndSelectfixedBillItem(string);
	}
	@Then("the user can view the coure type {string}")
	public void the_user_can_view_the_coure_type(String string) {
	    
	}
	@Then("the user can pass and select the bill item {string}")
	public void the_user_can_pass_and_select_the_bill_item(String string) {
	 CoursesPagePo.getInstance().toPassAndSelectBillItemForVariable(string);
	}


}
