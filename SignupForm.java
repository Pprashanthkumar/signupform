import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupForm extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public SignupForm() {
        super("Signup Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton signupButton = new JButton("Sign Up");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); 
        panel.add(signupButton);
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignupForm();
            }
        });
    }
}
