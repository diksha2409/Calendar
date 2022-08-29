Feature: Login an account

  Scenario Outline: Login an account for Calendar
  	Given To login into account open the chrome browser and launch the application
    When User clicks on Login button
    Then User enters "<username>" in username field
    And User enters "<password>" in password field
    And User clicks Login button
    Then User navigate to Calendar Page

    Examples: 
      | username | password |
      | calsix   | test     |
      | calfive  | test     |
      | calfour  | test     |
