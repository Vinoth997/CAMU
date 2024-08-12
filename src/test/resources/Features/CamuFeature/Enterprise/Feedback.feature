@Enterprise @FeedbackModule
Feature: Feedback Module creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Feedback" submodule under Enterprise module
    
  @FBK-01
    Scenario Outline: Verify able to search and navigate to feedback module from global search bar
    And the user verify the page navigated to "feedback" screen
    And the user search and select "Feedback" in globar search bar
    And the user verify the page navigated to "feedback" screen
    
  @FBK-02
    Scenario Outline: Create new feedback
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
    And the user click add button to add new feedback type
    And the user enters the new feedback type "FB-"
    When the user clicks check button to create feedback type
    Then the user can see the popup "feedback type successfully created"
		And the user verifies that the popup has disappeared
		And the user selects the created feedback type
		And the user verifies newly created feedback type is selected
		And the user enters the feedback name "Internal"
		And the user specify the maximum no. of star allowed for feedback "3"
		And the user enters the value for "1"st feedback attribute "Attribute"
		Then the user verifies given maximum no. of star allowed field only enabled for "1"st feedback
		And the user enter the "1"st feeback rating for 1 star as "Poor"
		And the user enter the "1"st feeback rating for 2 star as "Average"
		And the user enter the "1"st feeback rating for 3 star as "Good"
		And the user enters the value for "2"st feedback attribute "Attribute"
		And the user enter the "2"st feeback rating for 1 star as "Poor"
		And the user enter the "2"st feeback rating for 2 star as "Average"
		And the user enter the "2"st feeback rating for 3 star as "Good"
		And the user enters the value for "3"st feedback attribute "Attribute"
		And the user enter the "3"st feeback rating for 1 star as "Poor"
		And the user enter the "3"st feeback rating for 2 star as "Average"
		And the user enter the "3"st feeback rating for 3 star as "Good"
		When the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		
	@FBK-03
    Scenario Outline: Create new feedback with existing feedback type
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
		And the user selects the feedback type "New"
		And the user enters the feedback name "Internal"
		When the user specify the maximum no. of star allowed for feedback "3"
		And the user enters the value for "1"st feedback attribute "Attribute"
		Then the user verifies given maximum no. of star allowed field only enabled for "1"st feedback
		And the user enter the "1"st feeback rating for 1 star as "Poor"
		And the user enter the "1"st feeback rating for 2 star as "Average"
		And the user enter the "1"st feeback rating for 3 star as "Good"
		And the user enters the value for "2"st feedback attribute "Attribute"
		And the user enter the "2"st feeback rating for 1 star as "Poor"
		And the user enter the "2"st feeback rating for 2 star as "Average"
		And the user enter the "2"st feeback rating for 3 star as "Good"
		And the user enters the value for "3"st feedback attribute "Attribute"
		And the user enter the "3"st feeback rating for 1 star as "Poor"
		And the user enter the "3"st feeback rating for 2 star as "Average"
		And the user enter the "3"st feeback rating for 3 star as "Good"
		When the user clicks on save button to save the details
		Then the user can see the popup "successfully updated!."
		And the user verifies that the popup has disappeared
		
	@FBK-04
    Scenario Outline: Create new feedback with duplicate feedback type
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
    And the user click add button to add new feedback type
    And the user pass the new feedback type "New"
    When the user clicks check button to create feedback type
    Then the user can see the popup "Cannot create duplicate feedback type."
		And the user verifies that the popup has disappeared
		
	@FBK-05
    Scenario Outline: Create new feedback with 
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
		And the user selects the feedback type "New"
		And the user enters the feedback name "Internal"
		When the user specify the maximum no. of star allowed for feedback "3"
		And the user enters the value for "1"st feedback attribute "Attribute"
		Then the user verifies given maximum no. of star allowed field only enabled for "1"st feedback
		And the user enter the "1"st feeback rating for 1 star as "Poor"
		And the user enter the "1"st feeback rating for 2 star as "Average"
		And the user enter the "1"st feeback rating for 3 star as "Good"
		And the user clicks on add to include additional feedback
		And the user enters the value for "2"st feedback attribute "New Attribute"
		Then the user verifies given maximum no. of star allowed field only enabled for "2"st feedback
		And the user enter the "2"st feeback rating for 1 star as "Poor"
		And the user enter the "2"st feeback rating for 2 star as "Average"
		And the user enter the "2"st feeback rating for 3 star as "Good"
		
	@FBK-06
    Scenario Outline: Remove and add feeback attribute
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
		And the user selects the feedback type "New"
		And the user enters the feedback name "Internal"
		When the user remove the feeback attribute
		Then the user verifies feedback attribute removed
		When the user adds "2" feedback attribute
		Then the user verifies feeback attribute added
		And the user selects the grade system "EA"
		
	@FBK-07
    Scenario Outline: Edit feeback
    And the user verify the page navigated to "feedback" screen
    When the user clicks on edit button for feeback "New Test"
		Then the user navigates to edit feedback page
		And the user verifies feedback type field is disabled
		And the user enters the feedback name "Demo"
		When the user specify the maximum no. of star allowed for feedback "3"
		And the user enters the value for "1"st feedback attribute "Demo"
		Then the user verifies given maximum no. of star allowed field only enabled for "3"st feedback
		And the user enter the "1"st feeback rating for 1 star as "Poor"
		And the user enter the "1"st feeback rating for 2 star as "Average"
		And the user enter the "1"st feeback rating for 3 star as "Good"
		And the user enters the value for "2"st feedback attribute "Attribute"
		And the user enter the "2"st feeback rating for 1 star as "Poor"
		And the user enter the "2"st feeback rating for 2 star as "Average"
		And the user enter the "2"st feeback rating for 3 star as "Good"
		And the user enters the value for "3"st feedback attribute "Attribute"
		And the user enter the "3"st feeback rating for 1 star as "Poor"
		And the user enter the "3"st feeback rating for 2 star as "Average"
		And the user enter the "3"st feeback rating for 3 star as "Good"
		And the user selects the grade system "EA"
		And the user "checks" hide student name checkbox
		And the user "unchecks" hide student name checkbox
		When the user clicks on save button to save the details
		Then the user can see the popup "successfully updated!."
		And the user verifies that the popup has disappeared
		
	@FBK-08
    Scenario Outline: Edit feeback verify all text and number fields
    And the user verify the page navigated to "feedback" screen
    When the user clicks on edit button for feeback "New Test"
		Then the user navigates to edit feedback page
		And the user verifies feedback type field is disabled
		And the user verify and validate feedback name field
		And the user verify and validate maximum no.of star field
		And the user verify and validate feedback attribute field
		
	@FBK-09
    Scenario Outline: Reset feedback
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
		And the user selects the feedback type "New"
		And the user enters the feedback name "Internal"
		And the user selects the grade system "EA"
		And the user "checks" hide student name checkbox
		When the user clicks on reset button
		Then the user verifies all create new fields are cleared
		
	@FBK-10
    Scenario Outline: Cancel feedback
    And the user verify the page navigated to "feedback" screen
    When the user clicks add button to create new feedback
    Then the user navigates to create new feedback page
		And the user selects the feedback type "New"
		And the user enters the feedback name "Internal"
		When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "feedback" screen
		
		