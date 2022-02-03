package cucumberFarmwork.Stepsfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps {

	WebDriver driver;
	@Before

	public void seup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BIJOY\\OneDrive\\Desktop\\CucumberFramework\\Yellow\\src\\test\\java\\cucumberFarmwork\\Resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);


	}

	@After

	public void tearDown() throws InterruptedException{
		Thread.sleep(10000);
		//this.driver.quit();
		this.driver.close();

	}
	@Given("^User enter the URL$")
	public void user_enter_the_URL() throws Throwable {

		driver.get("https://www.facebook.com/");

	}

	@And("^user enter email & Pasword$")
	public void user_enter_email_Pasword() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("emi_ali84@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("1515C6Bronx@");
	}

	@And("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {

	}

	@And("^user should be able to login successfuly$")
	public void user_should_be_able_to_login_successfuly() throws Throwable {

	}

	@Then("^user should be landed on the homepage$")
	public void user_should_be_landed_on_the_homepage() throws Throwable {

	}


}
