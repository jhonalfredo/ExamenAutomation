package ui;

import org.openqa.selenium.By;

public class Signup {
    public static By signupPageButton = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img");
    public static By formSignupButton = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");

    public static By userForm = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
    public static By emailForm = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By passwordForm = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By checkAcept = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");
    public static By sentSign = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");
}
