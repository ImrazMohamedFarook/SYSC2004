/**
 * A RollOverCounter class that inherits from the Counter class and provides a counting mechanism.
 * This class extends the Counter class and allows counting between a specified minimum and maximum value.
 * When the counter reaches its maximum value, invoking the countUp() method rolls the counter over to its minimum value.
 *
 * Part 4: Inheritance and RollOverCounter
 *
 * @Author: Imraz Mohamed Farook
 * @Version: 1.03 August 1st, 2023
 **/
public class RollOverCounter extends Counter
{
    /**
     * Increment this counter by 1.
     * If the counter reaches its maximum value, invoking this method will roll the counter over to its minimum value.
     */
    @Override
    public void countUp() {
        // If we've reached the maximum count, roll over to the minimum value.
        if (isAtMaximum()) {
            reset();
        } else {
            super.countUp();
        }
    }

//    @Override
//    public void countDown() {
//
//    }

    /**
     * Constructs a new RollOverCounter with the default minimum and maximum values.
     * The current count is initialized to the default minimum value (0), and the counter counts between
     * the default minimum and maximum values (0 and 999, inclusive).
     */
    public RollOverCounter() {
        super();
    }
    /**
     * Constructs a new RollOverCounter with the specified minimum and maximum values.
     * The current count is initialized to the specified minimum value, and the counter counts between
     * the specified minimum and maximum values (inclusive).
     *
     * @param minCount The minimum value for the counter.
     * @param maxCount The maximum value for the counter.
     */
    public RollOverCounter(int minCount, int maxCount) {
        super(minCount, maxCount);
    }
    /**
     * Decrement this counter by 1. If we've reached the minimum count,
     * invoking this method rolls the counter over to its maximum value.
     */
    @Override
    public void countDown()
    {
        if (isAtMinimum()) {
            setToMaximum();
        } else {
            super.decrementCount();
        }
    }
}
