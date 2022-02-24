package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AddToChartRecommendedPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AddToChartRecommendedStepDefs {

    AddToChartRecommendedPage addToChartRecommendedPage=new AddToChartRecommendedPage();
    @When("user scrolls down page to bottom")
    public void user_scrolls_down_page_to_bottom() {
        ReusableMethods.scrollToElement(addToChartRecommendedPage.recommendedItems);
    }
    @When("verify recommended items are visible")
    public void verify_recommended_items_are_visible() throws InterruptedException {

        Assert.assertTrue(addToChartRecommendedPage.recommendedItems.isDisplayed());

    }
    @When("user clicks add to cart on Recommended product")
    public void user_clicks_add_to_cart_on_recommended_product() throws InterruptedException {

        Thread.sleep(3000);
           addToChartRecommendedPage.recommendedAddToCart.click();

        Thread.sleep(3000);
        addToChartRecommendedPage.viewCart.click();
    }
    @When("verifies product is displayed in cart page")
    public void verifies_product_is_displayed_in_cart_page() {

        Assert.assertTrue(addToChartRecommendedPage.productInChart.isDisplayed());

    }
}
