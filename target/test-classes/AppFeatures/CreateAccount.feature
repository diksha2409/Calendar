Feature: Create an account

  Scenario: Create an account for Calendar
  	Given To create an account open the chrome browser and launch the application
    When User click on Register Now button
    Then User navigate to Register page
    And User enters following details
      | email                  | name     | username | password |
      | caltest@mailinator.com | caltest  | caltest  | test     |
    And User clicks on Register button
    Then User navigate to Calendar screen
