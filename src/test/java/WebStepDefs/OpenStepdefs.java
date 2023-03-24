package WebStepDefs;

import POM.WebElementsItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static WebStepDefs.AddyStepdefs.driver;

public class OpenStepdefs {

    WebElementsItems open = new WebElementsItems(driver);

    @Given("user in open account page")
    public void userInOpenAccountPage() throws InterruptedException {

        open.openAcc();
    }

    @When("user select customer name from dropdown")
    public void userSelectCustomerNameFromDropdown() throws InterruptedException {
        open.nameCus();
        
    }

    @And("user select currency from dropdown")
    public void userSelectCurrencyFromDropdown() throws InterruptedException {
        open.currencyCus();
        
    }

    @Then("click process")
    public void clickProcess() throws InterruptedException {
        open.clickButtDola();
    }
}
