package ui;

import org.openqa.selenium.By;

public class LoginPage {
    public static By button = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img");
    public static By emailForm = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By passwordForm = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
    public static By buttonSend = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");

    public static By logoutButton = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
}
