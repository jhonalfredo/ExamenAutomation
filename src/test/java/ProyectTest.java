import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CreateProyect;
import task.tasking.Login;
import task.validations.IsLoginVisible;
import task.validations.IsProyectVisible;
import ui.TodoPage;

public class ProyectTest extends BaseTest {
    @Test
    public void loginTest() {
        CreateProyect.as(webDriver, "j70085444@gmail.com", "jhon1020304050", "Diplomado V5");
        Assert.assertTrue(IsProyectVisible.visible(webDriver));
    }

    @Test
    public void newTaskTest(){
        CreateProyect.as(webDriver, "j70085444@gmail.com", "jhon1020304050", "Diplomado V5");
        Assert.assertTrue(IsProyectVisible.visible(webDriver));
    }
}
