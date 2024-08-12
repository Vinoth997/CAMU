@Enterprise @CourseMappingModule
Feature: Course Mapping Creation and Modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Courses Mapping" submodule under Enterprise module
    
  @COM-01
    Scenario Outline: Verify able to search and navigate to course mapping module from global search bar
    And the user verify the page navigated to "Course Mapping" screen
    And the user search and select "Courses Mapping" in globar search bar
    And the user verify the page navigated to "Course Mapping" screen
		
	@COM-02
    Scenario Outline: Create new course mapping
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "EVEN"
    And the user click on search button to get course group
    And the user can see course mapping not found information
    #And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user remove the selected course in mandatory field
    And the user clicks add mandatory text field button
    And the user can see mandatory course field appears
    And the user can search and select the course "Programming In Java" and enter hours "80"
    And the user clicks add mandatory text field button
		And the user can search and select the course "Computer Network" and enter hours "80"
		And the user clicks on save button to save the details
		Then the user can see the popup "Course mapping is saved successfully!"
		And the user verifies that the popup has disappeared
		
	@COM-03
    Scenario Outline: Verify that saving is not possible without specifying mandatory courses
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "EVEN ODD"
    And the user click on search button to get course group
    And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user clicks on save button to save the details
		Then the user can see the popup "Mandatory course cannot be empty. Remove the group or add Courses."
		And the user verifies that the popup has disappeared
		
	@COM-04
    Scenario Outline: Verify cancel the changes
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user can search and select the course "Programming In Java" and enter hours "80"
    When the user clicks on cancel button
    Then the user verifies that mandatory course field are disappeared
    
  @COM-05
    Scenario Outline: Verify course completion hourse field accept decimal values
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "S-I"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    When the user can search and select the course "Programming In Java" and enter hours "4.5"
    And the user verifies course completion hourse field accept decimal values
    And the user remove the selected course in mandatory field
    And the user clicks add mandatory text field button
    And the user can see mandatory course field appears
    And the user can search and select the course "Programming In Java" and enter hours "alpha"
    And the user verifies course completion hourse field doesnt accept alphabets
    And the user remove the selected course in mandatory field
    And the user clicks add mandatory text field button
    And the user can see mandatory course field appears
    And the user can search and select the course "Programming In Java" and enter hours "@#@$#"
    And the user verifies course completion hourse field doesnt accept special characters
    
  @COM-06
    Scenario Outline: Reset and verify all fields are cleared
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    When the user clicks on reset button to clear the fields
		Then the user verifies that all fields under course mapping are cleared
		
	@COM-06
    Scenario Outline: Verify able to add multiple mandatory course text fields
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "Computer Application"
    And the user can search and select department "ECE"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    When the user clicks add mandatory text field button
    Then the user verifes that new mandatory text field is added
    
  @COM-07
    Scenario Outline: Add Elective courses
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    #And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user remove the selected course in mandatory field
    And the user clicks add mandatory text field button
    And the user can search and select the course "Programming In Java" and enter hours "80"
    And the user clicks add mandatory text field button
    And the user can search and select the course "Information Architecture" and enter hours "60"
    When the user clicks on add group button
    Then the user can see elective 1 field appears
    And the user can search and select the elective 1 course "Computer Network" and enter hours "50"
    And the user clicks on save button to save the details
		#Then the user can see the popup "Course mapping is saved successfully!"
		And the user verifies that the popup has disappeared
		
	@COM-08
    Scenario Outline: Add/select duplicate mandatory course under elective course
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "Computer Science"
    And the user can search and select department "CSE"
    And the user can search and select semester/year "Semester-II"
    And the user click on search button to get course group
    And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user can search and select the course "Information Architecture" and enter hours "60"
    When the user clicks on add group button
    Then the user can see elective 1 field appears
    And the user can search and select the elective 1 course "Information Architecture" and enter hours "50"
    #And the user clicks on save button to save the details
		Then the user can see the popup contains "already available in mandatory subjects"
		And the user verifies that the popup has disappeared
		
	@COM-09
    Scenario Outline: Add and Remove multiple Elective courses group
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CSE-IT"
    And the user can search and select semester/year "Semester-II"
    And the user click on search button to get course group
    And the user can see course mapping not found information
    And the user clicks on add group button
    And the user can see mandatory course field appears
    And the user can search and select the course "Programming In Java" and enter hours "80"
    And the user can search and select the course "Information Architecture" and enter hours "60"
    When the user clicks on add group button
    Then the user can see elective 1 field appears
    And the user can search and select the elective 1 course "Computer Network" and enter hours "50"
    #And the user clicks on update button to update the details
		#Then the user can see the popup "Course mapping is updated successfully!"
		#And the user verifies that the popup has disappeared
		When the user clicks on add group button
    Then the user can see elective 2 field appears
    And the user can search and select the elective 2 course "C Programming" and enter hours "40"
    When the user remove the selected course in elective 2 field
    Then the user can see elective 2 text field disappears
    When the user close the elective 2 field
    Then the user can see elective 2 field disappears
    When the user remove the selected course in elective 1 field
    Then the user can see elective 1 text field disappears
    When the user close the elective 1 field
    Then the user can see elective 1 field disappears
		
	@COM-10
    Scenario Outline: Remove Elective selected courses and update without closing Elective tab 
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    #And the user clicks on add group button
    And the user can see mandatory course field appears
    #And the user can search and select the course "Programming In Java" and enter hours "80"
    #And the user can search and select the course "Information Architecture" and enter hours "60"
    #When the user clicks on add group button
    Then the user can see elective 1 field appears
    #And the user can search and select the elective 1 course "Computer Network" and enter hours "50"
    When the user remove the selected course in elective 1 field
    Then the user can see elective 1 text field disappears
    And the user clicks on update button to update the details
		Then the user can see the popup "Elective 1 cannot be empty. Remove the group or add Courses."
		And the user verifies that the popup has disappeared
		
	@COM-11
    Scenario Outline: Remove Elective selected courses and update after closing Elective tab 
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    #And the user clicks on add group button
    And the user can see mandatory course field appears
    #And the user can search and select the course "Programming In Java" and enter hours "80"
    #And the user can search and select the course "Information Architecture" and enter hours "60"
    #When the user clicks on add group button
    Then the user can see elective 1 field appears
    #And the user can search and select the elective 1 course "Computer Network" and enter hours "50"
    When the user remove the selected course in elective 1 field
    Then the user can see elective 1 text field disappears
    When the user close the elective 1 field
    Then the user can see elective 1 field disappears
    And the user clicks on update button to update the details
		Then the user can see the popup "Course mapping is updated successfully!"
		And the user verifies that the popup has disappeared
    
  @COM-12
    Scenario Outline: Remove added mandatory course and update
    And the user verify the page navigated to "course mapping" screen
    #And the user can search and select institution "CBCS - CAMU"
    And the user can search and select degree "UG"
    And the user can search and select program "BE - Demo"
    And the user can search and select department "CS"
    And the user can search and select semester/year "Semester-1"
    And the user click on search button to get course group
    #And the user can see course mapping not found information
    #And the user clicks on add group button
    And the user can see mandatory course field appears
    #And the user can search and select the course "Programming In Java" and enter hours "80"
    #And the user can search and select the course "Computer Network" and enter hours "80"
    When the user remove the selected course in mandatory field
    Then the user can see mandatory course text field disappears
    And the user clicks on update button to update the details
		Then the user can see the popup "Mandatory course cannot be empty. Remove the group or add Courses."
		And the user verifies that the popup has disappeared
    
		