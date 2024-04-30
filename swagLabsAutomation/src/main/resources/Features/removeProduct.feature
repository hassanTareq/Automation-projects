@smoke
Feature: removeItem
  Scenario: user can remove product from the cart
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on add to cart
    And click on cart
    And click on remove
    Then verify removed item