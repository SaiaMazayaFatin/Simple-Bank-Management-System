package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {

    JTextField amountField;
    JButton depositButton, backButton;
    JLabel titleLabel, backgroundImageLabel;
    String pin;

    Deposit(String pin) {
        this.pin = pin;

        ImageIcon atmIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmIcon.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        backgroundImageLabel = new JLabel(scaledIcon);
        backgroundImageLabel.setBounds(0, 0, 960, 1080);
        add(backgroundImageLabel);

        titleLabel = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("System", Font.BOLD, 16));

        amountField = new JTextField();
        amountField.setFont(new Font("Raleway", Font.BOLD, 22));

        depositButton = new JButton("DEPOSIT");
        backButton = new JButton("BACK");

        setLayout(null);

        titleLabel.setBounds(190, 350, 400, 35);
        backgroundImageLabel.add(titleLabel);

        amountField.setBounds(190, 420, 320, 25);
        backgroundImageLabel.add(amountField);

        depositButton.setBounds(390, 588, 150, 35);
        backgroundImageLabel.add(depositButton);

        backButton.setBounds(390, 633, 150, 35);
        backgroundImageLabel.add(backButton);

        depositButton.addActionListener(this);
        backButton.addActionListener(this);

        setSize(960, 1080);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = amountField.getText();
            Date date = new Date();
            if (ae.getSource() == depositButton) {
                if (amountField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                } else {
                    Conn connection = new Conn();
                    connection.s.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rp. " + amount + " Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            } else if (ae.getSource() == backButton) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("").setVisible(true);
    }
}
