package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchProductsPage {

    public SearchProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath="//h2[@class='title text-center']")
    public WebElement searchedProductsText;

    @FindBy(xpath = "//input[@class= 'form-control input-lg']")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class= 'fa fa-search']")
    public WebElement searchButton;

    @FindBy(linkText = "View Cart")
    public WebElement viewChart;
}
