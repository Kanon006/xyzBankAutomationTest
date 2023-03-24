package WebStepDefs;

import Core.BrowserHelp;
import POM.WebElementsItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddyStepdefs extends BrowserHelp {

    public static WebDriver driver; //comment

    BrowserHelp b = new BrowserHelp();

    WebElementsItems web;


    @Given("user in add customer page")
    public void userInAddCustomerPage() {
        driver = b.browser();
    }

    @When("user enter {string} and {string} and {string}")
    public void userEnterFirstnameAndLastnameAndPostcode(String firstname, String lastname, String postcode) throws InterruptedException {
        web = new WebElementsItems(driver);
        web.addCus(firstname, lastname, postcode);
    }

    @And("click addcustomer button")
    public void clickAddcustomerButton() throws InterruptedException {
        web.clickButt();
    }

    @Then("click ok")
    public void clickOk() {
        web.alertt();
    }
}
