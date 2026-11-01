Feature: Validación de acceso mediante credenciales


  Scenario Outline: Entrada exitosa al sistema
    Given el usuario entro a la pagina web
    When el usuario ingresa las credenciales de usuario "<user>" y contrasena "<password>" y da clic en login
    Then el sistema lo redireccionara a la pagina de compras
    Examples:
      | user          | password    |
      | standard_user |secret_sauce |

  Scenario Outline: Validación de campos obligatrios, credenciales que no existen y usuario bloqueado
    Given el usuario entro a la pagina web
    When el usuario ingresa las credenciales de usuario "<user>" y contrasena "<password>" y da clic en login
    Then el sistema permanece en el home y mostrara el mensaje "<mess>"
    Examples:
      | user | password | mess                                |
      | ASDF |          | Epic sadface: Password is required  |
      |      | ASDASDAD | Epic sadface: Username is required   |
      | ASDA | ASDA     | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
