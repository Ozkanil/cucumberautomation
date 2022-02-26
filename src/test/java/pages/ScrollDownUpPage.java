package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class ScrollDownUpPage {
    public ScrollDownUpPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="scrollUp")
    //@FindBy(xpath = "//*[@class='fa fa-angle-up']")
    public WebElement scrollUpArrow;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement verificationText;

    @FindBy (xpath = "(//h2)[2]")
    public WebElement verificationText2;

    @FindBy (xpath = "(//h2)[1]")
    public WebElement verificationText3;

}
