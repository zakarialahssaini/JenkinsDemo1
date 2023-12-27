@google @search

@severity=blocker

@issue=6

@tmsLink=45678

Feature: Test the registration functionality

  Scenario: Check registration success with valid information
    Given the browser is open
    And the user is on the website
    When the user navigates to the registration page
    And the user enters their first name and last name
    And the user enters their email, password, and confirms the password
    And the user clicks on the create account button
    Then the user is navigated to the home page
    