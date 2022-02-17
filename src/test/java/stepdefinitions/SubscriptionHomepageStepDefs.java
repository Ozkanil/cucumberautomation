package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SubscriptionPage;
import utilities.ReusableMethods;

public class SubscriptionHomepageStepDefs {

    SubscriptionPage subscriptionPage=new SubscriptionPage();

    @When("user scrolls down to footer")
    public void user_scrolls_down_to_footer() {

        ReusableMethods.jsScroll();
    }
    @When("verify text subscription")
    public void verify_text_subscription() {

        Assert.assertTrue(subscriptionPage.subciptionText.isDisplayed());
    }
    @When("user enters email address in input and clicks arrow button")
    public void user_enters_email_address_in_input_and_clicks_arrow_button() {

        subscriptionPage.susbscribeEmail.sendKeys("ozkan@gmail.com");
        subscriptionPage.susbscribeArrowButton.click();
    }
    @When("verify successfully subscribed message is visible")
    public void verify_successfully_subscribed_message_is_visible() {

        Assert.assertTrue(subscriptionPage.susbscribeSuccessMessage.isDisplayed());

    }

}
