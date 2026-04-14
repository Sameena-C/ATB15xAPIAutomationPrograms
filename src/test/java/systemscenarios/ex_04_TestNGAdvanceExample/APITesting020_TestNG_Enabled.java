package systemscenarios.ex_04_TestNGAdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting020_TestNG_Enabled {

    @Test
    public void test01() {
        Assert.assertTrue(false);
    }
    @Test(enabled = false)
    public void test02() {
        Assert.assertTrue(true);
    }
    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}
