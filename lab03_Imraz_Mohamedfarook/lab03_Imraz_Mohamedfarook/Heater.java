/**
 * A Heater models a simple space-heater. The operations provided by a Heater
 * object are:
 * 1. Increase and decrease the temperature setting by a set amount.
 * 2. Return the current temperature setting.
 * 3. Change the set amount by which the temperature is increased and lowered.
 * 
 * @author L.S. Marshall, SCE, Carleton University
 * (incomplete implementation for SYSC 2004 Lab 2)
 * @author Imraz Mohamed Farook.
 * @version 1.03 July 10th, 2023
 */
public class Heater {
    /**
     * The temperature setting that the heater should maintain.
     */
    private int temperature;

    /**
     * The temperature setting for a newly created heater.
     */
    private static final int INITIAL_TEMPERATURE = 15;

    /**
     * The amount by which the temperature setting is raised/lowered when
     * warmer() and cooler() are invoked.
     */
    private int increment;

    /**
     * The default amount by which the temperature setting is
     * increased when warmer() is invoked and decreased when cooler()
     * is invoked.
     */
    private static final int DEFAULT_INCREMENT = 5;

    /**
     * Constructs a new Heater with an initial temperature setting of 15
     * degrees, and which increments and decrements the temperature
     * setting in increments of 5 degrees.
     */
    public Heater() {
        temperature = INITIAL_TEMPERATURE;
        increment = DEFAULT_INCREMENT;

    }

    /**
     * Write an appropriate comment here.
     */
    public Heater(int minTemp, int maxTemp) {

    }

    /**
     * @returns the value of the current temperature from the Heater
     */
    public int temperature() {
        return temperature;
    }

    /**
     * using temperature to increase the temperature of the heater.
     */
    public void warmer() {
        temperature = temperature + increment;
    }

    /**
     * using temperature to decrease the temperature of the heater.
     */
    public void cooler() {
        temperature = temperature - increment;
    }


    /**
     *Change the set amount by which the temperature is increased and lowered.
     * @param newIncrement  either helps cool or warm the temperature of the heater
     *                      by the amout set within the parameters
     * */
    public void setIncrement(int newIncrement) {
        if (newIncrement > 0) {
            increment = newIncrement;
        }
        else{
            return;
        }
    }
}
