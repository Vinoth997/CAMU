@Enrollment
Feature: Student Enrollment

 @SE-01
   Scenario Outline: Student Enrollment
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Students" Module from the list of modules
    And the user clicks on "Student List" submodule under Enterprise module
    And the user verify the page navigated to "student" screen
    And the user clicks on search button
    When the user click student by admission no. "11001"
    And the user navigates to the student record page
    And the user clicks "enrol" option from student record
    And the user verify the page navigated to "student enrollment" screen
    When the user clicks on add enroll course button
    Then the user verifies enroll course dialog appears
    And the user selects enrollment type "Full Registration"
    And the user selects enroll academic year "2023-2024"
    And the user selects enroll semester/year "EVEN"
    And the user selects enroll course "Applied Mathematics - ( R21-CS02 )"
    When the user clicks on proceed button
    Then the user can see enroll course "Applied Mathematics - ( R21-CS02 )" details dialog appears
    #And the user clicks on enroll button
    #And the user verifies the course "Applied Mathematics - ( R21-CS02 )" with course type "Full Registration", academic year "2023-2024", and semester/year "EVEN" is enrolled 
		#Then the user verify status updated to "Enrolled"
		And the user opens a new browser tab
		And the user switch to new browser tab
		And the user navigates to my camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the student username as "bala@071.com"
    And the user enters the student password as "camu@123"
    When the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enrollment" Module from the list of modules
    And the user click on "Semester enrollment" Module from the list of modules
    And the user verify the page navigated to "semester enrollment" screen