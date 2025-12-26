package configs;

// En esta clase instanciaremos la clase de webdriver para abrir el navegador

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;

public class WebDriverManager {

    public WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            // CONFIGURACIÓN ANTI-CAPTCHA
            ChromeOptions options = new ChromeOptions();
            // 1. Oculta la bandera "AutomationControlled"
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);
            // 2. Deshabilita el modo de automatización en el motor Blink
            options.addArguments("--disable-blink-features=AutomationControlled");
            // 3. User-Agent real (puedes actualizarlo según la versión de tu Chrome)
            options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            // 4. Iniciar maximizado (evita discrepancias de resolución que detectan bots)
            options.addArguments("--start-maximized");
            // 5. Deshabilitar extensiones y pop-ups molestos
            options.addArguments("--disable-extensions");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            driver = new ChromeDriver(options);
        }
        return driver;
    }

}
