

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingUtilities;


public class Login_Account extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel LBluepanel;
	private JLabel LogoLabel, WallpaperLabel, DBluePanel, FQuoteLabel, HippocratesLabel, OperasysHospitalLabel, fQuoteLabel,
	lblCreateAccount;
	private TextField UnametextField;
	private JPasswordField passwordtextField;
	private Button loginbutton;
	private HashMap<String, String> loginInput = new HashMap<String,String>();
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("operasys_logo.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Account frame = new Login_Account();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Login_Account() {
		setBounds(100, 100, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Operasys Hospital");
		setResizable(false);
		setContentPane(contentPane);
		setIconImage(logo.getImage());
		contentPane.setLayout(null);
		
		// ACCOUNTS (TEMPORARY) ------------------------------------------------------------------------------------------------------
		loginInput.put("2022100599", "abcde12345");
		loginInput.put("2022420069", "CoolKid21");
		loginInput.put("2022360911", "P455W0RD");
		
		// INTERFACES ----------------------------------------------------------------------------------------------------------------
		Date thisDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:s");
        String formattedDate = dateFormat.format(thisDate);
        
		ImageIcon HospitalIcon = new ImageIcon("HospLogo (1).png");
		LogoLabel = new JLabel();
		LogoLabel.setBackground(new Color(0, 0, 0));
		LogoLabel.setBounds(385, 23, 95, 96);
		LogoLabel.setIcon(HospitalIcon);
		contentPane.add(LogoLabel);
		
		ImageIcon WallPaper = new ImageIcon("design (1).png");
		
		LBluepanel = new JPanel();
		LBluepanel.setForeground(new Color(255, 255, 255));
		LBluepanel.setBackground(new Color(255, 255, 255, 100));
		LBluepanel.setBounds(23, 462, 823, 177);
		contentPane.add(LBluepanel);
		LBluepanel.setLayout(null);
		
		DBluePanel = new JLabel();
		DBluePanel.setLayout(null);
		DBluePanel.setBackground(new Color(0, 0, 0));
		DBluePanel.setBounds(0, 0, 869, 661);
		contentPane.add(DBluePanel);
		DBluePanel.setIcon(new ImageIcon(this.getClass().getResource("/operasys_bg.png")));
		
		WallpaperLabel = new JLabel();
		DBluePanel.add(WallpaperLabel);
		WallpaperLabel.setIcon(WallPaper);
		
		JLabel UserNameLabel = new JLabel("ID NUMBER");
		UserNameLabel.setFont(new Font("Arial", Font.BOLD, 16));
		UserNameLabel.setBounds(925, 337, 116, 26);
		contentPane.add(UserNameLabel);
		
		JLabel PasswordLabel = new JLabel("ACCESS CODE");
		PasswordLabel.setFont(new Font("Arial", Font.BOLD, 16));
		PasswordLabel.setBounds(925, 413, 133, 26);
		contentPane.add(PasswordLabel);
		
		OperasysHospitalLabel = new JLabel("Operasys Hospital");
		OperasysHospitalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		OperasysHospitalLabel.setFont(new Font("Trebuchet MS", Font.BOLD |
		Font.ITALIC, 23));
		OperasysHospitalLabel.setBounds(982, 188, 205, 29);
		contentPane.add(OperasysHospitalLabel);
		
		loginbutton = new Button("Login");
		loginbutton.setFocusable(false);
		loginbutton.setBackground(new Color(240, 128, 128));
		loginbutton.setFont(new Font("Arial Black", Font.BOLD, 14));
		loginbutton.setBounds(982, 527, 186, 29);
		contentPane.add(loginbutton);
		
		FQuoteLabel = new JLabel("\"Wherever the art of medicine is loved,");
		FQuoteLabel.setBackground(new Color(0, 0, 0));
		FQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		FQuoteLabel.setBounds(21, 38, 776, 45);
		LBluepanel.add(FQuoteLabel);
		
		HippocratesLabel = new JLabel("- Hippocrates");
		HippocratesLabel.setBackground(new Color(0, 0, 0));
		HippocratesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HippocratesLabel.setForeground(new Color(0, 0, 0));
		HippocratesLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		HippocratesLabel.setBounds(263, 133, 298, 25);
		LBluepanel.add(HippocratesLabel);
		
		fQuoteLabel = new JLabel("there is also a loved humanity.\"");
		fQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
		fQuoteLabel.setBackground(Color.BLACK);
		fQuoteLabel.setBounds(21, 67, 776, 45);
		LBluepanel.add(fQuoteLabel);
		
		UnametextField = new TextField();
		UnametextField.setForeground(new Color(0, 0, 0));
		UnametextField.setFont(new Font("Dialog", Font.BOLD, 16));
		UnametextField.setBounds(925, 366, 298, 28);
		contentPane.add(UnametextField);
		UnametextField.getText();
		
		passwordtextField = new JPasswordField();
		passwordtextField.setForeground(Color.BLACK);
		passwordtextField.setFont(new Font("Dialog", Font.BOLD, 16));
		passwordtextField.setBounds(925, 443, 298, 28);
		contentPane.add(passwordtextField);
		passwordtextField.getPassword();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(1055, 46, 161, 136);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getResource("/operasys_logo.png")));
		
		lblCreateAccount = new JLabel("Log-In Page:");
		lblCreateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAccount.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
		lblCreateAccount.setBounds(982, 271, 205, 29);
		contentPane.add(lblCreateAccount);
		
		// LOGICS ---------------------------------------------------------------------------------------------------------------------
		JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
		showPasswordCheckBox.setFocusable(false);	
		showPasswordCheckBox.setBackground(new Color(255, 255, 255));
		showPasswordCheckBox.setBounds(929, 475, 103, 23);
		showPasswordCheckBox.setFont(new Font("Arial", Font.PLAIN, 10));
		contentPane.add(showPasswordCheckBox);
		
		showPasswordCheckBox.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(showPasswordCheckBox.isSelected())
				passwordtextField.setEchoChar((char)0);
			else
				passwordtextField.setEchoChar('•');
			}
		});
		
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userID = UnametextField.getText();
				String password = String.valueOf(passwordtextField.getPassword());
				
				if (loginInput.containsKey(userID)) {	// Checks input on ID number
					
					if (loginInput.get(userID).equals(password)) {	  // Input matches with account database
						JOptionPane.showMessageDialog(null, "Login successful. Welcome!", "Operasys Hospital", JOptionPane.INFORMATION_MESSAGE);
						
						
						dispose();
						HomeHospital Home = new HomeHospital();
                        Home.setVisible(true);
                        
                        try {
    						Class.forName("com.mysql.cj.jdbc.Driver");
    						Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
    						Statement stmt = con1.createStatement();
    						{
    							String sql = "INSERT INTO nurselog (nurseID, datein) VALUES" + " " + "('" + UnametextField.getText() + "','" + formattedDate + "')";
    			                        stmt.executeUpdate(sql);
    			                        
    						}

    					}  catch (ClassNotFoundException e1) {
    						Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, e1);

    					} catch (SQLException e1) {
    						e1.printStackTrace();
    					}
					} else {	// Wrong or blank input on access code
						JOptionPane.showMessageDialog(null, "Input does not match with existing accounts. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					}
					
				} else {	// Wrong or blank input on ID number
					JOptionPane.showMessageDialog(null, "Input does not match with existing accounts. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}
}