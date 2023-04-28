package api_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {
    @Test
    public void Login_API_TestingThatIsPassing(){
        Assert.assertTrue(true);
    }

    @Test
    public void Login_API_TestingThatIsFailing(){
        Assert.assertTrue(false);
    }
}
