import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaterTest {
    private static Heater heater;
    private static int Counter;

    public HeaterTest(){
    }

    @BeforeAll
    private static void setUp(){
        heater = null;
        Counter =0;
    }
    @AfterEach
    private void summary(){
        Counter = 1+ Counter;
        System.out.println("Number of tests ran: " + Counter );

    }

    @AfterAll
    private static void tearDown(){

        System.out.println("All tests are done: " + Counter);
    }
    // Add your tests here using @Test annotation
    @Test
    public void test_DefaultConstructor(){
        Heater heater = new Heater();

        assertEquals(15, heater.temperature());
    }

    @Test
    public void test_OverloadedConstructor(){
        Heater heater = new Heater(0, 30);
        assertEquals(0, heater.temperature());
        assertEquals(0, heater.getIncrement());
        assertEquals(30, heater.getMax());
        assertEquals(0, heater.getMin());
    }

    @Test
    public void test_OverloadedConstructor_MinIsLargerThanMax() {
        Heater heater = new Heater(30, 0);
        assertEquals(0, heater.temperature());
        assertEquals(0, heater.getIncrement());
        assertEquals(0, heater.getMax());
        assertEquals(30, heater.getMin());
    }

    @Test
    public void test_Warmer() {
        Heater heater = new Heater();
        heater.warmer();
        assertEquals(15, heater.temperature());
    }

    @Test
    public void test_setIncrement_CallWarmerThenCooler() {
        Heater heater = new Heater();
        heater.setIncrement(4);
        heater.warmer();
        assertEquals(15, heater.temperature());

        heater.cooler();
        assertEquals(11, heater.temperature());
    }

    @Test
    public void test_setIncrement_ZeroAndNegativeIncrement() {
        Heater heater = new Heater();

        heater.setIncrement(0);
        heater.warmer();
        assertEquals(15, heater.temperature());

        heater.setIncrement(-5);
        heater.warmer();
        assertEquals(15, heater.temperature());
    }

    @Test
    public void test_Max_WarmerAndCoolerToLimits() {
        Heater heater = new Heater(0, 100);
        for (int i = 0; i < 100; i++) {
            heater.warmer();
        }
        assertEquals(0, heater.temperature());
        }

    @Test
    public void test_Min_WarmerAndCoolerToLimits() {
        Heater heater = new Heater(0, 100);
        for (int i = 0; i < 100; i++) {
            heater.cooler();
        }
        assertEquals(0, heater.temperature());
        }

    }
