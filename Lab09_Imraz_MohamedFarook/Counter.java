/**
 * A Counter that support attributes and methods from one class to
 * another.We group the "inheritance concept" into two categories:
 * • subclass (child) - the class that inherits from another class
 * • superclass (parent) - the class being inherited from
 * object are:to reinforce understanding of inheritance.
 *
 * Part 1: Exploring RollOverCounter
 * Part 2: Exploring LimitedCounter
 * Part 3: A Counter Super-class
 * Part 4: Inheritance and RollOverCounter
 * Part 5: Inheritance and LimitedCounter
 * Part 6: Javadoc Comments
 *
 * @Author Imraz Mohamed Farook.
 * @Version 1.03 August 1st, 2023
 */
public class Counter {
    /** The current value of this counter. */
    private int count;

    /** The minimum value of this counter. */
    private int minimumCount;

    /** The maximum value of this counter. */
    private int maximumCount;

    /** The default minimum value of this counter. */
    private static final int DEFAULT_MINIMUM = 0;

    /** The default maximum value of this counter. */
    private static final int DEFAULT_MAXIMUM = 999;

    /**
     * Constructs a new Counter whose current count is
     * initialized to DEFAULT_MINIMUM, and which counts between
     * DEFAULT_MINIMUM and DEFAULT_MAXIMUM, inclusive.
     */
    public Counter() {
        minimumCount = DEFAULT_MINIMUM;
        maximumCount = DEFAULT_MAXIMUM;
        count = minimumCount;
    }

    /**
     * Constructs a new Counter whose current count is
     * initialized to minCount, and which counts between
     * minCount and maxCount, inclusive.
     * @param minCount The minimum value for the counter.
     * @param maxCount The maximum value for the counter.
     */
    public Counter(int minCount, int maxCount) {
        minimumCount = minCount;
        maximumCount = maxCount;
        count = minimumCount;
    }

    /**
     * @Returns the maximum value of this counter.
     */
    public int maximumCount() {
        return maximumCount;
    }

    /**
     * @Returns the minimum value of this counter.
     */
    public int minimumCount() {
        return minimumCount;
    }

    /**
     * @Returns this counter's current count.
     */
    public int count() {
        return count;
    }

    /**
     * @Returns true if this counter is at its minimum value.
     */
    public boolean isAtMinimum() {
        return (count == minimumCount);
    }

    /**
     * @Returns true if this counter is at its maximum value.
     */
    public boolean isAtMaximum() {
        return (count == maximumCount);
    }

    /**
     * @Resets this counter to its minimum value.
     */
    public void reset() {
        count = minimumCount;
    }

    // The countUp() method is removed from this class.

    /**
     * @Increment this counter by 1.
     */
    public void incrementCount() {
        count++;
    }
}
