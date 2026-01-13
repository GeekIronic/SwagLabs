package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.FactoryWebElements;

import java.util.List;

public class HomePage {

    public static WebElement getTitelHome(WebDriver driver) {
        return FactoryWebElements.initWebElementXpath(driver, "//div[@class='app_logo']");
    }

    public static WebElement getNavarHome(WebDriver driver) {
        return FactoryWebElements.initWebElementXpath(driver, "//div[@id='header_container']//child::div[@class='primary_header']");
    }

    public static WebElement getIconMenu(WebDriver driver) {
        return FactoryWebElements.initWebElementXpath(driver, "//button[@id='react-burger-menu-btn']");
    }

    public static WebElement getIconoCar(WebDriver driver) {
        return FactoryWebElements.initWebElementXpath(driver, "//a[@class='shopping_cart_link']");
    }

    public static WebElement getIconoBurger(WebDriver driver) {
        return FactoryWebElements.initWebElementXpath(driver, "//div[@class='bm-menu']");
    }

    public static List<WebElement> getListMenu(WebDriver driver) {
        return FactoryWebElements.initWebElementsXpath(driver, "//nav[@class='bm-item-list']//child::a[@class='bm-item menu-item']");
    }
}
