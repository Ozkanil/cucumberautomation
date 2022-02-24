package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SearchProductsPage;

public class SearchProductsStepDefs {

    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @When("enters product name in search input and click search button")
    public void enters_product_name_in_search_input_and_click_search_button() {

        searchProductsPage.searchProduct.sendKeys("Blue Top");
        searchProductsPage.searchButton.click();

    }

    @When("verify search products is visible")
    public void verify_search_products_is_visible() {

        Assert.assertTrue(searchProductsPage.searchedProductsText.isDisplayed());
    }

    @And("user clicks cart button at product page")
    public void userClicksCartButtonAtProductPage() {

        searchProductsPage.viewChart.click();
    }
}