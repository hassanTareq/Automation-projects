@smoke
Feature: Login
  Scenario: successful login
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    Then verify valid login

  Scenario: invalid login
    Given user open website
    When enter invalid username "error_usr"
    And enter valid password "secret_sauce"
    And click on login
    Then verify invalid login

