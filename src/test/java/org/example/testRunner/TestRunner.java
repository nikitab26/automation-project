package org.example.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"org.example.stepDefinitions"}
        , tags = "@AddCust"
      //  , dryRun = true
     //   , plugin = {"pretty" , "html:target/html_report.html"}
)
public class TestRunner {
}
