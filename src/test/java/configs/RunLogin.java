package configs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //buscar los escenarios de gherkin de alguna carpeta en especial, indicando la carpeta
        features = "src/test/resources/features",
        // indica el pegamento (carpeta donde estara la logica)
        glue = "definitions",
        // Inidcamos las anotaciones de las pruebas a ejecutar (tags)
        tags = "@VerificarFormularioLogin",
        // Inidcamos si generamos reportes web
        publish = true
)

public class RunLogin {

     public RunLogin() {}
}
