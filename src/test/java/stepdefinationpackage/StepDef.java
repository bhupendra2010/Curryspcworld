package stepdefinationpackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectpackage.Homepage;

public class StepDef {
Homepage page=new Homepage();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    page.baseurl();
    }

    @When("^user fill up all detail$")
    public void user_fill_up_all_detail() throws Throwable {
    page.detail();
    }

    @Then("^user should create membership$")
    public void user_should_create_membership() throws Throwable {

    }

}
