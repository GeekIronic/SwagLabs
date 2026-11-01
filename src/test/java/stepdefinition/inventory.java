package stepdefinition;

import configs.webmanagerdriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

public class inventory {

    //public final static WebDriver driver = webmanagerdriver.getDriver();

    @Given("el usuario inicia sesion con las credenciales user {string} and passowrd {string}")
    public void el_usuario_inicia_sesion_con_las_credenciales_user_and_passowrd(String user, String password) {
        WebDriver driver = webmanagerdriver.getDriver();
        driver.get("https://www.saucedemo.com/");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        pages.home.get_user(driver).sendKeys(user);
        pages.home.get_password(driver).sendKeys(password);
        pages.home.get_login(driver).click();
    }
    @Given("el usuario entra a la pagina de inventario")
    public void el_usuario_entra_a_la_pagina_de_inventario() {
        System.out.println("");
    }
    @When("el usuario verifica la existencia de la opcion del menu")
    public void el_usuario_verifica_la_existencia_de_la_opcion_del_menu() {
        System.out.println("");
    }
    @When("da clic en la opcion del menu")
    public void da_clic_en_la_opcion_del_menu() {
        System.out.println("");
    }
    @Then("El sistema debe mostrar un listado con las opciones parametrizadas")
    public void el_sistema_debe_mostrar_un_listado_con_las_opciones_parametrizadas() {
        System.out.println("");
    }


    @When("el usuario verifica la existencia de la opcion del filtros")
    public void el_usuario_verifica_la_existencia_de_la_opcion_del_filtros() {
        System.out.println("");
    }
    @When("da clic en la opcion del filtros")
    public void da_clic_en_la_opcion_del_filtros() {
        System.out.println("");
    }

    @When("el usuario verifica la existencia de la opcion del carrito")
    public void el_usuario_verifica_la_existencia_de_la_opcion_del_carrito() {
        System.out.println("");
    }
    @Then("El sistema debe mostrar una opcion de carrito visible")
    public void el_sistema_debe_mostrar_una_opcion_de_carrito_visible() {
        System.out.println("");
    }


    @When("el usuario verifica la existencia del producto disponible {string}")
    public void el_usuario_verifica_la_existencia_del_producto_disponible(String string) {
        System.out.println("");
    }


}
