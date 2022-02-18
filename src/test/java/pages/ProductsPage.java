package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {

    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement productButton;

    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> productList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButton1;

    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    public WebElement ProductName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement Category;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    public WebElement Price;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    public WebElement Availability;

    @FindBy(xpath = "//b[contains(text(),'Condition')]")
    public WebElement Condition;

    @FindBy (xpath = "//b[contains(text(),'Brand')]")
    public WebElement Brand;

    @FindBy (xpath = "//*[@class='fa fa-plus-square']")
    public WebElement viewProductHomePage;


    @FindBy (id = "quantity")
    public WebElement quatityBox;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement addToCartButtonProduct;

    @FindBy(linkText = "View Cart")
    public WebElement viewCartButtonProduct;


    @FindBy(xpath = "//*[@class='disabled']")
    public WebElement quatityBoxInChart;





}
