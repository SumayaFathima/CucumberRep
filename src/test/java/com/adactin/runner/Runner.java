package com.adactin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = "com.adactin.stepdefinition", snippets = SnippetType.CAMELCASE, monochrome = true, 
plugin = {"html:C:\\Users\\sumay\\OneDrive\\Desktop\\eclipse\\FinalProject\\REPORTS\\HTMLReport",
		  "json:C:\\Users\\sumay\\OneDrive\\Desktop\\eclipse\\FinalProject\\REPORTS\\JSONReport\\jsonReportingFile.json",
		  "junit:C:\\Users\\sumay\\OneDrive\\Desktop\\eclipse\\FinalProject\\REPORTS\\JUNITReport\\junitReportingFile.xml"})


public class Runner {
	
} 	