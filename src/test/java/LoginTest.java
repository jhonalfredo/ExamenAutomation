import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.Login;
import task.validations.IsLoginVisible;

public class LoginTest extends BaseTest {
    @Test
    public void loginTest() {
        Login.as(webDriver, "j70085444@gmail.com", "jhon1020304050");
        Assert.assertTrue(IsLoginVisible.logoutVisible(webDriver));
    }

    @Test
    public void logoutTest() {
        Login.as(webDriver, "j70085444@gmail.com", "jhon1020304050");
        Login.logout(webDriver);
        Assert.assertTrue(IsLoginVisible.loginVisible(webDriver));
    }
}
