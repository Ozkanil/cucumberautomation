Feature: TC18_ViewCategoryProducts
@view_category_products
Scenario: TC18_ViewCategoryProducts
When user launches the browser
And user navigates to home page
And verify categories are visible on left sidebar
Given user clicks category
And user clicks on any women link under category
And verify that category page is displayed and confirm text
And user clicks on any category under women category on left sidebar
And verify that user is navigated to that category page