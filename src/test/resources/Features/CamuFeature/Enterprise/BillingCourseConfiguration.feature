@Enterprise @BillingCourseConfiguration
Feature: Billing course configuration creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Billing Course Configuration" submodule under Enterprise module
    
  @BCC-01
    Scenario Outline: Verify able to search and navigate to billing course configuration module from global search bar
    And the user verify the page navigated to "billing course configuration" screen
    And the user search and select "Billing Course Configuration" in globar search bar
    And the user verify the page navigated to "billing course configuration" screen
    
   @BCC-02
    Scenario Outline: Add new billing policy and academic year with active status
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "MECHANICAL"
    And the user clicks on search button
    When the user click add to add billing policy
    Then the user verify billing policy dialog appears
    And the user selects the billing policy "Regular"
    When the user clicks on save button
    Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
    And the user verify new billing policy for "CBCS - CAMU", "EEE", "Regular" added
    When the user click add to add academic year
    Then the user verify create academic year dialog appears
    And the user selects the academic year "2005"
    And the user selects the due date "07-Nov-2024"
    And the user "checks" active checkbox
    When the user clicks on save button
    Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user clicks on next page button
		And the user verify new academic year created with "CBCS - CAMU", "2005", "07-Nov-2024" status "Yes"
		
	@BCC-03
    Scenario Outline: Add new billing policy and academic year with non-active status
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "Test1"
    And the user clicks on search button
    When the user click add to add billing policy
    Then the user verify billing policy dialog appears
    And the user selects the billing policy "Regular"
    When the user clicks on save button
    Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
    And the user verify new billing policy for "CBCS - CAMU", "Test1", "Regular" added
    When the user click add to add academic year
    Then the user verify create academic year dialog appears
    And the user selects the academic year "2024d"
    And the user selects the due date "07-Nov-2024"
    And the user "unchecks" active checkbox
    When the user clicks on save button
    Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user clicks on next page button under academic year
		And the user verify new academic year created with "CBCS - CAMU", "2024d", "07-Nov-2024" status "No"
		
	@BCC-04
    Scenario Outline: Add academic year with duplicate data
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "EEE"
    And the user clicks on search button
		When the user click add to add academic year
    Then the user verify create academic year dialog appears
    And the user selects the academic year "2024"
    Then the user can see the popup "Duplicate data found"
		And the user verifies that the popup has disappeared
		
	@BCC-05
    Scenario Outline: Add multiple billing policy
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "Test1"
    And the user clicks on search button
    When the user click add to add billing policy
    Then the user verify billing policy dialog appears
    When the user remove selected billing policy
    Then the user verify selected billing policy removed
    And the user selects multiple billing policy "Regular , 1Sem Regular"
    When the user clicks on save button
    Then the user can see the popup "successfully saved!"
		
	@BCC-06
    Scenario Outline: Reset and verify fields cleared
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "EEE"
    And the user clicks on reset button to clear the fields
    And the user verify institution field is cleared
    And the user verify department field is cleared
    
  @BCC-06
    Scenario Outline: Cancel billing course and academic year
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "MECHANICAL"
    And the user clicks on search button
    When the user click add to add billing policy
    Then the user verify billing policy dialog appears
    And the user selects the billing policy "Regular"
    When the user clicks on cancel button
    Then the user verify the page navigated to "billing course configuration" screen
    When the user click add to add academic year
    Then the user verify create academic year dialog appears
    And the user selects the academic year "2024d"
    And the user selects the due date "07-Nov-2024"
    And the user "checks" active checkbox
    When the user clicks on cancel button
    Then the user verify the page navigated to "billing course configuration" screen
    
  @BCC-07
    Scenario Outline: Edit billing policy
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "EEE"
    And the user clicks on search button
    #And the user search billing policy "Regular"
    And the user filter the search result for billing policy as "50"
    And the user click edit billing policy by department "EEE" and billing policy "Regular"
    Then the user verify billing policy dialog appears
    When the user remove selected billing policy
    Then the user verify selected billing policy removed
    
   @BCC-08
    Scenario Outline: Edit academic year
    And the user verify the page navigated to "billing course configuration" screen
    And the user verify institution "CBCS - CAMU" is selected
    And the user selects the department "EEE"
    #And the user search academic year "2023"
    And the user filter the search result for academic year as "50"
    And the user click edit academic year by year "2023" and due date "21-Mar-2024"
    #And the user selects the academic year "2024d"
    And the user verifies academic year drop down field is disabled
    And the user selects the due date "07-Nov-2024"
    And the user "checks" active checkbox
    And the user "unchecks" active checkbox
    When the user clicks on update button to update the changes
    Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
    
    
    
    
    
    
    
    
    
    
    
    
    
		