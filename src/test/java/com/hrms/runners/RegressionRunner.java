package com.hrms.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;// allows us to use features
import io.cucumber.junit.Cucumber;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features/" 
			, glue = "com/hrms/steps" 
			, dryRun = false 
			, strict = true
			, monochrome = true
			, tags = "@regression"
			, plugin = {
					"pretty", 
																						
					"html:target/cucumber-default-report", 
					"json:target/cucumber.json",
					"rerun: target/failed.txt"
			}
			)
	
	
public class RegressionRunner {
	
	
	
	
}