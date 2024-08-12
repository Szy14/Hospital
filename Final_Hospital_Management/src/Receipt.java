import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.util.*;

public class Receipt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel ID, patientName, sex, DOB, address, contactNo, email, diagnosis, doctor, daysAdmit, roomType, lab, philID,
		   lblDiscountFee, lblPhilHealthFee, lblSeniorFee, lblDiscountSubtotal, lblTotalPrice, lblPrimaryFees_1, lblRoomCharge, 
		   lblMedFees, lblProfessionFee, lblSubtotalFee, vitalStat;
	ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("operasys_logo.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855,770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setLocation(-488, -132);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setTitle("Operasys Hospital");
		setResizable(false);
		setContentPane(contentPane);
		setIconImage(logo.getImage());
		contentPane.setLayout(null);
				
		// JPANELS ----------------------------------------------------------------------------------
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(488, 371, 325, 193);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(488, 141, 325, 224);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128, 20));
		panel_1.setBounds(26, 212, 398, 453);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(488, 570, 325, 48);
		contentPane.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(453, 0, 388, 731);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		// DONE BUTTON -----------------------------------------------------------------------------
		Button btnNewButton = new Button("Done");
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(225, 678, 117, 35);
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		// PRINT BUTTON ------------------------------------------------------------------------------
		Button btnNewButton_1 = new Button("Print");
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(new Color(240, 128, 128));
		btnNewButton_1.setBounds(102, 678, 117, 35);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Receipt printed.  Go to \"Downloads\" folder.   ", "Operasys Hospital", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		// INFORMATIONS ----------------------------------------------------------------------------
		ID = new JLabel("-----");
		ID.setBounds(44, 12, 155, 20);
		panel_1.add(ID);
		ID.setForeground(new Color(0, 128, 255));
		ID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		sex = new JLabel("-----");
		sex.setBounds(53, 74, 113, 20);
		panel_1.add(sex);
		sex.setForeground(new Color(0, 128, 255));
		sex.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		doctor = new JLabel("-----");
		doctor.setBounds(75, 267, 292, 20);
		panel_1.add(doctor);
		doctor.setForeground(new Color(0, 128, 255));
		doctor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		daysAdmit = new JLabel("-----");
		daysAdmit.setBounds(128, 301, 54, 20);
		panel_1.add(daysAdmit);
		daysAdmit.setForeground(new Color(0, 128, 255));
		daysAdmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		roomType = new JLabel("-----");
		roomType.setBounds(109, 332, 163, 20);
		panel_1.add(roomType);
		roomType.setForeground(new Color(0, 128, 255));
		roomType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lab = new JLabel("-----");
		lab.setBounds(102, 363, 163, 20);
		panel_1.add(lab);
		lab.setForeground(new Color(0, 128, 255));
		lab.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		philID = new JLabel("-----");
		philID.setBounds(118, 392, 40, 20);
		panel_1.add(philID);
		philID.setForeground(new Color(0, 128, 255));
		philID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		diagnosis = new JLabel("-----");
		diagnosis.setBounds(98, 237, 207, 20);
		panel_1.add(diagnosis);
		diagnosis.setForeground(new Color(0, 128, 255));
		diagnosis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		email = new JLabel("-----");
		email.setBounds(129, 206, 241, 20);
		panel_1.add(email);
		email.setForeground(new Color(0, 128, 255));
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		contactNo = new JLabel("-----");
		contactNo.setBounds(143, 172, 163, 20);
		panel_1.add(contactNo);
		contactNo.setForeground(new Color(0, 128, 255));
		contactNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		address = new JLabel("-----");
		address.setBounds(87, 138, 290, 20);
		panel_1.add(address);
		address.setForeground(new Color(0, 128, 255));
		address.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		DOB = new JLabel("-----");
		DOB.setBounds(120, 106, 163, 20);
		panel_1.add(DOB);
		DOB.setForeground(new Color(0, 128, 255));
		DOB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		patientName = new JLabel("-----");
		patientName.setBounds(118, 43, 255, 20);
		panel_1.add(patientName);
		patientName.setForeground(new Color(0, 128, 255));
		patientName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		vitalStat = new JLabel("-----");
		vitalStat.setForeground(new Color(0, 128, 255));
		vitalStat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		vitalStat.setBounds(89, 423, 40, 20);
		panel_1.add(vitalStat);
		
		lblDiscountFee = new JLabel("-----");
		lblDiscountFee.setForeground(new Color(0, 128, 255));
		lblDiscountFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiscountFee.setBounds(125, 23, 118, 19);
		panel_2.add(lblDiscountFee);
		
		lblPhilHealthFee = new JLabel("-----");
		lblPhilHealthFee.setForeground(new Color(0, 128, 255));
		lblPhilHealthFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhilHealthFee.setBounds(125, 53, 118, 19);
		panel_2.add(lblPhilHealthFee);
		
		lblSeniorFee = new JLabel("-----");
		lblSeniorFee.setForeground(new Color(0, 128, 255));
		lblSeniorFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSeniorFee.setBounds(153, 83, 118, 19);
		panel_2.add(lblSeniorFee);
		
		lblDiscountSubtotal = new JLabel("-----");
		lblDiscountSubtotal.setForeground(new Color(0, 128, 255));
		lblDiscountSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDiscountSubtotal.setBounds(111, 144, 118, 19);
		panel_2.add(lblDiscountSubtotal);
		
		lblTotalPrice = new JLabel("-----");
		lblTotalPrice.setForeground(new Color(0, 128, 255));
		lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalPrice.setBounds(85, 15, 118, 19);
		panel_2_1.add(lblTotalPrice);
		
		lblPrimaryFees_1 = new JLabel("-----");
		lblPrimaryFees_1.setForeground(new Color(0, 128, 255));
		lblPrimaryFees_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrimaryFees_1.setBounds(143, 23, 118, 19);
		panel.add(lblPrimaryFees_1);
		
		lblRoomCharge = new JLabel("-----");
		lblRoomCharge.setForeground(new Color(0, 128, 255));
		lblRoomCharge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRoomCharge.setBounds(191, 53, 118, 19);
		panel.add(lblRoomCharge);
		
		lblMedFees = new JLabel("-----");
		lblMedFees.setForeground(new Color(0, 128, 255));
		lblMedFees.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMedFees.setBounds(154, 83, 118, 19);
		panel.add(lblMedFees);
		
		lblProfessionFee = new JLabel("-----");
		lblProfessionFee.setForeground(new Color(0, 128, 255));
		lblProfessionFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProfessionFee.setBounds(183, 113, 118, 19);
		panel.add(lblProfessionFee);
		
		lblSubtotalFee = new JLabel("-----");
		lblSubtotalFee.setForeground(new Color(0, 128, 255));
		lblSubtotalFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSubtotalFee.setBounds(109, 176, 118, 19);
		panel.add(lblSubtotalFee);
			
		// LOGO
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBackground(new Color(128, 255, 255));
		lblNewLabel_2.setBounds(166, 23, 86, 86);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/operasys_logo.png")));
		
		// JLABELS ---------------------------------------------------------------------------------------------
		JLabel lblSubtotal_2_1 = new JLabel("Total:");
		lblSubtotal_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblSubtotal_2_1.setBounds(28, 15, 56, 19);
		panel_2_1.add(lblSubtotal_2_1);
		
		JLabel lblNewLabel = new JLabel("Receipt:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(164, 163, 106, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblOperasysHospital = new JLabel("Operasys Hospital");
		lblOperasysHospital.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
		lblOperasysHospital.setBounds(108, 113, 234, 28);
		contentPane.add(lblOperasysHospital);
		
		JLabel lblPrimaryFees = new JLabel("Primary Fees:");
		lblPrimaryFees.setBounds(27, 23, 118, 19);
		lblPrimaryFees.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(lblPrimaryFees);
		
		JLabel lblRoomRentCharge = new JLabel("Room Rent Charge:");
		lblRoomRentCharge.setFont(new Font("Arial", Font.BOLD, 16));
		lblRoomRentCharge.setBounds(27, 53, 168, 19);
		panel.add(lblRoomRentCharge);
		
		JLabel lblMedicineFees = new JLabel("Medicine Fees:");
		lblMedicineFees.setFont(new Font("Arial", Font.BOLD, 16));
		lblMedicineFees.setBounds(27, 83, 168, 19);
		panel.add(lblMedicineFees);
		
		JLabel lblProfessionalFees = new JLabel("Professional Fees:");
		lblProfessionalFees.setFont(new Font("Arial", Font.BOLD, 16));
		lblProfessionalFees.setBounds(27, 113, 168, 19);
		panel.add(lblProfessionalFees);
		
		JLabel lblSubtotal = new JLabel("Subtotal:");
		lblSubtotal.setFont(new Font("Arial", Font.BOLD, 16));
		lblSubtotal.setBounds(27, 176, 100, 19);
		panel.add(lblSubtotal);
		
		JLabel lblSubtotal_1 = new JLabel("______________________________________________________");
		lblSubtotal_1.setForeground(new Color(192, 192, 192));
		lblSubtotal_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSubtotal_1.setBounds(27, 143, 272, 19);
		panel.add(lblSubtotal_1);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(15, 74, 40, 20);
		panel_1.add(lblSex);
		lblSex.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblPhilhealthId = new JLabel("PhilHealth ID:");
		lblPhilhealthId.setBounds(15, 392, 120, 20);
		panel_1.add(lblPhilhealthId);
		lblPhilhealthId.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblLaboratory = new JLabel("Laboratory:");
		lblLaboratory.setBounds(15, 363, 120, 20);
		panel_1.add(lblLaboratory);
		lblLaboratory.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblRoomType = new JLabel("Room Type:");
		lblRoomType.setBounds(15, 332, 120, 20);
		panel_1.add(lblRoomType);
		lblRoomType.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDaysAdmitted = new JLabel("Days Admitted:");
		lblDaysAdmitted.setBounds(15, 300, 120, 20);
		panel_1.add(lblDaysAdmitted);
		lblDaysAdmitted.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDoctor = new JLabel("Doctor:");
		lblDoctor.setBounds(15, 268, 120, 20);
		panel_1.add(lblDoctor);
		lblDoctor.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDiagnosis = new JLabel("Diagnosis:");
		lblDiagnosis.setBounds(15, 237, 120, 20);
		panel_1.add(lblDiagnosis);
		lblDiagnosis.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(15, 206, 120, 20);
		panel_1.add(lblEmailAddress);
		lblEmailAddress.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setBounds(16, 172, 147, 20);
		panel_1.add(lblContactNumber);
		lblContactNumber.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(15, 138, 120, 20);
		panel_1.add(lblAddress);
		lblAddress.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setBounds(15, 106, 120, 20);
		panel_1.add(lblDateOfBirth);
		lblDateOfBirth.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setBounds(15, 43, 120, 20);
		panel_1.add(lblPatientName);
		lblPatientName.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(15, 12, 31, 20);
		panel_1.add(lblId);
		lblId.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblVitalStat = new JLabel("Vital Stat:");
		lblVitalStat.setFont(new Font("Arial", Font.BOLD, 14));
		lblVitalStat.setBounds(15, 423, 120, 20);
		panel_1.add(lblVitalStat);
		
		JLabel lblDiscounts = new JLabel("Discounts:");
		lblDiscounts.setFont(new Font("Arial", Font.BOLD, 16));
		lblDiscounts.setBounds(27, 23, 118, 19);
		panel_2.add(lblDiscounts);
		
		JLabel lblPhilhealth = new JLabel("Philhealth:");
		lblPhilhealth.setFont(new Font("Arial", Font.BOLD, 16));
		lblPhilhealth.setBounds(27, 53, 168, 19);
		panel_2.add(lblPhilhealth);
		
		JLabel lblSeniorCitizen = new JLabel("Senior Citizen:");
		lblSeniorCitizen.setFont(new Font("Arial", Font.BOLD, 16));
		lblSeniorCitizen.setBounds(27, 83, 168, 19);
		panel_2.add(lblSeniorCitizen);
		
		JLabel lblSubtotal_2 = new JLabel("Subtotal:");
		lblSubtotal_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblSubtotal_2.setBounds(27, 144, 100, 19);
		panel_2.add(lblSubtotal_2);
		
		JLabel lblSubtotal_1_1 = new JLabel("______________________________________________________");
		lblSubtotal_1_1.setForeground(new Color(192, 192, 192));
		lblSubtotal_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSubtotal_1_1.setBounds(27, 111, 272, 19);
		panel_2.add(lblSubtotal_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1, 0, 394, 731);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(this.getClass().getResource("/operasys_bg2.png")));
		
	}
}