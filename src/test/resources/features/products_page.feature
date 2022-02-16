@verify_all_products
Feature: VerifyAllProducts

  Scenario: TC08_verify_all_products
    When user launches the browser
    And user navigates to home page
    And user clicks products page button
    And verify user is navigated to all products page
    And verify the products list is visible
    And user clicks View Product of first product
    And user is landed to product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand