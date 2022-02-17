Feature: VerifySubscriptionInHomePage

  @verify_subscription_in_homepage
  Scenario: TC10_VerifySubscriptionInHomePage
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user scrolls down to footer
    And verify text subscription
    And user enters email address in input and clicks arrow button
    And verify successfully subscribed message is visible

  @verify_subscription_in_cart_page
  Scenario: TC11_VerifySubscriptionInCart

    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clics cart button
    And verify text subscription
    And user enters email address in input and clicks arrow button
    And verify successfully subscribed message is visible


  @add_products_to_chart
  Scenario: TC12_Add Products in Cart
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks products page button
    And user hover over first product and click add to cart
    And user clicks continue shopping button
    And hover over second product and click add to cart
    And user clicks view cart button
    Then user verifies both products are added to cart
    Then user verifies their prices quantity and total price