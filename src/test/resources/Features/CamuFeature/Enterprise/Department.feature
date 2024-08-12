@Department
Feature: Department Creation and Modification-->CamuJupiter

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    #Then the user lands on "CBCS - CAMU" institution dashboard
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Dept./Category" submodule under Enterprise module
    
  @Dep-01
  Scenario Outline: Department Creation with passing string values
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the department code "Civil-"
    And the user can pass the department name "Civil-"
    And the user can pass the department description "Civil Engineering"
   # And the user can verify the sanctioned strength allow alphabets "a"
    And the user can pass the numerical value for sanctioned strength "50"
   # And the user can verify the additional seats sanctioned allow alphabets "a"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can save the details by clicking save button
    Then the user can verify saved confirmation message
    
  @Dep-02
  Scenario Outline: Department Creation with duplicate data
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate department code "CSE" 
    And the user can pass the duplicate department name "CSE"
    And the user can pass the department description "Department of Computer Science"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can save the details by clicking save button
    Then the user can view the duplicate error message
    
  @Dep-03
  Scenario Outline: Department Creation with mandatory field alone
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the department code "Civil-"
    And the user can pass the department name "Civil-"
    And the user can save the details by clicking save button
    Then the user can verify saved confirmation message
    
  @Dep-04
  Scenario Outline: Department Creation with passing Numeric values alone
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate department code "12345" 
    And the user can pass the duplicate department name "12345"
    And the user can pass the department description "12345"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can save the details by clicking save button
    Then the user can verify saved confirmation message
    
  @Dep-05
  Scenario Outline: Department Creation with passing Special characters alone
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate department code "(/:'}!@#$%^&)" 
    And the user can pass the duplicate department name "(/:'}!@#$%^&)"
    And the user can pass the department description "(/:'}!@#$%^&)"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can save the details by clicking save button
    Then the user can verify saved confirmation message
    
  @Dep-06
  Scenario Outline: Creation of new department with skipping the mandatory field
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can save the details by clicking save button
    Then the user can verify the error message This field is required
    
  @Dep-07
  Scenario Outline: Reset the fields and cancel the changes
    Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the department code "Civil-"
    And the user can pass the department name "Civil-"
    And the user can pass the department description "Civil Engineering"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can reset the changes by clicking reset button
    Then the user can verify Institution field is resetted
    And the user can verify Departmentcode field is resetted
    And the user can verify Departmentname field is resetted
    And the user can verify Departmentdescription field is resetted
    And the user can verify sanctioned strength field is resetted
    And the user can verify additional seats sanctioned field is resetted
    And the user can verify Department head field is resetted
    When the user can click the cancel button
    Then the user verify the page navigated to department screen
    
  @Dep-08
  Scenario Outline: Cancel the updated changes
  	Then the user verify the page navigated to department screen
  	When the user create new department by clicking on Add button
    Then the user verify the page navigated to create department screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the department code "Civil-"
    And the user can pass the department name "Civil-"
    And the user can pass the department description "Civil Engineering"  
    When the user can click the cancel button
    And the user can handle the alert to cancel the changes
    Then the user verify the page navigated to department screen
    
  @Dep-09
  Scenario Outline: Edit the Department--> Verify Institution field is disabled
  	When the user can search the department by passing the department id "A1@2"
  	Then the user can view the selected department "A1@2"
  	When the user can go to edit option by clicking threedot "A1@2"
  	And the user can click on the edit button
  	Then the user can navigated to the edit screen
  	When the user can verify the institution field is disabled while editing
  	And the user can update the changes by clicking Update button
  	Then the user verify the page navigated to department screen
    
  @Dep-10
  Scenario Outline: Edit the Department--> Verify all other fields are editable
  	When the user can search the department by passing the department id "A1@2"
  	Then the user can view the selected department "A1@2"
  	When the user can go to edit option by clicking threedot "A1@2"
  	And the user can click on the edit button
  	Then the user can navigated to the edit screen
  	And the user can pass the duplicate department code "A1@2" 
    And the user can pass the duplicate department name "Testing Department"
    And the user can pass the department description "Testing Department"
    And the user can pass the numerical value for sanctioned strength "50"
    And the user can pass the numerical value for additional seats sanctioned "5"
    And the user can select the department head "Livin"
    And the user can update the changes by clicking Update button
    Then the user verify the page navigated to department screen
  
  @Dep-11
  Scenario Outline: Edit the Department--> cancel the changes
  	When the user can search the department by passing the department id "A1@2"
  	Then the user can view the selected department "A1@2"
  	When the user can go to edit option by clicking threedot "A1@2"
  	And the user can click on the edit button
  	Then the user can navigated to the edit screen
  	And the user can pass the duplicate department code "A1@2" 
    And the user can pass the duplicate department name "Testing Department"
    And the user can pass the department description "Testing Department"
    When the user can click the cancel button
    And the user can handle the alert to cancel the changes
    Then the user verify the page navigated to department screen 
  	
  @Dep-12
  Scenario Outline: Search the invalid department
    When the user can search the department by passing the department id "COPPER"
    Then the user can view the error message as no departments are found
    
  @Dep-13
  Scenario Outline: Edit the Department--> Verify Sanctioned strength and additional seats does not allow alphabetical value 
    When the user can search the department by passing the department id "A1@2"
  	Then the user can view the selected department "A1@2"
  	When the user can go to edit option by clicking threedot "A1@2"
  	And the user can click on the edit button
  	Then the user can navigated to the edit screen
  	And the user can pass the duplicate department code "A1@2" 
  	And the user can pass the numerical value for sanctioned strength "a"
  	Then the user can verify the strength field does not allow alphabets
    And the user can pass the numerical value for additional seats sanctioned "b"
    Then the user can verify the additional seats field does not allow alphabets