package utils;

import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class factory {

    public static WebElement initElement(WebDriver driver, String xpath) {
        WebElement xpathElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            xpathElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (Exception e) {
            Assertions.fail("Elemento web [" + xpath + "] no fue encontrado durante el tiempo estimado\nError: " + e.getMessage());
        }
        return xpathElement;
    }

    public static List<WebElement> initElements(WebDriver driver, String xpath) {
        List<WebElement> xpathElements = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            xpathElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
        } catch (Exception e) {
            Assertions.fail("Elementos web [" + xpath + "] no fueron encontrados durante el tiempo estimado\nError: " + e.getMessage());
        }
        return xpathElements;
    }

}
