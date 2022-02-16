package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestcasesPage {

    public TestcasesPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/test_cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement testCasesText;
}
