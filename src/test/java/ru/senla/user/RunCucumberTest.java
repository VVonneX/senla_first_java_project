package ru.senla.user;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/scenarios",
        plugin = {"json:build/resources/cucumber.json"},
        glue = {"ru.senla.steps"},
        tags = "@smoke",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
