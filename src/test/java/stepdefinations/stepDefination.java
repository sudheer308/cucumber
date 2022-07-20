package stepdefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefination {
    @Given("^user navigate to login page$")
    public void user_navigate_to_login_page() throws Throwable {
       System.out.println("navigate to login page");
    }

    @When("^user login to application with credintials$")
    public void user_login_to_application_with_credintials() throws Throwable {
        System.out.println("login");
    }

    @Then("^user able to see the homepage$")
    public void user_able_to_see_the_homepage() throws Throwable {
        System.out.println("see homepage");
    }

}