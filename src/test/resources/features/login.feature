@VerificarFormularioLogin
Feature: Verificación de login de usuario

  @LoginExitoso
  Scenario: Validar logeo con credenciales correcta
    Given estoy en el formulario
    When ingreso en el campo username el valor "standard_user"
    And ingreso en el campo password el valor "secret_sauce"
    And doy clic en el boton Login
    Then el sistema lo redireccionara a la pagina principal de compras
    And validara que exista las opciones de "Add to cart"

  @LoginFallido
  Scenario: Validar logeo con credenciales bloqueadas
    Given estoy en el formulario
    When ingreso en el campo username el valor "locked_out_user"
    And ingreso en el campo password el valor "secret_sauce"
    And doy clic en el boton Login
    Then el sistema permanecera en la pagina del login
    And validara que exista el mensaje "Epic sadface: Sorry, this user has been locked out."

