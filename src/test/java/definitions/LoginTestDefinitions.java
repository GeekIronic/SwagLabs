package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTestDefinitions {

    WebDriver driver = new  WebDriverManager().getDriver();

    @Given("estoy en el formulario")
    public void estoy_en_el_formulario() {
        driver.get("https://www.saucedemo.com/");
    }
    @When("ingreso en el campo username el valor {string}")
    public void ingreso_en_el_campo_username_el_valor(String string) {
        WebElement user = driver.findElement(By.name("user-name"));
        user.sendKeys(string);
    }
    @When("ingreso en el campo password el valor {string}")
    public void ingreso_en_el_campo_password_el_valor(String string) throws InterruptedException {
        driver.findElement(By.name("password")).sendKeys(string);
        Thread.sleep(4000);
    }
    @When("doy clic en el boton Login")
    public void doy_clic_en_el_boton_login() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).sendKeys(Keys.ENTER);

    }
    @Then("el sistema lo redireccionara a la pagina principal de compras")
    public void el_sistema_lo_redireccionara_a_la_pagina_principal_de_compras() {

    }
    @Then("validara que exista las opciones de {string}")
    public void validara_que_exista_las_opciones_de(String string) throws InterruptedException {
        List<WebElement> botonCompra = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        Assert.assertFalse("No fue cargada la página de compras",botonCompra.isEmpty());
        Thread.sleep(4000);
    }

    // Cuando el logeo es con un usuario que esta bloqueado+

    @Then("el sistema permanecera en la pagina del login")
    public void el_sistema_permanecera_en_la_pagina_del_login() {

    }
    @Then("validara que exista el mensaje {string}")
    public void validara_que_exista_el_mensaje(String string) throws InterruptedException {
        WebElement messBlock =  driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        //System.out.println(messBlock.getText());
        Assert.assertTrue("Comparación de mensajes exitoso",messBlock.getText().contains(string));
        Thread.sleep(4000);
    }

}
