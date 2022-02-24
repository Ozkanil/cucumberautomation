package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RevievProductPage {
    public RevievProductPage() {


    PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(xpath="//a[@href='#reviews']")
    public WebElement productReview;

    @FindBy(xpath="//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath="//textarea[@id='review']")
    public WebElement reviewArea;

    @FindBy(xpath="//button[@id='button-review']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButton1;

    @FindBy(xpath="//a[@href='/product_details/4']")
    public WebElement productDetail;

    @FindBy(xpath="//div[@class='alert-success alert']")
    public WebElement successMessage;

}
