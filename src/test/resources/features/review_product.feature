@add_review
Feature: TC21_AddReview

@add_review
Scenario: TC21_AddReview
When user launches the browser
And user navigates to home page
And user clicks products page button
And verify user is navigated to all products page
And user clicks view product button
And verify write your review is visible
And user enter name, email and review
And user clicks submit button in product details page
Then verify success message thank you for your review.