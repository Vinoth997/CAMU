@Timetable_Functionality_Test
Feature: Timetable functionality testing - Camu jupiter

Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
  
 @TTF-01  
 Scenario Outline: Timetable creation
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Timetable" submodule under Enterprise module
    When the user can add the configuration by clicking Add button
    And the user can pass the period name "V 1:"
  	And the user can select the start time "10:30 AM"
  	And the user can select the end time "11:30 AM"
  	And the user can save the configuration by clicking save button
  	Then the user can view the save confirmation message
  	And the user verifies that the popup has disappeared
  	And the user search and select "Academic year (Academic Plan)" in globar search bar
    And the user verify the page navigated to "academic year" screen
    And the user can click the add button to create new academic year
    And the user can select the institution using dropdown "CBCS - CAMU"
    And the user can select the start date using date picker "12-Apr-2024"
    And the user can select the end date using date picker "12-Apr-2026"
    And the user can pass the academic code "2024-25:"
    And the user can pass the academic name "2024-2025:"
    And the user can save the academic year by clicking save button
    And the user verifies that the popup has disappeared
    #And the user search and select "Semester Configuration (Academic Plan)" in globar search bar
    #And the user verify the page navigated to "semester configuration" screen
    When the user click on "Academic Plan" Module from the list of modules
    And the user clicks on "Semester Configuration" submodule under Enterprise module
    And the user can verify the institution selected default in the searchbar "CBCS - CAMU"
    And the user refresh the page
    And the user can select the created academic year
    And the user can click the search bar to search the semester configuration
    And the user can select the semester show count in page "Show 50"
    #And the user can select the semester from the semester configuration list "EVEN"
    And the user search the semester in semester configuration "EVEN"
    ##And the user search the newly created semester/year
    And the user clicks more option for the semester "EVEN"
    And the user can click the edit button to edit the semester configuration
    And the user verifies "Semester configuration" panel appears
    And the user selects the semester start date between academic year mentioned
		And the user selects the semester end date between academic year mentioned
		And the user clicks on save button to save the details
		And the user verifies start and end date are updated for the semester "EVEN"
    When the user click on "Academic Plan" Module from the list of modules
    And the user clicks on "Staff Planning" submodule under Enterprise module
    Then the user verify the page navigated to "staff planning" screen
    And the user select the degree "UG"
		And the user select the program "BE - Computer Science and Engineering"
		
		##And the user select the academic year "2024-2025:qbX"
		
		And the user can select the created academic year
		And the user select the department "CSE"
		And the user select the semester/year "EVEN"
		And the user select the section "l"
		And the user clicks on new staff planning
		And the user clicks on find staff and courses
		And the user verifies "new staff planning" dialog box appears
		And the user selects the new staff planning start date "07-May-2024"
		And the user selects the new staff planning end date "30-Aug-2024"
		And the user clicks on create button
		
		And the user remove the last course field
		And the user selects the course "19CS101" under staff planning
		And the user selects the staff "Livin" under staff planning
		When the user clicks on save academic plan
		Then the user can see the popup "academic plan is saved successfully"
    And the user verifies that the popup has disappeared
    
 @TTF-03
 Scenario Outline: Time table
    When the user click on "Academic Plan" Module from the list of modules
    And the user clicks on "Timetables" submodule under Enterprise module
    Then the user verify the page navigated to "academic timetable/schedule" screen
    And the user select the degree "UG"
		And the user select the program "BE - Computer Science and Engineering"
		And the user select the academic year "2024-2025:qbX"
		##And the user can select the created academic year
		And the user select the department "CSE"
		And the user select the semester/year "EVEN"
		And the user select the section "l"
	#	And the user clicks on search button
	#	When the user clicks on add button
	#	Then the user can see "create new timetable" popup dialogbox appears
  #  And the user selects the academic timetable start date "13-May-2024"
  #  And the user selects the academic timetable end date "31-May-2024"
  #  And the user clicks on create button
    And the user clicks on search button
    And the user clicks on manage button
    When the user clicks on option "Timetable"
    Then the user can see timetable table field displayed
    And the user clicks timetable session at "12:00 AM" on "Tuesday"
    And the user can see "create period" popup dialogbox appears
    And the user selects newly created period name
    When the user clicks on save button
    Then the user can see the popup "timetable finalised successfully. the changes will be updated to the student & parent portal."
    And the user verifies that the popup has disappeared
    
    
    
 @TTF-02
 Scenario Outline: Staff planning - add and delete course, update start and end date
    When the user click on "Academic Plan" Module from the list of modules
    And the user clicks on "Staff Planning" submodule under Enterprise module
    Then the user verify the page navigated to "staff planning" screen
    And the user select the degree "UG"
		And the user select the program "BE - Computer Science and Engineering"
		
		And the user select the academic year "2024-2025:qbX"
		
		#And the user can select the created academic year
		And the user select the department "CSE"
		And the user select the semester/year "EVEN"
		And the user select the section "l"
		#And the user clicks on new staff planning
		And the user clicks on find staff and courses
    When the user clicks on edit button for the created staff planning
		Then the user verifies "Update Staff Planning" field displayed
		And the user clicks on add new courses button
		
		And the user selects the course "24CS101" under staff planning
		And the user selects the staff "Livin" under staff planning
		And the user selects the staff type "Lecturer" under staff planning
		When the user clicks on save academic plan
		Then the user can see the popup "academic plan is saved successfully"
		And the user verifies that the popup has disappeared
		
		And the user clicks on edit button for the created staff planning
		When the user click on remove the course "24CS101"
		###Then the user can see delete the subject confirmation popup appears
		Then the user can see "do you want to delete the subject?" popup dialogbox appears
		And the user clicks on delete confirmation button
		Then the user verify the course "24CS101" removed from the staff planning
		When the user clicks on save academic plan
	#	Then the user can see the popup "academic plan is saved successfully"
	#	And the user verifies that the popup has disappeared
		When the user clicks on edit button for the created staff planning
		
		When the user clicks on plan period button
		Then the user can see "edit staff planning" popup dialogbox appears
		###And the user verifies edit staff planning dialog appears
		
		And the user edit the staff planning start date "09-May-2024"
		And the user edit the new staff planning end date "30-Aug-2024"
		And the user clicks on update button
		And the user verifies start date has updated to "09-May-2024"
		And the user verifies end date has updated to "30-Aug-2024"
		
		
    
    