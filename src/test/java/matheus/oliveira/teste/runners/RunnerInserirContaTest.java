package matheus.oliveira.teste.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/InserirConta.feature",
		glue = "matheus.oliveira.teste.steps",
		plugin = {"pretty", "html:target/html-report"},
		monochrome = true,
		tags = "~@ignore",
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false)
public class RunnerInserirContaTest {

}
