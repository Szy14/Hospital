import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import java.sql.*;

public class Fill_up_Form extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel FillupPanel;
    private JLabel LogoLabel;

    private JLabel PatientNameLabel;
    private JLabel AccountNumberLabel;
    private JLabel ContactNumberLabel;
    private JLabel PatientAddressLabel;
    private JLabel ChiefComplaintLabel;
    private JTextField PnametextField;
    private JTextField AccnumbertextField;
    private JTextField CnumbertextField;
    private JTextField PaddresstextField;
    private JTextField CcomplainttextField;
    private JLabel GenderLabel;
    private JLabel BirthLabel;
    private JLabel DaysAdmittedLabel;
    private JLabel lblRoomType;
    private JLabel PhealthIDLabel;
    private JTextField DaystextField;
    private JComboBox<String> TroomcomboBox;
    private JLabel LaboratoryLabel;
    private JComboBox<String> LabcomboBox;
    private JDateChooser PbirthField;
    private String Pbirth;

    JButton SubmitButton;
    String Pname;
    String Paddress;
    String ChiefComplaint;
    String Contact;
    int Accnum;
    int Days;
    String SelectedRoom;
    String Selectedlab;

    JRadioButton Female;
    JRadioButton Male;
    String Psex;

    JRadioButton PhIdYes;
    JRadioButton PhIdNo;
    String Pphidnum;

    static final String URL = "jdbc:mysql://localhost:3306/operasys hospital database";
    static final String USER = "root";
    static final String PASS = "";
    static String sql;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Fill_up_Form frame = new Fill_up_Form();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Fill_up_Form() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 608, 548);
        FillupPanel = new JPanel();
        FillupPanel.setBackground(new Color(175, 238, 238));
        FillupPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(FillupPanel);
        FillupPanel.setLayout(null);

        JLabel OperasysHospitalLabel = new JLabel("Operasys Hospital");
        OperasysHospitalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        OperasysHospitalLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
        OperasysHospitalLabel.setBounds(80, 44, 554, 29);
        FillupPanel.add(OperasysHospitalLabel);

        ImageIcon HospitalIcon = new ImageIcon("HospLogo (1).png");
        LogoLabel = new JLabel();
        LogoLabel.setBackground(new Color(0, 0, 0));
        LogoLabel.setBounds(145, 11, 104, 99);
        LogoLabel.setIcon(HospitalIcon);
        FillupPanel.add(LogoLabel);

        PatientNameLabel = new JLabel("Patient Name:");
        PatientNameLabel.setBackground(new Color(0, 0, 0));
        PatientNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PatientNameLabel.setBounds(34, 139, 104, 14);
        FillupPanel.add(PatientNameLabel);

        AccountNumberLabel = new JLabel("Account Number:");
        AccountNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        AccountNumberLabel.setBounds(34, 189, 133, 14);
        FillupPanel.add(AccountNumberLabel);

        ContactNumberLabel = new JLabel("Contact Number:");
        ContactNumberLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ContactNumberLabel.setBounds(34, 239, 133, 14);
        FillupPanel.add(ContactNumberLabel);

        PatientAddressLabel = new JLabel("Patient Address:");
        PatientAddressLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PatientAddressLabel.setBounds(34, 289, 116, 14);
        FillupPanel.add(PatientAddressLabel);

        ChiefComplaintLabel = new JLabel("Chief Complaint:");
        ChiefComplaintLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ChiefComplaintLabel.setBounds(34, 332, 133, 28);
        FillupPanel.add(ChiefComplaintLabel);

        PnametextField = new JTextField();
        PnametextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        PnametextField.setBounds(165, 136, 120, 23);
        FillupPanel.add(PnametextField);
        PnametextField.setColumns(10);

        AccnumbertextField = new JTextField("(4 digits only)");
        AccnumbertextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        AccnumbertextField.setColumns(10);
        AccnumbertextField.setBounds(165, 186, 120, 23);
        AccnumbertextField.setForeground(Color.GRAY);
        AccnumbertextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (AccnumbertextField.getText().equals("(4 digits only)")) {
                    AccnumbertextField.setText("");
                    AccnumbertextField.setForeground(Color.BLACK);
                }
            }
        });

        AccnumbertextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }

                if (AccnumbertextField.getText().length() >= 4) {
                    e.consume();
                }
            }
        });

        AccnumbertextField.setEditable(true);
        FillupPanel.add(AccnumbertextField);

        CnumbertextField = new JTextField("(11 digits)");
        CnumbertextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        CnumbertextField.setColumns(10);
        CnumbertextField.setBounds(165, 236, 120, 23);
        CnumbertextField.setForeground(Color.GRAY);

        CnumbertextField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (CnumbertextField.getText().equals("(11 digits)")) {
                    CnumbertextField.setText("");
                    CnumbertextField.setForeground(Color.BLACK);
                }
            }
        });

        CnumbertextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume();
                }

                if (CnumbertextField.getText().length() >= 11) {
                    e.consume();
                }
            }
        });

        CnumbertextField.setEditable(true);
        FillupPanel.add(CnumbertextField);

        PaddresstextField = new JTextField();
        PaddresstextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        PaddresstextField.setColumns(10);
        PaddresstextField.setBounds(165, 286, 120, 23);
        FillupPanel.add(PaddresstextField);

        CcomplainttextField = new JTextField();
        CcomplainttextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        CcomplainttextField.setColumns(10);
        CcomplainttextField.setBounds(165, 336, 120, 23);
        FillupPanel.add(CcomplainttextField);

        PbirthField = new JDateChooser();
        PbirthField.setBounds(423, 189, 130, 23);
        FillupPanel.add(PbirthField);

        GenderLabel = new JLabel("Sex:");
        GenderLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GenderLabel.setBackground(Color.BLACK);
        GenderLabel.setBounds(302, 139, 104, 14);
        FillupPanel.add(GenderLabel);

        BirthLabel = new JLabel("Date of Birth:");
        BirthLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        BirthLabel.setBounds(302, 189, 133, 20);
        FillupPanel.add(BirthLabel);

        DaysAdmittedLabel = new JLabel("Days Admitted:");
        DaysAdmittedLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        DaysAdmittedLabel.setBounds(302, 236, 133, 20);
        FillupPanel.add(DaysAdmittedLabel);

        lblRoomType = new JLabel("Room Type:");
        lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblRoomType.setBounds(302, 282, 116, 29);
        FillupPanel.add(lblRoomType);

        PhealthIDLabel = new JLabel("PhilHealth ID:");
        PhealthIDLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        PhealthIDLabel.setBounds(302, 336, 116, 29);
        FillupPanel.add(PhealthIDLabel);

        DaystextField = new JTextField();
        DaystextField.setFont(new Font("Tahoma", Font.BOLD, 13));
        DaystextField.setColumns(10);
        DaystextField.setBounds(423, 236, 120, 23);
        FillupPanel.add(DaystextField);

        TroomcomboBox = new JComboBox<>();
        TroomcomboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Private", "Ward", "Semi-private"}));
        TroomcomboBox.setBounds(423, 289, 116, 22);
        FillupPanel.add(TroomcomboBox);

        LaboratoryLabel = new JLabel("Laboratory:");
        LaboratoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        LaboratoryLabel.setBounds(302, 392, 104, 14);
        FillupPanel.add(LaboratoryLabel);

        LabcomboBox = new JComboBox<>();
        LabcomboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Yes", "No"}));
        LabcomboBox.setBounds(423, 391, 116, 22);
        FillupPanel.add(LabcomboBox);

        Male = new JRadioButton("Male");
        Male.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Male.setBounds(427, 136, 54, 23);
        Male.addActionListener(this);
        FillupPanel.add(Male);

        Female = new JRadioButton("Female");
        Female.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Female.setBounds(483, 136, 109, 23);
        Female.addActionListener(this);
        FillupPanel.add(Female);

        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(Male);
        sexGroup.add(Female);

        PhIdYes = new JRadioButton("Yes");
        PhIdYes.setFont(new Font("Tahoma", Font.PLAIN, 13));
        PhIdYes.setBounds(423, 339, 54, 23);
        PhIdYes.addActionListener(this);
        FillupPanel.add(PhIdYes);

        PhIdNo = new JRadioButton("No");
        PhIdNo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        PhIdNo.setBounds(483, 339, 54, 23);
        PhIdNo.addActionListener(this);
        FillupPanel.add(PhIdNo);

        ButtonGroup phidGroup = new ButtonGroup();
        phidGroup.add(PhIdYes);
        phidGroup.add(PhIdNo);

        SubmitButton = new JButton("Submit");
        SubmitButton.setFont(new Font("Tahoma", Font.BOLD, 14));
        SubmitButton.setBounds(226, 459, 139, 38);
        SubmitButton.addActionListener(this);
        FillupPanel.add(SubmitButton);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == SubmitButton) {
            Pname = PnametextField.getText();
            Paddress = PaddresstextField.getText();
            ChiefComplaint = CcomplainttextField.getText();
            Contact = CnumbertextField.getText();

            try {
                Accnum = Integer.parseInt(AccnumbertextField.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Account Number should be a 4-digit number.");
                return;
            }

            try {
                Days = Integer.parseInt(DaystextField.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Days Admitted should be a number.");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Pbirth = sdf.format(PbirthField.getDate());

            SelectedRoom = (String) TroomcomboBox.getSelectedItem();
            Selectedlab = (String) LabcomboBox.getSelectedItem();

            Psex = Male.isSelected() ? "Male" : Female.isSelected() ? "Female" : null;
            Pphidnum = PhIdYes.isSelected() ? "Yes" : PhIdNo.isSelected() ? "No" : null;

            if (Psex == null || Pphidnum == null) {
                JOptionPane.showMessageDialog(this, "Please fill out all fields.");
                return;
            }

            try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
                String sql = "INSERT INTO patient_records (PatientName, AccountNumber, ContactNumber, PatientAddress, ChiefComplaint, Sex, BirthDate, DaysAdmitted, RoomType, PhilHealthID, Laboratory) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    pst.setString(1, Pname);
                    pst.setInt(2, Accnum);
                    pst.setString(3, Contact);
                    pst.setString(4, Paddress);
                    pst.setString(5, ChiefComplaint);
                    pst.setString(6, Psex);
                    pst.setString(7, Pbirth);
                    pst.setInt(8, Days);
                    pst.setString(9, SelectedRoom);
                    pst.setString(10, Pphidnum);
                    pst.setString(11, Selectedlab);

                    int rs = pst.executeUpdate();
                    if (rs > 0) {
                        JOptionPane.showMessageDialog(this, "Patient Record Submitted");
                    } else {
                        JOptionPane.showMessageDialog(this, "Submission Failed");
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage());
            }
        }
    }
}
