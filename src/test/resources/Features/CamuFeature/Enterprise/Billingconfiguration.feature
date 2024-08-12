@BillingConfigurationModule
Feature: Enterprise --Billing configuration screen


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
    And the user clicks on "Billing Configuration" submodule under Enterprise module
    
    @BC-01
    Scenario Outline: Billing configuration--> New sequence number creation
    And the user verify the page landed to"billing configuration"screen
    When the user click on the add button to create sequence number
    Then the user entered into new sequence creation page
    And the user select the institution from the dropdown"CBCS - CAMU"
    And the user enter the alphanumeric value to prefix"1D-"
    And the user enter only numeric value to start number"2"
    And the user enter the alphanumeric value to sufix"A1"
    And the user enter the alphanumeric value to code"A"
    And the user enter the alphanumeric value to description"Tuition fee sequence"
    And the user select the billing item category from the dropdown"Test1"
    And the user click the save
    
    @BC-02
    Scenario Outline: Billing configuration--> New transport bill dates
    And the user verify the page landed to"billing configuration"screen
    When the user click on the add button to new transport bill dates
    Then the user view the create new transport bill dates screen
    And the user can enter the name for transport bill dates"TBD-"
    And the user can select the bill cancel reason from dropdown"Wrong Entry"
    And the user verify by defacult show prompt is enabled
    And the user verify by defacult transport auto billing is enabled
    And the user can select the from date"03-Aug-2024"
    And the user can select the to date"04-Aug-2024"
    And the user can add the single date for Add dates"04-Aug-2024"
    And the user click the save button
    
    @BC-03
    Scenario Outline: Billing configuration--> New transport bill dates with multiple dates
    And the user verify the page landed to"billing configuration"screen
    When the user click on the add button to new transport bill dates
    Then the user view the create new transport bill dates screen
    And the user can enter the name for transport bill dates"TBD-"
    And the user can select the bill cancel reason from dropdown"Wrong Entry"
    And the user verify by defacult show prompt is enabled
    And the user verify by defacult transport auto billing is enabled
    And the user can select the from date"09-Aug-2024"
    And the user can select the to date"10-Aug-2024"
    And the user click the plus for multiple dates"3"
    And the user click the save button
    
    @BC-04 
    Scenario Outline: Billing Configuration --> Search and Edit the transport bill dates
    And the user verify the page landed to"billing configuration"screen
    When the user search the transport bills by using name"T"
    Then the user can see only the searched details
    And the user can click three dot to edit
    And the user can click the edit button
    And the user can enter the name for transport bill dates"TBD-"
    And the user can select the bill cancel reason from dropdown"Wrong Entry"
    And the user can change the show prompt configuration
    And the user can change the transport auto billing is enabled
    And the user can select the from date"09-Aug-2024"
    And the user can select the to date"10-Aug-2024"
    And the user can cancel the added dates""
    And the user click the save button
    
    
    
    
    
    
    
    
    