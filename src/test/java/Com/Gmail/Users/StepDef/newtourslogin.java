package Com.Gmail.Users.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class newtourslogin {
	WebDriver driver;
	@Given("login page")
	public void login_page() {
	   driver = new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/");
	}
	@And("enter username and password")
	public void enter_username_and_password() {
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");

	}
	@And("click sigin")
	public void click_sigin() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	@Then("check correct navigation")
	public void check_correct_navigation() {
	    WebElement check=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
	    Assert.assertEquals("Login Successfully", check.getText());
	}
	@But("if wrong password")
	public void if_wrong_password() {
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello");

	}
	@And("enter username")
	public void enter_username() {
	    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	}
	@Then("check error navigation")
	public void check_error_navigation() {
	    WebElement check=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
	    Assert.assertEquals("Enter your userName and password correct", check.getText());
	}

}
