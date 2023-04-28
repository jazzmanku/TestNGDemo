package api_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITest {
    @Test
    public void API_TestingThatIsPassing(){
        Assert.assertTrue(true);
    }

    @Test
    public void API_TestingThatIsFailing(){
        Assert.assertTrue(false);
    }
}
