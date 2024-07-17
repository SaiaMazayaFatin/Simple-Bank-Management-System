package BankManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

class BalanceEnquiry extends JFrame implements ActionListener {

    JButton backButton;
    JLabel backgroundImageLabel, balanceLabel;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;

        ImageIcon atmImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmImageIcon.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        backgroundImageLabel = new JLabel(scaledImageIcon);
        backgroundImageLabel.setBounds(0, 0, 960, 1080);
        add(backgroundImageLabel);

        balanceLabel = new JLabel();
        balanceLabel.setForeground(Color.WHITE);
        balanceLabel.setFont(new Font("System", Font.BOLD, 16));

        backButton = new JButton("BACK");

        setLayout(null);

        balanceLabel.setBounds(190, 350, 400, 35);
        backgroundImageLabel.add(balanceLabel);

        backButton.setBounds(390, 633, 150, 35);
        backgroundImageLabel.add(backButton);

        int balance = 0;

        try {
            Conn connection = new Conn();
            ResultSet resultSet = connection.s.executeQuery("select * from bank where pin = '" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("ammount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("ammount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        balanceLabel.setText("Your Current Account Balance is Rp " + balance);

        backButton.addActionListener(this);

        setSize(960, 1080);
        setUndecorated(true);
        setLocation(500, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
