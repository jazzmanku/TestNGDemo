package ui_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

    @Test
    public void UI_TestingThatIsPassing(){
        Assert.assertTrue(true);
    }

    @Test
    public void UI_TestingThatIsFailing(){
        Assert.assertTrue(false);
    }
}
