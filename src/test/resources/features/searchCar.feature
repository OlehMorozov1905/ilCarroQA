Feature: Home Page

  @searchCar
  Scenario: Find a car by entering data
    Given User launches Chrome browser
    When User opens ilCarro HomePage
    And User clicks on search link
    And User enters data into the form
    And User clicks on the Yalla button
    Then User verifies found car is displayed
    And User quites browser
