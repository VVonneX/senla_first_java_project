package ru.senla.user;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/scenarios",
        glue = "ru.senla.user",
        tags = "@smoke",
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
