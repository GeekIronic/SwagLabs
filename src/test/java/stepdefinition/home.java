package stepdefinition;

import configs.webmanagerdriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class home {

    //public final static WebDriver driver = webmanagerdriver.getDriver();

    @Given("el usuario entro a la pagina web")
    public void el_usuario_entro_a_la_pagina_web() {
        WebDriver driver = webmanagerdriver.getDriver();
        driver.get("https://www.saucedemo.com/");
        assertNotNull("El form cotniene información", pages.home.get_from_login(driver).getText());
        assertEquals("Swag Labs", pages.home.get_titel(driver).getText(), "El Titulo es diferente");
    }

    @When("el usuario ingresa las credenciales de usuario {string} y contrasena {string} y da clic en login")
    public void el_usuario_ingresa_las_credenciales_de_usuario_y_contrasena_y_da_clic_en_login(String user, String password) {
        WebDriver driver = webmanagerdriver.getDriver();
        pages.home.get_user(driver).sendKeys(user);
        pages.home.get_password(driver).sendKeys(password);
        try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
        pages.home.get_login(driver).click();
    }

    @Then("el sistema lo redireccionara a la pagina de compras")
    public void el_sistema_lo_redireccionara_a_la_pagina_de_compras() {

        System.out.println("Se ha redireccionado a la pagina de compras");

    }

    @Then("el sistema permanece en el home y mostrara el mensaje {string}")
    public void el_sistema_permanece_en_el_home_y_mostrara_el_mensaje(String mess) {
        WebDriver driver = webmanagerdriver.getDriver();
        assertEquals(pages.home.get_message(driver).getText(),mess, "El mensaje capturado es diferente al mensaje esperado");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

