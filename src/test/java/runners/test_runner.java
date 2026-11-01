package runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("features")
// @SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefinition, hooks")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-reports.html")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@Test")
// 👇 Habilita la publicación del reporte público en la nube de Cucumber
@ConfigurationParameter(key = "cucumber.publish.enabled", value = "true")
// 👇 Opcional: Evita que la consola se llene de mensajes repetitivos sobre la publicación
@ConfigurationParameter(key = "cucumber.publish.quiet", value = "true")
// 👇 Configura la generación de métodos en formato camelCase
// @ConfigurationParameter(key = "cucumber.snippet-type", value = "snakecase")

public class test_runner {
}
