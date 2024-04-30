@smoke
Feature: logout
  Scenario: user logout the website
    Given user open website
    When enter valid username "standard_user"
    And enter valid password "secret_sauce"
    And click on login
    And expand the side curtain
    And click on logout
    Then verify logout action