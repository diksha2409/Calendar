Feature: Logout an account

  Scenario Outline: Logout an account for Calendar
    Given To test logout function open the chrome browser and launch the application
    And User login with "<username>" and "<password>" 
    And User is on Calendar page
    And User clicks on profile name
    When User clicks on Logout button
    Then User navigate to Login Page
  
    Examples: 
      | username | password |
      | calsix   | test     |
