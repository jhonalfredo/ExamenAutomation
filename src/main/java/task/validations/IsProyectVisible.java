package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoPage;

public class IsProyectVisible {
    public static boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, TodoPage.titleProyect);
    }

    public static boolean visibleTask(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, TodoPage.newTodoText);
    }
}
