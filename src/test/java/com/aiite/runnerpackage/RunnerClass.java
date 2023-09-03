package com.aiite.runnerpackage;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\Features",
				glue={"com.aiite.stepdefinition"},
				monochrome=true,
				dryRun=false,
				strict=true,
				plugin= {"html:Reports/Html", "json:Reports/Json/report.json"})
public class RunnerClass {

}
