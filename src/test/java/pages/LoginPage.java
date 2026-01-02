package pages;

public class LoginPage {

    private String TxtTitelHome = "//div[@class='login_logo']";
    private String FormLogin = "//form";
    private String TxtUser = "user-name";
    private String TxtPassword = "password";
    private String BtnLogin = "//input[@id='login-button']";
    private String TxtMessagaeLogin = "//div[@class='error-message-container error']//child::h3";


    public LoginPage() {}

    public LoginPage(String txtTitelHome, String formLogin, String txtUser, String txtPassword, String btnLogin, String txtMessagaeLogin) {
        TxtTitelHome = txtTitelHome;
        FormLogin = formLogin;
        TxtUser = txtUser;
        TxtPassword = txtPassword;
        BtnLogin = btnLogin;
        TxtMessagaeLogin = txtMessagaeLogin;

    }

    public String getTxtTitelHome() {
        return TxtTitelHome;
    }

    public String getTxtUser() {
        return TxtUser;
    }

    public String getBtnLogin() {
        return BtnLogin;
    }

    public String getTxtPassword() {
        return TxtPassword;
    }

    public String getTxtMessagaeLogin() {
        return TxtMessagaeLogin;
    }

    public String getFormLogin() {
        return FormLogin;
    }
}
