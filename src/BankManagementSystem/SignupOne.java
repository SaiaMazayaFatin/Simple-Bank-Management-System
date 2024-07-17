package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class SignupOne extends JFrame implements ActionListener{

    JLabel applicationFormNoLabel, pageLabel, nameLabel, fnameLabel, dobLabel, genderLabel, emailLabel, maritalStatusLabel, addressLabel, cityLabel, pinCodeLabel, stateLabel, dateLabel, monthLabel, yearLabel;
    JTextField nameField, fnameField, emailField, addressField, cityField, pinCodeField, stateField;
    JRadioButton maleRadioButton, femaleRadioButton, marriedRadioButton, unmarriedRadioButton, otherRadioButton;
    JButton nextButton;
    JDateChooser dateChooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    SignupOne(){

        setTitle("NEW ACCOUNT APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel logoLabel = new JLabel(i3);
        logoLabel.setBounds(20, 0, 100, 100);
        add(logoLabel);

        applicationFormNoLabel = new JLabel("APPLICATION FORM NO. "+first);
        applicationFormNoLabel.setFont(new Font("Raleway", Font.BOLD, 38));

        pageLabel = new JLabel("Page 1: Personal Details");
        pageLabel.setFont(new Font("Raleway", Font.BOLD, 22));

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        fnameLabel = new JLabel("Father's Name:");
        fnameLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        dobLabel = new JLabel("Date of Birth:");
        dobLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        emailLabel = new JLabel("Email Address:");
        emailLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        maritalStatusLabel = new JLabel("Marital Status:");
        maritalStatusLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        cityLabel = new JLabel("City:");
        cityLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        pinCodeLabel = new JLabel("Pin Code:");
        pinCodeLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        stateLabel = new JLabel("State:");
        stateLabel.setFont(new Font("Raleway", Font.BOLD, 20));

        dateLabel = new JLabel("Date");
        dateLabel.setFont(new Font("Raleway", Font.BOLD, 14));

        monthLabel = new JLabel("Month");
        monthLabel.setFont(new Font("Raleway", Font.BOLD, 14));

        yearLabel = new JLabel("Year");
        yearLabel.setFont(new Font("Raleway", Font.BOLD, 14));

        nameField = new JTextField();
        nameField.setFont(new Font("Raleway", Font.BOLD, 14));

        fnameField = new JTextField();
        fnameField.setFont(new Font("Raleway", Font.BOLD, 14));

        emailField = new JTextField();
        emailField.setFont(new Font("Raleway", Font.BOLD, 14));

        addressField = new JTextField();
        addressField.setFont(new Font("Raleway", Font.BOLD, 14));

        cityField = new JTextField();
        cityField.setFont(new Font("Raleway", Font.BOLD, 14));

        pinCodeField = new JTextField();
        pinCodeField.setFont(new Font("Raleway", Font.BOLD, 14));

        stateField = new JTextField();
        stateField.setFont(new Font("Raleway", Font.BOLD, 14));

        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        maleRadioButton.setBackground(Color.WHITE);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        femaleRadioButton.setBackground(Color.WHITE);

        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(maleRadioButton);
        groupGender.add(femaleRadioButton);

        marriedRadioButton = new JRadioButton("Married");
        marriedRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        marriedRadioButton.setBackground(Color.WHITE);

        unmarriedRadioButton = new JRadioButton("Unmarried");
        unmarriedRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        unmarriedRadioButton.setBackground(Color.WHITE);

        otherRadioButton = new JRadioButton("Other");
        otherRadioButton.setFont(new Font("Raleway", Font.BOLD, 14));
        otherRadioButton.setBackground(Color.WHITE);

        ButtonGroup groupStatus = new ButtonGroup();
        groupStatus.add(marriedRadioButton);
        groupStatus.add(unmarriedRadioButton);
        groupStatus.add(otherRadioButton);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);
        applicationFormNoLabel.setBounds(140,20,600,40);
        add(applicationFormNoLabel);

        pageLabel.setBounds(290,80,600,30);
        add(pageLabel);

        nameLabel.setBounds(100,140,100,30);
        add(nameLabel);

        nameField.setBounds(300,140,400,30);
        add(nameField);

        fnameLabel.setBounds(100,190,200,30);
        add(fnameLabel);

        fnameField.setBounds(300,190,400,30);
        add(fnameField);

        dobLabel.setBounds(100,240,200,30);
        add(dobLabel);

        dateChooser.setBounds(300, 240, 400, 30);

        genderLabel.setBounds(100,290,200,30);
        add(genderLabel);

        maleRadioButton.setBounds(300,290,60,30);
        add(maleRadioButton);

        femaleRadioButton.setBounds(450,290,90,30);
        add(femaleRadioButton);

        emailLabel.setBounds(100,340,200,30);
        add(emailLabel);

        emailField.setBounds(300,340,400,30);
        add(emailField);

        maritalStatusLabel.setBounds(100,390,200,30);
        add(maritalStatusLabel);

        marriedRadioButton.setBounds(300,390,100,30);
        add(marriedRadioButton);

        unmarriedRadioButton.setBounds(450,390,100,30);
        add(unmarriedRadioButton);

        otherRadioButton.setBounds(635,390,100,30);
        add(otherRadioButton);

        addressLabel.setBounds(100,440,200,30);
        add(addressLabel);

        addressField.setBounds(300,440,400,30);
        add(addressField);

        cityLabel.setBounds(100,490,200,30);
        add(cityLabel);

        cityField.setBounds(300,490,400,30);
        add(cityField);

        pinCodeLabel.setBounds(100,540,200,30);
        add(pinCodeLabel);

        pinCodeField.setBounds(300,540,400,30);
        add(pinCodeField);

        stateLabel.setBounds(100,590,200,30);
        add(stateLabel);

        stateField.setBounds(300,590,400,30);
        add(stateField);

        nextButton.setBounds(620,660,80,30);
        add(nextButton);

        nextButton.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String formno = first;
        String name = nameField.getText();
        String fname = fnameField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(maleRadioButton.isSelected()){
            gender = "Male";
        }else if(femaleRadioButton.isSelected()){
            gender = "Female";
        }

        String email = emailField.getText();
        String marital = null;
        if(marriedRadioButton.isSelected()){
            marital = "Married";
        }else if(unmarriedRadioButton.isSelected()){
            marital = "Unmarried";
        }else if(otherRadioButton.isSelected()){
            marital = "Other";
        }

        String address = addressField.getText();
        String city = cityField.getText();
        String pincode = pinCodeField.getText();
        String state = stateField.getText();

        try{

            if(pinCodeField.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);

                new SignupTwo(first).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new SignupOne().setVisible(true);
    }
}
