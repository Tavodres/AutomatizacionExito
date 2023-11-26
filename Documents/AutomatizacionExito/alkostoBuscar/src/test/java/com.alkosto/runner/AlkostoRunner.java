package com.alkosto.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class )
@CucumberOptions(
        features = "src/test/resources/features/agregarProductoCarrito.feature",
        glue = "com.alkosto.stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AlkostoRunner {
}
