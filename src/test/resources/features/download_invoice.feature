@download_invoice
Feature: TC_24 Download invoice

@download_invoice
Scenario: TC_24 Download invoice
    When user launches the browser
    And user navigates to home page
    And user clicks products page button
    And user hover over first product and click add to cart
    And user clicks continue shopping button
    And hover over second product and click add to cart
    And user clicks cart button
    Then verifies that cart page is displayed
    And click proceed to checkout
    And user clicks register login button
    And user enters name and email
    And user clicks signup_button
    Then user verifies that enter account information is visible
    And user fills details
    And user selects checkbox signup for our newslater
    And user selects checkbox receive special offers
    And user fills details2
    And user clicks create account button
    Then user verifies that acount is created
    And user clicks continue button
    And user verifies that logged in
    And user clicks cart button
    Then verifies that cart page is displayed
    And click proceed to checkout
    And  user verifies Address Details and Review Your Order
    And user enters description in comment text area and click place order
    And  user enters payment details Name on Card Card Number CVC Expiration date
    And user click Pay and Confirm Order button
    Then user verifies success message Your order has been placed successfully
    And user clicks download invoice button
    Then user verifies invoice is downloaded
    And user clicks continue button
    And user click Delete Account button
    Then user verifies account deleted and clicks Continue button