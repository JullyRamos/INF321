package br.unicamp.comprefacil.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber" },
        glue = "br.unicamp.comprefacil.steps",
        features = "classpath:features/UC01.feature"
)
public class RunUC01Test {
	static private WireMockServer wireMockServer;
	
	@BeforeClass
	static public void runBeforeClass() {
		wireMockServer = new WireMockServer(wireMockConfig().port(8090));
		configureFor(8090);
		wireMockServer.start();
	}
	
	@AfterClass
	static public void runAfterClass() {
		wireMockServer.stop();
	}
}

