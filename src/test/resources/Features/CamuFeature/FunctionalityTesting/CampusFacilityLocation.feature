@Enterprise @CampusFacilityLocation
Feature: Create location with new campus and facility

  Background:
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on institution dashboard
    
 @CAMFAC-01
    Scenario Outline: Location Creation with hostel facility unchecked
    And the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Campus" submodule under Enterprise module
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
    When the user can see the popup "campus record saved successfully!"
		Then the user verifies that the popup has disappeared
		And the user can search and verify campus has created successfully
		And the user search and select "Facilities" in globar search bar
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    #And the user selects the campus "Campus_A"
    And the user search and selects the newly created campus
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "unchecks" the hostel facility checkbox
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
		And the user search and select "Locations" in globar search bar
    And the user verify the page navigated to "locations" screen
		When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user search and selects the newly created campus
    And the user search and selects the newly created facility
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user inputs "20" as the capacity
    And the user verifies bed button is "disabled"
    And the user enters no. of rows "5"
    And the user enters no. of seats per row "4"
    And the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user search and verify location created successfully
		
	@CAMFAC-01
    Scenario Outline: Location Creation with hostel facility checked
    And the user click on "Enterprise" Module from the list of modules
    And the user clicks on "Campus" submodule under Enterprise module
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
    When the user can see the popup "campus record saved successfully!"
		Then the user verifies that the popup has disappeared
		And the user can search and verify campus has created successfully
		And the user search and select "Facilities" in globar search bar
    And the user verify the page navigated to "facilities" screen
    And the user clicks on add button to create new facility
    And the user navigates to create new facility page
    #And the user selects the campus "Campus_A"
    And the user search and selects the newly created campus
    And the user enters the facility id "F-"
    And the user enters the facility name "Fac-"
    And the user enters the facility description "Campus Block A"
    And the user enters the staff  name "livin"
    And the user "unchecks" the hostel facility checkbox
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
		And the user search and select "Locations" in globar search bar
    And the user verify the page navigated to "locations" screen
		When the user clicks on add button to create new location
    Then the user navigates to create new location page
    And the user search and selects the newly created campus
    And the user search and selects the newly created facility
    And the user enters the location Id "Loc-"
    And the user enters the location name "Loc-"
    And the user verifies bed button is "enabled"
    And the user inputs "20" as the capacity
		When the user clicks the bed button to add beds
		Then the user confirms that the number of beds matches the specified capacity
		And the user provides the name for each of the beds added
		And the user verifies gender field is displayed and enabled
		And the user verifies room category field is displayed and enabled
		And the user selects the gender as "Male"
		And the user selects the room category "Single"
		And the user verifies no. of rows field is disabled
		And the user verifies no. of seats per row field is disabled
    When the user clicks on save button to save the details
		Then the user can see the popup "successfully saved!"
		And the user verifies that the popup has disappeared
		And the user search and verify location created successfully
		
		
		
		