package org.RunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.jvmreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources" , 
                 glue="org.Stepdefination",
                 monochrome=true,
                 dryRun=false,
                 plugin="json:Jsonreport\\jrpo.json")

public class TestRunnerClass {
@AfterClass
public static void jvmreportgeneration() {
	jvmreport.jreport("F:\\Frame work\\Cucumber\\Cucumber1\\Jsonreport\\jrpo.json");
	


}

}
