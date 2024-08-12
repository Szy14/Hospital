import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Create_Login implements ActionListener {
    private Map<String, String> accounts ;
    private JFrame frame;
    private Panel Welcomepanel;
    private Button Caccountbutton;
    private Button loginbutton;
    private JPasswordField PasswordtextField;
    private Label PasswordLabel;
    private Label UnameLabel;
    private TextField UnametextField;
    private Label WelcomeLabel;
    private JLabel LogoLabel;
    
    
    public Create_Login() {	
        accounts = new HashMap<>();
        frame = new JFrame();
        frame.setBounds(100, 100, 457, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        ImageIcon HospitalIcon = new ImageIcon("HospLogo (1).png");
        	        
        Welcomepanel = new Panel();
        Welcomepanel.setBackground(new Color(51, 204, 255));
        frame.getContentPane().add(Welcomepanel, BorderLayout.CENTER);
        Welcomepanel.setLayout(null);
           
        Caccountbutton = new Button("Create Account");
        Caccountbutton.setBounds(115, 320, 100, 30);
        Welcomepanel.add(Caccountbutton);

        loginbutton = new Button("Login");
        loginbutton.setBounds(240, 320, 89, 30);
        Welcomepanel.add(loginbutton);

        PasswordtextField = new JPasswordField();
        PasswordtextField.setBounds(210, 260, 116, 22);
        Welcomepanel.add(PasswordtextField);

        PasswordLabel = new Label("Password :");
        PasswordLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        PasswordLabel.setBounds(115, 260, 130, 22);
        Welcomepanel.add(PasswordLabel);

        UnameLabel = new Label("Username: ");
        UnameLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
        UnameLabel.setBounds(115, 210, 76, 22);
        Welcomepanel.add(UnameLabel);

        UnametextField = new TextField();
        UnametextField.setBounds(210, 210, 116, 22);
        Welcomepanel.add(UnametextField);

        WelcomeLabel = new Label("Welcome to Operasys Hospital");
        WelcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        WelcomeLabel.setBounds(73, 145, 300, 41);
        Welcomepanel.add(WelcomeLabel);

        LogoLabel = new JLabel();
        LogoLabel.setBounds(173, 40, 100, 100);
        LogoLabel.setIcon(HospitalIcon);
        Welcomepanel.add(LogoLabel);

        frame.getContentPane().add(Welcomepanel);
        frame.setVisible(true);

        Caccountbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UnametextField.getText();
                String password = PasswordtextField.getText();

                if (username.isEmpty() || password.isEmpty()) {
                    // Check if either the username or password is empty
                    JOptionPane.showMessageDialog(null, "Please enter both a username and a password.", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (password.length() < 6) {
                    // Check if the password is less than 6 characters
                    JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long.", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (createAccount(username, password)) {
                        System.out.println("Account created successfully!");
                        JOptionPane.showMessageDialog(null, "Account created successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Account creation failed. Username already exists.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // Clear input fields
                UnametextField.setText("");
                PasswordtextField.setText("");
            }
        });

        loginbutton.addActionListener(this);
    }

    public boolean createAccount(String username, String password) {
        if (!accounts.containsKey(username)) {
            accounts.put(username, password);
            return true;
        }
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
        
        } 
     
        return false; // Account with the same username already exists
    }

    public boolean login(String username, String password) {
        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            return true;
        }
        return false; // Invalid username or password
       
    }
    public void actionPerformed(ActionEvent e) {
        String username = UnametextField.getText();
        String password = PasswordtextField.getText();

        if (login(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            frame.dispose();
            // Create and show the Fillup_Form
            Fillup_Form UI = new Fillup_Form();
        } else {
        	 JOptionPane.showMessageDialog(null, "Login failed wrong username and password", "Message", JOptionPane.ERROR_MESSAGE);
        }

        // Clear input fields
        UnametextField.setText("");
        PasswordtextField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Create_Login();
                
                               
            }
        });
    }
}
