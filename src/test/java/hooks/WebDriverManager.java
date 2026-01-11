package hooks;

// En esta clase instanciaremos la clase de webdriver para abrir el navegador

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WebDriverManager {

    public static WebDriver driver;
    public static final String BROWSER = "chrome";

    public static WebDriver getDriver() {
        if (driver == null) {

            if (BROWSER.equals("chrome")) {
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
            } else if (BROWSER.equals("Mozilla")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/webdrivers/geckodriver.exe");
                // ... dentro de getDriver()
                /**
                 * FirefoxOptions options = new FirefoxOptions();
                 * options.addArguments("--window-size=1920,1080")
                 */
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }


        }
        return driver;
    }

}
