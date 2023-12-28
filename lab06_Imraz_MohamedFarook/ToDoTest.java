import org.junit.Assert;
import org.junit.Test;
public class ToDoTest {
    @Test
    public void TestDefualtconstructor(){
        ToDo toDo = new ToDo();
        Assert.assertEquals("No Item", toDo.getTitle());
        Assert.assertFalse(toDo.getCompleted());

    }
    @Test
    public void TestOverloadedconstructor(){
        ToDo toDo = new ToDo("Walk Dog", true);
        Assert.assertEquals("Walk Dog", toDo.getTitle());
        Assert.assertTrue(toDo.getCompleted());
        Assert.assertEquals(0, toDo.getHours());
        Assert.assertEquals(0, toDo.getMinutes());
    }
    @Test
    public void TestConvertTime(){
        ToDo toDo = new ToDo("Walk Dog", false);
        Assert.assertFalse(toDo.getCompleted());
        toDo.convertTime("10:30");
        Assert.assertEquals(10, toDo.getHours());
        Assert.assertEquals(30, toDo.getMinutes());

        // Test invalid time format (length != 5)
        ToDo test2 = new ToDo();
        test2.convertTime("26:69");
        Assert.assertEquals(-1, test2.getHours());
        Assert.assertEquals(-1, test2.getMinutes());
        Assert.assertFalse(test2.getCompleted());

        // Test invalid hours (larger than 23)
        test2.convertTime("24:00");
        Assert.assertEquals(-1, test2.getHours());
        Assert.assertEquals(0, test2.getMinutes());
        Assert.assertFalse(test2.getCompleted());

        // Test invalid minutes (larger than 59)
        test2.convertTime("15:60");
        Assert.assertEquals(15, test2.getHours());
        Assert.assertEquals(-1, test2.getMinutes());
        Assert.assertFalse(test2.getCompleted());}
}