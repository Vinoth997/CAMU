@Enterprise @SemesterModule
Feature: Semester creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Semesters" submodule under Enterprise module
    
    
    @SEM-01
    Scenario Outline: Verify able to search and navigate to semester module from global search bar
    And the user verify the page navigated to "Semesters" screen
    And the user search and select "Semesters" in globar search bar
    Then the user verify the page navigated to "Semesters" screen
    
    @SEM-02
    Scenario Outline: Semester Creation
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user can pass the semester code "SEM-"
    And the user can pass semester/year name "SEM-"
    And the user can pass semester description "Semester Description"
    And the user can pass the new student group name "SEMGRP-"
    And the user click plus button to add the new student group
    And the user can see the popup "New student group created successfully!."
		And the user verifies that the popup has disappeared
    When the user search and select newly added student group
    Then the user verify that the newly created student group is selected
    And the user can pass the display order "3"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    When the user checks initial semester checkbox
    #Then the user can see terminal semester checkbox is unchecked
    #When the user checks terminal semester checkbox
    #Then the user can see initial semester checkbox is unchecked
    When the user can save the semester by clicking save button
    Then the user can see the popup "Semester saved successfully."
		And the user verifies that the popup has disappeared
		And the user can search and verify semester has created successfully
		
		@SEM-03
    Scenario Outline: Create semeter with duplicate code/name
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user enters the semester code "EVEN"
    And the user enters the semester/year name "EVEN"
    And the user checks the send daily homework sms checkbox
    And the user sets the daily sms time "7:30 AM"
    When the user can save the semester by clicking save button
    Then the user can see the popup "Duplicate "
		And the user verifies that the popup has disappeared
		
		@SEM-04
    Scenario Outline: Semester Creation by passing only mandatory field and daily homework sms unchecked
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user can pass the semester code "SEM-"
    And the user can pass semester/year name "SEM-"
    When the user unchecks the send daily homework sms checkbox
    Then the user can see daily sms timer field disappears
    When the user can save the semester by clicking save button
    Then the user can see the popup "Semester saved successfully."
		And the user verifies that the popup has disappeared
		And the user can search and verify semester has created successfully
		
		@SEM-05
    Scenario Outline: Semester Creation by passing only mandatory field and daily homework sms checked
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user can pass the semester code "SEM-"
    And the user can pass semester/year name "SEM-"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    When the user can save the semester by clicking save button
    Then the user can see the popup "Semester saved successfully."
		And the user verifies that the popup has disappeared
		And the user can search and verify semester has created successfully
		
		@SEM-06
    Scenario Outline: Verify able to check and uncheck initial and terminal semester checkbox
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user can pass the semester code "SEM-"
    And the user can pass semester/year name "SEM-"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    When the user checks initial semester checkbox
    Then the user can see terminal semester checkbox is unchecked
    When the user checks terminal semester checkbox
    Then the user can see initial semester checkbox is unchecked
    #When the user can save the semester by clicking save button
    #Then the user can see the popup "Semester saved successfully."
		#And the user verifies that the popup has disappeared
		#And the user can search and verify semester has created successfully
		
		@SEM-07
    Scenario Outline: Click reset and verify fields cleared
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user enters the semester code "EVEN"
    And the user enters the semester/year name "EVEN"
    And the user can pass semester description "Semester Description"
    And the user selects the semester student group ""
    And the user can pass the display order "3"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    And the user checks initial semester checkbox
    When the user clicks on reset button
    Then the user verifies all the field are cleared
    
    @SEM-08
    Scenario Outline: Click cancel and verify navigates to previous page
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user enters the semester code "EVEN"
    And the user enters the semester/year name "EVEN"
    And the user can pass semester description "Semester Description"
    And the user selects the semester student group ""
    And the user can pass the display order "3"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    And the user checks initial semester checkbox
    When the user clicks on cancel button
    And the system will ask the confirmation message to cancel
    And the user verify the page navigated to "Semesters" screen
    
    @SEM-09
    Scenario Outline: Verify fields accept alphabets, special characters and numerical values
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user clicks on reset button
    And the user can select the institution "CBCS - CAMU"
    And the user verifies semester code can accept alphabets, numeric and special characters
    And the user verifies semester/year name can accept alphabets, numeric and special characters
    And the user verifies description can accept alphabets, numeric and special characters
    And the user verifies create new student group can accept alphabets, numeric and special characters
    And the user verifies display order accept only numbers
    And the user checks the send daily homework sms checkbox
    And the user verifies daily sms timer wont accept any values
    
    @SEM-10
    Scenario Outline: Verify not able to create new student group without name and duplicate name
    And the user verify the page navigated to "Semesters" screen
    When the user clicks add button to create new semester
    Then the user verify the page navigated to create new semester screen
    And the user can select the institution "CBCS - CAMU"
    And the user click plus button to add the new student group
    #And the user can see the popup "Please enter a name for student group."
    And the user can see "Please enter a name for student group." popup notification
		And the user verifies that the popup has disappeared
		And the user enters the new student group name "YEAR-1"
		And the user click plus button to add the new student group
    And the user can see "Name already exists. Please enter a different name and try again!." popup notification
		And the user verifies that the popup has disappeared
		
		@SEM-11
    Scenario Outline: Verify able to edit semester and save successfully
    And the user verify the page navigated to "Semesters" screen
    And the user search semester by semester code "SEM-0d5me"
    When the user clicks on edit button for "SEM-0d5me"
    And the user can see it navigated to edit semester page
    And the user enters the semester code "SEM-0d5me"
    And the user enters the semester/year name "SEM-PGM43"
    And the user can pass semester description "Semester Description"
    And the user selects the semester student group "YEAR-1"
    And the user can pass the display order "3"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    And the user checks initial semester checkbox
    When the user clicks on update button to update the changes
    Then the user can see the popup "Semester saved successfully."
		And the user verifies that the popup has disappeared
		
		@SEM-12
    Scenario Outline: Verify able to edit semester and cancel
    And the user verify the page navigated to "Semesters" screen
    And the user search semester by semester code "SEM-0d5me"
    When the user clicks on edit button for "SEM-0d5me"
    And the user can see it navigated to edit semester page
    And the user enters the semester code "EVEN"
    And the user enters the semester/year name "EVEN"
    And the user can pass semester description "Semester Description"
    And the user selects the semester student group ""
    And the user can pass the display order "3"
    When the user checks the send daily homework sms checkbox
    Then the user can see daily sms timer field appears
    And the user sets the daily sms time "6:15 AM"
    And the user checks initial semester checkbox
    When the user clicks on cancel button
    And the system will ask the confirmation message to cancel
    And the user verify the page navigated to "Semesters" screen
    
    @SEM-13
    Scenario Outline: Verify new student group name accept alphabet, numeric and special characters
    And the user verify the page navigated to "Semesters" screen
    And the user search semester by semester code "SEM-0d5me"
    When the user clicks on edit button for "SEM-0d5me"
    And the user can see it navigated to edit semester page
    And the user pass "alphabetic" values in new student group name field
    And the user click plus button to add the new student group
    And the user can see the popup "New student group created successfully!."
		And the user verifies that the popup has disappeared
		And the user pass "numerical" values in new student group name field
    And the user click plus button to add the new student group
    And the user can see the popup "New student group created successfully!."
		And the user verifies that the popup has disappeared
		And the user pass "special character" values in new student group name field
    And the user click plus button to add the new student group
    And the user can see the popup "New student group created successfully!."
		And the user verifies that the popup has disappeared
		
		@SEM-14
    Scenario Outline: Search invalid semester
    And the user verify the page navigated to "Semesters" screen
    When the user search semester by semester code "VVVVV"
    Then the user verifies "No data found" information
    
    
    