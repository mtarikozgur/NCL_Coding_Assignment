package com.ncl.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"},
        features = "src/test/resources/com/ncl/features",
        glue = "/com/ncl/step_definitions",
        tags = "@tasks",
        dryRun = false
)
public class CukesRunner {

}
