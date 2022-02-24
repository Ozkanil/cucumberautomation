package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RevievProductPage;

public class ReviewProductStepDefs {

    RevievProductPage revievProductPage= new RevievProductPage();

    @When("user clicks view product button")
    public void user_clicks_view_product_button() {

        revievProductPage.viewProductButton1.click();

    }
    @When("verify write your review is visible")
    public void verify_write_your_review_is_visible() {

        Assert.assertTrue(revievProductPage.productReview.isDisplayed());

    }
    @When("user enter name, email and review")
    public void user_enter_name_email_and_review() {

        revievProductPage.nameBox.sendKeys(Faker.instance().name().fullName());
        revievProductPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        revievProductPage.reviewArea.sendKeys("I love your products...");
    }
    @When("user clicks submit button in product details page")
    public void user_clicks_submit_button_in_product_details_page() {

        revievProductPage.submitButton.click();
    }
    @Then("verify success message thank you for your review.")
    public void verify_success_message_thank_you_for_your_review() {

        Assert.assertTrue(revievProductPage.successMessage.isDisplayed());

    }
}
