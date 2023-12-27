package com.sdetadda.allure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

   
public class RegistreSteps {
	WebDriver driver; 
	
	@Given("the browser is open")
	public void the_browser_is_open() {
		WebDriverManager.chromedriver().browserVersion("120.0.6099.63").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    System.out.println("Inside Step - browser is open");
	    
	}

	@And("the user is on the website")
	public void the_user_is_on_the_website() {
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		System.out.println("Inside Step - the user is on the website");
	}

	@When("the user navigates to the registration page")
	public void the_user_navigates_to_the_registration_page() {
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
		System.out.println("Inside Step - the user navigates to the registration page");
	}

	@And("the user enters their first name and last name")
	public void the_user_enters_their_first_name_and_last_name() {
    
	}

	@And("the user enters their email, password, and confirms the password")
	public void the_user_enters_their_email_password_and_confirms_the_password() {
		driver.findElement(By.name("firstname")).sendKeys("anas");
        driver.findElement(By.name("lastname")).sendKeys("ouzari");
        driver.findElement(By.name("email")).sendKeys("zakarialahssaini30@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Zakaria-@30");
        driver.findElement(By.name("password_confirmation")).sendKeys("Zakaria-@30");
     
	}
	@And("the user clicks on the create account button")
	public void the_user_clicks_on_the_create_account_button() {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
	}

	@Then("the user is navigated to the home page")
	public void the_user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}
}
    
