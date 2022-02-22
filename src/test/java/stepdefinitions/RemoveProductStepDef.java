package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RemoveProductsPage;

public class RemoveProductStepDef {

    RemoveProductsPage removeProductsPage=new RemoveProductsPage();

    @Then("user clicks x button corresponding to particular product")
    public void user_clicks_x_button_corresponding_to_particular_product() throws InterruptedException {

     removeProductsPage.deleteButton.click();
     Thread.sleep(3000);
     removeProductsPage.deleteButton2.click();
    }

    @Then("verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(removeProductsPage.cartEmptyText.isDisplayed());

    }
}
