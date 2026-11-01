package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.factory.initElement;

public class home {

    public static WebElement get_titel(WebDriver driver) {
        return initElement(driver, "//*[@id='root']/div/div[1]");
    }

    public static WebElement get_from_login(WebDriver driver) {
        return initElement(driver, "//*[@id='root']/div/div[2]/div[1]");
    }

    public static WebElement get_user (WebDriver driver) {
        return initElement(driver, "//*[@id='user-name']");
    }

    public static WebElement get_password (WebDriver driver) {
        return initElement(driver, "//*[@id='password']");
    }

    public static WebElement get_login (WebDriver driver) {
        return initElement(driver, "//*[@id='login-button']");
    }

    public static WebElement get_message (WebDriver driver) {
        return initElement(driver, "//*[@id='login_button_container']/div/form/div[3]/h3");
    }

}
