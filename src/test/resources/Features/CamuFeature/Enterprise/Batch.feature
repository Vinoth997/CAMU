@Enterprise @BatchModule
Feature: Batch Module creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Batch" submodule under Enterprise module
    
  @BAT-01
    Scenario Outline: Verify able to search and navigate to batch module from global search bar
    And the user verify the page navigated to "batch list" screen
    And the user search and select "Batch" in globar search bar
    And the user verify the page navigated to "batch list" screen
    
  @BAT-02
    Scenario Outline: Create new batch with new batch type
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
    And the user click plus button to create new batch type
    And the user verifies create new batch type dialog appears
    And the user enters the new batch type "Bt-"
    When the user clicks on save button to save new batch type
    Then the user can see the popup "saved successfully."
		And the user verifies that the popup has disappeared
		And the user enters the batch name "Bat-"
		When the user clicks on save button to save the details
		Then the user can see the popup "batch saved successfully."
		And the user verifies that the popup has disappeared
		And the user search and verify batch created successfully
		
	@BAT-03
    Scenario Outline: Create new batch
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
		And the user selects the batch type "V-12"
		And the user enters the batch name "Bat-"
		And the user clicks on save button to save the details
		Then the user can see the popup "batch saved successfully."
		And the user verifies that the popup has disappeared
		And the user search and verify batch created successfully
		
	@BAT-04
    Scenario Outline: Create new batch without entering mandatory details
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
    And the user verifies save button is disabled
		
	@BAT-05
    Scenario Outline: Create batch with duplicate batch type
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
    When the user click plus button to create new batch type
    Then the user verifies create new batch type dialog appears
    And the user enters the batch type "V-12"
    When the user clicks on save button to save new batch type
    Then the user can see the popup "Batch type already available."
    And the user verifies that the popup has disappeared
  
  @BAT-06
    Scenario Outline: Create batch with duplicate batch name
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
		And the user selects the batch type "Test batch"
		And the user enter the batch name "4-CSE-A1"
		And the user clicks on save button to save the details
		Then the user can see the popup "Batch name already available."
		And the user verifies that the popup has disappeared
		
	@BAT-07
    Scenario Outline: Update new batch type and reset the updated batch type
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
    And the user click plus button to create new batch type
    And the user verifies create new batch type dialog appears
    And the user enters the new batch type "Bt-"
    When the user clicks on save button to save new batch type
    Then the user can see the popup "saved successfully."
		And the user verifies that the popup has disappeared
		And the user clicks edit batch button to edit the batch type
		And the user verifies edit batch type dialog appears
		And the user edits the batch type "Bt-"
		When the user clicks on update button to update the modification
    Then the user can see the popup "updated successfully."
    And the user verifies that the popup has disappeared
    And the user verifies batch type updated successfully
    And the user clicks edit batch button to edit the batch type
		And the user verifies edit batch type dialog appears
		And the user edits the batch type "Bt-"
		When the user clicks on reset button to revert the modifications
		Then the user verifies that the changes have been reverted
		
	@BAT-08
    Scenario Outline: Cancel edit batch type
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
		And the user selects the batch type "V-12"
		And the user clicks edit batch button to edit the batch type
		And the user verifies edit batch type dialog appears
		And the user edits the batch type "Bt-"
		When the user clicks on cancel button to cancel the changes
		Then the user verifies edit batch type dialog disappears
		
	@BAT-09
    Scenario Outline: Reset create new batch
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
		And the user selects the batch type "V-12"
		And the user enters the batch name "Bat-"
		When the user clicks on reset button
		Then the user verifies batch type and batch name fields are cleared
		
	@BAT-10
    Scenario Outline: Cancel create new batch
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
		And the user selects the batch type "V-12"
		And the user enters the batch name "Bat-"
		When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
		Then the user verify the page navigated to "batch list" screen
		
	@BAT-11
    Scenario Outline: Edit batch
    And the user verify the page navigated to "batch list" screen
		And the user search batch by batch type "Bt-YX66I"
		When the user clicks on edit button for "Bt-YX66I"
		Then the user verifies edit bacth panel appears
		And the user can clear the selected batch type
		And the user verifies batch type is cleared
		And the user selects the batch type "Bt-YX66I"
		And the user clicks edit batch button to edit the batch type
		And the user verifies edit batch type dialog appears
		And the user edit the batch type "Bt-YX66I"
		When the user clicks on update button to update the modification
    Then the user can see the popup "updated successfully."
    And the user verifies that the popup has disappeared
    And the user edit the batch name "Bt-YX66I"
    When the user clicks on update button to update the changes
    Then the user can see the popup "batch updated successfully."
  	And the user verifies that the popup has disappeared
  	
  @BAT-12
    Scenario Outline: Verify new batch type and batch name accept alphabets, numbers and special characters
    And the user verify the page navigated to "batch list" screen
    And the user clicks add button to create new batch
    And the user verifies create new bacth panel appears
    And the user click plus button to create new batch type
    And the user verifies create new batch type dialog appears
    When the user enters the batch type "VVVVVV"
    Then the user verfiy batch type accept "alphabets"
    When the user enters the batch type "1124324"
    Then the user verfiy batch type accept "numbers"
    When the user enters the batch type "!@#$%&*"
    Then the user verfiy batch type accept "special characters"
    And the user close the create new batch type dialog box
    And the user selects the batch type "Bt-YX66I"
    When the user enter the batch name "4-CSE-A1"
    Then the user verfiy batch name accept "alphabets"
    When the user enter the batch name "4-CSE-A1"
    Then the user verfiy batch name accept "numbers"
    When the user enter the batch name "4-CSE-A1"
    Then the user verfiy batch name accept "special characters"
    And the user close create new batch panel
    And the system will ask the confirmation message to cancel
		Then the user verify the page navigated to "batch list" screen
    
    
		