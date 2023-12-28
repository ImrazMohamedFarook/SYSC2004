/**
 * The test class CounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class CounterTest {
    private Counter c1;
    private RollOverCounter rolloverCounter;
    private LimitedCounter limitedCounter;
	
    /**
     * Default constructor for test class CounterTest
     */
    public CounterTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    protected void setUp()
    {
        c1 = new RollOverCounter(1, 10);
        rolloverCounter = new RollOverCounter(1, 10);
        limitedCounter = new LimitedCounter(1, 5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    protected void tearDown()
    {
    }
    
    /**
     * Tests the original (lab 9) RollOverCounter methods.
     */
    @Test
    public void testAllRollOverCounterMethods()
    {
//        /* Verify that the counter is in the correct initial state. */
//        assertEquals(1, c1.minimumCount());
//        assertEquals(10, c1.maximumCount());
//        assertEquals(1, c1.count());
//
//        assertTrue(c1.isAtMinimum());
//        assertFalse(c1.isAtMaximum());
//
//        /* Count 1 -> 2 */
//
//        c1.countUp();
//        assertEquals(2, c1.count());
//        assertFalse(c1.isAtMinimum());
//
//        /* Count 3, 4, ...9, 10 */
//        for (int i = 1; i < 9; i++) {
//            c1.countUp();
//        }
//        assertTrue(c1.isAtMaximum());
//
//        /* Count 10 -> 1 */
//        c1.countUp();
//        assertEquals(1, c1.count());
//
//        /* Verify that reset works. */
//        c1.countUp();
//        c1.countUp();
//        c1.reset();
//        assertEquals(1, c1.count());

        assertEquals(1, rolloverCounter.minimumCount());
        assertEquals(10, rolloverCounter.maximumCount());
        assertEquals(1, rolloverCounter.count());
        assertTrue(rolloverCounter.isAtMinimum());
        assertFalse(rolloverCounter.isAtMaximum());

        // Count 1 -> 2
        rolloverCounter.countUp();
        assertEquals(2, rolloverCounter.count());
        assertFalse(rolloverCounter.isAtMinimum());

        // Count 3, 4, ...9, 10
        for (int i = 1; i < 9; i++) {
            rolloverCounter.countUp();
        }
        assertTrue(rolloverCounter.isAtMaximum());

        // Count 10 -> 1
        rolloverCounter.countUp();
        assertEquals(1, rolloverCounter.count());

        // Verify that reset works.
        rolloverCounter.countUp();
        rolloverCounter.countUp();
        rolloverCounter.reset();
        assertEquals(1, rolloverCounter.count());
    }
    @Test
    public void testAllLimitedCounterMethods() {
        assertEquals(1, limitedCounter.minimumCount());
        assertEquals(5, limitedCounter.maximumCount());
        assertEquals(1, limitedCounter.count());
        assertTrue(limitedCounter.isAtMinimum());
        assertFalse(limitedCounter.isAtMaximum());

        // Count 1 -> 2
        limitedCounter.countUp();
        assertEquals(2, limitedCounter.count());
        assertFalse(limitedCounter.isAtMinimum());

        // Count 3, 4, 5
        for (int i = 1; i < 4; i++) {
            limitedCounter.countUp();
        }
        assertTrue(limitedCounter.isAtMaximum());

        // Count 5 -> 1
        limitedCounter.countUp();
        assertEquals(5, limitedCounter.count());

        // Verify that reset works.
        limitedCounter.countUp();
        limitedCounter.countUp();
        limitedCounter.reset();
        assertEquals(1, limitedCounter.count());
    }

    /**
     * Tests the new methods in class RollOverCounter: setToMaximum() and countDown().
     */
    @Test
    public void testNewRollOverCounterMethods() {
        // Test setToMaximum()
        assertEquals(10, rolloverCounter.maximumCount());
        rolloverCounter.setToMaximum();
        assertEquals(10, rolloverCounter.count());

        // Test countDown()
        rolloverCounter.countDown();
        assertEquals(9, rolloverCounter.count());
        rolloverCounter.countDown();
        assertEquals(8, rolloverCounter.count());
        rolloverCounter.setToMaximum();
        //rolloverCounter.countDown();
        assertEquals(10, rolloverCounter.count());
    }

    /**
     * Tests the new methods in class LimitedCounter: setToMaximum() and countDown().
     */
    @Test
    public void testNewLimitedCounterMethods() {
        // Test setToMaximum()
        assertEquals(5, limitedCounter.maximumCount());
        limitedCounter.setToMaximum();
        assertEquals(5, limitedCounter.count());

        // Test countDown()
        limitedCounter.countDown();
        assertEquals(4, limitedCounter.count());
        limitedCounter.countDown();
        assertEquals(3, limitedCounter.count());
        limitedCounter.setToMaximum();
        limitedCounter.countDown();
        assertEquals(4, limitedCounter.count());
    }

}
