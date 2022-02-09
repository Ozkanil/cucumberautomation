package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

import javax.swing.*;

public class DeleteAccountStepDefs {

    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();


    @When("user clicks continue button")
    public void userClicksContinueButton() {

        deleteAccountPage.continueButton.click();
    }

    @And("user verifies that logged in")
    public void userVerifiesThatLoggedIn() {
        Assert.assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }

    @And("user clicks delete account button")
    public void userClicksDeleteAccountButton() {
        deleteAccountPage.deleteButton.click();
    }

    @Then("user verifies that acount deleted")
    public void userVerifiesThatAcountDeleted() {

        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(pageTitle.contains("Delete Account"));
    }
}

