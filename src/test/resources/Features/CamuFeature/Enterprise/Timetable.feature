@Timetable->Enterprise
Feature: Timetable Creation and Modification-->CamuJupiter

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Timetable" submodule under Enterprise module
    
  @TT-01
  Scenario Outline: Create Timetable configuration
  	Then the user can verify they lands on create new configuration page
  	When the user can add the configuration by clicking Add button
  	And the user can pass the period name "P_1:"
  	And the user can select the start time "10:30 AM"
  	And the user can select the end time "11:30 AM"
  	And the user can save the configuration by clicking save button
  	Then the user can view the save confirmation message
  	
  @TT-02
  Scenario Outline: Create Timetable configuration with duplicate period name
  	Then the user can verify they lands on create new configuration page
  	When the user can add the configuration by clicking Add button
  	And the user can pass the duplicate period name "P-10"
  	And the user can select the start time "10:30 AM"
  	And the user can select the end time "11:30 AM"
  	And the user can save the configuration by clicking save button
  	Then the user can verify the duplicate error message
  	
  @TT-03
  Scenario Outline: Reset the values - Timetable creation
  	Then the user can verify they lands on create new configuration page
  	When the user can add the configuration by clicking Add button
  	And the user can pass the duplicate period name "P-10"
  	And the user can select the start time "10:30 AM"
  	And the user can select the end time "11:30 AM"
  	And the user can reset the values by clicking reset button
  	Then the user can verify all the values are resetted 
  	
  @TT-04
  Scenario Outline: Cancel the created timetable
  	Then the user can verify they lands on create new configuration page
  	When the user can add the configuration by clicking Add button
  	And the user can pass the duplicate period name "P-10"
  	And the user can select the start time "10:30 AM"
  	And the user can select the end time "11:30 AM"
  	And the user can cancel the details by clicking cancel button
  	
  @TT-05	
  Scenario Outline: search the timetable configuration -- Deactivate the timetable
  	Then the user can verify they lands on create new configuration page
  	When the user can search the timetable by passing period name "P 21"
  	Then the user can view the filtered timetable "P 21"
  	And the user can edit the timetable configuration by cliking threedot "P 21"
  	And the user can change the status by clicking deactivate or active button
  	Then the user verify the updated confirmation message
  	
  @TT-06
  Scenario Outline: Period_Group creation by clicking add button
  	Then the user can verify they lands on create new configuration page
  	When the user clicks period group button to create new period group
  	And the user can add new period group by clicking add button
  	Then the user can view the add period group 
  	And the user can pass and select the institution "CBCS - CAMU"
  	And the user can pass and select the program "Under Graduate - I"
  	And the user can pass and select the course "B.Tech-Information Technology"
  	And the user can pass and select the academic year "2023-2024"
  	And the user can select the periods by enable the checkbox "P 21:,P-10:,P-22:,P_1:"
  	And the user can save the period groups by clicking save button
  	 	 	
  @TT-07 
  Scenario Outline: Period Group creation - Duplicate Period_group 
  	Then the user can verify they lands on create new configuration page
  	When the user clicks period group button to create new period group
  	And the user can add new period group by clicking add button
    Then the user can view the add period group
  	And the user can pass and select the institution "CBCS - CAMU"
  	And the user can pass and select the program "Under Graduate - I"
  	And the user can pass and select the course "B.Tech-Information Technology"
  	And the user can pass and select the academic year "2023-2024"
  	And the user can select the periods by enable the checkbox "P 21:,P-10:,P-22:,P_1:"
  	And the user can save the period groups by clicking save button
  	Then the user can verify the duplicate period group error message
  	
  @TT-08 
  Scenario Outline: Period Group creation - Cancel the creation
  	Then the user can verify they lands on create new configuration page
  	When the user clicks period group button to create new period group
  	And the user can add new period group by clicking add button
    Then the user can view the add period group
  	And the user can pass and select the institution "CBCS - CAMU"
  	And the user can pass and select the program "Under Graduate - I"
  	And the user can pass and select the course "B.Tech-Information Technology"
  	And the user can pass and select the academic year "2023-2024"
  	And the user can select the periods by enable the checkbox "P 21:,P-10:,P-22:,P_1:"
  	When the user clicks on cancel button
    And the system will ask the confirmation message to cancel 
  	
  #@TT-09	
 
 # Scenario Outline: Search the created period group
  	#Then the user can verify they lands on create new configuration page
  	#When the user clicks period group button to create new period group
  	#And the user can search and select the institution ""
  	#And the user can search and select the Program ""
  	#And the user can search and select the Course ""
  	#And the user can search the period group by clicking search button
  	#Then the user can view the created period group
  	
 
  @TT-UOW	
  Scenario Outline: UOW bulk timetable upload
  Then the user can verify they lands on create new configuration page
  And the user can upload the bulk data
  
