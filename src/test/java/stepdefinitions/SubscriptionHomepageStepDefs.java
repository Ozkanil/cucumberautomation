package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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

    @And("user clics cart button")
    public void userClicsCartButton() {

        subscriptionPage.cartButton.click();
    }

    @And("user hover over first product and click add to cart")
    public void userHoverOverFirstProductAndClickAddToCart() throws InterruptedException {

        ReusableMethods.hover(subscriptionPage.firstProduct);
        Thread.sleep(3000);
        subscriptionPage.addToCartButton.click();
        Thread.sleep(3000);
    }

    @And("user clicks continue shopping button")
    public void userClicksContinueShoppingButton() {

        subscriptionPage.continueButton.click();
    }

    @And("hover over second product and click add to cart")
    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {

        Thread.sleep(3000);
        ReusableMethods.hover(subscriptionPage.secondProduct);
        Thread.sleep(3000);
        subscriptionPage.addToCartButton2.click();
    }

    @And("user clicks view cart button")
    public void userClicksViewCartButton() {

        subscriptionPage.cartButton.click();
    }

    @Then("user verifies both products are added to cart")
    public void userVerifiesBothProductsAreAddedToCart() {

        Assert.assertEquals(2,subscriptionPage.productsInChart.size());
    }

    @Then("user verifies their prices quantity and total price")
    public void userVerifiesTheirPricesQuantityAndTotalPrice() {

        int firstPrice= Integer.parseInt(subscriptionPage.firstPrice.getText().toString().replaceAll("[^0-9]",""));

        int secondPrice= Integer.parseInt(subscriptionPage.secondPrice.getText().toString().replaceAll("[^0-9]",""));

        String firstTotalPrice= subscriptionPage.firstTotolPrice.getText().toString().replaceAll("[^0-9]","");

        String secondTotalPrice= subscriptionPage.secondTotolPrice.getText().toString().replaceAll("[^0-9]","");

        Assert.assertEquals(500,firstPrice);
        Assert.assertEquals(400,secondPrice);
        Assert.assertEquals("1", subscriptionPage.firstQuantity.getText());
        Assert.assertEquals("1", subscriptionPage.secondQuantity.getText());
        Assert.assertEquals("500", firstTotalPrice);
        Assert.assertEquals("400", secondTotalPrice);

    }
}
