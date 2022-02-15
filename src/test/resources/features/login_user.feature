@login_user_correct
 Feature: Login_user_correct

   Scenario: TC02_Login_User_With_Correct_email_and_password
     When user launches the browser
     And user navigates to home page
     And user verifies home page is visible
     And user clicks signup_login button
     And user verifies login to your account is visible
     And user enters correct email_address and password
     |email_address  |password|
     |josh@gmail.com|123456|
     And user clicks login box
     Then user verifies that logged in
     Then user clicks logout button
     And user verifies login to your account is visible


