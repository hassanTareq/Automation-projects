Feature: F03_currencies users could select currency
  Scenario: guest user could select currency successfully
    Given user open home page
    When user select Euro currency
    Then euro symbol is displayed