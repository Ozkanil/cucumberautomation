package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PlaceOrderCheckoutPage {

    public PlaceOrderCheckoutPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButtonHomePage;

    @FindBy (xpath = "//*[@class='active']")
    public WebElement shoppingCartText;

    @FindBy (xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;

    @FindBy (partialLinkText = "Register")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButtonCheckout;

    @FindBy(xpath ="//*[@class='heading']")
    public WebElement addressVerificationText;
    @FindBy(name="message")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrderBox;

    @FindBy(name="name_on_card")
    public WebElement nameOnCard;

    @FindBy(name="card_number")
    public WebElement cardNumberBox;

    @FindBy(name = "cvc")
    public WebElement cvcBox;

    @FindBy (name="expiry_month")
    public WebElement expieryMonth;

    @FindBy(name="expiry_year")
    public WebElement expieryYear;

    @FindBy(xpath = "//*[@class='form-control btn btn-primary submit-button']")
    public WebElement payAndOrderButton;

    @FindBy(xpath = "(//b)[2]")
    public WebElement orderPlacedText;

    @FindBy(xpath = "(//a)[6]")
    public WebElement deleteAccountButton;





























}
