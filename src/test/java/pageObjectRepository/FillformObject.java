package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FillformObject {

	
	WebDriver driver;
		
public FillformObject(WebDriver driver) {
	this.driver = driver;
}
	By name = By.xpath("(//input[@type='text'])[1]");
	By email = By.name("email");
	By password = By.id("exampleInputPassword1");
	By chekbox = By.id("exampleCheck1");
	By dropdown = By.id("exampleFormControlSelect1");
	By Employment_status = By.id("inlineRadio2");
	By Dob = By.name("bday");
	By submit = By.xpath("//input[@class='btn btn-success']");
	By twobinding = By.xpath("//h4/input");
	By successmessage = By.xpath("//strong[contains(text(),'Success!')]");
	By twowaybinding = By.xpath("//h4/input[@type='text']");
	
	public WebElement name() {
		return driver.findElement(name);
	}
	
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement chekbox() {
		return driver.findElement(chekbox);
	}
	public void dropdown() {
	   Select genderdropdown = new Select (driver.findElement(dropdown));
	   genderdropdown.selectByIndex(0);
	}
	public WebElement Employment_status() {
		return driver.findElement(Employment_status);
	}
	public void Dob() {
	   driver.findElement(Dob).sendKeys("09-09-2022");
	 
	 
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	public String twobinding() {
		return driver.findElement(twobinding).getText();
	}
	
	public String successmessage() {
		return driver.findElement(successmessage).getText();
	}
	
	
	
	
	public String twowaybinding() {
		return driver.findElement(twowaybinding).getText();
	}
	public void close() {
		driver.close();
	}

}
