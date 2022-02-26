package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DownloadInvoicePage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadInvoiceStepDefs {

    DownloadInvoicePage downloadInvoicePage=new DownloadInvoicePage();

    @Then("user clicks download invoice button")
    public void user_clicks_download_invoice_button() {

        downloadInvoicePage.downloadInvoice.click();

    }
    @Then("user verifies invoice is downloaded")
    public void user_verifies_invoice_is_downloaded() throws InterruptedException {

        Thread.sleep(5000);
        String homePath = System.getProperty("user.home");
        String expectedPath = homePath + "/Downloads/invoice.txt";

        boolean doesExist = Files.exists(Paths.get(expectedPath));
        Assert.assertTrue(doesExist);
    }
}
