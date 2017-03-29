Feature: Calcualtion
  In order to avoid silly mistakes
  As a maths dodo
  I want to be told the calculation of two numbers


  Scenario: Addition
    Given I have access to the Calc API
    When I add  5 and 6
    Then the result is the 11

  Scenario: Subtraction
    Given I have access to the Calc API
    When I subtract 20 and 15
    Then the result is the 5

  Scenario: Multiplication
    Given I have access to the Calc API
    When I multiply 6 and 4
    Then the result is the 24

  Scenario: Division
    Given I have access to the Calc API
    When I divide 12 and 3
    Then the result is the 4

