@DegreeModule
Feature: Enterprise --Degree Creation and Modifications


  Background:
  	Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
   # Then the user lands on "CBCS - CAMU" institution dashboard
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Degrees" submodule under Enterprise module
    
    
    @DEG-01 @Camu-Regression
     Scenario Outline: Create New Degree with all the fields
     When the user landed into the Degree page
     Then the user can click the add button to create degree
     When the user entered the create new degree page
     Then the user select the institution from dropdown"CBCS - CAMU"
     And the user enter the degree id"UG-T1"
     And the user enter the degree name"UG-T1"
     And the user enter the degree description"UG-T1"
     And the user enter the minimum age year"1"
     And the user enter the minimum age month"2"
     And the user enter the maximum age year"3"
     And the user enter the maximum age month"2"
     And the user enter the relaxation age year"1"
     And the user enter the relaxation age month"2"
     When the user click on the save button
     Then the user can see the popup "Successfully saved!"
		And the user verifies that the popup has disappeared
		And the user can search and see degree has created successfully
		
	 @DEG-02 @Camu-Regression
	 Scenario Outline: Create New Degree with only mandatory fields
	 	When the user landed into the Degree page
    Then the user can click the add button to create degree
    When the user entered the create new degree page
    Then the user select the institution from dropdown"CBCS - CAMU"
    And the user enter the degree id"UG-T1"
    And the user enter the degree name"UG-T1"
    When the user click on the save button
    Then the user can see the popup "Successfully saved!"
		And the user verifies that the popup has disappeared
		And the user can search and see degree has created successfully
		
		@DEG-03 @Camu-Regression
		Scenario Outline: Create New Degree with duplicate value
		When the user landed into the Degree page
    Then the user can click the add button to create degree
    When the user entered the create new degree page
    Then the user select the institution from dropdown"CBCS - CAMU"
    And the user enter the duplicate degree id"UG"
    And the user enter the duplicate degree name"UG"
    When the user click on the save button
    Then the user can see the popup "Cannot create duplicate Program. Name/Code is already used."
		And the user verifies that the popup has disappeared
		
		@DEG-04 @Camu-Regression
		Scenario Outline: Edit the degree description & verify the institution,degree id and degree name are freezed
		When the user landed into the Degree page
		And the user clicks on degree edit button for "UG"
		When the user landed the edit degree page
		Then the user can see the institution dropdown freezed
		And the user can see the degree id field freezed
		And the user can see the degree name field freezed
		And the user enter the degree description"Description updated"
		When the user click on the save button
		Then the user can see the popup "Successfully Updated!."
		
		
		@DEG-05 @Camu-Regression
		Scenario Outline: Edit the age criteria
		When the user landed into the Degree page
		And the user clicks on degree edit button for "UG"
		When the user landed the edit degree page
		Then the user can see the institution dropdown freezed
		And the user can see the degree id field freezed
		And the user can see the degree name field freezed
		And the user enter the minimum age year"1"
     And the user enter the minimum age month"2"
     And the user enter the maximum age year"3"
     And the user enter the maximum age month"2"
     And the user enter the relaxation age year"1"
     And the user enter the relaxation age month"2"
		When the user click on the save button
		Then the user can see the popup "Successfully Updated!."
		
		@DEG-06 @Camu-Regression
		Scenario Outline: Check the save button is enabled without entering the mandatory fields
		When the user landed into the Degree page
    Then the user can click the add button to create degree
    When the user entered the create new degree page
    Then the user select the institution from dropdown"CBCS - CAMU"
    And the user enter the degree id"UG-T1"
    And the user can see the save button is disabled
    And the user can click the cancel button to go back to degree page
    And the user confirm the alert confirmation to go back to degree page
    When the user landed into the Degree page
    
    @DEG-07 @Camu-Regression
    
    Scenario Outline: Verify the reset button clears all the fields
    When the user landed into the Degree page
     Then the user can click the add button to create degree
     When the user entered the create new degree page
     Then the user select the institution from dropdown"CBCS - CAMU"
     And the user enter the degree id"UG-T1"
     And the user enter the degree name"UG-T1"
     And the user enter the degree description"UG-T1"
     And the user enter the minimum age year"1"
     And the user enter the minimum age month"2"
     And the user enter the maximum age year"3"
     And the user enter the maximum age month"2"
     And the user enter the relaxation age year"1"
     And the user enter the relaxation age month"2"
     When the user clicks the reset button
     Then the user verifies all the fields are cleared
    
    
    
    
		
		
		
		
		
	 
      
     