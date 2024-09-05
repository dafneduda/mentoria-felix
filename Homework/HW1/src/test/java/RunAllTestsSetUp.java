import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RunAllTestsSetUp {
    @BeforeClass
    public static void oneTimeSetUp() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("              Running: HW1 JUnit Tests");
        System.out.println("------------------------------------------------------------------");
        System.out.println(" Tests       Tests    Percentage    JUnit Class");
        System.out.println("Executed     Passed     Passed       Executed");
        System.out.println("------------------------------------------------------------------");
    } // oneTimeSetUp

    // --------------------------------------------
    // JUnit Tests
    // --------------------------------------------

    @Test
    public void alwaysPasses() {
        assertTrue(true);
    } // alwaysPasses
}