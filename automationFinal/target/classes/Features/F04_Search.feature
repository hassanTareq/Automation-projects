Feature: F04_Search users could search product
  Scenario: users could search product
    Given home page
    When user search product:
#      |book   |
      |laptop |
      |nike   |
    Then inspect the result


  Scenario: users could search product sku
    Given home page
    When user search with sku:
  |SCI_FAITH|
  |APPLE_CAM|
  |SF_PRO_11|
    Then inspect the result