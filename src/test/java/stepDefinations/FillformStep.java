package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.FillformObject;

public class FillformStep {

	public WebDriver driver;
	public FillformObject fo;

	@Given("User Invoke ChromeBrowser")
	public void user_invoke_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing\\BrowserDrivers\\Chrome\\chromedriver_v102.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("Open website {string}")
	public void open_website(String weburl) {
		driver.get(weburl);
	}

	@When("Enter all fields into corresponding fields")
	public void enter_all_fields_into_corresponding_fields() {
		fo = new FillformObject(driver);
		fo.name().sendKeys("sudheer");
		fo.email().sendKeys("aldkj@gmail.com");
		fo.password().sendKeys("lsdlas");
		fo.chekbox().click();
		fo.dropdown();
		fo.Employment_status().click();
		fo.Dob();
	}

	@And("Click on submit button")
	public void click_on_submit_button() {
		fo.submit().click();
	}

	@Then("User able to see successfull Message on screen {string}")
	public void user_able_to_see_successfull_message_on_screen(String massage) {
		massage.contains(fo.successmessage());
	}

	@And("close the Browser")
	public void close_the_browser() {
		fo.close();
	}

//Two way binding validation--------------------------------------------------------------------

	@When("Enter {string} in to name field")
	public void enter_in_to_name_field(String name) {
		fo = new FillformObject(driver);
		fo.name().sendKeys(name);
	}

	@Then("User able to see the name in two-way binding {string}")
	public void user_able_to_see_the_name_in_two_way_binding(String twowaytext) {
		twowaytext.contains(fo.twowaybinding());
	}

}
