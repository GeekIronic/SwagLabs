Feature: Validación de la pagina inventario, sus articulos, botones y seleccion de articulos

  Background: Validación de acceso mediante credenciales correctas
    Given el usuario inicia sesion con las credenciales user "" and passowrd ""
  @Test
  Scenario: Validar que la pagina de inventario cuente con las opciones de menu
    Given el usuario entra a la pagina de inventario
    When el usuario verifica la existencia de la opcion del menu
    And da clic en la opcion del menu
    Then El sistema debe mostrar un listado con las opciones parametrizadas
  @Test
  Scenario: Validar que la pagina de inventario cuenta con una opcion de filtros
    Given el usuario entra a la pagina de inventario
    When el usuario verifica la existencia de la opcion del filtros
    And da clic en la opcion del filtros
    Then El sistema debe mostrar un listado con las opciones parametrizadas
  @Test
  Scenario: Validar que la pagina de inventario cuenta con una opcion de carrito
    Given el usuario entra a la pagina de inventario
    When el usuario verifica la existencia de la opcion del carrito
    Then El sistema debe mostrar una opcion de carrito visible
  @Test
  Scenario Outline: Validar existencia de productos a comprar
    Given el usuario entra a la pagina de inventario
    When el usuario verifica la existencia del producto disponible "<producto>"
    Examples:
      | producto  |
      | Sauce Labs Backpack |
      | Sauce Labs Bolt T-Shirt |
      | Sauce Labs Onesie |
      | Sauce Labs Bike Light |
      | Sauce Labs Fleece Jacket |
      | Test.allTheThings() T-Shirt (Red) |