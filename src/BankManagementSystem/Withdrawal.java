package BankManagementSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.sql.*;

public class Withdrawal extends JFrame implements ActionListener {

    JTextField amountTextField;
    JButton withdrawButton, backButton;
    JLabel maxWithdrawalLabel, enterAmountLabel, backgroundLabel;
    String pin;

    Withdrawal(String pin) {
        this.pin = pin;

        ImageIcon atmImageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image scaledImage = atmImageIcon.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        backgroundLabel = new JLabel(scaledImageIcon);
        backgroundLabel.setBounds(0, 0, 960, 1080);
        add(backgroundLabel);

        maxWithdrawalLabel = new JLabel("MAXIMUM WITHDRAWAL IS Rp.10,000,000");
        maxWithdrawalLabel.setForeground(Color.WHITE);
        maxWithdrawalLabel.setFont(new Font("System", Font.BOLD, 16));

        enterAmountLabel = new JLabel("PLEASE ENTER YOUR AMOUNT");
        enterAmountLabel.setForeground(Color.WHITE);
        enterAmountLabel.setFont(new Font("System", Font.BOLD, 16));

        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 25));

        withdrawButton = new JButton("WITHDRAW");
        backButton = new JButton("BACK");

        withdrawButton.addActionListener(this);
        backButton.addActionListener(this);

        setLayout(null);

        maxWithdrawalLabel.setBounds(190, 350, 400, 20);
        backgroundLabel.add(maxWithdrawalLabel);

        enterAmountLabel.setBounds(190, 400, 400, 20);
        backgroundLabel.add(enterAmountLabel);

        amountTextField.setBounds(190, 450, 330, 30);
        backgroundLabel.add(amountTextField);

        withdrawButton.setBounds(390, 588, 150, 35);
        backgroundLabel.add(withdrawButton);

        backButton.setBounds(390, 633, 150, 35);
        backgroundLabel.add(backButton);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = amountTextField.getText();
            Date date = new Date();

            if (ae.getSource() == withdrawButton) {
                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
                } else {
                    Conn connection = new Conn();

                    ResultSet rs = connection.s.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("ammount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("ammount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    connection.s.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawal', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rp. " + amount + " Debited Successfully");

                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            } else if (ae.getSource() == backButton) {
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }

    public static void main(String[] args) {
        new Withdrawal("").setVisible(true);
    }
}

