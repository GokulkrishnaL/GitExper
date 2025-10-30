package Com.Gmail.Users.Pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
 
import com.aventstack.extentreports.ExtentTest;
 
public class UserInteraction2 {
	WebDriver driver;
	private ExtentTest test;
public UserInteraction2(WebDriver driver,ExtentTest test) {
		this.test=test;
		PageFactory.initElements(driver, this);
	}
 
//	public void login() {
//
//		driver =new ChromeDriver();
//	}
 
 
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
		username.sendKeys(s1);
		password.sendKeys(s2);
	}
 
	public void sigin() {
		submit.click();
	}
	public void navigation(String s1) {
		if(s1.equals("Login Successfully")) {
			Assert.assertEquals("Login Successfully", login.getText());
		}else if(s1.equals("Enter your userName and password correct")){
		    Assert.assertEquals("Enter your userName and password correct", error.getText());
		}
	}
}
 
