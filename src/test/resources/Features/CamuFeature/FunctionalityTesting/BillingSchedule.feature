@Billing
Feature: Billing

 @BI-01
   Scenario Outline: Billing Item
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "cbcs - camuadmin"
    And the user enters the camu password as "camu@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Billing" Module from the list of modules
    And the user clicks on "BillItem Category" submodule under Enterprise module
    And the user verify the page navigated to "billing item category" screen
    And the user clicks on add to create new billing item category
    And the user verify the page navigated to "billing item category" screen
    And the user enters billing item category "Sem-"
    And the user enters bank details "KYC"
    And the user enters bank name "KYC"
    And the user can save the details by clicking save button
    Then the user can see the popup "category added successfully"
    And the user verifies that the popup has disappeared
    And the user clicks on "Billing Item" submodule under Enterprise module
    And the user verify the page navigated to "billing items" screen
    And the user clicks on add button to add create new bill item
    And the user selects the billing item academic year "2023-2024"
    And the user enters the billing item code "BC-"
    And the user enters the billing item name "Theory"
    ##And the user enters the display text ""
    And the user selects the newly created billing item category
    ##And the user selects the bank account details ""
    And the user enters the cost "1000"
    And the user removes the empty cost field
    When the user can save the details by clicking save button
    Then the user can see the popup "billing items created successfully."
    And the user verifies that the popup has disappeared
		And the user clicks on "Billing Schedule" submodule under Enterprise module
    And the user verify the page navigated to "billing schedule" screen
    And the user enters the student admission no. "20"
    #And the user clicks on search button
    And the user clicks on show me the results button
    #When the user click student by admission no. "15"
    And the user clicks more option for the student using roll no. "20"
    And the user clicks on option "Schedule Bills"
    And the user verify the page navigated to "billing schedule" screen
    And the user verify the admission no. "20"
    And the user selects the newly created bill item
  	#And the user selects the bill item "BC-E5b1 - BN-N79f"
    And the user selects the due date for the bill item "25-Aug-2024"
    And the user enters the no. of pays "1"
    And the user save the billing schedule 
    And the user verify the page navigated to "billing schedule" screen
    And the user clicks more option for the student using roll no. "20"
    And the user clicks on option "View Bills"
    And the user selects "ALL" under filter applied
    And the user selects "Show 50" from page filter dropdown
    And the user verify the newly crated bill item status was "Unpaid"
    And the user enters the student admission no. "20"
    And the user clicks on show me the results button
    And the user clicks more option for the student using roll no. "20"
    And the user clicks on option "View Bills"
    And the user verify the page navigated to "billing schedule" screen
    And the user selects "ALL" under filter applied
    And the user selects "Show 50" from page filter dropdown
    When the user checks the newly created bill item
    Then the user verify receipts button is enabled
    When the user clicks on "receipts" button
    Then the user see fill the receipt details dialog appears
    And the user enters the received amount
    And the user clicks on save
    And the user verify the page navigated to "billing schedule" screen
    And the user selects "ALL" under filter applied
    And the user verify the newly crated bill item status was "Part Settled"
    
    
    
    
    
    
    
    
    
    
    
    
