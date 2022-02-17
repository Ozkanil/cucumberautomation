package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
