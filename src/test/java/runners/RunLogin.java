package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //buscar los escenarios de gherkin de alguna carpeta en especial, indicando la carpeta
        glue = "definitions", // indica el pegamento (carpeta donde estara la logica)
        tags = "@VerificarFormularioLogin", // Inidcamos las anotaciones de las pruebas a ejecutar (tags)
        publish = true // Inidcamos si generamos reportes web
)
public class RunLogin {

     public RunLogin() {}
}
