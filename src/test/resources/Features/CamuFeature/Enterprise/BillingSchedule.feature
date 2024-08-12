@Enterprise @BillingSchedule
Feature: Billing schedule functionality

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "cbcs - camuadmin"
    And the user enters the camu password as "camu@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Students" Module from the list of modules
    And the user clicks on "Student List" submodule under Enterprise module
    
  @BIS-01
    Scenario Outline: Billing schedule - remove all the selected bills
    And the user verify the page navigated to "student" screen
    And the user enters the student admission no. "16"
    And the user clicks on search button
    When the user click student by admission no. "16"
    And the user navigates to the student record page
    Then the user verify the student record by admission no. "16"
    And the user clicks "view bills" option from student record
    #And the user verify the page navigated to "billing schedule"	
    And the user verify the page navigated to "billing schedule" screen
    And the user selects the billing item "PRACTICAL FEE"
    And the user close the bill item scheduled warning popup
    And the user clicks the bill button
    And the user selects "ALL" under filter applied
    And the user verify the bill item "PRACTICAL FEE" status was "Unpaid"
    And the user remove all the selected bill item
    And the user selects the billing item "TUITION FEE"
    And the user close the bill item scheduled warning popup
    And the user clicks the bill and receipt button
    And the user selects "ALL" under filter applied
    And the user verify the bill item "TUITION FEE" status was "Settled"
    And the user remove all the selected bill item
    
  @BIS-02
    Scenario Outline: Billing schedule - verify bill item status
    And the user verify the page navigated to "student" screen
    And the user enters the student admission no. "16"
    And the user clicks on search button
    When the user click student by admission no. "16"
    And the user navigates to the student record page
    Then the user verify the student record by admission no. "16"
    And the user clicks "view bills" option from student record
    And the user verify the page navigated to "billing schedule" screen
    And the user clicks on "schedule bills" button
    And the user selects the bill item "HOSTEL FEE"
    And the user selects the frequency "One Time"
    And the user selects the due date for the bill item "21-Aug-2024"
    And the user enters the no. of pays "1"
    And the user clicks plus button to add another bill item
    And the user selects the bill item "PRACTICAL"
    And the user selects the frequency "One Time"
    And the user selects the due date for the bill item "25-Aug-2024"
    And the user enters the no. of pays "1"
    And the user save the billing schedule 
    And the user verify the page navigated to "billing schedule" screen
    And the user selects "ALL" under filter applied
    And the user verify the bill item "HOSTEL FEE" status was "Unpaid"
    And the user verify the bill item "PRACTICAL" status was "Unpaid"
      
  @BIS-03
    Scenario Outline: Billing schedule - set common due date for selected bill
    And the user verify the page navigated to "student" screen
    And the user enters the student admission no. "16"
    And the user clicks on search button
    When the user click student by admission no. "16"
    And the user navigates to the student record page
    Then the user verify the student record by admission no. "16"
    And the user clicks "view bills" option from student record
    And the user verify the page navigated to "billing schedule" screen
    And the user clicks on "schedule bills" button
    And the user selects the bill item "HOSTEL FEE"
    And the user selects the frequency "One Time"
    And the user enters the no. of pays "1"
    And the user clicks plus button to add another bill item
    And the user selects the bill item "PRACTICAL"
    And the user selects the frequency "One Time"
    And the user enters the no. of pays "1"
    And the user selects due date as "14-Aug-2025" for all bill item
    And the user clicks apply all button
    And the user verfies due date "14-Aug-2025" is applied to all the selected bill item
    
   @BIS-04
    Scenario Outline: Billing schedule - receipt
    And the user verify the page navigated to "student" screen
    And the user enters the student admission no. "16"
    And the user clicks on search button
    When the user click student by admission no. "16"
    And the user navigates to the student record page
    Then the user verify the student record by admission no. "16"
    And the user clicks "view bills" option from student record
    And the user verify the page navigated to "billing schedule" screen
    #And the user clicks on "schedule bills" button
    #And the user selects the created billing policy "Regular"
    #And the user remove the empty bill item
    #And the user save the billing schedule
    #And the user verify the page navigated to "billing schedule" screen
    And the user selects "ALL" under filter applied
    And the user selects "Show 50" from page filter dropdown
    When the user checks the bill item "THEORY FEE"
    Then the user verify receipts button is enabled
    When the user clicks on "receipts" button
    Then the user see fill the receipt details dialog appears
    And the user enters the received amount
    And the user clicks on save button
    
    
    
    
    