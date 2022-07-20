package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Registration {
	@Given ("^User able to navigate User Registration$")
	public void User_able_to_navigate_User_Registration() {
		System.out.println("user navigate to Registration");
	}
	
	@When ("^Enter Requried inputs$")
	public void Enter_Requried_inputs() {
		System.out.println("valid dats");
	}
	
	@Then ("^user albe to see Amazon Registration sucessfull$")
	public void user_albe_to_see_Amazon_Registration_sucessfull() {
		System.out.println("successfull");
	}
	
	@And ("^user able to login$")
	public void user_able_to_login() {
		System.out.println("User login success");
	}
	
}
