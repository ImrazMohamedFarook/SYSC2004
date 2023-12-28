import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Profile {
    private LocalDateTime lastLogged;
    private boolean loggedIn;
    private String profilePassword;
    private String userName;
    private LocalDate dateOfBirth;
    private String lastName;
    private String firstName;
    public void printProfile(){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");

        System.out.println("Username: " + userName);
        System.out.println("Name: " + firstName+lastName);
        System.out.println("D.O.B.: " + dateOfBirth.format(dateFormatter));
        System.out.println("Last logged in: " + lastLogged.format(dateTimeFormatter));
    }
    public boolean checkPassword(String enteredPassword){
        if (enteredPassword.equals(profilePassword)) {
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
        this.profilePassword = profilePassword;
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
        this.firstName = "Default first";
        this.lastName = "Default last";
        this.dateOfBirth = LocalDate.of (2023,01,01);
        this.profilePassword = "Default Password";
        this.userName = firstName + lastName;
        this.loggedIn = false;
        this.lastLogged = LocalDateTime.now();

    }
    public Profile(String firstName, String lastName, LocalDate dateOfBirth,
                   String profilePassword, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.profilePassword = profilePassword;
        this.userName = userName;
        this.loggedIn = false;
        this.lastLogged = LocalDateTime.now();
    }

}
