@RestAPI
Feature: RESTful API
  As a user I want to access an API
  So I can get the required information


  Scenario: Google API
    Given I am a google user
    When I search for something using the API
    Then I get the appropriate response