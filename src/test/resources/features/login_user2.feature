@login_user_correct2
Feature: Login_user_correct2

  Scenario Outline: TC02_Login_User_With_Correct_email_and_password_Scenario_Outline
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks signup_login button
    And user verifies login to your account is visible
    And user enters correct email "<email_address>" and password "<password>"
    And user clicks login box
    Then user verifies that logged in
    Then user clicks logout button
    And user verifies login to your account is visible

    Examples:
      |email_address  |password|
      |ozkan@gmail.com|123456|
