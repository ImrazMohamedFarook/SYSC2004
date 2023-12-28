import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.time.LocalDate;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Profile> profiles = new HashMap<>();
        String userInput;

        System.out.println("Welcome to Lab 07:");
        while (true) {
            System.out.println("Enter user first name: " );
            //scanner.next();
            String firstName = scanner.next();

            System.out.println("Enter user last name: ");
            scanner.nextLine();
            String lastName = scanner.nextLine();

            String username = firstName + lastName;
            System.out.println("Your username is: " + username);
            System.out.println("Enter Date of Birth (YYYY-MM-DD): ");
            String dateOfBirthString = scanner.next();
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);

            System.out.println("Enter password: ");
            String password = scanner.next();

            Profile profile = new Profile(firstName, lastName, dateOfBirth, password, username);

            profiles.put(username, profile);

            System.out.println("User registered!");
            System.out.println("Enter Q to quit the app!:");
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("Q") || userInput.equalsIgnoreCase("q") ) {
                break;
            }else{continue;}
        }
        System.out.print("\nRegistered Profiles:");
        for (Map.Entry<String, Profile> entry : profiles.entrySet()) {
            entry.getValue().printProfile();
            System.out.println();
        }

        Profile newProfile = new Profile();
        System.out.println(newProfile.checkPassword("Default Password"));
    }
}