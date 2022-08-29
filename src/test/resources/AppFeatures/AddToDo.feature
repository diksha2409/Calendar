Feature: Add to do in calendar

  Scenario: Add to do in Calendar
  	Given To test todo open the chrome browser and launch the application
    When User login with username "calseven" and password "test"
    And clicks on login
    Then User selects date and time
    And User enter name for to do event
    And User clicks on Add to do button
    Then App should display entry for add to do event
