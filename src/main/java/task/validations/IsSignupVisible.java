package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.Signup;

public class IsSignupVisible {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, Signup.formSignupButton);
    }
}
