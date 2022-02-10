package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC2_LoginPage;

import java.util.List;

public class TC2_LoginFunctionalityStepDefs {

    TC2_LoginPage loginPage= new TC2_LoginPage();

    @When("user verifies login to your account is visible")
    public void user_verifies_login_to_your_account_is_visible() {


       Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());

    }

    @And("user enters correct email_address and password")
    public void userEntersCorrectEmail_addressAndPassword(DataTable credentials) {

        List<String> loginCredentials=credentials.row(1);
        loginPage.emailBox.sendKeys(loginCredentials.get(0));
        loginPage.passwordBox.sendKeys(loginCredentials.get(1));
    }

    @When("user clicks login box")
    public void user_clicks_login_box() {

        loginPage.loginButton.click();
    }

    @Then("user clicks logout button")
    public void userClicksLogoutButton() {
        loginPage.logoutButton.click();

    }

    @And("user enters correct email {string} and password {string}")
    public void userEntersCorrectEmailAndPassword(String email, String password) {

        loginPage.emailBox.sendKeys(email);
        loginPage.passwordBox.sendKeys(password);

    }
}
