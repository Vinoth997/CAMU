@Enterprise @BloomsTaxonomy
Feature: Blooms Taxonomy creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Blooms Taxonomy" submodule under Enterprise module
    
  @BMT-01
    Scenario Outline: Verify able to search and navigate to blooms taxonomy module from global search bar
    And the user verify the page navigated to "blooms taxonomy" screen
    And the user search and select "Blooms Taxonomy" in globar search bar
    And the user verify the page navigated to "blooms taxonomy" screen
    
  @BMT-02
    Scenario Outline: Create new taxoanomy
    And the user verify the page navigated to "blooms taxonomy" screen
    When the user clicks on add button to create new taxonomy
    Then the user verifies create new taxonomy panel appears
    And the user selects the learning domain "Cognitive"
    And the user enters the taxonomy name "TX-"
    And the user enters the taxonomy code "Txc-"
    When the user clicks on save button to save the details
		Then the user can see the popup "created successfully."
		And the user verifies that the popup has disappeared
		And the user search and verify new taxonomy created successfully 
    
  @BMT-03
    Scenario Outline: Create new taxoanomy with duplicate taxonomy name
    And the user verify the page navigated to "blooms taxonomy" screen
    When the user clicks on add button to create new taxonomy
    Then the user verifies create new taxonomy panel appears
    And the user selects the learning domain "Affective"
    And the user pass the taxonomy name "Creating"
    And the user pass the taxonomy code "Creating"
    When the user clicks on save button to save the details
		Then the user can see the popup "Blooms Taxonomy already available."
		And the user verifies that the popup has disappeared
  
  @BMT-04
    Scenario Outline: Edit taxoanomy
    And the user verify the page navigated to "blooms taxonomy" screen
    And the user search taxonomy by name "TX-5R8wG"
    When the user clicks on edit button for "TX-5R8wG"
    Then the user verifies edit taxonomy panel appears
    When the user removed the selected learning domain
    Then the user verify learning domain field is empty
    And the user pass the taxonomy name "TX-5R8wG"
    And the user pass the taxonomy code "TX-5R8wG"
    When the user clicks on update button to update the details
    Then the user verify learning domain field error message
    And the user selects the learning domain "Cognitive"
    When the user clicks on update button to update the details
    Then the user can see the popup "updated successfully."
    And the user verifies that the popup has disappeared
    
   @BMT-05
    Scenario Outline: Reset create new taxoanomy
    And the user verify the page navigated to "blooms taxonomy" screen
    When the user clicks on add button to create new taxonomy
    Then the user verifies create new taxonomy panel appears
    And the user selects the learning domain "Cognitive"
    And the user enters the taxonomy name "TX-"
    And the user enters the taxonomy code "Txc-"
    When the user click on reset to reset the changes
    Then the user verifies fields in edit taxonomy are cleared
    
   @BMT-06
    Scenario Outline: Reset edited taxonomy
    And the user verify the page navigated to "blooms taxonomy" screen
    And the user search taxonomy by name "TX-5R8wG"
    When the user clicks on edit button for "TX-5R8wG"
    Then the user verifies edit taxonomy panel appears
    And the user pass the taxonomy name "TX-00000"
    And the user pass the taxonomy code "TX-00000"
    When the user click on reset to reset the changes
    Then the user verifies modified taxonomy field changes are reverted
    
  @BMT-07
    Scenario Outline: Cancel create new taxoanomy
    And the user verify the page navigated to "blooms taxonomy" screen
    When the user clicks on add button to create new taxonomy
    Then the user verifies create new taxonomy panel appears
    And the user selects the learning domain "Cognitive"
    And the user enters the taxonomy name "TX-"
    And the user enters the taxonomy code "Txc-"
    When the user can cancel the changes by clicking cancel button
    Then the system will ask the confirmation message to cancel
    And the user verify the page navigated to "blooms taxonomy" screen
    
  @BMT-08
    Scenario Outline: Cancel edited taxonomy
    And the user verify the page navigated to "blooms taxonomy" screen
    And the user search taxonomy by name "TX-5R8wG"
    When the user clicks on edit button for "TX-5R8wG"
    Then the user verifies edit taxonomy panel appears
    And the user pass the taxonomy name "TX-00000"
    And the user pass the taxonomy code "TX-00000"
    When the user can cancel the changes by clicking cancel button
    Then the system will ask the confirmation message to cancel
    And the user verify the page navigated to "blooms taxonomy" screen
    
  @BMT-09
    Scenario Outline: Verify taxonomy name and code fields accept alphabets, numbers and special characters
    And the user verify the page navigated to "blooms taxonomy" screen
    When the user clicks on add button to create new taxonomy
    Then the user verifies create new taxonomy panel appears
    And the user selects the learning domain "Cognitive"
    And the user verifies taxonomy name accepts alphabets, numbers and special characters
    And the user verifies taxonomy code accepts alphabets, numbers and special characters
    
    
    