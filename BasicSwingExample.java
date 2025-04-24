import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class BasicSwingExample {
    //Main method: The entry point of the program
    public static void main(String[] args) {
        // Create a new instance of the Frame class to create the main window

        // Jframe is a class from the javax.swing package, and it represents the main window (or frame)
        // of a Swing-based graphical user interface (GUI)

        JFrame frame = new JFrame("Basic Swing Program with Scanner");

        // Set the default close operation so the program exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the window
        frame.setSize(400,300); // frame.setSize(int width, int height);

        // Set the layout to null (absolute positioning)
        frame.setLayout(null);

        // Create a label that will display a message on the window
        JLabel label = new JLabel("Enter your name: ");
        label.setBounds(50, 50, 150, 30); // Set the position and size of the text field
                                                           // component.setBounds(int x, int y, int width, int height)
        frame.add(label);                                  // frame.add() method is used to add components (such as buttons, labels text fields, etc.) to a JFrame or any other container

        //Create a text feild where the user can input their name
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30); // Set the position and size of the text field
        frame.add(textField);                                   // Add the text field to the frame

        // Create a button that will trigger an action when clicked
        JButton button = new JButton("Submit");
        button.setBounds(150, 100, 100, 30); // Set the position and size of the button
        frame.add(button);                                    // Add the text field to the frame

        // Create a text area to display the output message
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 150, 300, 100); 
        textArea.setEditable(false);
        frame.add(textArea);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = textField.getText();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your age: ");
                int age = scanner.nextInt();

                String message = "Hello, " + name + "! You are " + age + " years old.";

                textArea.setText(message);
                scanner.close();
            }
        });

        frame.setVisible(true);

    }
    
}
