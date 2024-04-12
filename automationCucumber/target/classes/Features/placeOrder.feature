Feature: PlaceOrder
  Scenario: Login while checkout
    Given user open website
    When user add product to cart
    And user click cart button
    And  user click proceed to CheckOut
    And user click login
    And user click on cart button
    And user click on proceed to checkout button
    And user enter description
    And user click place order
    And user enter payment details and click on pay
    Then user has placed the order successfully