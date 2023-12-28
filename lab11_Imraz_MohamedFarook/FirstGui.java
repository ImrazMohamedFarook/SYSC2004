import javax.swing.*;
import java.awt.*;

public class FirstGui {
    private JFrame window; // Private attribute of type JFrame

    public FirstGui() {
        window = new JFrame(); // Creating a new JFrame object
        window.setTitle("Lab 11");// Setting window's title
        window.setSize(800, 600);// Setting window's size
        window.setLocationRelativeTo(null);// Setting window's location to be centered on the screen
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// Setting behavior of the close button to terminate the application
    }
    public FirstGui(String title, int width, int height) {
        window = new JFrame();
        window.setTitle(title);
        window.setSize(width, height);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //new panel
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));

        window.add(panel,BorderLayout.CENTER);
//        window.add(panel,BorderLayout.WEST);
//        window.add(panel,BorderLayout.EAST);
//        window.add(panel,BorderLayout.NORTH);
//        window.add(panel,BorderLayout.SOUTH);

        panel.setBackground(Color.pink);

        Button button1 = new Button("1st Button");
        panel.add(button1);

        Button button2 = new Button("Second Button");
        panel.add(button2);

        Button button3 = new Button("Third Button");
        panel.add(button3);

        panel.setPreferredSize(new Dimension(150, 50));


    }
    public void show() {
        window.setVisible(true); // Making the window visible
    }
}