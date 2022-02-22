@place_order_login_before_checkout
Feature:TC16_PlaceOrderLoginBeforeCheckout

  @place_order_login_before_checkout
  Scenario: TC16_PlaceOrderLoginBeforeCheckout
    When user launches the browser
    And user navigates to home page
    And user clicks signup_login button
    And user verifies login to your account is visible
    And user enters correct email_address and password
      |email_address  |password|
      |josh@gmail.com|123456|
    And user clicks login box
    Then user verifies that logged in
    And user clicks products page button
    And user hover over first product and click add to cart
    And user clicks continue shopping button
    And hover over second product and click add to cart
    And user clicks cart button
    Then verifies that cart page is displayed
    And click proceed to checkout
    And  user verifies Address Details and Review Your Order
    And user enters description in comment text area and click place order
    And  user enters payment details Name on Card Card Number CVC Expiration date
    And user click Pay and Confirm Order button
    And user verifies success message Your order has been placed successfully
    And user click Delete Account button
    Then user verifies account deleted and clicks Continue button