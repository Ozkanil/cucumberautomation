@create_account_with_existing_email
Feature: Create account with existing email

  Scenario: TC05_create account with existing email
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks signup_login button
    And user verifies login to your account is visible
    When user enters name and email
    And user clicks signup_button
    And user verifies email address is visible is displayed

