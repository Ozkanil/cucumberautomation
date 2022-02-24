package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViewBrandProductsPage {

    public ViewBrandProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@class='brands_products']")
    public WebElement brands;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButton1;

    @FindBy (xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloProducts;

    @FindBy(xpath = "//*[text()='Brand - Polo Products']")
    public WebElement poloProductsText;

    @FindBy (xpath = "//*[text()='Brand - H&M Products']")
    public WebElement hmProductsText;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement hmproducts;
}
