import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {

    @Test
    public void DummyTestingThatIsPassing(){
        Assert.assertTrue(true);
    }

    @Test
    public void DummyTestingThatIsFailing(){
        Assert.assertTrue(false);
    }
}
