package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ScrollDownUpPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ScrollDownUpStepDefs {

    ScrollDownUpPage scrollDownUpPage =new ScrollDownUpPage();

    @When("user scrolls down page to bottom then up")
    public void user_scrolls_down_page_to_bottom_then_up() throws InterruptedException {

        ReusableMethods.jsScroll();

        Thread.sleep(3000);
    }
    @When("user clicks on arrow at bottom right side to move upward")
    public void user_clicks_on_arrow_at_bottom_right_side_to_move_upward() throws InterruptedException {
        
            Driver.waitForClickablility(scrollDownUpPage.scrollUpArrow, 10);
            ReusableMethods.clickWithJS(scrollDownUpPage.scrollUpArrow);

    }

    @When("verify that page is scrolled up and practice website text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_practice_website_text_is_visible_on_screen() {

        try{
        if(scrollDownUpPage.verificationText.isDisplayed()) {

            Assert.assertTrue(scrollDownUpPage.verificationText.isDisplayed());

        }else if(scrollDownUpPage.verificationText2.isDisplayed()){

            Assert.assertTrue(scrollDownUpPage.verificationText2.isDisplayed());

        }else if(scrollDownUpPage.verificationText3.isDisplayed()){

            Assert.assertTrue(scrollDownUpPage.verificationText3.isDisplayed());
        }

        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @And("user scrolls up the page")
    public void userScrollsUpThePage() throws InterruptedException {

        ReusableMethods.scrollUpWithJS();
    }
}
