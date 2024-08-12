import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.TextField;
import java.awt.List;
import java.awt.Font;
import javax.swing.JTextField;


public class Bill_Summary  {

	JFrame frame;
 JPanel TpanelField ;
String Pname;
String Email;
int Accnum;
 int Age;
 int Days;
 String SelectedRoom;
 double Total;
 int Room_Cost;
 double Discount; 
Double DiscTotal;
String SelectedPhilHealth;
int PhilHealthDisc;

 
 
	  Bill_Summary(String Pname, String Email, int Accnum, int Days, int Age, String SelectedRoom, String SelectedPhilHealth) {

		//Calculation
	
		  int Meds = 500;
		  int Misc = 350;
		  int RoomService = 200;
		 

		  // Room cost calculation
		  if ("Ward 500.00".equals(SelectedRoom)) {
		      Room_Cost = 500;
		  } else if ("Deluxe 1,500.00".equals(SelectedRoom)) {
		      Room_Cost = 1500;
		  } else if ("Luxury 2,500.00".equals(SelectedRoom)) {
		      Room_Cost = 2500;
		  } else if ("Suite 5,000.00".equals(SelectedRoom)) {
		      Room_Cost = 5000;
		  }

		  // Calculate discount
		  if (Age >= 60) {
		      // Apply a 10% discount for senior citizens
		      Discount = Total * 0.1;
		  } else {
		      // No discount for individuals below 60
		      Discount = 0;
		  }

		  // Update the Total calculation
		  Total = Total + (Meds * Days) + (Room_Cost * Days) + (Misc * Days) + (RoomService * Days);

		  if (Age >= 60) {
		      // Apply a 10% discount for senior citizens
		      Discount = Total * 0.1;
		  } else {
		      // No discount for individuals below 60
		      Discount = 0;
		  }
		  
		  if ("yes".equals(SelectedPhilHealth)) {
	            PhilHealthDisc = (int) (Total * 0.12);
	        } else {
	            PhilHealthDisc = 0;
	        }
		  
		  DiscTotal = Total - (Discount + PhilHealthDisc);
		  // Display discount
		  System.out.println("Philhealth Discount: " + PhilHealthDisc);
		  System.out.println("Senior Citizen Discount: " + Discount);
		  System.out.println("Subtotal: " + Total);
		  System.out.println("Total amount with with philhealth discount and Senior Citizen discount: " + DiscTotal);
				
		
		 
		 frame = new JFrame();
			frame.getContentPane().setBackground(Color.PINK);
			frame.setBounds(100, 100, 590, 475);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JTextArea txtOperasysHospital = new JTextArea();
			txtOperasysHospital.setEditable(false);
			txtOperasysHospital.setForeground(Color.BLACK);
			txtOperasysHospital.setText(" OperaSys Hospital");
	        txtOperasysHospital.setFont(new Font("Arial", Font.BOLD, 14)); 
			txtOperasysHospital.setBounds(10, 10, 155, 21);
			frame.getContentPane().add(txtOperasysHospital);
			
			Component horizontalStrut = Box.createHorizontalStrut(20);
			horizontalStrut.setBounds(66, 159, 181, -22);
			frame.getContentPane().add(horizontalStrut);
			
			JLabel FlineLabel = new JLabel("------------------------------------------------------------------------------------------------------------------------------------");
			FlineLabel.setBounds(25, 75, 538, 13);
			frame.getContentPane().add(FlineLabel);
			
			Label BillLabel = new Label("Bill to:");
			BillLabel.setFont(new Font("Dialog", Font.ITALIC, 12));
			BillLabel.setBounds(10, 94, 59, 21);
			frame.getContentPane().add(BillLabel);
			
			Label PnameLabel = new Label("Patient Name: ");
			PnameLabel.setBounds(23, 132, 89, 21);
			frame.getContentPane().add(PnameLabel);
			
			Label EmailLabel = new Label("Email Address:");
			EmailLabel.setBounds(292, 132, 98, 21);
			frame.getContentPane().add(EmailLabel);
			
			Label AccountnumLabel = new Label("Account Number:");
			AccountnumLabel.setBounds(281, 159, 109, 21);
			frame.getContentPane().add(AccountnumLabel);
			
			JLabel SlineLabel = new JLabel("------------------------------------------------------------------------------------------------------------------------------------");
			SlineLabel.setBounds(25, 186, 538, 13);
			frame.getContentPane().add(SlineLabel);
			
			Label AgeLabel = new Label("Age:");
			AgeLabel.setBounds(66, 159, 36, 21);
			frame.getContentPane().add(AgeLabel);
			
			Label DaysAdmitLabel = new Label("Total of Days Admitted:");
			DaysAdmitLabel.setBounds(25, 205, 140, 21);
			frame.getContentPane().add(DaysAdmitLabel);
			
			Label BillSummaryLabel = new Label("BILL SUMMARY");
			BillSummaryLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
			BillSummaryLabel.setBounds(220, 48, 168, 21);
			frame.getContentPane().add(BillSummaryLabel);
			
			Label RoomLabel = new Label("Room Type:");
			RoomLabel.setBounds(25, 232, 79, 21);
			frame.getContentPane().add(RoomLabel);
			
			Label PhidLabel = new Label("PhilHealth ID discount:");
			PhidLabel.setBounds(25, 259, 140, 21);
			frame.getContentPane().add(PhidLabel);
			
			Label TotalLabel = new Label("TOTAL:");
			TotalLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			TotalLabel.setBounds(25, 331, 59, 21);
			frame.getContentPane().add(TotalLabel);
			
			JPanel TpanelField = new JPanel();
			TpanelField.setBounds(95, 333, 80, 22);
			frame.getContentPane().add(TpanelField);
			TpanelField.setLayout(null);

			
			JLabel iTotalLabel = new JLabel("PHP " + SelectedPhilHealth);
			iTotalLabel.setFont(new Font("Dialog", Font.BOLD, 13));
			iTotalLabel.setBounds(0, 0, 127, 19); 
			TpanelField.add(iTotalLabel);
		
		   
			
			Label iAdmittedLabel = new Label();
			iAdmittedLabel.setText(Integer.toString(Days));
			iAdmittedLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			iAdmittedLabel.setBounds(181, 205, 41, 21);
			frame.getContentPane().add(iAdmittedLabel);
			
			Label iRoomLabel = new Label(SelectedRoom);
			iRoomLabel.setFont(new Font("Dialog", Font.BOLD, 12));
			iRoomLabel.setBounds(181, 232, 105, 21);
			frame.getContentPane().add(iRoomLabel);
			
			Label iphdcLabel = new Label("PHP: -" + PhilHealthDisc);
			iphdcLabel.setBounds(179, 259, 90, 21);
			frame.getContentPane().add(iphdcLabel);
			
			Label SeniorLabel = new Label("Senior Citizen discount:");
			SeniorLabel.setBounds(25, 286, 140, 21);
			frame.getContentPane().add(SeniorLabel);
			
			
			Label iScdcLabel = new Label("PHP -" + String.format("%.2f", Discount));
			iScdcLabel.setBounds(176, 286, 90, 21);
			frame.getContentPane().add(iScdcLabel);
			
			JLabel TlineLabel = new JLabel("------------------------------------------------------------------------------------------------------------------------------------");
			TlineLabel.setBounds(25, 313, 538, 13);
			frame.getContentPane().add(TlineLabel);
			
			Label PanameLabel = new Label();
			PanameLabel.setText(Pname);
			PanameLabel.setFont(new Font("Dialog", Font.BOLD, 12)); // Set font to bold
			PanameLabel.setBounds(116, 132, 155, 21);
			frame.getContentPane().add(PanameLabel);

			Label iAgeLabel = new Label();
			iAgeLabel.setText(Integer.toString(Age));
			iAgeLabel.setFont(new Font("Dialog", Font.BOLD, 12)); // Set font to bold
			iAgeLabel.setBounds(116, 159, 155, 21);
			frame.getContentPane().add(iAgeLabel);

			Label iEmaillabel = new Label();
			iEmaillabel.setText(Email);
			iEmaillabel.setFont(new Font("Dialog", Font.BOLD, 12)); // Set font to bold
			iEmaillabel.setBounds(396, 132, 155, 21);
			frame.getContentPane().add(iEmaillabel);

			Label Accnumlabel = new Label();
			Accnumlabel.setText(Integer.toString(Accnum));
			Accnumlabel.setFont(new Font("Dialog", Font.BOLD, 12)); // Set font to bold
			Accnumlabel.setBounds(396, 159, 155, 21);
			frame.getContentPane().add(Accnumlabel);

	}
	

} 

