Feature: Validación y verificación de la pagina de compra

  Background: Iniciar sesion
    Given estoy en el formulario
    When ingreso en el campo username el valor "standard_user" el password "secret_sauce" y da clic en el boton de Logear
    Then El sistema lo redireccionara a la pagina de compras

  @Tests
  Scenario: Verificar que la pagina de compra contenga el naver correspondiente, el menu y el carrito de compra
    Given que el usuario entro a la pagina de compra
    When Valida el naver, menu e icono de compra
    Then el sistema permitira visualizar en el naver el menu interactivo con sus respectivas opciones
    And el sistema permitira visualizar en el naver el icono de compra y la redireccion del misma a la pestaña de tus productso añadidos al carro