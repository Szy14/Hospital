	import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
	
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.SwingConstants;
	import javax.swing.border.EmptyBorder;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.Font;
	import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
	import javax.swing.UIManager;
	import java.awt.SystemColor;
	
	public class HomeHospital extends JFrame {
	
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JButton ArchiveButton;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						HomeHospital frame = new HomeHospital();
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
		public HomeHospital() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1300, 700);
			setLocationRelativeTo(null);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			ImageIcon image = new ImageIcon("Logo.png");	
			
			JLabel TitleLabel = new JLabel("   Operasys Hospital Management System");
			TitleLabel.setOpaque(true);		
			TitleLabel.setIcon(new ImageIcon("C:\\Users\\Ryzen 5\\Desktop\\OOP\\Final_Hospital_Management\\image\\HospLogo (1).png"));
			TitleLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
			TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			TitleLabel.setBounds(203, 38, 879, 174);
			Color highlightColor = new Color(SystemColor.textHighlight.getRed(),
	                SystemColor.textHighlight.getGreen(),
	                SystemColor.textHighlight.getBlue(),
	                150); 	
			TitleLabel.setBackground(highlightColor);
			contentPane.add(TitleLabel);
			
				
			
			JButton ManagementButton = new JButton("Management system");
			ManagementButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()== ManagementButton);
					DB fillup = new DB();
					fillup.setVisible(true);			
					dispose();		}
			});
			ManagementButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			ManagementButton.setBounds(56, 327, 335, 107);
			ManagementButton.setFocusable(false);
			contentPane.add(ManagementButton);
			
			JButton ArchiveButton = new JButton("Discharge");
			ArchiveButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        try {
			            Desktop.getDesktop().browse(new URI("http://localhost/phpmyadmin/index.php?route=/sql&pos=0&db=hospitaldb&table=discharge"));
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
			    }
			});
			ArchiveButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			ArchiveButton.setBounds(474, 327, 335, 107);
			ArchiveButton.setFocusable(false);
			contentPane.add(ArchiveButton);

			
			JButton LogoutButton = new JButton("Logout");
			LogoutButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
			LogoutButton.setFocusable(false);
			LogoutButton.setBounds(890, 327, 335, 107);
			contentPane.add(LogoutButton);
			
			JPanel LBluepanel = new JPanel();
			LBluepanel.setLayout(null);
			LBluepanel.setForeground(Color.WHITE);
			LBluepanel.setBackground(new Color(255, 255, 255, 100));
			LBluepanel.setBounds(231, 478, 823, 150);
			contentPane.add(LBluepanel);
			
			JLabel FQuoteLabel = new JLabel("\"Wherever the art of medicine is loved,");
			FQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
			FQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
			FQuoteLabel.setBackground(Color.BLACK);
			FQuoteLabel.setBounds(20, 16, 776, 45);
			LBluepanel.add(FQuoteLabel);
			
			JLabel HippocratesLabel = new JLabel("- Hippocrates");
			HippocratesLabel.setHorizontalAlignment(SwingConstants.CENTER);
			HippocratesLabel.setForeground(Color.BLACK);
			HippocratesLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			HippocratesLabel.setBackground(Color.BLACK);
			HippocratesLabel.setBounds(262, 106, 298, 25);
			LBluepanel.add(HippocratesLabel);
			
			JLabel fQuoteLabel = new JLabel("there is also a loved humanity.\"");
			fQuoteLabel.setHorizontalAlignment(SwingConstants.CENTER);
			fQuoteLabel.setFont(new Font("Script MT Bold", Font.BOLD, 30));
			fQuoteLabel.setBackground(Color.BLACK);
			fQuoteLabel.setBounds(20, 50, 776, 45);
			LBluepanel.add(fQuoteLabel);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ryzen 5\\Desktop\\OOP\\Final_Hospital_Management\\image\\Home.jpg"));
			lblNewLabel.setBounds(0, 0, 1284, 661);
			contentPane.add(lblNewLabel);
			
			LogoutButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Logout", JOptionPane.YES_NO_OPTION);
	                if (choice == JOptionPane.YES_OPTION) {
	                    setVisible(false);
	                    dispose(); 
	                    Login_Account login = new Login_Account();  
	                    login.setVisible(true); 
	                }
	            }
	        });
	    }
			
		
	}
