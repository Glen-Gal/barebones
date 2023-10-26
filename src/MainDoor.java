import javax.swing.JFrame;

public class MainDoor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SWU COFFEE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Create an instance of Shop
        Shop primary = new Shop();

        // Load and play background music
        try {
            // Load the background music
            primary.loadBackgroundMusic("background.wav");

            frame.getContentPane().add(primary);
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
