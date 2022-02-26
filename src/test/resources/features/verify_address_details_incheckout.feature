@verify_address_details
Feature: TC23_Verify_Address_Details_In_checkoutPage
@verify_address_details
Scenario: TC23_Verify_Address_Details_In_checkoutPage

  When user launches the browser
  And user navigates to home page
  Then user verifies home page is visible
  Then user clicks signup_login button
  Then user verifies new user signup is visible
    When user enters name and email
    And user clicks signup_button
    And user verifies that enter account information is visible
    And user fills details
    And user selects checkbox signup for our newslater
    And user selects checkbox receive special offers
    And user fills address details
    And user clicks create account button
    Then user verifies that acount is created
    When user clicks continue button
    And user verifies that logged in
  And user clicks products page button
  And user hover over first product and click add to cart
  And user clicks continue shopping button
  And hover over second product and click add to cart
  And user clicks cart button
  Then verifies that cart page is displayed
  And click proceed to checkout
  And  user verifies Address Details
  And user click Delete Account button
  Then user verifies account deleted and clicks Continue button
