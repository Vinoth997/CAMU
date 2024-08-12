@StudentUpdateTemplate
Feature: Student update template functionality

 @SUT-01
    Scenario: Student update template and verify the updated changes
    Given the user navigates to my camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the student username as "bala@071.com"
    And the user enters the student password as "camu@123"
    When the user clicks on login button
    Then the user lands on institution dashboard
    And the user verify student name profile "BALA S" is displayed
    When the user click on more info button
    And the user verify the page navigated to "Profile info" screen
    And the user clicks on "Student Details" tab
    And the user gets the student mobile number
    And the user opens a new browser tab
    And the user switch to new browser tab
    And the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "cbcs - camuadmin"
    And the user enters the camu password as "camu@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Students" Module from the list of modules
    And the user clicks on "Student List" submodule under Enterprise module
    And the user verify the page navigated to "student" screen
    
    And the user clicks on action dropdown and click "Student Update Template" option
    And the user can see "student update template" popup dialogbox appears
#    And the user clicks on download sample format button
    And the user update the "Sheet1" for "AdmNum" in row "2" value as "15"
    And the user update the "Sheet1" for "AplnNum" in row "2" value as "11001"
    And the user update the "Sheet1" for "CnAdMob" in row "2" value as "9562423333"
    And the user uploads the student updated template
    And the user clicks on update button
    Then the user can see the popup "1student record updated successfully."
	  And the user verifies that the popup has disappeared
		
    And the user switch to previous browser tab
    And the user navigates to my camu app
#    When the user selects the institution as "CBCS - CAMU" from the dropdown
#    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the student username as "bala@071.com"
    And the user enters the student password as "camu@123"
    When the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on more info button
    Then the user verify the page navigated to "Profile info" screen
    And the user clicks on "Student Details" tab
#    And the user gets the student mobile number
    And the user clicks on "Student List" tab
    And the user verifies the mobile number is updated
    
    
    
    
    
    
    
    