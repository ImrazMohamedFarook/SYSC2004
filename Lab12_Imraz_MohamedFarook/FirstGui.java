import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FirstGui {
    private JFrame window;

    public FirstGui() {
        window = new JFrame();
        window.setTitle("Lab 11");
        window.setSize(600, 400);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public FirstGui(String title, int width, int height) {
        window = new JFrame();
        window.setTitle(title);
        window.setSize(width, height);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create a panel for text fields
        JPanel textFieldsPanel = new JPanel();
        textFieldsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

        JTextField firstNameField = createTextField("First Name  ");
        textFieldsPanel.add(firstNameField);

        JTextField lastNameField = createTextField("Last Name  ");
        textFieldsPanel.add(lastNameField);

        textFieldsPanel.setPreferredSize(new Dimension(150, 50));
        window.add(textFieldsPanel, BorderLayout.CENTER);

        // Create a panel for labels
        JPanel labelsPanel = new JPanel();
        labelsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

        JLabel firstNameLabel = createLabel("First Name");
        labelsPanel.add(firstNameLabel);

        JLabel lastNameLabel = createLabel("Last Name");
        labelsPanel.add(lastNameLabel);

        labelsPanel.setPreferredSize(new Dimension(150, 50));
        window.add(labelsPanel, BorderLayout.WEST);


        // Create a panel for buttons
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        buttonsPanel.setBackground(Color.pink);

        Button processButton = new Button("Process");
        buttonsPanel.add(processButton);
        processButton.setPreferredSize(new Dimension(100,25));
        processButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                System.out.println("Hello " + firstName + " " + lastName);
            }
        });

        Button clearButton = new Button("Clear");
        buttonsPanel.add(clearButton);
        clearButton.setPreferredSize(new Dimension(100,25));
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameField.setText("");
                lastNameField.setText("");
            }
        });

        Button quitButton = new Button("Quit");
        buttonsPanel.add(quitButton);
        quitButton.setPreferredSize(new Dimension(100,25));
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        buttonsPanel.setPreferredSize(new Dimension(150, 50));
        window.add(buttonsPanel, BorderLayout.EAST);
    }

    public JTextField createTextField(String tip) {
        JTextField textField = new JTextField(10);
        textField.setToolTipText(tip);
        return textField;
    }
    public JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        Font font = new Font("Calibri", Font.PLAIN, 18);
        label.setFont(font);
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        return label;
    }

    public void show() {
        window.setVisible(true);
    }
}
