
@place_order_checkout
Feature: TC14_Place Order Register while Checkout

  Scenario: C14_Place Order Register while Checkout
    When user launches the browser
    And user navigates to home page
    Then user verifies home page is visible
    And user clicks products page button
    And user hover over first product and click add to cart
    And user clicks continue shopping button
    And hover over second product and click add to cart
    And user clicks cart button
    Then verifies that cart page is displayed
    And click proceed to checkout
    And user clicks register login button

    When user enters name and email
    And user clicks signup_button
    And user verifies that enter account information is visible
    And user fills details
    And user selects checkbox signup for our newslater
    And user selects checkbox receive special offers
    And user fills details2
    And user clicks create account button
    Then user verifies that acount is created
    When user clicks continue button
    And user verifies that logged in

    And user  clicks cart button
    And user clicks proceed to checkout button
    And  user verifies Address Details and Review Your Order
    And user enters description in comment text area and click place order
    And  user enters payment details Name on Card Card Number CVC Expiration date
    And user click Pay and Confirm Order button
    And user verifies success message Your order has been placed successfully
    And user click Delete Account button
    Then user verifies account deleted and clicks Continue button