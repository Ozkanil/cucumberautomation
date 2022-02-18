package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.PlaceOrderCheckoutPage;
import utilities.Driver;

public class PlaceOrderCheckoutStepDefs {

PlaceOrderCheckoutPage placeOrderCheckoutPage= new PlaceOrderCheckoutPage();

    @Then("user clicks cart button")
    public void user_clicks_cart_button() {

        placeOrderCheckoutPage.cartButtonHomePage.click();

    }

    @Then("verifies that cart page is displayed")
    public void verifiesThatCartPageIsDisplayed() {

        Assert.assertTrue(placeOrderCheckoutPage.shoppingCartText.isDisplayed());
    }

    @And("click proceed to checkout")
    public void clickProceedToCheckout() {

        placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }

    @And("user clicks register login button")
    public void userClicksRegisterLoginButton() {

        placeOrderCheckoutPage.registerLoginButton.click();
    }

    @And("user  clicks cart button")
    public void userClicksCartButton() {

        placeOrderCheckoutPage.cartButtonCheckout.click();
    }


    @And("user clicks proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {

        placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }

    @And("user verifies Address Details and Review Your Order")
    public void userVerifiesAddressDetailsAndReviewYourOrder() {

       Assert.assertTrue(placeOrderCheckoutPage.addressVerificationText.isDisplayed());
    }

    @And("user enters description in comment text area and click place order")
    public void userEntersDescriptionInCommentTextAreaAndClickPlaceOrder() {

        placeOrderCheckoutPage.messageBox.sendKeys("Hello world");
        placeOrderCheckoutPage.placeOrderBox.click();
    }

    @And("user enters payment details Name on Card Card Number CVC Expiration date")
    public void userEntersPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        placeOrderCheckoutPage.nameOnCard.sendKeys("ozkan");
        placeOrderCheckoutPage.cardNumberBox.sendKeys("2554662545");
        placeOrderCheckoutPage.cvcBox.sendKeys("546");
        placeOrderCheckoutPage.expieryMonth.sendKeys("10");
        placeOrderCheckoutPage.expieryYear.sendKeys("2025");
    }

    @And("user click Pay and Confirm Order button")
    public void userClickPayAndConfirmOrderButton() {

        placeOrderCheckoutPage.payAndOrderButton.click();
    }

    @And("user verifies success message Your order has been placed successfully")
    public void userVerifiesSuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        Assert.assertTrue(placeOrderCheckoutPage.orderPlacedText.isDisplayed());
    }

    @And("user click Delete Account button")
    public void userClickDeleteAccountButton() {
        placeOrderCheckoutPage.deleteAccountButton.click();
    }

    @Then("user verifies account deleted and clicks Continue button")
    public void userVerifiesAccountDeletedAndClicksContinueButton() {

        String deleteAccountTitle= Driver.getDriver().getTitle();
        Assert.assertTrue(deleteAccountTitle.contains("Delete Account"));
    }
}
