import javax.swing.*;
public class SwingInheritanceExample extends JFrame {
    public SwingInheritanceExample() {
        // Set the frame title
        setTitle("Swing Inheritance Example");

        // Create a label
        JLabel label = new JLabel("Hello, Swing!");

        // Add the label to the frame
        add(label);

        // Set frame size and default close operation
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingInheritanceExample example = new SwingInheritanceExample();
            example.setVisible(true);
        });
    }
}
