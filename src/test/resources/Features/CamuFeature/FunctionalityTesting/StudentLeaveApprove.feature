@Leave
Feature: Student Leave Approve

@SL-01
    Scenario Outline: Student Leave Approve
    Given the user navigates to my camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the student username as "dhar01@123.com"
    And the user enters the student password as "Camu@123"
    When the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Leave" Module from the list of modules
    And the user verify the page navigated to "Leave" screen
    And the user clicks on add button to add new leave
    And the user clear the selected leave type
    And the user selects the user type as "Leave"
    And the user selects the start date "14-May-2024"
    And the user selects the to date "14-May-2024"
    And the user enters the reason for leave "Feeling Sick"
    When the user clicks on save button to create the leave
		Then the user can see the popup "Well done!Leave submitted successfully"
		And the user verifies that the popup has disappeared
		And the user opens a new browser tab
		And the user switch to new browser tab
		Given the user navigates to camu app
		When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "cbcs - camuadmin"
    And the user enters the camu password as "camu@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Students" Module from the list of modules
    And the user clicks on "Student Leave Approval" submodule under Enterprise module
    And the user verify the page navigated to "leave approval" screen
    And the user selects the start date "09-May-2024" in leave 
    And the user selects the end date "15-May-2024" in leave
    And the user selects the leave type as "Leave"
    And the user select and filter the leave status by "All"
    And the user clicks on search button
    And the user checks the student by leave date "14-05-2024 to 14-05-2024" type "Leave" roll no "2022-20232"
    When the user click on action dropdown and select "Approve"
    Then the user can see approve leave for students dialog appears
    And the user clicks on save button
    Then the user can see the popup "leave approved successfully"
		And the user verifies that the popup has disappeared
		And the user switch to previous browser tab
		And the user verifies status for the leave from "14-05-2024" to "14-05-2024" changed to "Approved" 

    
    
    
    
    