package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {

    JLabel transactionLabel;
    JButton depositButton, balanceEnquiryButton, withdrawButton, pinChangeButton, exitButton;
    String pin;

    Transactions(String pin) {
        this.pin = pin;

        ImageIcon atmIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmIcon.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel backgroundImageLabel = new JLabel(scaledIcon);
        backgroundImageLabel.setBounds(0, 0, 960, 1080);
        add(backgroundImageLabel);

        transactionLabel = new JLabel("Please Select Your Transaction");
        transactionLabel.setForeground(Color.WHITE);
        transactionLabel.setFont(new Font("System", Font.BOLD, 16));

        depositButton = new JButton("DEPOSIT");
        withdrawButton = new JButton("CASH WITHDRAWAL");
        pinChangeButton = new JButton("PIN CHANGE");
        balanceEnquiryButton = new JButton("BALANCE ENQUIRY");
        exitButton = new JButton("EXIT");

        setLayout(null);

        transactionLabel.setBounds(235, 400, 700, 35);
        backgroundImageLabel.add(transactionLabel);

        depositButton.setBounds(170, 499, 150, 35);
        backgroundImageLabel.add(depositButton);

        withdrawButton.setBounds(390, 499, 150, 35);
        backgroundImageLabel.add(withdrawButton);

        pinChangeButton.setBounds(170, 543, 150, 35);
        backgroundImageLabel.add(pinChangeButton);

        balanceEnquiryButton.setBounds(390, 543, 150, 35);
        backgroundImageLabel.add(balanceEnquiryButton);

        exitButton.setBounds(390, 588, 150, 35);
        backgroundImageLabel.add(exitButton);

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        pinChangeButton.addActionListener(this);
        balanceEnquiryButton.addActionListener(this);
        exitButton.addActionListener(this);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == depositButton) {
            setVisible(false);
            new Deposit(pin).setVisible(true);
        } else if (ae.getSource() == withdrawButton) {
            setVisible(false);
            new Withdrawal(pin).setVisible(true);
        } else if (ae.getSource() == pinChangeButton) {
            setVisible(false);
            new Pin(pin).setVisible(true);
        } else if (ae.getSource() == balanceEnquiryButton) {
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        } else if (ae.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transactions("").setVisible(true);
    }
}
