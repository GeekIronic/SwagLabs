package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class FactoryWebElements {

    public static WebElement initWebElementXpath(WebDriver driver, String xpath){
        WebElement XpathElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            XpathElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            return XpathElement;
        }catch (Exception e){
            Assert.assertTrue("Elemento web "+xpath+" no fue encontrado durante el tiempo estimado", false);
        }
        return XpathElement;
    }

    public static List<WebElement> initWebElementsXpath(WebDriver driver, String xpath) {
        List<WebElement> elements = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            // Espera a que al menos un elemento esté presente en el DOM
            elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
            return elements;
        } catch (Exception e) {
            Assert.fail("No se encontraron elementos con el xpath: " + xpath + " tras 20 segundos.");
        }
        return elements;
    }
}
