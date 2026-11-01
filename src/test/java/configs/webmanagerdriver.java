package configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class webmanagerdriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUp(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            System.out.println("Session iniciada");
        }


    }

    public static void tearDown(){
        if (driver != null) {
            driver.quit();
            System.out.println("Sesion cerrada");
            driver = null;
        } else {
            System.out.println("La session a sido cerrada con anterioridad");
        }
    }
}
