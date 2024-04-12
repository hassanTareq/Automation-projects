Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
    Given user open browser
    When user opens facebook link
    Then  "https://www.facebook.com/nopCommerce"  is opened facebook

  Scenario: user opens twitter link
    Given user open browser
     When user opens twitter link
    Then "https://twitter.com/nopCommerce" is opened twitter

  Scenario: user opens rss link
    Given user open browser
    When user opens rss link
    Then "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  Scenario: user opens youtube link
    Given user open browser
    When user opens youtube link
    Then "https://www.youtube.com/user/nopCommerce" youtube opened in new tab