package definitions;

import hooks.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeTest {

    WebDriver driver = new WebDriverManager().getDriver();


    @Given("que el usuario entro a la pagina de compra")
    public void que_el_usuario_entro_a_la_pagina_de_compra() throws InterruptedException {
        WebElement titel_nav = driver.findElement(By.xpath("//div[@class='app_logo']"));
        //driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        WebElement NavarHome =  driver.findElement(By.xpath("//div[@id='header_container']//child::div[@class='primary_header']"));
        Assert.assertTrue(titel_nav.isDisplayed());
        Assert.assertTrue(NavarHome.isDisplayed());
        Thread.sleep(2500);
    }
    @When("Valida el naver, menu e icono de compra")
    public void valida_el_naver_menu_e_icono_de_compra() {

    }
    @Then("el sistema permitira visualizar en el naver el menu interactivo con sus respectivas opciones")
    public void el_sistema_permitira_visualizar_en_el_naver_el_menu_interactivo_con_sus_respectivas_opciones() {

    }
    @Then("el sistema permitira visualizar en el naver el icono de compra y la redireccion del misma a la pestaña de tus productso añadidos al carr")
    public void el_sistema_permitira_visualizar_en_el_naver_el_icono_de_compra_y_la_redireccion_del_misma_a_la_pestaña_de_tus_productso_añadidos_al_carr() {

    }


}
