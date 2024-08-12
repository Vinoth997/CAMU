@Enterprise @CampusModule
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
    And the user clicks on "Campus" submodule under Enterprise module
    
  @CAM-01
    Scenario Outline: Verify able to search and navigate to campus module from global search bar
    And the user verify the page navigated to "campus list" screen
    And the user search and select "Campus" in globar search bar
    And the user verify the page navigated to "campus list" screen
    
  @CAM-02
    Scenario Outline: Campus Creation
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user pass the campus description "Campus block"
    And the user pass the campus address line 1 "101 somestreet"
    And the user pass the campus address line 2 "some colony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user enters the mobile no. "8695425658"
    And the user enters the phone no. "2354699"
    And the user enters the email address "campusblock@mail.com"
    And the user click on save to save the campus created
    When the user can see the popup "Campus record saved successfully!"
		Then the user verifies that the popup has disappeared
		And the user can search and verify campus has created successfully
		
	@CAM-03
    Scenario Outline: Campus Creation with only mandatory fields
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user verifies save button is disabled
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user verifies save button is enabled
    And the user click on save to save the campus created
    When the user can see the popup "Campus record saved successfully!"
		Then the user verifies that the popup has disappeared
		And the user can search and verify campus has created successfully
		
	@CAM-04
    Scenario Outline: Reset Campus Creation
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user pass the campus description "Campus block"
    And the user pass the campus address line 1 "101 somestreet"
    And the user pass the campus address line 2 "some colony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user enters the mobile no. "8695425658"
    And the user enters the phone no. "2354699"
    And the user enters the email address "campusblock@mail.com"
    When the user click on reset to reset the changes
    Then the user verifies all create new campus fields are cleared
    
  @CAM-05
    Scenario Outline: Verify textfields accept alphabets, numbers and special characters
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user enters the campus id "block"
    And the user enters the campus name "block"
    And the user pass the campus description "Campusblock"
    And the user pass the campus address line 1 "somestreet"
    And the user pass the campus address line 2 "somecolony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user verifies all fields accept "alphabets"
    And the user click on reset to reset the changes
    And the user enters the campus id "123445"
    And the user enters the campus name "12234"
    And the user pass the campus description "12334"
    And the user pass the campus address line 1 "12334"
    And the user pass the campus address line 2 "12334"
    And the user pass the campus address line 3 "12334"
    And the user pass the campus address line 4 "12334"
    And the user verifies all fields accept "numbers"
    And the user click on reset to reset the changes
    And the user enters the campus id "!@#$%^&!"
    And the user enters the campus name "!@#$%^&!"
    And the user pass the campus description "!@#$%^&!"
    And the user pass the campus address line 1 "!@#$%^&!"
    And the user pass the campus address line 2 "!@#$%^&!"
    And the user pass the campus address line 3 "!@#$%^&!"
    And the user pass the campus address line 4 "!@#$%^&!"
    And the user verifies all fields accept "special characters"
    And the user click on reset to reset the changes
  
  @CAM-06
    Scenario Outline: Campus Creation with invalid format for mobile no., phone no. and email
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user verifies save button is disabled
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user enters the mobile no. "ashkadas"
    And the user enters the phone no. "askdjlkdk"
    And the user verifies invalid  mobile number format error
    And the user click on reset to reset the changes
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user enters the phone no. "askdjlkdk"
    And the user enters the mobile no. "ashkadas"
    And the user verifies invalid  phone number format error
    And the user click on reset to reset the changes
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user enters the mobile no. "!@^%$%^#"
    And the user enters the phone no. "^@#*^@_&"
    And the user verifies invalid  mobile number format error
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user enters the phone no. "^@#*^@_&"
    And the user enters the mobile no. "!@^%$%^#"
    And the user verifies invalid  phone number format error
    And the user click on reset to reset the changes
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user enters the email address "campusblock"
    And the user enters the mobile no. "ashkadas"
    And the user verifies invalid email id format error
    
  @CAM-07
    Scenario Outline: Cancel Campus Creation
    And the user verify the page navigated to "campus list" screen
    When the user click on add to create new campus
    Then the user verify the page navigated to create new campus page
    And the user pass the campus id "A-"
    And the user pass the campus name "Camp-"
    And the user pass the campus description "Campus block"
    And the user pass the campus address line 1 "101 somestreet"
    And the user pass the campus address line 2 "some colony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user enters the mobile no. "8695425658"
    And the user enters the phone no. "2354699"
    And the user enters the email address "campusblock@mail.com"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "campus list" screen
    
  @CAM-08
    Scenario Outline: Edit campus
    And the user verify the page navigated to "campus list" screen
    And the user search campus list by campus id "Block-k"
    When the user clicks on edit button for "Block-k"
    And the user verifies campus id field is not editable
    And the user pass the campus name "Camp-"
    And the user pass the campus description "Campus block"
    And the user pass the campus address line 1 "101 somestreet"
    And the user pass the campus address line 2 "some colony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user enters the mobile no. "8695425658"
    And the user enters the phone no. "2354699"
    And the user enters the email address "campusblock@mail.com"
    And the user click on update button to update the changes
    When the user can see the popup "Campus record updated successfully!"
		Then the user verifies that the popup has disappeared
    
  @CAM-09
    Scenario Outline: Cancel campus edition
    And the user verify the page navigated to "campus list" screen
    And the user search campus list by campus id "Block-k"
    When the user clicks on edit button for "Block-k"
    And the user verifies campus id field is not editable
    And the user pass the campus name "Camp-"
    And the user pass the campus description "Campus block"
    And the user pass the campus address line 1 "101 somestreet"
    And the user pass the campus address line 2 "some colony"
    And the user pass the campus address line 3 "pallikaranai"
    And the user pass the campus address line 4 "chennai"
    And the user enters the mobile no. "8695425658"
    And the user enters the phone no. "2354699"
    And the user enters the email address "campusblock@mail.com"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "campus list" screen
  
   @CAM-10
    Scenario Outline: Validate pagination
    And the user verify the page navigated to "campus list" screen
    And the user confirms that they are on the first page
    And the user verifies first page and previous page button is disabled
    And the user verifies next page and last page button is enabled
    And the user clicks on next page button
    And the user verifies it navigates to next page
    And the user clicks on previous page button
    And the user verifies it navigates to previous page
    And the user clicks on last page button
    And the user confirms that they are on the last page
    And the user verifies next page and last page button is disabled
    And the user verifies first page and previous page button is enabled
    
   @CAM-11
    Scenario Outline: Validate pagination dropdown
    And the user verify the page navigated to "campus list" screen
    And the user confirms that they are on the first page
    And the user type the page no. "2"
    And the user verifies it navigates to the page "2"
    And the user clicks on first page button
    And the user confirms that they are on the first page
    When the user selects "Show 20" from page filter dropdown
    Then the user verifies the list is less than are equal to selected page filer "Show 20"
    
    