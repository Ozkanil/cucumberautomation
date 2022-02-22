package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RemoveProductsPage {

    public RemoveProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='cart_quantity_delete']" )
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@class='fa fa-times']")
    public WebElement deleteButton2;

    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public  WebElement cartEmptyText;
}
