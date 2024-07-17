package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pin extends JFrame implements ActionListener {

    JPasswordField newPasswordField, reEnterPasswordField;
    JButton changeButton, backButton;
    JLabel changePinLabel, newPinLabel, reEnterPinLabel, backgroundLabel;
    String currentPin;

    Pin(String currentPin) {
        this.currentPin = currentPin;

        ImageIcon atmImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmImageIcon.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        backgroundLabel = new JLabel(scaledImageIcon);
        backgroundLabel.setBounds(0, 0, 960, 1080);
        add(backgroundLabel);

        changePinLabel = new JLabel("CHANGE YOUR PIN");
        changePinLabel.setFont(new Font("System", Font.BOLD, 16));
        changePinLabel.setForeground(Color.WHITE);

        newPinLabel = new JLabel("New PIN:");
        newPinLabel.setFont(new Font("System", Font.BOLD, 16));
        newPinLabel.setForeground(Color.WHITE);

        reEnterPinLabel = new JLabel("Re-Enter New PIN:");
        reEnterPinLabel.setFont(new Font("System", Font.BOLD, 16));
        reEnterPinLabel.setForeground(Color.WHITE);

        newPasswordField = new JPasswordField();
        newPasswordField.setFont(new Font("Raleway", Font.BOLD, 25));

        reEnterPasswordField = new JPasswordField();
        reEnterPasswordField.setFont(new Font("Raleway", Font.BOLD, 25));

        changeButton = new JButton("CHANGE");
        backButton = new JButton("BACK");

        changeButton.addActionListener(this);
        backButton.addActionListener(this);

        setLayout(null);

        changePinLabel.setBounds(280, 330, 800, 35);
        backgroundLabel.add(changePinLabel);

        newPinLabel.setBounds(180, 390, 150, 35);
        backgroundLabel.add(newPinLabel);

        reEnterPinLabel.setBounds(180, 440, 200, 35);
        backgroundLabel.add(reEnterPinLabel);

        newPasswordField.setBounds(350, 390, 180, 25);
        backgroundLabel.add(newPasswordField);

        reEnterPasswordField.setBounds(350, 440, 180, 25);
        backgroundLabel.add(reEnterPasswordField);

        changeButton.setBounds(390, 588, 150, 35);
        backgroundLabel.add(changeButton);

        backButton.setBounds(390, 633, 150, 35);
        backgroundLabel.add(backButton);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String newPin = new String(newPasswordField.getPassword());
            String reEnteredPin = new String(reEnterPasswordField.getPassword());

            if (!newPin.equals(reEnteredPin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }

            if (ae.getSource() == changeButton) {
                // Check if new PIN fields are empty
                if (newPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }
                if (reEnteredPin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                    return;
                }

                // Update PIN in database
                Conn connection = new Conn();
                String updateBankQuery = "update bank set pin = '" + reEnteredPin + "' where pin = '" + currentPin + "'";
                String updateLoginQuery = "update login set pin = '" + reEnteredPin + "' where pin = '" + currentPin + "'";
                String updateSignup3Query = "update signup3 set pin = '" + reEnteredPin + "' where pin = '" + currentPin + "'";

                connection.s.executeUpdate(updateBankQuery);
                connection.s.executeUpdate(updateLoginQuery);
                connection.s.executeUpdate(updateSignup3Query);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(reEnteredPin).setVisible(true);

            } else if (ae.getSource() == backButton) {
                setVisible(false);
                new Transactions(currentPin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Pin("").setVisible(true);
    }
}

