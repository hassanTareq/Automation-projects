Feature: F08_Wishlist | users could add product to wishlist
  Scenario:  users could add product to wishlist
    Given user open browser "https://demo.nopcommerce.com/"
    When add product to wishlist
    Then  a message will apear

  Scenario:  users could open wishlist page
    Given user open browser "https://demo.nopcommerce.com/"
    When add product to wishlist
    And open wishlistpage
    Then  chick the qty