import javax.swing.SwingUtilities;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run( ) {
                FirstGui guiDefault = new FirstGui();
                guiDefault.show();

                FirstGui guiCustom = new FirstGui("Test", 600, 150);
                guiCustom.show();


            }
        });

    }
}