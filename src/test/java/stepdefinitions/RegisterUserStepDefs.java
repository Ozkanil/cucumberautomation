package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegisterUserStepDefs {

    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    @When("user launches the browser")
    public void user_launches_the_browser() {

        Driver.getDriver();
    }
    @When("user navigates to home page")
    public void user_navigates_to_home_page() {

        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("automation_url"));

    }
    @Then("user verifies home page is visible")
    public void user_verifies_home_page_is_visible() {

        String homePageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", homePageTitle);

    }
    @Then("user clicks on signup button")
    public void user_clicks_on_signup_button() {

        mainPageFunctionalities.signupButton.click();

    }
    @Then("user verifies new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {

        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }

    @When("user enters name and email")
    public void user_enters_name_and_email() {


    }
    @When("user clicks signup button")
    public void user_clicks_signup_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user verifies that enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user fills details")
    public void user_fills_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks continue button")
    public void userClicksContinueButton() {
    }

    @And("user verifies that logged in")
    public void userVerifiesThatLoggedIn() {
    }

    @And("user clicks delete account button")
    public void userClicksDeleteAccountButton() {
    }

    @Then("user verifies that acount deleted")
    public void userVerifiesThatAcountDeleted() {
    }
}
