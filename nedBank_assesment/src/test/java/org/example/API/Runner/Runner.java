package org.example.API.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        tags="@api",
        glue = {"org.example"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
