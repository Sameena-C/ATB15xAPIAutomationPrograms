package systemscenarios.ex_04_TestNGAdvanceExample;

import org.testng.annotations.Test;

public class APITesting016_TestNG_Priority {
    @Test(priority = 3)
    public void test_t1() {
        System.out.println("1");
    }

    @Test(priority = -1) // -1,-100, -2 == 0
    public void test_t4() {
        System.out.println("Highest!");
    }

    @Test(priority = 1)
    public void test_t2() {
        System.out.println("2");
    }

    @Test(priority = 2)
    public void test_t3() {
        System.out.println("3");
    }
}
