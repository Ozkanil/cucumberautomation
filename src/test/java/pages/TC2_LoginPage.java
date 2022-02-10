package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC2_LoginPage {

    public TC2_LoginPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h2)[1]")
    public WebElement loginYourAccountText;

    @FindBy(name="email")
    public WebElement emailBox;

    @FindBy(name="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),' Logout')]")
    public WebElement logoutButton;
}
