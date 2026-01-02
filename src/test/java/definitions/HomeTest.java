package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class HomeTest {

    WebDriver driver = new WebDriverManager().getDriver();

    @Given("que estoy dentro del home")
    public void que_estoy_dentro_del_home() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("verifico la existencia del naver, menu y carrito de compra")
    public void verifico_la_existencia_del_naver_menu_y_carrito_de_compra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("el sistema debe mostrar que el naver existe con el titulo {string}")
    public void el_sistema_debe_mostrar_que_el_naver_existe_con_el_titulo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("el menu sera desplegable, mostrando un listado de opciones y con la opcion de cerrarlo")
    public void el_menu_sera_desplegable_mostrando_un_listado_de_opciones_y_con_la_opcion_de_cerrarlo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("el carrito de compra sera un icono de carro de supermercado, y al dar clic lo redireccionar a la seccion de carrito de compra")
    public void el_carrito_de_compra_sera_un_icono_de_carro_de_supermercado_y_al_dar_clic_lo_redireccionar_a_la_seccion_de_carrito_de_compra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
