package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SubscriptionPage {

    public SubscriptionPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[contains(text(),'Subscription')]")
    public WebElement subciptionText;

    @FindBy( id = "susbscribe_email")
    public WebElement susbscribeEmail;


    @FindBy( id = "subscribe")
    public WebElement susbscribeArrowButton;

    @FindBy( id =  "success-subscribe")
    public WebElement susbscribeSuccessMessage;

    @FindBy(xpath = "//*[@id='scrollUp']")
    public WebElement UpArrow;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButton;

    @FindBy(xpath = " (//div[@class='productinfo text-center'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = " (//div[@class='productinfo text-center'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[2]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[4]")
    public WebElement addToCartButton2;

    @FindBy(linkText = "View Cart")
    public WebElement viewCartButton;

    @FindBy(xpath = "(//*[@class='disabled'])[1]")
    public WebElement firstQuantity;

    @FindBy(xpath = "(//*[@class='disabled'])[2]")
    public WebElement secondQuantity;

    @FindBy(xpath = "(//*[@class='cart_price'])[1]")
    public WebElement firstPrice;

    @FindBy(xpath = "(//*[@class='cart_price'])[2]")
    public WebElement secondPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[1]")
    public WebElement firstTotolPrice;

    @FindBy(xpath = "(//*[@class='cart_total_price'])[2]")
    public WebElement secondTotolPrice;

    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@class='cart_description']")
    public List<WebElement> productsInChart;

}
