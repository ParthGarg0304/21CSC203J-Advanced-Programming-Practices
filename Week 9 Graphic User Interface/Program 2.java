import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingActionListenerExample {
    private int clickCount = 0; // Counter for button clicks
    public SwingActionListenerExample() {
        // Create a JFrame
        JFrame frame = new JFrame("Swing ActionListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a button
        JButton button = new JButton("Click Me!");

        // Create a label to display the click count
        JLabel label = new JLabel("Click Count: 0");

        // Add the button and label to the panel
        panel.add(button);
        panel.add(label);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Increment the click count
                clickCount++;

                // Update the label text
                label.setText("Click Count: " + clickCount);
            }
        });

        // Add the panel to the JFrame
        frame.add(panel);

        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the JFrame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of SwingActionListenerExample
        SwingActionListenerExample example = new SwingActionListenerExample();
    }
}
