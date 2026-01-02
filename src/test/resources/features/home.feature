
Feature: Validación de la pagina principal de compra

  Background:
    Given estoy en el formulario
    When ingreso en el campo username el valor "standard_user"
    And ingreso en el campo password el valor "secret_sauce"
    And doy clic en el boton Login
    Then el sistema lo redireccionara a la pagina principal de compras
    And validara que existan el listado de opcions de compra
    And validara que exista las opciones de "Add to cart"

  @Test
  Scenario: Validar que se muestre el naver con las opciones correspondientes
    Given que estoy dentro del home
    When verifico la existencia del naver, menu y carrito de compra
    Then el sistema debe mostrar que el naver existe con el titulo "Swag Labs"
    And el menu sera desplegable, mostrando un listado de opciones y con la opcion de cerrarlo
    And el carrito de compra sera un icono de carro de supermercado, y al dar clic lo redireccionar a la seccion de carrito de compra
