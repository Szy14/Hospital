import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class temporaryDB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	public String selectedSex, selectedRoomType, selectedLab, selectedPhilID, selectedVital; //  <------  IMPORTANT
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					temporaryDB frame = new temporaryDB();
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
	public temporaryDB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setTitle("Operasys Hospital");
		setResizable(false);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(131, 35, 223, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts numbers
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c)) {
					textField.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires numbers only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField.setEditable(true);
				} else {
					textField.setEditable(true);
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 66, 223, 20);
		contentPane.add(textField_1);
		textField_1.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts letters
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				// Allows to press backspace, space bar, shift key, and caps lock. (ONLY NEEDED FOR LETTERS ONLY)
				if ((e.getKeyCode()==KeyEvent.VK_BACK_SPACE) || (e.getKeyCode()==KeyEvent.VK_SPACE) || (e.getKeyCode()==KeyEvent.VK_CAPS_LOCK) || (e.getKeyCode()==KeyEvent.VK_SHIFT)) {
					textField_1.setEditable(true);
				} else if (!Character.isLetter(c)) { 
					textField_1.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires letters only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField_1.setEditable(true);
				} else {
					textField_1.setEditable(true);
				}
			}
		});

		// COMBO BOX (SEX)
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male", "Female"}));
		comboBox.setBounds(131, 101, 224, 22);
		// Add ActionListener to get the selected item
		comboBox.addActionListener(new ActionListener() {  // Scans selected option
			public void actionPerformed(ActionEvent e) {
				selectedSex = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.addFocusListener(new FocusAdapter() { // Removes make selection option
			@Override
			public void focusGained(FocusEvent e) {
				comboBox.removeItem("Make a Selection");
			}
		});
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 140, 223, 20);
		contentPane.add(textField_2);
		textField_2.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts numbers
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c)) {
					textField_2.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires numbers only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField_2.setEditable(true);
				} else {
					textField_2.setEditable(true);
				}
			}
		});
	
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(132, 173, 223, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(132, 207, 223, 20);
		contentPane.add(textField_4);
		textField_4.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts numbers
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c)) {
					textField_4.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires numbers only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField_4.setEditable(true);
				} else {
					textField_4.setEditable(true);
				}
			}
		});
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(132, 241, 223, 20);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(131, 272, 223, 20);
		contentPane.add(textField_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(132, 304, 223, 20);
		contentPane.add(textField_6);
		textField_6.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts letters
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				// Allows to press backspace, space bar, shift key, and caps lock. (ONLY NEEDED FOR LETTERS ONLY)
				if ((e.getKeyCode()==KeyEvent.VK_BACK_SPACE) || (e.getKeyCode()==KeyEvent.VK_SPACE) || (e.getKeyCode()==KeyEvent.VK_CAPS_LOCK) || (e.getKeyCode()==KeyEvent.VK_SHIFT)) {
					textField_6.setEditable(true);
				} else if (!Character.isLetter(c)) { 
					textField_6.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires letters only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField_6.setEditable(true);
				} else {
					textField_6.setEditable(true);
				}
			}
		});
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(131, 339, 223, 20);
		contentPane.add(textField_8);
		textField_8.addKeyListener(new KeyAdapter() {  // Add KeyListener so JTextField only accepts numbers
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isLetter(c)) {
					textField_8.setEditable(false);
					JOptionPane.showMessageDialog(null, "This field requires numbers only. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					textField_8.setEditable(true);
				} else {
					textField_8.setEditable(true);
				}
			}
		});
		
		// COMBO BOX (ROOM TYPE)
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Ward", "Semi-Private", "Private", "Suite"}));
		comboBox_1.setBounds(132, 382, 224, 22);
		comboBox_1.addActionListener(new ActionListener() {  // Scans the selected item
			public void actionPerformed(ActionEvent e) {
				selectedRoomType = comboBox_1.getSelectedItem().toString(); 
			}
		});
		comboBox_1.addFocusListener(new FocusAdapter() { // Removes make selection option
			@Override
			public void focusGained(FocusEvent e) {
				comboBox_1.removeItem("Make a Selection");
			}
		});
		contentPane.add(comboBox_1);
		
		// COMBO BOX (LABORATORY)
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Clinical Laboratory", "Pathology Laboratory ", "Cardiology Laboratory", "Microbiology Laboratory ", "Radiology Laboratory"}));
		comboBox_1_1.setBounds(132, 417, 224, 22);
		comboBox_1_1.addActionListener(new ActionListener() {  // Scans the selected item
			public void actionPerformed(ActionEvent e) {
				selectedLab = comboBox_1_1.getSelectedItem().toString();
			}
		});
		comboBox_1_1.addFocusListener(new FocusAdapter() { // Removes make selection option
			@Override
			public void focusGained(FocusEvent e) {
				comboBox_1_1.removeItem("Make a Selection");
			}
		});
		contentPane.add(comboBox_1_1);
		
		// COMBO BOX (PHIL ID)
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Yes", "No"}));
		comboBox_1_1_1.setBounds(131, 452, 224, 22);
		comboBox_1_1_1.addActionListener(new ActionListener() {  // Scans the selected item
			public void actionPerformed(ActionEvent e) {
				selectedPhilID = comboBox_1_1_1.getSelectedItem().toString();
			}
		});
		comboBox_1_1_1.addFocusListener(new FocusAdapter() { // Removes make selection option
			@Override
			public void focusGained(FocusEvent e) {
				comboBox_1_1_1.removeItem("Make a Selection");
			}
		});
		contentPane.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_2_1 = new JLabel("Vital Stat");
		lblNewLabel_1_1_1_1_1_1_2_1_2_1.setBounds(31, 491, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_2_1);
		
		// COMBO BOX (VITAL STAT)
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Alive", "Dead"}));
		comboBox_1_1_1_1.setBounds(130, 485, 224, 22);
		comboBox_1_1_1_1.addActionListener(new ActionListener() {  // Scans the selected item
			public void actionPerformed(ActionEvent e) {
				selectedVital = comboBox_1_1_1_1.getSelectedItem().toString();
			}
		});
		comboBox_1_1_1_1.addFocusListener(new FocusAdapter() { // Removes make selection option
			@Override
			public void focusGained(FocusEvent e) {
				comboBox_1_1_1_1.removeItem("Make a Selection");
			}
		});
		contentPane.add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(32, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient Name");
		lblNewLabel_1.setBounds(32, 69, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sex");
		lblNewLabel_1_1.setBounds(32, 105, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Date of Birth");
		lblNewLabel_1_1_1.setBounds(32, 143, 75, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1.setBounds(32, 176, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Contact Number");
		lblNewLabel_1_1_1_1_1.setBounds(32, 210, 113, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Email Address");
		lblNewLabel_1_1_1_1_1_1.setBounds(32, 244, 124, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Diagnosis");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(32, 277, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Doctor");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(32, 307, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("Days Admitted");
		lblNewLabel_1_1_1_1_1_1_2_1.setBounds(32, 342, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1 = new JLabel("Room Type");
		lblNewLabel_1_1_1_1_1_1_2_1_1.setBounds(31, 386, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1_1 = new JLabel("Laboratory");
		lblNewLabel_1_1_1_1_1_1_2_1_1_1.setBounds(32, 419, 113, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_2 = new JLabel("PhilHealth ID");
		lblNewLabel_1_1_1_1_1_1_2_1_2.setBounds(32, 458, 90, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_2_1_2);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.setBounds(61, 527, 124, 23);
		contentPane.add(btnNewButton);
		
		// GO TO RECEIPT --------------------------------------------------------------
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setBounds(195, 527, 124, 23);
		contentPane.add(btnReceipt);
		
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// DATA TRANSFER -----------------------------------------
				receip transfer = new receip();
				
				// In order (top to bottom)
				transfer.ID.setText(textField.getText());
				transfer.patientName.setText(textField_1.getText());
				transfer.sex.setText(selectedSex);
				transfer.DOB.setText(textField_2.getText());
				transfer.address.setText(textField_3.getText());
				transfer.contactNo.setText(textField_4.getText());
				transfer.email.setText(textField_5.getText());
				transfer.diagnosis.setText(textField_7.getText());
				transfer.doctor.setText(textField_6.getText());
				transfer.daysAdmit.setText(textField_8.getText());
				transfer.roomType.setText(selectedRoomType);
				transfer.lab.setText(selectedLab);
				transfer.philID.setText(selectedPhilID);
				transfer.vitalStat.setText(selectedVital);
				
				// In order (top to bottom)
				transfer.lblPrimaryFees_1.setText("₱1.00");
				transfer.lblRoomCharge.setText("₱2.00");
				transfer.lblMedFees.setText("₱3.00");
				transfer.lblProfessionFee.setText("₱4.00");
				transfer.lblSubtotalFee.setText("₱5.00");
				transfer.lblDiscountFee.setText("₱6.00");
				transfer.lblPhilHealthFee.setText("₱7.00");
				transfer.lblSeniorFee.setText("₱8.00");
				transfer.lblDiscountSubtotal.setText("₱9.00");
				transfer.lblTotalPrice.setText("₱10.00");
				
				// Checks if all fields have input
				if (textField.getText().equals("") || textField_1.getText().equals("") || textField_2.getText().equals("") ||
					textField_3.getText().equals("") || textField_4.getText().equals("") || textField_5.getText().equals("") ||
					textField_6.getText().equals("") || textField_7.getText().equals("") || textField_8.getText().equals("") ||
					comboBox.getSelectedItem() == "Make a Selection" || comboBox_1.getSelectedItem() == "Make a Selection" ||
					comboBox_1_1.getSelectedItem() == "Make a Selection" || comboBox_1_1_1.getSelectedItem() == "Make a Selection") {
					
					JOptionPane.showMessageDialog(null, "All fields require input. Please try again.", "ERROR!", JOptionPane.WARNING_MESSAGE);
					
				} else {
					int choice = JOptionPane.showConfirmDialog(null, "Are all the information correct?", "Operasys Hospital", JOptionPane.YES_NO_OPTION);
					if (choice == JOptionPane.YES_OPTION) {
						transfer.setVisible(true);
						dispose();
					} else {
						
					}
				}
			}
		});
	}
}