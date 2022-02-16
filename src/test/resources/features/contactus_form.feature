@Contactus_form
Feature: Fill contact us form

  @Contactus_form
  Scenario:TC06_contactUs_uploadFile

    When user launches the browser
    And user navigates to home page
    And user verifies home page is visible
    And user clicks contact us button
    And user verifies get in touch text is visible
    And user enters name, email and subject
    And user uploads file
    And user clicks submit button
    And user clicks on OK button
    And verify success message
    Then user clicks Home button and verifies that landed to home page successfully