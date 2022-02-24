@recommended_items
Feature:TC22_AddRecommendedItemsToCart

  @recommended_items
  Scenario: TC22_AddRecommendedItemsToCart
    When user launches the browser
    And user navigates to home page
    And user scrolls down page to bottom
    And verify recommended items are visible
    And user clicks add to cart on Recommended product
    And verifies product is displayed in cart page