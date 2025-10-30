package Com.Gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction {
	WebDriver driver;
	private ExtentTest test;
public UserInteraction(WebDriver driver,ExtentTest test) {
	//	this.driver = driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

//	public void login() {
//
//		driver =new ChromeDriver();
//	}

	public void enterdetails(String s1,String s2) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
	}

	public void sigin() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	public void navigation(String s1) {
		if(s1.equals("Login Successfully")) {
			WebElement check=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
			Assert.assertEquals("Login Successfully", check.getText());
		}else if(s1.equals("Enter your userName and password correct")){
			WebElement check1=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		    Assert.assertEquals("Enter your userName and password correct", check1.getText());
		}
	}
}
 