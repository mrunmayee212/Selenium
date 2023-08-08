package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "E:\\mrunumi\\CucumberDay2_DataDrivenTesting\\src\\test\\java\\Features\\login.feature",
		 glue = {"com.stepDefinations"}
		)
public class TestRunner {

}
