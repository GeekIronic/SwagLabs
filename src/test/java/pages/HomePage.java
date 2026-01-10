package pages;

public class HomePage {

    private String TxtTiteHome = "//div[@class='app_logo']";
    private String TxtNavarHome = "//div[@id='header_container']//child::div[@class='primary_header']";
    private String IconMenu = "//button[@id='react-burger-menu-btn']";
    private String IconCar = "//a[@class='shopping_cart_link']";
    private String BmMenu = "//div[@class='bm-menu']";
    private String TxtListMenu = "//nav[@class='bm-item-list']//child::a[@class='bm-item menu-item']";

    public HomePage() {}

    public HomePage(String txtTiteHome, String txtNavarHome, String iconMenu, String iconCar, String bmMenu, String txtListMenu) {
        TxtTiteHome = txtTiteHome;
        TxtNavarHome = txtNavarHome;
        IconMenu = iconMenu;
        IconCar = iconCar;
        BmMenu = bmMenu;
        TxtListMenu = txtListMenu;
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

    public String getBmMenu() {
        return BmMenu;
    }

    public void setBmMenu(String bmMenu) {
        BmMenu = bmMenu;
    }

    public String getTxtListMenu() {
        return TxtListMenu;
    }

    public void setTxtListMenu(String txtListMenu) {
        TxtListMenu = txtListMenu;
    }
}
