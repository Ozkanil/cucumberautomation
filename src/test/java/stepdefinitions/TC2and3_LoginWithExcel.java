package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC2_LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TC2and3_LoginWithExcel {

    ExcelUtil excelUtil;
    List<Map<String, String>> loginData;
    TC2_LoginPage loginStepDefs=new TC2_LoginPage();

    @When("user enters correct email_address and password via excel")
    public void user_enters_correct_email_address_and_password_via_excel() {

    String path="./src/test/resources/testdata/Book1.xlsx";
    String sheetName= "Sheet1";
    excelUtil=new ExcelUtil(path,sheetName);
    loginData=excelUtil.getDataList();

    loginStepDefs.emailBox.sendKeys(loginData.get(0).get("Email"));
    loginStepDefs.passwordBox.sendKeys(loginData.get(0).get("Password"));

    }

    @And("user enters wrong email_address and password via excel")
    public void userEntersWrongEmail_addressAndPasswordViaExcel() {

        String path="./src/test/resources/testdata/Book1.xlsx";
        String sheetName= "Sheet1";
        excelUtil=new ExcelUtil(path,sheetName);
        loginData=excelUtil.getDataList();

        loginStepDefs.emailBox.sendKeys(loginData.get(1).get("Email"));
        loginStepDefs.passwordBox.sendKeys(loginData.get(1).get("Password"));
    }

    @Then("user verifies that invalid login text is visible")
    public void userVerifiesThatInvalidLoginTextIsVisible() {

        Assert.assertTrue(loginStepDefs.negativeLoginText.isDisplayed());
    }
}
