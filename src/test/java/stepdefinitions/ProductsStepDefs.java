package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductsPage;
import utilities.Driver;

public class ProductsStepDefs {

    ProductsPage productsPage=new ProductsPage();

    @When("user clicks products page button")
    public void user_clicks_products_page_button() {

        productsPage.productButton.click();

    }
    @When("verify user is navigated to all products page")
    public void verify_user_is_navigated_to_all_products_page() {

        Assert.assertTrue(productsPage.allProductsText.isDisplayed());

    }
    @When("verify the products list is visible")
    public void verify_the_products_list_is_visible() {

        Assert.assertEquals(34, productsPage.productList.size());

    }
    @When("user clicks View Product of first product")
    public void user_clicks_view_product_of_first_product() {

        productsPage.viewProductButton1.click();

    }
    @When("user is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {

       Assert.assertEquals("https://www.automationexercise.com/product_details/1", Driver.getDriver().getCurrentUrl());
    }
    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {

        Assert.assertTrue(productsPage.ProductName.isDisplayed());
        Assert.assertTrue(productsPage.Category.isDisplayed());
        Assert.assertTrue(productsPage.Brand.isDisplayed());
        Assert.assertTrue(productsPage.Condition.isDisplayed());
        Assert.assertTrue(productsPage.Price.isDisplayed());
        Assert.assertTrue(productsPage.Availability.isDisplayed());

    }

}
