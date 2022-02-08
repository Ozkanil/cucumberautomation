package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPageFunctionalities {

    public MainPageFunctionalities() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Signup")
    public WebElement signupButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement signupText;

}
