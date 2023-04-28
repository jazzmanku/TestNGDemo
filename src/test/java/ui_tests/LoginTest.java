package ui_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void Login_Test_ThatIsPassing(){
        System.out.println("Login Passed");
        Assert.assertTrue(true);
    }

    @Test
    public void Login_Test_ThatIsFailing(){
        System.out.println("Login Failed");
        Assert.assertTrue(false);
    }
}
