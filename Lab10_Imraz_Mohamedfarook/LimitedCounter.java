/**
 * A LimitedCounter class that inherits from the Counter class and provides a counting mechanism.
 * This class extends the Counter class and allows counting between a specified minimum and maximum value.
 * When the counter reaches its maximum value, invoking the countUp() method does not change the state of the counter.
 *
 * Part 5: Inheritance and LimitedCounter
 *
 * @Author: Imraz Mohamed Farook
 * @Version: 1.03 August 1st, 2023
 */
public class LimitedCounter extends Counter
{

    /**
     * Constructs a new LimitedCounter with the default minimum and maximum values.
     * The current count is initialized to the default minimum value (0), and the counter counts between
     * the default minimum and maximum values (0 and 999, inclusive).
     */
    public LimitedCounter()
    {
        super();
    }

    /**
     * Constructs a new LimitedCounter with the specified minimum and maximum values.
     * The current count is initialized to the specified minimum value, and the counter counts between
     * the specified minimum and maximum values (inclusive).
     *
     * @param minCount The minimum value for the counter.
     * @param maxCount The maximum value for the counter.
     */
    public LimitedCounter(int minCount, int maxCount)
    {
        super( minCount,maxCount);

    }

    /**
     * Increment this counter by 1.
     * If the counter has not reached its maximum value, invoking this method increments the counter by 1.
     * If the counter is at its maximum value, invoking this method does not change the state of the counter.
     */
    @Override
    public void countUp()
    {
        // If we've reached the maximum count, invoking this
        // method doesn't change the state of the counter.
        if ( !isAtMaximum()) {
            super.countUp();
        }
    }

    /**
     * Decrement this counter by 1. If we've reached the minimum count,
     * invoking this method rolls the counter over to its maximum value.
     */
    @Override
    public void countDown() {
        if (isAtMinimum()) {
            setToMaximum();
        } else {
            super.decrementCount(); // Call the decrementCount() method from the superclass (Counter).
        }


    }
}
