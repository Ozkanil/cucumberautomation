@test_cases_page
Feature: Test_cases_page

  Scenario: TC07_test_cases_page

    When user launches the browser
    And user navigates to home page
    Then user verifies home page is visible
    And user clicks test cases button
    Then verify user is navigated to test case page