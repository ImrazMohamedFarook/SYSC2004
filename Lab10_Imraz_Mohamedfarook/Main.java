import java.sql.SQLOutput;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a RollOverCounter object that counts between 1 and 5, inclusive.
        RollOverCounter rollOverCounter = new RollOverCounter(1, 5);

        // Print the initial count
        System.out.println("Initial Count: " + rollOverCounter.count());

        // Count up multiple times to observe the rollover behavior
        for (int i = 0; i < 10; i++) {
            rollOverCounter.countUp();
            System.out.println("Count after increment " + (i + 1) + ": " + rollOverCounter.count());
        }
        System.out.println();

        // Create a LimitedCounter object that counts between 1 and 5, inclusive.
        LimitedCounter limitedCounter = new LimitedCounter(1, 5);

        // Print the initial count
        System.out.println("Initial Count: " + limitedCounter.count());

        // Count up multiple times to observe the limited behavior
        for (int i = 0; i < 10; i++) {
            limitedCounter.countUp();
            System.out.println("Count after increment " + (i + 1) + ": " + limitedCounter.count());
        }
        System.out.println();
        // Count down multiple times to observe the limited behavior
        for (int i = 0; i < 10; i++) {
            limitedCounter.countDown();
            System.out.println("Count after decrement " + (i + 1) + ": " + limitedCounter.count());
        }
        System.out.println();
    }
}