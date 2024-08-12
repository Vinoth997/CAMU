@Enterprise @ProgramModule
Feature: Program Creation and Modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Programs" submodule under Enterprise module
    
    
    @PRG-01
    Scenario Outline: Program Creation
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user can select the program type "B.E"
		And the user can pass the program Id "BE-"
		And the user can pass the program name "BE - Engineering"
		And the user can pass the program description "Program Description"
		And the user can pass the program Details "Bachelor of Engineering (Computer Science)"
		And the user can select the offering department "CSE"
		And the user can pass the sanctioned strength "70"
		And the user can enable the program by clicking on active radio
		And the user can pass the pass mark "35"
		And the user can pass the moderation mark of the program "50"
		And the user can pass the count of maximum number of courses for moderation "5"
		And the user can pass the variance for revaluation of the program "45"
		And the user can pass the academic duration in years "2"
		And the user can pass the assessment duration in years "2"
		And the user can pass the maximum failed credit "5"
		And the user can enter the enquiry manager "Livin"
		When the user can save the program by clicking on save button
		Then the user can see the popup "Successfully saved!"
		And the user verifies that the popup has disappeared
		And the user can search and verify program has created successfully
		
		@PRG-02
    Scenario Outline: Create Program with duplicate Name/ID
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user enters the program type "B.E"
		And the user enters the program Id "BE-CSE"
		And the user enters program name "BE - Computer Science and Engineering"
		And the user can enable the program by clicking on active radio
		When the user can save the program by clicking on save button
		Then the user can see the popup "Cannot create duplicate Course. Name/ID is already used!"
		And the user verifies that the popup has disappeared
		
		@PRG-03
    Scenario Outline: Verify error message for mandatory fields
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user click reset button
		When the user can save the program by clicking on save button
		Then the user can see "This field is required" error message under "institution" field
		And the user can see "This field is required" error message under "degree" field
		And the user can see "This field is required" error message under "program type" field
		And the user can see "This field is required" error message under "program Id" field
		And the user can see "This field is required" error message under "program name" field
		
		@PRG-04
    Scenario Outline: Verify and validate Active status popup
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user enters the program type "B.E"
		And the user enters the program Id "BE-CSE"
		And the user enters program name "BE - Computer Science and Engineering"
		When the user can save the program by clicking on save button
		#Then the user can see "Cannot create duplicate Course. Name/ID is already used!" popup notification
		Then the user can see the popup "Active status field is required."
		And the user verifies that the popup has disappeared
		
		@PRG-05
    Scenario Outline: Verify fields accept alphabets, special characters and numerical values
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user verifies text fields accept "alphabet" values
		And the user click reset button
		And the user verifies text fields accept "numeric" values
		And the user click reset button
		And the user verifies text fields accept "special character" values
		And the user click reset button
		And the user verifies number fields accept "numeric" values
		And the user click reset button
		And the user verifies number fields doesnt accept "alphabet" values
		And the user click reset button
		And the user verifies number fields doesnt accept "special character" values
		And the user click reset button
		And the user verifies fields accept alphanumeric values
		And the user click reset button
		And the user verifies number fields doesnt accept alphanumerical values
		
		@PRG-06
    Scenario Outline: Click on Reset button and verify all fields are cleared
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user can select the program type "B.E"
		And the user can pass the program Id "BE-"
		And the user can pass the program name "BE - Engineering"
		And the user can pass the program description "Program Description"
		And the user can pass the program Details "Bachelor of Engineering (Computer Science)"
		And the user can select the offering department "CSE"
		And the user can pass the sanctioned strength "70"
		And the user can enable the program by clicking on active radio
		And the user can pass the pass mark "35"
		And the user can pass the moderation mark of the program "50"
		And the user can pass the count of maximum number of courses for moderation "5"
		And the user can pass the variance for revaluation of the program "45"
		And the user can pass the academic duration in years "2"
		And the user can pass the assessment duration in years "2"
		And the user can pass the maximum failed credit "5"
		And the user can enter the enquiry manager "Livin"
		When the user click reset button
		Then the user verifies that all fields are cleared
		
		@PRG-07
    Scenario Outline: Click on cancel button and navigates to previous page
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		And the user enters the program type "B.E"
		And the user enters the program Id "BE-CSE"
		And the user enters program name "BE - Computer Science and Engineering"
		And the user can enable the program by clicking on active radio
		When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "Programs" screen
		
		@PRG-08
    Scenario Outline: Edit and update a program
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user enters the program type "B.E"
		And the user enters the program Id "BE-Demo"
		And the user enters program name "BE - Demo"
		And the user can pass the program description "BE - Demo"
		And the user can pass the program Details "Bachelor of Engineering"
		And the user can select the offering department "CSE"
		And the user can pass the sanctioned strength "70"
		And the user can disable the program by clicking on active radio
		And the user can pass the pass mark "35"
		And the user can pass the moderation mark of the program "50"
		And the user can pass the count of maximum number of courses for moderation "5"
		And the user can pass the variance for revaluation of the program "45"
		And the user can pass the academic duration in years "2"
		And the user can able to check variance checkbox
		And the user can able to uncheck variance checkbox
		And the user can pass the assessment duration in years "2"
		And the user can able to check part time checkbox
		And the user can able to uncheck part time checkbox
		And the user can pass the maximum failed credit "5"
		And the user can edit the enquiry manager "Livin"
		When the user can update the program by clicking on update button
		Then the user can see the popup "Successfully Updated!."
		And the user verifies that the popup has disappeared
		
		@PRG-09
    Scenario Outline: Edit program - verify institution and degree fields are diabled
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user verifies institution and degree fields are disabled
		
		@PRG-10
    Scenario Outline: Reset institution, degree and verify both fields are cleared
    And the user verify the page navigated to "Programs" screen
    When the user create new program by clicking on Add button
    Then the user verify the page navigated to create program screen
    And the user can select the institution "CBCS - CAMU"
		And the user can select the degree "UG"
		When the user click reset button
		Then the user verifies institution and degree fields are cleared
		
		@PRG-10
    Scenario Outline: Edit enquiry manager and clear and verify enquiry manager field is cleared
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user remove the selected enquiry manager
    And the user can enter the enquiry manager "Livin"
    And the user can enter the enquiry manager "John"
    And the user can enter the enquiry manager "CBCS"
    When the user remove the selected enquiry manager
    Then the user can verify enter enquiry manager name field is cleared 
		
		@PRG-11
    Scenario Outline: Edit the program status active/deactive
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
		And the user can enable the program by clicking on active radio
		When the user can update the program by clicking on update button
		Then the user can see the popup "Successfully Updated!."
		And the user verifies that the popup has disappeared
		When the user search program by program Id "BE-Demo"
		Then the user can see the program "BE-Demo" status changed to active
    And the user clicks on edit button for "BE-Demo"
		And the user can disable the program by clicking on active radio
		When the user can update the program by clicking on update button
		#Then the user can see "Successfully Updated!."
		Then the user can see the popup "Successfully Updated!."
		And the user verifies that the popup has disappeared
		When the user search program by program Id "BE-Demo"
		Then the user can see the program "BE-Demo" status changed to deactive
		
		@PRG-12
    Scenario Outline: Edit the program add curicullam syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user click on add button under curriculum and syllabus
    And the user selects the syllabus title "Test1"
    And the user enters the syllabus name "Test -"
    And the user uploads the attachment for syllabus
    And the user selects the regulation "R-19" for the syllabus
    When the user clicks submit button to save the syllabus
    #Then the user can see "Successfully saved!" popup notification
    Then the user can see the popup "Successfully saved!"
		And the user verifies that the popup has disappeared
    When the user search the newly added syllabus
    Then the user can see syllabus title "Test1", name and regulation "R-19" added successfully
    
    @PRG-13
    Scenario Outline: Cancel the program add curicullam syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user click on add button under curriculum and syllabus
    And the user selects the syllabus title "Test1"
    And the user enters the syllabus name "Test -"
    And the user uploads the attachment for syllabus
    And the user selects the regulation "R-19" for the syllabus
    When the user can cancel the add syllabus by clicking cancel button
    Then the user verifies it navigates to edit program page
    
    @PRG-14
    Scenario Outline: Verify user cannot attach file more than 1 MB in curriculum syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user click on add button under curriculum and syllabus
    When the user attach a file more than 1 MB
    Then the user can see the popup "Maximum file size allowed is 1.00 MB"
		And the user verifies that the popup has disappeared
    
    @PRG-15
    Scenario Outline: Edit the program delete curicullam syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user search the syllabus by title "Test1"
    And the user clicks on edit button for syllabus "Test1"
    When the user clicks on delete syllabus option
    Then the user can see delete confirmation popup appears
    And the user clicks on yes to delete added syllabus
    Then the user can see the popup "deleted successfully."
		And the user verifies that the popup has disappeared
		
		@PRG-16
    Scenario Outline: Edit the program add new syllabus title under curicullam syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user click on add button under curriculum and syllabus
    When the user clicks add buton to add new title for syllabus
    Then the user can see add new title tab appears
    And the user enters the syllabus title "Test1"
    When the user clicks on submit button to add new syllabus title
    Then the user can see the popup "Already name exixts"
		And the user verifies that the popup has disappeared
		And the user clicks on cancel button to close add new title
		When the user clicks add buton to add new title for syllabus
    Then the user can see add new title tab appears
		And the user enters the new syllabus title
		When the user clicks on submit button to add new syllabus title
		Then the user can search and select the new syllabus title
		And the user enters the syllabus name "Test -"
    And the user uploads the attachment for syllabus
    And the user selects the regulation "R-19" for the syllabus
    When the user clicks submit button to save the syllabus
    #Then the user can see "Successfully saved!" popup notification
    Then the user can see the popup "Successfully saved!"
		And the user verifies that the popup has disappeared
    When the user search the newly added syllabus
    Then the user can see syllabus title "Test1", name and regulation "R-19" added successfully
    
    @PRG-17
    Scenario Outline: Edit the program cancel new syllabus title under curicullam syllabus
    And the user verify the page navigated to "Programs" screen
    And the user search program by program Id "BE-Demo"
    And the user clicks on edit button for "BE-Demo"
    And the user click on add button under curriculum and syllabus
    When the user clicks add buton to add new title for syllabus
    Then the user can see add new title tab appears
    And the user enters the syllabus title "Test1"
    When the user clicks on cancel button on add new title
    #Then the user verifies it closed add new title dialog and remains in add new title main
    And the user verifies add new title dialog is closed
    
    @PRG-18
    Scenario Outline: Verify able to search and navigate to program module from global search 
    Then the user verify the page navigated to "Programs" screen
    And the user search and select "Programs" in globar search bar
    Then the user verify the page navigated to "Programs" screen
    
    @PRG-19
    Scenario Outline: Search invalid program
    And the user verify the page navigated to "Programs" screen
    When the user search program by program Id "VVVVVV"
    Then the user verifies "No data found" information
		    

