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

    @verify_product_quantity_chart
  Scenario: TC13_verify_product_quantity_in_chart
    When user launches the browser
    And user navigates to home page
    Then user verifies home page is visible
    And clicks view product for any product on home page
    And user verifies product detail is opened
    And user increases quantity to four
    And  user clicks add to cart button
    And user clicks view cart
    Then user verifies that product is displayed in cart page with exact quantity