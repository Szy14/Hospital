import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Button;
import javax.swing.JPasswordField;


public class Create_Account_Login implements ActionListener {

	
    private JFrame frame;
	private Map<String, String> accounts ;	
	private Panel WelcomePanel;
	private JLabel LogoLabel;
	private JLabel WallpaperLabel;
	private TextField UnametextField;
	private JPasswordField PasswordtextField;
	private JLabel FQuoteLabel;
	private JLabel SQuoteLabel;
	private JLabel TQuoteLabel;
	private JLabel HippocratesLabel;
	private Button Caccountbutton;
	private Button loginbutton;
	private JLabel OperasysHospitalLabel;
	private Panel LBluepanel;
	private Panel DBluePanel;
	private JPasswordField passwordtextField;
	/**
	 * Launch the application.
	 */
	

	
	public Create_Account_Login() {
		accounts = new HashMap<>();
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	    frame.setResizable(false);
	        
		WelcomePanel = new Panel();
		WelcomePanel.setBackground(new Color(255, 255, 255));
		WelcomePanel.setLayout(null);
		
		ImageIcon HospitalIcon = new ImageIcon("HospLogo (1).png");
		LogoLabel = new JLabel();
		LogoLabel.setBackground(new Color(0, 0, 0));
        LogoLabel.setBounds(385, 23, 95, 96);
        LogoLabel.setIcon(HospitalIcon);
        WelcomePanel.add(LogoLabel);
		
        ImageIcon WallPaper = new ImageIcon("design (1).png");
		
        LBluepanel = new Panel();
		LBluepanel.setBackground(new Color(30, 144, 255));
		LBluepanel.setBounds(0, 237, 298, 199);
		WelcomePanel.add(LBluepanel);
		LBluepanel.setLayout(null);
		
		DBluePanel = new Panel();
		DBluePanel.setLayout(null);
		DBluePanel.setBackground(new Color(0, 0, 0));
		DBluePanel.setBounds(0, 0, 298, 238);
		WelcomePanel.add(DBluePanel);
		WallpaperLabel = new JLabel();
		WallpaperLabel.setBounds(0, 0, 314, 238);
		DBluePanel.add(WallpaperLabel);
		WallpaperLabel.setIcon(WallPaper);
		
		UnametextField = new TextField();
		UnametextField.setForeground(new Color(0, 0, 0));
		UnametextField.setFont(new Font("Dialog", Font.BOLD, 16));
		UnametextField.setBounds(348, 204, 186, 28);
		WelcomePanel.add(UnametextField);
		
		JLabel UserNameLabel = new JLabel("USERNAME");
		UserNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
		UserNameLabel.setBounds(348, 172, 116, 26);
		WelcomePanel.add(UserNameLabel);
		
		JLabel PasswordLabel = new JLabel("PASSWORD");
		PasswordLabel.setFont(new Font("Arial", Font.BOLD, 16));
		PasswordLabel.setBounds(348, 238, 116, 26);
		WelcomePanel.add(PasswordLabel);
		
		OperasysHospitalLabel = new JLabel("Operasys Hospital");
		OperasysHospitalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		OperasysHospitalLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
		OperasysHospitalLabel.setBounds(326, 118, 205, 29);
		WelcomePanel.add(OperasysHospitalLabel);
		
		Caccountbutton = new Button("Create Account");
		Caccountbutton.setBackground(new Color(240, 128, 128));
		Caccountbutton.setFont(new Font("Arial Black", Font.BOLD, 14));
		Caccountbutton.setActionCommand("");
		Caccountbutton.setBounds(348, 331, 186, 29);
		WelcomePanel.add(Caccountbutton);
		
		loginbutton = new Button("Login");
		loginbutton.setBackground(new Color(240, 128, 128));
		loginbutton.setFont(new Font("Arial Black", Font.BOLD, 14));
		loginbutton.setActionCommand("");
		loginbutton.setBounds(348, 374, 186, 29);
		WelcomePanel.add(loginbutton);
		
		FQuoteLabel = new JLabel("\"Wherever the art of ");
		FQuoteLabel.setBackground(new Color(0, 0, 0));
		FQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 24));
		FQuoteLabel.setBounds(0, 11, 298, 54);
		LBluepanel.add(FQuoteLabel);
		
		SQuoteLabel = new JLabel("medicine is loved, there is");
		SQuoteLabel.setBackground(new Color(0, 0, 0));
		SQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 24));
		SQuoteLabel.setBounds(0, 43, 298, 54);
		LBluepanel.add(SQuoteLabel);
		
		TQuoteLabel = new JLabel("also a love humanity.\"");
		TQuoteLabel.setBackground(new Color(0, 0, 0));
		TQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 24));
		TQuoteLabel.setBounds(0, 77, 298, 54);
		LBluepanel.add(TQuoteLabel);
		
		HippocratesLabel = new JLabel("-Hippocrates, ancient Greek physician");
		HippocratesLabel.setBackground(new Color(0, 0, 0));
		HippocratesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HippocratesLabel.setForeground(new Color(0, 0, 0));
		HippocratesLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HippocratesLabel.setBounds(0, 142, 298, 25);
		LBluepanel.add(HippocratesLabel);
		
		passwordtextField = new JPasswordField();
		passwordtextField.setForeground(Color.BLACK);
		passwordtextField.setFont(new Font("Dialog", Font.BOLD, 16));
		passwordtextField.setBounds(348, 270, 186, 28);
		WelcomePanel.add(passwordtextField);
		
		JCheckBox showPasswordCheckbox = new JCheckBox("Show Password");
        showPasswordCheckbox.setBounds(348, 300, 150, 20);
        WelcomePanel.add(showPasswordCheckbox);
		
		
		frame.getContentPane().add(WelcomePanel);
		frame.setVisible(true);
		
		 showPasswordCheckbox.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent e) {
	                int state = e.getStateChange();
	                if (state == ItemEvent.SELECTED) {
	                    // Checkbox is selected, show the password
	                    passwordtextField.setEchoChar((char) 0);
	                } else {
	                    // Checkbox is deselected, hide the password
	                    passwordtextField.setEchoChar('•');
	                }
	            }
	        });
		
        Caccountbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UnametextField.getText();
                String password =  new String(passwordtextField.getPassword());

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
                        System.out.println("Username: " + username);
                        System.out.println("Password: " + password);
                    } else {
                        JOptionPane.showMessageDialog(null, "Account creation failed. Username already exists.", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }

                // Clear input fields
                UnametextField.setText("");
                passwordtextField.setText("");
	            }
        });

        loginbutton.addActionListener(this);
	}

	 public boolean createAccount(String username, String password) {
		 if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Invalid username or password.", "Message", JOptionPane.ERROR_MESSAGE);
		        return false;
		    }
		 if (!accounts.containsKey(username)) {
		        accounts.put(username, password);
		        return true;
		    }
	     
		 JOptionPane.showMessageDialog(null, "Account creation failed. Username already exists.", "Message", JOptionPane.ERROR_MESSAGE);
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
	        String password = passwordtextField.getText();

	        if (login(username, password)) {
	            System.out.println("Login successful. Welcome, " + username + "!");
	            frame.dispose();

	            // Create and show the Fill_up_Form
	            SwingUtilities.invokeLater(new Runnable() {
	                public void run() {
	                    new Fill_up_Form().setVisible(true);
	                }
	            });
	        } else {
	            JOptionPane.showMessageDialog(null, "Login failed wrong username and password", "Message", JOptionPane.ERROR_MESSAGE);
	        }

	        // Clear input fields
	        UnametextField.setText("");
	        passwordtextField.setText("");
	    }

	    
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new Create_Account_Login();
	                
	                               
	            }
	        });
	    }
	    
	    
        
}