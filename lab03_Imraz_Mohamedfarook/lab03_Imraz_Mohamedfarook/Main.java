
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Heater heater1 = new Heater();
        int heaterTemp = heater1.temperature();
        heater1.warmer();
        int warmer = heater1.temperature();
        heater1.cooler();
        int cooler = heater1.temperature();
        heater1.setIncrement(10);
    }
}