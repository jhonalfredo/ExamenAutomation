import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.IsLoginVisible;
import task.validations.IsSignupVisible;

public class SingUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        SignUp.as(webDriver, "juanperez", "jhonmoralesestrada@gmail.com", "aaa102030");
        Assert.assertTrue(IsLoginVisible.logoutVisible(webDriver));
    }
}
