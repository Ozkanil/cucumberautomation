package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ViewCategoryPoductsPage {


    public ViewCategoryPoductsPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[text()='Category']")
    public WebElement categoryText;

    @FindBy (xpath = "//*[@class='collapsed']")
    public List<WebElement> categories;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womanCategory;

    @FindBy (xpath = "//a[@href='/category_products/1']")
    public  WebElement dressProducts;

    @FindBy(xpath = "//*[text()='Women - Dress Products']")
    public WebElement womanDressProductText;

    @FindBy (xpath = "//a[@href='#Men']")
    public WebElement menCategory;

    @FindBy (xpath = "//a[@href='/category_products/3']")
    public WebElement menProduct;

    @FindBy(xpath = "//*[contains(text(), 'Men Tshirt')]")
    public WebElement menTshirt;
}
