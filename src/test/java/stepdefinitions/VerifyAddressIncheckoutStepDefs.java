package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.FillDetailsPage;
import pages.VerifyAddressIncheckoutPage;
import utilities.Driver;

public class VerifyAddressIncheckoutStepDefs {

    String address= "Techproed, Park Street, Number: 1564";
    String country= "United States";
    String state= "Texas";
    String city= "Dallas";

FillDetailsPage fillDetailsPage2=new FillDetailsPage();
VerifyAddressIncheckoutPage verifyAddressIncheckoutPage=new VerifyAddressIncheckoutPage();


    @When("user fills address details")
    public void user_fills_address_details() {

        fillDetailsPage2.firstNameBox.sendKeys("Ozkan");
        fillDetailsPage2.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage2.companyBox.sendKeys("techpro");
        fillDetailsPage2.addressBox.sendKeys(address);
        Driver.selectByIndex(fillDetailsPage2.countryDropdown,1);
        fillDetailsPage2.stateBox.sendKeys(state);
        fillDetailsPage2.cityBox.sendKeys(city);
        fillDetailsPage2.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage2.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());

    }

    @Then("user verifies Address Details")
    public void user_verifies_address_details() {

        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(address));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(country));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(state));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(city));

        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(address));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(country));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(state));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(city));

    }

}
