package BankManagementSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {

    JLabel pageLabel, accountTypeLabel, cardNumberLabel, cardNumberValueLabel, cardNumberDescLabel, pinLabel,
            pinValueLabel, pinDescLabel, servicesLabel, formNoLabel, formNoValueLabel, cardDetailsDescLabel;
    JRadioButton savingAccountRadioButton, fixedDepositAccountRadioButton, currentAccountRadioButton,
            recurringDepositAccountRadioButton;
    JButton submitButton, cancelButton;
    JCheckBox atmCardCheckBox, internetBankingCheckBox, mobileBankingCheckBox, emailAlertsCheckBox, chequeBookCheckBox,
            eStatementCheckBox, declarationCheckBox;
    String formno;

    SignupThree(String formno) {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        ImageIcon logoIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image scaledImage = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(150, 0, 100, 100);
        add(logoLabel);

        pageLabel = new JLabel("Page 3: Account Details");
        pageLabel.setFont(new Font("Raleway", Font.BOLD, 22));

        accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        cardNumberLabel = new JLabel("Card Number:");
        cardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        cardNumberValueLabel = new JLabel("XXXX-XXXX-XXXX-4184");
        cardNumberValueLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        cardNumberDescLabel = new JLabel("(Your 16-digit Card number)");
        cardNumberDescLabel.setFont(new Font("Raleway", Font.BOLD, 12));

        cardDetailsDescLabel = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        cardDetailsDescLabel.setFont(new Font("Raleway", Font.BOLD, 12));

        pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        pinValueLabel = new JLabel("XXXX");
        pinValueLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        pinDescLabel = new JLabel("(4-digit password)");
        pinDescLabel.setFont(new Font("Raleway", Font.BOLD, 12));

        servicesLabel = new JLabel("Services Required:");
        servicesLabel.setFont(new Font("Raleway", Font.BOLD, 18));

        formNoLabel = new JLabel("Form No:");
        formNoLabel.setFont(new Font("Raleway", Font.BOLD, 14));

        formNoValueLabel = new JLabel(formno);
        formNoValueLabel.setFont(new Font("Raleway", Font.BOLD, 14));

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Raleway", Font.BOLD, 14));
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);

        cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Raleway", Font.BOLD, 14));
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);

        atmCardCheckBox = new JCheckBox("ATM CARD");
        atmCardCheckBox.setBackground(Color.WHITE);
        atmCardCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        internetBankingCheckBox = new JCheckBox("Internet Banking");
        internetBankingCheckBox.setBackground(Color.WHITE);
        internetBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        mobileBankingCheckBox = new JCheckBox("Mobile Banking");
        mobileBankingCheckBox.setBackground(Color.WHITE);
        mobileBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        emailAlertsCheckBox = new JCheckBox("EMAIL Alerts");
        emailAlertsCheckBox.setBackground(Color.WHITE);
        emailAlertsCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        chequeBookCheckBox = new JCheckBox("Cheque Book");
        chequeBookCheckBox.setBackground(Color.WHITE);
        chequeBookCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        eStatementCheckBox = new JCheckBox("E-Statement");
        eStatementCheckBox.setBackground(Color.WHITE);
        eStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));

        declarationCheckBox = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.", true);
        declarationCheckBox.setBackground(Color.WHITE);
        declarationCheckBox.setFont(new Font("Raleway", Font.BOLD, 12));

        savingAccountRadioButton = new JRadioButton("Saving Account");
        savingAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        savingAccountRadioButton.setBackground(Color.WHITE);

        fixedDepositAccountRadioButton = new JRadioButton("Fixed Deposit Account");
        fixedDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDepositAccountRadioButton.setBackground(Color.WHITE);

        currentAccountRadioButton = new JRadioButton("Current Account");
        currentAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        currentAccountRadioButton.setBackground(Color.WHITE);

        recurringDepositAccountRadioButton = new JRadioButton("Recurring Deposit Account");
        recurringDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringDepositAccountRadioButton.setBackground(Color.WHITE);

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingAccountRadioButton);
        accountTypeGroup.add(fixedDepositAccountRadioButton);
        accountTypeGroup.add(currentAccountRadioButton);
        accountTypeGroup.add(recurringDepositAccountRadioButton);

        setLayout(null);

        formNoLabel.setBounds(700, 10, 70, 30);
        add(formNoLabel);

        formNoValueLabel.setBounds(770, 10, 40, 30);
        add(formNoValueLabel);

        pageLabel.setBounds(280, 40, 400, 40);
        add(pageLabel);

        accountTypeLabel.setBounds(100, 140, 200, 30);
        add(accountTypeLabel);

        savingAccountRadioButton.setBounds(100, 180, 150, 30);
        add(savingAccountRadioButton);

        fixedDepositAccountRadioButton.setBounds(350, 180, 300, 30);
        add(fixedDepositAccountRadioButton);

        currentAccountRadioButton.setBounds(100, 220, 250, 30);
        add(currentAccountRadioButton);

        recurringDepositAccountRadioButton.setBounds(350, 220, 250, 30);
        add(recurringDepositAccountRadioButton);

        cardNumberLabel.setBounds(100, 300, 200, 30);
        add(cardNumberLabel);

        cardNumberValueLabel.setBounds(330, 300, 250, 30);
        add(cardNumberValueLabel);

        cardNumberDescLabel.setBounds(100, 330, 500, 20);
        add(cardNumberDescLabel);

        cardDetailsDescLabel.setBounds(100, 350, 500, 20);
        add(cardDetailsDescLabel);

        pinLabel.setBounds(100, 370, 200, 30);
        add(pinLabel);

        pinValueLabel.setBounds(330, 370, 200, 30);
        add(pinValueLabel);

        pinDescLabel.setBounds(100, 400, 200, 20);
        add(pinDescLabel);

        servicesLabel.setBounds(100, 450, 200, 30);
        add(servicesLabel);

        atmCardCheckBox.setBounds(100, 500, 200, 30);
        add(atmCardCheckBox);

        internetBankingCheckBox.setBounds(350, 500, 200, 30);
        add(internetBankingCheckBox);

        mobileBankingCheckBox.setBounds(100, 550, 200, 30);
        add(mobileBankingCheckBox);

        emailAlertsCheckBox.setBounds(350, 550, 200, 30);
        add(emailAlertsCheckBox);

        chequeBookCheckBox.setBounds(100, 600, 200, 30);
        add(chequeBookCheckBox);

        eStatementCheckBox.setBounds(350, 600, 200, 30);
        add(eStatementCheckBox);

        declarationCheckBox.setBounds(100, 680, 600, 20);
        add(declarationCheckBox);

        submitButton.setBounds(250, 720, 100, 30);
        add(submitButton);

        cancelButton.setBounds(420, 720, 100, 30);
        add(cancelButton);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 850);
        setLocation(500, 120);
        setVisible(true);

        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String accountType = null;
        if (savingAccountRadioButton.isSelected()) {
            accountType = "Saving Account";
        } else if (fixedDepositAccountRadioButton.isSelected()) {
            accountType = "Fixed Deposit Account";
        } else if (currentAccountRadioButton.isSelected()) {
            accountType = "Current Account";
        } else if (recurringDepositAccountRadioButton.isSelected()) {
            accountType = "Recurring Deposit Account";
        }

        Random rand = new Random();
        long first7 = (rand.nextLong() % 90000000L) + 5040936000000000L;
        String cardNumber = "" + Math.abs(first7);

        long first3 = (rand.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String services = "";
        if (atmCardCheckBox.isSelected()) {
            services += " ATM Card";
        }
        if (internetBankingCheckBox.isSelected()) {
            services += " Internet Banking";
        }
        if (mobileBankingCheckBox.isSelected()) {
            services += " Mobile Banking";
        }
        if (emailAlertsCheckBox.isSelected()) {
            services += " EMAIL Alerts";
        }
        if (chequeBookCheckBox.isSelected()) {
            services += " Cheque Book";
        }
        if (eStatementCheckBox.isSelected()) {
            services += " E-Statement";
        }

        try {
            if (ae.getSource() == submitButton) {

                if (accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signup3 values('" + formno + "','" + accountType + "','" + cardNumber
                            + "','" + pin + "','" + services + "')";
                    String query2 = "insert into login values('" + formno + "','" + cardNumber + "','" + pin + "')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n Pin:" + pin);

                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == cancelButton) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignupThree("").setVisible(true);
    }

}
