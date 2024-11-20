package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FeatureSteps {
	RemoteWebDriver driver;
	
	@Given("user navigate to the application")
	public void userNavigateToTheApplication() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	    
	}
	
	@Given("user enter the username as standard_user")
	public void userEnterTheUsernameAsStandardUser() {
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	
	@Given("user enter the password as secret_sauce")
	public void userEnterThePasswordAsSecretSauce() {
	    
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	
	@Given("user click on the login button")
	public void userClickOnTheLoginButton() {
	    
		driver.findElement(By.xpath("//div[@class='login-box']//following::input[2]")).click();
	}
	
	@Given("user add a product to the cart")
	public void userAddAProductToTheCart() {
		driver.findElement(By.xpath("(//button[.='Add to cart'])[1]")).click();
	    
	}
	
	@Given("user click on the badge icon")
	public void userClickOnTheBadgeIcon() {
		WebElement text=driver.findElement(By.xpath("//span[.='1']"));
		System.out.println("Badge text:"+text.getText());
		text.click();
	    
	}
	
	@When("user click on the checkout button")
	public void userClickOnTheCheckoutButton() {
	    driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	
	@Then("checkout should be done.")
	public void checkoutShouldBeDone() {

		driver.findElement(By.xpath("//span[contains(text(),'Checkout: Your Information')]")).getText();
	}


}
