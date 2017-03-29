@Searcg
Feature: Google Search
  As a user I want to search the Internet
  So that I can find information


  Scenario: Search
    Given I am on the Google Homepage
    When I search for something
    Then the appropriate results are displayed