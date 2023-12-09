import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUp;
import task.validations.IsSignupVisible;

public class SingUpTest extends BaseTest {

    @Test
    public void signUpTest() {
        SignUp.as(webDriver, "juanperez", "jhon@gmail.com", "dfaaa");
        Assert.assertTrue(IsSignupVisible.visible(webDriver));
    }
}
