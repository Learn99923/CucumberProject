package com.opencart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty","html:C:\\Users\\Nasir\\eclipse-workspace\\CucumberProject\\TestReport\\CucumberReport.html"},
                 features="src/test/java/com/opencart/feature/Register.feature",
                 glue={"com/opencart/stepsdefination","com/opencart/hook"})
public class TestRunner{
	
	 
}