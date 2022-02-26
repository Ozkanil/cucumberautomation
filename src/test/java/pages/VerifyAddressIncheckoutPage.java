package pages;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VerifyAddressIncheckoutPage {
    public VerifyAddressIncheckoutPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="address_delivery")
    public WebElement deliveryAddress;

    @FindBy(id="address_invoice")
    public WebElement addressInvoice;


}
