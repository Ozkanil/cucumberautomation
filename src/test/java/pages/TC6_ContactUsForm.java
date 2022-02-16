package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC6_ContactUsForm {

    public TC6_ContactUsForm() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@href='/contact_us']")
    public WebElement contactUsButton ;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouchText ;

    @FindBy(name = "name")
    public WebElement nameText;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "subject")
    public WebElement subjectBox;

    @FindBy(name = "message")
    public WebElement messageBox;

    @ FindBy(name="upload_file")
    public WebElement uploadFile;

    @ FindBy(name="submit")
    public WebElement submitFile;

    @ FindBy(xpath= "//*[text()='Success! Your details have been submitted successfully.']")
    public WebElement successMessage;

    @FindBy(xpath = "(//*[text()=' Home'])[2]")
    public WebElement homeButton;
}
