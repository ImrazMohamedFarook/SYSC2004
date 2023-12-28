import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<ToDo> toDoList = new LinkedList<>();

        toDoList.add(new ToDo("Walk Dog", false));
        toDoList.add(new ToDo("Walk Cat", true));
        toDoList.add(new ToDo("Walk Hamster", false));
        toDoList.add(new ToDo("Walk Kids", true));

        toDoList.get(0).convertTime("01:00"); // Set time for Task 1
        toDoList.get(1).convertTime("11:30"); // Set time for Task 2
        toDoList.get(2).convertTime("20:65"); // Set time for Task 3
        toDoList.get(3).convertTime("25:15"); // Set time for Task 4

        for (int i =0; i < toDoList.size();i++){
            toDoList.get(i).printItem();
        }
    }
}
