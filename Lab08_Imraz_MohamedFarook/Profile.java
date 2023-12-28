import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.security.MessageDigest;

public class Profile {
    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;
    private MessageDigest md;
    public void printProfile(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");

        System.out.println("Username: " + userName);
        System.out.println("Name: " + firstName+lastName);
        System.out.println("D.O.B.: " + dateOfBirth.format(dateFormatter));
        System.out.println("Last logged in: " + lastLogged.format(dateTimeFormatter));
    }
    public boolean checkPassword(String enteredPassword){
        String hashedEnteredPassword = hashText(enteredPassword);
        if (hashedEnteredPassword.equals(profilePassword)) {
            setLoggedIn(true);
            setLastLogged();
            return true;
        } else {
            setLoggedIn(false);
            return false;
        }
    }
    public LocalDateTime getLastLogged(){
        return lastLogged;
    }
    public String getProfilePassword(){
        return profilePassword;
    }
    public String getUserName(){
        return userName;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    private void setLoggedIn(boolean loggedIn){
        this.lastLogged = LocalDateTime.now();

    }

    public void setDateOfBirth(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("2023-01-01");
        this.dateOfBirth = LocalDate.parse(date,formatter);

    }
    private void setLastLogged(){

    }

    public void setProfilePassword(String profilePassword) {
        this.profilePassword = hashText(profilePassword);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Profile(){
        firstName = "Default first";
        lastName = "Default last";
        dateOfBirth = LocalDate.of (2023,01,01);
        profilePassword = "Default Password";
        userName = firstName + lastName;
        loggedIn = false;
        lastLogged = LocalDateTime.now();
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
        }
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }


    public Profile(String firstName, String lastName, LocalDate dateOfBirth,
                   String profilePassword, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.profilePassword = hashText(profilePassword);
        this.userName = userName;
        this.loggedIn = false;
        this.lastLogged = LocalDateTime.now();
    }
    private String hashText(String plainText) {
//        try {
//            md = MessageDigest.getInstance("SHA-256");
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }

        try {
            md = MessageDigest.getInstance("SHA-256");
            byte[] textBytes = plainText.getBytes();
            byte[] hashBytes = md.digest(textBytes);
            BigInteger messageNumber = new BigInteger(1, hashBytes);
            String hashText = messageNumber.toString(16);
            while (hashText.length() < 64) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
