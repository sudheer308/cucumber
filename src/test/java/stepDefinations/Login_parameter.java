package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login_parameter {

	@Given("^Navigate to Login URL$")
	public void navigate_to_login_url() throws Throwable {
		System.out.println("Open Login URL");
	}

	@When("^Enter login Details (.+) (.+)$")
	public void enter_login_details(String uname,String pword) {
		System.out.println(uname);
		System.out.println(pword);
	}

	@Then("User navigate to Home Page is {string}")
	public void user_navigate_to_home_page_is(String string) {
         System.out.println(string);
	}

	@Then("User able to do foodOrder Page is {string}")
	public void user_able_to_do_food_order_page_is(String string) {
        System.out.println(string);
	}

}
