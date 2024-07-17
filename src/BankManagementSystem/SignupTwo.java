package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener {

    JLabel pageLabel, religionLabel, incomeLabel, educationLabel, occupationLabel, npwpLabel, nikLabel, seniorCitizenLabel, existingAccountLabel, formNoLabel;
    JButton nextButton;
    JRadioButton seniorCitizenYes, seniorCitizenNo, existingAccountYes, existingAccountNo;
    JTextField npwpField, nikField;
    JComboBox<String> religionComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    String formno;

    SignupTwo(String formno) {

        ImageIcon logoIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image scaledImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(150, 0, 100, 100);
        add(logoLabel);

        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        pageLabel = new JLabel("Page 2: Additional Details");
        pageLabel.setFont(new Font("Raleway", Font.BOLD, 22));

        religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        educationLabel = new JLabel("Educational Qualification:");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        npwpLabel = new JLabel("NPWP Number:");
        npwpLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        nikLabel = new JLabel("NIK Number:");
        nikLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        seniorCitizenLabel = new JLabel("Senior Citizen:");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        formNoLabel = new JLabel("Form No:");
        formNoLabel.setFont(new Font("Raleway", Font.BOLD, 13));

        JLabel formNoValueLabel = new JLabel(formno);
        formNoValueLabel.setFont(new Font("Raleway", Font.BOLD, 13));

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);

        npwpField = new JTextField();
        npwpField.setFont(new Font("Raleway", Font.BOLD, 14));

        nikField = new JTextField();
        nikField.setFont(new Font("Raleway", Font.BOLD, 14));

        seniorCitizenYes = new JRadioButton("Yes");
        seniorCitizenYes.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorCitizenYes.setBackground(Color.WHITE);

        seniorCitizenNo = new JRadioButton("No");
        seniorCitizenNo.setFont(new Font("Raleway", Font.BOLD, 14));
        seniorCitizenNo.setBackground(Color.WHITE);

        existingAccountYes = new JRadioButton("Yes");
        existingAccountYes.setFont(new Font("Raleway", Font.BOLD, 14));
        existingAccountYes.setBackground(Color.WHITE);

        existingAccountNo = new JRadioButton("No");
        existingAccountNo.setFont(new Font("Raleway", Font.BOLD, 14));
        existingAccountNo.setBackground(Color.WHITE);

        String[] religionOptions = {"Muslim", "Christian", "Catholic", "Hindu", "Buddha", "Konghucu"};
        religionComboBox = new JComboBox<>(religionOptions);
        religionComboBox.setBackground(Color.WHITE);
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));

        String[] incomeOptions = {"Null", "<1.000.000", "<2.500.000", "<5.000.000", "<10,00,000", ">10.000.000"};
        incomeComboBox = new JComboBox<>(incomeOptions);
        incomeComboBox.setBackground(Color.WHITE);
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));

        String[] educationOptions = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        educationComboBox = new JComboBox<>(educationOptions);
        educationComboBox.setBackground(Color.WHITE);
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));

        String[] occupationOptions = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationComboBox = new JComboBox<>(occupationOptions);
        occupationComboBox.setBackground(Color.WHITE);
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(seniorCitizenYes);
        seniorCitizenGroup.add(seniorCitizenNo);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(existingAccountYes);
        existingAccountGroup.add(existingAccountNo);

        setLayout(null);

        formNoLabel.setBounds(700, 10, 60, 30);
        add(formNoLabel);

        formNoValueLabel.setBounds(760, 10, 60, 30);
        add(formNoValueLabel);

        pageLabel.setBounds(280, 30, 600, 40);
        add(pageLabel);

        religionLabel.setBounds(100, 120, 100, 30);
        add(religionLabel);

        religionComboBox.setBounds(350, 120, 320, 30);
        add(religionComboBox);

        incomeLabel.setBounds(100, 170, 100, 30);
        add(incomeLabel);

        incomeComboBox.setBounds(350, 170, 320, 30);
        add(incomeComboBox);

        educationLabel.setBounds(100, 220, 200, 30);
        add(educationLabel);

        educationComboBox.setBounds(350, 220, 320, 30);
        add(educationComboBox);

        occupationLabel.setBounds(100, 270, 150, 30);
        add(occupationLabel);

        occupationComboBox.setBounds(350, 270, 320, 30);
        add(occupationComboBox);

        npwpLabel.setBounds(100, 320, 150, 30);
        add(npwpLabel);

        npwpField.setBounds(350, 320, 320, 30);
        add(npwpField);

        nikLabel.setBounds(100, 370, 180, 30);
        add(nikLabel);

        nikField.setBounds(350, 370, 320, 30);
        add(nikField);

        seniorCitizenLabel.setBounds(100, 420, 150, 30);
        add(seniorCitizenLabel);

        seniorCitizenYes.setBounds(350, 420, 100, 30);
        add(seniorCitizenYes);

        seniorCitizenNo.setBounds(460, 420, 100, 30);
        add(seniorCitizenNo);

        existingAccountLabel.setBounds(100, 470, 180, 30);
        add(existingAccountLabel);

        existingAccountYes.setBounds(350, 470, 100, 30);
        add(existingAccountYes);

        existingAccountNo.setBounds(460, 470, 100, 30);
        add(existingAccountNo);

        nextButton.setBounds(570, 570, 100, 30);
        add(nextButton);

        nextButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 650);
        setLocation(500, 120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String education = (String) educationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();

        String npwp = npwpField.getText();
        String nik = nikField.getText();

        String seniorCitizen = seniorCitizenYes.isSelected() ? "Yes" : "No";
        String existingAccount = existingAccountYes.isSelected() ? "Yes" : "No";

        try {
            if (nikField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c1 = new Conn();
                String query = "insert into signup2 values('" + formno + "','" + religion + "','" + income + "','" + education + "','" + occupation + "','" + npwp + "','" + nik + "','" + seniorCitizen + "','" + existingAccount + "')";
                c1.s.executeUpdate(query);

                new SignupThree(formno).setVisible(true);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
}