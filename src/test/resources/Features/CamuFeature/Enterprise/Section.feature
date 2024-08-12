@Sections
Feature: Sections Creation and Modification-->CamuJupiter

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Sections" submodule under Enterprise module
    
  @SEC-01
  Scenario Outline: Sections Creation with passing string values
  	Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the section ID "A-"
    And the user can pass the section name "A-"
    And the user can pass the section description "A-"
    And the user can enable the arrear section by clicking the checkbox
    And the user can save the changes by clicking save button
    Then the user cn view the saved confirmation message
    
  @SEC-02
  Scenario Outline: Sections Creation with Numeric values alone
    Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass numeric value for the section ID "1"
    And the user can pass the numeric value for section name "1"
    And the user can pass the numeric value for section description "1"
    And the user can enable the arrear section by clicking the checkbox
    And the user can save the changes by clicking save button
    Then the user cn view the saved confirmation message
    
  @SEC-03
  Scenario Outline: Sections Creation with alphabetical values alone
    Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass alphabetical value for the section ID "SECTION-"
    And the user can pass the alphabetical value for section name "SECTION-"
    And the user can pass the alphabetical value for section description "SECTION-"
    And the user can enable the arrear section by clicking the checkbox
    And the user can save the changes by clicking save button
    Then the user cn view the saved confirmation message
    
  @SEC-04
  Scenario Outline: Duplicate Section creation
  	Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate for the section ID "A"
    And the user can pass the duplicate for section name "A"
    And the user can pass the duplicate for section description "A"
    And the user can enable the arrear section by clicking the checkbox
    And the user can save the changes by clicking save button
    Then the user can view the duplicate section error message
    
  @SEC-05
  Scenario Outline: Section Creation-->Skipping the mandatory field
  	Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    Then the user can view the save button is disabled
    
  @SEC-06
  Scenario Outline: Reset the fields
  	Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate for the section ID "A"
    And the user can pass the duplicate for section name "A"
    And the user can pass the duplicate for section description "A"
    And the user can enable the arrear section by clicking the checkbox
    And the user can reset all the fields by clicking reset button
    Then the user can verify Institution field is resetted
    Then the user can verify sectionId field is resetted
    Then the user can verify section name field is resetted
    Then the user can verify section description field is resetted
    Then the user can verify the arrear section is disabled
    
  @SEC-07
  Scenario Outline:Section creation---> Cancel the changes
  	Then the user verify the page navigated to Section screen
  	When the user create new section by clicking on Add button
    Then the user verify the page navigated to create section screen
    When the user can select the institution "CBCS - CAMU"
    And the user can pass the duplicate for the section ID "A"
    And the user can pass the duplicate for section name "A"
    And the user can pass the duplicate for section description "A"
    And the user can enable the arrear section by clicking the checkbox
    When the user can click the cancel button
    And the user can handle the alert to cancel the changes
    Then the user verify the page navigated to Section screen
    
  @SEC-08
  Scenario Outline:Section Search and Edit the section--->Verify Section Id and description is disabled
 	  Then the user verify the page navigated to Section screen
  	When the user can search the section by passing the section id "SECTION-r"
  	Then the user can view the selected section "SECTION-r"
  	When the user can go to edit option by clicking threedot "SECTION-r"
  	And the user can click on the edit button
  	Then the user can navigated to the edit section screen
  	And the user can verify the section id is diabled
    And the user can verify the section description is disabled
    
  @SEC-09
  Scenario Outline:Section Search and Edit the section--->Verify fields are editable
    Then the user verify the page navigated to Section screen
  	When the user can search the section by passing the section id "SECTION-r"
  	Then the user can view the selected section "SECTION-r"
  	When the user can go to edit option by clicking threedot "SECTION-r"
  	And the user can click on the edit button
  	Then the user can navigated to the edit section screen
  	And the user can pass the duplicate for section name "Section-K"
  	And the user can update the changes by clicking Update button
  	Then the user can view the updated confirmation message
  	And the user verify the page navigated to Section screen
  	When the user can search the section by passing the section id "Section-K"
  	Then the user can view the selected section "Section-K"
  	
  @SEC-10
  Scenario Outline:Section Search and Edit the section--->Cancel the changes
 		When the user can search the section by passing the section id "SECTION-r"
  	Then the user can view the selected section "SECTION-r"
  	When the user can go to edit option by clicking threedot "SECTION-r"
  	And the user can click on the edit button
  	Then the user can navigated to the edit section screen
  	And the user can pass the duplicate for section name "Section-7"
  	When the user can click the cancel button
    And the user can handle the alert to cancel the changes
    Then the user verify the page navigated to Section screen
    
   @SEC-11
  Scenario Outline:Section Search and Edit the section--->Cancel the changes
   When pagination test
  	
  	
  	
    
  	
  	
   