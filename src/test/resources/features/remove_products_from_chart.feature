Feature: TC17_RemoveProductCart
@remove_product
Scenario: TC17_RemoveProductCart
When user launches the browser
And user navigates to home page
  And user clicks products page button
  And user hover over first product and click add to cart
  And user clicks continue shopping button
  And hover over second product and click add to cart
  And user clicks cart button
  Then verifies that cart page is displayed
  And user clicks x button corresponding to particular product
  And verify that product is removed from the cart