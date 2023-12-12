import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmploymentRegistrationForm {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Employment Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2)); // 6 rows and 2 columns

        // Create labels and text fields for employment information
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField(15);

        JLabel addressLabel = new JLabel("Address:");
        JTextArea addressArea = new JTextArea(3, 20);
        JScrollPane addressScrollPane = new JScrollPane(addressArea);

        JLabel positionLabel = new JLabel("Position:");
        JTextField positionField = new JTextField(15);

        // Create a Submit button
        JButton submitButton = new JButton("Submit");

        // Add action listener to the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve and display the entered information
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String address = addressArea.getText();
                String position = positionField.getText();

                // Display the information in a dialog
                String message = "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone
                        + "\nAddress: " + address + "\nPosition: " + position;
                JOptionPane.showMessageDialog(frame, message, "Registration Details", JOptionPane.PLAIN_MESSAGE);
            }
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(addressLabel);
        panel.add(addressScrollPane);
        panel.add(positionLabel);
        panel.add(positionField);

        // Add the Submit button to the panel
        panel.add(submitButton);

        // Add the panel to the frame
        frame.add(panel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
