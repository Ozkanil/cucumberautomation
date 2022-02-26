Feature: TC25_VerifyScrollUpArrowButtonScrollDown
@scroll_down @vip
Scenario:  TC25_VerifyScrollUpArrowButtonScrollDown
When user launches the browser
And user navigates to home page
And user verifies home page is visible
And user scrolls down page to bottom then up
And verify text subscription
And user clicks on arrow at bottom right side to move upward
And verify that page is scrolled up and practice website text is visible on screen

  @scroll_up @vip
  Scenario:  TC25_Scroll up page and verify
    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user scrolls down page to bottom then up
    And verify text subscription
    And user scrolls up the page
    And verify that page is scrolled up and practice website text is visible on screen