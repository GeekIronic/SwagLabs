package hooks;

// En esta clase instanciaremos la clase de webdriver para abrir el navegador

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

            // ... dentro de getDriver()
            ChromeOptions options = new ChromeOptions();

// ARGUMENTOS DE INICIO
            options.addArguments("--start-maximized");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-autofill-keyboard-accessor-stack");
            options.addArguments("--guest"); // <--- FUERZA PERFIL LIMPIO

// PREFERENCIAS (Nivel profundo)
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("credentials_enable_autosignin", false); // <--- EVITA EL POPUP DE SMART LOCK
            options.setExperimentalOption("prefs", prefs);

// EXCLUSIÓN DE BANDERAS
            options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
            options.setExperimentalOption("useAutomationExtension", false);

            driver = new ChromeDriver(options);


        }
        return driver;
    }

}
