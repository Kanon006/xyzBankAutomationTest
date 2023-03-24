package WebStepDefs;

import POM.WebElementsItems;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static WebStepDefs.AddyStepdefs.driver;

public class DeleteStepdefs {

    WebElementsItems del = new WebElementsItems(driver);
    @Given("user go to page")
    public void userGoToPage() throws InterruptedException {
        del.goCus();
    }

    @When("user search names")
    public void userSearchNames() throws InterruptedException {
        del.searchCus();
    }

    @And("user click delete button")
    public void userClickDeleteButton() throws InterruptedException {
        del.deleteCus();
    }

    @Then("click home")
    public void clickHome() throws InterruptedException {
        del.homeCus();
    }
}
