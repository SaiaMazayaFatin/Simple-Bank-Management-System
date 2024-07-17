package BankManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/db_bank";
            String user = "postgres";
            String password = "makanbang086";

            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
