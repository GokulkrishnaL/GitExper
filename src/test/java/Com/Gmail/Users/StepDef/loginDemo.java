package Com.Gmail.Users.StepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class loginDemo {


@Given("I navigate to login page")

public void i_navigate_to_login_page() throws Throwable {


System.out.println("login navigated...");

}


@And("I entered username and password")

public void i_entered_username_and_password() throws Throwable {

System.out.println("credencials Entered...");

}

@But("Invalid pwd")

public void invalid_pwd() throws Throwable {

System.out.println("invlid pwd");

}


@And("I clicked signin button")

public void i_clicked_signin_button() throws Throwable {


System.out.println("clicked signin...");

}

@And("I entered correct username")

public void I_entered_correct_username() throws Throwable {

System.out.println("entered correct username...");

}

@Then("Itas navigated to the HomePage")

public void itas_navigated_to_the_HomePage() throws Throwable {

System.out.println("navigated to homepage...");

}

@Then("Itas navigated to the error msg")

public void itas_navigated_to_the_error_msg() throws Throwable {

System.out.println("Error...");
Assert.assertEquals("error", "error");

}

}