@CamuJupiterLogin
Feature: Login functionality for CAMUJupiter

  @Login @Regression
  Scenario Outline: Login into CAMUJupiter
    Given the user navigates to camu app
    When the user selects the institution as "CBCS - CAMU" from the dropdown
    Then the user verify navigated to the selected institution "CBCS - CAMU"
    When the user enters the camu username as "livmar97"
    And the user enters the camu password as "flexible@123"
    And the user clicks on login button
    Then the user lands on "CBCS - CAMU" institution dashboard
    
    
