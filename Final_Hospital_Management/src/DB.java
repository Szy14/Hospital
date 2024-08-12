			import java.awt.EventQueue;
			
			import javax.swing.JFrame;
			import javax.swing.JPanel;
			import javax.swing.border.EmptyBorder;
			import javax.swing.border.MatteBorder;
			import java.awt.Color;
			import javax.swing.JLabel;
			import javax.swing.JOptionPane;
			import javax.swing.SwingConstants;
			import java.awt.Font;
			import javax.swing.JTextField;
			import javax.swing.JComboBox;
			import javax.swing.JButton;
			import java.awt.event.ActionListener;
			import java.awt.event.FocusAdapter;
			import java.awt.event.FocusEvent;
			import java.awt.event.ItemEvent;
			import java.awt.event.ItemListener;
			import java.awt.event.KeyAdapter;
			import java.awt.event.KeyEvent;
			import java.awt.event.ActionEvent;
			import javax.swing.JScrollPane;
			import javax.swing.JTable;
			import javax.swing.table.DefaultTableModel;
			import javax.swing.DefaultComboBoxModel;
			import javax.swing.ImageIcon;
			
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
			import com.toedter.calendar.JDateChooser;
			
			import java.text.SimpleDateFormat;
			import java.util.Date;
			import javax.swing.SwingUtilities;
		
			
			public class DB extends JFrame {
			
				
				private JPanel contentPane;
				private JFrame frame;
				private JTextField jtxtPatient;
				private JTextField jtxtAddress;
				private JTextField jtxtContact;
				private JTable table;
				private JTextField jtxtDiagnosis;
				private JTextField jtxtEmail;
				private JDateChooser jtxtDate; // Updated declaration
			
				
				ID ID = new ID();
				private JTextField jtxtDays;
				String Pname;
				private JTextField jtxtID;
				private JTextField jtxtDoctor;
				private JTextField jtxtSearch;
			
				
				
				public static void main(String[] args) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								DB frame = new DB();
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
				public DB() {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(0, 0, 1400, 630);
					setLocationRelativeTo(null); 
					setResizable(false);
					setTitle(" Operasys Hospital Management System");
					
					ImageIcon img = new ImageIcon("Logo.png");
					setIconImage(img.getImage());
					
					contentPane = new JPanel();
					contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
					setContentPane(contentPane);
					contentPane.setLayout(null);
					
					JPanel panel = new JPanel();
					panel.setBackground(new Color(224, 255, 255));
					panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(30, 144, 255)));
					panel.setBounds(10, 10, 1364, 570);
					contentPane.add(panel);
					panel.setLayout(null);
					
					JPanel panel_1 = new JPanel();
					panel_1.setLayout(null);
					panel_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(30, 144, 255)));
					panel_1.setBackground(new Color(224, 255, 255));
					panel_1.setBounds(22, 21, 1319, 82);
					panel.add(panel_1);
					
						ImageIcon image = new ImageIcon("Logo.png");	
						
						JLabel TitleLabel = new JLabel("Operasys Hospital Management System");
						TitleLabel.setIcon(image);
						TitleLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
						TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
						TitleLabel.setBounds(10, 11, 1299, 60);
						panel_1.add(TitleLabel);				
					
					JPanel panel_1_1 = new JPanel();
					panel_1_1.setLayout(null);
					panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(30, 144, 255)));
					panel_1_1.setBackground(new Color(224, 255, 255));
					panel_1_1.setBounds(22, 114, 318, 351);
					panel.add(panel_1_1);
					
					JLabel lblNewLabel_1 = new JLabel("Patient Name");
					lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1.setBounds(22, 44, 128, 14);
					panel_1_1.add(lblNewLabel_1);
					
					JLabel lblNewLabel_1_1 = new JLabel("Sex");
					lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1.setBounds(22, 67, 128, 14);
					panel_1_1.add(lblNewLabel_1_1);
					
					JLabel lblNewLabel_1_2 = new JLabel("Date of Birth");
					lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_2.setBounds(22, 90, 128, 14);
					panel_1_1.add(lblNewLabel_1_2);
					
					JLabel lblNewLabel_1_1_1 = new JLabel("Address");
					lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1_1.setBounds(22, 113, 128, 14);
					panel_1_1.add(lblNewLabel_1_1_1);
					
					JLabel lblNewLabel_1_3 = new JLabel("Contact Number ");
					lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_3.setBounds(22, 136, 128, 14);
					panel_1_1.add(lblNewLabel_1_3);
					
					jtxtPatient = 	new JTextField();
					jtxtPatient.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtPatient.setBounds(160, 41, 137, 20);
					
					jtxtPatient.addKeyListener(new KeyAdapter() {
					    public void keyTyped(KeyEvent e) {
					        char c = e.getKeyChar();
					        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE)) {
					            e.consume();
					        }
					    }
					});
			
					panel_1_1.add(jtxtPatient);
					jtxtPatient.setColumns(10);
					
					JLabel lblNewLabel_1_4 = new JLabel("Email Address");
					lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_4.setBounds(22, 160, 128, 16);
					panel_1_1.add(lblNewLabel_1_4);
					
					JLabel lblNewLabel_1_1_2 = new JLabel("Diagnosis");
					lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1_2.setBounds(22, 183, 128, 16);
					panel_1_1.add(lblNewLabel_1_1_2);
					
					JLabel lblNewLabel_1_2_1 = new JLabel("Room Type ");
					lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_2_1.setBounds(22, 247, 128, 14);
					panel_1_1.add(lblNewLabel_1_2_1);
					
					JLabel lblNewLabel_1_1_1_1 = new JLabel("Laboratory");
					lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1_1_1.setBounds(22, 270, 128, 14);
					panel_1_1.add(lblNewLabel_1_1_1_1);
					
					JLabel lblNewLabel_1_3_1 = new JLabel("PhilHealth ID");
					lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_3_1.setBounds(22, 293, 128, 14);
					panel_1_1.add(lblNewLabel_1_3_1);
					
					jtxtAddress = new JTextField();
					jtxtAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtAddress.setColumns(10);
					jtxtAddress.setBounds(160, 110, 137, 20);
					panel_1_1.add(jtxtAddress);
					
					jtxtContact = new JTextField();
					jtxtContact.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtContact.setColumns(10);
					jtxtContact.setBounds(160, 133, 137, 20);
					
					jtxtContact.addFocusListener(new FocusAdapter() {
						public void focusGained(FocusEvent e) {
							// Clear the default text when the field gains focus
							if (jtxtContact.getText().equals("(11 digits)")) {
								jtxtContact.setText("");
								jtxtContact.setForeground(Color.BLACK);
							}
						}
					});
			
					jtxtContact.addKeyListener(new KeyAdapter() {
						public void keyTyped(KeyEvent e) {
							char c = e.getKeyChar();
							if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
								e.consume();
							}
							if (jtxtContact.getText().length() >= 11) {
								e.consume();
							}
						}
					});
					
					panel_1_1.add(jtxtContact);
					
					JComboBox cmbRoom = new JComboBox();
					cmbRoom.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Ward ", "Semi-private", "Private", "Suite "}));
					cmbRoom.setBounds(160, 244, 137, 20);
					 // Add ItemListener to ensure "Make a Selection" cannot be selected
					cmbRoom.addItemListener(new ItemListener() {
			            private String previousSelection = "Make a Selection";
			
			            @Override
			            public void itemStateChanged(ItemEvent e) {
			                if (e.getStateChange() == ItemEvent.SELECTED) {
			                    String selectedItem = (String) cmbRoom.getSelectedItem();
			                    if ("Make a Selection".equals(selectedItem)) {
			                        // Revert to the previous selection if "Make a Selection" is selected
			                    	cmbRoom.setSelectedItem(previousSelection);
			                    } else {
			                        // Update the previous selection
			                        previousSelection = selectedItem;
			                    }
			                }
			            }
			        });		
					panel_1_1.add(cmbRoom);
					
					JComboBox cmbLab = new JComboBox();
					cmbLab.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Clinical Laboratory", "Pathology Laboratory ", "Cardiology Laboratory", "Microbiology Laboratory ", "Radiology Laboratory"}));
					cmbLab.setBounds(160, 267, 137, 20);
					// Add ItemListener to ensure "Make a Selection" cannot be selected
					cmbLab.addItemListener(new ItemListener() {
					            private String previousSelection = "Make a Selection";
			
					            @Override
					            public void itemStateChanged(ItemEvent e) {
					                if (e.getStateChange() == ItemEvent.SELECTED) {
					                    String selectedItem = (String) cmbLab.getSelectedItem();
					                    if ("Make a Selection".equals(selectedItem)) {
					                        // Revert to the previous selection if "Make a Selection" is selected
					                    	cmbLab.setSelectedItem(previousSelection);
					                    } else {
					                        // Update the previous selection
					                        previousSelection = selectedItem;
					                    }
					                }
					            }
					        });	
					panel_1_1.add(cmbLab);
					
					JComboBox cmbPhilHealth = new JComboBox();
					cmbPhilHealth.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Yes", "No"}));
					cmbPhilHealth.setBounds(160, 290, 137, 20);
					// Add ItemListener to ensure "Make a Selection" cannot be selected
					cmbPhilHealth.addItemListener(new ItemListener() {
							            private String previousSelection = "Make a Selection";
			
							            @Override
							            public void itemStateChanged(ItemEvent e) {
							                if (e.getStateChange() == ItemEvent.SELECTED) {
							                    String selectedItem = (String) cmbPhilHealth.getSelectedItem();
							                    if ("Make a Selection".equals(selectedItem)) {
							                        // Revert to the previous selection if "Make a Selection" is selected
							                    	cmbPhilHealth.setSelectedItem(previousSelection);
							                    } else {
							                        // Update the previous selection
							                        previousSelection = selectedItem;
							                    }
							                }
							            }
							        });	
					panel_1_1.add(cmbPhilHealth);
					
					jtxtDiagnosis = new JTextField();
					jtxtDiagnosis.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtDiagnosis.setColumns(10);
					jtxtDiagnosis.setBounds(160, 180, 137, 20);
					panel_1_1.add(jtxtDiagnosis);
					
					Date thisDate = new Date();
			        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			        String formattedDate = dateFormat.format(thisDate);
			   
					
					jtxtEmail = new JTextField();
					jtxtEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtEmail.setColumns(10);
					jtxtEmail.setBounds(160, 157, 137, 20);
					panel_1_1.add(jtxtEmail);
					
					JComboBox cmbSex = new JComboBox();
					cmbSex.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Male ", "Female"}));
					cmbSex.setBounds(160, 64, 137, 20);
					
				     // Add ItemListener to ensure "Make a Selection" cannot be selected
			        cmbSex.addItemListener(new ItemListener() {
			            private String previousSelection = "Make a Selection";
			
			            @Override
			            public void itemStateChanged(ItemEvent e) {
			                if (e.getStateChange() == ItemEvent.SELECTED) {
			                    String selectedItem = (String) cmbSex.getSelectedItem();
			                    if ("Make a Selection".equals(selectedItem)) {
			                        // Revert to the previous selection if "Make a Selection" is selected
			                        cmbSex.setSelectedItem(previousSelection);
			                    } else {
			                        // Update the previous selection
			                        previousSelection = selectedItem;
			                    }
			                }
			            }
			        });		
					panel_1_1.add(cmbSex);
					
					jtxtDate = 	new JDateChooser(); // Use jtxtDate instead of dateChooser	
						
					jtxtDate.setDateFormatString("yyyy-MM-dd");
					jtxtDate.setBounds(160, 87, 137, 20); // Use jtxtDate instead of dateChooser
					panel_1_1.add(jtxtDate);
					
					JLabel lblNewLabel_1_1_2_1 = new JLabel("Days admitted");
					lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1_2_1.setBounds(22, 227, 128, 16);
					panel_1_1.add(lblNewLabel_1_1_2_1);
					
					jtxtDays = new JTextField();
					jtxtDays.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtDays.setColumns(10);
					jtxtDays.setBounds(160, 223, 137, 20);
					jtxtDays.addFocusListener(new FocusAdapter() {
						public void focusGained(FocusEvent e) {
							// Clear the default text when the field gains focus
							if (jtxtDays.getText().equals("(11 digits)")) {
								jtxtDays.setText("");
								jtxtDays.setForeground(Color.BLACK);
							}
						}
					});
			
					jtxtDays.addKeyListener(new KeyAdapter() {
						public void keyTyped(KeyEvent e) {
							char c = e.getKeyChar();
							if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
								e.consume();
							}
							
						}
					});
					
					panel_1_1.add(jtxtDays);
					
					JLabel lblNewLabel_1_5 = new JLabel("ID");
					lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_5.setBounds(22, 21, 128, 14);
					panel_1_1.add(lblNewLabel_1_5);
					
					jtxtID = new JTextField();
					jtxtID.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtID.setColumns(10);
					jtxtID.setBounds(160, 18, 137, 20);		
					jtxtID.addFocusListener(new FocusAdapter() {
						public void focusGained(FocusEvent e) {
							// Clear the default text when the field gains focus
							if (jtxtID.getText().equals("(11 digits)")) {
								jtxtID.setText("");
								jtxtID.setForeground(Color.BLACK);
							}
						}
					});
			
					jtxtID.addKeyListener(new KeyAdapter() {
						public void keyTyped(KeyEvent e) {
							char c = e.getKeyChar();
							if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
								e.consume();
							}
							if (jtxtContact.getText().length() >= 12) {
								e.consume();
							}
						}
					});
					
					
					panel_1_1.add(jtxtID);
					
					JLabel lblNewLabel_1_1_2_2 = new JLabel("Doctor");
					lblNewLabel_1_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_1_2_2.setBounds(22, 206, 128, 16);
					panel_1_1.add(lblNewLabel_1_1_2_2);
					
					jtxtDoctor = new JTextField();
					jtxtDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
					jtxtDoctor.setColumns(10);
					jtxtDoctor.setBounds(160, 202, 137, 20);
					jtxtDoctor.addKeyListener(new KeyAdapter() {
					    public void keyTyped(KeyEvent e) {
					        char c = e.getKeyChar();
					        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_SPACE	|| c == '.')) {
					            e.consume();
					        }
					    }
					});		
					panel_1_1.add(jtxtDoctor);
					
					JLabel lblNewLabel_1_3_1_1 = new JLabel("VitalStat");
					lblNewLabel_1_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
					lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
					lblNewLabel_1_3_1_1.setBounds(22, 315, 128, 14);
					panel_1_1.add(lblNewLabel_1_3_1_1);
					
					JComboBox cmbVital = new JComboBox();
					cmbVital.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Alive ", "Dead"}));
					cmbVital.setBounds(160, 312, 137, 20);
					panel_1_1.add(cmbVital);
					
					JPanel panel_1_1_1 = new JPanel();
					panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(30, 144, 255)));
					panel_1_1_1.setBackground(new Color(224, 255, 255));
					panel_1_1_1.setBounds(351, 114, 990, 351);
					panel.add(panel_1_1_1);
					panel_1_1_1.setLayout(null);
					
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setBounds(10, 11, 970, 329);
					panel_1_1_1.add(scrollPane);
					
					table = new JTable();
					table.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"ID", "Patient Name", "Sex", "Date of Birth", "Address", "Contact Number", "Email Address", "Diagnosis", "Doctor", "Days Admitted", "Room", "Lab", "PhilHealth ID", "Vital Status"
						}
					));
					table.getColumnModel().getColumn(0).setPreferredWidth(58);
					table.getColumnModel().getColumn(1).setPreferredWidth(85);
					table.getColumnModel().getColumn(2).setPreferredWidth(61);
					table.getColumnModel().getColumn(3).setPreferredWidth(77);
					table.getColumnModel().getColumn(5).setPreferredWidth(108);
					table.getColumnModel().getColumn(6).setPreferredWidth(85);
					table.getColumnModel().getColumn(9).setPreferredWidth(92);
					table.getColumnModel().getColumn(12).setPreferredWidth(84);
					scrollPane.setViewportView(table);			
					
					JPanel panel_1_1_2 = new JPanel();
					panel_1_1_2.setLayout(null);
					panel_1_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(30, 144, 255)));
					panel_1_1_2.setBackground(new Color(224, 255, 255));
					panel_1_1_2.setBounds(22, 476, 1319, 71);
					panel.add(panel_1_1_2);
					
					JButton btnNewButton = new JButton("Add Record");
					btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnNewButton.setFocusable(false);
					btnNewButton.addActionListener(new ActionListener() {
					    public void actionPerformed(ActionEvent e) {
					        // Check if any of the text fields are blank or any combo boxes are set to "Make a Selection"
					        if (jtxtPatient.getText().isEmpty() || 
					            ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText().isEmpty() ||
					            jtxtAddress.getText().isEmpty() || 
					            jtxtContact.getText().isEmpty() || 
					            jtxtEmail.getText().isEmpty() || 
					            jtxtDiagnosis.getText().isEmpty() || 
					            jtxtDays.getText().isEmpty() ||
					            "Make a Selection".equals(cmbSex.getSelectedItem()) || 
					            "Make a Selection".equals(cmbRoom.getSelectedItem()) || 
					            "Make a Selection".equals(cmbLab.getSelectedItem()) || 
					            "Make a Selection".equals(cmbPhilHealth.getSelectedItem()) ||
					            "Make a Selection".equals(cmbVital.getSelectedItem())
					        ) {
					            // Show a dialog if any text field is blank or any combo box is not properly selected
					            JOptionPane.showMessageDialog(null, "Please complete all fields and make proper selections", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
					        } else {
					            // Add the record to the table
					            DefaultTableModel model = (DefaultTableModel) table.getModel();
					            model.addRow(new Object[] {
					                jtxtID.getText(),
					                jtxtPatient.getText(),
					                cmbSex.getSelectedItem(),
					                ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText(),
					                jtxtAddress.getText(),			
					                jtxtContact.getText(),
					                jtxtEmail.getText(),
					                jtxtDiagnosis.getText(),
					                jtxtDoctor.getText(),
					                jtxtDays.getText(),
					                cmbRoom.getSelectedItem(),
					                cmbLab.getSelectedItem(),
					                cmbPhilHealth.getSelectedItem(),
					                cmbVital.getSelectedItem(),
					            });

					            // Determine the room cost
					            int roomCost = 0;
					            switch (cmbRoom.getSelectedItem().toString()) {
					                case "Ward":
					                    roomCost = 500;
					                    break;
					                case "Semi-private":
					                    roomCost = 1500;
					                    break;
					                case "Private":
					                    roomCost = 2500;
					                    break;
					                case "Suite":
					                    roomCost = 3500;
					                    break;
					            }

					            // Calculate the total number of days
					            int days = Integer.parseInt(jtxtDays.getText());

					            // Calculate daily fees
					            int medicineFees = 500 * days;
					            int professionalFees = 1000 * days;
					            int laboratoryFees = 1500 * days;

					            // Calculate total cost without discounts
					            int totalCost = (roomCost * days) + medicineFees + professionalFees + laboratoryFees;

					            // Apply discounts
					            double discountAmount = 0;
					            if ("Yes".equals(cmbPhilHealth.getSelectedItem())) {
					                discountAmount = totalCost * 0.12; // 12% discount for PhilHealth
					                totalCost -= discountAmount;
					            }

					            // Create a receipt message
					            String receipt = "Receipt Information:\n" +
					                "ID: " + jtxtID.getText() + "\n" +
					                "Patient: " + jtxtPatient.getText() + "\n" +
					                "Sex: " + cmbSex.getSelectedItem() + "\n" +
					                "Date: " + ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText() + "\n" +
					                "Address: " + jtxtAddress.getText() + "\n" +
					                "Contact: " + jtxtContact.getText() + "\n" +
					                "Email: " + jtxtEmail.getText() + "\n" +
					                "Diagnosis: " + jtxtDiagnosis.getText() + "\n" +
					                "Doctor: " + jtxtDoctor.getText() + "\n" +
					                "Days: " + jtxtDays.getText() + "\n" +
					                "Room: " + cmbRoom.getSelectedItem() + "\n" +
					                "Lab: " + cmbLab.getSelectedItem() + "\n" +
					                "PhilHealth: " + cmbPhilHealth.getSelectedItem() + "\n" +
					                "Vital: " + cmbVital.getSelectedItem() + "\n" +
					                "Total Cost: PHP" + totalCost + ".00" + "\n" +
					                "Discount Applied: PHP" + discountAmount + ".00";

					            // Show the receipt in a message dialog
					            JOptionPane.showMessageDialog(null, receipt, "Receipt", JOptionPane.INFORMATION_MESSAGE);

					            if (table.getSelectedRow() == -1) {
					                if (table.getRowCount() == 0) {
					                    JOptionPane.showMessageDialog(null, "Hospital Bill Update confirmed", "Hospital Management System", JOptionPane.OK_OPTION);
					                }
					            }
					            
					            try {
					                Class.forName("com.mysql.cj.jdbc.Driver");
					                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
					                Statement stmt = con1.createStatement();
					                {
					                    String sql = "INSERT INTO fillup (PatientID, PatientName, Sex, DOB, Address, Phno, Email, Diag, Doctor, daysadmitted, RoomT, Lab, PhilID, Vitalstat, Datein) VALUES" + " "
					                        + "('" + jtxtID.getText() + "', '" + jtxtPatient.getText() + "', '" + cmbSex.getSelectedItem() + "', '" 
					                        + ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText() + "', '" + jtxtAddress.getText()
					                        + "', '" + jtxtContact.getText() + "', '" + jtxtEmail.getText() + "', '" + jtxtDiagnosis.getText() + "', '"
					                        + jtxtDoctor.getText() + "', '" + jtxtDays.getText() + "','" + cmbRoom.getSelectedItem() + "','" 
					                        + cmbLab.getSelectedItem() + "','" + cmbPhilHealth.getSelectedItem() + "','" + cmbVital.getSelectedItem() + "','" + formattedDate + "')";
					                    stmt.executeUpdate(sql);
					                    JOptionPane.showMessageDialog(null, "Data successfully added");
					                }
					            } catch (ClassNotFoundException e1) {
					                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, e1);
					            } catch (SQLException e1) {
					                e1.printStackTrace();
					            }
					        }
					    }
					});
					btnNewButton.setBounds(30, 25, 134, 23);
					panel_1_1_2.add(btnNewButton);


					
					JButton btnNewButton_1 = new JButton("Reset");
					btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnNewButton_1.setFocusable(false);
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							jtxtID.setText(""); 
							jtxtPatient.setText("");
							cmbSex.setSelectedItem("Make a Selection");
							jtxtDate.setDate(null);
							jtxtAddress.setText("");
							jtxtContact.setText("");
							jtxtEmail.setText("");
							jtxtDiagnosis.setText("");
							jtxtDoctor.setText("");
							jtxtDays.setText("");
							cmbRoom.setSelectedItem("Make a Selection");
							cmbLab.setSelectedItem("Make a Selection");
							cmbPhilHealth.setSelectedItem("Make a Selection");
							cmbVital.setSelectedItem("Make a Selection");
						}	
					});
					btnNewButton_1.setBounds(186, 25, 134, 23);
					panel_1_1_2.add(btnNewButton_1);
					
					JButton btnNewButton_2 = new JButton("Print");
					btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnNewButton_2.setFocusable(false);
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							
							try {
								table.print();
							}
							catch(java.awt.print.PrinterException e) {
								System.err.format("No Printer found", e.getMessage());
							}
						}
					});
					btnNewButton_2.setBounds(499, 25, 134, 23);
					panel_1_1_2.add(btnNewButton_2);
					
					
					
					
				        JButton btnUpdate = new JButton("Update");
				        btnUpdate.setFocusable(false);
				        btnUpdate.addActionListener(new ActionListener() {
				            public void actionPerformed(ActionEvent e) {
				                DefaultTableModel model = (DefaultTableModel)table.getModel();
				                int i = table.getSelectedRow();
				                
				                if(i>=0)
				                {
				                	model.setValueAt(jtxtID.getText(), i, 0);
				                    model.setValueAt(jtxtPatient.getText(), i, 1);
				                    model.setValueAt(cmbSex.getSelectedItem(), i, 2);
				                    model.setValueAt(((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText(), i, 3);
				                    model.setValueAt(jtxtAddress.getText(), i, 4);
				                    model.setValueAt(jtxtContact.getText(), i, 5);
				                    model.setValueAt(jtxtEmail.getText(), i, 6);
				                    model.setValueAt(jtxtDiagnosis.getText(), i, 7);
				                    model.setValueAt(jtxtDoctor.getText(), i, 8);
				                    model.setValueAt(jtxtDays.getText(), i, 9);
				                    model.setValueAt(cmbRoom.getSelectedItem(), i, 10);
				                    model.setValueAt(cmbLab.getSelectedItem(), i, 11);
				                    model.setValueAt(cmbPhilHealth.getSelectedItem(), i, 12);
				                    model.setValueAt(cmbVital.getSelectedItem(), i, 13);
					                    		
				                    JOptionPane.showMessageDialog(null, "Updated Successfully");
				                    try {
				                    	
				                    	Class.forName("com.mysql.cj.jdbc.Driver");
										Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
										Statement stmt = con1.createStatement();
				            			PreparedStatement update = con1.prepareStatement("UPDATE fillup SET PatientName=?, Sex=?, DOB=?, Address=?, Phno=?, Email=?, Diag=?, Doctor=?, daysadmitted=?, RoomT=?, Lab=?, PhilID=?, Vitalstat=?, datein=? WHERE PatientID=? ");
				            			
				            			update.setString(1, jtxtPatient.getText());
				            			update.setString(2, (String) cmbSex.getSelectedItem());
				            			update.setString(3, ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText());
				            			update.setString(4, jtxtAddress.getText());
				            			update.setString(5, jtxtContact.getText());
				            			update.setString(6, jtxtEmail.getText());
				            			update.setString(7, jtxtDiagnosis.getText());
				            			update.setString(8, jtxtDoctor.getText());
				            			update.setString(9, jtxtDays.getText());
				            			update.setString(10, (String) cmbRoom.getSelectedItem());
				            			update.setString(11, (String) cmbLab.getSelectedItem());
				            			update.setString(12, (String) cmbPhilHealth.getSelectedItem());
				            			update.setString(13, (String) cmbVital.getSelectedItem());
				            			update.setString(14, formattedDate);
				            			
				            			update.setString(15, jtxtID.getText());
				            			update.executeUpdate();
		
				            			 JOptionPane.showMessageDialog(null, "Record Saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
				            	            con1.close();
				            			
				            	        } catch (Exception ex) {
				            	            JOptionPane.showMessageDialog(null, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
											Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
				
				            	        } 
				                    
				                }
				                else {
				                    JOptionPane.showMessageDialog(null, "Please Select a Row First");
				                }
				            }
				        });
				        
				        
				        btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
				        btnUpdate.setBounds(339, 25, 140, 23);
				        panel_1_1_2.add(btnUpdate);
					
					
					JButton btnNewButton_3 = new JButton("Delete");
					btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnNewButton_3.setFocusable(false);
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								
							DefaultTableModel model = (DefaultTableModel) table.getModel();
							if (table.getSelectedRow() == -1) {
								if(table.getRowCount() == 0) {
									
									JOptionPane.showMessageDialog(null, "No data to delete", 
											"Hospital Management System", JOptionPane.OK_OPTION);
								} else {
									
									JOptionPane.showMessageDialog(null, "Select a row to delete", 
											"Hospital Management System", JOptionPane.OK_OPTION);						
								}
						} else {
							model.removeRow(table.getSelectedRow());
							
							try {
				                Class.forName("com.mysql.cj.jdbc.Driver");
				                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","");
				                Statement stmt = con1.createStatement();
				                {
				                    String sql = "INSERT INTO discharge (PatientID, PatientName, Sex, DOB, Address, Phno, Email, Diag, Doctor, daysadmitted, RoomT, Lab, PhilID, Vitalstat, Datein) VALUES" + " "
				                        + "('" + jtxtID.getText() + "', '" + jtxtPatient.getText() + "', '" + cmbSex.getSelectedItem() + "', '" 
				                        + ((JTextField)jtxtDate.getDateEditor().getUiComponent()).getText() + "', '" + jtxtAddress.getText()
				                        + "', '" + jtxtContact.getText() + "', '" + jtxtEmail.getText() + "', '" + jtxtDiagnosis.getText() + "', '"
				                        + jtxtDoctor.getText() + "', '" + jtxtDays.getText() + "','" + cmbRoom.getSelectedItem() + "','" 
				                        + cmbLab.getSelectedItem() + "','" + cmbPhilHealth.getSelectedItem() + "','" + cmbVital.getSelectedItem() + "','" + formattedDate + "')";
				                    stmt.executeUpdate(sql);
				                    JOptionPane.showMessageDialog(null, "Data has been input and discharged successfully.");
				                }
				            } catch (ClassNotFoundException e1) {
				                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, e1);
				            } catch (SQLException e1) {
				                e1.printStackTrace();
				            }
							
						}
											
						}
					});
					btnNewButton_3.setBounds(653, 25, 134, 23);
					panel_1_1_2.add(btnNewButton_3);
					
					JButton btnNewButton_4 = new JButton("Back");
					btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnNewButton_4.setFocusable(false);
					btnNewButton_4.setBounds(1152, 25, 134, 23);
					btnNewButton_4.addActionListener(new ActionListener() {
			            @Override
			            public void actionPerformed(ActionEvent e) {
			                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back?", "Back", JOptionPane.YES_NO_OPTION);
			                if (choice == JOptionPane.YES_OPTION) {
			                    setVisible(false);
			                    dispose();  // Close the current window
			                    HomeHospital home = new HomeHospital	();  // Assuming HomeClass is the class for your home screen
			                    home.setVisible(true);  // Show the home screen
			                }
			            }
			        });
					panel_1_1_2.add(btnNewButton_4);
					
				
					
					
				}
			}
