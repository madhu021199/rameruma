package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckLoginSteps {
	
WebDriver driver;
	@Given("user navigate to the bookcartapplication")
	public void user_navigate_to_the_bookcartapplication() {
		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().window().maximize();
	}

	
	@Given("user click on the login link")
	public void user_click_on_the_login_link() {
	   driver.findElement(By.xpath("//span[.=' Login ']")).click();
	}

	@Given("user enter the username as ortoni")
	public void user_enter_the_username_as_ortoni() {
	   driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ortoni");
	    
	}

	@Given("user enter the password as pass1234")
	public void user_enter_the_password_as_pass1234() {
	   
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("pass1234");
	}

	@When("user click on the bookcartlogin button")
	public void user_click_on_the_bookcartlogin_button() {
	   
		driver.findElement(By.xpath("//button/span[.='Login']")).click();
	    
	}

	@Then("login should be success.")
	public void login_should_be_success() {
	   
		driver.findElement(By.xpath("//a/span/span")).getText();
	}
	
	@Given("user enter the username as koushik")
	public void user_enter_the_username_as_ortonik() {
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("koushik");
	}

	@Given("user enter the password as pass123")
	public void user_enter_the_password_as_pass123() {
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("pass123");
	}

	@Then("login should be Fail.")
	public void login_should_be_Fail() {
	   
	}




}
