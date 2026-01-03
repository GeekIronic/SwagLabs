package pages;

public class HomePage {

    private String TxtTiteHome = "//div[@class='app_logo']";
    private String TxtNavarHome = "//div[@id='header_container']//child::div[@class='primary_header']";
    private String IconMenu = "";
    private String IconCar = "//a[@class='shopping_cart_link']";

    public HomePage() {}

    public HomePage(String txtTiteHome, String txtNavarHome, String iconMenu, String iconCar) {
        TxtTiteHome = txtTiteHome;
        TxtNavarHome = txtNavarHome;
        IconMenu = iconMenu;
        IconCar = iconCar;
    }

    public String getTxtTiteHome() {
        return TxtTiteHome;
    }

    public void setTxtTiteHome(String txtTiteHome) {
        TxtTiteHome = txtTiteHome;
    }

    public String getTxtNavarHome() {
        return TxtNavarHome;
    }

    public void setTxtNavarHome(String txtNavarHome) {
        TxtNavarHome = txtNavarHome;
    }

    public String getIconMenu() {
        return IconMenu;
    }

    public void setIconMenu(String iconMenu) {
        IconMenu = iconMenu;
    }

    public String getIconCar() {
        return IconCar;
    }

    public void setIconCar(String iconCar) {
        IconCar = iconCar;
    }
}
