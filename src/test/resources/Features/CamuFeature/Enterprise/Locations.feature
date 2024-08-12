@Enterprise @LocationModule
Feature: Campus Module creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Locations" submodule under Enterprise module
    
  @LOC-01
    Scenario Outline: Verify able to search and navigate to location module from global search bar
    And the user verify the page navigated to "locations" screen
    And the user search and select "Locations" in globar search bar
    And the user verify the page navigated to "locations" screen
    
  @LOC-02
    Scenario Outline: Create new location
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-nB2w9"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user inputs "20" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    And the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user search and verify location created successfully
		
	@LOC-03
    Scenario Outline: Create new location with hostel facility
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user verifies gender field is displayed and enabled
		And the user verifies room category field is displayed and enabled
		And the user selects the gender as "Male"
		And the user selects the room category "Single"
		And the user verifies no. of rows field is disabled
		And the user verifies no. of seats per row field is disabled
    When the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user search and verify location created successfully
		
	@LOC-04
    Scenario Outline: Create new location with new room category
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user verifies gender field is displayed and enabled
		And the user verifies room category field is displayed and enabled
		And the user selects the gender as "Male"
		And the user clicks on add room category button
		And the user verfies add new room category dialog appears
		And the user enters the room category name "A-"
		And the user selects billing item "Test bill-Test bill"
		When the user clicks save to add newly created room category
		Then the user can see the popup "record saved successfully"
		And the user verifies that the popup has disappeared
		#And the user selects the newly created room category
		And the user verifies newly created room category is selected
		When the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user search and verify location created successfully
		
	@LOC-05
    Scenario Outline: Create new location with duplicate room category
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		And the user clicks on add room category button
		And the user verfies add new room category dialog appears
		And the user enters the duplicate room category name "AC-Room"
		And the user selects billing item "Test bill-Test bill"
		When the user clicks save to add newly created room category
		Then the user can see the popup "Already name exists"
		And the user verifies that the popup has disappeared
		
	@LOC-06
    Scenario Outline: Cancel new location creation
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-nB2w9"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user inputs "20" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "locations" screen
    
  @LOC-07
    Scenario Outline: Cancel new location creation with hostel facilty
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user verifies gender field is displayed and enabled
		And the user verifies room category field is displayed and enabled
		And the user selects the gender as "Male"
		And the user selects the room category "Single"
		And the user verifies no. of rows field is disabled
		And the user verifies no. of seats per row field is disabled
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "locations" screen
    
   @LOC-08
    Scenario Outline: Cancel new room category creation
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user verifies gender field is displayed and enabled
		And the user verifies room category field is displayed and enabled
		And the user selects the gender as "Male"
		And the user clicks on add room category button
		And the user verfies add new room category dialog appears
		And the user enters the room category name "A-"
		And the user selects billing item "Test bill-Test bill"
		When the user clicks cancel to cancel the created room category
		Then the user navigates to create new location page
		
	@LOC-09
    Scenario Outline: Reset new location creation
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-nB2w9"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user inputs "20" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    When the user clicks on reset button
    Then the user verifies all create new location fields are cleared
    
  @LOC-10
    Scenario Outline: Reset new location creation hotel facility
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-u1M0p"
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user selects the gender as "Male"
		And the user selects the room category "Single"
    When the user clicks on reset button
    Then the user verifies all the create new location fields are cleared
    
  @LOC-11
    Scenario Outline: Verify fields accept alphabets, special characters and numerical values
    And the user verify the page navigated to "locations" screen
    When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user selects the campus "Campus_A"
    And the user selects the facility "Fac-nB2w9"
    And the user verifies location id can accept alphabets, numeric and special characters
    And the user verifies location name can accept alphabets, numeric and special characters
    And the user verifies capacity only accept numeric values
    And the user verifies no of rows accepts only numeric values
    And the user verifies no of seats per row accepts only numeric values
    
  @LOC-12
    Scenario Outline: Edit location
    And the user verify the page navigated to "locations" screen
    And the user search location list by location id "Loc-cFs56"
    When the user clicks on edit button for "Loc-cFs56"
    And the user navigates to edit location page
    And the user verifies campus field is disabled
    And the user selects the facility "Fac-J69Gx"
    And the user can edit the location Id "Loc-cFs56"
    And the user can edit the location name "Loc-vF0T9"
    And the user inputs "20" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    When the user clicks on update button to update the changes
    Then the user can see the popup "successfully updated!."
  	And the user verifies that the popup has disappeared
		
	@LOC-13
    Scenario Outline: Edit location with hostel facility
    And the user verify the page navigated to "locations" screen
    And the user search location list by location id "Loc-1U6RV"
    When the user clicks on edit button for "Loc-1U6RV"
    And the user navigates to edit location page
    And the user verifies campus field is disabled
    And the user selects the facility "Fac-u1M0p"
    And the user can edit the location Id "Loc-1U6RV"
    And the user can edit the location name "Loc-62HiA"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user selects the gender as "Male"
		And the user selects the room category "Single"
    When the user clicks on update button to update the changes
    Then the user can see the popup "successfully updated!."
  	And the user verifies that the popup has disappeared
  	
 	@LOC-14
    Scenario Outline: Cancel location modification
    And the user verify the page navigated to "locations" screen
    And the user search location list by location id "Loc-cFs56"
    When the user clicks on edit button for "Loc-cFs56"
    And the user navigates to edit location page
    And the user verifies campus field is disabled
    And the user selects the facility "Fac-J69Gx"
    And the user can edit the location Id "Loc-cFs56"
    And the user can edit the location name "Loc-vF0T9"
    And the user inputs "21" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "locations" screen
    
  @LOC-15
    Scenario Outline: Remove bed capacity
    And the user verify the page navigated to "locations" screen
    And the user search location list by location id "Loc-1U6RV"
    When the user clicks on edit button for "Loc-1U6RV"
    And the user navigates to edit location page
    And the user verifies campus field is disabled
    And the user selects the facility "Fac-u1M0p"
    And the user can edit the location Id "Loc-1U6RV"
    And the user can edit the location name "Loc-62HiA"
    And the user verifies bed button is "enabled"
    And the user inputs "21" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user verify and remove "7" beds
		And the user verfies the beds removed is equal to capacity
    
    
    
		
		
    