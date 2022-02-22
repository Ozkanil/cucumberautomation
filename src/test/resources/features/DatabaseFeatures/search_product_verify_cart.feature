@search_products2
Scenario: TC_20_SearchProduct
When user launches the browser
And user navigates to home page
And user clicks products page button
And verify user is navigated to all products page
And  enters product name in search input and click search button
And verify search products is visible
And verify all the products related to search are visible
And user adds products to cart
And user clicks cart button
And  verifies product is displayed in cart page
And user clicks signup_login button
And submit login details