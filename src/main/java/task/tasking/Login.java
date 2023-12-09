package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginPage;

public class Login {

    public static void as(WebDriver webDriver, String email, String pass) {
        Click.on(webDriver, LoginPage.button);
        Enter.text(webDriver, LoginPage.emailForm, email);
        Enter.text(webDriver, LoginPage.passwordForm, pass);
        Click.on(webDriver, LoginPage.buttonSend);
    }

    public static void logout(WebDriver webDriver) {
        Click.on(webDriver, LoginPage.logoutButton);
    }
}
