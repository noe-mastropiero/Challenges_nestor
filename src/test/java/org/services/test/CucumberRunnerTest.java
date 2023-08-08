package org.services.test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
        features ="src/AcceptanceTest/test/resources/AcceptanceTest",
        glue = {"src.main.java.stepDefinitions"},
        strict = true,
        snippets = SnippetType.CAMELCASE
)
public class CucumberRunnerTest {
}
