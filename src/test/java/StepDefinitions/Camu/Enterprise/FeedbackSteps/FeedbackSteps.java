package StepDefinitions.Camu.Enterprise.FeedbackSteps;

import CAMU.PageObject.Enterprise.FeedbackPage.FeedbackPagePo;
import Utilities.Asserts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedbackSteps {

	@When("the user clicks add button to create new feedback")
	public void the_user_clicks_add_button_to_create_new_feedback() {
		FeedbackPagePo.getInstance().clickAdd();
	}

	@Then("the user navigates to create new feedback page")
	public void the_user_navigates_to_create_new_feedback_page() {
		Asserts.assertEqualsText(FeedbackPagePo.getInstance().getNewFeedBackTitle(), "create new feedback");
	}

	@Then("the user click add button to add new feedback type")
	public void the_user_click_add_button_to_add_new_feedback_type() {
//		FeedbackPagePo.getInstance().clickAddNewFeedbackType();
		FeedbackPagePo.getInstance().clickAdd();
	}

	@Then("the user enters the new feedback type {string}")
	public void the_user_enters_the_new_feedback_type(String feedbackType) {
		FeedbackPagePo.getInstance().enterNewFeedbackType(feedbackType);
	}

	@Then("the user clicks check button to create feedback type")
	public void the_user_clicks_check_button_to_create_feedback() {
		FeedbackPagePo.getInstance().clickCheck();
	}

	@Then("the user verifies newly created feedback type is selected")
	public void the_user_verifies_newly_created_feedback_type_is_selected() {
		Asserts.assertEqualsText(FeedbackPagePo.getInstance().getSelectedFeedbackValue(),
				FeedbackPagePo.getInstance().getCreatedFeedbackValue());
	}

	@Then("the user selects the created feedback type")
	public void the_user_selects_the_created_feedback_type() {
		FeedbackPagePo.getInstance().selectCreatedFeedbackType();
	}

	@Then("the user enters the feedback name {string}")
	public void the_user_enters_the_feedback_name(String feedbackName) {
		FeedbackPagePo.getInstance().enterFeedbackName(feedbackName);
	}

	@Then("the user specify the maximum no. of star allowed for feedback {string}")
	public void the_user_specify_the_maximum_no_of_stars_allowed_for_feedback(String starsAllowed) {
		FeedbackPagePo.getInstance().noOfStarsAllowed(starsAllowed);
	}

	@Then("the user selects the feedback type {string}")
	public void the_user_selects_the_feedback_type(String feedbackType) {
		FeedbackPagePo.getInstance().selectFeedbackType(feedbackType);
	}

	@When("the user enters the value for \"{int}\"st feedback attribute {string}")
	public void the_user_enters_the_value_for_st_feedback_attribute(Integer value, String attribute) {
		FeedbackPagePo.getInstance().enterFeedbackAttribute(value, attribute);
	}

	@Then("the user verifies given maximum no. of star allowed field only enabled for \"{int}\"st feedback")
	public void the_user_verifies_given_maximum_no_of_star_allowed_field_only_enabled_for_st_feedback(Integer value) {
		Asserts.assertEqualsText(FeedbackPagePo.getInstance().verifyMaximumNoOfStar(value),
				FeedbackPagePo.getInstance().getMaximumStarFieldValue());
	}

	@Then("the user enter the \"{int}\"st feeback rating for {int} star as {string}")
	public void the_user_enter_the_st_feeback_rating_for_star_as(Integer feedbackField, Integer star,
			String starRatingValue) {
		FeedbackPagePo.getInstance().enterStarRating(feedbackField, star, starRatingValue);
	}

//	
//	@Then("the user enter the {string}(st|nd|rd|th) feeback rating for {int} star as {string}")
//	public void the_user_enter_the_feeback_rating_for_star_as(Integer feedbackField, Integer star, String starRatingValue) {
//	    FeedbackPagePo.getInstance().enterStarRating(feedbackField, star, starRatingValue);
//	}

	@Then("the user clicks on add to include additional feedback")
	public void the_user_clicks_on_add_to_include_additional_feedback() {
		FeedbackPagePo.getInstance().clickAddFeedBack();
	}

	@Then("the user remove the feeback attribute")
	public void the_user_remove_the_feeback_attribute() {
		FeedbackPagePo.getInstance().beforeRemoveFeedbackCount();
		FeedbackPagePo.getInstance().removeFeedBackAttribute();
		FeedbackPagePo.getInstance().afterRemoveFeedbackCount();
	}

	@Then("the user verifies feedback attribute removed")
	public void the_user_verifies_feedback_attribute_removed() {
		Asserts.assertTrue(FeedbackPagePo.getInstance().verifyFeedbackAttribute(),
				"Before removed count : " + Integer.toString(FeedbackPagePo.getInstance().beforeRemoveFeedbackCount())
						+ ", After removed count : "
						+ Integer.toString(FeedbackPagePo.getInstance().afterRemoveFeedbackCount()) + "");
	}

	@Then("the user adds {string} feedback attribute")
	public void the_user_adds_feedback_attribute(String feedbackCount) {
		FeedbackPagePo.getInstance().beforeRemoveFeedbackCount();
		FeedbackPagePo.getInstance().addNewFeedbackAttribute(feedbackCount);
		FeedbackPagePo.getInstance().afterRemoveFeedbackCount();
	}

	@Then("the user verifies feeback attribute added")
	public void the_user_verifies_feeback_attribute_added() {
		Asserts.assertTrue(FeedbackPagePo.getInstance().verifyFeedbackAttribute(),
				"Before removed count : " + Integer.toString(FeedbackPagePo.getInstance().beforeRemoveFeedbackCount())
						+ ", After removed count : "
						+ Integer.toString(FeedbackPagePo.getInstance().afterRemoveFeedbackCount()) + "");
	}

	@Then("the user selects the grade system {string}")
	public void the_user_selects_the_grade_system(String gradeSystem) {
		FeedbackPagePo.getInstance().selectGradeSystem(gradeSystem);
	}

	@When("the user clicks on edit button for feeback {string}")
	public void the_user_clicks_on_edit_button_for_feeback(String feedback) {
		FeedbackPagePo.getInstance().editFeedback(feedback);
	}

	@Then("the user navigates to edit feedback page")
	public void the_user_navigates_to_edit_feedback_page() {
		Asserts.assertEqualsText(FeedbackPagePo.getInstance().getNewFeedBackTitle(), "edit feedback");
	}

	@Then("the user verifies feedback type field is disabled")
	public void the_user_verifies_feedback_type_field_is_disabled() {
		Asserts.assertTrue(FeedbackPagePo.getInstance().feedbackTypeDisabled(), "Feedback type field is enabled");
	}

	@Then("the user {string} hide student name checkbox")
	public void the_user_hide_student_name_checkbox(String value) {
		switch (value.toLowerCase()) {
		case "checks":
			FeedbackPagePo.getInstance().checkHideStudentName();
			break;
		case "unchecks":
			FeedbackPagePo.getInstance().uncheckHideStudentName();
			break;
		default:
			break;
		}
	}

	@Then("the user verify and validate feedback name field")
	public void the_user_verify_and_validate_feedback_name_field() {
		FeedbackPagePo.getInstance().feedbackNameField();
	}

	@Then("the user verify and validate maximum no.of star field")
	public void the_user_verify_and_validate_maximum_no_of_star_field() {
		FeedbackPagePo.getInstance().maximumNoStarField();
	}

	@Then("the user verify and validate feedback attribute field")
	public void the_user_verify_and_validate_feedback_attribute_field() {
		FeedbackPagePo.getInstance().feedbackAttributeField();
	}

	@Then("the user verifies all create new fields are cleared")
	public void the_user_verifies_all_create_new_fields_are_cleared() {
		FeedbackPagePo.getInstance().verifyAllFieldsCleared();
	}

	@Then("the user pass the new feedback type {string}")
	public void the_user_pass_the_new_feedback_type(String feedbackType) {
		FeedbackPagePo.getInstance().passNewFeedbackType(feedbackType);
	}
}
