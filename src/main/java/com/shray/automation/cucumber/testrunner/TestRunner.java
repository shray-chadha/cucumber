package com.shray.automation.cucumber.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(		
			features="C:\\Users\\schadha\\eclipse-workspace\\cucumber\\src\\main\\java\\com\\shray\\automation\\cucumber\\feature\\",
			glue= {"com\\shray\\automation\\cucumber\\stepdefinitions"},
			format= {"pretty", "html:test-output", "junit:Junit_Output/cucumber.xml"},
			dryRun = false,
			monochrome = true,
			strict = true,
			tags = {"@First, @Second, @Third"}
		)


public class TestRunner {

}
