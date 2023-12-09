package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginPage;
import ui.TodoPage;

public class CreateProyect {
    public static void as(WebDriver webDriver, String email, String pass, String name) {
        Login.as(webDriver, email, pass);

        Click.on(webDriver, TodoPage.addProyect);
        Enter.text(webDriver, TodoPage.nameProduct, name);
        Click.on(webDriver, TodoPage.createButton);
    }

    public static void newTodo(WebDriver webDriver, String email, String pass, String name, String task) {
        as(webDriver, email, pass, name);

        Enter.text(webDriver, TodoPage.newTodoText, task);
        Click.on(webDriver, TodoPage.addNewTodo);
    }
}
