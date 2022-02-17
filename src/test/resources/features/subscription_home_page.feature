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