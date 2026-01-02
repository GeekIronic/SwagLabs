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
import pages.LoginPage;

import java.util.List;

public class LoginTest {

    WebDriver driver = new  WebDriverManager().getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("estoy en el formulario")
    public void estoy_en_el_formulario() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(4000);
        String TitelHome = driver.findElement(By.xpath(loginPage.getTxtTitelHome())).getText();
        WebElement FormLoginPage = driver.findElement(By.xpath(loginPage.getFormLogin()));
        Assert.assertEquals("Swag Labs", TitelHome);
        Assert.assertTrue("El formulario no existe",FormLoginPage.isDisplayed());
    }
    @When("ingreso en el campo username el valor {string}")
    public void ingreso_en_el_campo_username_el_valor(String string) {
        WebElement user = driver.findElement(By.name(loginPage.getTxtUser()));
        Assert.assertTrue("El campo usuario no existe", user.isDisplayed());
        user.sendKeys(string);
    }
    @When("ingreso en el campo password el valor {string}")
    public void ingreso_en_el_campo_password_el_valor(String string) throws InterruptedException {
        WebElement pass = driver.findElement(By.name(loginPage.getTxtPassword()));
        Assert.assertTrue("El campo contraseña no existe",pass.isDisplayed());
        pass.sendKeys(string);
        Thread.sleep(4000);
    }
    @When("doy clic en el boton Login")
    public void doy_clic_en_el_boton_login() throws InterruptedException {
        WebElement btnlogin = driver.findElement(By.xpath(loginPage.getBtnLogin()));
        btnlogin.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }
    @Then("el sistema lo redireccionara a la pagina principal de compras")
    public void el_sistema_lo_redireccionara_a_la_pagina_principal_de_compras() throws InterruptedException {
        String Validationurl = driver.getCurrentUrl();
        Assert.assertNotEquals(Validationurl, "https://www.saucedemo.com/");
        Thread.sleep(4000);
    }








    @Then("validara que existan el listado de opcions de compra")
    public void validara_que_existan_el_listado_de_opcions_de_compra() {
        String inventory_list = "";
        List ContList = driver.findElements(By.xpath("//div[@class='inventory_list']//child::div[@class='inventory_item']//child::div[contains(@class, 'inventory_item_img')]"));
        System.out.println(ContList.size());
        Assert.assertTrue("La cantidad de articulos no coinciden",ContList.size() == 6);
    }

    @Then("validara que exista las opciones de {string}")
    public void validara_que_exista_las_opciones_de(String string) throws InterruptedException {
        List<WebElement> botonCompra = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
        Assert.assertFalse("No fue cargada los botones de compras",botonCompra.isEmpty());
        Thread.sleep(4000);
    }

    // Cuando el logeo es con un usuario que esta bloqueado+

    @Then("el sistema permanecera en la pagina del login")
    public void el_sistema_permanecera_en_la_pagina_del_login() {
        String Validationurl = driver.getCurrentUrl();
        Assert.assertEquals(Validationurl,"https://www.saucedemo.com/");
    }
    @Then("validara que exista el mensaje {string}")
    public void validara_que_exista_el_mensaje(String string) throws InterruptedException {
        WebElement messBlock =  driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        Assert.assertTrue("Comparación de mensajes exitoso",messBlock.getText().contains(string));
        Thread.sleep(4000);
    }

}
