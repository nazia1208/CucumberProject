package com.aiite.runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
				glue={"com.aiite.stepdefinition", "com.aiite.hookspackage"},
				monochrome=true,
				dryRun=false,
				strict=true,
				plugin= {"html:Reports/Html", "json:Reports/Json/report.json","rerun:target/rerun.txt"})
public class ReRunner {

}
