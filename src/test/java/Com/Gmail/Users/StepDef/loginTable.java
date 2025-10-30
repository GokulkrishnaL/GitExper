package Com.Gmail.Users.StepDef;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import Com.Gmail.Users.Pages.UserInteraction;
import Com.Gmail.Users.Pages.UserInteraction2;
import Com.Gmail.Users.Pages.UserInteractions3;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class loginTable {

	WebDriver driver=Hooks.driver;
	ExtentTest Test=Hooks.test;
	UserInteractions3 ui;
//	Base base;
	@Given("table login page")
	public void login_page() {
		driver.get("https://demo.guru99.com/test/newtours/");

		ui=new UserInteractions3(driver, Test);
	}

	@And("enter {string} and {string}")
	public void enter(String s1,String s2) {
		ui.enterdetails(s1, s2);
	}

	@And("table click sigin")
	public void click_sigin() {
		ui.sigin();
	}
	@Then("table check correct navigation {string}")
	public void check_correct_navigation(String s1) {
		ui.navigation(s1);
	}

}

 