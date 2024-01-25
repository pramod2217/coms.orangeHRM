@tag
Feature: Testing the Login Page
  I want to use this template for HomePage

  @LoginIn-Pasitive
  Scenario: Login to the page
    Given I am on HomePage
    Then Enterd the username and password
    Then I see OrangeHRM Logo
    Then I see OrangeHRM Branding
    Then Clicked on the Login Button
    And Review the fullName on TopBar
