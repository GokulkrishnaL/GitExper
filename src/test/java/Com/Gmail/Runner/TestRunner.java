package Com.Gmail.Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\test\\java\\Com\\Gmail\\Users\\Features\\logintable.feature",		
		glue = "Com.Gmail.Users.StepDef",
	    //tags = "@Tc1 , @Tc2"
	   // tags = "@Tc1 and @Tc2"
	   // tags = ("@Tc1 or @Tc2")
	  //  tags="@TC1",
	    plugin = {"pretty", "html:Reports/cucumber-reports.html"}
		)
public class TestRunner {

}
