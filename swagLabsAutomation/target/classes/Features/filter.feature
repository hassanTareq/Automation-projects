@smoke
Feature: filter
  Scenario: user filter products from lowest to highest price
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on filter button
    And select low to high
    Then verify lowest products

  Scenario: user filter products from highest to lowest price
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on filter button
    And select high to low
    Then verify highest products

  Scenario: user filter products from A to Z
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on filter button
    And select A to Z
    Then verify A to Z sorted products

  Scenario: user filter products from Z to A
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And click on filter button
    And select Z to A
    Then verify Z to A sorted products