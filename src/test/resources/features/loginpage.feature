Feature: Login Functionality for opencart E-commerce website

  As a user of the opencart website
  I want to be able to login with my account
  so that I can access my account-rated features and manage my orders.=

  Background:
    Given I am on the opencart login page

  Scenario: successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

 Scenario Outline: Unsuccessful login with invalid or empty credentials
  Given I have entered invalid " <username>" and "<password>"
  When I click on the login button
  Then I should see an error message indicating error message

  Examples:
    | username          | password |
    | invalid@email.com | pwd      |
    | abbb@gmail.com    | invalid  |


