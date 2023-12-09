package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.Signup;

public class SignUp {
    public static void as(WebDriver webDriver, String user, String email, String pass) {
        Click.on(webDriver, Signup.signupPageButton);
        Enter.text(webDriver, Signup.userForm, user);
        Enter.text(webDriver, Signup.emailForm, email);
        Enter.text(webDriver, Signup.passwordForm, pass);
    }
}
