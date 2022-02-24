package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddToChartRecommendedPage {

    public AddToChartRecommendedPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[72]")
    public WebElement recommendedAddToCart;

    @FindBy(id="cart_info")
    public WebElement productInChart;

    @FindBy(xpath= "(//a[@href='/view_cart'])[2]")
    public WebElement viewCart;

}
