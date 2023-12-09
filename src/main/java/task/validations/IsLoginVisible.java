package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoginPage;
import ui.Signup;

public class IsLoginVisible {
    public static boolean loginVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoginPage.button);
    }

    public static boolean logoutVisible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, LoginPage.logoutButton);
    }
}
