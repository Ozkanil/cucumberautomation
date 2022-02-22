Feature: @brands_products

@brands_products
Scenario: TC19_ViewAndCartBrandProducts
When user launches the browser
And user navigates to home page
And user clicks products page button
And verify that brands are visible on left sidebar
And user clicks on any brand name
And verify that user is navigated to brand page and brand products are displayed
And On left sidebar, click on any other brand link
And verify that user is navigated to that brand page and can see products