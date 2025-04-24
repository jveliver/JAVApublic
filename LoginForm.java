/* Java Program to Display a Message in a New Frame */
import java.awt.Font;
import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Basic Login Form");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel welcome = new JLabel("Welcome!");
        welcome.setBounds(150, 50, 150, 30);
        welcome.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(welcome);

        JLabel userName = new JLabel("Username: ");
        userName.setBounds(50, 110, 150, 30);
        frame.add(userName);

        JTextField textField = new JTextField();
        textField.setBounds(150, 100, 150, 50); 
        frame.add(textField);
        
        JLabel password = new JLabel("Password: ");
        password.setBounds(50, 165, 150, 30);
        frame.add(password);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 160, 150, 50); 
        passField.setEchoChar('*'); // Mask password input
        frame.add(passField); 

        JButton login = new JButton("Login");
        login.setBounds(70, 220, 120, 50);
        frame.add(login);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(200, 220, 120, 50);
        frame.add(cancel);

        // **Cancel Button - Clears Input Fields**
        cancel.addActionListener(e -> {
            textField.setText("");
            passField.setText("");
        });

        // **Login Button - Checks Empty Fields**
        login.addActionListener(e -> {
            String name = textField.getText().trim(); // Trim removes extra spaces
            String pass = new String(passField.getPassword()); // Get password safely

            if (name.isEmpty() && pass.isEmpty()) { // Check if username and pwd is empty
                JOptionPane.showMessageDialog(frame, "Username and Password cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (name.isEmpty()) { // Check if password is empty
                JOptionPane.showMessageDialog(frame, "Username cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (pass.isEmpty()) { // Check if password is empty
                JOptionPane.showMessageDialog(frame, "Password cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Login Attempted for: " + name, "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
