@smoke
Feature: checkout
  Scenario: user can add product to cart
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on add to cart
    And click on cart
    And click on checkout
    And enter firstname
    And enter lastname
    And enter zipCode
    And click on continue
    And click on finish
    Then verify the order is placed
