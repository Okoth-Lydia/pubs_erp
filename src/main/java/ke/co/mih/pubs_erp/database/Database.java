package ke.co.mih.pubs_erp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TODO: Replace implementation to open connection to a MySQL Database
public class Database {
    private static final String DATABASE= "pubs_erp.db";

    public static Connection openConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:"+DATABASE);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            return null;
        }
    }
}