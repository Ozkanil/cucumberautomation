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
    @Then("user clicks signup_login button")
    public void user_clicks_on_signup_login_button() {

        mainPageFunctionalities.signupButton.click();

    }
    @Then("user verifies new user signup is visible")
    public void user_verifies_new_user_signup_is_visible() {

        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());

    }

    @When("user enters name and email")
    public void user_enters_name_and_email() {

        mainPageFunctionalities.nameBox.sendKeys("Ozkan");
        mainPageFunctionalities.emailBox.sendKeys("ozkan@gmail.com");

    }

    @When("user clicks signup_button")
    public void user_clicks_signup_button() {
        mainPageFunctionalities.accountCreatSignupButton.click();
    }

    @When("user verifies that enter account information is visible")
    public void user_verifies_that_enter_account_information_is_visible() {

      Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());
    }


}
