package br.unicamp.comprefacil.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "br.unicamp.comprefacil.steps",
        features = "classpath:features/UC01.feature"
)
public class RunUC01Test {
}

