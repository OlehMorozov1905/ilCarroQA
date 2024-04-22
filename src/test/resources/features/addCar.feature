Feature: Login

  @addCar
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on OK button in the dialog box
    And User clicks on Let the car work link
    And User fills out the form
    And User clicks on Submit button
    Then User verifies Message is displayed
    And User quites browser