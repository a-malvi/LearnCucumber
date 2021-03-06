package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	//Here we need to mentions refrence files
		features="Feature", //take automatically from folder in project
		glue="stepDefination",//folder name of step defination
		stepNotifications = true,
		dryRun = false, //to just dry run check proper linking it will not run steps
		monochrome = true, // display concol output in proper format
		plugin = {"pretty","html:test-outpul.html","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}//to generate junit report 
		)


public class TestRunner {

}
