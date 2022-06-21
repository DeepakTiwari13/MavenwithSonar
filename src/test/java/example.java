import org.testng.annotations.Test;

public class example {
    
    @Test(priority=1)
    public void test_one() {
        System.out.print("Executing test one ");
    }

    @Test(priority=2)
    public void test_two() {
        System.out.print("Executing test two ");
    }

    @Test(priority=3)
    public void test_three() {
        System.out.print("Executing test three ");
    }

    @Test(priority=4)
    public void test_four() {
        System.out.print("Executing test four ");
    }

    @Test(priority=5)
    public void test_five() {
        System.out.print("Executing test five ");
    }
    //sonartoken 10033c8476d3b781d053d5f4697145b3bd410e6d
}