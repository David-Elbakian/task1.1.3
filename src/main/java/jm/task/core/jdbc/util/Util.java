package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "postgres";
    public static final String PASSWORD = "1";



    public static Connection getConnection() {
        Connection connection = null;

        try {

            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Connected success");
            } else {
                System.out.println("Connection failed");
            }
        } catch (SQLException  | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
