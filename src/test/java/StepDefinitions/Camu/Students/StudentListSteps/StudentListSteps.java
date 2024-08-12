package StepDefinitions.Camu.Students.StudentListSteps;

import CAMU.PageObject.Students.StudentListPage.StudentListPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentListSteps {
	
	@When("the user enters the student admission no. {string}")
	public void the_user_enters_the_student_admission_no(String admissionNo) {
	    StudentListPagePo.getInstance().enterAdmissionNo(admissionNo);
	}
	
	@When("the user click student by admission no. {string}")
	public void the_user_click_student_by_admission_no(String admissionNo) {
		StudentListPagePo.getInstance().clickStudentName(admissionNo);
	}
	
	@When("the user navigates to the student record page")
	public void the_user_navigates_to_the_student_record_page() {
	    Asserts.assertEqualsText(StudentListPagePo.getInstance().getPagePrimaryHeading(), "student");
	    Asserts.assertEqualsText(StudentListPagePo.getInstance().getPageSecondaryHeading(), "view record");
	}
	
	@Then("the user verify the student record by admission no. {string}")
	public void the_user_verify_the_student_record_by_admission_no(String rollNo) {
		Asserts.assertEqualsText(StudentListPagePo.getInstance().getStudentRecordRollNo(), rollNo);
	}
	
	@Then("the user clicks {string} option from student record")
	public void the_user_clicks_option_from_student_record(String option) {
		StudentListPagePo.getInstance().clickStudentRecordOption(option);
	}
	
	@Then("the user verify the page navigated to {string}")
	public void the_user_verify_the_page_navigated_to(String pageHeading) {
		Asserts.assertEqualsText(StudentListPagePo.getInstance().getPagePrimaryHeading(), pageHeading);
	}
	
	@Then("the user selects the billing item {string}")
	public void the_user_selects_the_billing_item(String billingItem) {
		StudentListPagePo.getInstance().selectBillingItem(billingItem);
	}
	
	@Then("the user clicks the bill button")
	public void the_user_clicks_the_bill_button() {
		StudentListPagePo.getInstance().clickBill();
	}
	
	@Then("the user selects {string} under filter applied")
	public void the_user_selects_under_filter_applied(String filterOption) {
		StudentListPagePo.getInstance().selectFilterOption(filterOption);
	}
	
	@Then("the user verify the bill item {string} status was {string}")
	public void the_user_verify_the_bill_item_status_was(String billingItem, String status) {
		Asserts.assertEqualsText(StudentListPagePo.getInstance().getBillingItemStatus(billingItem), status);
	}
	
	@Then("the user remove all the selected bill item")
	public void the_user_remove_all_the_selected_bill_item() {
		StudentListPagePo.getInstance().removeAllBillingItem();
	}
	
	@Then("the user clicks the bill and receipt button")
	public void the_user_clicks_the_bill_and_receipt_button() {
		StudentListPagePo.getInstance().clickBillAndReceipt();
	}
	
	@Then("the user close the bill item scheduled warning popup")
	public void the_user_close_the_bill_item_scheduled_warning_popup() {
		StudentListPagePo.getInstance().closeBillItemWarningPopup();
	}
	
	@Then("the user clicks on {string} button")
	public void the_user_clicks_on_button(String buttonName) {
		StudentListPagePo.getInstance().clickButton(buttonName);
	}
	
	@Then("the user selects the bill item {string}")
	public void the_user_selects_the_bill_item(String billItem) {
		StudentListPagePo.getInstance().selectBillItem(billItem);
	}
	
	@Then("the user selects the frequency {string}")
	public void the_user_selects_the_frequency(String frequency) {
		StudentListPagePo.getInstance().selectFrequency(frequency);
	}
	
	@Then("the user selects the due date for the bill item {string}")
	public void the_user_selects_the_due_date_for_the_bill_item(String dueDate) throws InterruptedException {
		StudentListPagePo.getInstance().selectBillItemDueDate(dueDate);
	}
	
	@Then("the user enters the no. of pays {string}")
	public void the_user_enters_the_no_of_pays(String noOfPays) {
		StudentListPagePo.getInstance().enterNoOfPays(noOfPays);
	}
	
	@Then("the user clicks plus button to add another bill item")
	public void the_user_clicks_plus_button_to_add_another_bill_item() {
		StudentListPagePo.getInstance().clickPlusButtonAddBillItem();
	}
	
	@Then("the user save the billing schedule")
	public void the_user_save_the_billing_schedule() {
		StudentListPagePo.getInstance().clickSaveBillingSchedule();
	}
	
	@Then("the user selects due date as {string} for all bill item")
	public void the_user_selects_due_date_as_for_all_bill_item(String dueDate) throws InterruptedException {
		StudentListPagePo.getInstance().selectAllBillItemDueDate(dueDate);
	}
	
	@Then("the user clicks apply all button")
	public void the_user_clicks_apply_all_button() {
		StudentListPagePo.getInstance().clickApplyAllButton();
	}
	
	@Then("the user verfies due date {string} is applied to all the selected bill item")
	public void the_user_verfies_due_date_is_applied_to_all_the_selected_bill_item(String dueDate) {
		StudentListPagePo.getInstance().verifyDueDateAppliedToAllBillItem(dueDate);
	}
	
	@Then("the user selects the created billing policy {string}")
	public void the_user_selects_the_created_billing_policy(String billingPolicy) {
		StudentListPagePo.getInstance().selectCreatedBillingPolicy(billingPolicy);
	}
	
	@Then("the user remove the empty bill item")
	public void the_user_remove_the_empty_bill_item() {
		StudentListPagePo.getInstance().removeEmptyBillItem();
	}
	
	@When("the user checks the bill item {string}")
	public void the_user_checks_the_bill_item(String billItem) {
		StudentListPagePo.getInstance().checkBillItem(billItem);
	}
	
	@Then("the user verify receipts button is enabled")
	public void the_user_verify_receipts_button_is_enabled() {
	    Asserts.assertTrue(StudentListPagePo.getInstance().verifyReceiptButtonIsEnabled(), "Receipts button is disabled");
	}
	
	@Then("the user see fill the receipt details dialog appears")
	public void the_user_see_fill_the_receipt_details_dialog_appears() {
		Asserts.assertTrue(StudentListPagePo.getInstance().verifyFillReceiptDialogAppears(), "Fill the receipt details dialog not displayed");
	}
	
	@Then("the user enters the received amount")
	public void the_user_enters_the_received_amount() {
		StudentListPagePo.getInstance().enterReceivedAmount();
	}
	
	@When("the user clicks on add enroll course button")
	public void the_user_clicks_on_add_enroll_course_button() {
		StudentListPagePo.getInstance().clickAddEnrollCourse();
	}
	
	@Then("the user verifies enroll course dialog appears")
	public void the_user_verifies_enroll_course_dialog_appears() {
		Asserts.assertTrue(StudentListPagePo.getInstance().verifyEnrollCourseDialogAppears(), "Enroll course dialog not displayed");
	}
	
	@Then("the user selects enrollment type {string}")
	public void the_user_selects_enrollment_type(String enrollType) {
		StudentListPagePo.getInstance().selectEnrollType(enrollType);
	}
	
	@Then("the user selects enroll academic year {string}")
	public void the_user_selects_enroll_academic_year(String enrollAcademicYear) {
		StudentListPagePo.getInstance().selectEnrollAcademicYear(enrollAcademicYear);
	}
	
	@Then("the user selects enroll semester\\/year {string}")
	public void the_user_selects_enroll_semester_year(String enrollSemesterYear) {
		StudentListPagePo.getInstance().selectEnrollSemesterYear(enrollSemesterYear);
	}
	
	@Then("the user selects enroll course {string}")
	public void the_user_selects_enroll_course(String enrollCourse) {
		StudentListPagePo.getInstance().selectEnrollCourse(enrollCourse);
	}
	
	@When("the user clicks on proceed button")
	public void the_user_clicks_on_proceed_button() {
		StudentListPagePo.getInstance().clickProceed(); 
	}
	
	@Then("the user can see enroll course {string} details dialog appears")
	public void the_user_can_see_enroll_course_details_dialog_appears(String course) {
		StudentListPagePo.getInstance().verifyEnrollCourseDetails(course);
	}
	
	@Then("the user clicks on enroll button")
	public void the_user_clicks_on_enroll_button() {
		StudentListPagePo.getInstance().clickEnroll();
	}
	
	@Then("the user verifies the course {string} with course type {string}, academic year {string}, and semester\\/year {string} is enrolled")
	public void the_user_verifies_the_course_with_course_type_academic_year_and_semester_year_is_enrolled(String course,String courseType, String academicYear, String semesterYear) {
		StudentListPagePo.getInstance().verifyEnrolledCourse(course, courseType, academicYear, semesterYear);
	}
	
	@Then("the user verify status updated to {string}")
	public void the_user_verify_status_updated_to(String status) {
	    Asserts.assertEqualsText(StudentListPagePo.getInstance().getEnrolledCourseStatus(), status);
	}

}
