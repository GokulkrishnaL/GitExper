package Com.Gmail.Users.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Gmail.Users.Config.reports;

public class UserInteractions3 {
	WebDriver driver;
	private ExtentTest test;
	private WebDriverWait wait;
	public UserInteractions3(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		this.test=test;

	}

	@FindBy(name="userName")
	private WebElement username;

	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="submit")
	private WebElement submit;

	@FindBy(xpath="//h3[normalize-space()='Login Successfully']")
	private WebElement login;

	@FindBy(xpath="//span[normalize-space()='Enter your userName and password correct']")
	private WebElement error;

	public void enterdetails(String s1,String s2) {
		boolean actres=true;
		
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			reports.generateReport(driver, test, Status.PASS, "username Element is displayed");
			username.sendKeys(s1);
			wait.until(ExpectedConditions.visibilityOf(password));
			reports.generateReport(driver, test, Status.PASS, "password Element is displayed");
			password.sendKeys(s2);
		}
		catch(TimeoutException e) {
			actres=false;
			reports.generateReport(driver, test, Status.FAIL, "Element is not Displayed");
		}
	}

	public void sigin() {
		boolean actres=true;
		try {
			wait.until(ExpectedConditions.visibilityOf(submit));
			reports.generateReport(driver, test, Status.PASS, "submit Element is displayed");
			submit.click();
		}
		catch(TimeoutException e) {
			actres=false;
			reports.generateReport(driver, test, Status.FAIL, "submit Element is not Displayed");
		}
	}
	public boolean navigation(String s1) {
//		if(s1.equals("Login Successfully")) {
//			Assert.assertEquals("Login Successfully", login.getText());
//		}else if(s1.equals("Enter your userName and password correct")){
//			Assert.assertEquals("Enter your userName and password correct", error.getText());
//		}
		boolean actres=true;
		WebElement ele;
		if(s1.equals("Login Successfully")) {
			 ele = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		}else {
			ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		}
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
		if(ele.getText().matches("Login Successfully")) {
			reports.generateReport(driver, test, Status.PASS, "valid user");
		}else{
			actres=false;
			reports.generateReport(driver, test, Status.FAIL, "InValid user");
		}
		}
		catch(TimeoutException e) {
			actres=false;
			reports.generateReport(driver, test, Status.FAIL, "login Element is not Displayed");
		}
	return actres;	
	}
}

