package stepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	
	@Given("^User is on Netbanking Login Page$")
	public void User_is_on_Netbanking_Login_Page() {
		System.out.println("user navigated");
		
	}
	
	@When("^User login with cred$")
	public void User_login_with_cred() {
	   System.out.println("login success");	
	}
	
	@Then("^Home Page visible$")
	public void Home_Page_visible() {
		System.out.println("user able to see home page");	
	}
	
	@And("^card are display$")
	public void card_are_display() {
		System.out.println("card visible");
	}

}
