// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RollOverCounter rollOverCounter = new RollOverCounter(1, 5);
        LimitedCounter limitedCounter = new LimitedCounter(1,5);

        System.out.println("Part 1: Exploring RollOverCounter");
        // Debugging information
        System.out.println("Current Count: " + rollOverCounter.count());
        System.out.println("Minimum Count: " + rollOverCounter.minimumCount());
        System.out.println("Maximum Count: " + rollOverCounter.maximumCount());
        System.out.println();

        // Before invoking an accessor method, predict the value that will be returned.
        System.out.println("Current Count (before countUp()): " + rollOverCounter.count()); // Prediction: 1
        // Before invoking a mutator method, predict how the object's state will change.
        System.out.println("Is at Minimum (before countUp()): " + rollOverCounter.isAtMinimum()); // Prediction: true
        System.out.println("Is at Maximum (before countUp()): " + rollOverCounter.isAtMaximum()); // Prediction: false
        System.out.println();

        // Invoking the countUp() method.
        rollOverCounter.countUp();
        // After invoking the method, check the updated values.
        System.out.println("Current Count (after countUp()): " + rollOverCounter.count()); // Should be 2
        System.out.println("Is at Minimum (after countUp()): " + rollOverCounter.isAtMinimum()); // Should be false
        System.out.println("Is at Maximum (after countUp()): " + rollOverCounter.isAtMaximum()); // Should be false
        System.out.println();

        // Continue invoking countUp() to reach the maximum value and observe roll-over.
        rollOverCounter.countUp(); // Count becomes 3
        rollOverCounter.countUp(); // Count becomes 4
        rollOverCounter.countUp(); // Count becomes 5
        rollOverCounter.countUp(); // Count rolls over to 1

        // Check the current count and isAtMinimum() after roll-over.
        System.out.println("Current Count (after roll-over): " + rollOverCounter.count()); // Should be 1
        System.out.println("Is at Minimum (after roll-over): " + rollOverCounter.isAtMinimum()); // Should be true
        System.out.println();

        // Reset the counter to the minimum value and verify.
        rollOverCounter.reset();
        System.out.println("Current Count (after reset): " + rollOverCounter.count()); // Should be 1
        System.out.println("Is at Minimum (after reset): " + rollOverCounter.isAtMinimum()); // Should be true
        System.out.println();



        System.out.println("Part 2: Exploring LimitedCounter");
        // Debugging information
        System.out.println("Current Count: " + limitedCounter.count()); // Should be 0
        System.out.println("Minimum Count: " + limitedCounter.minimumCount()); // Should be 0
        System.out.println("Maximum Count: " + limitedCounter.maximumCount()); // Should be 999
        System.out.println();


        // Before invoking an accessor method, predict the value that will be returned.
        System.out.println("Current Count (before countUp()): " + limitedCounter.count()); // Prediction: 0
        // Before invoking a mutator method, predict how the object's state will change.
        System.out.println("Is at Minimum (before countUp()): " + limitedCounter.isAtMinimum()); // Prediction: true
        System.out.println("Is at Maximum (before countUp()): " + limitedCounter.isAtMaximum()); // Prediction: false
        System.out.println();


        // Invoking the countUp() method multiple times.
        limitedCounter.countUp();
        limitedCounter.countUp();
        limitedCounter.countUp();

        // After invoking the method, check the updated values.
        System.out.println("Current Count (after countUp()): " + limitedCounter.count()); // Should be 3
        System.out.println("Is at Minimum (after countUp()): " + limitedCounter.isAtMinimum()); // Should be false
        System.out.println("Is at Maximum (after countUp()): " + limitedCounter.isAtMaximum()); // Should be false
        System.out.println();


        // Continue invoking countUp() until the maximum value is reached and observe no effect.
        limitedCounter.countUp(); // Count becomes 4
        limitedCounter.countUp(); // Count becomes 5
        limitedCounter.countUp(); // Count becomes 6 (still not at the maximum)
        System.out.println();


        // Check the current count and isAtMaximum() after reaching the maximum value.
        System.out.println("Current Count (after reaching maximum): " + limitedCounter.count()); // Should be 6
        System.out.println("Is at Maximum (after reaching maximum): " + limitedCounter.isAtMaximum()); // Should be false
        System.out.println();


        // Press the reset button to return the count to 0.
        limitedCounter.reset();
        System.out.println("Current Count (after reset): " + limitedCounter.count()); // Should be 0
        System.out.println("Is at Minimum (after reset): " + limitedCounter.isAtMinimum()); // Should be true
        System.out.println();



    }
}