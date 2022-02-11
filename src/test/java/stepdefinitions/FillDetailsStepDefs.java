package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {

    FillDetailsPage fillDetailsPage =new FillDetailsPage();

    @When("user fills details")
    public void user_fills_details() {

        fillDetailsPage.genderBox.click();
        fillDetailsPage.passwodBox.sendKeys("123456");
        Driver.selectByIndex(fillDetailsPage.dayDropdown,4);
        Driver.selectByIndex(fillDetailsPage.monthDropdown,3);
        Driver.selectByIndex(fillDetailsPage.yearDropdown,27);

    }
    @When("user selects checkbox signup for our newslater")
    public void user_selects_checkbox_signup_for_our_newslater() {

        fillDetailsPage.newsletterSignupBox.click();
    }
    @When("user selects checkbox receive special offers")
    public void user_selects_checkbox_receive_special_offers() {

        fillDetailsPage.specialOfferBox.click();

    }

    @When("user fills details2")
    public void user_fills_details2() {
        fillDetailsPage.firstNameBox.sendKeys("Ozkan");
        fillDetailsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage.companyBox.sendKeys("techpro");
        fillDetailsPage.addressBox.sendKeys(Faker.instance().address().fullAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropdown,1);
        fillDetailsPage.stateBox.sendKeys(Faker.instance().address().state());
        fillDetailsPage.cityBox.sendKeys(Faker.instance().address().city());
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }
    @When("user clicks create account button")
    public void user_clicks_create_account_button() {
        fillDetailsPage.createAccountButton.click();

    }
    @Then("user verifies that acount is created")
    public void user_verifies_that_acount_is_created() {

        Assert.assertTrue(fillDetailsPage.accountCreatedText.isDisplayed());

    }

}
