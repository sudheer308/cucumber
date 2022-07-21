package stepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login {
	
	
	@Given("^User is on Netbanking Login Page$")
	public void User_is_on_Netbanking_Login_Page() {
		System.out.println("user navigated");
		
	}
	
	@When("User login with uname {string} pword {string}")
	public void user_login_with_uname_pword(String uname, String pward) {
	    System.out.println("valid inputs :"+uname);
	    System.out.println("valid inputs :"+pward);
	}
	@Then("Home Page is visible {string}")
	public void home_page_is_visible(String string) {
	    System.out.println("user is on home page :"+string);
	}
	@And("card are display on screen is {string}")
	public void card_are_display_on_screen_is(String string) {
		System.out.println("card are display :"+string);
	}




}
