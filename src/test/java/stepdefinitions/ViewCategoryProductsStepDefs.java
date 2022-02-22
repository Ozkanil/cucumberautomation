package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ViewCategoryPoductsPage;

public class ViewCategoryProductsStepDefs {

ViewCategoryPoductsPage viewCategoryPoductsPage=new ViewCategoryPoductsPage();

@When("verify categories are visible on left sidebar")
    public void verify_categories_are_visible_on_left_sidebar() throws InterruptedException {

      Assert.assertTrue(viewCategoryPoductsPage.categoryText.isDisplayed());
      //Thread.sleep(3000);
      //Assert.assertEquals(3, viewCategoryPoductsPage.categories.size());

}
    @Given("user clicks category")
    public void user_clicks_category() {
        viewCategoryPoductsPage.womanCategory.click();
    }
    @Given("user clicks on any women link under category")
    public void user_clicks_on_any_women_link_under_category() {
        viewCategoryPoductsPage.dressProducts.click();
    }

    @Given("verify that category page is displayed and confirm text")
    public void verify_that_category_page_is_displayed_and_confirm_text() {

        Assert.assertTrue(viewCategoryPoductsPage.womanDressProductText.isDisplayed());

    }
    @Given("user clicks on any category under women category on left sidebar")
    public void user_clicks_on_any_category_under_women_category_on_left_sidebar() {

    viewCategoryPoductsPage.menCategory.click();

    viewCategoryPoductsPage.menProduct.click();
    }
    @Given("verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {

    Assert.assertTrue(viewCategoryPoductsPage.menTshirt.isDisplayed());

    }

}


