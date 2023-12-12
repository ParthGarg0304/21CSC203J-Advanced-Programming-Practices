import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame {
    // Components
    private JTextField nameField, rollNumberField, emailField;
    private JButton submitButton;

    public StudentRegistrationForm() {
        // Set frame properties
        setTitle("Student Registration Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns

        // Add components to the panel
        panel.add(new JLabel("Name:"));
        nameField = new JTextField(20);
        panel.add(nameField);

        panel.add(new JLabel("Roll Number:"));
        rollNumberField = new JTextField(10);
        panel.add(rollNumberField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField(30);
        panel.add(emailField);

        submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Add an ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the entered data
                String name = nameField.getText();
                String rollNumber = rollNumberField.getText();
                String email = emailField.getText();

                // Display the entered data in a message dialog
                String message = "Name: " + name + "\nRoll Number: " + rollNumber + "\nEmail: " + email;
                JOptionPane.showMessageDialog(StudentRegistrationForm.this, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add the panel to the frame
        add(panel);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegistrationForm();
            }
        });
    }
}

