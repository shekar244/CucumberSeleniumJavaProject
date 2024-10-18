Feature: Login Functionality for mydemo app on ios

  Scenario: Login to mydemo app with credentials
    Given I have entered a valid userid and password
    When I click on the login
    Then I will logged in successfully