@Enterprise @FacilitiesModule
Feature: Facilities Module creation and modification

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    When the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Facilities" submodule under Enterprise module
    
  @FAC-01
    Scenario Outline: Verify able to search and navigate to Faclities module from global search bar
    And the user verify the page navigated to "facilities" screen
    And the user search and select "Facilities" in globar search bar
    And the user verify the page navigated to "facilities" screen
    
  @FAC-02
    Scenario Outline: Create facility with hostel facility checked
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "checks" the hostel facility checkbox
    #And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    And the user clicks on save button to save the details
		Then the user can see the popup "saved successfully."
		And the user verifies that the popup has disappeared
		And the user search and verify facility created successfully
		
 @FAC-03
    Scenario Outline: Create facility with hostel facility unchecked
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    #And the user "checks" the hostel facility checkbox
    And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    And the user clicks on save button to save the details
		Then the user can see the popup "saved successfully."
		And the user verifies that the popup has disappeared
		
	@FAC-04
    Scenario Outline: Create facility with only mandatory fields
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user clicks on save button to save the details
		Then the user can see the popup "saved successfully."
		And the user verifies that the popup has disappeared
		
	@FAC-04
    Scenario Outline: Create facility without mandatory fields
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
		
  @FAC-05
    Scenario Outline: Reset and verify all fields are cleared
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "checks" the hostel facility checkbox
    #And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    #When the user clicks on reset button to clear the fields
    When the user click on reset to reset the changes
    Then the user verifies all the fields under create new facility are cleared
    
  @FAC-06
    Scenario Outline: Cancel facility creation
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "checks" the hostel facility checkbox
    #And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "facilities" screen
    
  @FAC-07
    Scenario Outline: Facility creation with invalid format for mobile no., phone no. and email
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user verifies save button is disabled
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the mobile no. "ashkadas"
    And the user enters the phone no. "askdjlkdk"
    And the user verifies invalid  mobile number format error
    And the user click on reset to reset the changes
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the phone no. "askdjlkdk"
    And the user enters the mobile no. "ashkadas"
    And the user verifies invalid  phone number format error
    And the user click on reset to reset the changes
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the mobile no. "!@^%$%^#"
    And the user enters the phone no. "^@#*^@_&"
    And the user verifies invalid  mobile number format error
    And the user click on reset to reset the changes
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the phone no. "^@#*^@_&"
    And the user enters the mobile no. "!@^%$%^#"
    And the user verifies invalid  phone number format error
    And the user click on reset to reset the changes
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the email address "campusblock"
    And the user enters the mobile no. "ashkadas"
    And the user verifies invalid email id format error
    
  @FAC-08
    Scenario Outline: Facility creation select and remove multiple staffs
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    And the user verifies save button is disabled
    And the user selects the campus "Campus_A"
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user selects multiple staff name "Livin, CBCS, John"
    And the user removes the selected staffs
    
  @FAC-09
    Scenario Outline: Edit Facility
    And the user verify the page navigated to "facilities" screen
    And the user search for facility by facility Id "Hostel-A"
    And the user clicks on edit button for "Hostel-A"
    And the user verifies campus field is disabled
    And the user verifies facility id field is disabled
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "checks" the hostel facility checkbox
    #And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    When the user clicks on update button to update the changes
    Then the user can see the popup "updated successfully."
  	And the user verifies that the popup has disappeared
  	
  @FAC-10
    Scenario Outline: Edit Facility cancel updated changes
    And the user verify the page navigated to "facilities" screen
    And the user search for facility by facility Id "Hostel-A"
    And the user clicks on edit button for "Hostel-A"
    And the user verifies campus field is disabled
    And the user verifies facility id field is disabled
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "checks" the hostel facility checkbox
    #And the user "unchecks" the hostel facility checkbox
    And the user enters the address line 1 "1221 afadsfds"
    And the user enters the address line 2 "sdfsdf"
    And the user enters the address line 3 "asfsda"
    And the user enters the address line 4 "afsadf"
    And the user enters the mobile no. "5546214785"
    And the user enters the phone no. "5624785"
    And the user enters the email address "jm@mki.com"
    When the user can cancel the changes by clicking cancel button
    And the system will ask the confirmation message to cancel
    Then the user verify the page navigated to "facilities" screen
  
  @FAC-11
    Scenario Outline: Verify text field accept alphabet, numerical and special characters
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
   	And the user enters the facility Id "alphabet"
    And the user enter the facility name "alphabet"
    And the user enters the facility description "alphabet"
    And the user enters the address line 1 "alphabet"
    And the user enters the address line 2 "alphabet"
    And the user enters the address line 3 "alphabet"
    And the user enters the address line 4 "alphabet"
    Then the user verifies text fields accept "alphabets"
    And the user enters the facility Id "12345"
    And the user enter the facility name "12345"
    And the user enters the facility description "12345"
    And the user enters the address line 1 "12345"
    And the user enters the address line 2 "12345"
    And the user enters the address line 3 "12345"
    And the user enters the address line 4 "12345"
   	Then the user verifies text fields accept "numbers"
   	And the user enters the facility Id "!@#$*&"
    And the user enter the facility name "!@#$*&"
    And the user enters the facility description "!@#$*&"
    And the user enters the address line 1 "!@#$*&"
    And the user enters the address line 2 "!@#$*&"
    And the user enters the address line 3 "!@#$*&"
    And the user enters the address line 4 "!@#$*&"
    Then the user verifies text fields accept "special characters"
    
 	
    
    