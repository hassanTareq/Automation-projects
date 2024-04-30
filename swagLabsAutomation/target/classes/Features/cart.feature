@smoke
Feature: cart
  Scenario: user can add product to cart
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on add to cart
    And click on cart
    Then verify selected product