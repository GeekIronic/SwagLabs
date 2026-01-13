package definitions;

import hooks.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.List;


public class HomeTest {

    WebDriver driver = new WebDriverManager().getDriver();
    HomePage hp = new HomePage();
    List<WebElement> ListMenu;

    @Given("que el usuario entro a la pagina de compra")
    public void que_el_usuario_entro_a_la_pagina_de_compra() throws InterruptedException {
        Assert.assertTrue(HomePage.getNavarHome(driver).isDisplayed());
    }
    @When("Valida el naver, menu e icono de compra")
    public void valida_el_naver_menu_e_icono_de_compra() {
        Assert.assertTrue(hp.getIconoCar(driver).isDisplayed());
        Assert.assertTrue(hp.getNavarHome(driver).isDisplayed());
        Assert.assertTrue(hp.getIconMenu(driver).isDisplayed());
    }
    @Then("el sistema permitira visualizar en el naver el menu interactivo con sus respectivas opciones")
    public void el_sistema_permitira_visualizar_en_el_naver_el_menu_interactivo_con_sus_respectivas_opciones() throws InterruptedException {
        Thread.sleep(2000);
        hp.getIconMenu(driver).click();
        Assert.assertFalse("El menú no se encontró en la página", hp.getListMenu(driver).isEmpty());
        Assert.assertEquals("La cantidad de opciones no es la correcta",HomePage.getListMenu(driver).size(),4);
    }

    @Then("el sistema permitira visualizar en el naver el icono de compra y la redireccion del misma a la pestaña de tus productso añadidos al carro")
    public void el_sistema_permitira_visualizar_en_el_naver_el_icono_de_compra_y_la_redireccion_del_misma_a_la_pestaña_de_tus_productso_añadidos_al_carro() {
        Assert.assertTrue(HomePage.getIconoCar(driver).isDisplayed());
        HomePage.getIconoCar(driver).click();
    }
}
